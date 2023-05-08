package com.adt.listener;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.stereotype.Component;
@Component("jobListener")
public class JobMonitoringListener implements JobExecutionListener {

	@Override
	public void beforeJob(JobExecution jobExecution) {
		System.out.println("Job Status    :: "+jobExecution.getStatus());
		System.out.println("Job StartTime :: "+jobExecution.getStartTime());
		
	}

	@Override
	public void afterJob(JobExecution jobExecution) {
	
		System.out.println("Job Status    :: "+jobExecution.getStatus());
		System.out.println("Job EndTime   :: "+jobExecution.getEndTime());
	}

}
