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
public class UserPower {
    /**
     * 用户id
     */
    private Integer u_id;
    /**
     * 权限id
     */
    private Integer p_id;

    public Integer getU_id() {
        return u_id;
    }

    public void setU_id(Integer u_id) {
        this.u_id = u_id;
    }

    public Integer getP_id() {
        return p_id;
    }

    public void setP_id(Integer p_id) {
        this.p_id = p_id;
    }
}
