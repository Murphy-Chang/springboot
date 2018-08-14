package com.mine.springboot.controller.web.common;

import com.mine.springboot.jpa.entity.TUserInfo;
import com.mine.springboot.service.CommonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Title:
 * Description:
 * Copyright: Copyright (c) 2018
 * Company: MINE
 *
 * @author Murphy.Chang
 * @version 1.0
 * @date 2018/5/29
 */
@Controller
@RequestMapping(value = "/web/common")
public class CommonController {
	private static final Logger logger = LoggerFactory.getLogger(CommonController.class);

	@Autowired
	private CommonService commonService;

	/**
	 * 跳转首页
	 * @param model
	 */
	@RequestMapping(value = "/index.html", method = {RequestMethod.GET})
	public String indexHtml(Model model) {
		logger.info("跳转--首页");
		//全部用户信息
		List<TUserInfo> userInfoList = commonService.getAllUserInfoList();
		//放入model中传到前台，供th模板使用
		model.addAttribute("userInfoList", userInfoList);

		return "/common/index";
	}

}