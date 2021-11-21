package org.nice.heima.config;


import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;


@Configuration
@ComponentScan("com.tds.heima")
@PropertySource(value = "classpath:jdbc.properties",encoding = "UTF-8")
public class IOCConfig {

    @Value("${jdbc.userName}")
    private String userName;

    @Value("${jdbc.password}")
    private String password;

    @Value("${jdbc.url}")
    private String url;

    @Value("${jdbc.driverClass}")
    private String driverClassName;

    @Bean("dataSource")
    public DataSource dataSource(){
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setUsername(userName);
        ds.setPassword(password);
        ds.setUrl(url);
        ds.setDriverClassName(driverClassName);
        return ds;
    }

    @Bean("druidDataSource")
    public DataSource druidDataSource(){
        DruidDataSource ds = new DruidDataSource();
        ds.setUsername(userName);
        ds.setPassword(password);
        ds.setUrl(url);
        ds.setDriverClassName(driverClassName);
        return ds;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(@Qualifier("druidDataSource")DataSource dataSource){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;
    }


}
