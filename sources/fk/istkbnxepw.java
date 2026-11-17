package fk;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class istkbnxepw extends zeieaojujs {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private float[] f34157iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private int f34158zoijcleaow;

    public istkbnxepw(float[] bufferWithData) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bufferWithData, "bufferWithData");
        this.f34157iobyxmoadg = bufferWithData;
        this.f34158zoijcleaow = bufferWithData.length;
        zoijcleaow(10);
    }

    public final void eablkybsjg(float f13) {
        zeieaojujs.ppxfxbqfkf(this, 0, 1, null);
        float[] fArr = this.f34157iobyxmoadg;
        int iWkgbmnqykc = wkgbmnqykc();
        this.f34158zoijcleaow = iWkgbmnqykc + 1;
        fArr[iWkgbmnqykc] = f13;
    }

    @Override // fk.zeieaojujs
    /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
    public float[] iobyxmoadg() {
        float[] fArrCopyOf = Arrays.copyOf(this.f34157iobyxmoadg, wkgbmnqykc());
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(fArrCopyOf, "copyOf(...)");
        return fArrCopyOf;
    }

    @Override // fk.zeieaojujs
    public int wkgbmnqykc() {
        return this.f34158zoijcleaow;
    }

    @Override // fk.zeieaojujs
    public void zoijcleaow(int i13) {
        float[] fArr = this.f34157iobyxmoadg;
        if (fArr.length < i13) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, zg.gtknphoqwx.gxszxtbevo(i13, fArr.length * 2));
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(fArrCopyOf, "copyOf(...)");
            this.f34157iobyxmoadg = fArrCopyOf;
        }
    }
}
