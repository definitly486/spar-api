package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.aj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3389aj implements po {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oo f46925a = new oo();

    @Override // io.appmetrica.analytics.impl.po
    public final no a(Revenue revenue) {
        no noVar;
        oo ooVar = this.f46925a;
        C3515fg c3515fg = new C3515fg();
        Integer num = revenue.quantity;
        if (num == null || num.intValue() > 0) {
            noVar = new no(c3515fg, true, "");
        } else {
            noVar = new no(c3515fg, false, "Invalid quantity value " + num);
        }
        List<no> listAsList = Arrays.asList(noVar);
        ooVar.getClass();
        return ooVar.a(listAsList);
    }
}
