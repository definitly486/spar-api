package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class P3 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final T3 fromModel(O3 o13) {
        T3 t13 = new T3();
        t13.f46545a = a(o13.f46303a);
        int size = o13.f46304b.size();
        Q3[] q3Arr = new Q3[size];
        for (int i13 = 0; i13 < size; i13++) {
            q3Arr[i13] = a((N3) o13.f46304b.get(i13));
        }
        t13.f46546b = q3Arr;
        return t13;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final O3 toModel(T3 t13) {
        Q3 q13 = t13.f46545a;
        if (q13 == null) {
            q13 = new Q3();
        }
        N3 n3A = a(q13);
        Q3[] q3Arr = t13.f46546b;
        ArrayList arrayList = new ArrayList(q3Arr.length);
        for (Q3 q14 : q3Arr) {
            arrayList.add(a(q14));
        }
        return new O3(n3A, arrayList);
    }

    public static Q3 a(N3 n13) {
        S3 s13;
        Q3 q13 = new Q3();
        Map map = n13.f46249a;
        int i13 = 0;
        if (map != null) {
            s13 = new S3();
            int size = map.size();
            R3[] r3Arr = new R3[size];
            for (int i14 = 0; i14 < size; i14++) {
                r3Arr[i14] = new R3();
            }
            s13.f46480a = r3Arr;
            int i15 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                R3 r13 = s13.f46480a[i15];
                r13.f46437a = str;
                r13.f46438b = str2;
                i15++;
            }
        } else {
            s13 = null;
        }
        q13.f46409a = s13;
        int iOrdinal = n13.f46250b.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                i13 = 2;
                if (iOrdinal != 2) {
                    i13 = 3;
                    if (iOrdinal != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            } else {
                i13 = 1;
            }
        }
        q13.f46410b = i13;
        return q13;
    }

    public static N3 a(Q3 q13) {
        LinkedHashMap linkedHashMap;
        EnumC3657l8 enumC3657l8;
        S3 s13 = q13.f46409a;
        if (s13 != null) {
            R3[] r3Arr = s13.f46480a;
            linkedHashMap = new LinkedHashMap(zg.gtknphoqwx.gxszxtbevo(hg.tzroggbefp.eablkybsjg(r3Arr.length), 16));
            for (R3 r13 : r3Arr) {
                gg.vdvldrhtss vdvldrhtssVarIobyxmoadg = gg.cqumvgiudr.iobyxmoadg(r13.f46437a, r13.f46438b);
                linkedHashMap.put(vdvldrhtssVarIobyxmoadg.lqeggnwhkg(), vdvldrhtssVarIobyxmoadg.nufgyqmvbu());
            }
        } else {
            linkedHashMap = null;
        }
        int i13 = q13.f46410b;
        if (i13 == 0) {
            enumC3657l8 = EnumC3657l8.f47647b;
        } else if (i13 == 1) {
            enumC3657l8 = EnumC3657l8.f47648c;
        } else if (i13 == 2) {
            enumC3657l8 = EnumC3657l8.f47649d;
        } else if (i13 != 3) {
            enumC3657l8 = EnumC3657l8.f47647b;
        } else {
            enumC3657l8 = EnumC3657l8.f47650e;
        }
        return new N3(linkedHashMap, enumC3657l8);
    }
}
