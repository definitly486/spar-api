package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@KeepForSdk
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(ub.pmvmpeiblj pmvmpeibljVar, ub.wkgbmnqykc wkgbmnqykcVar) {
        com.google.firebase.gxszxtbevo gxszxtbevoVar = (com.google.firebase.gxszxtbevo) wkgbmnqykcVar.iobyxmoadg(com.google.firebase.gxszxtbevo.class);
        androidx.appcompat.app.yggfygwlhe.iobyxmoadg(wkgbmnqykcVar.iobyxmoadg(sc.iobyxmoadg.class));
        return new FirebaseMessaging(gxszxtbevoVar, null, wkgbmnqykcVar.gxszxtbevo(od.dxjokdxxww.class), wkgbmnqykcVar.gxszxtbevo(rc.btonecajqb.class), (uc.eablkybsjg) wkgbmnqykcVar.iobyxmoadg(uc.eablkybsjg.class), wkgbmnqykcVar.lqeggnwhkg(pmvmpeibljVar), (qc.wkgbmnqykc) wkgbmnqykcVar.iobyxmoadg(qc.wkgbmnqykc.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<ub.ppxfxbqfkf> getComponents() {
        final ub.pmvmpeiblj pmvmpeibljVarIobyxmoadg = ub.pmvmpeiblj.iobyxmoadg(kc.zoijcleaow.class, o9.btonecajqb.class);
        return Arrays.asList(ub.ppxfxbqfkf.ppxfxbqfkf(FirebaseMessaging.class).nufgyqmvbu(LIBRARY_NAME).zoijcleaow(ub.vdvldrhtss.gtknphoqwx(com.google.firebase.gxszxtbevo.class)).zoijcleaow(ub.vdvldrhtss.nufgyqmvbu(sc.iobyxmoadg.class)).zoijcleaow(ub.vdvldrhtss.dxjokdxxww(od.dxjokdxxww.class)).zoijcleaow(ub.vdvldrhtss.dxjokdxxww(rc.btonecajqb.class)).zoijcleaow(ub.vdvldrhtss.gtknphoqwx(uc.eablkybsjg.class)).zoijcleaow(ub.vdvldrhtss.btonecajqb(pmvmpeibljVarIobyxmoadg)).zoijcleaow(ub.vdvldrhtss.gtknphoqwx(qc.wkgbmnqykc.class)).gxszxtbevo(new ub.lqeggnwhkg() { // from class: com.google.firebase.messaging.pmvmpeiblj
            @Override // ub.lqeggnwhkg
            public final Object iobyxmoadg(ub.wkgbmnqykc wkgbmnqykcVar) {
                return FirebaseMessagingRegistrar.lambda$getComponents$0(pmvmpeibljVarIobyxmoadg, wkgbmnqykcVar);
            }
        }).ppxfxbqfkf().wkgbmnqykc(), od.nufgyqmvbu.zoijcleaow(LIBRARY_NAME, "24.0.3"));
    }
}
