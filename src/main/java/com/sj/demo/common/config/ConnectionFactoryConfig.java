package com.sj.demo.common.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/*
 * @Author: daixq
 * @Date: 2021/4/2 11:47
 * @Description:
 **/
public class ConnectionFactoryConfig {

    private DruidDataSource dataSource;

    private  static ConnectionFactoryConfig connectionFactoryConfig;

    private Connection getConnection() throws SQLException {
        Properties properties = new Properties();
        String user = "root";
        String password = "123456789";
        String url = "jdbc:mysql://localhost:3306/springjava?useUnicode=true&characterEncoding=UTF-8&autoReconnect=true";
        String driverClassName = "com.mysql.cj.jdbc.Driver";
        properties.put("driverClassName",driverClassName);
        properties.put("url",url);
        properties.put("username",user);
        properties.put("password",password);

        try {
            dataSource = (DruidDataSource) DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            try {
                init();
            } catch (Exception e2) {
            }
        }
        return  dataSource.getConnection();
    }

    public static Connection getDatabaseConnection() throws SQLException {
        if(connectionFactoryConfig==null){
            connectionFactoryConfig = new ConnectionFactoryConfig();
        }
        return connectionFactoryConfig.getConnection();

    }

    public void init(){
        try {
            if (dataSource != null)
                dataSource.close();
        } catch (Exception e) {
        }
    }
}
