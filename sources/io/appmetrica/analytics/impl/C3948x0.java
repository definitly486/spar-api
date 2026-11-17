package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import io.appmetrica.analytics.AdvIdentifiersResult;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3948x0 implements Xa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f48356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Wa f48357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3614jf f48358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ol f48359d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C3939wg f48360e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Pf f48361f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C3941wi f48362g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Ji f48363h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Z7 f48364i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Xk f48365j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile Ec f48366k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C3599j0 f48367l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f48368m;

    public C3948x0(Context context, Wa wa3) {
        this.f48356a = context;
        this.f48357b = wa3;
        C3614jf c3614jfB = C3952x4.l().b(context);
        this.f48358c = c3614jfB;
        Id.a();
        C3952x4 c3952x4L = C3952x4.l();
        c3952x4L.m().a(new C3529g4(context));
        Pf pfA = AbstractC3973y0.a(context, AbstractC3973y0.a(wa3.b(), this));
        this.f48361f = pfA;
        Z7 z7J = c3952x4L.j();
        this.f48364i = z7J;
        Ji jiA = AbstractC3973y0.a(pfA, context, wa3.getDefaultExecutor());
        this.f48363h = jiA;
        z7J.a(jiA);
        Ol olA = AbstractC3973y0.a(context, jiA, c3614jfB, wa3.b());
        this.f48359d = olA;
        jiA.a(olA);
        this.f48360e = AbstractC3973y0.a(jiA, c3614jfB, wa3.b());
        this.f48362g = AbstractC3973y0.a(context, pfA, jiA, wa3.b(), olA);
        this.f48365j = c3952x4L.o();
        this.f48367l = new C3599j0(c3614jfB);
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final InterfaceC3685mb c(ReporterConfig reporterConfig) {
        return this.f48362g.b(reporterConfig);
    }

    @Override // io.appmetrica.analytics.impl.Xa, io.appmetrica.analytics.impl.InterfaceC3435cd
    public final void clearAppEnvironment() {
        j().clearAppEnvironment();
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final C3833sa d() {
        return this.f48359d.e();
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final String e() {
        return this.f48359d.d();
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final Map<String, String> g() {
        return this.f48359d.b();
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final AdvIdentifiersResult h() {
        return this.f48359d.a();
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final Ec i() {
        return this.f48366k;
    }

    public final InterfaceC3459db j() {
        Ec ec3 = this.f48366k;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(ec3);
        return ec3.f45721a;
    }

    public final C3941wi k() {
        return this.f48362g;
    }

    @Override // io.appmetrica.analytics.impl.Xa, io.appmetrica.analytics.impl.InterfaceC3435cd
    public final void putAppEnvironmentValue(String str, String str2) {
        j().putAppEnvironmentValue(str, str2);
    }

    @Override // io.appmetrica.analytics.impl.Xa, io.appmetrica.analytics.impl.InterfaceC3435cd
    public final void setDataSendingEnabled(boolean z13) {
        j().setDataSendingEnabled(z13);
    }

    @Override // io.appmetrica.analytics.impl.Xa, io.appmetrica.analytics.impl.InterfaceC3435cd
    public final void setUserProfileID(String str) {
        j().setUserProfileID(str);
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        C3599j0 c3599j0 = this.f48367l;
        AppMetricaConfig appMetricaConfigF = c3599j0.f47500a.f();
        if (appMetricaConfigF == null) {
            C3798r0 c3798r0 = c3599j0.f47501b;
            c3798r0.getClass();
            AppMetricaConfig.Builder builderNewConfigBuilder = AppMetricaConfig.newConfigBuilder("629a824d-c717-4ba5-bc0f-3f3968554d01");
            if (c3798r0.f47954a.c() && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(c3798r0.f47955b.f48417a, Boolean.TRUE)) {
                builderNewConfigBuilder.handleFirstActivationAsUpdate(true);
            }
            Boolean bool = appMetricaLibraryAdapterConfig.advIdentifiersTracking;
            if (bool == null) {
                bool = Boolean.FALSE;
            }
            builderNewConfigBuilder.withAdvIdentifiersTracking(bool.booleanValue());
            appMetricaConfigF = builderNewConfigBuilder.build();
        }
        PublicLogger mainPublicOrAnonymousLogger = LoggerStorage.getMainPublicOrAnonymousLogger();
        if (a(mainPublicOrAnonymousLogger, appMetricaConfigF, new C3923w0(this, appMetricaConfigF, mainPublicOrAnonymousLogger))) {
            ImportantLogger.INSTANCE.info("AppMetrica", "Activate AppMetrica in anonymous mode", new Object[0]);
        }
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void b(AppMetricaConfig appMetricaConfig) {
        boolean z13;
        PublicLogger orCreateMainPublicLogger = LoggerStorage.getOrCreateMainPublicLogger(appMetricaConfig.apiKey);
        boolean zA = a(orCreateMainPublicLogger, appMetricaConfig, new C3898v0(this, appMetricaConfig, orCreateMainPublicLogger));
        if (zA || this.f48368m) {
            z13 = false;
        } else {
            a(appMetricaConfig, orCreateMainPublicLogger);
            z13 = true;
        }
        if (zA || z13) {
            this.f48358c.a(appMetricaConfig);
        } else {
            orCreateMainPublicLogger.warning("AppMetrica SDK already has been activated", new Object[0]);
        }
        if (zA) {
            ImportantLogger.INSTANCE.info("AppMetrica", "Activate AppMetrica with APIKey " + ApiKeyUtils.createPartialApiKey(appMetricaConfig.apiKey), new Object[0]);
        }
        if (z13) {
            ImportantLogger.INSTANCE.info("AppMetrica", "Upgrade AppMetrica anonymous mode to normal with APIKey " + ApiKeyUtils.createPartialApiKey(appMetricaConfig.apiKey), new Object[0]);
        }
        this.f48368m = true;
    }

    @Override // io.appmetrica.analytics.impl.Xa, io.appmetrica.analytics.impl.InterfaceC3435cd
    public final void b(boolean z13) {
        j().b(z13);
    }

    @Override // io.appmetrica.analytics.impl.Xa, io.appmetrica.analytics.impl.V6
    public final void a(int i13, Bundle bundle) {
        this.f48359d.b(bundle, null);
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        this.f48360e.a(deferredDeeplinkParametersListener);
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(DeferredDeeplinkListener deferredDeeplinkListener) {
        this.f48360e.a(deferredDeeplinkListener);
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(ReporterConfig reporterConfig) {
        this.f48362g.a(reporterConfig);
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(StartupParamsCallback startupParamsCallback, List<String> list) {
        this.f48359d.a(startupParamsCallback, list, Bb.c(this.f48361f.f46389a.getAsString("PROCESS_CFG_CLIDS")));
    }

    public final boolean a(PublicLogger publicLogger, AppMetricaConfig appMetricaConfig, Rc rc2) {
        if (this.f48366k == null) {
            a(appMetricaConfig, publicLogger);
            this.f48360e.a();
            Cc ccA = rc2.a();
            U7 u13 = new U7(ccA);
            Ec ec3 = new Ec(ccA, u13);
            this.f48357b.c().a(u13);
            this.f48366k = ec3;
            H5 h13 = this.f48365j.f46780b;
            synchronized (h13) {
                try {
                    h13.f45879a = ccA;
                    Iterator it = h13.f45880b.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC3763pe) it.next()).consume(ccA);
                    }
                    h13.f45880b.clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        }
        rc2.a();
        return false;
    }

    public final void a(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger) {
        Boolean bool = appMetricaConfig.logs;
        Boolean bool2 = Boolean.TRUE;
        if (bool2.equals(bool)) {
            publicLogger.setEnabled(true);
            PublicLogger.INSTANCE.getAnonymousInstance().setEnabled(true);
        } else {
            publicLogger.setEnabled(false);
            PublicLogger.INSTANCE.getAnonymousInstance().setEnabled(false);
        }
        if (((Boolean) WrapUtils.getOrDefault(appMetricaConfig.crashReporting, bool2)).booleanValue()) {
            this.f48357b.d().a(this.f48356a, appMetricaConfig, this);
            this.f48357b.d().b();
            publicLogger.info("Register application crash handler", new Object[0]);
        } else {
            this.f48357b.d().a();
            publicLogger.info("Disable all crash handlers", new Object[0]);
        }
        if (((Boolean) WrapUtils.getOrDefault(appMetricaConfig.sessionsAutoTrackingEnabled, bool2)).booleanValue()) {
            this.f48365j.a();
        } else {
            Xk xk2 = this.f48365j;
            synchronized (xk2) {
                if (xk2.f46785g) {
                    xk2.f46779a.unregisterListener(xk2.f46781c, ActivityEvent.RESUMED);
                    xk2.f46779a.unregisterListener(xk2.f46782d, ActivityEvent.PAUSED);
                    xk2.f46785g = false;
                }
            }
        }
        this.f48361f.d(appMetricaConfig);
        Ol ol2 = this.f48359d;
        ol2.f46354e = publicLogger;
        ol2.b(appMetricaConfig.customHosts);
        Ol ol3 = this.f48359d;
        Object obj = appMetricaConfig.additionalConfig.get("YMM_clids");
        ol3.a(obj instanceof Map ? (Map) obj : null);
        String str = (String) appMetricaConfig.additionalConfig.get("YMM_distributionReferrer");
        this.f48359d.a(str);
        if (str != null) {
            this.f48359d.b("api");
        }
        this.f48363h.a(appMetricaConfig.locationTracking, appMetricaConfig.dataSendingEnabled, appMetricaConfig.advIdentifiersTracking);
        this.f48359d.i();
    }

    @Override // io.appmetrica.analytics.impl.Xa, io.appmetrica.analytics.impl.InterfaceC3435cd
    public final void a(Location location) {
        j().a(location);
    }

    @Override // io.appmetrica.analytics.impl.Xa, io.appmetrica.analytics.impl.InterfaceC3435cd
    public final void a(boolean z13) {
        j().a(z13);
    }

    @Override // io.appmetrica.analytics.impl.Xa, io.appmetrica.analytics.impl.InterfaceC3435cd
    public final void a(String str, String str2) {
        j().a(str, str2);
    }

    @Override // io.appmetrica.analytics.impl.Xa, io.appmetrica.analytics.impl.InterfaceC3735ob
    public final InterfaceC3710nb a() {
        return this.f48362g;
    }
}
