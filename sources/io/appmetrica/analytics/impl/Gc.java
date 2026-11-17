package io.appmetrica.analytics.impl;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class Gc implements B4 {
    @Override // io.appmetrica.analytics.impl.B4
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Hc a(Context context, C3978y5 c3978y5, C3653l4 c3653l4, K4 k13) {
        Og og2;
        Ic ic3 = new Ic(c3653l4.f47625b, c3653l4.f47624a);
        Pg pg2 = new Pg(new Lc());
        synchronized (c3978y5) {
            og2 = (Og) c3978y5.a(ic3, k13, pg2, c3978y5.f48500a);
        }
        return new Hc(context, og2);
    }
}
