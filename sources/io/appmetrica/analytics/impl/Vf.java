package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class Vf implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ma f46675a;

    public Vf() {
        this(new Ma(20, 100));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Qi fromModel(List<String> list) {
        Jn jnA = this.f46675a.a((List<Object>) list);
        List list2 = (List) jnA.f46116a;
        I8[] i8Arr = new I8[0];
        if (list2 != null) {
            i8Arr = new I8[list2.size()];
            for (int i13 = 0; i13 < list2.size(); i13++) {
                I8 i14 = new I8();
                i8Arr[i13] = i14;
                i14.f46001a = StringUtils.getUTF8Bytes((String) list2.get(i13));
            }
        }
        jnA.f46117b.getBytesTruncated();
        return new Qi(i8Arr, jnA.f46117b);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Vf(Ma ma3) {
        this.f46675a = ma3;
    }

    public final List<String> a(Qi qi2) {
        throw new UnsupportedOperationException();
    }
}
