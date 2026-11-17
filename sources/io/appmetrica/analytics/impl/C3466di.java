package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.di, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3466di implements Provider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3873u0 f47101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f47102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ReporterConfig f47103c;

    public C3466di(C3873u0 c3873u0, Context context, ReporterConfig reporterConfig) {
        this.f47101a = c3873u0;
        this.f47102b = context;
        this.f47103c = reporterConfig;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Provider
    public final Object get() {
        C3873u0 c3873u0 = this.f47101a;
        Context context = this.f47102b;
        ReporterConfig reporterConfig = this.f47103c;
        c3873u0.getClass();
        return C3848t0.a(context).f().c(reporterConfig);
    }
}
