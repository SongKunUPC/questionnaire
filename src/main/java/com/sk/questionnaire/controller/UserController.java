package com.sk.questionnaire.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by SongKun on 2020/1/19 10:26 下午
 */
@Controller
public class UserController {

    @GetMapping("/login")
    public String getLogin(){
        return "login";
    }
}
