package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class M6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile String f46227a;

    public static String a() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            return (String) cls.getMethod("getProcessName", null).invoke(cls.getMethod("currentActivityThread", null).invoke(null, null), null);
        } catch (Throwable th2) {
            throw new RuntimeException(th2);
        }
    }

    public final String b() {
        if (this.f46227a != null) {
            return this.f46227a;
        }
        synchronized (this) {
            try {
                if (this.f46227a == null) {
                    this.f46227a = a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this.f46227a;
    }

    public final boolean c() {
        try {
            return (TextUtils.isEmpty(b()) || b().contains(StringUtils.PROCESS_POSTFIX_DELIMITER)) ? false : true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public final boolean a(String str) {
        try {
            if (TextUtils.isEmpty(b())) {
                return false;
            }
            String strB = b();
            StringBuilder sb3 = new StringBuilder(StringUtils.PROCESS_POSTFIX_DELIMITER);
            sb3.append(str);
            return strB.endsWith(sb3.toString());
        } catch (Throwable unused) {
            return false;
        }
    }
}
