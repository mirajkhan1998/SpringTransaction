package com.annotx.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@Import(PersistenceConfig.class)
@ComponentScan(basePackages = { "com.annotx.service,com.annotx.controller" })
@EnableTransactionManagement
public class RootJavaConfig {

}
