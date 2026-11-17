package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.hk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3570hk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile long f47403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C3714nf f47404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TimeProvider f47405c;

    public static C3570hk c() {
        return AbstractC3545gk.f47346a;
    }

    public final synchronized long a() {
        return (System.currentTimeMillis() / 1000) + this.f47403a;
    }

    public final synchronized void b() {
        this.f47404b.d(false);
        this.f47404b.b();
    }

    public final synchronized long d() {
        return this.f47403a;
    }

    public final synchronized void e() {
        a(Ia.F.x(), new SystemTimeProvider());
    }

    public final synchronized boolean f() {
        return this.f47404b.b(true);
    }

    public final synchronized void a(long j13, Long l13) {
        try {
            this.f47403a = (j13 - this.f47405c.currentTimeMillis()) / 1000;
            boolean z13 = true;
            if (this.f47404b.b(true)) {
                if (l13 != null) {
                    long jAbs = Math.abs(j13 - this.f47405c.currentTimeMillis());
                    C3714nf c3714nf = this.f47404b;
                    if (jAbs <= TimeUnit.SECONDS.toMillis(l13.longValue())) {
                        z13 = false;
                    }
                    c3714nf.d(z13);
                } else {
                    this.f47404b.d(false);
                }
            }
            this.f47404b.d(this.f47403a);
            this.f47404b.b();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void a(C3714nf c3714nf, TimeProvider timeProvider) {
        this.f47404b = c3714nf;
        this.f47403a = c3714nf.a(0);
        this.f47405c = timeProvider;
    }
}
