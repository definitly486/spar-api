package io.appmetrica.analytics.impl;

import android.util.Pair;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.s2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3825s2 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3721nm fromModel(C3800r2 c3800r2) {
        C3671lm c3671lm;
        C3721nm c3721nm = new C3721nm();
        c3721nm.f47783a = new C3696mm[c3800r2.f47957a.size()];
        for (int i13 = 0; i13 < c3800r2.f47957a.size(); i13++) {
            C3696mm c3696mm = new C3696mm();
            Pair pair = (Pair) c3800r2.f47957a.get(i13);
            c3696mm.f47717a = (String) pair.first;
            if (pair.second != null) {
                c3696mm.f47718b = new C3671lm();
                C3776q2 c3776q2 = (C3776q2) pair.second;
                if (c3776q2 == null) {
                    c3671lm = null;
                } else {
                    C3671lm c3671lm2 = new C3671lm();
                    c3671lm2.f47668a = c3776q2.f47909a;
                    c3671lm = c3671lm2;
                }
                c3696mm.f47718b = c3671lm;
            }
            c3721nm.f47783a[i13] = c3696mm;
        }
        return c3721nm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3800r2 toModel(C3721nm c3721nm) {
        ArrayList arrayList = new ArrayList();
        for (C3696mm c3696mm : c3721nm.f47783a) {
            String str = c3696mm.f47717a;
            C3671lm c3671lm = c3696mm.f47718b;
            arrayList.add(new Pair(str, c3671lm == null ? null : new C3776q2(c3671lm.f47668a)));
        }
        return new C3800r2(arrayList);
    }
}
