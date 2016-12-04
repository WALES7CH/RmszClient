package com.rmsz.rmszclient.Base;

import android.content.Context;

import com.google.gson.Gson;
import com.rmsz.rmszclient.Beans.ReTokenBean;
import com.rmsz.rmszclient.Beans.User;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;
import com.zhy.utils.SPUtils;
import com.zhy.utils.T;

import okhttp3.Call;
import okhttp3.MediaType;
import zuo.biao.library.util.Json;
import zuo.biao.library.util.Log;

/**
 * Created by witt on 16/12/3.
 */

public class ReGetToken {
    private static String username;
    private static String password;
    private String token;


    public static void getToken(final Context context) {
        String url = BaseInfo.API_SERVER_URL + "reGenToken";
        username = (String) SPUtils.get(context, BaseInfo.SHARE_KEY_USERNAME, "");
        password = (String) SPUtils.get(context, BaseInfo.SHARE_KEY_PASSWORD, "");//MD5加密后的

        OkHttpUtils
                .postString()
                .url(url)
                .mediaType(MediaType.parse("application/json; charset=utf-8"))
                .content(new Gson().toJson(new User(username, password.toLowerCase())))
                .build().execute(new StringCallback() {
            @Override
            public void onError(Call call, Exception e, int id) {
                Log.e("regenToken", e.getMessage());
            }

            @Override
            public void onResponse(String response, int id) {
                Log.e("response", response);
                ReTokenBean token = Json.parseObject(response,ReTokenBean.class);
                switch (token.getStatus()){
                    case 200:
                        SPUtils.put(context,BaseInfo.SHARE_KEY_TOKEN,token.getData());
                        break;
                    default:
                        T.showShort(context,token.getStatus() + "::" + token.getMessage());
                        break;
                }
//
            }
        });
    }


}
