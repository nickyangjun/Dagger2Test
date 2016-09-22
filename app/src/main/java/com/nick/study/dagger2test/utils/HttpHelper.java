package com.nick.study.dagger2test.utils;


import java.io.IOException;

import javax.inject.Inject;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by yangjun1 on 2016/9/22.
 */
public class HttpHelper {
    @Inject //需要依赖注入
    OkHttpClient client;

    private HttpHelper(){
        //这里进行注入
        DaggerHttpHelperComponent.builder().build().inject(this);
    }

    public static HttpHelper getInstance(){
        return Holder.httpHelper;
    }

    private static class Holder{
        public  static HttpHelper httpHelper = new HttpHelper();
    }

    public void get(String url, final Listener listener){
        final Request request = new Request.Builder()
                .url(url)
                .build();
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                listener.onFailed();
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                final String s = response.body().string();
                listener.onSuccess(s);
            }
        });
    }

    public interface Listener{
        void onSuccess(String response);
        void onFailed();
    }
}
