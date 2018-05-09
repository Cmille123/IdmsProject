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
public class Log {
    /**
     * 日志id
     */
    private Integer l_id;
    /**
     * 操作用户id
     */
    private Integer u_id;
    /**
     * 操作时间
     */
    private Date l_createTime;
    /**
     * 操作
     */
    private String l_operation;
    /**
     * 备注
     */
    private String l_remarks;

    public Integer getL_id() {
        return l_id;
    }

    public void setL_id(Integer l_id) {
        this.l_id = l_id;
    }

    public Integer getU_id() {
        return u_id;
    }

    public void setU_id(Integer u_id) {
        this.u_id = u_id;
    }

    public Date getL_createTime() {
        return l_createTime;
    }

    public void setL_createTime(Date l_createTime) {
        this.l_createTime = l_createTime;
    }

    public String getL_operation() {
        return l_operation;
    }

    public void setL_operation(String l_operation) {
        this.l_operation = l_operation;
    }

    public String getL_remarks() {
        return l_remarks;
    }

    public void setL_remarks(String l_remarks) {
        this.l_remarks = l_remarks;
    }
}
