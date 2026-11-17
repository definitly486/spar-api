package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* JADX INFO: loaded from: classes3.dex */
public final class L7 implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ae f46173a;

    /* JADX WARN: Multi-variable type inference failed */
    public L7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final K7 fromModel(N7 n13) {
        K7 k13 = new K7();
        Long l13 = n13.f46252a;
        if (l13 != null) {
            k13.f46132a = l13.longValue();
        }
        Long l14 = n13.f46253b;
        if (l14 != null) {
            k13.f46133b = l14.longValue();
        }
        Boolean bool = n13.f46254c;
        if (bool != null) {
            k13.f46134c = this.f46173a.fromModel(bool).intValue();
        }
        return k13;
    }

    public L7(Ae ae2) {
        this.f46173a = ae2;
    }

    public /* synthetic */ L7(Ae ae2, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? new Ae() : ae2);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final N7 toModel(K7 k13) {
        K7 k14 = new K7();
        long j13 = k13.f46132a;
        Long lValueOf = Long.valueOf(j13);
        if (j13 == k14.f46132a) {
            lValueOf = null;
        }
        long j14 = k13.f46133b;
        return new N7(lValueOf, j14 != k14.f46133b ? Long.valueOf(j14) : null, this.f46173a.a(k13.f46134c));
    }
}
