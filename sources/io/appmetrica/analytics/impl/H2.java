package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* JADX INFO: loaded from: classes3.dex */
public final class H2 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3398b2 fromModel(J2 j13) {
        C3398b2 c3398b2 = new C3398b2();
        I2 i13 = j13.f46052a;
        if (i13 != null) {
            int iOrdinal = i13.ordinal();
            if (iOrdinal == 1) {
                c3398b2.f46948a = 1;
            } else if (iOrdinal == 2) {
                c3398b2.f46948a = 2;
            } else if (iOrdinal == 3) {
                c3398b2.f46948a = 3;
            } else if (iOrdinal == 4) {
                c3398b2.f46948a = 4;
            } else if (iOrdinal == 5) {
                c3398b2.f46948a = 5;
            }
        }
        Boolean bool = j13.f46053b;
        if (bool != null) {
            if (bool.booleanValue()) {
                c3398b2.f46949b = 1;
            } else {
                c3398b2.f46949b = 0;
            }
        }
        return c3398b2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final J2 toModel(C3398b2 c3398b2) {
        I2 i13;
        int i14 = c3398b2.f46948a;
        Boolean bool = null;
        if (i14 == 1) {
            i13 = I2.ACTIVE;
        } else if (i14 == 2) {
            i13 = I2.WORKING_SET;
        } else if (i14 == 3) {
            i13 = I2.FREQUENT;
        } else if (i14 != 4) {
            i13 = i14 != 5 ? null : I2.RESTRICTED;
        } else {
            i13 = I2.RARE;
        }
        int i15 = c3398b2.f46949b;
        if (i15 == 0) {
            bool = Boolean.FALSE;
        } else if (i15 == 1) {
            bool = Boolean.TRUE;
        }
        return new J2(i13, bool);
    }
}
