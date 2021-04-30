package com.ahau.zdw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;


//扫描 mybatis mapper 包路径
@MapperScan(basePackages = "com.ahau.zdw.mapper")
//扫描 所有需要的包, 包含一些自用的工具类包 所在的路径
@ComponentScan(basePackages= {"com.ahau.zdw"})
//开启定时任务
//@EnableScheduling
//开启异步调用方法
//@EnableAsync


@SpringBootApplication
public class ZdwApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZdwApplication.class, args);
	}

}
