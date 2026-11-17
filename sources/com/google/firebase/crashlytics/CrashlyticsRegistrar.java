package com.google.firebase.crashlytics;

import bc.gxszxtbevo;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import od.nufgyqmvbu;
import tb.zoijcleaow;
import ub.pmvmpeiblj;
import ub.ppxfxbqfkf;
import ub.vdvldrhtss;
import ub.wkgbmnqykc;
import uc.eablkybsjg;
import xb.lqeggnwhkg;

/* JADX INFO: loaded from: classes2.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final pmvmpeiblj f24244iobyxmoadg = pmvmpeiblj.iobyxmoadg(tb.iobyxmoadg.class, ExecutorService.class);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final pmvmpeiblj f24245zoijcleaow = pmvmpeiblj.iobyxmoadg(zoijcleaow.class, ExecutorService.class);

    static {
        vd.iobyxmoadg.iobyxmoadg(vd.zoijcleaow.iobyxmoadg.CRASHLYTICS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public iobyxmoadg zoijcleaow(wkgbmnqykc wkgbmnqykcVar) {
        gxszxtbevo.gxszxtbevo(false);
        long jCurrentTimeMillis = System.currentTimeMillis();
        iobyxmoadg iobyxmoadgVarPpxfxbqfkf = iobyxmoadg.ppxfxbqfkf((com.google.firebase.gxszxtbevo) wkgbmnqykcVar.iobyxmoadg(com.google.firebase.gxszxtbevo.class), (eablkybsjg) wkgbmnqykcVar.iobyxmoadg(eablkybsjg.class), wkgbmnqykcVar.dxjokdxxww(xb.iobyxmoadg.class), wkgbmnqykcVar.dxjokdxxww(sb.iobyxmoadg.class), wkgbmnqykcVar.dxjokdxxww(rd.iobyxmoadg.class), (ExecutorService) wkgbmnqykcVar.zoijcleaow(this.f24244iobyxmoadg), (ExecutorService) wkgbmnqykcVar.zoijcleaow(this.f24245zoijcleaow));
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (jCurrentTimeMillis2 > 16) {
            lqeggnwhkg.gxszxtbevo().zoijcleaow("Initializing Crashlytics blocked main for " + jCurrentTimeMillis2 + " ms");
        }
        return iobyxmoadgVarPpxfxbqfkf;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        return Arrays.asList(ppxfxbqfkf.ppxfxbqfkf(iobyxmoadg.class).nufgyqmvbu("fire-cls").zoijcleaow(vdvldrhtss.gtknphoqwx(com.google.firebase.gxszxtbevo.class)).zoijcleaow(vdvldrhtss.gtknphoqwx(eablkybsjg.class)).zoijcleaow(vdvldrhtss.draadjrbmk(this.f24244iobyxmoadg)).zoijcleaow(vdvldrhtss.draadjrbmk(this.f24245zoijcleaow)).zoijcleaow(vdvldrhtss.iobyxmoadg(xb.iobyxmoadg.class)).zoijcleaow(vdvldrhtss.iobyxmoadg(sb.iobyxmoadg.class)).zoijcleaow(vdvldrhtss.iobyxmoadg(rd.iobyxmoadg.class)).gxszxtbevo(new ub.lqeggnwhkg() { // from class: wb.gxszxtbevo
            @Override // ub.lqeggnwhkg
            public final Object iobyxmoadg(ub.wkgbmnqykc wkgbmnqykcVar) {
                return this.f119204iobyxmoadg.zoijcleaow(wkgbmnqykcVar);
            }
        }).eablkybsjg().wkgbmnqykc(), nufgyqmvbu.zoijcleaow("fire-cls", "19.2.1"));
    }
}
