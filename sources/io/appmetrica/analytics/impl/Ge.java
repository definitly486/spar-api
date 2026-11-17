package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class Ge implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Qa f45855a;

    public Ge() {
        this(new Qa(20480, 100, 1000));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Qi fromModel(Map<String, String> map) {
        Jn jnA = this.f45855a.a(map);
        F8 f13 = new F8();
        f13.f45797b = ((I4) jnA.f46117b).f45977b;
        Map map2 = (Map) jnA.f46116a;
        if (map2 != null) {
            f13.f45796a = new E8[map2.size()];
            int i13 = 0;
            for (Map.Entry entry : map2.entrySet()) {
                f13.f45796a[i13] = new E8();
                f13.f45796a[i13].f45700a = StringUtils.getUTF8Bytes((String) entry.getKey());
                f13.f45796a[i13].f45701b = StringUtils.getUTF8Bytes((String) entry.getValue());
                i13++;
            }
        }
        InterfaceC3951x3 interfaceC3951x3 = jnA.f46117b;
        int i14 = ((I4) interfaceC3951x3).f48263a;
        return new Qi(f13, interfaceC3951x3);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Ge(Qa qa3) {
        this.f45855a = qa3;
    }

    public final Map<String, String> a(Qi qi2) {
        throw new UnsupportedOperationException();
    }
}
