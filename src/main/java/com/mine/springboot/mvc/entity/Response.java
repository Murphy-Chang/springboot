package com.mine.springboot.mvc.entity;

import com.mysql.cj.core.util.StringUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * Title: Response响应操作类
 * Description:
 * Copyright: Copyright (c) 2018
 * @author Murphy.chang
 * @date 2018年3月12日
 * @version 1.0
 */
public class Response {
    private final static String MSG = "msg";//消息名称常量
    private final static String CODE = "code";//状态码名称常量
    public final static String DATA = "data";//数据名称常量

    /**
     * base
     * @param body
     * @param msg
     * @param statusCode
     * @return
     */
	private static ResponseEntity<Object> build(Object body, String msg, HttpStatus statusCode) {
        Map<String,Object> data = new HashMap<>();
        //状态码
        data.put(CODE,statusCode.value());
        //消息
        if(StringUtils.isNullOrEmpty(msg)){
            msg = "";
        }
        data.put(MSG, msg);
        //内容
        if(body != null) {
            data.put(DATA, body);
        }
        return new ResponseEntity(data, statusCode);
    }

    /**
     * 请求成功,无需返回结果集
     */
    public static ResponseEntity<Object> success() {
        return build(new HashMap<>(),"success", HttpStatus.OK);
    }

    /**
     * 200
     * 请求成功,并返回请求结果集
     *
     * @param object 返回到客户端的对象
     * @return Spring mvc ResponseEntity
     */
    public static ResponseEntity<Object> success(Object object) {
        return build(object, "success", HttpStatus.OK);
    }

    /**
     * 500
     * 服务器错误
     *
     * @param msg 请求失败的错误信息
     * @return Spring mvc ResponseEntity
     */
    public static ResponseEntity<Object> serverError(String msg) {
        return build(new HashMap<>(), msg, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    /**
     * 404
     * 请求失败,找不到数据
     *
     * @return Spring mvc ResponseEntity
     */
    public static ResponseEntity<Object> notFound(String msg) {
        return build(new HashMap<>(), msg, HttpStatus.NOT_FOUND);
    }

    /**
     * 403
     * 鉴权失败
     *
     * @param msg 请求失败的错误信息
     * @return Spring mvc ResponseEntity
     */
    public static ResponseEntity<Object> authorityFailed(String msg) {
        return build(new HashMap<>(), msg, HttpStatus.FORBIDDEN);
    }

    /**
     * 406
     * 非法参数
     *
     * @param msg 请求失败的错误信息
     * @return Spring mvc ResponseEntity
     */
    public static ResponseEntity<Object> illegalArgument(String msg) {
        return build(new HashMap<>(), msg, HttpStatus.NOT_ACCEPTABLE);
    }

    /**
     * 400
     * Bad Request
     * @param msg
     * @return
     */
    public static ResponseEntity<Object> badRequest(String msg) {
        return build(new HashMap<>(), msg, HttpStatus.BAD_REQUEST);
    }
}
