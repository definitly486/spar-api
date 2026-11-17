package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.internal.IAppMetricaService;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3674m0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f47677j = TimeUnit.SECONDS.toMillis(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f47678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ICommonExecutor f47679b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CountDownLatch f47682e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final N1 f47684g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public IAppMetricaService f47681d = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f47683f = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final RunnableC3624k0 f47685h = new RunnableC3624k0(this);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ServiceConnectionC3649l0 f47686i = new ServiceConnectionC3649l0(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f47680c = false;

    public C3674m0(Context context, ICommonExecutor iCommonExecutor, N1 n13) {
        this.f47678a = context.getApplicationContext();
        this.f47679b = iCommonExecutor;
        this.f47684g = n13;
    }

    public final synchronized boolean a() {
        return this.f47681d != null;
    }

    public final void b() {
        synchronized (this.f47683f) {
            this.f47679b.remove(this.f47685h);
        }
    }

    public final void c() {
        ICommonExecutor iCommonExecutor = this.f47679b;
        synchronized (this.f47683f) {
            try {
                iCommonExecutor.remove(this.f47685h);
                if (!this.f47680c) {
                    iCommonExecutor.executeDelayed(this.f47685h, f47677j);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a(Long l13) {
        try {
            synchronized (this) {
                try {
                    CountDownLatch countDownLatch = this.f47682e;
                    if (countDownLatch == null) {
                        return;
                    }
                    countDownLatch.await(l13.longValue(), TimeUnit.MILLISECONDS);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (InterruptedException unused) {
        }
    }
}
