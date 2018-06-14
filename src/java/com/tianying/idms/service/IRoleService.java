package com.tianying.idms.service;

import com.tianying.idms.pojo.db.Role;
import com.tianying.idms.pojo.select.SelectRole;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: poker face
 * @date: 2018/6/14 0014 10:31
 * @since: JDK1.8.0_144
 * @version: X
 * Description:
 */
public interface IRoleService {
    /**
     * 获取所有角色信息
     * @param role 角色信息
     * @return 角色集合
     */
    List<Role> findAllRole(SelectRole role);
}
