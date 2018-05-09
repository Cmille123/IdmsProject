package com.tianying.idms.pojo.db;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: poker face
 * @date: 2018/5/9 0009 9:16
 * @since: JDK1.8.0_144
 * @version: X
 * Description:
 */
public class RolePower {
    /**
     * 角色id
     */
    private Integer r_id;
    /**
     * 权限id
     */
    private Integer p_id;

    public Integer getR_id() {
        return r_id;
    }

    public void setR_id(Integer r_id) {
        this.r_id = r_id;
    }

    public Integer getP_id() {
        return p_id;
    }

    public void setP_id(Integer p_id) {
        this.p_id = p_id;
    }
}
