package com.cxy.test.generator.config.druid;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * @Author Cxy
 * @Description: 2019-04-16
 */
@Configuration
public class Config_Druid_DataSource {

    @Bean
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource clusterDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        return dataSource;
    }

}
