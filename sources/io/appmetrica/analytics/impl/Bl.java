package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ListConverter;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class Bl implements ListConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Cl f45543a = new Cl();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3904v6[] fromModel(List<Dl> list) {
        C3904v6[] c3904v6Arr = new C3904v6[list.size()];
        Iterator<Dl> it = list.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            c3904v6Arr[i13] = this.f45543a.fromModel(it.next());
            i13++;
        }
        return c3904v6Arr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final List<Dl> a(C3904v6[] c3904v6Arr) {
        throw new UnsupportedOperationException();
    }
}
