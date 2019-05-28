package com.cxy.test.generator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@MapperScan("com.cxy.test.generator.mapper")
public class GeneratorApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(GeneratorApplication.class,args);
    }
}
