package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class V implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3896un f46635a;

    public V(C3896un c3896un) {
        this.f46635a = c3896un;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3705n6 fromModel(U u13) {
        C3705n6 c3705n6 = new C3705n6();
        C3871tn c3871tn = u13.f46589a;
        if (c3871tn != null) {
            c3705n6.f47747a = this.f46635a.fromModel(c3871tn);
        }
        c3705n6.f47748b = new C3929w6[u13.f46590b.size()];
        Iterator it = u13.f46590b.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            c3705n6.f47748b[i13] = this.f46635a.fromModel((C3871tn) it.next());
            i13++;
        }
        String str = u13.f46591c;
        if (str != null) {
            c3705n6.f47749c = str;
        }
        return c3705n6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final U a(C3705n6 c3705n6) {
        throw new UnsupportedOperationException();
    }
}
