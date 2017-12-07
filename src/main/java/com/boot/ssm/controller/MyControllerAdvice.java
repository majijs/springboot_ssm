package com.boot.ssm.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class MyControllerAdvice {
    private Logger logger = LoggerFactory.getLogger(MyControllerAdvice.class);

    /**
     * 捕捉全局异常
     * @param e
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Map<String,String> errorHandler(Exception e) {
        logger.error(e.getMessage());
        Map<String,String> map = new HashMap<>();
        map.put("code", "500");
        map.put("msg", e.getMessage());
        return map;
    }

}
