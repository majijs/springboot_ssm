package com.boot.ssm.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SchedulerTask {
    private final Logger logger = LoggerFactory.getLogger(SchedulerTask.class);

    @Scheduled(cron = "0/30 * * * * ? ")
    public void schedulerByCron(){
        logger.info("=============scheduler task===========");
    }
}
