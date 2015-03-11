package cn.mybook.dao;

import java.util.List;

public interface Dao<T> {

	long insert(String sql,Object ...args);
	
	void update(String sql,Object ...args);
	
	T query(String sql, Object ...args);
	
	List<T> queryForList(String sql,Object ...args);
	
	<V> V getsingleVal(String sql,Object ...args);
	
	void batch(String sql,Object[] ...args);
}
