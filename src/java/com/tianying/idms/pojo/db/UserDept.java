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
public class UserDept {
    /**
     * 用户id
     */
    private Integer u_id;
    /**
     * 部门id
     */
    private Integer d_id;

    public Integer getU_id() {
        return u_id;
    }

    public void setU_id(Integer u_id) {
        this.u_id = u_id;
    }

    public Integer getD_id() {
        return d_id;
    }

    public void setD_id(Integer d_id) {
        this.d_id = d_id;
    }
}
