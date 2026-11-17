package io.appmetrica.analytics;

import android.content.Context;
import io.appmetrica.analytics.impl.Ad;
import io.appmetrica.analytics.impl.Ai;
import io.appmetrica.analytics.impl.Bd;
import io.appmetrica.analytics.impl.C3848t0;
import io.appmetrica.analytics.impl.C3936wd;
import io.appmetrica.analytics.impl.C3986yd;
import io.appmetrica.analytics.impl.C4011zd;
import io.appmetrica.analytics.impl.Cd;
import io.appmetrica.analytics.impl.Dd;

/* JADX INFO: loaded from: classes3.dex */
public final class ModulesFacade {
    public static final int EXTERNAL_ATTRIBUTION_ADJUST = 2;
    public static final int EXTERNAL_ATTRIBUTION_AIRBRIDGE = 5;
    public static final int EXTERNAL_ATTRIBUTION_APPSFLYER = 1;
    public static final int EXTERNAL_ATTRIBUTION_KOCHAVA = 3;
    public static final int EXTERNAL_ATTRIBUTION_SINGULAR = 6;
    public static final int EXTERNAL_ATTRIBUTION_TENJIN = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Dd f45120a = new Dd();

    public static IModuleReporter getModuleReporter(Context context, String str) {
        Dd dd2 = f45120a;
        C3936wd c3936wd = dd2.f45644b;
        c3936wd.f48328b.a(context);
        c3936wd.f48330d.a(str);
        dd2.f45645c.f46096a.a(context.getApplicationContext().getApplicationContext());
        return Ai.f45472a.a(context.getApplicationContext(), str);
    }

    public static boolean isActivatedForApp() {
        boolean z13;
        Dd dd2 = f45120a;
        dd2.f45644b.getClass();
        dd2.f45645c.getClass();
        dd2.f45643a.getClass();
        synchronized (C3848t0.class) {
            z13 = C3848t0.f48088f;
        }
        return z13;
    }

    public static void reportAdRevenue(AdRevenue adRevenue) {
        reportAdRevenue(adRevenue, Boolean.TRUE);
    }

    public static void reportEvent(ModuleEvent moduleEvent) {
        Dd dd2 = f45120a;
        dd2.f45644b.f48327a.a(null);
        dd2.f45645c.getClass();
        dd2.f45646d.execute(new C4011zd(dd2, moduleEvent));
    }

    public static void reportExternalAttribution(int i13, String str) {
        Dd dd2 = f45120a;
        dd2.f45644b.getClass();
        dd2.f45645c.getClass();
        dd2.f45646d.execute(new Ad(dd2, i13, str));
    }

    public static void sendEventsBuffer() {
        Dd dd2 = f45120a;
        dd2.f45644b.getClass();
        dd2.f45645c.getClass();
        AppMetrica.sendEventsBuffer();
    }

    public static void setAdvIdentifiersTracking(boolean z13) {
        Dd dd2 = f45120a;
        dd2.f45644b.getClass();
        dd2.f45645c.getClass();
        dd2.f45646d.execute(new Bd(dd2, z13));
    }

    public static void setProxy(Dd dd2) {
        f45120a = dd2;
    }

    public static void setSessionExtra(String str, byte[] bArr) {
        Dd dd2 = f45120a;
        dd2.f45644b.f48329c.a(str);
        dd2.f45645c.getClass();
        dd2.f45646d.execute(new Cd(dd2, str, bArr));
    }

    public static void reportAdRevenue(AdRevenue adRevenue, Boolean bool) {
        Dd dd2 = f45120a;
        boolean zBooleanValue = bool.booleanValue();
        dd2.f45644b.getClass();
        dd2.f45645c.getClass();
        dd2.f45646d.execute(new C3986yd(dd2, adRevenue, zBooleanValue));
    }
}
