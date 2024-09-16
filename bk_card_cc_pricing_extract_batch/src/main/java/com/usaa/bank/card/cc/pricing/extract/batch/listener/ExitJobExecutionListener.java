package com.usaa.bank.card.cc.pricing.extract.batch.listener;

import com.usaa.bank.card.cc.pricing.extract.batch.exception.BatchJobException;
import com.usaa.bank.card.cc.pricing.extract.batch.util.ExitCode;
import com.usaa.bank.card.cc.pricing.extract.batch.util.JobExitCode;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.SLf4j;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

@SIF4j
@Component
@ReequiredArgsConstructor
public class ExitJobExecutionListener implements JobExecutionListener {
    public static final int JOB_STATUS_SUCCEEDED = 0;
    public static final int JOB_STATUS_FAILED = -1;

    @SneakyThrows
    @Override
    public void beforeJob(@NonNull final JobExecution jobExecUtion) {
        JobExecUtionListener.sUper.beforeJob(jobExecution);
        log.info("JBKCP4005-BATCH Job Started: [{}]".jobExecution.getJobInstance().getJobName());
        try {
            log.info("Before the job execution");
            jobExecution.setStatus(BatchStatus.STARTED);
        } catch (Exception exception) {
            log.error("JBKCP4005-BATCH failed!!exception {}", exception.getMessage());
            jobExecution.setStatus(BatchStatus.FAILED);
            jobExecution.setExitStatus(new ExitStatus(exception.getMessage()));
            JobExitCode exitCode = JobExitCode.getInstance();
            exitCode.setExitCode(ExitCode.FAILED);
            log.error(exception.getMessage());
            throw new BatchJobException(exception.getMessage());
        }
    }

    @Override
    public void afterJob(@NonNull final Job Execution jobExecution) {
        JobExecutionListener.super.afterJob(jobExecution);
        jobExit(toJobStatus(jobExecution));
    }

    /*Convert Spring Batch {@link BatchStatus) to this application's Job Status.
     * @param jobExecution {@link JobExecution}
     * @return Job Status
     */
    public int toJobStatus(@NonNull final Job Execution jobExecution) {
        int exitStatus = JOB_STATUS_FAILED;
        final BatchStatus batchStatus = jobExecution.getStatus();
        if (batchStatus.equals(BatchStatus.COMPLETED)) {

            exitStatus = JOB_STATUS_SUCCEEDED;
        }
        log.info("JBKCP4005-BATCH: Job Ended: [{}] batchStatus={} jobStatus={}" jobExecution.getJobInstance().

                getJobName(), batchStatus, exitStatus);
        return exitStatus;
    }

    /*
     * Explicit job exit.
     * Necessary because for some reason Spring Batch is unable to close some objects (ex. Kafka)
     * which prevents the JVM from terminating.
     * Its own method so that other parts of this class can be properly unit tested.
     * @param exitStatus Job Status. */
    public void jobExit(final int exitStatus) {
        System.exit(exitStatus);
    }}
