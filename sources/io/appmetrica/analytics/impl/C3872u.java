package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3872u implements InterfaceC3897v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f48152a;

    public C3872u(Context context) {
        this.f48152a = context;
    }

    public final String a() {
        C3952x4 c3952x4L = C3952x4.l();
        Context context = this.f48152a;
        C3560ha c3560ha = c3952x4L.f48390t;
        if (c3560ha == null) {
            synchronized (c3952x4L) {
                try {
                    c3560ha = c3952x4L.f48390t;
                    if (c3560ha == null) {
                        c3560ha = new C3560ha(context);
                        c3952x4L.f48390t = c3560ha;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        Bundle applicationMetaData = c3560ha.f47384d.getApplicationMetaData(c3560ha.f47381a);
        if (applicationMetaData != null) {
            return applicationMetaData.getString("io.appmetrica.analytics.plugin_supported_ad_revenue_sources");
        }
        return null;
    }
}
