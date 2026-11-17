package io.appmetrica.analytics.impl;

import java.util.LinkedList;

/* JADX INFO: loaded from: classes3.dex */
public final class G9 extends Qf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4015zh f45850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bh f45851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3716nh f45852c;

    public G9(C3828s5 c3828s5) {
        this.f45850a = new C4015zh(c3828s5);
        this.f45851b = new Bh(c3828s5);
        this.f45852c = new C3716nh(c3828s5);
    }

    @Override // io.appmetrica.analytics.impl.Qf
    public final AbstractC3807r9 a(int i13) {
        LinkedList linkedList = new LinkedList();
        int iOrdinal = EnumC3934wb.a(i13).ordinal();
        if (iOrdinal == 1) {
            linkedList.add(this.f45850a);
        } else if (iOrdinal == 3) {
            linkedList.add(this.f45852c);
        } else if (iOrdinal == 27) {
            linkedList.add(this.f45851b);
            linkedList.add(this.f45850a);
        }
        return new C3783q9(linkedList);
    }
}
