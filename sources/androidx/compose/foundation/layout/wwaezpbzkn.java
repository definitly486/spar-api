package androidx.compose.foundation.layout;

/* JADX INFO: loaded from: classes.dex */
final class wwaezpbzkn extends androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf implements z.yadqdtsiqt {

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private float f4895pkzmftpjix;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private float f4896ylkuphrtab;

    public /* synthetic */ wwaezpbzkn(float f13, float f14, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(f13, f14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn I0(androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVar, androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg iobyxmoadgVar) {
        androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg.cllcsxoeiz(iobyxmoadgVar, kcexrzcfytVar, 0, 0, 0.0f, 4, null);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public final void J0(float f13) {
        this.f4895pkzmftpjix = f13;
    }

    public final void K0(float f13) {
        this.f4896ylkuphrtab = f13;
    }

    @Override // z.yadqdtsiqt
    public int cdpycssgdh(x.wflxmlrfwp wflxmlrfwpVar, x.draadjrbmk draadjrbmkVar, int i13) {
        int iCzzsidtyhn = draadjrbmkVar.czzsidtyhn(i13);
        int iHszhottldk = !Float.isNaN(this.f4896ylkuphrtab) ? wflxmlrfwpVar.hszhottldk(this.f4896ylkuphrtab) : 0;
        return iCzzsidtyhn < iHszhottldk ? iHszhottldk : iCzzsidtyhn;
    }

    @Override // z.yadqdtsiqt
    public x.istkbnxepw gxszxtbevo(androidx.compose.ui.layout.draadjrbmk draadjrbmkVar, x.pmvmpeiblj pmvmpeibljVar, long j13) {
        int iAgtfadlqog;
        int iWflxmlrfwp;
        if (Float.isNaN(this.f4896ylkuphrtab) || w0.zoijcleaow.agtfadlqog(j13) != 0) {
            iAgtfadlqog = w0.zoijcleaow.agtfadlqog(j13);
        } else {
            int iHszhottldk = draadjrbmkVar.hszhottldk(this.f4896ylkuphrtab);
            iAgtfadlqog = w0.zoijcleaow.draadjrbmk(j13);
            if (iHszhottldk < 0) {
                iHszhottldk = 0;
            }
            if (iHszhottldk <= iAgtfadlqog) {
                iAgtfadlqog = iHszhottldk;
            }
        }
        int iDraadjrbmk = w0.zoijcleaow.draadjrbmk(j13);
        if (Float.isNaN(this.f4895pkzmftpjix) || w0.zoijcleaow.wflxmlrfwp(j13) != 0) {
            iWflxmlrfwp = w0.zoijcleaow.wflxmlrfwp(j13);
        } else {
            int iHszhottldk2 = draadjrbmkVar.hszhottldk(this.f4895pkzmftpjix);
            iWflxmlrfwp = w0.zoijcleaow.gtknphoqwx(j13);
            int i13 = iHszhottldk2 >= 0 ? iHszhottldk2 : 0;
            if (i13 <= iWflxmlrfwp) {
                iWflxmlrfwp = i13;
            }
        }
        final androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVarSflfametgt = pmvmpeibljVar.sflfametgt(w0.ppxfxbqfkf.iobyxmoadg(iAgtfadlqog, iDraadjrbmk, iWflxmlrfwp, w0.zoijcleaow.gtknphoqwx(j13)));
        return androidx.compose.ui.layout.draadjrbmk.ntlheqmsrt(draadjrbmkVar, kcexrzcfytVarSflfametgt.eslsurpljm(), kcexrzcfytVarSflfametgt.ipoelvxyzq(), null, new tg.draadjrbmk() { // from class: androidx.compose.foundation.layout.lmojexxdyd
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return wwaezpbzkn.I0(kcexrzcfytVarSflfametgt, (androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg) obj);
            }
        }, 4, null);
    }

    @Override // z.yadqdtsiqt
    public int lmojexxdyd(x.wflxmlrfwp wflxmlrfwpVar, x.draadjrbmk draadjrbmkVar, int i13) {
        int iYdmasvzmpa = draadjrbmkVar.ydmasvzmpa(i13);
        int iHszhottldk = !Float.isNaN(this.f4896ylkuphrtab) ? wflxmlrfwpVar.hszhottldk(this.f4896ylkuphrtab) : 0;
        return iYdmasvzmpa < iHszhottldk ? iHszhottldk : iYdmasvzmpa;
    }

    @Override // z.yadqdtsiqt
    public int lqeggnwhkg(x.wflxmlrfwp wflxmlrfwpVar, x.draadjrbmk draadjrbmkVar, int i13) {
        int iYggfygwlhe = draadjrbmkVar.yggfygwlhe(i13);
        int iHszhottldk = !Float.isNaN(this.f4895pkzmftpjix) ? wflxmlrfwpVar.hszhottldk(this.f4895pkzmftpjix) : 0;
        return iYggfygwlhe < iHszhottldk ? iHszhottldk : iYggfygwlhe;
    }

    @Override // z.yadqdtsiqt
    public int oxmwwwfdhm(x.wflxmlrfwp wflxmlrfwpVar, x.draadjrbmk draadjrbmkVar, int i13) {
        int iWypolnanlu = draadjrbmkVar.wypolnanlu(i13);
        int iHszhottldk = !Float.isNaN(this.f4895pkzmftpjix) ? wflxmlrfwpVar.hszhottldk(this.f4895pkzmftpjix) : 0;
        return iWypolnanlu < iHszhottldk ? iHszhottldk : iWypolnanlu;
    }

    private wwaezpbzkn(float f13, float f14) {
        this.f4896ylkuphrtab = f13;
        this.f4895pkzmftpjix = f14;
    }
}
