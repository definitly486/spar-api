package com.google.android.gms.auth;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import modern.payments.ecomAndroid.presentation.fragment.paymentSbp.EcomSbpViewModel;
import modern.payments.ecomAndroid.util.interceptor.impl.HostSelectionInterceptorImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class CookieUtil {
    private CookieUtil() {
    }

    public static String getCookieUrl(String str, Boolean bool) {
        Preconditions.checkNotEmpty(str);
        return (true != zza(bool) ? HostSelectionInterceptorImpl.PROTOCOL_HTTP : HostSelectionInterceptorImpl.PROTOCOL_HTTPS) + EcomSbpViewModel.SCHEMA_DIVIDER + str;
    }

    public static String getCookieValue(String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, Long l13) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb3 = new StringBuilder(str);
        sb3.append('=');
        if (!TextUtils.isEmpty(str2)) {
            sb3.append(str2);
        }
        if (zza(bool)) {
            sb3.append(";HttpOnly");
        }
        if (zza(bool2)) {
            sb3.append(";Secure");
        }
        if (!TextUtils.isEmpty(str3)) {
            sb3.append(";Domain=");
            sb3.append(str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            sb3.append(";Path=");
            sb3.append(str4);
        }
        if (l13 != null && l13.longValue() > 0) {
            sb3.append(";Max-Age=");
            sb3.append(l13);
        }
        if (!TextUtils.isEmpty(null)) {
            sb3.append(";Priority=null");
        }
        if (!TextUtils.isEmpty(null)) {
            sb3.append(";SameSite=null");
        }
        if (zza(null)) {
            sb3.append(";SameParty");
        }
        return sb3.toString();
    }

    private static boolean zza(Boolean bool) {
        return bool != null && bool.booleanValue();
    }
}
