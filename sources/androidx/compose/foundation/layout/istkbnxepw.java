package androidx.compose.foundation.layout;

import czzsidtyhn.ydmasvzmpa;

/* JADX INFO: loaded from: classes.dex */
final class istkbnxepw extends androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf implements z.yadqdtsiqt {

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private ydmasvzmpa f4861ylkuphrtab;

    public istkbnxepw(ydmasvzmpa ydmasvzmpaVar) {
        this.f4861ylkuphrtab = ydmasvzmpaVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn I0(androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVar, int i13, int i14, androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg iobyxmoadgVar) {
        androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg.cdpycssgdh(iobyxmoadgVar, kcexrzcfytVar, i13, i14, 0.0f, 4, null);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public final void J0(ydmasvzmpa ydmasvzmpaVar) {
        this.f4861ylkuphrtab = ydmasvzmpaVar;
    }

    @Override // z.yadqdtsiqt
    public x.istkbnxepw gxszxtbevo(androidx.compose.ui.layout.draadjrbmk draadjrbmkVar, x.pmvmpeiblj pmvmpeibljVar, long j13) {
        float fPpxfxbqfkf = this.f4861ylkuphrtab.ppxfxbqfkf(draadjrbmkVar.getLayoutDirection());
        float fWkgbmnqykc = this.f4861ylkuphrtab.wkgbmnqykc();
        float fZoijcleaow = this.f4861ylkuphrtab.zoijcleaow(draadjrbmkVar.getLayoutDirection());
        float fIobyxmoadg = this.f4861ylkuphrtab.iobyxmoadg();
        float f13 = 0;
        if (!((w0.nufgyqmvbu.gxszxtbevo(fIobyxmoadg, w0.nufgyqmvbu.lqeggnwhkg(f13)) >= 0) & (w0.nufgyqmvbu.gxszxtbevo(fPpxfxbqfkf, w0.nufgyqmvbu.lqeggnwhkg(f13)) >= 0) & (w0.nufgyqmvbu.gxszxtbevo(fWkgbmnqykc, w0.nufgyqmvbu.lqeggnwhkg(f13)) >= 0) & (w0.nufgyqmvbu.gxszxtbevo(fZoijcleaow, w0.nufgyqmvbu.lqeggnwhkg(f13)) >= 0))) {
            uwvvkdfqfp.iobyxmoadg.iobyxmoadg("Padding must be non-negative");
        }
        final int iHszhottldk = draadjrbmkVar.hszhottldk(fPpxfxbqfkf);
        int iHszhottldk2 = draadjrbmkVar.hszhottldk(fZoijcleaow) + iHszhottldk;
        final int iHszhottldk3 = draadjrbmkVar.hszhottldk(fWkgbmnqykc);
        int iHszhottldk4 = draadjrbmkVar.hszhottldk(fIobyxmoadg) + iHszhottldk3;
        final androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVarSflfametgt = pmvmpeibljVar.sflfametgt(w0.ppxfxbqfkf.dxjokdxxww(j13, -iHszhottldk2, -iHszhottldk4));
        return androidx.compose.ui.layout.draadjrbmk.ntlheqmsrt(draadjrbmkVar, w0.ppxfxbqfkf.lqeggnwhkg(j13, kcexrzcfytVarSflfametgt.eslsurpljm() + iHszhottldk2), w0.ppxfxbqfkf.gxszxtbevo(j13, kcexrzcfytVarSflfametgt.ipoelvxyzq() + iHszhottldk4), null, new tg.draadjrbmk() { // from class: androidx.compose.foundation.layout.zynmafqrjb
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return istkbnxepw.I0(kcexrzcfytVarSflfametgt, iHszhottldk, iHszhottldk3, (androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg) obj);
            }
        }, 4, null);
    }
}
