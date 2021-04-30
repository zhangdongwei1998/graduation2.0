package com.example.myapp.activity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.myapp.HomeMenuActivity;
import com.example.myapp.R;
import com.example.myapp.api.Api;
import com.example.myapp.api.ApiConfig;
import com.example.myapp.api.TtitCallback;
import com.example.myapp.entity.LoginResponse;
import com.example.myapp.util.StringUtils;
import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class LoginActivity extends BaseActivity {

    private EditText etAccount;
    private EditText etPwd;
    private Button btnLogin;
    private Map<String, Object> map;
    String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etAccount=findViewById(R.id.et_account);
        etPwd=findViewById(R.id.et_pwd);
        btnLogin=findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String account=etAccount.getText().toString().trim();
                String pwd=etPwd.getText().toString().trim();
                try {
                    login(account,pwd);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if(map!=null&&map.get("msg").equals("OK")){
                    //登录成功
                    navigateTo(HomeMenuActivity.class);
                    showToast("登录成功");
                    finish();
                }else{
                    showToast("登录失败");
                }
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    e.printStackTrace();
                }
//                finish();
            }
        });
    }

    private void login(String account,String pwd) throws Exception{
        if(StringUtils.isEmpty(account)){
//            Toast.makeText(this,"请输入账号",Toast.LENGTH_SHORT).show();
            showToast("请输入账号");
            return;
        }
        if(StringUtils.isEmpty(pwd)){
//            Toast.makeText(this,"请输入密码",Toast.LENGTH_SHORT).show();
            showToast("请输入密码");
            return;
        }
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    OkHttpClient client = new OkHttpClient();
                    Request request = new Request.Builder()//
                            //.url("http://v.juhe.cn/toutiao/index?type=keji&key=3dab2e34c95bac14d7962e2eb09426fe")//
                            .url("http://192.168.3.66:8080/user/login?loginId="+account+"&password="+pwd)
                            .build();
                    Response response = client.newCall(request).execute();
                    data = response.body().string();
                    Log.i("login", "hello"+data);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
        Thread.sleep(1000);
        //Log.i("result", "sendRequest: "+data);
        map = parseJSON(data);
        Log.i("login", "hello"+map.get("msg"));



    }
    public static Map<String, Object> parseJSON(String data) {
        JSONObject jsonObject;
        try
        {
            jsonObject = new JSONObject(data); @SuppressWarnings("unchecked")
        Iterator<String> keyIter = jsonObject.keys();
            String key;
            Object value;
            Map<String, Object> valueMap = new HashMap<String, Object>();
            while (keyIter.hasNext())
            {
                key = (String) keyIter.next();
                value = jsonObject.get(key);
                valueMap.put(key, value);
            }
            return valueMap;
        }
        catch (JSONException e)
        {
            e.printStackTrace();
        }
        return null;
    }


}