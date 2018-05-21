package com.tianying.idms.controller;

import com.tianying.idms.pojo.db.User;
import com.tianying.idms.pojo.select.SelectUser;
import com.tianying.idms.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

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
        String url = null;
        //当前登录用户
        User user = null;
        //查询用户的条件
        SelectUser selectUser = new SelectUser();
        selectUser.setU_username(username);
        selectUser.setU_password(password);
        //查询用户是否存在
        List<User> users = userService.login(selectUser);
        if (users!=null && users.size()>0){
            user = users.get(0);
            url = "index.html";
        }else{
            try {
                req.setCharacterEncoding("utf-8");
                resp.setContentType("text/html;charset=utf-8");
                PrintWriter out = resp.getWriter();
                out.print("<script type='text/javascript'>alert('用户名或密码错误');history.go(-1);</script>");
                out.flush();
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            url = "login.html";
        }
        System.out.println(username+"  "+password);
        System.out.println(user);
        System.out.println(url);
        return new ModelAndView(url);
    }
}
