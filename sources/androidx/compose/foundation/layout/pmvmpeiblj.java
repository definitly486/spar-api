package androidx.compose.foundation.layout;

/* JADX INFO: loaded from: classes.dex */
final class pmvmpeiblj extends androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf implements z.yadqdtsiqt {

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private float f4883hcddaimhww;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private boolean f4884hkdspvbjdz;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private float f4885jpowsppfya;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private float f4886pkzmftpjix;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private float f4887ylkuphrtab;

    public /* synthetic */ pmvmpeiblj(float f13, float f14, float f15, float f16, boolean z13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(f13, f14, f15, f16, z13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn I0(pmvmpeiblj pmvmpeibljVar, androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVar, androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg iobyxmoadgVar) {
        if (pmvmpeibljVar.f4884hkdspvbjdz) {
            androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg.cllcsxoeiz(iobyxmoadgVar, kcexrzcfytVar, iobyxmoadgVar.hszhottldk(pmvmpeibljVar.f4887ylkuphrtab), iobyxmoadgVar.hszhottldk(pmvmpeibljVar.f4886pkzmftpjix), 0.0f, 4, null);
        } else {
            androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg.cdpycssgdh(iobyxmoadgVar, kcexrzcfytVar, iobyxmoadgVar.hszhottldk(pmvmpeibljVar.f4887ylkuphrtab), iobyxmoadgVar.hszhottldk(pmvmpeibljVar.f4886pkzmftpjix), 0.0f, 4, null);
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public final void J0(float f13) {
        this.f4885jpowsppfya = f13;
    }

    public final void K0(float f13) {
        this.f4883hcddaimhww = f13;
    }

    public final void L0(boolean z13) {
        this.f4884hkdspvbjdz = z13;
    }

    public final void M0(float f13) {
        this.f4887ylkuphrtab = f13;
    }

    public final void N0(float f13) {
        this.f4886pkzmftpjix = f13;
    }

    @Override // z.yadqdtsiqt
    public x.istkbnxepw gxszxtbevo(androidx.compose.ui.layout.draadjrbmk draadjrbmkVar, x.pmvmpeiblj pmvmpeibljVar, long j13) {
        int iHszhottldk = draadjrbmkVar.hszhottldk(this.f4887ylkuphrtab) + draadjrbmkVar.hszhottldk(this.f4883hcddaimhww);
        int iHszhottldk2 = draadjrbmkVar.hszhottldk(this.f4886pkzmftpjix) + draadjrbmkVar.hszhottldk(this.f4885jpowsppfya);
        final androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVarSflfametgt = pmvmpeibljVar.sflfametgt(w0.ppxfxbqfkf.dxjokdxxww(j13, -iHszhottldk, -iHszhottldk2));
        return androidx.compose.ui.layout.draadjrbmk.ntlheqmsrt(draadjrbmkVar, w0.ppxfxbqfkf.lqeggnwhkg(j13, kcexrzcfytVarSflfametgt.eslsurpljm() + iHszhottldk), w0.ppxfxbqfkf.gxszxtbevo(j13, kcexrzcfytVarSflfametgt.ipoelvxyzq() + iHszhottldk2), null, new tg.draadjrbmk() { // from class: androidx.compose.foundation.layout.lereixgezr
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return pmvmpeiblj.I0(this.f4871zdlpuopuiu, kcexrzcfytVarSflfametgt, (androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg) obj);
            }
        }, 4, null);
    }

    private pmvmpeiblj(float f13, float f14, float f15, float f16, boolean z13) {
        this.f4887ylkuphrtab = f13;
        this.f4886pkzmftpjix = f14;
        this.f4883hcddaimhww = f15;
        this.f4885jpowsppfya = f16;
        this.f4884hkdspvbjdz = z13;
    }
}
