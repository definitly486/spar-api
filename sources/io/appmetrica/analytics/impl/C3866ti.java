package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.plugins.IPluginReporter;
import io.appmetrica.analytics.profile.UserProfile;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ti, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3866ti implements InterfaceC3685mb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3873u0 f48131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Nh f48132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IHandlerExecutor f48133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f48134d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ReporterConfig f48135e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Di f48136f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C3437cf f48137g;

    public C3866ti(ICommonExecutor iCommonExecutor, Context context, String str) {
        this(context.getApplicationContext(), str, new C3873u0());
    }

    public static InterfaceC3685mb a(C3873u0 c3873u0, Context context, ReporterConfig reporterConfig) {
        c3873u0.getClass();
        return C3848t0.a(context).f().c(reporterConfig);
    }

    public final void c(String str) {
        ReporterConfig reporterConfigBuild = ReporterConfig.newConfigBuilder(str).build();
        this.f48132b.getClass();
        this.f48136f.getClass();
        this.f48133c.execute(new RunnableC3543gi(this, reporterConfigBuild));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void clearAppEnvironment() {
        this.f48132b.getClass();
        this.f48136f.getClass();
        this.f48133c.execute(new RunnableC3792qi(this));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final IPluginReporter getPluginExtension() {
        return this.f48137g;
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void pauseSession() {
        this.f48132b.getClass();
        this.f48136f.getClass();
        this.f48133c.execute(new Yh(this));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void putAppEnvironmentValue(String str, String str2) {
        this.f48132b.getClass();
        this.f48136f.getClass();
        this.f48133c.execute(new RunnableC3767pi(this, str, str2));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAdRevenue(AdRevenue adRevenue) {
        this.f48132b.f46286h.a(adRevenue);
        this.f48136f.getClass();
        this.f48133c.execute(new RunnableC3440ci(this, adRevenue));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAnr(Map<Thread, StackTraceElement[]> map) {
        this.f48132b.f46288j.a(map);
        this.f48136f.getClass();
        this.f48133c.execute(new RunnableC3692mi(this, CollectionUtils.getListFromMap(map)));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportECommerce(ECommerceEvent eCommerceEvent) {
        this.f48132b.f46287i.a(eCommerceEvent);
        this.f48136f.getClass();
        this.f48133c.execute(new RunnableC3491ei(this, eCommerceEvent));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, Throwable th2) {
        this.f48132b.f46280b.a(str);
        this.f48136f.getClass();
        if (th2 == null) {
            th2 = new T1();
            th2.fillInStackTrace();
        }
        this.f48133c.execute(new Uh(this, str, th2));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str) {
        this.f48132b.f46279a.a(str);
        this.f48136f.getClass();
        this.f48133c.execute(new RunnableC3816ri(this, str));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportRevenue(Revenue revenue) {
        this.f48132b.f46285g.a(revenue);
        this.f48136f.getClass();
        this.f48133c.execute(new RunnableC3414bi(this, revenue));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUnhandledException(Throwable th2) {
        this.f48132b.f46283e.a(th2);
        this.f48136f.getClass();
        this.f48133c.execute(new Wh(this, th2));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUserProfile(UserProfile userProfile) {
        this.f48132b.f46284f.a(userProfile);
        this.f48136f.getClass();
        this.f48133c.execute(new RunnableC3388ai(this, userProfile));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void resumeSession() {
        this.f48132b.getClass();
        this.f48136f.getClass();
        this.f48133c.execute(new Xh(this));
    }

    @Override // io.appmetrica.analytics.IReporter, io.appmetrica.analytics.IModuleReporter
    public final void sendEventsBuffer() {
        this.f48132b.getClass();
        this.f48136f.getClass();
        this.f48133c.execute(new RunnableC3742oi(this));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setDataSendingEnabled(boolean z13) {
        this.f48132b.getClass();
        this.f48136f.getClass();
        this.f48133c.execute(new RunnableC3517fi(this, z13));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void setSessionExtra(String str, byte[] bArr) {
        this.f48132b.getClass();
        this.f48136f.getClass();
        this.f48133c.execute(new RunnableC3617ji(this, str, bArr));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setUserProfileID(String str) {
        this.f48132b.getClass();
        this.f48136f.getClass();
        this.f48133c.execute(new Zh(this, str));
    }

    public C3866ti(Context context, String str, C3873u0 c3873u0) {
        this(context, new Nh(), c3873u0, new Di(), ReporterConfig.newConfigBuilder(str).build());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3685mb, io.appmetrica.analytics.impl.InterfaceC3760pb
    public final void a(Nn nn2) {
        this.f48132b.f46282d.a(nn2);
        this.f48136f.getClass();
        this.f48133c.execute(new RunnableC3667li(this, nn2));
    }

    public C3866ti(Context context, Nh nh2, C3873u0 c3873u0, Di di2, ReporterConfig reporterConfig) {
        this(context, nh2, c3873u0, di2, reporterConfig, new C3437cf(new C3466di(c3873u0, context, reporterConfig)));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportAdRevenue(AdRevenue adRevenue, boolean z13) {
        this.f48132b.f46286h.a(adRevenue);
        this.f48136f.getClass();
        this.f48133c.execute(new RunnableC3642ki(this, adRevenue, z13));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str, String str2) {
        this.f48132b.f46279a.a(str);
        this.f48136f.getClass();
        this.f48133c.execute(new RunnableC3841si(this, str, str2));
    }

    public C3866ti(Context context, Nh nh2, C3873u0 c3873u0, Di di2, ReporterConfig reporterConfig, C3437cf c3437cf) {
        this.f48133c = C3952x4.l().g().a();
        this.f48134d = context;
        this.f48132b = nh2;
        this.f48131a = c3873u0;
        this.f48136f = di2;
        this.f48135e = reporterConfig;
        this.f48137g = c3437cf;
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, String str2) {
        reportError(str, str2, null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, String str2, Throwable th2) {
        this.f48132b.f46281c.a(str);
        this.f48136f.getClass();
        this.f48133c.execute(new Vh(this, str, str2, th2));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3685mb, io.appmetrica.analytics.impl.InterfaceC3473e0
    public final void a(U u13) {
        this.f48132b.getClass();
        this.f48136f.getClass();
        this.f48133c.execute(new RunnableC3717ni(this, u13));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str, Map<String, Object> map) {
        this.f48132b.f46279a.a(str);
        this.f48136f.getClass();
        this.f48133c.execute(new Th(this, str, CollectionUtils.getListFromMap(map)));
    }

    public final void a(ReporterConfig reporterConfig) {
        this.f48132b.getClass();
        this.f48136f.getClass();
        this.f48133c.execute(new RunnableC3568hi(this, reporterConfig));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportEvent(ModuleEvent moduleEvent) {
        this.f48132b.getClass();
        this.f48136f.getClass();
        this.f48133c.execute(new RunnableC3592ii(this, moduleEvent));
    }
}
