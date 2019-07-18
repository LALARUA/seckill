package cn.zx.authenticate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @Author: xiangXX
 * @Description:
 * @Date Created in 23:22 2019/7/16 0016
 */
@RestController
public class AuthenticateController {

    @GetMapping("/user/{userId}")
    public String getUser(@PathVariable("userId") Integer userId, HttpSession httpSession){

        String sessionId = httpSession.getId();
        return "zhongxiang";
    }
}
