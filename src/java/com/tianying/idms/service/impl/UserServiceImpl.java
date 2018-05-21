package com.tianying.idms.service.impl;

import com.tianying.idms.dao.IUserDao;
import com.tianying.idms.pojo.db.User;
import com.tianying.idms.pojo.select.SelectUser;
import com.tianying.idms.service.IUserService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: poker face
 * @date: 2018/5/9 0009 9:02
 * @since: JDK1.8.0_144
 * @version: X
 * Description:
 */
@Service("userService")
public class UserServiceImpl implements IUserService{

    @Resource(name="userDao")
    private IUserDao userDao;

    @Override
    public User login(SelectUser user) {
        List<User> list = userDao.findUser(user);
        return list.size()>0?list.get(0):null;
    }
}
