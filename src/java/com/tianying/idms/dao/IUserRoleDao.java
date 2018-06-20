package com.tianying.idms.dao;

import com.tianying.idms.pojo.db.UserRole;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: poker face
 * @date: 2018/6/15 0015 8:39
 * @since: JDK1.8.0_144
 * @version: X
 * Description:
 */
@Repository("userRoleDao")
public interface IUserRoleDao {
    /**
     * 添加用户角色信息
     * @param userRole 用户角色信息
     * @return 受影响的行数
     */
    @Insert("insert into t_user_role(u_id,r_id) values(#{u_id},#{r_id})")
    int addUserRole(UserRole userRole);

    int deleteUserRole(UserRole userRole);
}
