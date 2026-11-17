package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Handler;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Set;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.wg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3939wg implements InterfaceC3839sg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f48332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ji f48333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3614jf f48334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C3507f8 f48335d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Eg f48336e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Handler f48337f;

    public C3939wg(Ji ji2, C3614jf c3614jf, Handler handler) {
        this(ji2, c3614jf, handler, c3614jf.s());
    }

    public final void a() {
        if (this.f48332a) {
            return;
        }
        Ji ji2 = this.f48333b;
        Gg gg2 = new Gg(this.f48337f, this);
        ji2.getClass();
        Bundle bundle = new Bundle();
        bundle.putParcelable("io.appmetrica.analytics.impl.referrer.common.ReferrerResultReceiver", gg2);
        PublicLogger anonymousInstance = PublicLogger.getAnonymousInstance();
        Set set = R9.f46441a;
        EnumC3934wb enumC3934wb = EnumC3934wb.EVENT_TYPE_UNDEFINED;
        C3579i4 c3579i4 = new C3579i4("", "", 4098, 0, anonymousInstance);
        c3579i4.f47643m = bundle;
        C3375a5 c3375a5 = ji2.f46104a;
        ji2.a(Ji.a(c3579i4, c3375a5), c3375a5, 1, null);
    }

    public C3939wg(Ji ji2, C3614jf c3614jf, Handler handler, boolean z13) {
        this(ji2, c3614jf, handler, z13, new C3507f8(z13), new Eg());
    }

    public C3939wg(Ji ji2, C3614jf c3614jf, Handler handler, boolean z13, C3507f8 c3507f8, Eg eg2) {
        this.f48333b = ji2;
        this.f48334c = c3614jf;
        this.f48332a = z13;
        this.f48335d = c3507f8;
        this.f48336e = eg2;
        this.f48337f = handler;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3839sg
    public final void a(Ag ag2) {
        String str = ag2 == null ? null : ag2.f45468a;
        if (this.f48332a) {
            return;
        }
        synchronized (this) {
            C3507f8 c3507f8 = this.f48335d;
            this.f48336e.getClass();
            c3507f8.f47212d = Eg.a(str);
            c3507f8.a();
        }
    }

    public final synchronized void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        try {
            C3507f8 c3507f8 = this.f48335d;
            c3507f8.f47211c = deferredDeeplinkParametersListener;
            if (c3507f8.f47209a) {
                c3507f8.a(1);
            } else {
                c3507f8.a();
            }
            this.f48334c.u();
        } catch (Throwable th2) {
            this.f48334c.u();
            throw th2;
        }
    }

    public final synchronized void a(DeferredDeeplinkListener deferredDeeplinkListener) {
        try {
            C3507f8 c3507f8 = this.f48335d;
            c3507f8.f47210b = deferredDeeplinkListener;
            if (c3507f8.f47209a) {
                c3507f8.a(1);
            } else {
                c3507f8.a();
            }
            this.f48334c.u();
        } catch (Throwable th2) {
            this.f48334c.u();
            throw th2;
        }
    }
}
