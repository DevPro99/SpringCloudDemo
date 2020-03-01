package cn.blogsx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard //开起Hystrix提供的Dashboard仪表盘注解
public class DeptConsumer_DashBoard_App {

    public static void main( String[] args ) {

        SpringApplication.run(DeptConsumer_DashBoard_App.class,args);
    }
}
