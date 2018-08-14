package com.zhz.demo;/**
 * Created by zhz on 18/8/14.
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能:
 *
 * @author zhz
 * @date 18/8/14 下午11:40
 */
@RestController
public class TestConfigController {

    @Value("${info.from}")
    private String from;

    @GetMapping("/config/from")
    public String getFrom(){
        return this.from;
    }

}
