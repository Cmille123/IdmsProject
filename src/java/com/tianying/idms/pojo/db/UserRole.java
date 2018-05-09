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
public class UserRole {
    /**
     * 用户id
     */
    private Integer u_id;
    /**
     * 角色id
     */
    private Integer r_id;

    public Integer getU_id() {
        return u_id;
    }

    public void setU_id(Integer u_id) {
        this.u_id = u_id;
    }

    public Integer getR_id() {
        return r_id;
    }

    public void setR_id(Integer r_id) {
        this.r_id = r_id;
    }
}
