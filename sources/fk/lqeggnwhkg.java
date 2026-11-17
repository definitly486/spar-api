package fk;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class lqeggnwhkg extends zeieaojujs {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private boolean[] f34200iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private int f34201zoijcleaow;

    public lqeggnwhkg(boolean[] bufferWithData) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bufferWithData, "bufferWithData");
        this.f34200iobyxmoadg = bufferWithData;
        this.f34201zoijcleaow = bufferWithData.length;
        zoijcleaow(10);
    }

    public final void eablkybsjg(boolean z13) {
        zeieaojujs.ppxfxbqfkf(this, 0, 1, null);
        boolean[] zArr = this.f34200iobyxmoadg;
        int iWkgbmnqykc = wkgbmnqykc();
        this.f34201zoijcleaow = iWkgbmnqykc + 1;
        zArr[iWkgbmnqykc] = z13;
    }

    @Override // fk.zeieaojujs
    /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
    public boolean[] iobyxmoadg() {
        boolean[] zArrCopyOf = Arrays.copyOf(this.f34200iobyxmoadg, wkgbmnqykc());
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(zArrCopyOf, "copyOf(...)");
        return zArrCopyOf;
    }

    @Override // fk.zeieaojujs
    public int wkgbmnqykc() {
        return this.f34201zoijcleaow;
    }

    @Override // fk.zeieaojujs
    public void zoijcleaow(int i13) {
        boolean[] zArr = this.f34200iobyxmoadg;
        if (zArr.length < i13) {
            boolean[] zArrCopyOf = Arrays.copyOf(zArr, zg.gtknphoqwx.gxszxtbevo(i13, zArr.length * 2));
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(zArrCopyOf, "copyOf(...)");
            this.f34200iobyxmoadg = zArrCopyOf;
        }
    }
}
