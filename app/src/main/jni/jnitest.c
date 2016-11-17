#include "com_lcy_aspire_utils_JniUtils.h"
//
// Created by liucy01 on 2016/11/17.
//

JNIEXPORT jstring JNICALL Java_com_lcy_aspire_utils_JniUtils_getCLanguageString
        (JNIEnv *env, jobject obj){
    return (*env)->NewStringUTF(env,"This just a test for Android Studio NDK JNI developer!");
}