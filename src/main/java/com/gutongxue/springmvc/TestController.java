package com.gutongxue.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author Created by ShadowSaint on 2018/4/22
 */
@Controller
public class TestController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
