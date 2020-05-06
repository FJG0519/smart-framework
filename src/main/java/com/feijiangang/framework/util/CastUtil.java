package com.feijiangang.framework.util;

/**
 * @ClassName CastUtil
 * @Description 转型操作工具类
 * @Date 2020-05-06 16:49
 * @Author fjg
 **/
public class CastUtil {

    //转换为String类型
    public static String castString(Object obj){

        return castString(obj,"");
    }

    //转换为String类型(可指定默认值)
    public static String castString(Object obj,String defaultValue){

        return obj != null ? String.valueOf(obj) : defaultValue;
    }

    //转换为Double类型
    public static double castDouble(Object obj){

        return castDouble(obj,0);
    }

    //转换为Double类型(可指定默认值)
    public static double castDouble(Object obj,double defaultValue){
        double value = defaultValue;
        if (obj != null){
            String strVal = castString(obj);
            if (StringUtils.isNotEmpty(strVal)){
                try {
                    value = Double.parseDouble(strVal);
                }catch (NumberFormatException e){
                    value = defaultValue;
                }
            }
        }

        return value;
    }

    //转换为Long类型
    public static long castLong(Object obj){

        return castLong(obj,0);
    }

    //转换为Long类型(可指定默认值)
    public static long castLong(Object obj,long defaultValue){
        long value = defaultValue;
        if (obj != null){
            String strVal = castString(obj);
            if (StringUtils.isNotEmpty(strVal)){
                try {
                    value = Long.parseLong(strVal);
                }catch (NumberFormatException e){
                    value = defaultValue;
                }
            }
        }
        return value;
    }

    //转换为Int类型
    public static int castInt(Object obj){

        return castInt(obj,0);
    }

    //转换为Int类型(可指定默认值)
    public static int castInt(Object obj,int defaultValue){
        int value = defaultValue;
        if (obj != null){
            String strVal = castString(obj);
            if (StringUtils.isNotEmpty(strVal)){
                try {
                    value = Integer.parseInt(strVal);
                }catch (NumberFormatException e){
                    value = defaultValue;
                }
            }
        }
        return value;
    }

    //转换为Boolean类型
    public static boolean castBoolean(Object obj){

        return castBoolean(obj,false);
    }

    //转换为Boolean类型(可指定默认值)
    public static boolean castBoolean(Object obj,boolean defaultValue){
        boolean value = defaultValue;
        if (obj != null){
            value = Boolean.parseBoolean(castString(obj));
        }
        return value;
    }
}
