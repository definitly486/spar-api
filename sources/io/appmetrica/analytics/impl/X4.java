package io.appmetrica.analytics.impl;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class X4 extends Qf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final W4 f46758a;

    public X4(S4 s13) {
        this.f46758a = new W4(s13);
    }

    @Override // io.appmetrica.analytics.impl.Qf
    public final AbstractC3807r9 a(int i13) {
        ArrayList arrayList = new ArrayList();
        int iOrdinal = EnumC3934wb.a(i13).ordinal();
        if (iOrdinal == 12) {
            arrayList.add(this.f46758a.f46699a);
        } else if (iOrdinal == 14) {
            arrayList.add(this.f46758a.f46700b);
        } else if (iOrdinal == 34) {
            arrayList.add(this.f46758a.f46701c);
        }
        return new C3783q9(arrayList);
    }
}
