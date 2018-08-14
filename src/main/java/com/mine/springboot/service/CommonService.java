package com.mine.springboot.service;

import com.mine.springboot.jpa.entity.TUserInfo;

import java.util.List;

/**
 * Title:
 * Description:
 * Copyright: Copyright (c) 2018
 *
 * @author Murphy.Chang
 * @version 1.0
 * @date 2018/8/14
 */
public interface CommonService {
	/**
	 * 获取全部用户信息
	 * @return
	 */
	public List<TUserInfo> getAllUserInfoList();
}
