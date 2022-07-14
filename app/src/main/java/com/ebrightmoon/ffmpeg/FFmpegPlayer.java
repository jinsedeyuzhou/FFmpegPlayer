package com.ebrightmoon.ffmpeg;

/**
 * Time: 2022/7/14
 * Author:wyy
 * Description:
 */
public class FFmpegPlayer {
    private static final String TAG = FFmpegPlayer.class.getSimpleName();

    static {
        System.loadLibrary("ffmpeg");
    }

    /**
     * A native method that is implemented by the 'ffmpeg' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}
