package fk;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class fmlbqenlif extends zeieaojujs {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private int[] f34136iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private int f34137zoijcleaow;

    public /* synthetic */ fmlbqenlif(int[] iArr, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(iArr);
    }

    public final void eablkybsjg(int i13) {
        zeieaojujs.ppxfxbqfkf(this, 0, 1, null);
        int[] iArr = this.f34136iobyxmoadg;
        int iWkgbmnqykc = wkgbmnqykc();
        this.f34137zoijcleaow = iWkgbmnqykc + 1;
        gg.zynmafqrjb.rgvfuqvkyq(iArr, iWkgbmnqykc, i13);
    }

    public int[] gxszxtbevo() {
        int[] iArrCopyOf = Arrays.copyOf(this.f34136iobyxmoadg, wkgbmnqykc());
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(iArrCopyOf, "copyOf(...)");
        return gg.zynmafqrjb.ppxfxbqfkf(iArrCopyOf);
    }

    @Override // fk.zeieaojujs
    public /* bridge */ /* synthetic */ Object iobyxmoadg() {
        return gg.zynmafqrjb.iobyxmoadg(gxszxtbevo());
    }

    @Override // fk.zeieaojujs
    public int wkgbmnqykc() {
        return this.f34137zoijcleaow;
    }

    @Override // fk.zeieaojujs
    public void zoijcleaow(int i13) {
        if (gg.zynmafqrjb.draadjrbmk(this.f34136iobyxmoadg) < i13) {
            int[] iArr = this.f34136iobyxmoadg;
            int[] iArrCopyOf = Arrays.copyOf(iArr, zg.gtknphoqwx.gxszxtbevo(i13, gg.zynmafqrjb.draadjrbmk(iArr) * 2));
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(iArrCopyOf, "copyOf(...)");
            this.f34136iobyxmoadg = gg.zynmafqrjb.ppxfxbqfkf(iArrCopyOf);
        }
    }

    private fmlbqenlif(int[] bufferWithData) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bufferWithData, "bufferWithData");
        this.f34136iobyxmoadg = bufferWithData;
        this.f34137zoijcleaow = gg.zynmafqrjb.draadjrbmk(bufferWithData);
        zoijcleaow(10);
    }
}
