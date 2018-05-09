package com.tianying.idms.pojo.db;

import java.sql.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: poker face
 * @date: 2018/5/9 0009 9:14
 * @since: JDK1.8.0_144
 * @version: X
 * Description:
 */
public class Dept {
    /**
     * 部门id
     */
    private Integer d_id;
    /**
     * 部门名称
     */
    private String d_name;
    /**
     * 部门ip
     */
    private String d_ip;
    /**
     * 部门所在省
     */
    private String d_province;
    /**
     * 部门所在市
     */
    private String d_city;
    /**
     * 部门所在县
     */
    private String d_county;
    /**
     * 部门详细位置
     */
    private String d_address;
    /**
     * 管理人员id
     */
    private Integer d_admin;
    /**
     * 创建时间
     */
    private Date d_createTime;

    public Integer getD_id() {
        return d_id;
    }

    public void setD_id(Integer d_id) {
        this.d_id = d_id;
    }

    public String getD_name() {
        return d_name;
    }

    public void setD_name(String d_name) {
        this.d_name = d_name;
    }

    public String getD_ip() {
        return d_ip;
    }

    public void setD_ip(String d_ip) {
        this.d_ip = d_ip;
    }

    public String getD_province() {
        return d_province;
    }

    public void setD_province(String d_province) {
        this.d_province = d_province;
    }

    public String getD_city() {
        return d_city;
    }

    public void setD_city(String d_city) {
        this.d_city = d_city;
    }

    public String getD_county() {
        return d_county;
    }

    public void setD_county(String d_county) {
        this.d_county = d_county;
    }

    public String getD_address() {
        return d_address;
    }

    public void setD_address(String d_address) {
        this.d_address = d_address;
    }

    public Integer getD_admin() {
        return d_admin;
    }

    public void setD_admin(Integer d_admin) {
        this.d_admin = d_admin;
    }

    public Date getD_createTime() {
        return d_createTime;
    }

    public void setD_createTime(Date d_createTime) {
        this.d_createTime = d_createTime;
    }
}
