package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.x7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3955x7 implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ae f48410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F7 f48411b;

    /* JADX WARN: Multi-variable type inference failed */
    public C3955x7() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final I7 fromModel(C4005z7 c4005z7) {
        I7 i13 = new I7();
        Integer num = c4005z7.f48551a;
        if (num != null) {
            i13.f45982a = num.intValue();
        }
        String str = c4005z7.f48552b;
        if (str != null) {
            i13.f45983b = StringUtils.correctIllFormedString(str);
        }
        String str2 = c4005z7.f48553c;
        if (str2 != null) {
            i13.f45984c = StringUtils.correctIllFormedString(str2);
        }
        Long l13 = c4005z7.f48554d;
        if (l13 != null) {
            i13.f45985d = l13.longValue();
        }
        E7 e13 = c4005z7.f48555e;
        if (e13 != null) {
            i13.f45986e = this.f48411b.fromModel(e13);
        }
        String str3 = c4005z7.f48556f;
        if (str3 != null) {
            i13.f45987f = str3;
        }
        String str4 = c4005z7.f48557g;
        if (str4 != null) {
            i13.f45988g = str4;
        }
        Long l14 = c4005z7.f48558h;
        if (l14 != null) {
            i13.f45989h = l14.longValue();
        }
        Integer num2 = c4005z7.f48559i;
        if (num2 != null) {
            i13.f45990i = num2.intValue();
        }
        Integer num3 = c4005z7.f48560j;
        if (num3 != null) {
            i13.f45991j = num3.intValue();
        }
        String str5 = c4005z7.f48561k;
        if (str5 != null) {
            i13.f45992k = str5;
        }
        EnumC3405b9 enumC3405b9 = c4005z7.f48562l;
        if (enumC3405b9 != null) {
            i13.f45993l = enumC3405b9.f46959a;
        }
        String str6 = c4005z7.f48563m;
        if (str6 != null) {
            i13.f45994m = str6;
        }
        EnumC3983ya enumC3983ya = c4005z7.f48564n;
        if (enumC3983ya != null) {
            i13.f45995n = enumC3983ya.f48521a;
        }
        H9 h13 = c4005z7.f48565o;
        if (h13 != null) {
            i13.f45996o = h13.f45909a;
        }
        Boolean bool = c4005z7.f48566p;
        if (bool != null) {
            i13.f45997p = this.f48410a.fromModel(bool).intValue();
        }
        Integer num4 = c4005z7.f48567q;
        if (num4 != null) {
            i13.f45998q = num4.intValue();
        }
        byte[] bArr = c4005z7.f48568r;
        if (bArr != null) {
            i13.f45999r = bArr;
        }
        return i13;
    }

    public C3955x7(Ae ae2, F7 f13) {
        this.f48410a = ae2;
        this.f48411b = f13;
    }

    public /* synthetic */ C3955x7(Ae ae2, F7 f13, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? new Ae() : ae2, (i13 & 2) != 0 ? new F7(null, 1, null) : f13);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4005z7 toModel(I7 i13) {
        H9 h13;
        I7 i14 = new I7();
        int i15 = i13.f45982a;
        Integer numValueOf = i15 != i14.f45982a ? Integer.valueOf(i15) : null;
        String str = i13.f45983b;
        String str2 = !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str, i14.f45983b) ? str : null;
        String str3 = i13.f45984c;
        String str4 = !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str3, i14.f45984c) ? str3 : null;
        long j13 = i13.f45985d;
        Long lValueOf = j13 != i14.f45985d ? Long.valueOf(j13) : null;
        E7 model = this.f48411b.toModel(i13.f45986e);
        String str5 = i13.f45987f;
        String str6 = !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str5, i14.f45987f) ? str5 : null;
        String str7 = i13.f45988g;
        String str8 = !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str7, i14.f45988g) ? str7 : null;
        long j14 = i13.f45989h;
        Long lValueOf2 = Long.valueOf(j14);
        if (j14 == i14.f45989h) {
            lValueOf2 = null;
        }
        int i16 = i13.f45990i;
        Integer numValueOf2 = i16 != i14.f45990i ? Integer.valueOf(i16) : null;
        int i17 = i13.f45991j;
        Integer numValueOf3 = i17 != i14.f45991j ? Integer.valueOf(i17) : null;
        String str9 = i13.f45992k;
        String str10 = !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str9, i14.f45992k) ? str9 : null;
        int i18 = i13.f45993l;
        Integer numValueOf4 = Integer.valueOf(i18);
        if (i18 == i14.f45993l) {
            numValueOf4 = null;
        }
        EnumC3405b9 enumC3405b9A = numValueOf4 != null ? EnumC3405b9.a(Integer.valueOf(numValueOf4.intValue())) : null;
        String str11 = i13.f45994m;
        String str12 = !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str11, i14.f45994m) ? str11 : null;
        int i19 = i13.f45995n;
        Integer numValueOf5 = Integer.valueOf(i19);
        if (i19 == i14.f45995n) {
            numValueOf5 = null;
        }
        EnumC3983ya enumC3983yaA = numValueOf5 != null ? EnumC3983ya.a(Integer.valueOf(numValueOf5.intValue())) : null;
        int i23 = i13.f45996o;
        Integer numValueOf6 = Integer.valueOf(i23);
        if (i23 == i14.f45996o) {
            numValueOf6 = null;
        }
        if (numValueOf6 != null) {
            int iIntValue = numValueOf6.intValue();
            H9[] h9ArrValues = H9.values();
            int length = h9ArrValues.length;
            int i24 = 0;
            while (true) {
                if (i24 < length) {
                    H9 h14 = h9ArrValues[i24];
                    H9[] h9Arr = h9ArrValues;
                    if (h14.f45909a == iIntValue) {
                        h13 = h14;
                        break;
                    }
                    i24++;
                    h9ArrValues = h9Arr;
                } else {
                    h13 = H9.NATIVE;
                    break;
                }
            }
        } else {
            h13 = null;
        }
        Boolean boolA = this.f48410a.a(i13.f45997p);
        int i25 = i13.f45998q;
        Integer numValueOf7 = i25 != i14.f45998q ? Integer.valueOf(i25) : null;
        byte[] bArr = i13.f45999r;
        return new C4005z7(numValueOf, str2, str4, lValueOf, model, str6, str8, lValueOf2, numValueOf2, numValueOf3, str10, enumC3405b9A, str12, enumC3983yaA, h13, boolA, numValueOf7, !Arrays.equals(bArr, i14.f45999r) ? bArr : null);
    }
}
