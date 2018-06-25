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
    /**
     * 登录
     * @param user 用户信息
     * @return 用户信息
     */
    User login(SelectUser user);

    /**
     * 获取所以用户信息集合
     * @param user 用户信息
     * @return 用户集合
     */
    List<User> findAllUser(SelectUser user);

    /**
     * 添加用户
     * @param user 用户对象
     * @return 受影响的行数
     */
    boolean addUser(User user);
    /**
     * 修改用户
     * @param user 用户对象
     * @return 受影响的行数
     */
    boolean updateUser(User user);

    /**
     * 批量删除用户
     * @param selectUser ids存储用户id数组
     * @return 受影响的行数
     */
    boolean deleteUsers(SelectUser selectUser);

    /**
     * 删除单个用户
     * @param selectUser u_id存储用户id
     * @return 受影响的行数
     */
    boolean deleteUser(SelectUser selectUser);

    /**
     * 根据id查询用户信息
     * @param id 用户id
     * @return 用户信息
     */
    User findUserById(int id);
}
