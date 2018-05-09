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
public class DeptPower {
    /**
     * 部门id
     */
    private Integer d_id;
    /**
     * 权限id
     */
    private Integer p_id;

    public Integer getD_id() {
        return d_id;
    }

    public void setD_id(Integer d_id) {
        this.d_id = d_id;
    }

    public Integer getP_id() {
        return p_id;
    }

    public void setP_id(Integer p_id) {
        this.p_id = p_id;
    }
}
