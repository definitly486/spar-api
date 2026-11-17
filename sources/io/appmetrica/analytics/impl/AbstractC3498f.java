package io.appmetrica.analytics.impl;

import android.content.Context;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3498f implements A4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f47199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Og f47200b;

    public AbstractC3498f(Context context, Og og2) {
        this.f47199a = context.getApplicationContext();
        this.f47200b = og2;
        og2.a(this);
        Ia.j().m().b(this);
    }

    @Override // io.appmetrica.analytics.impl.A4
    public final void a(C3655l6 c3655l6, K4 k13) {
        b(c3655l6, k13);
    }

    public final Og b() {
        return this.f47200b;
    }

    public abstract void b(C3655l6 c3655l6, K4 k13);

    public final Context c() {
        return this.f47199a;
    }

    @Override // io.appmetrica.analytics.impl.A4
    public final void a() {
        this.f47200b.b(this);
        Ia.F.l().a(this);
    }
}
