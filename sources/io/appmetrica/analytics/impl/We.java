package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.nio.charset.Charset;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class We implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3755p6[] fromModel(Map<String, String> map) {
        int size = map.size();
        C3755p6[] c3755p6Arr = new C3755p6[size];
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            c3755p6Arr[i14] = new C3755p6();
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            C3755p6 c3755p6 = c3755p6Arr[i13];
            String key = entry.getKey();
            Charset charset = mj.wkgbmnqykc.f67326zoijcleaow;
            c3755p6.f47864a = key.getBytes(charset);
            c3755p6Arr[i13].f47865b = entry.getValue().getBytes(charset);
            i13++;
        }
        return c3755p6Arr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final Map<String, String> a(C3755p6[] c3755p6Arr) {
        throw new UnsupportedOperationException();
    }
}
