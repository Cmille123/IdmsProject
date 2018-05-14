package com.tianying.idms.controller;

import com.tianying.idms.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: poker face
 * @date: 2018/5/9 0009 8:48
 * @since: JDK1.8.0_144
 * @version: X
 * Description:
 */
@Controller("userController")
public class UserController {

    @Resource(name="userService")
    private IUserService userService;

    @RequestMapping("/login.do")
    public ModelAndView login(HttpServletRequest req, HttpServletResponse resp,
                              @RequestParam(required = true, value = "username") String username,
                              @RequestParam(required = true, value = "password") String password){
        ModelAndView modelAndView = new ModelAndView("index.html");
        userService.login();
        System.out.print(username+"  "+password);
        return modelAndView;
    }
}
