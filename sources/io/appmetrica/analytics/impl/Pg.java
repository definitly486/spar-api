package io.appmetrica.analytics.impl;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class Pg implements InterfaceC3558h8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3853t5 f46391a;

    public Pg(InterfaceC3853t5 interfaceC3853t5) {
        this.f46391a = interfaceC3853t5;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3558h8
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Og a(Context context, C3654l5 c3654l5, K4 k13) {
        return new Og(context, c3654l5, k13, this.f46391a, new C3679m5(), Hl.a());
    }

    public final InterfaceC3853t5 a() {
        return this.f46391a;
    }
}
