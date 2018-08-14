package com.mine.springboot.service.impl;

import com.mine.springboot.jpa.entity.TUserInfo;
import com.mine.springboot.jpa.repository.TUserInfoRepository;
import com.mine.springboot.service.CommonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
@Service
public class CommonServiceImpl implements CommonService {
	private static final Logger logger = LoggerFactory.getLogger(CommonServiceImpl.class);

	@Autowired
	private TUserInfoRepository userInfoRepo;

	/**
	 * 获取全部用户信息
	 * @return
	 */
	@Override
	public List<TUserInfo> getAllUserInfoList(){
		return (List<TUserInfo>) userInfoRepo.findAll();
	}
 }
