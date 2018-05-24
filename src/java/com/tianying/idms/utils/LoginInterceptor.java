package com.tianying.idms.utils;

import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: poker face
 * @date: 2018/5/24 0024 9:36
 * @since: JDK1.8.0_144
 * @version: X
 * Description:
 */
public class LoginInterceptor extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest req, HttpServletResponse resp, FilterChain filterChain) throws ServletException, IOException {
        // 不过滤的url
        String[] notFilter = new String[] { "login.html","login.do"};
        // 需过滤的url
        String[] filter = new String[]{".html",".jsp",".do"};
        // 请求的uri
        String uri = req.getRequestURI();
        // 是否过滤（页面）
        boolean doFilter = true;
        // 是否过滤（静态资源）
        boolean doFilters = false;
        for (String s : notFilter) {
            if (uri.contains(s)) {
                // 如果uri中包含不过滤的uri，则不进行过滤
                doFilter = false;
                break;
            }
        }
        for(String s: filter){
            if (uri.contains(s)) {
                // 如果uri中包含过滤的uri，则进行过滤
                doFilters = true;
                break;
            }
        }
        if (doFilter && doFilters) {
            // 执行过滤
            // 从session中获取登录者实体
            Object user = req.getSession().getAttribute("loginUser");
            if (user == null) {
                // 如果session中不存在登录者实体，则弹出框提示重新登录
                // 设置request和response的字符集，防止乱码
                req.setCharacterEncoding("UTF-8");
                resp.setCharacterEncoding("UTF-8");
                resp.setContentType("text/html;charset=utf-8");
                PrintWriter out = resp.getWriter();
                out.print("<script type=\"text/javascript\">" +
                        "alert('您好,请先登录!');" +
                        "window.parent.frames.location.href='login.html';" +
                        "</script>");
                out.flush();
                out.close();
            } else {
                // 如果session中存在登录者实体，则继续
                filterChain.doFilter(req, resp);
            }
        } else {
            // 如果不执行过滤，则继续
            filterChain.doFilter(req, resp);
        }
    }
}
