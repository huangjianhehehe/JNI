package cn.itcast.dao;

import cn.itcast.pojo.User;

/**
 *  用户接口
 * @author admin
 */
public interface UserDao {

    public abstract boolean login(String username, String password);

    public abstract void regist(User user);
}
