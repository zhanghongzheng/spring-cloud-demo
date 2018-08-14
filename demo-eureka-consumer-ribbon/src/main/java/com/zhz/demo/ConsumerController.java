package com.zhz.demo;/**
 * Created by zhz on 18/8/14.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 功能:
 *
 * @author zhz
 * @date 18/8/14 上午1:45
 */
@RestController
public class ConsumerController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("consumer")
    public Object consumer_dc(){

        return restTemplate.getForObject("http://eureka-client/dc", String.class);
    }
}
