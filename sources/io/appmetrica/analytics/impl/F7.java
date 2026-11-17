package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* JADX INFO: loaded from: classes3.dex */
public final class F7 implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ae f45794a;

    /* JADX WARN: Multi-variable type inference failed */
    public F7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final J7 fromModel(E7 e13) {
        J7 j13 = new J7();
        Boolean bool = e13.f45689a;
        if (bool != null) {
            j13.f46076a = this.f45794a.fromModel(bool).intValue();
        }
        Double d13 = e13.f45691c;
        if (d13 != null) {
            j13.f46078c = d13.doubleValue();
        }
        Double d14 = e13.f45690b;
        if (d14 != null) {
            j13.f46077b = d14.doubleValue();
        }
        Long l13 = e13.f45696h;
        if (l13 != null) {
            j13.f46083h = l13.longValue();
        }
        Integer num = e13.f45694f;
        if (num != null) {
            j13.f46081f = num.intValue();
        }
        Integer num2 = e13.f45693e;
        if (num2 != null) {
            j13.f46080e = num2.intValue();
        }
        Integer num3 = e13.f45695g;
        if (num3 != null) {
            j13.f46082g = num3.intValue();
        }
        Integer num4 = e13.f45692d;
        if (num4 != null) {
            j13.f46079d = num4.intValue();
        }
        String str = e13.f45697i;
        if (str != null) {
            j13.f46084i = str;
        }
        String str2 = e13.f45698j;
        if (str2 != null) {
            j13.f46085j = str2;
        }
        return j13;
    }

    public F7(Ae ae2) {
        this.f45794a = ae2;
    }

    public /* synthetic */ F7(Ae ae2, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? new Ae() : ae2);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final E7 toModel(J7 j13) {
        if (j13 == null) {
            return new E7(null, null, null, null, null, null, null, null, null, null);
        }
        J7 j14 = new J7();
        Boolean boolA = this.f45794a.a(j13.f46076a);
        double d13 = j13.f46078c;
        Double dValueOf = !((d13 > j14.f46078c ? 1 : (d13 == j14.f46078c ? 0 : -1)) == 0) ? Double.valueOf(d13) : null;
        double d14 = j13.f46077b;
        Double dValueOf2 = !(d14 == j14.f46077b) ? Double.valueOf(d14) : null;
        long j15 = j13.f46083h;
        Long lValueOf = j15 != j14.f46083h ? Long.valueOf(j15) : null;
        int i13 = j13.f46081f;
        Integer numValueOf = i13 != j14.f46081f ? Integer.valueOf(i13) : null;
        int i14 = j13.f46080e;
        Integer numValueOf2 = i14 != j14.f46080e ? Integer.valueOf(i14) : null;
        int i15 = j13.f46082g;
        Integer numValueOf3 = i15 != j14.f46082g ? Integer.valueOf(i15) : null;
        int i16 = j13.f46079d;
        Integer numValueOf4 = i16 != j14.f46079d ? Integer.valueOf(i16) : null;
        String str = j13.f46084i;
        String str2 = !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str, j14.f46084i) ? str : null;
        String str3 = j13.f46085j;
        return new E7(boolA, dValueOf2, dValueOf, numValueOf4, numValueOf2, numValueOf, numValueOf3, lValueOf, str2, !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str3, j14.f46085j) ? str3 : null);
    }
}
