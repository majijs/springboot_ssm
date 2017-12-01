package com.boot.ssm.config;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * 启动后执行某些动作
 */
@Component
public class MyRunner implements CommandLineRunner {
    private final Logger logger = LoggerFactory.getLogger(MyRunner.class);

    @Override
    public void run(String... strings) throws Exception {
        logger.info("*****************第一滴血***************");
    }
}
