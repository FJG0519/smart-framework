package com.feijiangang.framework.util;

/**
 * @ClassName StringUtils
 * @Description 字符串工具类
 * @Date 2020-05-06 16:58
 * @Author fjg
 **/
public class StringUtils {

    //判断字符串是否为空
    public static boolean isEmpty(String str){
        if (str != null){
            str = str.trim();
        }
        return org.apache.commons.lang3.StringUtils.isEmpty(str);
    }

    //判断字符串是否非空
    public static boolean isNotEmpty(String str){

        return !isEmpty(str);
    }

}
