package com.leyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@MapperScan("com.leyou.order.mapper")
public class LyOrderApplication {
    /*11111111111*/
    //苏晓杰测试。。。第三次测试
    //杨伟烽测试
    //方震测试·····
    public static void main(String[] args) {
        SpringApplication.run(LyOrderApplication.class, args);
    }
}