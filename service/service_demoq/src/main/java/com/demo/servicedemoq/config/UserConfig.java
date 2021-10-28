package com.demo.servicedemoq.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.demo.servicedemoq.mapper")
public class UserConfig {
}
