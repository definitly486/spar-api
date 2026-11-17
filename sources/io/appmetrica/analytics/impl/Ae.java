package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class Ae implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Integer fromModel(Boolean bool) {
        int i13;
        if (bool == null) {
            i13 = -1;
        } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(bool, Boolean.TRUE)) {
            i13 = 1;
        } else {
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(bool, Boolean.FALSE)) {
                throw new NoWhenBranchMatchedException();
            }
            i13 = 0;
        }
        return Integer.valueOf(i13);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final /* bridge */ /* synthetic */ Object toModel(Object obj) {
        return a(((Number) obj).intValue());
    }

    public final Boolean a(int i13) {
        if (i13 != -1) {
            if (i13 == 0) {
                return Boolean.FALSE;
            }
            if (i13 == 1) {
                return Boolean.TRUE;
            }
        }
        return null;
    }
}
