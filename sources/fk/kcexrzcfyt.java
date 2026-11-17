package fk;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class kcexrzcfyt extends zeieaojujs {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private double[] f34191iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private int f34192zoijcleaow;

    public kcexrzcfyt(double[] bufferWithData) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bufferWithData, "bufferWithData");
        this.f34191iobyxmoadg = bufferWithData;
        this.f34192zoijcleaow = bufferWithData.length;
        zoijcleaow(10);
    }

    public final void eablkybsjg(double d13) {
        zeieaojujs.ppxfxbqfkf(this, 0, 1, null);
        double[] dArr = this.f34191iobyxmoadg;
        int iWkgbmnqykc = wkgbmnqykc();
        this.f34192zoijcleaow = iWkgbmnqykc + 1;
        dArr[iWkgbmnqykc] = d13;
    }

    @Override // fk.zeieaojujs
    /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
    public double[] iobyxmoadg() {
        double[] dArrCopyOf = Arrays.copyOf(this.f34191iobyxmoadg, wkgbmnqykc());
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(dArrCopyOf, "copyOf(...)");
        return dArrCopyOf;
    }

    @Override // fk.zeieaojujs
    public int wkgbmnqykc() {
        return this.f34192zoijcleaow;
    }

    @Override // fk.zeieaojujs
    public void zoijcleaow(int i13) {
        double[] dArr = this.f34191iobyxmoadg;
        if (dArr.length < i13) {
            double[] dArrCopyOf = Arrays.copyOf(dArr, zg.gtknphoqwx.gxszxtbevo(i13, dArr.length * 2));
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(dArrCopyOf, "copyOf(...)");
            this.f34191iobyxmoadg = dArrCopyOf;
        }
    }
}
