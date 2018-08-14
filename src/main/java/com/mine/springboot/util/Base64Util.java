package com.mine.springboot.util;

import java.util.Base64;

/**
 *
 * @Description TODO base64位加密解密工具类
 *
 */
public class Base64Util {
    /**
     * 为字符加密
     *
     * @param str 需要加密的字符
     */
    public final static String encode(String str) {
        return Base64.getEncoder().encodeToString(str.getBytes());
    }

    /**
     * 解密字符,并返回字符串
     * @param str
     * @return
     */
    public final static String decode(String str) {
        byte[] bytes = Base64.getDecoder().decode(str);
        return new String(bytes);
    }

}
