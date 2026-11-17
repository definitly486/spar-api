package io.appmetrica.analytics;

import android.content.Context;
import io.appmetrica.analytics.impl.A0;
import io.appmetrica.analytics.impl.C3952x4;
import io.appmetrica.analytics.impl.Wb;
import io.appmetrica.analytics.impl.Xb;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;

/* JADX INFO: loaded from: classes3.dex */
public class AppMetricaLibraryAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static A0 f45097a = new A0();

    public static void activate(Context context) {
        A0 a13 = f45097a;
        if (!a13.f45430a.f46709a.a(context).f47784a) {
            ImportantLogger.INSTANCE.info("[AppMetricaLibraryAdapterProxy]", "Activation failed due to context is null", new Object[0]);
            return;
        }
        Xb xb3 = a13.f45431b;
        Context applicationContext = context.getApplicationContext();
        xb3.getClass();
        C3952x4.l().f48377g.a(applicationContext);
        C3952x4.l().b().a(applicationContext, AppMetricaLibraryAdapterConfig.newConfigBuilder().build());
    }

    public static void reportEvent(String str, String str2, String str3) {
        f45097a.a(str, str2, str3);
    }

    public static void setAdvIdentifiersTracking(boolean z13) {
        A0 a13 = f45097a;
        if (a13.f45430a.f46711c.a((Void) null).f47784a) {
            a13.f45431b.getClass();
            ModulesFacade.setAdvIdentifiersTracking(z13);
        }
    }

    public static void setProxy(A0 a13) {
        f45097a = a13;
    }

    public static void activate(Context context, AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        A0 a13 = f45097a;
        Wb wb3 = a13.f45430a;
        if (wb3.f46709a.a(context).f47784a && wb3.f46710b.a(appMetricaLibraryAdapterConfig).f47784a) {
            Xb xb3 = a13.f45431b;
            Context applicationContext = context.getApplicationContext();
            xb3.getClass();
            C3952x4.l().f48377g.a(applicationContext);
            C3952x4.l().b().a(applicationContext, appMetricaLibraryAdapterConfig);
            return;
        }
        ImportantLogger.INSTANCE.info("[AppMetricaLibraryAdapterProxy]", "Activation failed due to context is null or invalid config", new Object[0]);
    }
}
