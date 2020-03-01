package cn.blogsx.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Alex
 * @create 2020-02-23 15:53
 **/
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule() {

        return  new CustomRandomRule();
    }
}
