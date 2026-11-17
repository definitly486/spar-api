package androidx.compose.foundation.relocation;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes.dex */
public final class eablkybsjg extends androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf {

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private final boolean f5276pkzmftpjix;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private zfvoamnweg.iobyxmoadg f5277ylkuphrtab;

    public eablkybsjg(zfvoamnweg.iobyxmoadg iobyxmoadgVar) {
        this.f5277ylkuphrtab = iobyxmoadgVar;
    }

    private final void H0() {
        zfvoamnweg.iobyxmoadg iobyxmoadgVar = this.f5277ylkuphrtab;
        if (iobyxmoadgVar instanceof zoijcleaow) {
            zdlpuopuiu.nufgyqmvbu(iobyxmoadgVar, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl");
            ((zoijcleaow) iobyxmoadgVar).eablkybsjg().rgvfuqvkyq(this);
        }
    }

    public final void I0(zfvoamnweg.iobyxmoadg iobyxmoadgVar) {
        H0();
        if (iobyxmoadgVar instanceof zoijcleaow) {
            ((zoijcleaow) iobyxmoadgVar).eablkybsjg().zoijcleaow(this);
        }
        this.f5277ylkuphrtab = iobyxmoadgVar;
    }

    @Override // androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf
    public boolean l0() {
        return this.f5276pkzmftpjix;
    }

    @Override // androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf
    public void q0() {
        I0(this.f5277ylkuphrtab);
    }

    @Override // androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf
    public void r0() {
        H0();
    }
}
