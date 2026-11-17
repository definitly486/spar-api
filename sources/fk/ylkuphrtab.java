package fk;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class ylkuphrtab extends zeieaojujs {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private int[] f34255iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private int f34256zoijcleaow;

    public ylkuphrtab(int[] bufferWithData) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bufferWithData, "bufferWithData");
        this.f34255iobyxmoadg = bufferWithData;
        this.f34256zoijcleaow = bufferWithData.length;
        zoijcleaow(10);
    }

    public final void eablkybsjg(int i13) {
        zeieaojujs.ppxfxbqfkf(this, 0, 1, null);
        int[] iArr = this.f34255iobyxmoadg;
        int iWkgbmnqykc = wkgbmnqykc();
        this.f34256zoijcleaow = iWkgbmnqykc + 1;
        iArr[iWkgbmnqykc] = i13;
    }

    @Override // fk.zeieaojujs
    /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
    public int[] iobyxmoadg() {
        int[] iArrCopyOf = Arrays.copyOf(this.f34255iobyxmoadg, wkgbmnqykc());
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(iArrCopyOf, "copyOf(...)");
        return iArrCopyOf;
    }

    @Override // fk.zeieaojujs
    public int wkgbmnqykc() {
        return this.f34256zoijcleaow;
    }

    @Override // fk.zeieaojujs
    public void zoijcleaow(int i13) {
        int[] iArr = this.f34255iobyxmoadg;
        if (iArr.length < i13) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, zg.gtknphoqwx.gxszxtbevo(i13, iArr.length * 2));
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(iArrCopyOf, "copyOf(...)");
            this.f34255iobyxmoadg = iArrCopyOf;
        }
    }
}
