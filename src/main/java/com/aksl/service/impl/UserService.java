package com.aksl.service.impl;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.aksl.dao.DaoSupport;
import com.aksl.entity.system.User;
import com.aksl.service.UserManager;

@Service("userService")
public class UserService implements UserManager{

	@Resource(name = "daoSupport")
	private DaoSupport dao;
	@Override
	public User findById(Integer id) throws Exception {
		Map<String, Integer> map = new HashMap<String,Integer>();
		map.put("id", id);
		return (User)dao.findForObject("UserMapper.findNameByUserId", map);
	}
	@Override
	public void saveU(User user) throws Exception {
		dao.save("UserMapper.saveU", user);
	}
}
