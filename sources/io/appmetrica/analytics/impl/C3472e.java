package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.Looper;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3472e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f47136g = TimeUnit.SECONDS.toMillis(1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f47137h = "WatchDog-" + Od.f46334a.incrementAndGet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f47138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f47139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f47140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C3447d f47141d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f47142e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Runnable f47143f;

    public C3472e(Yb yb3) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f47138a = copyOnWriteArrayList;
        this.f47139b = new AtomicInteger();
        this.f47140c = new Handler(Looper.getMainLooper());
        this.f47142e = new AtomicBoolean();
        this.f47143f = new Runnable() { // from class: io.appmetrica.analytics.impl.pmvmpeiblj
            @Override // java.lang.Runnable
            public final void run() {
                this.f47895zdlpuopuiu.a();
            }
        };
        copyOnWriteArrayList.add(yb3);
    }

    public final /* synthetic */ void a() {
        this.f47142e.set(true);
    }

    public final synchronized void b() {
        C3447d c3447d = this.f47141d;
        if (c3447d != null) {
            c3447d.f47055a.set(false);
            this.f47141d = null;
            PublicLogger.getAnonymousInstance().info("Stop ANR monitoring", new Object[0]);
        }
    }

    public final synchronized void a(int i13) {
        AtomicInteger atomicInteger = this.f47139b;
        int i14 = 5;
        if (i13 >= 5) {
            i14 = i13;
        }
        atomicInteger.set(i14);
        if (this.f47141d == null) {
            C3447d c3447d = new C3447d(this);
            this.f47141d = c3447d;
            try {
                c3447d.setName(f47137h);
            } catch (SecurityException unused) {
            }
            this.f47141d.start();
            PublicLogger.getAnonymousInstance().info("Start ANR monitoring with timeout: %s seconds", Integer.valueOf(i13));
        }
    }
}
