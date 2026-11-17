package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.Iterator;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.i9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3584i9 implements ProtobufConverter {
    public static P9 a(C3559h9 c3559h9) {
        P9 p13 = new P9();
        p13.f46381d = new int[c3559h9.f47378b.size()];
        Iterator it = c3559h9.f47378b.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            p13.f46381d[i13] = ((Integer) it.next()).intValue();
            i13++;
        }
        p13.f46380c = c3559h9.f47380d;
        p13.f46379b = c3559h9.f47379c;
        p13.f46378a = c3559h9.f47377a;
        return p13;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final /* bridge */ /* synthetic */ Object fromModel(Object obj) {
        return a((C3559h9) obj);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        P9 p13 = (P9) obj;
        return new C3559h9(p13.f46378a, p13.f46379b, p13.f46380c, CollectionUtils.hashSetFromIntArray(p13.f46381d));
    }
}
