package io.appmetrica.analytics.impl;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class Ph implements B4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3853t5 f46392a;

    public Ph(InterfaceC3853t5 interfaceC3853t5) {
        this.f46392a = interfaceC3853t5;
    }

    @Override // io.appmetrica.analytics.impl.B4
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Ng a(Context context, C3978y5 c3978y5, C3653l4 c3653l4, K4 k13) {
        Og og2;
        C3654l5 c3654l5 = new C3654l5(c3653l4.f47625b, c3653l4.f47624a);
        Pg pg2 = new Pg(this.f46392a);
        synchronized (c3978y5) {
            og2 = (Og) c3978y5.a(c3654l5, k13, pg2, c3978y5.f48500a);
        }
        return new Ng(context, og2);
    }
}
