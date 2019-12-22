package com.blankj.utilcode.util;

import android.content.SharedPreferences;
import android.support.annotation.NonNull;

import java.util.Map;
import java.util.Set;

/**
 * <pre>
 *     author: Blankj
 *     blog  : http://blankj.com
 *     time  : 2019/01/04
 *     desc  : utils about shared preference
 * </pre>
 */
public final class SPStaticUtils {

    private static SPUtils sDefaultSPUtils;

    /**
     * Set the default instance of {@link SPUtils}.
     *
     * @param spUtils The default instance of {@link SPUtils}.
     */
    public static void setDefaultSPUtils(final SPUtils spUtils) {
        sDefaultSPUtils = spUtils;
    }

    /**
     * 保存一个Map到默认的sp种
     */
    public static void put(Map<String, Object> params) {
        getDefaultSPUtils().put(params, false);
    }

    /**
     * 保存一个Map到默认的sp种
     */
    public static void put(Map<String, Object> params, boolean isCommit) {
        getDefaultSPUtils().put(params, isCommit);
    }

    /**
     * 保存单个数据到默认的Sp中. 默认的sp名字是空字符串
     */
    public static void put(String key, Object value) {
        if (value != null) {
            String type = value.getClass().getSimpleName();
            if ("String".equals(type)) {
                put(key, (String) value, getDefaultSPUtils());
            } else if ("Integer".equals(type)) {
                put(key, (Integer) value, getDefaultSPUtils());
            } else if ("Boolean".equals(type)) {
                put(key, (Boolean) value, getDefaultSPUtils());
            } else if ("Float".equals(type)) {
                put(key, (Float) value, getDefaultSPUtils());
            } else if ("Long".equals(type)) {
                put(key, (Long) value, getDefaultSPUtils());
            } else if (type.contains("Set")) {
                put(key, (Set<String>) value, getDefaultSPUtils());
            }
        }
    }

    /**
     * 保存单个数据到默认的Sp中. 默认的sp名字是空字符串
     */
    public static void put(String key, Object value, boolean isCommit) {
        if (value != null) {
            String type = value.getClass().getSimpleName();
            if ("String".equals(type)) {
                put(key, (String) value, isCommit, getDefaultSPUtils());
            } else if ("Integer".equals(type)) {
                put(key, (Integer) value, isCommit, getDefaultSPUtils());
            } else if ("Boolean".equals(type)) {
                put(key, (Boolean) value, isCommit, getDefaultSPUtils());
            } else if ("Float".equals(type)) {
                put(key, (Float) value, isCommit, getDefaultSPUtils());
            } else if ("Long".equals(type)) {
                put(key, (Long) value, isCommit, getDefaultSPUtils());
            } else if (type.contains("Set")) {
                put(key, (Set<String>) value, isCommit, getDefaultSPUtils());
            }
        }
    }

    /**
     * Put the string value in sp.
     *
     * @param key   The key of sp.
     * @param value The value of sp.
     */
    public static void put(@NonNull final String key, final String value) {
        put(key, value, getDefaultSPUtils());
    }

    /**
     * Put the string value in sp.
     *
     * @param key      The key of sp.
     * @param value    The value of sp.
     * @param isCommit True to use {@link SharedPreferences.Editor#commit()},
     *                 false to use {@link SharedPreferences.Editor#apply()}
     */
    public static void put(@NonNull final String key, final String value, final boolean isCommit) {
        put(key, value, isCommit, getDefaultSPUtils());
    }


    /**
     * Return the string value in sp.
     *
     * @param key The key of sp.
     * @return the string value if sp exists or {@code ""} otherwise
     */
    public static String getString(@NonNull final String key) {
        return getString(key, getDefaultSPUtils());
    }

    /**
     * Return the string value in sp.
     *
     * @param key          The key of sp.
     * @param defaultValue The default value if the sp doesn't exist.
     * @return the string value if sp exists or {@code defaultValue} otherwise
     */
    public static String getString(@NonNull final String key, final String defaultValue) {
        return getString(key, defaultValue, getDefaultSPUtils());
    }


    /**
     * Put the int value in sp.
     *
     * @param key   The key of sp.
     * @param value The value of sp.
     */
    public static void put(@NonNull final String key, final int value) {
        put(key, value, getDefaultSPUtils());
    }

    /**
     * Put the int value in sp.
     *
     * @param key      The key of sp.
     * @param value    The value of sp.
     * @param isCommit True to use {@link SharedPreferences.Editor#commit()},
     *                 false to use {@link SharedPreferences.Editor#apply()}
     */
    public static void put(@NonNull final String key, final int value, final boolean isCommit) {
        put(key, value, isCommit, getDefaultSPUtils());
    }

    /**
     * Return the int value in sp.
     *
     * @param key The key of sp.
     * @return the int value if sp exists or {@code -1} otherwise
     */
    public static int getInt(@NonNull final String key) {
        return getInt(key, getDefaultSPUtils());
    }

    /**
     * Return the int value in sp.
     *
     * @param key          The key of sp.
     * @param defaultValue The default value if the sp doesn't exist.
     * @return the int value if sp exists or {@code defaultValue} otherwise
     */
    public static int getInt(@NonNull final String key, final int defaultValue) {
        return getInt(key, defaultValue, getDefaultSPUtils());
    }

    /**
     * Put the long value in sp.
     *
     * @param key   The key of sp.
     * @param value The value of sp.
     */
    public static void put(@NonNull final String key, final long value) {
        put(key, value, getDefaultSPUtils());
    }

    /**
     * Put the long value in sp.
     *
     * @param key      The key of sp.
     * @param value    The value of sp.
     * @param isCommit True to use {@link SharedPreferences.Editor#commit()},
     *                 false to use {@link SharedPreferences.Editor#apply()}
     */
    public static void put(@NonNull final String key, final long value, final boolean isCommit) {
        put(key, value, isCommit, getDefaultSPUtils());
    }

    /**
     * Return the long value in sp.
     *
     * @param key The key of sp.
     * @return the long value if sp exists or {@code -1} otherwise
     */
    public static long getLong(@NonNull final String key) {
        return getLong(key, getDefaultSPUtils());
    }

    /**
     * Return the long value in sp.
     *
     * @param key          The key of sp.
     * @param defaultValue The default value if the sp doesn't exist.
     * @return the long value if sp exists or {@code defaultValue} otherwise
     */
    public static long getLong(@NonNull final String key, final long defaultValue) {
        return getLong(key, defaultValue, getDefaultSPUtils());
    }

    /**
     * Put the float value in sp.
     *
     * @param key   The key of sp.
     * @param value The value of sp.
     */
    public static void put(@NonNull final String key, final float value) {
        put(key, value, getDefaultSPUtils());
    }

    /**
     * Put the float value in sp.
     *
     * @param key      The key of sp.
     * @param value    The value of sp.
     * @param isCommit True to use {@link SharedPreferences.Editor#commit()},
     *                 false to use {@link SharedPreferences.Editor#apply()}
     */
    public static void put(@NonNull final String key, final float value, final boolean isCommit) {
        put(key, value, isCommit, getDefaultSPUtils());
    }

    /**
     * Return the float value in sp.
     *
     * @param key The key of sp.
     * @return the float value if sp exists or {@code -1f} otherwise
     */
    public static float getFloat(@NonNull final String key) {
        return getFloat(key, getDefaultSPUtils());
    }

    /**
     * Return the float value in sp.
     *
     * @param key          The key of sp.
     * @param defaultValue The default value if the sp doesn't exist.
     * @return the float value if sp exists or {@code defaultValue} otherwise
     */
    public static float getFloat(@NonNull final String key, final float defaultValue) {
        return getFloat(key, defaultValue, getDefaultSPUtils());
    }

    /**
     * Put the boolean value in sp.
     *
     * @param key   The key of sp.
     * @param value The value of sp.
     */
    public static void put(@NonNull final String key, final boolean value) {
        put(key, value, getDefaultSPUtils());
    }

    /**
     * Put the boolean value in sp.
     *
     * @param key      The key of sp.
     * @param value    The value of sp.
     * @param isCommit True to use {@link SharedPreferences.Editor#commit()},
     *                 false to use {@link SharedPreferences.Editor#apply()}
     */
    public static void put(@NonNull final String key, final boolean value, final boolean isCommit) {
        put(key, value, isCommit, getDefaultSPUtils());
    }

    /**
     * Return the boolean value in sp.
     *
     * @param key The key of sp.
     * @return the boolean value if sp exists or {@code false} otherwise
     */
    public static boolean getBoolean(@NonNull final String key) {
        return getBoolean(key, getDefaultSPUtils());
    }

    /**
     * Return the boolean value in sp.
     *
     * @param key          The key of sp.
     * @param defaultValue The default value if the sp doesn't exist.
     * @return the boolean value if sp exists or {@code defaultValue} otherwise
     */
    public static boolean getBoolean(@NonNull final String key, final boolean defaultValue) {
        return getBoolean(key, defaultValue, getDefaultSPUtils());
    }

    /**
     * Put the set of string value in sp.
     *
     * @param key   The key of sp.
     * @param value The value of sp.
     */
    public static void put(@NonNull final String key, final Set<String> value) {
        put(key, value, getDefaultSPUtils());
    }

    /**
     * Put the set of string value in sp.
     *
     * @param key      The key of sp.
     * @param value    The value of sp.
     * @param isCommit True to use {@link SharedPreferences.Editor#commit()},
     *                 false to use {@link SharedPreferences.Editor#apply()}
     */
    public static void put(@NonNull final String key, final Set<String> value, final boolean isCommit) {
        put(key, value, isCommit, getDefaultSPUtils());
    }

    /**
     * Return the set of string value in sp.
     *
     * @param key The key of sp.
     * @return the set of string value if sp exists
     * or {@code Collections.<String>emptySet()} otherwise
     */
    public static Set<String> getStringSet(@NonNull final String key) {
        return getStringSet(key, getDefaultSPUtils());
    }

    /**
     * Return the set of string value in sp.
     *
     * @param key          The key of sp.
     * @param defaultValue The default value if the sp doesn't exist.
     * @return the set of string value if sp exists or {@code defaultValue} otherwise
     */
    public static Set<String> getStringSet(@NonNull final String key, final Set<String> defaultValue) {
        return getStringSet(key, defaultValue, getDefaultSPUtils());
    }

    /**
     * Return all values in sp.
     *
     * @return all values in sp
     */
    public static Map<String, ?> getAll() {
        return getAll(getDefaultSPUtils());
    }

    /**
     * Return whether the sp contains the preference.
     *
     * @param key The key of sp.
     * @return {@code true}: yes<br>{@code false}: no
     */
    public static boolean contains(@NonNull final String key) {
        return contains(key, getDefaultSPUtils());
    }

    /**
     * Remove the preference in sp.
     *
     * @param key The key of sp.
     */
    public static void remove(@NonNull final String key) {
        remove(key, getDefaultSPUtils());
    }

    /**
     * Remove the preference in sp.
     *
     * @param key      The key of sp.
     * @param isCommit True to use {@link SharedPreferences.Editor#commit()},
     *                 false to use {@link SharedPreferences.Editor#apply()}
     */
    public static void remove(@NonNull final String key, final boolean isCommit) {
        remove(key, isCommit, getDefaultSPUtils());
    }

    /**
     * Remove all preferences in sp.
     */
    public static void clear() {
        clear(getDefaultSPUtils());
    }

    /**
     * Remove all preferences in sp.
     *
     * @param isCommit True to use {@link SharedPreferences.Editor#commit()},
     *                 false to use {@link SharedPreferences.Editor#apply()}
     */
    public static void clear(final boolean isCommit) {
        clear(isCommit, getDefaultSPUtils());
    }

    ///////////////////////////////////////////////////////////////////////////
    // dividing line
    ///////////////////////////////////////////////////////////////////////////

    /**
     * Put the string value in sp.
     *
     * @param key     The key of sp.
     * @param value   The value of sp.
     * @param spUtils The instance of {@link SPUtils}.
     */
    public static void put(@NonNull final String key, final String value, @NonNull final SPUtils spUtils) {
        spUtils.put(key, value);
    }

    /**
     * Put the string value in sp.
     *
     * @param key      The key of sp.
     * @param value    The value of sp.
     * @param isCommit True to use {@link SharedPreferences.Editor#commit()},
     *                 false to use {@link SharedPreferences.Editor#apply()}
     * @param spUtils  The instance of {@link SPUtils}.
     */
    public static void put(@NonNull final String key, final String value, final boolean isCommit, @NonNull final SPUtils spUtils) {
        spUtils.put(key, value, isCommit);
    }


    /**
     * Return the string value in sp.
     *
     * @param key     The key of sp.
     * @param spUtils The instance of {@link SPUtils}.
     * @return the string value if sp exists or {@code ""} otherwise
     */
    public static String getString(@NonNull final String key, @NonNull final SPUtils spUtils) {
        return spUtils.getString(key);
    }

    /**
     * Return the string value in sp.
     *
     * @param key          The key of sp.
     * @param defaultValue The default value if the sp doesn't exist.
     * @param spUtils      The instance of {@link SPUtils}.
     * @return the string value if sp exists or {@code defaultValue} otherwise
     */
    public static String getString(@NonNull final String key, final String defaultValue, @NonNull final SPUtils spUtils) {
        return spUtils.getString(key, defaultValue);
    }


    /**
     * Put the int value in sp.
     *
     * @param key     The key of sp.
     * @param value   The value of sp.
     * @param spUtils The instance of {@link SPUtils}.
     */
    public static void put(@NonNull final String key, final int value, @NonNull final SPUtils spUtils) {
        spUtils.put(key, value);
    }

    /**
     * Put the int value in sp.
     *
     * @param key      The key of sp.
     * @param value    The value of sp.
     * @param isCommit True to use {@link SharedPreferences.Editor#commit()},
     *                 false to use {@link SharedPreferences.Editor#apply()}
     * @param spUtils  The instance of {@link SPUtils}.
     */
    public static void put(@NonNull final String key, final int value, final boolean isCommit, @NonNull final SPUtils spUtils) {
        spUtils.put(key, value, isCommit);
    }

    /**
     * Return the int value in sp.
     *
     * @param key     The key of sp.
     * @param spUtils The instance of {@link SPUtils}.
     * @return the int value if sp exists or {@code -1} otherwise
     */
    public static int getInt(@NonNull final String key, @NonNull final SPUtils spUtils) {
        return spUtils.getInt(key);
    }

    /**
     * Return the int value in sp.
     *
     * @param key          The key of sp.
     * @param defaultValue The default value if the sp doesn't exist.
     * @param spUtils      The instance of {@link SPUtils}.
     * @return the int value if sp exists or {@code defaultValue} otherwise
     */
    public static int getInt(@NonNull final String key, final int defaultValue, @NonNull final SPUtils spUtils) {
        return spUtils.getInt(key, defaultValue);
    }

    /**
     * Put the long value in sp.
     *
     * @param key     The key of sp.
     * @param value   The value of sp.
     * @param spUtils The instance of {@link SPUtils}.
     */
    public static void put(@NonNull final String key, final long value, @NonNull final SPUtils spUtils) {
        spUtils.put(key, value);
    }

    /**
     * Put the long value in sp.
     *
     * @param key      The key of sp.
     * @param value    The value of sp.
     * @param isCommit True to use {@link SharedPreferences.Editor#commit()},
     *                 false to use {@link SharedPreferences.Editor#apply()}
     * @param spUtils  The instance of {@link SPUtils}.
     */
    public static void put(@NonNull final String key, final long value, final boolean isCommit, @NonNull final SPUtils spUtils) {
        spUtils.put(key, value, isCommit);
    }

    /**
     * Return the long value in sp.
     *
     * @param key     The key of sp.
     * @param spUtils The instance of {@link SPUtils}.
     * @return the long value if sp exists or {@code -1} otherwise
     */
    public static long getLong(@NonNull final String key, @NonNull final SPUtils spUtils) {
        return spUtils.getLong(key);
    }

    /**
     * Return the long value in sp.
     *
     * @param key          The key of sp.
     * @param defaultValue The default value if the sp doesn't exist.
     * @param spUtils      The instance of {@link SPUtils}.
     * @return the long value if sp exists or {@code defaultValue} otherwise
     */
    public static long getLong(@NonNull final String key, final long defaultValue, @NonNull final SPUtils spUtils) {
        return spUtils.getLong(key, defaultValue);
    }

    /**
     * Put the float value in sp.
     *
     * @param key     The key of sp.
     * @param value   The value of sp.
     * @param spUtils The instance of {@link SPUtils}.
     */
    public static void put(@NonNull final String key, final float value, @NonNull final SPUtils spUtils) {
        spUtils.put(key, value);
    }

    /**
     * Put the float value in sp.
     *
     * @param key      The key of sp.
     * @param value    The value of sp.
     * @param isCommit True to use {@link SharedPreferences.Editor#commit()},
     *                 false to use {@link SharedPreferences.Editor#apply()}
     * @param spUtils  The instance of {@link SPUtils}.
     */
    public static void put(@NonNull final String key, final float value, final boolean isCommit, @NonNull final SPUtils spUtils) {
        spUtils.put(key, value, isCommit);
    }

    /**
     * Return the float value in sp.
     *
     * @param key     The key of sp.
     * @param spUtils The instance of {@link SPUtils}.
     * @return the float value if sp exists or {@code -1f} otherwise
     */
    public static float getFloat(@NonNull final String key, @NonNull final SPUtils spUtils) {
        return spUtils.getFloat(key);
    }

    /**
     * Return the float value in sp.
     *
     * @param key          The key of sp.
     * @param defaultValue The default value if the sp doesn't exist.
     * @param spUtils      The instance of {@link SPUtils}.
     * @return the float value if sp exists or {@code defaultValue} otherwise
     */
    public static float getFloat(@NonNull final String key, final float defaultValue, @NonNull final SPUtils spUtils) {
        return spUtils.getFloat(key, defaultValue);
    }

    /**
     * Put the boolean value in sp.
     *
     * @param key     The key of sp.
     * @param value   The value of sp.
     * @param spUtils The instance of {@link SPUtils}.
     */
    public static void put(@NonNull final String key, final boolean value, @NonNull final SPUtils spUtils) {
        spUtils.put(key, value);
    }

    /**
     * Put the boolean value in sp.
     *
     * @param key      The key of sp.
     * @param value    The value of sp.
     * @param isCommit True to use {@link SharedPreferences.Editor#commit()},
     *                 false to use {@link SharedPreferences.Editor#apply()}
     * @param spUtils  The instance of {@link SPUtils}.
     */
    public static void put(@NonNull final String key, final boolean value, final boolean isCommit, @NonNull final SPUtils spUtils) {
        spUtils.put(key, value, isCommit);
    }

    /**
     * Return the boolean value in sp.
     *
     * @param key     The key of sp.
     * @param spUtils The instance of {@link SPUtils}.
     * @return the boolean value if sp exists or {@code false} otherwise
     */
    public static boolean getBoolean(@NonNull final String key, @NonNull final SPUtils spUtils) {
        return spUtils.getBoolean(key);
    }

    /**
     * Return the boolean value in sp.
     *
     * @param key          The key of sp.
     * @param defaultValue The default value if the sp doesn't exist.
     * @param spUtils      The instance of {@link SPUtils}.
     * @return the boolean value if sp exists or {@code defaultValue} otherwise
     */
    public static boolean getBoolean(@NonNull final String key, final boolean defaultValue, @NonNull final SPUtils spUtils) {
        return spUtils.getBoolean(key, defaultValue);
    }

    /**
     * Put the set of string value in sp.
     *
     * @param key     The key of sp.
     * @param value   The value of sp.
     * @param spUtils The instance of {@link SPUtils}.
     */
    public static void put(@NonNull final String key, final Set<String> value, @NonNull final SPUtils spUtils) {
        spUtils.put(key, value);
    }

    /**
     * Put the set of string value in sp.
     *
     * @param key      The key of sp.
     * @param value    The value of sp.
     * @param isCommit True to use {@link SharedPreferences.Editor#commit()},
     *                 false to use {@link SharedPreferences.Editor#apply()}
     * @param spUtils  The instance of {@link SPUtils}.
     */
    public static void put(@NonNull final String key, final Set<String> value, final boolean isCommit, @NonNull final SPUtils spUtils) {
        spUtils.put(key, value, isCommit);
    }

    /**
     * Return the set of string value in sp.
     *
     * @param key     The key of sp.
     * @param spUtils The instance of {@link SPUtils}.
     * @return the set of string value if sp exists
     * or {@code Collections.<String>emptySet()} otherwise
     */
    public static Set<String> getStringSet(@NonNull final String key, @NonNull final SPUtils spUtils) {
        return spUtils.getStringSet(key);
    }

    /**
     * Return the set of string value in sp.
     *
     * @param key          The key of sp.
     * @param defaultValue The default value if the sp doesn't exist.
     * @param spUtils      The instance of {@link SPUtils}.
     * @return the set of string value if sp exists or {@code defaultValue} otherwise
     */
    public static Set<String> getStringSet(@NonNull final String key, final Set<String> defaultValue, @NonNull final SPUtils spUtils) {
        return spUtils.getStringSet(key, defaultValue);
    }

    /**
     * Return all values in sp.
     *
     * @param spUtils The instance of {@link SPUtils}.
     * @return all values in sp
     */
    public static Map<String, ?> getAll(@NonNull final SPUtils spUtils) {
        return spUtils.getAll();
    }

    /**
     * Return whether the sp contains the preference.
     *
     * @param key     The key of sp.
     * @param spUtils The instance of {@link SPUtils}.
     * @return {@code true}: yes<br>{@code false}: no
     */
    public static boolean contains(@NonNull final String key, @NonNull final SPUtils spUtils) {
        return spUtils.contains(key);
    }

    /**
     * Remove the preference in sp.
     *
     * @param key     The key of sp.
     * @param spUtils The instance of {@link SPUtils}.
     */
    public static void remove(@NonNull final String key, @NonNull final SPUtils spUtils) {
        spUtils.remove(key);
    }

    /**
     * Remove the preference in sp.
     *
     * @param key      The key of sp.
     * @param isCommit True to use {@link SharedPreferences.Editor#commit()},
     *                 false to use {@link SharedPreferences.Editor#apply()}
     * @param spUtils  The instance of {@link SPUtils}.
     */
    public static void remove(@NonNull final String key, final boolean isCommit, @NonNull final SPUtils spUtils) {
        spUtils.remove(key, isCommit);
    }

    /**
     * Remove all preferences in sp.
     *
     * @param spUtils The instance of {@link SPUtils}.
     */
    public static void clear(@NonNull final SPUtils spUtils) {
        spUtils.clear();
    }

    /**
     * Remove all preferences in sp.
     *
     * @param isCommit True to use {@link SharedPreferences.Editor#commit()},
     *                 false to use {@link SharedPreferences.Editor#apply()}
     * @param spUtils  The instance of {@link SPUtils}.
     */
    public static void clear(final boolean isCommit, @NonNull final SPUtils spUtils) {
        spUtils.clear(isCommit);
    }

    private static SPUtils getDefaultSPUtils() {
        return sDefaultSPUtils != null ? sDefaultSPUtils : SPUtils.getInstance();
    }
}