package com.tianying.idms.pojo.select;

import java.sql.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: poker face
 * @date: 2018/5/9 0009 9:50
 * @since: JDK1.8.0_144
 * @version: X
 * Description:
 */
public class SelectUser {
    /**
     * 用户编号
     */
    private Integer u_id;
    /**
     * 用户姓名
     */
    private String u_name;
    /**
     * 用户登录名
     */
    private String u_username;
    /**
     * 用户密码
     */
    private String u_password;
    /**
     * 注册时间
     */
    private Date u_createTime;
    /**
     * 用户id数组
     */
    private Integer[] ids;
    /**
     * 联系方式
     */
    private String u_tell;

    public Integer getU_id() {
        return u_id;
    }

    public void setU_id(Integer u_id) {
        this.u_id = u_id;
    }

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public String getU_username() {
        return u_username;
    }

    public void setU_username(String u_username) {
        this.u_username = u_username;
    }

    public String getU_password() {
        return u_password;
    }

    public void setU_password(String u_password) {
        this.u_password = u_password;
    }

    public Date getU_createTime() {
        return u_createTime;
    }

    public void setU_createTime(Date u_createTime) {
        this.u_createTime = u_createTime;
    }

    public String getU_tell() {
        return u_tell;
    }

    public void setU_tell(String u_tell) {
        this.u_tell = u_tell;
    }
    public Integer[] getIds() {
        return ids;
    }

    public void setIds(Integer[] ids) {
        this.ids = ids;
    }
}
