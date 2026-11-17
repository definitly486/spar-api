package fk;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class skhdrjzrfn extends zeieaojujs {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private short[] f34231iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private int f34232zoijcleaow;

    public skhdrjzrfn(short[] bufferWithData) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bufferWithData, "bufferWithData");
        this.f34231iobyxmoadg = bufferWithData;
        this.f34232zoijcleaow = bufferWithData.length;
        zoijcleaow(10);
    }

    public final void eablkybsjg(short s13) {
        zeieaojujs.ppxfxbqfkf(this, 0, 1, null);
        short[] sArr = this.f34231iobyxmoadg;
        int iWkgbmnqykc = wkgbmnqykc();
        this.f34232zoijcleaow = iWkgbmnqykc + 1;
        sArr[iWkgbmnqykc] = s13;
    }

    @Override // fk.zeieaojujs
    /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
    public short[] iobyxmoadg() {
        short[] sArrCopyOf = Arrays.copyOf(this.f34231iobyxmoadg, wkgbmnqykc());
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(sArrCopyOf, "copyOf(...)");
        return sArrCopyOf;
    }

    @Override // fk.zeieaojujs
    public int wkgbmnqykc() {
        return this.f34232zoijcleaow;
    }

    @Override // fk.zeieaojujs
    public void zoijcleaow(int i13) {
        short[] sArr = this.f34231iobyxmoadg;
        if (sArr.length < i13) {
            short[] sArrCopyOf = Arrays.copyOf(sArr, zg.gtknphoqwx.gxszxtbevo(i13, sArr.length * 2));
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(sArrCopyOf, "copyOf(...)");
            this.f34231iobyxmoadg = sArrCopyOf;
        }
    }
}
