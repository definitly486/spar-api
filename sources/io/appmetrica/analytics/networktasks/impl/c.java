package io.appmetrica.analytics.networktasks.impl;

import android.net.Uri;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.util.interceptor.impl.HostSelectionInterceptorImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48805a;

    public c(String str) {
        this.f48805a = a(str);
    }

    public static String a(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        Uri uri = Uri.parse(str);
        return zdlpuopuiu.eablkybsjg(HostSelectionInterceptorImpl.PROTOCOL_HTTP, uri.getScheme()) ? uri.buildUpon().scheme(HostSelectionInterceptorImpl.PROTOCOL_HTTPS).build().toString() : str;
    }
}
