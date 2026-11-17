package androidx.compose.foundation.layout;

/* JADX INFO: loaded from: classes.dex */
final class jyumaefscl extends androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf implements z.yadqdtsiqt {

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private boolean f4864hcddaimhww;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private final boolean f4865jpowsppfya;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private float f4866pkzmftpjix;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private float f4867ylkuphrtab;

    public /* synthetic */ jyumaefscl(float f13, float f14, boolean z13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(f13, f14, z13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn I0(jyumaefscl jyumaefsclVar, androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVar, androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg iobyxmoadgVar) {
        if (jyumaefsclVar.f4864hcddaimhww) {
            androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg.cllcsxoeiz(iobyxmoadgVar, kcexrzcfytVar, iobyxmoadgVar.hszhottldk(jyumaefsclVar.f4867ylkuphrtab), iobyxmoadgVar.hszhottldk(jyumaefsclVar.f4866pkzmftpjix), 0.0f, 4, null);
        } else {
            androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg.cdpycssgdh(iobyxmoadgVar, kcexrzcfytVar, iobyxmoadgVar.hszhottldk(jyumaefsclVar.f4867ylkuphrtab), iobyxmoadgVar.hszhottldk(jyumaefsclVar.f4866pkzmftpjix), 0.0f, 4, null);
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public final void J0(float f13, float f14, boolean z13) {
        if (!w0.nufgyqmvbu.dxjokdxxww(this.f4867ylkuphrtab, f13) || !w0.nufgyqmvbu.dxjokdxxww(this.f4866pkzmftpjix, f14) || this.f4864hcddaimhww != z13) {
            z.wwaezpbzkn.ppxfxbqfkf(this);
        }
        this.f4867ylkuphrtab = f13;
        this.f4866pkzmftpjix = f14;
        this.f4864hcddaimhww = z13;
    }

    @Override // z.yadqdtsiqt
    public x.istkbnxepw gxszxtbevo(androidx.compose.ui.layout.draadjrbmk draadjrbmkVar, x.pmvmpeiblj pmvmpeibljVar, long j13) {
        final androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVarSflfametgt = pmvmpeibljVar.sflfametgt(j13);
        return androidx.compose.ui.layout.draadjrbmk.ntlheqmsrt(draadjrbmkVar, kcexrzcfytVarSflfametgt.eslsurpljm(), kcexrzcfytVarSflfametgt.ipoelvxyzq(), null, new tg.draadjrbmk() { // from class: androidx.compose.foundation.layout.yggfygwlhe
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return jyumaefscl.I0(this.f4899zdlpuopuiu, kcexrzcfytVarSflfametgt, (androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg) obj);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf
    public boolean l0() {
        return this.f4865jpowsppfya;
    }

    private jyumaefscl(float f13, float f14, boolean z13) {
        this.f4867ylkuphrtab = f13;
        this.f4866pkzmftpjix = f14;
        this.f4864hcddaimhww = z13;
    }
}
