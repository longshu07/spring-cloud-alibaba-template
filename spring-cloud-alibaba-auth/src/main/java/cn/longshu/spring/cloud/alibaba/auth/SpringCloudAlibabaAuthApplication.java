package cn.longshu.spring.cloud.alibaba.auth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @author : longshu
 * @description : 启动类
 * @createTime : 2024-04-05 10:49:06
 */
@SpringBootApplication
@MapperScan(basePackages = {"cn.longshu.spring.cloud.alibaba.auth.dao"})
public class SpringCloudAlibabaAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudAlibabaAuthApplication.class, args);
    }

}
