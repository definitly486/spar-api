package od;

import java.util.Iterator;
import java.util.Set;
import ub.vdvldrhtss;

/* JADX INFO: loaded from: classes2.dex */
public class ppxfxbqfkf implements dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f72611iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final wkgbmnqykc f72612zoijcleaow;

    ppxfxbqfkf(Set set, wkgbmnqykc wkgbmnqykcVar) {
        this.f72611iobyxmoadg = wkgbmnqykc(set);
        this.f72612zoijcleaow = wkgbmnqykcVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ dxjokdxxww ppxfxbqfkf(ub.wkgbmnqykc wkgbmnqykcVar) {
        return new ppxfxbqfkf(wkgbmnqykcVar.wkgbmnqykc(gxszxtbevo.class), wkgbmnqykc.iobyxmoadg());
    }

    private static String wkgbmnqykc(Set set) {
        StringBuilder sb3 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            gxszxtbevo gxszxtbevoVar = (gxszxtbevo) it.next();
            sb3.append(gxszxtbevoVar.zoijcleaow());
            sb3.append('/');
            sb3.append(gxszxtbevoVar.ppxfxbqfkf());
            if (it.hasNext()) {
                sb3.append(' ');
            }
        }
        return sb3.toString();
    }

    public static ub.ppxfxbqfkf zoijcleaow() {
        return ub.ppxfxbqfkf.ppxfxbqfkf(dxjokdxxww.class).zoijcleaow(vdvldrhtss.ojitshcjhn(gxszxtbevo.class)).gxszxtbevo(new ub.lqeggnwhkg() { // from class: od.zoijcleaow
            @Override // ub.lqeggnwhkg
            public final Object iobyxmoadg(ub.wkgbmnqykc wkgbmnqykcVar) {
                return ppxfxbqfkf.ppxfxbqfkf(wkgbmnqykcVar);
            }
        }).wkgbmnqykc();
    }

    @Override // od.dxjokdxxww
    public String getUserAgent() {
        if (this.f72612zoijcleaow.zoijcleaow().isEmpty()) {
            return this.f72611iobyxmoadg;
        }
        return this.f72611iobyxmoadg + ' ' + wkgbmnqykc(this.f72612zoijcleaow.zoijcleaow());
    }
}
