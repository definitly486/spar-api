package io.appmetrica.analytics.internal.js;

import android.webkit.JavascriptInterface;
import io.appmetrica.analytics.impl.C3750p1;

/* JADX INFO: loaded from: classes3.dex */
public class AppMetricaInitializerJsInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3750p1 f48651a;

    public AppMetricaInitializerJsInterface(C3750p1 c3750p1) {
        this.f48651a = c3750p1;
    }

    @JavascriptInterface
    public void init(String str) {
        this.f48651a.c(str);
    }
}
