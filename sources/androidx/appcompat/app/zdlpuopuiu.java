package androidx.appcompat.app;

import java.util.LinkedHashSet;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
abstract class zdlpuopuiu {
    private static q1.nufgyqmvbu iobyxmoadg(q1.nufgyqmvbu nufgyqmvbuVar, q1.nufgyqmvbu nufgyqmvbuVar2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i13 = 0;
        while (i13 < nufgyqmvbuVar.gxszxtbevo() + nufgyqmvbuVar2.gxszxtbevo()) {
            Locale localePpxfxbqfkf = i13 < nufgyqmvbuVar.gxszxtbevo() ? nufgyqmvbuVar.ppxfxbqfkf(i13) : nufgyqmvbuVar2.ppxfxbqfkf(i13 - nufgyqmvbuVar.gxszxtbevo());
            if (localePpxfxbqfkf != null) {
                linkedHashSet.add(localePpxfxbqfkf);
            }
            i13++;
        }
        return q1.nufgyqmvbu.iobyxmoadg((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
    }

    static q1.nufgyqmvbu zoijcleaow(q1.nufgyqmvbu nufgyqmvbuVar, q1.nufgyqmvbu nufgyqmvbuVar2) {
        return (nufgyqmvbuVar == null || nufgyqmvbuVar.eablkybsjg()) ? q1.nufgyqmvbu.wkgbmnqykc() : iobyxmoadg(nufgyqmvbuVar, nufgyqmvbuVar2);
    }
}
