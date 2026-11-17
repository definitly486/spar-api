package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class R6 implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3796qm[] fromModel(Map<String, ? extends List<String>> map) {
        C3796qm[] c3796qmArr = new C3796qm[map.size()];
        int i13 = 0;
        for (Object obj : map.entrySet()) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                hg.jyumaefscl.iwizpuwonk();
            }
            Map.Entry entry = (Map.Entry) obj;
            C3796qm c3796qm = new C3796qm();
            c3796qm.f47929a = (String) entry.getKey();
            Object[] array = ((Collection) entry.getValue()).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            c3796qm.f47930b = (String[]) array;
            c3796qmArr[i13] = c3796qm;
            i13 = i14;
        }
        return c3796qmArr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, List<String>> toModel(C3796qm[] c3796qmArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(zg.gtknphoqwx.gxszxtbevo(hg.tzroggbefp.eablkybsjg(c3796qmArr.length), 16));
        for (C3796qm c3796qm : c3796qmArr) {
            gg.vdvldrhtss vdvldrhtssVarIobyxmoadg = gg.cqumvgiudr.iobyxmoadg(c3796qm.f47929a, hg.agtfadlqog.i(c3796qm.f47930b));
            linkedHashMap.put(vdvldrhtssVarIobyxmoadg.lqeggnwhkg(), vdvldrhtssVarIobyxmoadg.nufgyqmvbu());
        }
        return linkedHashMap;
    }
}
