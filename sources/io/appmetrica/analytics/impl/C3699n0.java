package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Handler;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import io.appmetrica.analytics.logger.common.BaseReleaseLogger;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3699n0 implements Wa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f47722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IHandlerExecutor f47723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4002z4 f47724c = new C4002z4();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f47725d = f().getHandler();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Y1 f47726e = new Y1();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Fb f47727f = new Fb();

    public C3699n0(Context context, C3703n4 c3703n4) {
        this.f47722a = context;
        this.f47723b = c3703n4.a();
        BaseReleaseLogger.init(context);
        f().execute(new Runnable() { // from class: io.appmetrica.analytics.impl.ylkuphrtab
            @Override // java.lang.Runnable
            public final void run() {
                C3699n0.e();
            }
        });
        a().a();
        AbstractC3400b4.a().onCreate();
    }

    public static final void e() {
        ImportantLogger.INSTANCE.info("AppMetrica", "Initializing of AppMetrica, " + StringUtils.capitalize("release") + " type, Version 7.10.0, API Level " + AppMetrica.getLibraryApiLevel() + ", Dated 11.07.2025.", new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.Wa
    public final C4002z4 a() {
        return this.f47724c;
    }

    @Override // io.appmetrica.analytics.impl.Wa
    public final Handler b() {
        return this.f47725d;
    }

    @Override // io.appmetrica.analytics.impl.Wa
    public final Y1 c() {
        return this.f47726e;
    }

    @Override // io.appmetrica.analytics.impl.Wa
    public final Fb d() {
        return this.f47727f;
    }

    public final IHandlerExecutor f() {
        return this.f47723b;
    }

    @Override // io.appmetrica.analytics.impl.Wa
    public final ICommonExecutor getDefaultExecutor() {
        return this.f47723b;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0029 A[Catch: all -> 0x000e, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:6:0x0007, B:8:0x000b, B:11:0x0010, B:14:0x0017, B:19:0x0032, B:21:0x0036, B:22:0x0038, B:25:0x003f, B:28:0x004c, B:26:0x0045, B:15:0x001d, B:17:0x0029), top: B:33:0x0001 }] */
    @Override // io.appmetrica.analytics.impl.Wa
    public final synchronized void a(AppMetricaConfig appMetricaConfig, InterfaceC3735ob interfaceC3735ob) {
        try {
            if (!C3848t0.f48089g) {
                if (appMetricaConfig == null) {
                    this.f47727f.c();
                    this.f47727f.b();
                    if (appMetricaConfig != null) {
                        this.f47727f.a(this.f47722a, appMetricaConfig, interfaceC3735ob);
                    }
                } else {
                    Boolean bool = appMetricaConfig.crashReporting;
                    if (bool == null) {
                        bool = Boolean.TRUE;
                    }
                    if (bool.booleanValue()) {
                        this.f47727f.c();
                        this.f47727f.b();
                        if (appMetricaConfig != null) {
                            this.f47727f.a(this.f47722a, appMetricaConfig, interfaceC3735ob);
                        }
                    } else {
                        this.f47727f.a();
                    }
                }
                if (appMetricaConfig == null) {
                    this.f47726e.b();
                } else {
                    Boolean bool2 = appMetricaConfig.appOpenTrackingEnabled;
                    if (bool2 == null) {
                        bool2 = Boolean.TRUE;
                    }
                    if (bool2.booleanValue()) {
                        this.f47726e.b();
                    } else {
                        this.f47726e.c();
                    }
                }
                if (appMetricaConfig != null) {
                    C3848t0.f48089g = true;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
