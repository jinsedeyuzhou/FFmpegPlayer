#include <jni.h>
#include <string.h>

JNIEXPORT jstring JNICALL
Java_com_ebrightmoon_ffmpeg_FFmpegPlayer_stringFromJNI(JNIEnv *env, jobject thiz) {
   char *str ="Hello from C";
    return (*env)->NewStringUTF(env, str);
}