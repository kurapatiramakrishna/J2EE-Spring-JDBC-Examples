package com.jsp1.springJdbc.Config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = {"com.jsp1.springJdbc", "com.jsp1.Model"})
public class EmployeeConfiguratin 
{

    @Bean
    public JdbcTemplate makeConnection() 
    {
        return new JdbcTemplate(getConnection());
    }

    // Remove the 'private' modifier from this method
    @Bean
    DataSource getConnection() {
        DriverManagerDataSource datasource = new DriverManagerDataSource();
        datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        datasource.setUrl("jdbc:mysql://localhost:3306/ramakrishna?");
        datasource.setUsername("root");
        datasource.setPassword("12345");
        return datasource;
    }
}