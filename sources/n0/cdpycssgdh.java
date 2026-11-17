package n0;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class cdpycssgdh {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f68238iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f68239zoijcleaow;

    public cdpycssgdh(istkbnxepw... istkbnxepwVarArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (istkbnxepwVarArr.length > 0) {
            istkbnxepw istkbnxepwVar = istkbnxepwVarArr[0];
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.size() != 1) {
                throw new IllegalArgumentException(('\'' + str + "' must be unique. Actual [ [" + hg.jyumaefscl.iwxlajgraz(list, null, null, null, 0, null, null, 63, null) + ']').toString());
            }
            hg.jyumaefscl.istkbnxepw(arrayList, list);
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.f68238iobyxmoadg = arrayList2;
        if (arrayList2.size() > 0) {
            androidx.appcompat.app.yggfygwlhe.iobyxmoadg(arrayList2.get(0));
            throw null;
        }
        this.f68239zoijcleaow = false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cdpycssgdh) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f68238iobyxmoadg, ((cdpycssgdh) obj).f68238iobyxmoadg);
    }

    public int hashCode() {
        return this.f68238iobyxmoadg.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f68238iobyxmoadg;
    }
}
