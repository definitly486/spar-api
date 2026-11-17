package io.appmetrica.analytics.impl;

import android.content.Context;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.yj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3992yj implements B4 {
    @Override // io.appmetrica.analytics.impl.B4
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C3892uj a(Context context, C3978y5 c3978y5, C3653l4 c3653l4, K4 k13) {
        Og og2;
        C3654l5 c3654l5 = new C3654l5(c3653l4.f47625b, c3653l4.f47624a);
        synchronized (c3978y5) {
            og2 = (Og) c3978y5.f48500a.get(c3654l5.toString());
        }
        return new C3892uj(og2);
    }
}
