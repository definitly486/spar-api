package fk;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class mhtqkkgtqm extends zeieaojujs {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private byte[] f34207iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private int f34208zoijcleaow;

    public /* synthetic */ mhtqkkgtqm(byte[] bArr, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(bArr);
    }

    public final void eablkybsjg(byte b13) {
        zeieaojujs.ppxfxbqfkf(this, 0, 1, null);
        byte[] bArr = this.f34207iobyxmoadg;
        int iWkgbmnqykc = wkgbmnqykc();
        this.f34208zoijcleaow = iWkgbmnqykc + 1;
        gg.lereixgezr.rgvfuqvkyq(bArr, iWkgbmnqykc, b13);
    }

    public byte[] gxszxtbevo() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f34207iobyxmoadg, wkgbmnqykc());
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(bArrCopyOf, "copyOf(...)");
        return gg.lereixgezr.ppxfxbqfkf(bArrCopyOf);
    }

    @Override // fk.zeieaojujs
    public /* bridge */ /* synthetic */ Object iobyxmoadg() {
        return gg.lereixgezr.iobyxmoadg(gxszxtbevo());
    }

    @Override // fk.zeieaojujs
    public int wkgbmnqykc() {
        return this.f34208zoijcleaow;
    }

    @Override // fk.zeieaojujs
    public void zoijcleaow(int i13) {
        if (gg.lereixgezr.draadjrbmk(this.f34207iobyxmoadg) < i13) {
            byte[] bArr = this.f34207iobyxmoadg;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, zg.gtknphoqwx.gxszxtbevo(i13, gg.lereixgezr.draadjrbmk(bArr) * 2));
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(bArrCopyOf, "copyOf(...)");
            this.f34207iobyxmoadg = gg.lereixgezr.ppxfxbqfkf(bArrCopyOf);
        }
    }

    private mhtqkkgtqm(byte[] bufferWithData) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bufferWithData, "bufferWithData");
        this.f34207iobyxmoadg = bufferWithData;
        this.f34208zoijcleaow = gg.lereixgezr.draadjrbmk(bufferWithData);
        zoijcleaow(10);
    }
}
