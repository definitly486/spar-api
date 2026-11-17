package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class Mf extends La {
    public Mf(int i13) {
        super(i13);
    }

    @Override // io.appmetrica.analytics.impl.La
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int b(Y y13) {
        if (y13 == null) {
            return 0;
        }
        return StringUtils.getUtf8BytesLength(y13.f46791b) + 12;
    }
}
