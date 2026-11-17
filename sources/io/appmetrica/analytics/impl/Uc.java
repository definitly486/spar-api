package io.appmetrica.analytics.impl;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class Uc {
    /* JADX WARN: Code duplicated, block: B:28:0x0081  */
    public static final V9 a(Uc uc2, EnumC3483ea enumC3483ea, Map map) {
        int i13;
        Object value;
        uc2.getClass();
        V9 v13 = new V9();
        switch (enumC3483ea) {
            case UNKNOWN:
                i13 = 0;
                break;
            case APPSFLYER:
                i13 = 1;
                break;
            case ADJUST:
                i13 = 2;
                break;
            case KOCHAVA:
                i13 = 3;
                break;
            case TENJIN:
                i13 = 4;
                break;
            case AIRBRIDGE:
                i13 = 5;
                break;
            case SINGULAR:
                i13 = 6;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        v13.f46665a = i13;
        Vc.f46673b.getClass();
        Set<Map.Entry> setEntrySet = map.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(zg.gtknphoqwx.gxszxtbevo(hg.tzroggbefp.eablkybsjg(hg.jyumaefscl.cqumvgiudr(setEntrySet, 10)), 16));
        for (Map.Entry entry : setEntrySet) {
            Object key = entry.getKey();
            if (entry.getValue() instanceof Number) {
                Object value2 = entry.getValue();
                if (value2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Number");
                }
                double dDoubleValue = ((Number) value2).doubleValue();
                if (Double.isInfinite(dDoubleValue) || Double.isNaN(dDoubleValue)) {
                    value = null;
                } else {
                    value = entry.getValue();
                }
            } else {
                value = entry.getValue();
            }
            gg.vdvldrhtss vdvldrhtssVarIobyxmoadg = gg.cqumvgiudr.iobyxmoadg(key, value);
            linkedHashMap.put(vdvldrhtssVarIobyxmoadg.lqeggnwhkg(), vdvldrhtssVarIobyxmoadg.nufgyqmvbu());
        }
        String string = new JSONObject(linkedHashMap).toString();
        if (string != null) {
            v13.f46666b = string.getBytes(mj.wkgbmnqykc.f67326zoijcleaow);
        }
        return v13;
    }
}
