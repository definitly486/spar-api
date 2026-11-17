package p5;

import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wkgbmnqykc {
    public static final void iobyxmoadg(HashMap map, boolean z13, draadjrbmk fetchBlock) {
        int i13;
        zdlpuopuiu.btonecajqb(map, "map");
        zdlpuopuiu.btonecajqb(fetchBlock, "fetchBlock");
        HashMap map2 = new HashMap(999);
        Iterator it = map.keySet().iterator();
        loop0: while (true) {
            i13 = 0;
            do {
                if (!it.hasNext()) {
                    break loop0;
                }
                Object key = it.next();
                if (z13) {
                    zdlpuopuiu.dxjokdxxww(key, "key");
                    map2.put(key, map.get(key));
                } else {
                    zdlpuopuiu.dxjokdxxww(key, "key");
                    map2.put(key, null);
                }
                i13++;
            } while (i13 != 999);
            fetchBlock.invoke(map2);
            if (!z13) {
                map.putAll(map2);
            }
            map2.clear();
        }
        if (i13 > 0) {
            fetchBlock.invoke(map2);
            if (z13) {
                return;
            }
            map.putAll(map2);
        }
    }
}
