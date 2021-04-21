package org.example.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author chenli
 * @version V1.0
 * @Company: 上海浦东华宇信息技术有限公司
 * @Title: EurakaService
 * @Package org.example
 * @Description:
 * @date 2021/4/18 14:20
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@EnableEurekaServer
public class EurekaSingleRun {


    public static void main(String[] args) {
        SpringApplication.run(EurekaSingleRun.class);

    }
}
