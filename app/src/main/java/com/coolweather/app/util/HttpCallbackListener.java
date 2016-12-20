package com.coolweather.app.util;

/**
 * Created by Sevly on 2016/12/20.
 */

public interface HttpCallbackListener {

    void onFinish(String response);

    void onError(Exception e);

}
