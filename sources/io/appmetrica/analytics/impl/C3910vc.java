package io.appmetrica.analytics.impl;

import android.content.Context;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.vc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3910vc implements B4 {
    @Override // io.appmetrica.analytics.impl.B4
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final P4 a(Context context, C3978y5 c3978y5, C3653l4 c3653l4, K4 k13) {
        S4 s13;
        Q4 q13 = new Q4(c3653l4.f47625b);
        T4 t13 = new T4();
        synchronized (c3978y5) {
            s13 = (S4) c3978y5.a(q13, k13, t13, c3978y5.f48501b);
        }
        return new P4(context, s13, k13);
    }
}
