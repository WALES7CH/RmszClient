package com.rmsz.rmszclient.Activitys;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.rmsz.rmszclient.Base.BaseInfo;
import com.rmsz.rmszclient.Base.ReGetToken;
import com.rmsz.rmszclient.Beans.City;
import com.rmsz.rmszclient.R;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;
import com.zhy.utils.SPUtils;

import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;
import zuo.biao.library.util.Json;

public class MainActivity extends Activity implements View.OnClickListener {
    private static final String TAG = "MainActivity";

    private TextView mTvToken;
    private Spinner spinner;
    private List<String> data_list;
    private Button mBtnGetToken;
    private ArrayAdapter<String> arr_adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTvToken = (TextView) findViewById(R.id.main_tv_token);
        mBtnGetToken = (Button) findViewById(R.id.main_btn_getToken);
        initData();
        initListeners();
    }

    private void initListeners() {
        mBtnGetToken.setOnClickListener(this);
    }

    private void initData() {
        String token = (String) SPUtils.get(getApplicationContext(), BaseInfo.SHARE_KEY_TOKEN, "");
        mTvToken.setText(token);
        //返回API地址
        String url = BaseInfo.genApiUrl("getCitys", token, null);//API_SERVER_URL + API方法名

        Log.e(TAG, url);
        OkHttpUtils
                .get()
                .url(url)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {

                    }

                    @Override
                    public void onResponse(String response, int id) {
                        Log.e(TAG, response);
//                mTvToken.setText(response);
                        City citys = Json.parseObject(response, City.class);

                        spinner = (Spinner) findViewById(R.id.main_sp_citys);

                        //数据
                        data_list = new ArrayList<String>();
                        for (int i = 0; i < citys.getData().size(); i++) {
                            data_list.add(citys.getData().get(i).getName());
                        }

                        //适配器
                        arr_adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, data_list);
                        //设置样式
                        arr_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        //加载适配器
                        spinner.setAdapter(arr_adapter);
                    }
                });
    }

    @Override
    public void onClick(View v) {
        if (v == mBtnGetToken) {
            ReGetToken.getToken(this);
//            String token = (String) SPUtils.get(getApplicationContext(), BaseInfo.SHARE_KEY_TOKEN, "");
//            mTvToken.setText(token);
        }
    }
}
