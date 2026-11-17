package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import io.appmetrica.analytics.AnrListener;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ExternalAttribution;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientConfig;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientModule;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class Cc extends V2 implements InterfaceC3459db {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Long f45572s = Long.valueOf(TimeUnit.SECONDS.toMillis(1));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Bn f45573p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Nc f45574q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Dc f45575r;

    public Cc(Nc nc3) {
        super(nc3.b(), nc3.i(), nc3.h(), nc3.d(), nc3.f(), nc3.j(), nc3.g(), nc3.c(), nc3.a(), nc3.e());
        this.f45573p = new Bn(new C3738oe("Referral url"));
        this.f45574q = nc3;
        this.f45575r = new Dc(this);
        l();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3459db
    public final void a(String str, boolean z13) {
        this.f46644c.info("App opened via deeplink: " + WrapUtils.wrapToTag(str), new Object[0]);
        Ji ji2 = this.f46649h;
        PublicLogger publicLogger = this.f46644c;
        Set set = R9.f46441a;
        HashMap map = new HashMap();
        map.put("type", "open");
        map.put("link", str);
        map.put("auto", Boolean.valueOf(z13));
        String strB = Bb.b(map);
        EnumC3934wb enumC3934wb = EnumC3934wb.EVENT_TYPE_UNDEFINED;
        C3579i4 c3579i4 = new C3579i4(strB, "", 8208, 0, publicLogger);
        Sh sh2 = this.f46643b;
        ji2.getClass();
        ji2.a(Ji.a(c3579i4, sh2), sh2, 1, null);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3459db
    public final void b(String str) {
        this.f45573p.a(str);
        Ji ji2 = this.f46649h;
        PublicLogger publicLogger = this.f46644c;
        Set set = R9.f46441a;
        HashMap map = new HashMap();
        map.put("type", "referral");
        map.put("link", str);
        map.put("auto", Boolean.FALSE);
        String strB = Bb.b(map);
        EnumC3934wb enumC3934wb = EnumC3934wb.EVENT_TYPE_UNDEFINED;
        C3579i4 c3579i4 = new C3579i4(strB, "", 8208, 0, publicLogger);
        Sh sh2 = this.f46643b;
        ji2.getClass();
        ji2.a(Ji.a(c3579i4, sh2), sh2, 1, null);
        this.f46644c.info("Referral URL received: " + WrapUtils.wrapToTag(str), new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3459db
    public final void c() {
        Dc dc3 = this.f45575r;
        synchronized (dc3) {
            dc3.f45642b.a(dc3.f45641a);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3459db
    public final List<String> f() {
        return this.f46643b.f47065a.b();
    }

    @Override // io.appmetrica.analytics.impl.V2
    public final String j() {
        return "[MainReporter]";
    }

    @Override // io.appmetrica.analytics.impl.V2
    public final void k() {
        super.k();
        C3952x4.l().m().c();
    }

    public final void l() {
        Ji ji2 = this.f46649h;
        ji2.f46106c.a(this.f46643b.f47065a);
        C3626k2 c3626k2 = this.f45574q.f46269g;
        Bc bc3 = new Bc(this);
        long jLongValue = f45572s.longValue();
        synchronized (c3626k2) {
            c3626k2.a(bc3, jLongValue);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3459db
    public final void a(EnumC3673m enumC3673m) {
        if (enumC3673m == EnumC3673m.f47672b) {
            this.f46644c.info("Enable activity auto tracking", new Object[0]);
            return;
        }
        this.f46644c.warning("Could not enable activity auto tracking. " + enumC3673m.f47676a, new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3459db
    public final void b(Activity activity) {
        if (this.f45574q.f46271i.a(activity, EnumC3723o.PAUSED)) {
            this.f46644c.info("Pause session", new Object[0]);
            c(activity != null ? activity.getClass().getSimpleName() : null);
            C3626k2 c3626k2 = this.f45574q.f46269g;
            synchronized (c3626k2) {
                for (C3601j2 c3601j2 : c3626k2.f47579a) {
                    if (!c3601j2.f47507d) {
                        c3601j2.f47507d = true;
                        c3601j2.f47505b.executeDelayed(c3601j2.f47508e, c3601j2.f47506c);
                    }
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3459db
    public final void a(Activity activity) {
        if (this.f45574q.f46271i.a(activity, EnumC3723o.RESUMED)) {
            this.f46644c.info("Resume session", new Object[0]);
            d(activity != null ? activity.getClass().getSimpleName() : null);
            C3626k2 c3626k2 = this.f45574q.f46269g;
            synchronized (c3626k2) {
                for (C3601j2 c3601j2 : c3626k2.f47579a) {
                    if (c3601j2.f47507d) {
                        c3601j2.f47507d = false;
                        c3601j2.f47505b.remove(c3601j2.f47508e);
                        Cc cc3 = c3601j2.f47504a.f45519a;
                        cc3.f46649h.f46106c.b(cc3.f46643b.f47065a);
                    }
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3459db, io.appmetrica.analytics.impl.InterfaceC3435cd
    public final void b(boolean z13) {
        this.f46644c.info("Set advIdentifiersTracking to %s", Boolean.valueOf(z13));
        this.f46643b.f47066b.setAdvIdentifiersTracking(z13);
    }

    public final void a(AppMetricaConfig appMetricaConfig, boolean z13) {
        if (z13) {
            clearAppEnvironment();
        }
        a(appMetricaConfig.appEnvironment);
        b(appMetricaConfig.errorEnvironment);
        Boolean bool = (Boolean) WrapUtils.getOrDefault(appMetricaConfig.nativeCrashReporting, Boolean.TRUE);
        boolean zBooleanValue = bool.booleanValue();
        this.f46644c.info("native crash reporting enabled: %b", bool);
        if (zBooleanValue) {
            Qd qd2 = this.f45574q.f46265c;
            Context context = this.f46642a;
            qd2.f46422d = new C0(this.f46643b.f47066b.getApiKey(), qd2.f46419a.f46389a.getAsString("PROCESS_CFG_PACKAGE_NAME"), CounterConfigurationReporterType.MAIN, qd2.f46419a.f46389a.getAsInteger("PROCESS_CFG_PROCESS_ID").intValue(), qd2.f46419a.f46389a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID"), this.f46643b.d());
            File nativeCrashDirectory = FileUtils.getNativeCrashDirectory(context);
            C0 c13 = null;
            String absolutePath = nativeCrashDirectory != null ? nativeCrashDirectory.getAbsolutePath() : null;
            if (absolutePath != null) {
                NativeCrashClientModule nativeCrashClientModule = qd2.f46420b;
                D0 d13 = qd2.f46421c;
                C0 c14 = qd2.f46422d;
                if (c14 == null) {
                    kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCrashMetadata");
                } else {
                    c13 = c14;
                }
                d13.getClass();
                nativeCrashClientModule.initHandling(context, new NativeCrashClientConfig(absolutePath, D0.a(c13)));
            }
        }
        Dc dc3 = this.f45575r;
        synchronized (dc3) {
            try {
                Integer num = appMetricaConfig.anrMonitoringTimeout;
                dc3.f45641a = num != null ? num.intValue() : 5;
                Boolean bool2 = appMetricaConfig.anrMonitoring;
                if (bool2 == null) {
                    bool2 = Boolean.FALSE;
                }
                if (bool2.booleanValue()) {
                    dc3.f45642b.a(dc3.f45641a);
                } else {
                    dc3.f45642b.b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3459db, io.appmetrica.analytics.impl.InterfaceC3435cd
    public final void a(Location location) {
        this.f46643b.f47066b.setManualLocation(location);
        this.f46644c.info("Set location: %s", location);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3459db, io.appmetrica.analytics.impl.InterfaceC3435cd
    public final void a(boolean z13) {
        this.f46643b.f47066b.setLocationTracking(z13);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3459db
    public final void a(Do r13) {
        PublicLogger publicLogger = this.f46644c;
        synchronized (r13) {
            r13.f45673b = publicLogger;
        }
        Iterator it = r13.f45672a.iterator();
        while (it.hasNext()) {
            ((Consumer) it.next()).consume(publicLogger);
        }
        r13.f45672a.clear();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3459db
    public final void a(AnrListener anrListener) {
        this.f45575r.a(anrListener);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3459db
    public final void a(ExternalAttribution externalAttribution) {
        this.f46644c.info("External attribution received: %s", externalAttribution);
        Ji ji2 = this.f46649h;
        byte[] bytes = externalAttribution.toBytes();
        PublicLogger publicLogger = this.f46644c;
        Set set = R9.f46441a;
        EnumC3934wb enumC3934wb = EnumC3934wb.EVENT_TYPE_UNDEFINED;
        C3579i4 c3579i4 = new C3579i4(bytes, "", 42, publicLogger);
        Sh sh2 = this.f46643b;
        ji2.getClass();
        ji2.a(Ji.a(c3579i4, sh2), sh2, 1, null);
    }

    @Override // io.appmetrica.analytics.impl.V2, io.appmetrica.analytics.impl.InterfaceC3459db, io.appmetrica.analytics.impl.InterfaceC3435cd
    public final void a(String str, String str2) {
        super.a(str, str2);
        Qd qd2 = this.f45574q.f46265c;
        String strD = this.f46643b.d();
        C0 c13 = qd2.f46422d;
        if (c13 != null) {
            C0 c14 = new C0(c13.f45549a, c13.f45550b, c13.f45551c, c13.f45552d, c13.f45553e, strD);
            qd2.f46422d = c14;
            NativeCrashClientModule nativeCrashClientModule = qd2.f46420b;
            qd2.f46421c.getClass();
            nativeCrashClientModule.updateAppMetricaMetadata(D0.a(c14));
        }
    }
}
