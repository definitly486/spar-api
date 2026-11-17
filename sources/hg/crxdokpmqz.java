package hg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class crxdokpmqz extends sopmlzcsov {
    public static lj.btonecajqb cqumvgiudr(Map map) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(map, "<this>");
        return jyumaefscl.ikoacuggdj(map.entrySet());
    }

    public static List esjtqupxsv(Map map) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(map, "<this>");
        if (map.size() == 0) {
            return jyumaefscl.wflxmlrfwp();
        }
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return jyumaefscl.wflxmlrfwp();
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (!it.hasNext()) {
            return jyumaefscl.eablkybsjg(new gg.vdvldrhtss(entry.getKey(), entry.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new gg.vdvldrhtss(entry.getKey(), entry.getValue()));
        do {
            Map.Entry entry2 = (Map.Entry) it.next();
            arrayList.add(new gg.vdvldrhtss(entry2.getKey(), entry2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }
}
