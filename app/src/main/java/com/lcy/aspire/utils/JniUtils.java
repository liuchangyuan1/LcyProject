package com.lcy.aspire.utils;

/**
 * Created by liucy01 on 2016/11/17.
 */
public class JniUtils {
    static {
        System.loadLibrary("YanboberJniLibName");   //defaultConfig.ndk.moduleName
    }
    public native String getCLanguageString();

}
