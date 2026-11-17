package androidx.compose.foundation.layout;

/* JADX INFO: loaded from: classes.dex */
final class cqumvgiudr extends androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf implements z.yadqdtsiqt {

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private final boolean f4838hcddaimhww;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private boolean f4839pkzmftpjix;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private tg.draadjrbmk f4840ylkuphrtab;

    public cqumvgiudr(tg.draadjrbmk draadjrbmkVar, boolean z13) {
        this.f4840ylkuphrtab = draadjrbmkVar;
        this.f4839pkzmftpjix = z13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn I0(cqumvgiudr cqumvgiudrVar, androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVar, androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg iobyxmoadgVar) {
        long jRgvfuqvkyq = ((w0.agtfadlqog) cqumvgiudrVar.f4840ylkuphrtab.invoke(iobyxmoadgVar)).rgvfuqvkyq();
        if (cqumvgiudrVar.f4839pkzmftpjix) {
            androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg.jlmebxxoox(iobyxmoadgVar, kcexrzcfytVar, w0.agtfadlqog.dxjokdxxww(jRgvfuqvkyq), w0.agtfadlqog.btonecajqb(jRgvfuqvkyq), 0.0f, null, 12, null);
        } else {
            androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg.sflfametgt(iobyxmoadgVar, kcexrzcfytVar, w0.agtfadlqog.dxjokdxxww(jRgvfuqvkyq), w0.agtfadlqog.btonecajqb(jRgvfuqvkyq), 0.0f, null, 12, null);
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public final void J0(tg.draadjrbmk draadjrbmkVar, boolean z13) {
        if (this.f4840ylkuphrtab != draadjrbmkVar || this.f4839pkzmftpjix != z13) {
            z.wwaezpbzkn.ppxfxbqfkf(this);
        }
        this.f4840ylkuphrtab = draadjrbmkVar;
        this.f4839pkzmftpjix = z13;
    }

    @Override // z.yadqdtsiqt
    public x.istkbnxepw gxszxtbevo(androidx.compose.ui.layout.draadjrbmk draadjrbmkVar, x.pmvmpeiblj pmvmpeibljVar, long j13) {
        final androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVarSflfametgt = pmvmpeibljVar.sflfametgt(j13);
        return androidx.compose.ui.layout.draadjrbmk.ntlheqmsrt(draadjrbmkVar, kcexrzcfytVarSflfametgt.eslsurpljm(), kcexrzcfytVarSflfametgt.ipoelvxyzq(), null, new tg.draadjrbmk() { // from class: androidx.compose.foundation.layout.iwizpuwonk
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return cqumvgiudr.I0(this.f4863zdlpuopuiu, kcexrzcfytVarSflfametgt, (androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg) obj);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf
    public boolean l0() {
        return this.f4838hcddaimhww;
    }
}
