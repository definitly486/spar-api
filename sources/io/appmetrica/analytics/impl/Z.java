package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3873u0 f46831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Xk f46832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3703n4 f46833c;

    public Z(C3873u0 c3873u0, Xk xk2, C3703n4 c3703n4) {
        this.f46831a = c3873u0;
        this.f46832b = xk2;
        this.f46833c = c3703n4;
    }

    public final void a(final Context context, final AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        boolean z13;
        PublicLogger mainPublicOrAnonymousLogger = LoggerStorage.getMainPublicOrAnonymousLogger();
        this.f46831a.getClass();
        synchronized (C3848t0.class) {
            z13 = C3848t0.f48088f;
        }
        if (!z13) {
            mainPublicOrAnonymousLogger.info("Session autotracking enabled", new Object[0]);
            this.f46832b.a();
        }
        this.f46831a.getClass();
        C3848t0 c3848t0A = C3848t0.a(context);
        c3848t0A.f48093d.a(null, c3848t0A);
        IHandlerExecutor iHandlerExecutorA = this.f46833c.a();
        ((U9) iHandlerExecutorA).f46606b.post(new Runnable() { // from class: io.appmetrica.analytics.impl.lereixgezr
            @Override // java.lang.Runnable
            public final void run() {
                Z.a(this.f47656zdlpuopuiu, context, appMetricaLibraryAdapterConfig);
            }
        });
        this.f46831a.getClass();
        C3873u0.a();
    }

    public static final void a(Z z13, Context context, AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        z13.f46831a.getClass();
        C3848t0 c3848t0A = C3848t0.a(context);
        c3848t0A.f().a(appMetricaLibraryAdapterConfig);
        C3952x4.l().f48373c.a().execute(new RunnableC3824s1(c3848t0A.f48090a));
    }
}
