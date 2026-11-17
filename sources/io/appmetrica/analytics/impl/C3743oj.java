package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.oj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3743oj implements InterfaceC3623k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C3614jf f47840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ScreenInfo f47841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f47842c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f47843d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C3718nj f47844e = new C3718nj();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public WeakReference f47845f = new WeakReference(null);

    public final synchronized void a(Activity activity) {
        try {
            this.f47845f = new WeakReference(activity);
            if (!this.f47843d) {
                if (this.f47840a == null) {
                    this.f47840a = new C3614jf(C3880u7.a(activity).a());
                }
                C3614jf c3614jf = this.f47840a;
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(c3614jf);
                this.f47841b = c3614jf.p();
                if (this.f47840a == null) {
                    this.f47840a = new C3614jf(C3880u7.a(activity).a());
                }
                C3614jf c3614jf2 = this.f47840a;
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(c3614jf2);
                this.f47842c = c3614jf2.t();
                this.f47843d = true;
            }
            if (this.f47841b == null) {
                b(activity);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void b(Context context) {
        if (context != null) {
            this.f47844e.getClass();
            ScreenInfo screenInfoA = C3718nj.a(context);
            if (screenInfoA == null || kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(screenInfoA, this.f47841b)) {
                return;
            }
            this.f47841b = screenInfoA;
            if (this.f47840a == null) {
                this.f47840a = new C3614jf(C3880u7.a(context).a());
            }
            C3614jf c3614jf = this.f47840a;
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(c3614jf);
            c3614jf.a(this.f47841b);
        }
    }

    public final synchronized ScreenInfo a(Context context) {
        try {
            if (!this.f47843d) {
                if (this.f47840a == null) {
                    this.f47840a = new C3614jf(C3880u7.a(context).a());
                }
                C3614jf c3614jf = this.f47840a;
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(c3614jf);
                this.f47841b = c3614jf.p();
                if (this.f47840a == null) {
                    this.f47840a = new C3614jf(C3880u7.a(context).a());
                }
                C3614jf c3614jf2 = this.f47840a;
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(c3614jf2);
                this.f47842c = c3614jf2.t();
                this.f47843d = true;
            }
            b((Context) this.f47845f.get());
            if (this.f47841b == null) {
                if (AndroidUtils.isApiAchieved(30)) {
                    if (!this.f47842c) {
                        b(context);
                        this.f47842c = true;
                        if (this.f47840a == null) {
                            this.f47840a = new C3614jf(C3880u7.a(context).a());
                        }
                        C3614jf c3614jf3 = this.f47840a;
                        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(c3614jf3);
                        c3614jf3.v();
                    }
                } else {
                    b(context);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f47841b;
    }

    public final void a(C3614jf c3614jf) {
        this.f47840a = c3614jf;
    }
}
