package com.rmsz.rmszclient.Base;

import java.util.Iterator;
import java.util.Map;

/**
 * Created by witt on 16/12/3.
 */

public class BaseInfo {
    public static final String SHARE_FILE_NAME = "share_data";//未使用，直接定义在了SPUtils中
    public static final String API_SERVER_URL = "http://192.168.0.20/wish/index.php/Api/Api/";
    public static final String SHARE_KEY_TOKEN =  "loginToken";
    public static final String SHARE_KEY_USERNAME = "username";
    public static final String SHARE_KEY_PASSWORD = "md5pwd";


    public static String genApiUrl(String funcName, String token, Map params) {
        String url = API_SERVER_URL + funcName;
        if (token != "" && token != null) {
            url += "?token=" + token;
        }
        if (params != null && params.size() > 0){
            for (Iterator it = params.entrySet().iterator(); it.hasNext(); ) {
                Map.Entry e = (Map.Entry) it.next();
                url = url + "&" + e.getKey() + "=" + e.getValue();
            }
        }
        return url;
    }
}
