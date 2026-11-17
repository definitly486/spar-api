package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class Cl implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3904v6 fromModel(Dl dl2) {
        C3904v6 c3904v6 = new C3904v6();
        c3904v6.f48226a = (String) WrapUtils.getOrDefault(dl2.f45660a, c3904v6.f48226a);
        c3904v6.f48227b = (String) WrapUtils.getOrDefault(dl2.f45661b, c3904v6.f48227b);
        c3904v6.f48228c = ((Integer) WrapUtils.getOrDefault(dl2.f45662c, Integer.valueOf(c3904v6.f48228c))).intValue();
        c3904v6.f48231f = ((Integer) WrapUtils.getOrDefault(dl2.f45663d, Integer.valueOf(c3904v6.f48231f))).intValue();
        c3904v6.f48229d = (String) WrapUtils.getOrDefault(dl2.f45664e, c3904v6.f48229d);
        c3904v6.f48230e = ((Boolean) WrapUtils.getOrDefault(dl2.f45665f, Boolean.valueOf(c3904v6.f48230e))).booleanValue();
        return c3904v6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final Dl a(C3904v6 c3904v6) {
        throw new UnsupportedOperationException();
    }
}
