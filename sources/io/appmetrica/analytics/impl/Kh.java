package io.appmetrica.analytics.impl;

import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.location.DeviceOrientationRequest;
import io.appmetrica.analytics.internal.IAppMetricaService;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Kh implements Callable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Jh f46157d = new Jh();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3674m0 f46158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Zk f46159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f46160c;

    public Kh(C3674m0 c3674m0, Zk zk2) {
        this.f46158a = c3674m0;
        this.f46159b = zk2;
    }

    public abstract void a(IAppMetricaService iAppMetricaService);

    public void a(Throwable th2) {
    }

    public final C3674m0 b() {
        return this.f46158a;
    }

    public boolean c() {
        C3674m0 c3674m0 = this.f46158a;
        synchronized (c3674m0) {
            try {
                if (c3674m0.f47681d == null) {
                    c3674m0.f47682e = new CountDownLatch(1);
                    Intent intentA = Ak.a(c3674m0.f47678a);
                    try {
                        c3674m0.f47684g.b(c3674m0.f47678a);
                        c3674m0.f47678a.bindService(intentA, c3674m0.f47686i, 1);
                    } catch (Throwable unused) {
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f46158a.a(Long.valueOf(DeviceOrientationRequest.OUTPUT_PERIOD_FAST));
        return true;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        a();
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public final boolean d() {
        return this.f46160c;
    }

    public final void a(boolean z13) {
        this.f46160c = z13;
    }

    public void a() {
        IAppMetricaService iAppMetricaService;
        try {
            if (this.f46160c) {
                return;
            }
            this.f46160c = true;
            int i13 = 0;
            do {
                C3674m0 c3674m0 = this.f46158a;
                synchronized (c3674m0) {
                    iAppMetricaService = c3674m0.f47681d;
                }
                if (iAppMetricaService != null) {
                    try {
                        a(iAppMetricaService);
                        Zk zk2 = this.f46159b;
                        if (zk2 != null && !((C3916vi) zk2).a()) {
                            return;
                        }
                        this.f46158a.c();
                        return;
                    } catch (RemoteException unused) {
                    }
                }
                i13++;
                if (!c() || U1.f46594e.get()) {
                    return;
                }
            } while (i13 < 3);
        } catch (Throwable th2) {
            a(th2);
        }
    }
}
