package com.open.net.client.utils;

/**
 * author       :   long
 * created on   :   2017/11/30
 * description  :  字符工具类
 */
public final class KeyUtil {

    public static String getKey(String mHost, int mPort){
        return mHost + ":"+ mPort;
    }
}
