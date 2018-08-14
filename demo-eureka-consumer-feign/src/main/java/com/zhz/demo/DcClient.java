package com.zhz.demo;/**
 * Created by zhz on 18/8/14.
 */

import com.zhz.demo.domain.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * 功能:
 *
 * @author zhz
 * @date 18/8/14 下午3:01
 */
@FeignClient("eureka-client")
public interface DcClient {
    @GetMapping("/dc")
    String consumer();

    @GetMapping("/dc/{name}")
    String consumer_name(@PathVariable("name") String name);

    @PostMapping("/dc")
    String consumer_post(@RequestBody User user);
}
