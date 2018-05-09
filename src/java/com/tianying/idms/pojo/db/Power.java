package com.tianying.idms.pojo.db;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: poker face
 * @date: 2018/5/9 0009 9:14
 * @since: JDK1.8.0_144
 * @version: X
 * Description:
 */
public class Power {
    /**
     * 权限id
     */
    private Integer p_id;
    /**
     * 权限名称
     */
    private String p_name;
    /**
     * 权限所属上级
     */
    private Integer p_superior;
    /**
     * 权限描述
     */
    private String p_describe;

    public Integer getP_id() {
        return p_id;
    }

    public void setP_id(Integer p_id) {
        this.p_id = p_id;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public Integer getP_superior() {
        return p_superior;
    }

    public void setP_superior(Integer p_superior) {
        this.p_superior = p_superior;
    }

    public String getP_describe() {
        return p_describe;
    }

    public void setP_describe(String p_describe) {
        this.p_describe = p_describe;
    }
}
