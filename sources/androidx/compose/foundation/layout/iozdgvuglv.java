package androidx.compose.foundation.layout;

/* JADX INFO: loaded from: classes.dex */
final class iozdgvuglv extends androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf implements z.yadqdtsiqt {

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private float f4856hcddaimhww;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private boolean f4857hkdspvbjdz;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private float f4858jpowsppfya;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private float f4859pkzmftpjix;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private float f4860ylkuphrtab;

    public /* synthetic */ iozdgvuglv(float f13, float f14, float f15, float f16, boolean z13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(f13, f14, f15, f16, z13);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    private final long I0(w0.wkgbmnqykc wkgbmnqykcVar) {
        int iHszhottldk;
        int iHszhottldk2;
        int iHszhottldk3;
        int i13 = 0;
        if (Float.isNaN(this.f4856hcddaimhww)) {
            iHszhottldk = Integer.MAX_VALUE;
        } else {
            iHszhottldk = wkgbmnqykcVar.hszhottldk(this.f4856hcddaimhww);
            if (iHszhottldk < 0) {
                iHszhottldk = 0;
            }
        }
        if (Float.isNaN(this.f4858jpowsppfya)) {
            iHszhottldk2 = Integer.MAX_VALUE;
        } else {
            iHszhottldk2 = wkgbmnqykcVar.hszhottldk(this.f4858jpowsppfya);
            if (iHszhottldk2 < 0) {
                iHszhottldk2 = 0;
            }
        }
        if (Float.isNaN(this.f4860ylkuphrtab)) {
            iHszhottldk3 = 0;
        } else {
            iHszhottldk3 = wkgbmnqykcVar.hszhottldk(this.f4860ylkuphrtab);
            if (iHszhottldk3 < 0) {
                iHszhottldk3 = 0;
            }
            if (iHszhottldk3 > iHszhottldk) {
                iHszhottldk3 = iHszhottldk;
            }
            if (iHszhottldk3 == Integer.MAX_VALUE) {
                iHszhottldk3 = 0;
            }
        }
        if (!Float.isNaN(this.f4859pkzmftpjix)) {
            int iHszhottldk4 = wkgbmnqykcVar.hszhottldk(this.f4859pkzmftpjix);
            if (iHszhottldk4 < 0) {
                iHszhottldk4 = 0;
            }
            if (iHszhottldk4 > iHszhottldk2) {
                iHszhottldk4 = iHszhottldk2;
            }
            if (iHszhottldk4 != Integer.MAX_VALUE) {
                i13 = iHszhottldk4;
            }
        }
        return w0.ppxfxbqfkf.iobyxmoadg(iHszhottldk3, iHszhottldk, i13, iHszhottldk2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn J0(androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVar, androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg iobyxmoadgVar) {
        androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg.cllcsxoeiz(iobyxmoadgVar, kcexrzcfytVar, 0, 0, 0.0f, 4, null);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public final void K0(boolean z13) {
        this.f4857hkdspvbjdz = z13;
    }

    public final void L0(float f13) {
        this.f4858jpowsppfya = f13;
    }

    public final void M0(float f13) {
        this.f4856hcddaimhww = f13;
    }

    public final void N0(float f13) {
        this.f4859pkzmftpjix = f13;
    }

    public final void O0(float f13) {
        this.f4860ylkuphrtab = f13;
    }

    @Override // z.yadqdtsiqt
    public int cdpycssgdh(x.wflxmlrfwp wflxmlrfwpVar, x.draadjrbmk draadjrbmkVar, int i13) {
        long jI0 = I0(wflxmlrfwpVar);
        if (w0.zoijcleaow.btonecajqb(jI0)) {
            return w0.zoijcleaow.draadjrbmk(jI0);
        }
        if (!this.f4857hkdspvbjdz) {
            i13 = w0.ppxfxbqfkf.gxszxtbevo(jI0, i13);
        }
        return w0.ppxfxbqfkf.lqeggnwhkg(jI0, draadjrbmkVar.czzsidtyhn(i13));
    }

    @Override // z.yadqdtsiqt
    public x.istkbnxepw gxszxtbevo(androidx.compose.ui.layout.draadjrbmk draadjrbmkVar, x.pmvmpeiblj pmvmpeibljVar, long j13) {
        int iAgtfadlqog;
        int iDraadjrbmk;
        int iWflxmlrfwp;
        int iGtknphoqwx;
        long jIobyxmoadg;
        long jI0 = I0(draadjrbmkVar);
        if (this.f4857hkdspvbjdz) {
            jIobyxmoadg = w0.ppxfxbqfkf.eablkybsjg(j13, jI0);
        } else {
            if (Float.isNaN(this.f4860ylkuphrtab)) {
                iAgtfadlqog = w0.zoijcleaow.agtfadlqog(j13);
                int iDraadjrbmk2 = w0.zoijcleaow.draadjrbmk(jI0);
                if (iAgtfadlqog > iDraadjrbmk2) {
                    iAgtfadlqog = iDraadjrbmk2;
                }
            } else {
                iAgtfadlqog = w0.zoijcleaow.agtfadlqog(jI0);
            }
            if (Float.isNaN(this.f4856hcddaimhww)) {
                iDraadjrbmk = w0.zoijcleaow.draadjrbmk(j13);
                int iAgtfadlqog2 = w0.zoijcleaow.agtfadlqog(jI0);
                if (iDraadjrbmk < iAgtfadlqog2) {
                    iDraadjrbmk = iAgtfadlqog2;
                }
            } else {
                iDraadjrbmk = w0.zoijcleaow.draadjrbmk(jI0);
            }
            if (Float.isNaN(this.f4859pkzmftpjix)) {
                iWflxmlrfwp = w0.zoijcleaow.wflxmlrfwp(j13);
                int iGtknphoqwx2 = w0.zoijcleaow.gtknphoqwx(jI0);
                if (iWflxmlrfwp > iGtknphoqwx2) {
                    iWflxmlrfwp = iGtknphoqwx2;
                }
            } else {
                iWflxmlrfwp = w0.zoijcleaow.wflxmlrfwp(jI0);
            }
            if (Float.isNaN(this.f4858jpowsppfya)) {
                iGtknphoqwx = w0.zoijcleaow.gtknphoqwx(j13);
                int iWflxmlrfwp2 = w0.zoijcleaow.wflxmlrfwp(jI0);
                if (iGtknphoqwx < iWflxmlrfwp2) {
                    iGtknphoqwx = iWflxmlrfwp2;
                }
            } else {
                iGtknphoqwx = w0.zoijcleaow.gtknphoqwx(jI0);
            }
            jIobyxmoadg = w0.ppxfxbqfkf.iobyxmoadg(iAgtfadlqog, iDraadjrbmk, iWflxmlrfwp, iGtknphoqwx);
        }
        final androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVarSflfametgt = pmvmpeibljVar.sflfametgt(jIobyxmoadg);
        return androidx.compose.ui.layout.draadjrbmk.ntlheqmsrt(draadjrbmkVar, kcexrzcfytVarSflfametgt.eslsurpljm(), kcexrzcfytVarSflfametgt.ipoelvxyzq(), null, new tg.draadjrbmk() { // from class: androidx.compose.foundation.layout.yadqdtsiqt
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return iozdgvuglv.J0(kcexrzcfytVarSflfametgt, (androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg) obj);
            }
        }, 4, null);
    }

    @Override // z.yadqdtsiqt
    public int lmojexxdyd(x.wflxmlrfwp wflxmlrfwpVar, x.draadjrbmk draadjrbmkVar, int i13) {
        long jI0 = I0(wflxmlrfwpVar);
        if (w0.zoijcleaow.btonecajqb(jI0)) {
            return w0.zoijcleaow.draadjrbmk(jI0);
        }
        if (!this.f4857hkdspvbjdz) {
            i13 = w0.ppxfxbqfkf.gxszxtbevo(jI0, i13);
        }
        return w0.ppxfxbqfkf.lqeggnwhkg(jI0, draadjrbmkVar.ydmasvzmpa(i13));
    }

    @Override // z.yadqdtsiqt
    public int lqeggnwhkg(x.wflxmlrfwp wflxmlrfwpVar, x.draadjrbmk draadjrbmkVar, int i13) {
        long jI0 = I0(wflxmlrfwpVar);
        if (w0.zoijcleaow.dxjokdxxww(jI0)) {
            return w0.zoijcleaow.gtknphoqwx(jI0);
        }
        if (!this.f4857hkdspvbjdz) {
            i13 = w0.ppxfxbqfkf.lqeggnwhkg(jI0, i13);
        }
        return w0.ppxfxbqfkf.gxszxtbevo(jI0, draadjrbmkVar.yggfygwlhe(i13));
    }

    @Override // z.yadqdtsiqt
    public int oxmwwwfdhm(x.wflxmlrfwp wflxmlrfwpVar, x.draadjrbmk draadjrbmkVar, int i13) {
        long jI0 = I0(wflxmlrfwpVar);
        if (w0.zoijcleaow.dxjokdxxww(jI0)) {
            return w0.zoijcleaow.gtknphoqwx(jI0);
        }
        if (!this.f4857hkdspvbjdz) {
            i13 = w0.ppxfxbqfkf.lqeggnwhkg(jI0, i13);
        }
        return w0.ppxfxbqfkf.gxszxtbevo(jI0, draadjrbmkVar.wypolnanlu(i13));
    }

    private iozdgvuglv(float f13, float f14, float f15, float f16, boolean z13) {
        this.f4860ylkuphrtab = f13;
        this.f4859pkzmftpjix = f14;
        this.f4856hcddaimhww = f15;
        this.f4858jpowsppfya = f16;
        this.f4857hkdspvbjdz = z13;
    }
}
