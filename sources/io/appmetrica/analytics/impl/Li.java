package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class Li implements InterfaceC3669lk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Ki f46183e = new Ki();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f46184f = TimeUnit.SECONDS.toMillis(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3674m0 f46185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3594ik f46186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeProvider f46187c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ICommonExecutor f46188d;

    public Li(C3674m0 c3674m0, C3594ik c3594ik, TimeProvider timeProvider) {
        this.f46185a = c3674m0;
        this.f46186b = c3594ik;
        this.f46187c = timeProvider;
        this.f46188d = C3952x4.l().g().b();
    }

    public final void a(Ih ih2) {
        Kh c3439ch;
        ICommonExecutor iCommonExecutor = this.f46188d;
        if (ih2.f46032b) {
            C3594ik c3594ik = this.f46186b;
            c3439ch = new C3979y6(c3594ik.f47455a, c3594ik.f47456b, c3594ik.f47457c, ih2);
        } else {
            C3594ik c3594ik2 = this.f46186b;
            c3439ch = new C3439ch(c3594ik2.f47456b, c3594ik2.f47457c, ih2);
        }
        iCommonExecutor.submit(c3439ch);
    }

    public final void b(Ih ih2) {
        long jUptimeMillis = this.f46187c.uptimeMillis();
        C3594ik c3594ik = this.f46186b;
        C3979y6 c3979y6 = new C3979y6(c3594ik.f47455a, c3594ik.f47456b, c3594ik.f47457c, ih2);
        if (this.f46185a.a()) {
            try {
                this.f46188d.submit(c3979y6).get(f46184f, TimeUnit.MILLISECONDS);
            } catch (Throwable unused) {
            }
        }
        if (!c3979y6.f46160c) {
            try {
                c3979y6.a();
            } catch (Throwable unused2) {
            }
        }
        try {
            Thread.sleep(Math.max(0L, f46184f - (this.f46187c.uptimeMillis() - jUptimeMillis)));
        } catch (Throwable unused3) {
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3669lk
    public final void reportData(int i13, Bundle bundle) {
        ICommonExecutor iCommonExecutor = this.f46188d;
        C3594ik c3594ik = this.f46186b;
        iCommonExecutor.submit(new Kn(c3594ik.f47456b, c3594ik.f47457c, i13, bundle));
    }

    public Li(C3674m0 c3674m0, C3594ik c3594ik) {
        this(c3674m0, c3594ik, new SystemTimeProvider());
    }

    public final void a(Pf pf2) {
        ICommonExecutor iCommonExecutor = this.f46188d;
        C3594ik c3594ik = this.f46186b;
        iCommonExecutor.submit(new Fe(c3594ik.f47456b, c3594ik.f47457c, pf2));
    }

    public final void b(Pf pf2) {
        ICommonExecutor iCommonExecutor = this.f46188d;
        C3594ik c3594ik = this.f46186b;
        iCommonExecutor.submit(new Ri(c3594ik.f47456b, c3594ik.f47457c, pf2));
    }
}
