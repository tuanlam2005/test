package com.studio.climatechange;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Configuration

public class JDBCConnection {

    @Value("${spring.datasource.url}")
    private String jdbcUrl;

    @Value("${spring.datasource.username}")
    private String username;

    @Value("${spring.datasource.password}")
    private String password;

    @Bean
    public Connection getConnection() throws SQLException {
        Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
        System.out.println("Connected to the database.");
        return connection;
    }



}
