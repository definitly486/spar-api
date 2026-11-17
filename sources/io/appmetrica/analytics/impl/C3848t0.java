package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
import io.appmetrica.analytics.AdvIdentifiersResult;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3848t0 implements InterfaceC3735ob {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile C3848t0 f48087e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile boolean f48088f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile boolean f48089g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f48090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3724o0 f48091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FutureTask f48092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Wa f48093d;

    public C3848t0(Context context) {
        this.f48090a = context;
        C3724o0 c3724o0C = C3952x4.l().c();
        this.f48091b = c3724o0C;
        this.f48093d = c3724o0C.a(context, C3952x4.l().g());
        this.f48092c = new FutureTask(new Callable() { // from class: io.appmetrica.analytics.impl.stevsuqkhv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f48085iobyxmoadg.p();
            }
        });
    }

    public static C3848t0 a(Context context) {
        C3848t0 c3848t0 = f48087e;
        if (c3848t0 == null) {
            synchronized (C3848t0.class) {
                try {
                    c3848t0 = f48087e;
                    if (c3848t0 == null) {
                        c3848t0 = new C3848t0(context);
                        c3848t0.j();
                        C3952x4.l().f48373c.a().execute(new RunnableC3823s0(c3848t0));
                        f48087e = c3848t0;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return c3848t0;
    }

    public static void b(boolean z13) {
        c().b(z13);
    }

    public static void clearAppEnvironment() {
        c().clearAppEnvironment();
    }

    public static synchronized boolean k() {
        return f48088f;
    }

    public static boolean l() {
        return f48089g;
    }

    public static synchronized boolean m() {
        C3848t0 c3848t0;
        c3848t0 = f48087e;
        return (c3848t0 == null || !c3848t0.f48092c.isDone() || c3848t0.f().i() == null) ? false : true;
    }

    public static synchronized void n() {
        f48087e = null;
        f48088f = false;
        f48089g = false;
    }

    public static void putAppEnvironmentValue(String str, String str2) {
        c().putAppEnvironmentValue(str, str2);
    }

    public static synchronized void q() {
        f48088f = true;
    }

    public static void r() {
        f48089g = true;
    }

    public static C3848t0 s() {
        return f48087e;
    }

    public static void setDataSendingEnabled(boolean z13) {
        c().setDataSendingEnabled(z13);
    }

    public static void setUserProfileID(String str) {
        c().setUserProfileID(str);
    }

    public final void c(AppMetricaConfig appMetricaConfig) {
        this.f48093d.a(appMetricaConfig, this);
    }

    public final void d(AppMetricaConfig appMetricaConfig) {
        f().b(appMetricaConfig);
        C3952x4.l().f48373c.a().execute(new RunnableC3824s1(this.f48090a));
    }

    public final String e() {
        return f().e();
    }

    public final Xa f() {
        try {
            return (Xa) this.f48092c.get();
        } catch (Exception e13) {
            throw new RuntimeException(e13);
        }
    }

    public final Map<String, String> g() {
        return f().g();
    }

    public final AdvIdentifiersResult h() {
        return f().h();
    }

    public final Ec i() {
        return f().i();
    }

    public final void j() {
        C3703n4 c3703n4 = C3952x4.l().f48373c;
        Runnable runnable = new Runnable() { // from class: io.appmetrica.analytics.impl.kegysxyocb
            @Override // java.lang.Runnable
            public final void run() {
                this.f47590zdlpuopuiu.o();
            }
        };
        c3703n4.f47743a.getClass();
        new InterruptionSafeThread(runnable, "IAA-INIT_CORE-" + Od.f46334a.incrementAndGet()).start();
    }

    public final void o() {
        C3952x4.l().f48388r.a(this.f48090a);
        new C3802r4(this.f48090a).a(this.f48090a);
        C3952x4.l().a(this.f48090a).a();
        this.f48092c.run();
    }

    public final Xa p() {
        Xa xa3;
        C3724o0 c3724o0 = this.f48091b;
        Context context = this.f48090a;
        Wa wa3 = this.f48093d;
        synchronized (c3724o0) {
            try {
                if (c3724o0.f47793d == null) {
                    if (c3724o0.a(context)) {
                        c3724o0.f47793d = new C3998z0();
                    } else {
                        c3724o0.f47793d = new C3948x0(context, wa3);
                    }
                }
                xa3 = c3724o0.f47793d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return xa3;
    }

    public final void b(AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        f().a(appMetricaLibraryAdapterConfig);
        C3952x4.l().f48373c.a().execute(new RunnableC3824s1(this.f48090a));
    }

    public final InterfaceC3685mb c(ReporterConfig reporterConfig) {
        return f().c(reporterConfig);
    }

    public static InterfaceC3435cd c() {
        if (m()) {
            return f48087e.f();
        }
        return C3952x4.l().f48372b;
    }

    public final C3833sa d() {
        return f().d();
    }

    public final C4002z4 b() {
        return this.f48093d.a();
    }

    public static void a(Location location) {
        c().a(location);
    }

    public static void a(boolean z13) {
        c().a(z13);
    }

    public static void a(String str, String str2) {
        c().a(str, str2);
    }

    public final void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        f().a(deferredDeeplinkParametersListener);
    }

    public final void a(DeferredDeeplinkListener deferredDeeplinkListener) {
        f().a(deferredDeeplinkListener);
    }

    public final void a(ReporterConfig reporterConfig) {
        f().a(reporterConfig);
    }

    public final void a(StartupParamsCallback startupParamsCallback, List<String> list) {
        f().a(startupParamsCallback, list);
    }

    public static synchronized void a(C3848t0 c3848t0) {
        f48087e = c3848t0;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3735ob
    public final InterfaceC3710nb a() {
        return f().a();
    }
}
