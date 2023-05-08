package com.adt.config;

import javax.sql.DataSource;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.database.builder.JdbcBatchItemWriterBuilder;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.batch.item.file.transform.LineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import com.adt.listener.JobMonitoringListener;
import com.adt.model.Employee;
import com.adt.processor.EmployeeItemProcessor;

@Configuration
@EnableBatchProcessing
public class BatchConfig {
	@Autowired
	private JobBuilderFactory jbFactory;
	@Autowired
	private StepBuilderFactory sbFactory;
	@Autowired
	private JobMonitoringListener listener;
	@Autowired
	private EmployeeItemProcessor processor;
	@Autowired
	private DataSource ds;
	/*
	/*@Bean
	public  JdbcCursorItemReader<Employee> createReader(){
		 //create  Reader class obj
		JdbcCursorItemReader<ExamResult> reader=new JdbcCursorItemReader<ExamResult>();
		 //set  DataSource
		reader.setDataSource(ds);
		//  specify SQL Query to get the records
		reader.setSql("SELECT ID,DOB,SEMESTER,PERCENTAGE  FROM EXAM_RESULT");
		//  specify RowMapper  to convert each record of RS to Model class obj
		reader.setRowMapper((rs,rowNum)->{
			 return  new ExamResult(rs.getInt(1),
					                                 rs.getDate(2),
					                                 rs.getInt(3),
					                                 rs.getDouble(4));
			   });
		   return reader;
	 }
	/*
	@Bean
	public FlatFileItemReader<Employee> createReader(){
		//Create the obj of FlatFileReader
		FlatFileItemReader<Employee> reader=new FlatFileItemReader<Employee>();
		//Set csv source file location
		reader.setResource(new ClassPathResource("EmployeesInfo.csv"));
		// Set LineMapper

		reader.setLineMapper(new DefaultLineMapper<Employee>(){{
			//set LineTokenizer
			setLineTokenizer(new DelimitedLineTokenizer(){{
				setDelimiter(",");
				setNames("empno","empname","eaddrs","salary");
			}});
			setFieldSetMapper(new BeanWrapperFieldSetMapper<>() {{
				setTargetType(Employee.class);
			}});
		}});
		return reader;
	}*/
	@Bean(name="reader")
	public FlatFileItemReader<Employee> createReader(){
		return new FlatFileItemReaderBuilder<Employee>()
				.name("file-reader")
				.resource(new ClassPathResource("EmployeesInfo.csv"))
				.delimited().delimiter(",")
				.names("empno","empname","empaddrs","salary")
				.targetType(Employee.class)
				.build();
	}
	
	/*
	 *Writer(Version 1)
	@Bean(name="writer")
	public JdbcBatchItemWriter<Employee> createWriter() {
		//Create JdbcBatchItemWriter obj
		JdbcBatchItemWriter<Employee> writer=new JdbcBatchItemWriter<>();
		//Set DataSource
		writer.setDataSource(ds);
		//Set Sql Query
		writer.setSql("INSERT INTO BATCH_EMPLOYEE VALUES(:empno,:empname,:salary,:empaddrs,:grossSalary,:netSalary)");
		//Specify the Source provider (the names of named params in sql Query must match with model class props names)
		writer.setItemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<Employee>());
		return writer;
	}*/

	@Bean(name="writer")
	public JdbcBatchItemWriter<Employee> createWriter() {
		return new JdbcBatchItemWriterBuilder<Employee>()
					.dataSource(ds)
					.sql("INSERT INTO BATCH_EMPLOYEE VALUES(:empno,:empname,:salary,:empaddrs,:grossSalary,:netSalary)")
					      	
					.beanMapped()
					.build();
	}

	//Step Preparation
	@Bean(name="step1")
	public Step creatStep1() {
		return sbFactory.get("step1")
				.<Employee,Employee>chunk(3)
				.reader(createReader())
				.writer(createWriter())
				.processor(processor)
				.build();
	}
	
	@Bean(name="job1")
	public Job createJob1() {
		return jbFactory.get("job1")
				.listener(listener)
				.incrementer(new RunIdIncrementer())
				.start(creatStep1())
				.build();
	}
}
