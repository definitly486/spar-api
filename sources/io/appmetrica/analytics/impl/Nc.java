package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.PreloadInfo;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class Nc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f46263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ji f46264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Qd f46265c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C3560ha f46266d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final W8 f46267e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Sh f46268f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C3626k2 f46269g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final M6 f46270h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C3748p f46271i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Xe f46272j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final On f46273k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Rg f46274l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Q6 f46275m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C3396b0 f46276n;

    public Nc(Context context, Pf pf2, Ji ji2, Ol ol2) {
        this.f46263a = context;
        this.f46264b = ji2;
        this.f46265c = new Qd(pf2);
        C3560ha c3560ha = new C3560ha(context);
        this.f46266d = c3560ha;
        W8 w13 = new W8(new C3819rl(LoggerStorage.getMainPublicOrAnonymousLogger(), "Crash Environment"));
        this.f46267e = w13;
        this.f46268f = new Sh(pf2, new CounterConfiguration(CounterConfigurationReporterType.MAIN), w13);
        this.f46269g = new C3626k2();
        this.f46270h = C3952x4.l().n();
        this.f46271i = new C3748p();
        this.f46272j = new Xe(c3560ha);
        this.f46273k = new On();
        this.f46274l = new Rg();
        this.f46275m = new Q6();
        this.f46276n = new C3396b0();
    }

    public final C3396b0 a() {
        return this.f46276n;
    }

    public final Context b() {
        return this.f46263a;
    }

    public final Q6 c() {
        return this.f46275m;
    }

    public final C3560ha d() {
        return this.f46266d;
    }

    public final Xe e() {
        return this.f46272j;
    }

    public final M6 f() {
        return this.f46270h;
    }

    public final Rg g() {
        return this.f46274l;
    }

    public final Sh h() {
        return this.f46268f;
    }

    public final Ji i() {
        return this.f46264b;
    }

    public final On j() {
        return this.f46273k;
    }

    public final void a(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger) {
        this.f46268f.f47066b.applyFromConfig(appMetricaConfig);
        Sh sh2 = this.f46268f;
        String str = appMetricaConfig.userProfileID;
        synchronized (sh2) {
            sh2.f46513f = str;
        }
        Sh sh3 = this.f46268f;
        PreloadInfo preloadInfo = appMetricaConfig.preloadInfo;
        Boolean bool = (Boolean) appMetricaConfig.additionalConfig.get("YMM_preloadInfoAutoTracking");
        sh3.f46511d = new If(preloadInfo, publicLogger, bool != null ? bool.booleanValue() : false);
        StringBuilder sb3 = new StringBuilder("Actual session timeout is ");
        Integer num = appMetricaConfig.sessionTimeout;
        if (num == null) {
            num = 10;
        }
        sb3.append(num.intValue());
        publicLogger.info(sb3.toString(), new Object[0]);
    }
}
