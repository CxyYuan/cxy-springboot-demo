package com.cxy.test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.cxy.test.mapper")
public class MybatisApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(MybatisApplication.class,args);
    }
}
