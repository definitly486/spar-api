package com.google.firebase.perf;

import androidx.annotation.Keep;
import com.google.firebase.agtfadlqog;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.gxszxtbevo;
import com.google.firebase.perf.FirebasePerfRegistrar;
import com.google.firebase.remoteconfig.ppxfxbqfkf;
import dd.eablkybsjg;
import dd.zoijcleaow;
import ed.iobyxmoadg;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import o9.btonecajqb;
import od.nufgyqmvbu;
import ub.lqeggnwhkg;
import ub.pmvmpeiblj;
import ub.vdvldrhtss;
import ub.wkgbmnqykc;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class FirebasePerfRegistrar implements ComponentRegistrar {
    private static final String EARLY_LIBRARY_NAME = "fire-perf-early";
    private static final String LIBRARY_NAME = "fire-perf";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ zoijcleaow lambda$getComponents$0(pmvmpeiblj pmvmpeibljVar, wkgbmnqykc wkgbmnqykcVar) {
        return new zoijcleaow((gxszxtbevo) wkgbmnqykcVar.iobyxmoadg(gxszxtbevo.class), (agtfadlqog) wkgbmnqykcVar.gxszxtbevo(agtfadlqog.class).get(), (Executor) wkgbmnqykcVar.zoijcleaow(pmvmpeibljVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static eablkybsjg providesFirebasePerformance(wkgbmnqykc wkgbmnqykcVar) {
        wkgbmnqykcVar.iobyxmoadg(zoijcleaow.class);
        return iobyxmoadg.zoijcleaow().zoijcleaow(new fd.iobyxmoadg((gxszxtbevo) wkgbmnqykcVar.iobyxmoadg(gxszxtbevo.class), (uc.eablkybsjg) wkgbmnqykcVar.iobyxmoadg(uc.eablkybsjg.class), wkgbmnqykcVar.gxszxtbevo(ppxfxbqfkf.class), wkgbmnqykcVar.gxszxtbevo(btonecajqb.class))).iobyxmoadg().iobyxmoadg();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<ub.ppxfxbqfkf> getComponents() {
        final pmvmpeiblj pmvmpeibljVarIobyxmoadg = pmvmpeiblj.iobyxmoadg(tb.wkgbmnqykc.class, Executor.class);
        return Arrays.asList(ub.ppxfxbqfkf.ppxfxbqfkf(eablkybsjg.class).nufgyqmvbu(LIBRARY_NAME).zoijcleaow(vdvldrhtss.gtknphoqwx(gxszxtbevo.class)).zoijcleaow(vdvldrhtss.wflxmlrfwp(ppxfxbqfkf.class)).zoijcleaow(vdvldrhtss.gtknphoqwx(uc.eablkybsjg.class)).zoijcleaow(vdvldrhtss.wflxmlrfwp(btonecajqb.class)).zoijcleaow(vdvldrhtss.gtknphoqwx(zoijcleaow.class)).gxszxtbevo(new lqeggnwhkg() { // from class: dd.ppxfxbqfkf
            @Override // ub.lqeggnwhkg
            public final Object iobyxmoadg(ub.wkgbmnqykc wkgbmnqykcVar) {
                return FirebasePerfRegistrar.providesFirebasePerformance(wkgbmnqykcVar);
            }
        }).wkgbmnqykc(), ub.ppxfxbqfkf.ppxfxbqfkf(zoijcleaow.class).nufgyqmvbu(EARLY_LIBRARY_NAME).zoijcleaow(vdvldrhtss.gtknphoqwx(gxszxtbevo.class)).zoijcleaow(vdvldrhtss.dxjokdxxww(agtfadlqog.class)).zoijcleaow(vdvldrhtss.draadjrbmk(pmvmpeibljVarIobyxmoadg)).eablkybsjg().gxszxtbevo(new lqeggnwhkg() { // from class: dd.wkgbmnqykc
            @Override // ub.lqeggnwhkg
            public final Object iobyxmoadg(ub.wkgbmnqykc wkgbmnqykcVar) {
                return FirebasePerfRegistrar.lambda$getComponents$0(pmvmpeibljVarIobyxmoadg, wkgbmnqykcVar);
            }
        }).wkgbmnqykc(), nufgyqmvbu.zoijcleaow(LIBRARY_NAME, "21.0.2"));
    }
}
