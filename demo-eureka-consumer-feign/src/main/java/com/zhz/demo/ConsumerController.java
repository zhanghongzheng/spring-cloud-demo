package com.zhz.demo;/**
 * Created by zhz on 18/8/14.
 */

import com.zhz.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 功能:
 *
 * @author zhz
 * @date 18/8/14 上午1:45
 */
@RestController
public class ConsumerController {
    @Autowired
    DcClient dcClient;

    @GetMapping("consumer")
    public Object consumer_dc(){
        return dcClient.consumer();
    }


    @GetMapping("consumer/{name}")
    public Object consumer_dc_name(@PathVariable String name){
        System.out.println("param:"+name);
        return dcClient.consumer_name(name);
    }

    @PostMapping("consumer")
    public Object consumer_dc_post(@RequestBody User user){
        System.out.println("param:"+user);
        return dcClient.consumer_post(user);
    }
}
