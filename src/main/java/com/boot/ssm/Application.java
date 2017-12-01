package com.boot.ssm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.boot.ssm.dao") //扫描Mapper接口
@ServletComponentScan //扫描web组件filter等
@EnableScheduling //开启定时
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }



}
