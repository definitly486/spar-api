package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import io.appmetrica.analytics.internal.AppMetricaService;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class Dk implements ServiceWakeLock {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f45657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ck f45658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f45659c = new HashMap();

    public Dk(Context context, Ck ck2) {
        this.f45657a = context;
        this.f45658b = ck2;
    }

    public final String a(String str) {
        return "io.appmetrica.analytics.ACTION_SERVICE_WAKELOCK." + str;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock
    public final synchronized boolean acquireWakeLock(String str) {
        try {
            if (this.f45659c.get(str) == null) {
                HashMap map = this.f45659c;
                Ck ck2 = this.f45658b;
                Context context = this.f45657a;
                String strA = a(str);
                ck2.f45593a.getClass();
                Intent intent = new Intent(context, (Class<?>) AppMetricaService.class);
                intent.setAction(strA);
                Bk bk2 = new Bk();
                try {
                    context.bindService(intent, bk2, 1);
                } catch (Throwable unused) {
                    bk2 = null;
                }
                map.put(str, bk2);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f45659c.get(str) != null;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock
    public final synchronized void releaseWakeLock(String str) {
        ServiceConnection serviceConnection = (ServiceConnection) this.f45659c.get(str);
        if (serviceConnection != null) {
            Ck ck2 = this.f45658b;
            a(str);
            Context context = this.f45657a;
            ck2.getClass();
            try {
                context.unbindService(serviceConnection);
            } catch (Throwable unused) {
            }
        }
    }
}
