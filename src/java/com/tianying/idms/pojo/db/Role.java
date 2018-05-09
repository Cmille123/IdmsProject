package com.tianying.idms.pojo.db;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: poker face
 * @date: 2018/5/9 0009 9:15
 * @since: JDK1.8.0_144
 * @version: X
 * Description:
 */
public class Role {
    /**
     * 角色id
     */
    private Integer r_id;
    /**
     * 角色名称
     */
    private String r_name;
    /**
     * 角色描述
     */
    private String r_describe;

    public Integer getR_id() {
        return r_id;
    }

    public void setR_id(Integer r_id) {
        this.r_id = r_id;
    }

    public String getR_name() {
        return r_name;
    }

    public void setR_name(String r_name) {
        this.r_name = r_name;
    }

    public String getR_describe() {
        return r_describe;
    }

    public void setR_describe(String r_describe) {
        this.r_describe = r_describe;
    }
}
