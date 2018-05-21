package com.tianying.idms.service;

import com.tianying.idms.pojo.db.User;
import com.tianying.idms.pojo.select.SelectUser;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: poker face
 * @date: 2018/5/9 0009 9:01
 * @since: JDK1.8.0_144
 * @version: X
 * Description:
 */
public interface IUserService {

    List<User> login(SelectUser user);
}
