package fk;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends zeieaojujs {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private short[] f34096iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private int f34097zoijcleaow;

    public /* synthetic */ a(short[] sArr, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(sArr);
    }

    public final void eablkybsjg(short s13) {
        zeieaojujs.ppxfxbqfkf(this, 0, 1, null);
        short[] sArr = this.f34096iobyxmoadg;
        int iWkgbmnqykc = wkgbmnqykc();
        this.f34097zoijcleaow = iWkgbmnqykc + 1;
        gg.lmojexxdyd.rgvfuqvkyq(sArr, iWkgbmnqykc, s13);
    }

    public short[] gxszxtbevo() {
        short[] sArrCopyOf = Arrays.copyOf(this.f34096iobyxmoadg, wkgbmnqykc());
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(sArrCopyOf, "copyOf(...)");
        return gg.lmojexxdyd.ppxfxbqfkf(sArrCopyOf);
    }

    @Override // fk.zeieaojujs
    public /* bridge */ /* synthetic */ Object iobyxmoadg() {
        return gg.lmojexxdyd.iobyxmoadg(gxszxtbevo());
    }

    @Override // fk.zeieaojujs
    public int wkgbmnqykc() {
        return this.f34097zoijcleaow;
    }

    @Override // fk.zeieaojujs
    public void zoijcleaow(int i13) {
        if (gg.lmojexxdyd.draadjrbmk(this.f34096iobyxmoadg) < i13) {
            short[] sArr = this.f34096iobyxmoadg;
            short[] sArrCopyOf = Arrays.copyOf(sArr, zg.gtknphoqwx.gxszxtbevo(i13, gg.lmojexxdyd.draadjrbmk(sArr) * 2));
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(sArrCopyOf, "copyOf(...)");
            this.f34096iobyxmoadg = gg.lmojexxdyd.ppxfxbqfkf(sArrCopyOf);
        }
    }

    private a(short[] bufferWithData) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bufferWithData, "bufferWithData");
        this.f34096iobyxmoadg = bufferWithData;
        this.f34097zoijcleaow = gg.lmojexxdyd.draadjrbmk(bufferWithData);
        zoijcleaow(10);
    }
}
