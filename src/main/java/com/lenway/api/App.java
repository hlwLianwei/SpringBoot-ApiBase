package com.lenway.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@SpringBootApplication
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class}) // 屏蔽掉自动连接数据库, 添加某些数据相关依赖后会可能自动连接数据库
@EnableJpaRepositories // 启用SpringData jpa, 此注解是为了持久化，不需要则可以不加
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
