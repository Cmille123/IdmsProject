package com.tianying.idms.dao;

import com.tianying.idms.pojo.db.Role;
import com.tianying.idms.pojo.select.SelectRole;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: poker face
 * @date: 2018/6/14 0014 10:24
 * @since: JDK1.8.0_144
 * @version: X
 * Description:
 */
@Repository("roleDao")
public interface IRoleDao {
    /**
     * 查询角色列表
     * @param role 查询条件
     * @return 角色集合
     */
    List<Role> findRole(SelectRole role);
}
