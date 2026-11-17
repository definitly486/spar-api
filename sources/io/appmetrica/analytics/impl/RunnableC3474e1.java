package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.StartupParamsCallback;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.e1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC3474e1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f47144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StartupParamsCallback f47145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f47146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3750p1 f47147d;

    public RunnableC3474e1(C3750p1 c3750p1, Context context, StartupParamsCallback startupParamsCallback, List list) {
        this.f47147d = c3750p1;
        this.f47144a = context;
        this.f47145b = startupParamsCallback;
        this.f47146c = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3873u0 c3873u0 = this.f47147d.f47852a;
        Context applicationContext = this.f47144a.getApplicationContext();
        c3873u0.getClass();
        C3848t0 c3848t0A = C3848t0.a(applicationContext);
        c3848t0A.f().a(this.f47145b, this.f47146c);
    }
}
