package h5;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public abstract class eablkybsjg {
    public static final List iobyxmoadg(Map map, tg.draadjrbmk isArgumentMissing) {
        zdlpuopuiu.btonecajqb(map, "<this>");
        zdlpuopuiu.btonecajqb(isArgumentMissing, "isArgumentMissing");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            androidx.navigation.zoijcleaow zoijcleaowVar = (androidx.navigation.zoijcleaow) entry.getValue();
            Boolean boolValueOf = zoijcleaowVar != null ? Boolean.valueOf(zoijcleaowVar.wkgbmnqykc()) : null;
            zdlpuopuiu.lqeggnwhkg(boolValueOf);
            if (!boolValueOf.booleanValue() && !zoijcleaowVar.zoijcleaow()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set setKeySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (((Boolean) isArgumentMissing.invoke((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
