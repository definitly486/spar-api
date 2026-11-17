package androidx.compose.foundation.layout;

/* JADX INFO: loaded from: classes.dex */
final class pkzmftpjix extends androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf implements z.yadqdtsiqt {

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private tg.rgvfuqvkyq f4880hcddaimhww;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private boolean f4881pkzmftpjix;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private czzsidtyhn.yggfygwlhe f4882ylkuphrtab;

    public pkzmftpjix(czzsidtyhn.yggfygwlhe yggfygwlheVar, boolean z13, tg.rgvfuqvkyq rgvfuqvkyqVar) {
        this.f4882ylkuphrtab = yggfygwlheVar;
        this.f4881pkzmftpjix = z13;
        this.f4880hcddaimhww = rgvfuqvkyqVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn I0(pkzmftpjix pkzmftpjixVar, int i13, androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVar, int i14, androidx.compose.ui.layout.draadjrbmk draadjrbmkVar, androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg iobyxmoadgVar) {
        androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg.lmojexxdyd(iobyxmoadgVar, kcexrzcfytVar, ((w0.agtfadlqog) pkzmftpjixVar.f4880hcddaimhww.invoke(w0.oxmwwwfdhm.zoijcleaow(w0.oxmwwwfdhm.ppxfxbqfkf((((long) (i13 - kcexrzcfytVar.eslsurpljm())) << 32) | (((long) (i14 - kcexrzcfytVar.ipoelvxyzq())) & 4294967295L))), draadjrbmkVar.getLayoutDirection())).rgvfuqvkyq(), 0.0f, 2, null);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public final void J0(tg.rgvfuqvkyq rgvfuqvkyqVar) {
        this.f4880hcddaimhww = rgvfuqvkyqVar;
    }

    public final void K0(czzsidtyhn.yggfygwlhe yggfygwlheVar) {
        this.f4882ylkuphrtab = yggfygwlheVar;
    }

    public final void L0(boolean z13) {
        this.f4881pkzmftpjix = z13;
    }

    @Override // z.yadqdtsiqt
    public x.istkbnxepw gxszxtbevo(final androidx.compose.ui.layout.draadjrbmk draadjrbmkVar, x.pmvmpeiblj pmvmpeibljVar, long j13) {
        czzsidtyhn.yggfygwlhe yggfygwlheVar = this.f4882ylkuphrtab;
        czzsidtyhn.yggfygwlhe yggfygwlheVar2 = czzsidtyhn.yggfygwlhe.Vertical;
        int iAgtfadlqog = yggfygwlheVar != yggfygwlheVar2 ? 0 : w0.zoijcleaow.agtfadlqog(j13);
        czzsidtyhn.yggfygwlhe yggfygwlheVar3 = this.f4882ylkuphrtab;
        czzsidtyhn.yggfygwlhe yggfygwlheVar4 = czzsidtyhn.yggfygwlhe.Horizontal;
        final androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVarSflfametgt = pmvmpeibljVar.sflfametgt(w0.ppxfxbqfkf.iobyxmoadg(iAgtfadlqog, (this.f4882ylkuphrtab == yggfygwlheVar2 || !this.f4881pkzmftpjix) ? w0.zoijcleaow.draadjrbmk(j13) : Integer.MAX_VALUE, yggfygwlheVar3 == yggfygwlheVar4 ? w0.zoijcleaow.wflxmlrfwp(j13) : 0, (this.f4882ylkuphrtab == yggfygwlheVar4 || !this.f4881pkzmftpjix) ? w0.zoijcleaow.gtknphoqwx(j13) : Integer.MAX_VALUE));
        final int iAgtfadlqog2 = zg.gtknphoqwx.agtfadlqog(kcexrzcfytVarSflfametgt.eslsurpljm(), w0.zoijcleaow.agtfadlqog(j13), w0.zoijcleaow.draadjrbmk(j13));
        final int iAgtfadlqog3 = zg.gtknphoqwx.agtfadlqog(kcexrzcfytVarSflfametgt.ipoelvxyzq(), w0.zoijcleaow.wflxmlrfwp(j13), w0.zoijcleaow.gtknphoqwx(j13));
        return androidx.compose.ui.layout.draadjrbmk.ntlheqmsrt(draadjrbmkVar, iAgtfadlqog2, iAgtfadlqog3, null, new tg.draadjrbmk() { // from class: androidx.compose.foundation.layout.ylkuphrtab
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return pkzmftpjix.I0(this.f4904zdlpuopuiu, iAgtfadlqog2, kcexrzcfytVarSflfametgt, iAgtfadlqog3, draadjrbmkVar, (androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg) obj);
            }
        }, 4, null);
    }
}
