package com.tianying.idms.controller;

import com.tianying.idms.pojo.db.Role;
import com.tianying.idms.pojo.select.SelectRole;
import com.tianying.idms.service.IRoleService;
import com.tianying.idms.utils.PageUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: poker face
 * @date: 2018/6/14 0014 10:36
 * @since: JDK1.8.0_144
 * @version: X
 * Description:
 */
@Controller("roleController")
public class RoleController {
    @Resource(name="roleService")
    private IRoleService roleService;
    @RequestMapping("/roleList.do")
    public ModelAndView list(HttpServletRequest req,@RequestParam(required = true, value = "page") int page){
        List list = roleService.findAllRole(new SelectRole());
        List pageContext = PageUtil.getPageContext(page,list);
        for(Object obj:pageContext) {
            Role role = (Role)obj;
            System.out.println(role.getR_name());
        }
        return new ModelAndView("login.html");
    }
}
