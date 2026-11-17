package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ReporterConfig;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.hi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC3568hi implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ReporterConfig f47401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3866ti f47402b;

    public RunnableC3568hi(C3866ti c3866ti, ReporterConfig reporterConfig) {
        this.f47402b = c3866ti;
        this.f47401a = reporterConfig;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3866ti c3866ti = this.f47402b;
        ReporterConfig reporterConfig = this.f47401a;
        C3873u0 c3873u0 = c3866ti.f48131a;
        Context context = c3866ti.f48134d;
        c3873u0.getClass();
        C3848t0.a(context).f().a(reporterConfig);
    }
}
