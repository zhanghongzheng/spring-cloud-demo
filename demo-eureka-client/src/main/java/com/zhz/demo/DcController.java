package com.zhz.demo;/**
 * Created by zhz on 18/8/14.
 */

import com.zhz.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

/**
 * 功能:
 *
 * @author zhz
 * @date 18/8/14 上午12:56
 */
@RestController
public class DcController {
    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("/dc")
    public String dc() {
        String services = "Services: " + discoveryClient.getServices();
        System.out.println(services);
        return services;
    }

    @GetMapping("/dc/{name}")
    public String dc(@PathVariable String name) {
        return "param:"+name;
    }


    @PostMapping("/dc")
    public String dc(@RequestBody User user) {

        return "param:"+user;
    }


}
