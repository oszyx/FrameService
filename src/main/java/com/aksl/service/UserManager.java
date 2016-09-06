package com.aksl.service;

import com.aksl.entity.system.User;

public interface UserManager {
	/**通过id获取数据
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public User findById(Integer id)throws Exception;
	
	
	public void saveU(User user)throws Exception;
}
