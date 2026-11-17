package io.appmetrica.analytics.screenshot.impl;

import hg.agtfadlqog;
import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4038q implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final L fromModel(C4036o c4036o) {
        L l13 = new L();
        l13.f48936a = c4036o.f49006a;
        Object[] array = c4036o.f49007b.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        l13.f48938c = (String[]) array;
        l13.f48937b = c4036o.f49008c;
        return l13;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4036o toModel(L l13) {
        return new C4036o(l13.f48936a, agtfadlqog.i(l13.f48938c), l13.f48937b);
    }
}
