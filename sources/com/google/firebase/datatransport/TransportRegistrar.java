package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.datatransport.cct.iobyxmoadg;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import java.util.Arrays;
import java.util.List;
import kc.zoijcleaow;
import o9.btonecajqb;
import od.nufgyqmvbu;
import q9.yggfygwlhe;
import ub.lqeggnwhkg;
import ub.pmvmpeiblj;
import ub.ppxfxbqfkf;
import ub.vdvldrhtss;
import ub.wkgbmnqykc;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ btonecajqb lambda$getComponents$0(wkgbmnqykc wkgbmnqykcVar) {
        yggfygwlhe.gxszxtbevo((Context) wkgbmnqykcVar.iobyxmoadg(Context.class));
        return yggfygwlhe.ppxfxbqfkf().lqeggnwhkg(iobyxmoadg.f21804nufgyqmvbu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ btonecajqb lambda$getComponents$1(wkgbmnqykc wkgbmnqykcVar) {
        yggfygwlhe.gxszxtbevo((Context) wkgbmnqykcVar.iobyxmoadg(Context.class));
        return yggfygwlhe.ppxfxbqfkf().lqeggnwhkg(iobyxmoadg.f21804nufgyqmvbu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ btonecajqb lambda$getComponents$2(wkgbmnqykc wkgbmnqykcVar) {
        yggfygwlhe.gxszxtbevo((Context) wkgbmnqykcVar.iobyxmoadg(Context.class));
        return yggfygwlhe.ppxfxbqfkf().lqeggnwhkg(iobyxmoadg.f21803lqeggnwhkg);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<ppxfxbqfkf> getComponents() {
        return Arrays.asList(ppxfxbqfkf.ppxfxbqfkf(btonecajqb.class).nufgyqmvbu(LIBRARY_NAME).zoijcleaow(vdvldrhtss.gtknphoqwx(Context.class)).gxszxtbevo(new lqeggnwhkg() { // from class: kc.ppxfxbqfkf
            @Override // ub.lqeggnwhkg
            public final Object iobyxmoadg(ub.wkgbmnqykc wkgbmnqykcVar) {
                return TransportRegistrar.lambda$getComponents$0(wkgbmnqykcVar);
            }
        }).wkgbmnqykc(), ppxfxbqfkf.eablkybsjg(pmvmpeiblj.iobyxmoadg(kc.iobyxmoadg.class, btonecajqb.class)).zoijcleaow(vdvldrhtss.gtknphoqwx(Context.class)).gxszxtbevo(new lqeggnwhkg() { // from class: kc.wkgbmnqykc
            @Override // ub.lqeggnwhkg
            public final Object iobyxmoadg(ub.wkgbmnqykc wkgbmnqykcVar) {
                return TransportRegistrar.lambda$getComponents$1(wkgbmnqykcVar);
            }
        }).wkgbmnqykc(), ppxfxbqfkf.eablkybsjg(pmvmpeiblj.iobyxmoadg(zoijcleaow.class, btonecajqb.class)).zoijcleaow(vdvldrhtss.gtknphoqwx(Context.class)).gxszxtbevo(new lqeggnwhkg() { // from class: kc.eablkybsjg
            @Override // ub.lqeggnwhkg
            public final Object iobyxmoadg(ub.wkgbmnqykc wkgbmnqykcVar) {
                return TransportRegistrar.lambda$getComponents$2(wkgbmnqykcVar);
            }
        }).wkgbmnqykc(), nufgyqmvbu.zoijcleaow(LIBRARY_NAME, "19.0.0"));
    }
}
