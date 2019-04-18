package com.blankj.utilcode.util;

import android.content.res.Resources;

/**
 * @author: luoXiong
 * @date: 2019/4/18 14:28
 * @version: 1.0
 * @desc:
 */
public class DpConst {
    public static final float dp1 = Resources.getSystem().getDisplayMetrics().density;
    public static final int dp2 = (int) (dp1 * 2);
    public static final int dp3 = (int) (dp1 * 3);
    public static final int dp4 = dp2 * 2;
    public static final int dp5 = (int) (dp1 * 5);
    public static final int dp6 = dp2 * 3;
    public static final int dp7 = (int) (dp1 * 7);
    public static final int dp8 = dp2 * 4;
    public static final int dp9 = (int) (dp1 * 9);
    public static final int dp10 = dp2 * 5;
    public static final int dp12 = dp2 * 6;
    public static final int dp16 = dp2 * 8;
    public static final int dp24 = dp2 * 12;
    public static final int dp36 = dp12 * 3;
}
