package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class N1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3908va f46246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f46247b;

    public N1() {
        this(new C3908va());
    }

    public final synchronized long a(Context context) {
        String strA;
        try {
            this.f46246a.getClass();
            strA = AbstractC3484eb.a(FileUtils.getFileFromAppStorage(context, "metrica_service_settings.dat"));
        } catch (Throwable unused) {
        }
        return !TextUtils.isEmpty(strA) ? new JSONObject(strA).optLong("delay") : 0L;
    }

    public final void b(Context context) {
        synchronized (this) {
        }
        if (this.f46247b) {
            return;
        }
        long jA = a(context);
        if (jA > 0) {
            try {
                Thread.sleep(jA);
            } catch (Throwable unused) {
            }
        }
        this.f46247b = true;
    }

    public N1(C3908va c3908va) {
        this.f46247b = false;
        this.f46246a = c3908va;
    }
}
