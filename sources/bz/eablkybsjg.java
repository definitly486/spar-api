package bz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final HashMap f17413iobyxmoadg = new HashMap();

    protected void iobyxmoadg(String str) {
        HashMap map = this.f17413iobyxmoadg;
        map.put(str, Long.valueOf(1 << map.size()));
    }

    Long ppxfxbqfkf(List list) {
        Long lValueOf = 0L;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                lValueOf = Long.valueOf(lValueOf.longValue() | zoijcleaow((String) it.next()).longValue());
            } catch (NullPointerException unused) {
            }
        }
        return lValueOf;
    }

    List wkgbmnqykc() {
        return new LinkedList(this.f17413iobyxmoadg.keySet());
    }

    Long zoijcleaow(String str) {
        return (Long) this.f17413iobyxmoadg.get(str);
    }
}
