package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class R7 implements ProtobufConverter {
    public final BigDecimal a(A8 a13) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final A8 fromModel(BigDecimal bigDecimal) {
        BigInteger bigInteger = T7.f46550a;
        int i13 = -bigDecimal.scale();
        BigInteger bigIntegerUnscaledValue = bigDecimal.unscaledValue();
        while (true) {
            if (bigIntegerUnscaledValue.compareTo(T7.f46550a) <= 0 && bigIntegerUnscaledValue.compareTo(T7.f46551b) >= 0) {
                gg.vdvldrhtss vdvldrhtssVarIobyxmoadg = gg.cqumvgiudr.iobyxmoadg(Long.valueOf(bigIntegerUnscaledValue.longValue()), Integer.valueOf(i13));
                S7 s13 = new S7(((Number) vdvldrhtssVarIobyxmoadg.nufgyqmvbu()).intValue(), ((Number) vdvldrhtssVarIobyxmoadg.lqeggnwhkg()).longValue());
                A8 a13 = new A8();
                a13.f45450a = s13.f46500a;
                a13.f45451b = s13.f46501b;
                return a13;
            }
            bigIntegerUnscaledValue = bigIntegerUnscaledValue.divide(BigInteger.TEN);
            i13++;
        }
    }
}
