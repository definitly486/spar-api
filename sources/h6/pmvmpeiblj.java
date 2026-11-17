package h6;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class pmvmpeiblj implements lereixgezr {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Map f39639zoijcleaow = new LinkedHashMap();

    @Override // h6.lereixgezr
    public esjtqupxsv eablkybsjg(p6.wflxmlrfwp id2) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(id2, "id");
        return (esjtqupxsv) this.f39639zoijcleaow.remove(id2);
    }

    @Override // h6.lereixgezr
    public List remove(String workSpecId) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(workSpecId, "workSpecId");
        Map map = this.f39639zoijcleaow;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((p6.wflxmlrfwp) entry.getKey()).zoijcleaow(), workSpecId)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            this.f39639zoijcleaow.remove((p6.wflxmlrfwp) it.next());
        }
        return hg.jyumaefscl.m(linkedHashMap.values());
    }

    @Override // h6.lereixgezr
    public esjtqupxsv wkgbmnqykc(p6.wflxmlrfwp id2) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(id2, "id");
        Map map = this.f39639zoijcleaow;
        Object esjtqupxsvVar = map.get(id2);
        if (esjtqupxsvVar == null) {
            esjtqupxsvVar = new esjtqupxsv(id2);
            map.put(id2, esjtqupxsvVar);
        }
        return (esjtqupxsv) esjtqupxsvVar;
    }

    @Override // h6.lereixgezr
    public boolean zoijcleaow(p6.wflxmlrfwp id2) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(id2, "id");
        return this.f39639zoijcleaow.containsKey(id2);
    }
}
