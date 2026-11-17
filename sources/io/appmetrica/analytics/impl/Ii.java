package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class Ii extends C3622jn {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Hi f46036d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ICommonExecutor f46037e;

    public Ii(C3828s5 c3828s5, Kl kl2, ICommonExecutor iCommonExecutor) {
        super(c3828s5, kl2);
        this.f46036d = new Hi(this);
        this.f46037e = iCommonExecutor;
    }

    @Override // io.appmetrica.analytics.impl.C3622jn
    public final void a() {
        this.f46037e.remove(this.f46036d);
    }

    @Override // io.appmetrica.analytics.impl.C3622jn
    public final void f() {
        this.f47571b.a();
        C3965xh c3965xh = (C3965xh) ((C3828s5) this.f47570a).f48040k.a();
        if (c3965xh.f48439k.a(c3965xh.f48438j)) {
            String str = c3965xh.f48441m;
            if (TextUtils.isEmpty(str) || "-1".equals(str)) {
                return;
            }
            try {
                a(C3638ke.a((C3828s5) this.f47570a));
            } catch (Throwable unused) {
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.C3622jn
    public final void g() {
        this.f46037e.executeDelayed(this.f46036d, TimeUnit.SECONDS.toMillis(1L));
    }

    public final void h() {
        if (this.f47572c.get()) {
            return;
        }
        this.f46037e.remove(this.f46036d);
        if (((C3965xh) ((C3828s5) this.f47570a).f48040k.a()).f48435g > 0) {
            this.f46037e.executeDelayed(this.f46036d, TimeUnit.SECONDS.toMillis(((C3965xh) ((C3828s5) this.f47570a).f48040k.a()).f48435g));
        }
    }
}
