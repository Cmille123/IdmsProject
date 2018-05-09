package com.tianying.idms.dao;

import com.tianying.idms.pojo.db.User;
import com.tianying.idms.pojo.select.SelectUser;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: poker face
 * @date: 2018/5/9 0009 8:57
 * @since: JDK1.8.0_144
 * @version: X
 * Description:
 */
@Repository("userDao")
public interface IUserDao {
    /**
     * 查询用户列表
     * @param user 查询条件
     * @return 用户集合
     */
    List<User> findUser(SelectUser user);
}
