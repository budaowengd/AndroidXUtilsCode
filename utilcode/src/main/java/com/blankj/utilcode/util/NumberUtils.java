package com.blankj.utilcode.util;

import android.text.TextUtils;

import java.util.regex.Pattern;

/**
 * author: luoXiong
 * e-mail: 382060748@qq.com
 * date: 2019/7/8 16:13
 * version: 1.0
 * desc: 数字相关
 */
public class NumberUtils {

    /**
     * 将字符串转Int类型
     */
    public static int getInt(String value) {
        int count = 0;
        if (TextUtils.isEmpty(value)) {
            return count;
        }
        try {
            count = Integer.parseInt(value);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return count;
    }

    /**
     * 将字符串转Long类型
     */
    public static long getLong(String value) {
        long count = 0L;
        if (TextUtils.isEmpty(value)) {
            return count;
        }
        try {
            count = Long.parseLong(value);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return count;
    }


    /**
     * 将字符串转Float类型
     */
    public static float getFloat(String value) {
        float count = 0.0f;
        if (TextUtils.isEmpty(value)) {
            return count;
        }
        try {
            count = Float.parseFloat(value);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return count;
    }

    /**
     * 将字符串转Integer类型
     */
    public static double getDouble(String value) {
        double count = 0.0;
        if (TextUtils.isEmpty(value)) {
            return count;
        }
        try {
            count = Double.parseDouble(value);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return count;
    }


    /**
     * 获取字符串中的书数字
     */
    public static int getIntByText(String text) {
        String regEx = "[^0-9]";
        Pattern p = Pattern.compile(regEx);
        String value = p.matcher(text).replaceAll("").trim();
        return getInt(value);
    }

}
