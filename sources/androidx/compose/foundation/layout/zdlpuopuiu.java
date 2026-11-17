package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.ixidwrxhsl;

/* JADX INFO: loaded from: classes.dex */
public abstract class zdlpuopuiu {
    public static final androidx.compose.ui.wkgbmnqykc eablkybsjg(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, final float f13, final float f14) {
        return wkgbmnqykcVar.eablkybsjg(new OffsetModifierElement(f13, f14, true, new tg.draadjrbmk() { // from class: czzsidtyhn.xrmfcynszj
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                float f15 = f13;
                float f16 = f14;
                androidx.appcompat.app.yggfygwlhe.iobyxmoadg(obj);
                return androidx.compose.foundation.layout.zdlpuopuiu.lqeggnwhkg(f15, f16, null);
            }
        }, null));
    }

    public static /* synthetic */ androidx.compose.ui.wkgbmnqykc gxszxtbevo(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, float f13, float f14, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            f13 = w0.nufgyqmvbu.lqeggnwhkg(0);
        }
        if ((i13 & 2) != 0) {
            f14 = w0.nufgyqmvbu.lqeggnwhkg(0);
        }
        return eablkybsjg(wkgbmnqykcVar, f13, f14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn lqeggnwhkg(float f13, float f14, ixidwrxhsl ixidwrxhslVar) {
        throw null;
    }

    public static final androidx.compose.ui.wkgbmnqykc ppxfxbqfkf(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, final tg.draadjrbmk draadjrbmkVar) {
        return wkgbmnqykcVar.eablkybsjg(new OffsetPxModifier(draadjrbmkVar, true, new tg.draadjrbmk() { // from class: czzsidtyhn.jztzpxfvev
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                tg.draadjrbmk draadjrbmkVar2 = draadjrbmkVar;
                androidx.appcompat.app.yggfygwlhe.iobyxmoadg(obj);
                return androidx.compose.foundation.layout.zdlpuopuiu.wkgbmnqykc(draadjrbmkVar2, null);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn wkgbmnqykc(tg.draadjrbmk draadjrbmkVar, ixidwrxhsl ixidwrxhslVar) {
        throw null;
    }
}
