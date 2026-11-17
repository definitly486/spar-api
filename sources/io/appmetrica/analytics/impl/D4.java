package io.appmetrica.analytics.impl;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class D4 {
    public static B4 a(C3653l4 c3653l4) {
        switch (C4.f45558a[c3653l4.f47628e.ordinal()]) {
            case 1:
                return new C3910vc();
            case 2:
                return new C3917vj();
            case 3:
                return new C3992yj();
            case 4:
                return new Ph(new Rh());
            case 5:
                return new Ph(new C3493ek());
            case 6:
                return new Gc();
            case 7:
                return new Gc();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
