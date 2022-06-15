package com.tongyangsheng.pangolin;

import com.bytedance.sdk.openadsdk.TTCustomController;
import com.bytedance.sdk.openadsdk.TTLocation;

public class CustomPrivacyController extends TTCustomController {
    // 是否允许SDK主动使用地理位置信息
    @Override
    public boolean isCanUseLocation() {
        return false;
    }

    @Override
    public TTLocation getTTLocation() {
        return null;
    }

    // 是否允许SDK主动获取设备上应用安装列表的采集权限
    @Override
    public boolean alist() {
        return false;
    }

    // 是否允许SDK主动使用手机硬件参数，如：imei
    @Override
    public boolean isCanUsePhoneState() {
        return false;
    }

    @Override
    public String getDevImei() {
        return null;
    }

    // 是否允许SDK主动使用ACCESS_WIFI_STATE权限
    @Override
    public boolean isCanUseWifiState() {
        return false;
    }

    // 是否允许SDK主动使用WRITE_EXTERNAL_STORAGE权限
    @Override
    public boolean isCanUseWriteExternal() {
        return false;
    }

    @Override
    public String getDevOaid() {
        return null;
    }
}
