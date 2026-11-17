package com.google.firebase.remoteconfig;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.gxszxtbevo;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import od.nufgyqmvbu;
import ub.lqeggnwhkg;
import ub.pmvmpeiblj;
import ub.vdvldrhtss;
import ub.wkgbmnqykc;
import uc.eablkybsjg;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ppxfxbqfkf lambda$getComponents$0(pmvmpeiblj pmvmpeibljVar, wkgbmnqykc wkgbmnqykcVar) {
        return new ppxfxbqfkf((Context) wkgbmnqykcVar.iobyxmoadg(Context.class), (ScheduledExecutorService) wkgbmnqykcVar.zoijcleaow(pmvmpeibljVar), (gxszxtbevo) wkgbmnqykcVar.iobyxmoadg(gxszxtbevo.class), (eablkybsjg) wkgbmnqykcVar.iobyxmoadg(eablkybsjg.class), ((com.google.firebase.abt.component.iobyxmoadg) wkgbmnqykcVar.iobyxmoadg(com.google.firebase.abt.component.iobyxmoadg.class)).zoijcleaow("frc"), wkgbmnqykcVar.gxszxtbevo(sb.iobyxmoadg.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<ub.ppxfxbqfkf> getComponents() {
        final pmvmpeiblj pmvmpeibljVarIobyxmoadg = pmvmpeiblj.iobyxmoadg(tb.zoijcleaow.class, ScheduledExecutorService.class);
        return Arrays.asList(ub.ppxfxbqfkf.wkgbmnqykc(ppxfxbqfkf.class, rd.iobyxmoadg.class).nufgyqmvbu(LIBRARY_NAME).zoijcleaow(vdvldrhtss.gtknphoqwx(Context.class)).zoijcleaow(vdvldrhtss.draadjrbmk(pmvmpeibljVarIobyxmoadg)).zoijcleaow(vdvldrhtss.gtknphoqwx(gxszxtbevo.class)).zoijcleaow(vdvldrhtss.gtknphoqwx(eablkybsjg.class)).zoijcleaow(vdvldrhtss.gtknphoqwx(com.google.firebase.abt.component.iobyxmoadg.class)).zoijcleaow(vdvldrhtss.dxjokdxxww(sb.iobyxmoadg.class)).gxszxtbevo(new lqeggnwhkg() { // from class: pd.vdvldrhtss
            @Override // ub.lqeggnwhkg
            public final Object iobyxmoadg(ub.wkgbmnqykc wkgbmnqykcVar) {
                return RemoteConfigRegistrar.lambda$getComponents$0(pmvmpeibljVarIobyxmoadg, wkgbmnqykcVar);
            }
        }).eablkybsjg().wkgbmnqykc(), nufgyqmvbu.zoijcleaow(LIBRARY_NAME, "22.0.1"));
    }
}
