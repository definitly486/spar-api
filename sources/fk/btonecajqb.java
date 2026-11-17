package fk;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class btonecajqb extends zeieaojujs {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private byte[] f34106iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private int f34107zoijcleaow;

    public btonecajqb(byte[] bufferWithData) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bufferWithData, "bufferWithData");
        this.f34106iobyxmoadg = bufferWithData;
        this.f34107zoijcleaow = bufferWithData.length;
        zoijcleaow(10);
    }

    public final void eablkybsjg(byte b13) {
        zeieaojujs.ppxfxbqfkf(this, 0, 1, null);
        byte[] bArr = this.f34106iobyxmoadg;
        int iWkgbmnqykc = wkgbmnqykc();
        this.f34107zoijcleaow = iWkgbmnqykc + 1;
        bArr[iWkgbmnqykc] = b13;
    }

    @Override // fk.zeieaojujs
    /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
    public byte[] iobyxmoadg() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f34106iobyxmoadg, wkgbmnqykc());
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    @Override // fk.zeieaojujs
    public int wkgbmnqykc() {
        return this.f34107zoijcleaow;
    }

    @Override // fk.zeieaojujs
    public void zoijcleaow(int i13) {
        byte[] bArr = this.f34106iobyxmoadg;
        if (bArr.length < i13) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, zg.gtknphoqwx.gxszxtbevo(i13, bArr.length * 2));
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(bArrCopyOf, "copyOf(...)");
            this.f34106iobyxmoadg = bArrCopyOf;
        }
    }
}
