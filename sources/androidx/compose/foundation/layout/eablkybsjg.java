package androidx.compose.foundation.layout;

/* JADX INFO: loaded from: classes.dex */
final class eablkybsjg extends androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf implements z.yadqdtsiqt {

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private boolean f4843pkzmftpjix;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private float f4844ylkuphrtab;

    public eablkybsjg(float f13, boolean z13) {
        this.f4844ylkuphrtab = f13;
        this.f4843pkzmftpjix = z13;
    }

    private final long I0(long j13) {
        if (this.f4843pkzmftpjix) {
            long jM0 = M0(j13, true);
            w0.oxmwwwfdhm.iobyxmoadg iobyxmoadgVar = w0.oxmwwwfdhm.f118270zoijcleaow;
            if (!w0.oxmwwwfdhm.eablkybsjg(jM0, iobyxmoadgVar.iobyxmoadg())) {
                return jM0;
            }
            long jN0 = N0(j13, true);
            if (!w0.oxmwwwfdhm.eablkybsjg(jN0, iobyxmoadgVar.iobyxmoadg())) {
                return jN0;
            }
            long jO0 = O0(j13, true);
            if (!w0.oxmwwwfdhm.eablkybsjg(jO0, iobyxmoadgVar.iobyxmoadg())) {
                return jO0;
            }
            long jP0 = P0(j13, true);
            if (!w0.oxmwwwfdhm.eablkybsjg(jP0, iobyxmoadgVar.iobyxmoadg())) {
                return jP0;
            }
            long jM1 = M0(j13, false);
            if (!w0.oxmwwwfdhm.eablkybsjg(jM1, iobyxmoadgVar.iobyxmoadg())) {
                return jM1;
            }
            long jN1 = N0(j13, false);
            if (!w0.oxmwwwfdhm.eablkybsjg(jN1, iobyxmoadgVar.iobyxmoadg())) {
                return jN1;
            }
            long jO1 = O0(j13, false);
            if (!w0.oxmwwwfdhm.eablkybsjg(jO1, iobyxmoadgVar.iobyxmoadg())) {
                return jO1;
            }
            long jP1 = P0(j13, false);
            if (!w0.oxmwwwfdhm.eablkybsjg(jP1, iobyxmoadgVar.iobyxmoadg())) {
                return jP1;
            }
        } else {
            long jN2 = N0(j13, true);
            w0.oxmwwwfdhm.iobyxmoadg iobyxmoadgVar2 = w0.oxmwwwfdhm.f118270zoijcleaow;
            if (!w0.oxmwwwfdhm.eablkybsjg(jN2, iobyxmoadgVar2.iobyxmoadg())) {
                return jN2;
            }
            long jM2 = M0(j13, true);
            if (!w0.oxmwwwfdhm.eablkybsjg(jM2, iobyxmoadgVar2.iobyxmoadg())) {
                return jM2;
            }
            long jP2 = P0(j13, true);
            if (!w0.oxmwwwfdhm.eablkybsjg(jP2, iobyxmoadgVar2.iobyxmoadg())) {
                return jP2;
            }
            long jO2 = O0(j13, true);
            if (!w0.oxmwwwfdhm.eablkybsjg(jO2, iobyxmoadgVar2.iobyxmoadg())) {
                return jO2;
            }
            long jN3 = N0(j13, false);
            if (!w0.oxmwwwfdhm.eablkybsjg(jN3, iobyxmoadgVar2.iobyxmoadg())) {
                return jN3;
            }
            long jM3 = M0(j13, false);
            if (!w0.oxmwwwfdhm.eablkybsjg(jM3, iobyxmoadgVar2.iobyxmoadg())) {
                return jM3;
            }
            long jP3 = P0(j13, false);
            if (!w0.oxmwwwfdhm.eablkybsjg(jP3, iobyxmoadgVar2.iobyxmoadg())) {
                return jP3;
            }
            long jO3 = O0(j13, false);
            if (!w0.oxmwwwfdhm.eablkybsjg(jO3, iobyxmoadgVar2.iobyxmoadg())) {
                return jO3;
            }
        }
        return w0.oxmwwwfdhm.f118270zoijcleaow.iobyxmoadg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn J0(androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVar, androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg iobyxmoadgVar) {
        androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg.cllcsxoeiz(iobyxmoadgVar, kcexrzcfytVar, 0, 0, 0.0f, 4, null);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private final long M0(long j13, boolean z13) {
        int iRound;
        int iGtknphoqwx = w0.zoijcleaow.gtknphoqwx(j13);
        return (iGtknphoqwx == Integer.MAX_VALUE || (iRound = Math.round(((float) iGtknphoqwx) * this.f4844ylkuphrtab)) <= 0 || (z13 && !ppxfxbqfkf.ppxfxbqfkf(j13, iRound, iGtknphoqwx))) ? w0.oxmwwwfdhm.f118270zoijcleaow.iobyxmoadg() : w0.oxmwwwfdhm.ppxfxbqfkf((((long) iRound) << 32) | (((long) iGtknphoqwx) & 4294967295L));
    }

    private final long N0(long j13, boolean z13) {
        int iRound;
        int iDraadjrbmk = w0.zoijcleaow.draadjrbmk(j13);
        return (iDraadjrbmk == Integer.MAX_VALUE || (iRound = Math.round(((float) iDraadjrbmk) / this.f4844ylkuphrtab)) <= 0 || (z13 && !ppxfxbqfkf.ppxfxbqfkf(j13, iDraadjrbmk, iRound))) ? w0.oxmwwwfdhm.f118270zoijcleaow.iobyxmoadg() : w0.oxmwwwfdhm.ppxfxbqfkf((((long) iDraadjrbmk) << 32) | (((long) iRound) & 4294967295L));
    }

    private final long O0(long j13, boolean z13) {
        int iWflxmlrfwp = w0.zoijcleaow.wflxmlrfwp(j13);
        int iRound = Math.round(iWflxmlrfwp * this.f4844ylkuphrtab);
        return (iRound <= 0 || (z13 && !ppxfxbqfkf.ppxfxbqfkf(j13, iRound, iWflxmlrfwp))) ? w0.oxmwwwfdhm.f118270zoijcleaow.iobyxmoadg() : w0.oxmwwwfdhm.ppxfxbqfkf((((long) iRound) << 32) | (((long) iWflxmlrfwp) & 4294967295L));
    }

    private final long P0(long j13, boolean z13) {
        int iAgtfadlqog = w0.zoijcleaow.agtfadlqog(j13);
        int iRound = Math.round(iAgtfadlqog / this.f4844ylkuphrtab);
        return (iRound <= 0 || (z13 && !ppxfxbqfkf.ppxfxbqfkf(j13, iAgtfadlqog, iRound))) ? w0.oxmwwwfdhm.f118270zoijcleaow.iobyxmoadg() : w0.oxmwwwfdhm.ppxfxbqfkf((((long) iAgtfadlqog) << 32) | (((long) iRound) & 4294967295L));
    }

    public final void K0(float f13) {
        this.f4844ylkuphrtab = f13;
    }

    public final void L0(boolean z13) {
        this.f4843pkzmftpjix = z13;
    }

    @Override // z.yadqdtsiqt
    public int cdpycssgdh(x.wflxmlrfwp wflxmlrfwpVar, x.draadjrbmk draadjrbmkVar, int i13) {
        return i13 != Integer.MAX_VALUE ? Math.round(i13 * this.f4844ylkuphrtab) : draadjrbmkVar.czzsidtyhn(i13);
    }

    @Override // z.yadqdtsiqt
    public x.istkbnxepw gxszxtbevo(androidx.compose.ui.layout.draadjrbmk draadjrbmkVar, x.pmvmpeiblj pmvmpeibljVar, long j13) {
        long jI0 = I0(j13);
        if (!w0.oxmwwwfdhm.eablkybsjg(jI0, w0.oxmwwwfdhm.f118270zoijcleaow.iobyxmoadg())) {
            j13 = w0.zoijcleaow.f118283zoijcleaow.ppxfxbqfkf((int) (jI0 >> 32), (int) (jI0 & 4294967295L));
        }
        final androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVarSflfametgt = pmvmpeibljVar.sflfametgt(j13);
        return androidx.compose.ui.layout.draadjrbmk.ntlheqmsrt(draadjrbmkVar, kcexrzcfytVarSflfametgt.eslsurpljm(), kcexrzcfytVarSflfametgt.ipoelvxyzq(), null, new tg.draadjrbmk() { // from class: androidx.compose.foundation.layout.wkgbmnqykc
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return eablkybsjg.J0(kcexrzcfytVarSflfametgt, (androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg) obj);
            }
        }, 4, null);
    }

    @Override // z.yadqdtsiqt
    public int lmojexxdyd(x.wflxmlrfwp wflxmlrfwpVar, x.draadjrbmk draadjrbmkVar, int i13) {
        return i13 != Integer.MAX_VALUE ? Math.round(i13 * this.f4844ylkuphrtab) : draadjrbmkVar.ydmasvzmpa(i13);
    }

    @Override // z.yadqdtsiqt
    public int lqeggnwhkg(x.wflxmlrfwp wflxmlrfwpVar, x.draadjrbmk draadjrbmkVar, int i13) {
        return i13 != Integer.MAX_VALUE ? Math.round(i13 / this.f4844ylkuphrtab) : draadjrbmkVar.yggfygwlhe(i13);
    }

    @Override // z.yadqdtsiqt
    public int oxmwwwfdhm(x.wflxmlrfwp wflxmlrfwpVar, x.draadjrbmk draadjrbmkVar, int i13) {
        return i13 != Integer.MAX_VALUE ? Math.round(i13 / this.f4844ylkuphrtab) : draadjrbmkVar.wypolnanlu(i13);
    }
}
