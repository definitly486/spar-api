package ageimvtcrz;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Map f1840iobyxmoadg = new LinkedHashMap();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Map f1841zoijcleaow = new LinkedHashMap();

    public final gxszxtbevo iobyxmoadg(dxjokdxxww dxjokdxxwwVar) {
        return (gxszxtbevo) this.f1841zoijcleaow.get(dxjokdxxwwVar);
    }

    public final void ppxfxbqfkf(gxszxtbevo gxszxtbevoVar) {
        dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) this.f1840iobyxmoadg.get(gxszxtbevoVar);
        if (dxjokdxxwwVar != null) {
        }
        this.f1840iobyxmoadg.remove(gxszxtbevoVar);
    }

    public final void wkgbmnqykc(gxszxtbevo gxszxtbevoVar, dxjokdxxww dxjokdxxwwVar) {
        this.f1840iobyxmoadg.put(gxszxtbevoVar, dxjokdxxwwVar);
        this.f1841zoijcleaow.put(dxjokdxxwwVar, gxszxtbevoVar);
    }

    public final dxjokdxxww zoijcleaow(gxszxtbevo gxszxtbevoVar) {
        return (dxjokdxxww) this.f1840iobyxmoadg.get(gxszxtbevoVar);
    }
}
