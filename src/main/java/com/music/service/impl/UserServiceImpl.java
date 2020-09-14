package com.music.service.impl;

import com.laoxuai.beans.annotation.Autowired;
import com.laoxuai.beans.annotation.Service;
import com.laoxuai.ibatis.util.Example;
import com.laoxuai.ibatis.util.PageInfo;
import com.music.dao.UserDao;
import com.music.pojo.User;
import com.music.service.UserService;

import java.sql.SQLException;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public int insert(User user) {
		try {
			return userDao.insert(user);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int delete(Long id) {
		try {
			return userDao.delete(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int update(User user) {
		try {
			return userDao.update(user);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public User getByPrimaryKey(Long id) {
		try {
			return userDao.getByPrimaryKey(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<User> listPage(User user, int page, int size) {
		try {
			return userDao.listPage(user, page, size);
		} catch (SQLException throwables) {
			throwables.printStackTrace();
		}
		return null;
	}

	@Override
	public PageInfo<User> listPageInfo(User user, int page, int size) {
		try {
			return userDao.listPageInfo(user, page, size);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<User> selectByExample(User user) {
		Example example = createExmaple(user);
		try {
			return userDao.selectByExample(example);
		} catch (SQLException throwables) {
			throwables.printStackTrace();
		}
		return null;
	}

	private Example createExmaple(User user) {
		Example example = new Example(User.class);
		Example.Criteria criteria = example.createCriteria();
		// TODO
		return example;
	}

}
