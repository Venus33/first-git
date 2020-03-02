package dao.impl;

import java.util.ArrayList;
import java.util.List;

import dao.UserDao;
import entity.User;
/**
 * 实现dao接口中方法的操作类
 * @author 美少女专用
 *
 */
public class UserDaoImpl implements UserDao {

	@Override
	public void save(User user) {
		// 创建一个集合来保存用户信息
		List<User> list = new ArrayList<User>();
		list.add(user);
		for(User user2 : list) {
			System.out.println(user2.getName()+","+user2.getAge());
		}

	}

	@Override
	public void update(User user) {
		System.out.println("执行修改用户的操作");
		
	}

	@Override
	public void spl(User user) {
		System.out.println("执行修改用户操作");
		
	}

}
