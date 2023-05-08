package com.adt.config;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.adt.listener.JobMonitoringListener;
import com.adt.processor.BookItemProcessor;
import com.adt.reader.BookItemReader;
import com.adt.writer.BookItemWriter;

@Configuration
@EnableBatchProcessing
public class BatchConfig {
	@Autowired
	private JobBuilderFactory jbFactory;
	@Autowired
	private StepBuilderFactory sbFactory;
//	@Autowired
//	private BookItemReader reader;
//	@Autowired
//	private BookItemWriter writer;
//	@Autowired
//	private BookItemProcessor processor;
//	@Autowired
//	private JobMonitoringListener listener;
	
	@Bean
	public ItemReader<String> createReader(){
		return new BookItemReader();
		
	}
	@Bean
	public ItemWriter<String> createWriter(){
		return new BookItemWriter();
	}
	@Bean
	public ItemProcessor<String, String> createProcessor(){
		return new BookItemProcessor();
	}
	@Bean
	public JobExecutionListener createListener() {
		return new JobMonitoringListener();
	}
	//Step Creation
	@Bean(name = "step1")
	public Step createStep1() {
		return sbFactory.get("step1")
				.<String,String>chunk(2)
				.reader(createReader())
				.writer(createWriter())
				.processor(createProcessor())
				.build();
	}
	@Bean(name = "job1")
	public Job createJob() {
		return jbFactory.get("job1")
				.incrementer(new RunIdIncrementer())
				.listener(createListener())
				.start(createStep1())
				.build();
	}
}
