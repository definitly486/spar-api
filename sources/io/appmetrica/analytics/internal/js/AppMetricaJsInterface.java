package io.appmetrica.analytics.internal.js;

import android.webkit.JavascriptInterface;
import io.appmetrica.analytics.impl.C3750p1;

/* JADX INFO: loaded from: classes3.dex */
public class AppMetricaJsInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3750p1 f48652a;

    public AppMetricaJsInterface(C3750p1 c3750p1) {
        this.f48652a = c3750p1;
    }

    @JavascriptInterface
    public void reportEvent(String str, String str2) {
        this.f48652a.d(str, str2);
    }
}
