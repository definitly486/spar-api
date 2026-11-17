package androidx.compose.foundation.layout;

/* JADX INFO: loaded from: classes.dex */
final class ojitshcjhn extends androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf implements z.yadqdtsiqt {

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private float f4878pkzmftpjix;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private czzsidtyhn.yggfygwlhe f4879ylkuphrtab;

    public ojitshcjhn(czzsidtyhn.yggfygwlhe yggfygwlheVar, float f13) {
        this.f4879ylkuphrtab = yggfygwlheVar;
        this.f4878pkzmftpjix = f13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn I0(androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVar, androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg iobyxmoadgVar) {
        androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg.cllcsxoeiz(iobyxmoadgVar, kcexrzcfytVar, 0, 0, 0.0f, 4, null);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public final void J0(czzsidtyhn.yggfygwlhe yggfygwlheVar) {
        this.f4879ylkuphrtab = yggfygwlheVar;
    }

    public final void K0(float f13) {
        this.f4878pkzmftpjix = f13;
    }

    @Override // z.yadqdtsiqt
    public x.istkbnxepw gxszxtbevo(androidx.compose.ui.layout.draadjrbmk draadjrbmkVar, x.pmvmpeiblj pmvmpeibljVar, long j13) {
        int iAgtfadlqog;
        int iDraadjrbmk;
        int iGtknphoqwx;
        int iGtknphoqwx2;
        if (!w0.zoijcleaow.nufgyqmvbu(j13) || this.f4879ylkuphrtab == czzsidtyhn.yggfygwlhe.Vertical) {
            iAgtfadlqog = w0.zoijcleaow.agtfadlqog(j13);
            iDraadjrbmk = w0.zoijcleaow.draadjrbmk(j13);
        } else {
            int iRound = Math.round(w0.zoijcleaow.draadjrbmk(j13) * this.f4878pkzmftpjix);
            int iAgtfadlqog2 = w0.zoijcleaow.agtfadlqog(j13);
            iAgtfadlqog = w0.zoijcleaow.draadjrbmk(j13);
            if (iRound < iAgtfadlqog2) {
                iRound = iAgtfadlqog2;
            }
            if (iRound <= iAgtfadlqog) {
                iAgtfadlqog = iRound;
            }
            iDraadjrbmk = iAgtfadlqog;
        }
        if (!w0.zoijcleaow.lqeggnwhkg(j13) || this.f4879ylkuphrtab == czzsidtyhn.yggfygwlhe.Horizontal) {
            int iWflxmlrfwp = w0.zoijcleaow.wflxmlrfwp(j13);
            iGtknphoqwx = w0.zoijcleaow.gtknphoqwx(j13);
            iGtknphoqwx2 = iWflxmlrfwp;
        } else {
            int iRound2 = Math.round(w0.zoijcleaow.gtknphoqwx(j13) * this.f4878pkzmftpjix);
            int iWflxmlrfwp2 = w0.zoijcleaow.wflxmlrfwp(j13);
            iGtknphoqwx2 = w0.zoijcleaow.gtknphoqwx(j13);
            if (iRound2 < iWflxmlrfwp2) {
                iRound2 = iWflxmlrfwp2;
            }
            if (iRound2 <= iGtknphoqwx2) {
                iGtknphoqwx2 = iRound2;
            }
            iGtknphoqwx = iGtknphoqwx2;
        }
        final androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVarSflfametgt = pmvmpeibljVar.sflfametgt(w0.ppxfxbqfkf.iobyxmoadg(iAgtfadlqog, iDraadjrbmk, iGtknphoqwx2, iGtknphoqwx));
        return androidx.compose.ui.layout.draadjrbmk.ntlheqmsrt(draadjrbmkVar, kcexrzcfytVarSflfametgt.eslsurpljm(), kcexrzcfytVarSflfametgt.ipoelvxyzq(), null, new tg.draadjrbmk() { // from class: androidx.compose.foundation.layout.agtfadlqog
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ojitshcjhn.I0(kcexrzcfytVarSflfametgt, (androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg) obj);
            }
        }, 4, null);
    }
}
