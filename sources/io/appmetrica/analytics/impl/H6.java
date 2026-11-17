package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class H6 implements InterfaceC3760pb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I6 f45881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Sh f45882b;

    public H6(I6 i13) {
        this.f45881a = i13;
        this.f45882b = i13.a();
        C3952x4.l().getClass();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3760pb
    public final void a(Nn nn2) {
        Ji ji2 = this.f45881a.f45979a;
        Ih ihA = ji2.a(nn2, this.f45882b);
        Sh sh2 = ihA.f46035e;
        Pl pl2 = ji2.f46108e;
        if (pl2 != null) {
            sh2.f47066b.setUuid(((Ol) pl2).g());
        } else {
            sh2.getClass();
        }
        ji2.f46106c.b(ihA);
        LoggerStorage.getMainPublicOrAnonymousLogger().info("Unhandled exception received: " + nn2, new Object[0]);
    }

    public final void a(AppMetricaConfig appMetricaConfig) {
        Map<String, String> map = appMetricaConfig.errorEnvironment;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                Sh sh2 = this.f45882b;
                String key = entry.getKey();
                String value = entry.getValue();
                synchronized (sh2) {
                    W8 w13 = sh2.f46510c;
                    w13.f46707b.b(w13.f46706a, key, value);
                }
            }
        }
    }
}
