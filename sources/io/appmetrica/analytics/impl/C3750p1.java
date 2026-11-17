package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.webkit.WebView;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.AnrListener;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.ExternalAttribution;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.internal.IdentifiersResult;
import io.appmetrica.analytics.internal.js.AppMetricaInitializerJsInterface;
import io.appmetrica.analytics.internal.js.AppMetricaJsInterface;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;
import io.appmetrica.analytics.profile.UserProfile;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.p1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3750p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3873u0 f47852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Do f47853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bi f47854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Z7 f47855d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C3571hl f47856e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final M2 f47857f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C3522fn f47858g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Xk f47859h;

    public C3750p1(C3873u0 c3873u0, M2 m13, C3571hl c3571hl, Do r13, C3522fn c3522fn, Bi bi2, Z7 z13, Xk xk2) {
        this.f47852a = c3873u0;
        this.f47853b = r13;
        this.f47854c = bi2;
        this.f47855d = z13;
        this.f47857f = m13;
        this.f47858g = c3522fn;
        this.f47856e = c3571hl;
        this.f47859h = xk2;
    }

    public static IHandlerExecutor c() {
        return C3952x4.l().f48373c.a();
    }

    public final void a(final Context context, final AppMetricaConfig appMetricaConfig) {
        M2 m13 = this.f47857f;
        m13.f46204f.a(context);
        m13.f46200b.a(appMetricaConfig);
        C3522fn c3522fn = this.f47858g;
        Context applicationContext = context.getApplicationContext();
        c3522fn.f47258e.a(applicationContext);
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(appMetricaConfig.apiKey);
        if (((Boolean) WrapUtils.getOrDefault(appMetricaConfig.sessionsAutoTrackingEnabled, Boolean.TRUE)).booleanValue()) {
            orCreatePublicLogger.info("Session auto tracking enabled", new Object[0]);
            c3522fn.f47257d.a();
        } else {
            orCreatePublicLogger.info("Session auto tracking disabled", new Object[0]);
        }
        c3522fn.f47254a.getClass();
        C3848t0 c3848t0A = C3848t0.a(applicationContext);
        c3848t0A.f48093d.a(appMetricaConfig, c3848t0A);
        IHandlerExecutor iHandlerExecutorC = c();
        ((U9) iHandlerExecutorC).f46606b.post(new Runnable() { // from class: io.appmetrica.analytics.impl.cllcsxoeiz
            @Override // java.lang.Runnable
            public final void run() {
                this.f47036zdlpuopuiu.b(context, appMetricaConfig);
            }
        });
        this.f47852a.getClass();
        synchronized (C3848t0.class) {
            C3848t0.f48088f = true;
        }
    }

    public final String b() {
        this.f47852a.getClass();
        C3848t0 c3848t0 = C3848t0.f48087e;
        if (c3848t0 == null) {
            return null;
        }
        return c3848t0.f().e();
    }

    public final Ec d() {
        this.f47852a.getClass();
        return C3848t0.f48087e.f().i();
    }

    public final void e() {
        d().f45721a.a(this.f47859h.a());
    }

    public final void f() {
        this.f47857f.f46199a.a(null);
        this.f47858g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((U9) iHandlerExecutorC).f46606b.post(new R0(this));
    }

    public final void c(Activity activity) {
        this.f47857f.f46199a.a(null);
        this.f47858g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((U9) iHandlerExecutorC).f46606b.post(new RunnableC3423c1(this, activity));
    }

    public final void b(Context context, AppMetricaConfig appMetricaConfig) {
        C3873u0 c3873u0 = this.f47852a;
        Context applicationContext = context.getApplicationContext();
        c3873u0.getClass();
        C3848t0 c3848t0A = C3848t0.a(applicationContext);
        c3848t0A.f().b(this.f47855d.a(appMetricaConfig));
        Context context2 = c3848t0A.f48090a;
        ((U9) C3952x4.l().f48373c.a()).execute(new RunnableC3824s1(context2));
    }

    public final void e(String str) {
        this.f47857f.getClass();
        this.f47858g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((U9) iHandlerExecutorC).f46606b.post(new P0(this, str));
    }

    public final void d(String str) {
        M2 m13 = this.f47857f;
        m13.f46199a.a(null);
        m13.f46208j.a(str);
        this.f47858g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((U9) iHandlerExecutorC).f46606b.post(new K0(this, str));
    }

    public C3750p1() {
        this(C3952x4.l().d(), new Do());
    }

    public final void c(String str, String str2) {
        M2 m13 = this.f47857f;
        m13.f46199a.a(null);
        m13.f46217s.a(str);
        this.f47858g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((U9) iHandlerExecutorC).f46606b.post(new RunnableC3625k1(this, str, str2));
    }

    public C3750p1(C3873u0 c3873u0, Do r13) {
        this(c3873u0, new M2(c3873u0), new C3571hl(c3873u0), r13, new C3522fn(c3873u0, r13), Bi.a(), C3952x4.l().j(), C3952x4.l().o());
    }

    public final void d(String str, String str2) {
        M2 m13 = this.f47857f;
        m13.f46199a.a(null);
        if (m13.f46213o.a(str).f47784a) {
            this.f47858g.getClass();
            IHandlerExecutor iHandlerExecutorC = c();
            ((U9) iHandlerExecutorC).f46606b.post(new Z0(this, str, str2));
        }
    }

    public final void b(String str) {
        M2 m13 = this.f47857f;
        m13.f46199a.a(null);
        m13.f46217s.a(str);
        this.f47858g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((U9) iHandlerExecutorC).f46606b.post(new RunnableC3600j1(this, str));
    }

    public final void c(boolean z13) {
        this.f47857f.getClass();
        this.f47858g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((U9) iHandlerExecutorC).f46606b.post(new M0(this, z13));
    }

    public final void b(Activity activity) {
        M2 m13 = this.f47857f;
        m13.f46199a.a(null);
        m13.f46201c.a(activity);
        this.f47858g.getClass();
        Intent intentA = C3522fn.a(activity);
        IHandlerExecutor iHandlerExecutorC = c();
        ((U9) iHandlerExecutorC).f46606b.post(new H0(this, intentA));
    }

    public final void c(String str) {
        if (this.f47856e.a((Void) null).f47784a && this.f47857f.f46212n.a(str).f47784a) {
            this.f47858g.getClass();
            IHandlerExecutor iHandlerExecutorC = c();
            ((U9) iHandlerExecutorC).f46606b.post(new RunnableC3371a1(this, str));
        }
    }

    public final void a(Activity activity) {
        this.f47857f.f46199a.a(null);
        this.f47858g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((U9) iHandlerExecutorC).f46606b.post(new RunnableC3576i1(this, activity));
    }

    public final void b(boolean z13) {
        this.f47857f.getClass();
        this.f47858g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((U9) iHandlerExecutorC).f46606b.post(new O0(this, z13));
    }

    public final void a(Application application) {
        this.f47857f.f46203e.a(application);
        this.f47858g.f47256c.a(application);
        IHandlerExecutor iHandlerExecutorC = c();
        ((U9) iHandlerExecutorC).f46606b.post(new Runnable() { // from class: io.appmetrica.analytics.impl.wypolnanlu
            @Override // java.lang.Runnable
            public final void run() {
                this.f48354zdlpuopuiu.e();
            }
        });
    }

    public final void b(String str, String str2) {
        this.f47857f.f46210l.a(str);
        this.f47858g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((U9) iHandlerExecutorC).f46606b.post(new X0(this, str, str2));
    }

    public final void a(String str, Map<String, Object> map) {
        M2 m13 = this.f47857f;
        m13.f46199a.a(null);
        m13.f46217s.a(str);
        this.f47858g.getClass();
        List listFromMap = CollectionUtils.getListFromMap(map);
        IHandlerExecutor iHandlerExecutorC = c();
        ((U9) iHandlerExecutorC).f46606b.post(new RunnableC3650l1(this, str, listFromMap));
    }

    public final void b(final Object... objArr) {
        this.f47857f.f46199a.a(null);
        this.f47858g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((U9) iHandlerExecutorC).f46606b.post(new Runnable() { // from class: io.appmetrica.analytics.impl.dsvhmnatus
            @Override // java.lang.Runnable
            public final void run() {
                C3750p1.a(objArr);
            }
        });
    }

    public final void b(Context context) {
        this.f47857f.f46204f.a(context);
        this.f47858g.f47258e.a(context);
        this.f47852a.getClass();
        C3848t0.a(context);
    }

    public final void a(String str, Throwable th2) {
        M2 m13 = this.f47857f;
        m13.f46199a.a(null);
        m13.f46218t.a(str);
        this.f47858g.getClass();
        if (th2 == null) {
            th2 = new T1();
            th2.fillInStackTrace();
        }
        IHandlerExecutor iHandlerExecutorC = c();
        ((U9) iHandlerExecutorC).f46606b.post(new RunnableC3675m1(this, str, th2));
    }

    public final void a(String str, String str2, Throwable th2) {
        M2 m13 = this.f47857f;
        m13.f46199a.a(null);
        m13.f46219u.a(str);
        this.f47858g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((U9) iHandlerExecutorC).f46606b.post(new RunnableC3700n1(this, str, str2, th2));
    }

    public final void a(Throwable th2) {
        M2 m13 = this.f47857f;
        m13.f46199a.a(null);
        m13.f46220v.a(th2);
        this.f47858g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((U9) iHandlerExecutorC).f46606b.post(new RunnableC3725o1(this, th2));
    }

    public final void a(String str) {
        M2 m13 = this.f47857f;
        m13.f46199a.a(null);
        m13.f46207i.a(str);
        this.f47858g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((U9) iHandlerExecutorC).f46606b.post(new I0(this, str));
    }

    public final void a(Intent intent) {
        M2 m13 = this.f47857f;
        m13.f46199a.a(null);
        m13.f46202d.a(intent);
        this.f47858g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((U9) iHandlerExecutorC).f46606b.post(new J0(this, intent));
    }

    public final void a(Location location) {
        this.f47857f.getClass();
        this.f47858g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((U9) iHandlerExecutorC).f46606b.post(new L0(this, location));
    }

    public final void a(boolean z13) {
        this.f47857f.getClass();
        this.f47858g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((U9) iHandlerExecutorC).f46606b.post(new N0(this, z13));
    }

    public final void a(UserProfile userProfile) {
        M2 m13 = this.f47857f;
        m13.f46199a.a(null);
        m13.f46221w.a(userProfile);
        this.f47858g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((U9) iHandlerExecutorC).f46606b.post(new Q0(this, userProfile));
    }

    public final void a(Revenue revenue) {
        M2 m13 = this.f47857f;
        m13.f46199a.a(null);
        m13.f46222x.a(revenue);
        this.f47858g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((U9) iHandlerExecutorC).f46606b.post(new S0(this, revenue));
    }

    public final void a(AdRevenue adRevenue) {
        M2 m13 = this.f47857f;
        m13.f46199a.a(null);
        m13.f46223y.a(adRevenue);
        this.f47858g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((U9) iHandlerExecutorC).f46606b.post(new T0(this, adRevenue));
    }

    public final void a(ECommerceEvent eCommerceEvent) {
        M2 m13 = this.f47857f;
        m13.f46199a.a(null);
        m13.f46224z.a(eCommerceEvent);
        this.f47858g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((U9) iHandlerExecutorC).f46606b.post(new U0(this, eCommerceEvent));
    }

    public final void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        M2 m13 = this.f47857f;
        m13.f46199a.a(null);
        m13.f46205g.a(deferredDeeplinkParametersListener);
        this.f47858g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((U9) iHandlerExecutorC).f46606b.post(new V0(this, deferredDeeplinkParametersListener));
    }

    public final void a(DeferredDeeplinkListener deferredDeeplinkListener) {
        M2 m13 = this.f47857f;
        m13.f46199a.a(null);
        m13.f46205g.a(deferredDeeplinkListener);
        this.f47858g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((U9) iHandlerExecutorC).f46606b.post(new W0(this, deferredDeeplinkListener));
    }

    public final InterfaceC3685mb a(Context context, String str) {
        M2 m13 = this.f47857f;
        m13.f46204f.a(context);
        m13.f46209k.a(str);
        C3522fn c3522fn = this.f47858g;
        c3522fn.f47258e.a(context.getApplicationContext());
        return this.f47854c.a(context.getApplicationContext(), str);
    }

    public final void a(Context context, ReporterConfig reporterConfig) {
        M2 m13 = this.f47857f;
        m13.f46204f.a(context);
        m13.f46206h.a(reporterConfig);
        C3522fn c3522fn = this.f47858g;
        c3522fn.f47258e.a(context.getApplicationContext());
        Bi bi2 = this.f47854c;
        Context applicationContext = context.getApplicationContext();
        if (((C3866ti) bi2.f45540a.get(reporterConfig.apiKey)) == null) {
            synchronized (bi2.f45540a) {
                try {
                    if (((C3866ti) bi2.f45540a.get(reporterConfig.apiKey)) == null) {
                        String str = reporterConfig.apiKey;
                        IHandlerExecutor iHandlerExecutorA = C3952x4.l().f48373c.a();
                        bi2.f45541b.getClass();
                        if (C3848t0.f48087e == null) {
                            ((U9) iHandlerExecutorA).f46606b.post(new RunnableC4016zi(bi2, applicationContext));
                        }
                        C3866ti c3866ti = new C3866ti(applicationContext.getApplicationContext(), str, new C3873u0());
                        bi2.f45540a.put(str, c3866ti);
                        c3866ti.a(reporterConfig);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void a(WebView webView) {
        M2 m13 = this.f47857f;
        m13.f46199a.a(null);
        m13.f46211m.a(webView);
        Do r13 = this.f47858g.f47255b;
        r13.getClass();
        try {
            if (webView.getSettings().getJavaScriptEnabled()) {
                webView.addJavascriptInterface(new AppMetricaJsInterface(this), "AppMetrica");
                webView.addJavascriptInterface(new AppMetricaInitializerJsInterface(this), "AppMetricaInitializer");
                Ao ao2 = new Ao();
                synchronized (r13) {
                    try {
                        PublicLogger publicLogger = r13.f45673b;
                        if (publicLogger == null) {
                            r13.f45672a.add(ao2);
                        } else {
                            ao2.consume(publicLogger);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } else {
                r13.a(new Bo());
            }
        } catch (Throwable th3) {
            r13.a(new Co(th3));
        }
        IHandlerExecutor iHandlerExecutorC = c();
        ((U9) iHandlerExecutorC).f46606b.post(new Y0(this));
    }

    public final IdentifiersResult a(Context context) {
        this.f47857f.f46204f.a(context);
        C3522fn c3522fn = this.f47858g;
        Context applicationContext = context.getApplicationContext();
        c3522fn.f47258e.a(applicationContext);
        c3522fn.f47259f.a(applicationContext);
        return C3952x4.l().a(context.getApplicationContext()).a();
    }

    public final void a(String str, String str2) {
        this.f47857f.getClass();
        this.f47858g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((U9) iHandlerExecutorC).f46606b.post(new RunnableC3397b1(this, str, str2));
    }

    public final void a() {
        this.f47857f.getClass();
        this.f47858g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((U9) iHandlerExecutorC).f46606b.post(new RunnableC3449d1(this));
    }

    public final void a(Context context, StartupParamsCallback startupParamsCallback, List<String> list) {
        M2 m13 = this.f47857f;
        m13.f46204f.a(context);
        m13.f46214p.a(startupParamsCallback);
        C3522fn c3522fn = this.f47858g;
        c3522fn.f47258e.a(context.getApplicationContext());
        IHandlerExecutor iHandlerExecutorC = c();
        ((U9) iHandlerExecutorC).f46606b.post(new RunnableC3474e1(this, context, startupParamsCallback, list));
    }

    public final void a(AnrListener anrListener) {
        M2 m13 = this.f47857f;
        m13.f46199a.a(null);
        m13.f46215q.a(anrListener);
        this.f47858g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((U9) iHandlerExecutorC).f46606b.post(new RunnableC3500f1(this, anrListener));
    }

    public final void a(ExternalAttribution externalAttribution) {
        M2 m13 = this.f47857f;
        m13.f46199a.a(null);
        m13.f46216r.a(externalAttribution);
        this.f47858g.getClass();
        IHandlerExecutor iHandlerExecutorC = c();
        ((U9) iHandlerExecutorC).f46606b.post(new RunnableC3526g1(this, externalAttribution));
    }

    public static /* synthetic */ void a(Object[] objArr) {
        ModuleAdRevenueProcessor moduleAdRevenueProcessorB = C3952x4.l().m().b();
        if (moduleAdRevenueProcessorB != null) {
            moduleAdRevenueProcessorB.process(objArr);
        }
    }

    public final void a(Map<Thread, StackTraceElement[]> map) {
        this.f47857f.A.a(map);
        this.f47858g.getClass();
        List listFromMap = CollectionUtils.getListFromMap(map);
        IHandlerExecutor iHandlerExecutorC = c();
        ((U9) iHandlerExecutorC).f46606b.post(new RunnableC3551h1(this, listFromMap));
    }

    public static InterfaceC3459db a(C3750p1 c3750p1) {
        return c3750p1.d().f45721a;
    }
}
