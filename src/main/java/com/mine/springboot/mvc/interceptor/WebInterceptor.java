package com.mine.springboot.mvc.interceptor;

import com.mine.springboot.util.IpUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Title:
 * Description:web拦截器
 * Copyright: Copyright (c) 2018
 *
 * @author Murphy.Chang
 * @version 1.0
 * @date 2018/6/12
 */
@Component
public class WebInterceptor implements HandlerInterceptor {
    private final static Logger logger = LoggerFactory.getLogger(WebInterceptor.class);
    
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
    	logger.info("----------web start----------");
        //获取访问的IP
        String ip = IpUtil.getIpAddress(request);
        long startTime = System.currentTimeMillis();
        request.setAttribute("requestStartTime", startTime);
        String path = String.format("%s://%s:%s%s", request.getScheme(), request.getServerName(), request.getServerPort(), request.getRequestURI());
        logger.info("ip:{}, sessionId:{}, path:{}", ip, request.getSession().getId(), path);

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
    	long startTime = (Long) request.getAttribute("requestStartTime");
        long endTime = System.currentTimeMillis();
        long executeTime = endTime - startTime;
        logger.info("----------web end spend:{}ms----------", executeTime);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}