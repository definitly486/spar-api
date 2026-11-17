package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.c9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3431c9 implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final byte[] fromModel(Map<String, byte[]> map) {
        C3482e9 c3482e9 = new C3482e9();
        C3457d9[] c3457d9Arr = new C3457d9[map.size()];
        int i13 = 0;
        for (Object obj : map.entrySet()) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                hg.jyumaefscl.iwizpuwonk();
            }
            Map.Entry entry = (Map.Entry) obj;
            C3457d9 c3457d9 = new C3457d9();
            c3457d9.f47095a = (String) entry.getKey();
            c3457d9.f47096b = (byte[]) entry.getValue();
            c3457d9Arr[i13] = c3457d9;
            i13 = i14;
        }
        c3482e9.f47166a = c3457d9Arr;
        return MessageNano.toByteArray(c3482e9);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, byte[]> toModel(byte[] bArr) {
        C3457d9[] c3457d9Arr = ((C3482e9) MessageNano.mergeFrom(new C3482e9(), bArr)).f47166a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(zg.gtknphoqwx.gxszxtbevo(hg.tzroggbefp.eablkybsjg(c3457d9Arr.length), 16));
        for (C3457d9 c3457d9 : c3457d9Arr) {
            gg.vdvldrhtss vdvldrhtssVarIobyxmoadg = gg.cqumvgiudr.iobyxmoadg(c3457d9.f47095a, c3457d9.f47096b);
            linkedHashMap.put(vdvldrhtssVarIobyxmoadg.lqeggnwhkg(), vdvldrhtssVarIobyxmoadg.nufgyqmvbu());
        }
        return linkedHashMap;
    }
}
