package com.yandex.runtime.device;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.yandex.runtime.Runtime;

/* JADX INFO: loaded from: classes3.dex */
public class AppInfo {
    public static String appInfo(String str) {
        try {
            Context applicationContext = Runtime.getApplicationContext();
            Bundle bundle = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), UserVerificationMethods.USER_VERIFY_PATTERN).metaData;
            Object obj = bundle.get(str);
            if (obj == null) {
                return null;
            }
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue() ? "true" : "false";
            }
            if (obj instanceof Integer) {
                return String.valueOf((Integer) obj);
            }
            if (obj instanceof Float) {
                return String.valueOf((Float) obj);
            }
            if (obj instanceof Double) {
                return String.valueOf((Double) obj);
            }
            return obj instanceof Long ? String.valueOf((Long) obj) : bundle.getString(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
