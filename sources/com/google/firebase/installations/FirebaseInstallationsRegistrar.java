package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import rc.dxjokdxxww;
import ub.pmvmpeiblj;
import ub.vdvldrhtss;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ uc.eablkybsjg lambda$getComponents$0(ub.wkgbmnqykc wkgbmnqykcVar) {
        return new ppxfxbqfkf((com.google.firebase.gxszxtbevo) wkgbmnqykcVar.iobyxmoadg(com.google.firebase.gxszxtbevo.class), wkgbmnqykcVar.gxszxtbevo(dxjokdxxww.class), (ExecutorService) wkgbmnqykcVar.zoijcleaow(pmvmpeiblj.iobyxmoadg(tb.iobyxmoadg.class, ExecutorService.class)), vb.dxjokdxxww.zoijcleaow((Executor) wkgbmnqykcVar.zoijcleaow(pmvmpeiblj.iobyxmoadg(tb.zoijcleaow.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<ub.ppxfxbqfkf> getComponents() {
        return Arrays.asList(ub.ppxfxbqfkf.ppxfxbqfkf(uc.eablkybsjg.class).nufgyqmvbu(LIBRARY_NAME).zoijcleaow(vdvldrhtss.gtknphoqwx(com.google.firebase.gxszxtbevo.class)).zoijcleaow(vdvldrhtss.dxjokdxxww(dxjokdxxww.class)).zoijcleaow(vdvldrhtss.draadjrbmk(pmvmpeiblj.iobyxmoadg(tb.iobyxmoadg.class, ExecutorService.class))).zoijcleaow(vdvldrhtss.draadjrbmk(pmvmpeiblj.iobyxmoadg(tb.zoijcleaow.class, Executor.class))).gxszxtbevo(new ub.lqeggnwhkg() { // from class: uc.gxszxtbevo
            @Override // ub.lqeggnwhkg
            public final Object iobyxmoadg(ub.wkgbmnqykc wkgbmnqykcVar) {
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(wkgbmnqykcVar);
            }
        }).wkgbmnqykc(), rc.nufgyqmvbu.iobyxmoadg(), od.nufgyqmvbu.zoijcleaow(LIBRARY_NAME, "18.0.0"));
    }
}
