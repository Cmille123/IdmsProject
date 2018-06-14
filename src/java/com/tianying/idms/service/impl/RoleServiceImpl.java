package com.tianying.idms.service.impl;

import com.tianying.idms.dao.IRoleDao;
import com.tianying.idms.pojo.db.Role;
import com.tianying.idms.pojo.select.SelectRole;
import com.tianying.idms.service.IRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: poker face
 * @date: 2018/6/14 0014 10:33
 * @since: JDK1.8.0_144
 * @version: X
 * Description:
 */
@Service("roleService")
public class RoleServiceImpl implements IRoleService {
    @Resource(name="roleDao")
    private IRoleDao roleDao;
    @Override
    public List<Role> findAllRole(SelectRole role) {
        return roleDao.findRole(role);
    }
}
