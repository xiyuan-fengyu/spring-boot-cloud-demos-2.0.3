package com.xiyuan.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.xiyuan")
@EnableHystrixDashboard
@EnableAutoConfiguration
public class HystrixDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboardApplication.class, args);
    }

}
