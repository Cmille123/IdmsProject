package com.tianying.idms.controller;

import com.tianying.idms.pojo.db.User;
import com.tianying.idms.pojo.select.SelectUser;
import com.tianying.idms.service.IUserService;
import com.tianying.idms.utils.PageUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
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
        //查询用户的条件
        SelectUser selectUser = new SelectUser();
        selectUser.setU_username(username);
        selectUser.setU_password(password);
        //当前登录用户
        User user = userService.login(selectUser);
        //查询用户是否存在
        if (user!=null){
            req.getSession().setAttribute("loginUser",user);
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
        }
        System.out.println(user);
        return new ModelAndView("redirect:index.html");
    }

    /**
     * 登出
     * @return 返回页面
     */
    @RequestMapping("/out.do")
    public ModelAndView out(HttpServletRequest req){
        req.getSession().removeAttribute("loginUser");
        return new ModelAndView("redirect:login.html");
    }

    @RequestMapping("/userList.do")
    public ModelAndView list(HttpServletRequest req,@RequestParam(required = true, value = "page") int page) {
        List list = userService.findAllUser(new SelectUser());
        List pageContext = PageUtil.getPageContext(page, list);
        req.setAttribute("uList", pageContext);
        req.setAttribute("page", page);
        req.setAttribute("pageCount", PageUtil.getPageCount(list));
        req.setAttribute("dataCount", list.size());
        return new ModelAndView("main_list.jsp");
    }

    @RequestMapping("/addUser.do")
    public String addUser(@RequestParam(required = true, value = "u_name") String name,
            @RequestParam(required = true, value = "u_username") String username,
            @RequestParam(required = true, value = "u_password") String password,
            @RequestParam(required = true, value = "u_tell") String tell,
            HttpServletRequest req){
        User u = new User();
        u.setU_name(name);
        u.setU_username(username);
        u.setU_password(password);
        u.setU_tell(tell);
        u.setD_id(0);
        userService.addUser(u);
        return "redirect:/userList.do?page=1";
    }





}
