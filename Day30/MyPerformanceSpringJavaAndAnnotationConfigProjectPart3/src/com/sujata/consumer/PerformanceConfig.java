package com.sujata.consumer;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = "com.sujata.producer")
public class PerformanceConfig {


}
