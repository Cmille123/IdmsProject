package com.tianying.idms.dao;

import com.tianying.idms.pojo.db.User;
import com.tianying.idms.pojo.select.SelectUser;
import org.apache.ibatis.annotations.*;
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

    /**
     * 添加用户
     * @param user 用户对象
     * @return 受影响的行数
     */
    @Insert("insert into t_user(u_name,u_username,u_password,u_tell,d_id) values(#{u_name},#{u_username},#{u_password},#{u_tell},#{d_id})")
    int addUser(User user);

    /**
     * 修改用户
     * @param user 用户对象
     * @return 受影响的行数
     */
    int updateUser(User user);

    /**
     * 批量删除用户
     * @param selectUser ids存储用户id数组
     * @return 受影响的行数
     */
    int deleteUsers(SelectUser selectUser);

    /**
     * 删除单个用户
     * @param selectUser u_id存储用户id
     * @return 受影响的行数
     */
    @Delete("delete from t_user where u_id=#{u_id}")
    int deleteUser(SelectUser selectUser);


}
