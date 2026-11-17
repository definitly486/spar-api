package io.appmetrica.analytics.coreutils.internal;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class WrapUtils {
    public static double getFiniteDoubleOrDefault(double d13, double d14) {
        return Double.isFinite(d13) ? d13 : d14;
    }

    public static long getMillisOrDefault(Long l13, TimeUnit timeUnit, long j13) {
        return l13 == null ? j13 : timeUnit.toMillis(l13.longValue());
    }

    public static <T> T getOrDefault(T t13, T t14) {
        return t13 == null ? t14 : t13;
    }

    public static String getOrDefaultIfEmpty(String str, String str2) {
        return TextUtils.isEmpty(str) ? str2 : str;
    }

    public static <T> T getOrDefaultNullable(T t13, T t14) {
        return t13 == null ? t14 : t13;
    }

    public static String getOrDefaultNullableIfEmpty(String str, String str2) {
        return TextUtils.isEmpty(str) ? str2 : str;
    }

    public static <T> String wrapToTag(T t13) {
        if (t13 == null) {
            return "<null>";
        }
        return t13.toString().isEmpty() ? "<empty>" : t13.toString();
    }
}
