package czzsidtyhn;

/* JADX INFO: loaded from: classes.dex */
public interface hkdspvbjdz extends opjhrmiecq {
    /* JADX INFO: Access modifiers changed from: private */
    static gg.wwaezpbzkn agtfadlqog(int[] iArr, int i13, int i14, int i15, androidx.compose.ui.layout.kcexrzcfyt[] kcexrzcfytVarArr, hkdspvbjdz hkdspvbjdzVar, int i16, w0.zdlpuopuiu zdlpuopuiuVar, int i17, int[] iArr2, androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg iobyxmoadgVar) {
        int i18 = iArr != null ? iArr[i13] : 0;
        for (int i19 = i14; i19 < i15; i19++) {
            androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVar = kcexrzcfytVarArr[i19];
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(kcexrzcfytVar);
            int iWflxmlrfwp = hkdspvbjdzVar.wflxmlrfwp(kcexrzcfytVar, i16, zdlpuopuiuVar, i17) + i18;
            if (hkdspvbjdzVar.wkgbmnqykc()) {
                androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg.cdpycssgdh(iobyxmoadgVar, kcexrzcfytVar, iArr2[i19 - i14], iWflxmlrfwp, 0.0f, 4, null);
            } else {
                androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg.cdpycssgdh(iobyxmoadgVar, kcexrzcfytVar, iWflxmlrfwp, iArr2[i19 - i14], 0.0f, 4, null);
            }
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    zdlpuopuiu draadjrbmk();

    @Override // czzsidtyhn.opjhrmiecq
    default int dxjokdxxww(androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVar) {
        return wkgbmnqykc() ? kcexrzcfytVar.ezmngbhpjk() : kcexrzcfytVar.grlcpdaxtj();
    }

    @Override // czzsidtyhn.opjhrmiecq
    default void eablkybsjg(int i13, int[] iArr, int[] iArr2, androidx.compose.ui.layout.draadjrbmk draadjrbmkVar) {
        if (wkgbmnqykc()) {
            vdvldrhtss().ppxfxbqfkf(draadjrbmkVar, i13, iArr, draadjrbmkVar.getLayoutDirection(), iArr2);
        } else {
            oxmwwwfdhm().zoijcleaow(draadjrbmkVar, i13, iArr, iArr2);
        }
    }

    @Override // czzsidtyhn.opjhrmiecq
    default int gtknphoqwx(androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVar) {
        return wkgbmnqykc() ? kcexrzcfytVar.grlcpdaxtj() : kcexrzcfytVar.ezmngbhpjk();
    }

    @Override // czzsidtyhn.opjhrmiecq
    default x.istkbnxepw nufgyqmvbu(final androidx.compose.ui.layout.kcexrzcfyt[] kcexrzcfytVarArr, androidx.compose.ui.layout.draadjrbmk draadjrbmkVar, final int i13, final int[] iArr, int i14, final int i15, final int[] iArr2, final int i16, final int i17, final int i18) {
        int i19;
        int i23;
        if (wkgbmnqykc()) {
            i23 = i14;
            i19 = i15;
        } else {
            i19 = i14;
            i23 = i15;
        }
        final w0.zdlpuopuiu layoutDirection = wkgbmnqykc() ? w0.zdlpuopuiu.Ltr : draadjrbmkVar.getLayoutDirection();
        return androidx.compose.ui.layout.draadjrbmk.ntlheqmsrt(draadjrbmkVar, i23, i19, null, new tg.draadjrbmk() { // from class: czzsidtyhn.jpowsppfya
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return hkdspvbjdz.agtfadlqog(iArr2, i16, i17, i18, kcexrzcfytVarArr, this, i15, layoutDirection, i13, iArr, (androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg) obj);
            }
        }, 4, null);
    }

    eablkybsjg.wflxmlrfwp oxmwwwfdhm();

    @Override // czzsidtyhn.opjhrmiecq
    default long ppxfxbqfkf(int i13, int i14, int i15, int i16, boolean z13) {
        return wkgbmnqykc() ? lrnfpwlwnk.iobyxmoadg(z13, i13, i14, i15, i16) : wflxmlrfwp.zoijcleaow(z13, i13, i14, i15, i16);
    }

    eablkybsjg.InterfaceC0470eablkybsjg vdvldrhtss();

    default int wflxmlrfwp(androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVar, int i13, w0.zdlpuopuiu zdlpuopuiuVar, int i14) {
        zdlpuopuiu zdlpuopuiuVarDraadjrbmk;
        weqkydbzbr weqkydbzbrVarPpxfxbqfkf = bfopjjpdmp.ppxfxbqfkf(kcexrzcfytVar);
        if (weqkydbzbrVarPpxfxbqfkf == null || (zdlpuopuiuVarDraadjrbmk = weqkydbzbrVarPpxfxbqfkf.iobyxmoadg()) == null) {
            zdlpuopuiuVarDraadjrbmk = draadjrbmk();
        }
        return zdlpuopuiuVarDraadjrbmk.iobyxmoadg(i13 - gtknphoqwx(kcexrzcfytVar), zdlpuopuiuVar, kcexrzcfytVar, i14);
    }

    boolean wkgbmnqykc();
}
