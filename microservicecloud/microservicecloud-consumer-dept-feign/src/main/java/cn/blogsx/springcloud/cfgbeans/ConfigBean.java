package cn.blogsx.springcloud.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author Alex
 * @create 2020-02-21 13:04
 **/
@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced
    //Spring Cloud Ribbon是基于Netflix Ribbon实现的一套 客户端 负载均衡 的工具
    public RestTemplate getRestTemplate() {

        return new RestTemplate();
    }

    @Bean
    public IRule myRule() {

        return new RoundRobinRule();//用我们重新选择的随机算法替代默认的轮询。
    }
}
