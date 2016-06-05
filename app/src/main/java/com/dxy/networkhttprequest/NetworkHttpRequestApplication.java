package com.dxy.networkhttprequest;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.zhy.http.okhttp.OkHttpUtils;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;

/**
 * Created by dangxueyi on 16/6/4.
 */
public class NetworkHttpRequestApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        initData();
    }
    private void initData(){

        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .connectTimeout(10000L, TimeUnit.MILLISECONDS)
                .readTimeout(10000L, TimeUnit.MILLISECONDS)
                //其他配置
                .build();

        OkHttpUtils.initClient(okHttpClient);

        Fresco.initialize(getApplicationContext());
    }
}
