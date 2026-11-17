package io.appmetrica.analytics.impl;

import android.content.Context;
import android.util.SparseArray;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.r4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3802r4 extends AbstractC3486ed {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3614jf f47960a;

    public C3802r4(Context context) {
        this(new C3614jf(C3880u7.a(context).b()));
    }

    @Override // io.appmetrica.analytics.impl.AbstractC3486ed
    public final void a(int i13) {
        this.f47960a.c(i13);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC3486ed
    public final int b() {
        return (int) this.f47960a.a(-1L);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC3486ed
    public final SparseArray<InterfaceC3461dd> c() {
        return new SparseArray<>();
    }

    public C3802r4(C3614jf c3614jf) {
        this.f47960a = c3614jf;
    }
}
