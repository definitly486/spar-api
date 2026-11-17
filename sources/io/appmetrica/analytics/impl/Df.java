package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* JADX INFO: loaded from: classes3.dex */
public final class Df implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Integer fromModel(EnumC3657l8 enumC3657l8) {
        int iOrdinal = enumC3657l8.ordinal();
        if (iOrdinal == 1) {
            return 1;
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? 0 : 2;
        }
        return 3;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final EnumC3657l8 toModel(Integer num) {
        int iIntValue = num.intValue();
        if (iIntValue == 1) {
            return EnumC3657l8.f47648c;
        }
        if (iIntValue == 2) {
            return EnumC3657l8.f47650e;
        }
        if (iIntValue != 3) {
            return EnumC3657l8.f47647b;
        }
        return EnumC3657l8.f47649d;
    }
}
