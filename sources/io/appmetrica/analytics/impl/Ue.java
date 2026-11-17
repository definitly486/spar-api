package io.appmetrica.analytics.impl;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Ue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SafePackageManager f46612a = new SafePackageManager();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pe f46613b = new Pe();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Qe f46614c = new Qe();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Re f46615d = new Re(2);

    public static String a(Locale locale) {
        String language = locale.getLanguage();
        String country = locale.getCountry();
        StringBuilder sb3 = new StringBuilder(language);
        String script = locale.getScript();
        if (!TextUtils.isEmpty(script)) {
            sb3.append('-');
            sb3.append(script);
        }
        if (!TextUtils.isEmpty(country)) {
            sb3.append('_');
            sb3.append(country);
        }
        return sb3.toString();
    }

    public static Te a(ConnectivityManager connectivityManager) {
        NetworkInfo networkInfo;
        Te te2 = Te.UNDEFINED;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (!AndroidUtils.isApiAchieved(29) ? !(activeNetwork != null && ((networkInfo = connectivityManager.getNetworkInfo(activeNetwork)) == null || networkInfo.isConnected())) : activeNetwork == null) {
            return Te.OFFLINE;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        if (networkCapabilities == null) {
            return te2;
        }
        for (Integer num : f46614c.f46802a.keySet()) {
            if (networkCapabilities.hasTransport(num.intValue())) {
                return (Te) f46614c.a(num);
            }
        }
        return te2;
    }
}
