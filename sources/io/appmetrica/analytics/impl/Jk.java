package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class Jk implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Lk fromModel(Map<String, byte[]> map) {
        Lk lk2 = new Lk();
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, byte[]> entry : map.entrySet()) {
            Mk mk2 = new Mk();
            mk2.f46239a = entry.getKey().getBytes(mj.wkgbmnqykc.f67326zoijcleaow);
            mk2.f46240b = entry.getValue();
            arrayList.add(mk2);
        }
        Object[] array = arrayList.toArray(new Mk[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        lk2.f46191a = (Mk[]) array;
        return lk2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, byte[]> toModel(Lk lk2) {
        Mk[] mkArr = lk2.f46191a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(zg.gtknphoqwx.gxszxtbevo(hg.tzroggbefp.eablkybsjg(mkArr.length), 16));
        for (Mk mk2 : mkArr) {
            gg.vdvldrhtss vdvldrhtssVarIobyxmoadg = gg.cqumvgiudr.iobyxmoadg(new String(mk2.f46239a, mj.wkgbmnqykc.f67326zoijcleaow), mk2.f46240b);
            linkedHashMap.put(vdvldrhtssVarIobyxmoadg.lqeggnwhkg(), vdvldrhtssVarIobyxmoadg.nufgyqmvbu());
        }
        return linkedHashMap;
    }
}
