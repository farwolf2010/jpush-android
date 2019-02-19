package com.farwolf.jpush.module;


import com.farwolf.weex.annotation.WeexModule;
import com.farwolf.weex.base.WXModuleBase;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.bridge.JSCallback;

import java.util.HashMap;

import cn.jpush.android.api.JPushInterface;

/**
 * @author xch
 * @version 1.0
 * @create_date 2018/4/20
 */
@WeexModule(name = "jpush")
public class JpushModule extends WXModuleBase {

    @JSMethod(uiThread =false)
    public String getJPushId(){
        return  JPushInterface.getRegistrationID(mWXSDKInstance.getContext());
    }

    @JSMethod
    public void regist(HashMap m, JSCallback callback){


        JPushInterface.setDebugMode(true); 	// 设置开启日志,发布时请关闭日志
        JPushInterface.init(getContext().getApplicationContext());     		// 初始化 JPush
    }

}
