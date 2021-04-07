package com.kevin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @project_name：ssmbuild
 * @name：IndexController
 * @date：2021/4/3 11:02 下午
 * @auther：dexukong
 */

@Controller
@ResponseBody
public class IndexController {

    @GetMapping("/index")
    public String index() {
        return "hello ssm";
    }

}
