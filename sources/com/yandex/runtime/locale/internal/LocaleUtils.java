package com.yandex.runtime.locale.internal;

import com.yandex.runtime.Runtime;

/* JADX INFO: loaded from: classes3.dex */
public class LocaleUtils {
    public static String getCountry() {
        return Runtime.getApplicationContext().getResources().getConfiguration().locale.getCountry();
    }

    public static String getSysLanguage() {
        return Runtime.getApplicationContext().getResources().getConfiguration().locale.getLanguage();
    }
}
