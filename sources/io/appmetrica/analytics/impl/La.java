package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class La extends O2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Oa f46177b;

    public La(int i13) {
        this(i13, null);
    }

    public int b(Object obj) {
        return 0;
    }

    public La(int i13, Oa oa3) {
        super(i13);
        this.f46177b = oa3;
    }

    @Override // io.appmetrica.analytics.impl.O2, io.appmetrica.analytics.impl.Oa
    public final Jn a(List<Object> list) {
        int iB;
        int i13 = 0;
        if (list == null || (list.size() <= this.f46302a && this.f46177b == null)) {
            iB = 0;
        } else {
            ArrayList arrayList = new ArrayList();
            iB = 0;
            int i14 = 0;
            for (Object obj : list) {
                if (i14 < this.f46302a) {
                    Oa oa3 = this.f46177b;
                    if (oa3 != null) {
                        Jn jnA = oa3.a(obj);
                        Object obj2 = jnA.f46116a;
                        iB += jnA.f46117b.getBytesTruncated();
                        io.a(obj, jnA.f46116a);
                        obj = obj2;
                    }
                    arrayList.add(obj);
                } else {
                    i13++;
                    iB += b(obj);
                }
                i14++;
            }
            list = arrayList;
        }
        return new Jn(list, new I4(i13, iB));
    }

    public final Oa b() {
        return this.f46177b;
    }
}
