package com.chenxw.echarts;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("com.chenxw.echarts.mapper")
@SpringBootApplication
public class OnlinePhoneApplication {

    public static void main(String[] args) {

        SpringApplication.run(OnlinePhoneApplication.class, args);

    }

}
