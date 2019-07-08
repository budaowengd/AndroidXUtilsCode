package com.blankj.utilcode.util;

/**
 * author: luoXiong
 * e-mail: 382060748@qq.com
 * date: 2019/7/8 16:13
 * version: 1.0
 * desc:
 */
public class NumberUtils {
    /**
     * 将字符串转Int类型
     */
    public static int getInt(String value) {
        int count = 0;
        try {
            count = Integer.parseInt(value);
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
        try {
            count = Double.parseDouble(value);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return count;
    }
}
