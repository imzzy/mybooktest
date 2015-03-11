package cn.mybook.dao;

import cn.mybook.domain.User;

public interface UserDao {

	public abstract User getUser(User username);
}
