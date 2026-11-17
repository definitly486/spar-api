package androidx.compose.ui.layout;

/* JADX INFO: loaded from: classes.dex */
final class vdvldrhtss extends androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf implements z.cdpycssgdh {

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private long f6545hcddaimhww;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private final boolean f6546pkzmftpjix = true;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private tg.draadjrbmk f6547ylkuphrtab;

    public vdvldrhtss(tg.draadjrbmk draadjrbmkVar) {
        this.f6547ylkuphrtab = draadjrbmkVar;
        long j13 = Integer.MIN_VALUE;
        this.f6545hcddaimhww = w0.oxmwwwfdhm.ppxfxbqfkf((j13 & 4294967295L) | (j13 << 32));
    }

    public final void H0(tg.draadjrbmk draadjrbmkVar) {
        this.f6547ylkuphrtab = draadjrbmkVar;
        long j13 = Integer.MIN_VALUE;
        this.f6545hcddaimhww = w0.oxmwwwfdhm.ppxfxbqfkf((j13 & 4294967295L) | (j13 << 32));
    }

    @Override // androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf
    public boolean l0() {
        return this.f6546pkzmftpjix;
    }

    @Override // z.cdpycssgdh
    public void stevsuqkhv(long j13) {
        if (w0.oxmwwwfdhm.eablkybsjg(this.f6545hcddaimhww, j13)) {
            return;
        }
        this.f6547ylkuphrtab.invoke(w0.oxmwwwfdhm.zoijcleaow(j13));
        this.f6545hcddaimhww = j13;
    }
}
