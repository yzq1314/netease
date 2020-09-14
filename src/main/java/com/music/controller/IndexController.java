package com.music.controller;

import com.laoxuai.beans.annotation.Controller;
import com.laoxuai.web.mvc.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }



}
