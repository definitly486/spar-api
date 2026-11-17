package io.appmetrica.analytics.impl;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class Ba extends V4 {
    public Ba(S4 s13) {
        super(s13);
    }

    @Override // io.appmetrica.analytics.impl.V4
    public final boolean a(C3655l6 c3655l6, P4 p13) {
        Bundle bundle = c3655l6.f47643m;
        C3834sb c3834sb = bundle != null ? (C3834sb) bundle.getParcelable("io.appmetrica.analytics.impl.IdentifiersData") : null;
        if (c3834sb != null) {
            if (c3834sb.f48059d) {
                J4 j13 = p13.f46371b.f46484d.f46236a;
                Boolean bool = j13.f46067n;
                Boolean bool2 = j13.f46062i;
                Ia.F.b().c(bool != null ? bool.booleanValue() : true);
                Ia.F.g().b(bool2);
            }
        }
        this.f46655a.a(c3834sb);
        return false;
    }
}
