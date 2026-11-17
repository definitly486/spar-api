package fk;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class yzdjzghtvl extends zeieaojujs {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private long[] f34257iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private int f34258zoijcleaow;

    public /* synthetic */ yzdjzghtvl(long[] jArr, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(jArr);
    }

    public final void eablkybsjg(long j13) {
        zeieaojujs.ppxfxbqfkf(this, 0, 1, null);
        long[] jArr = this.f34257iobyxmoadg;
        int iWkgbmnqykc = wkgbmnqykc();
        this.f34258zoijcleaow = iWkgbmnqykc + 1;
        gg.cdpycssgdh.rgvfuqvkyq(jArr, iWkgbmnqykc, j13);
    }

    public long[] gxszxtbevo() {
        long[] jArrCopyOf = Arrays.copyOf(this.f34257iobyxmoadg, wkgbmnqykc());
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(jArrCopyOf, "copyOf(...)");
        return gg.cdpycssgdh.ppxfxbqfkf(jArrCopyOf);
    }

    @Override // fk.zeieaojujs
    public /* bridge */ /* synthetic */ Object iobyxmoadg() {
        return gg.cdpycssgdh.iobyxmoadg(gxszxtbevo());
    }

    @Override // fk.zeieaojujs
    public int wkgbmnqykc() {
        return this.f34258zoijcleaow;
    }

    @Override // fk.zeieaojujs
    public void zoijcleaow(int i13) {
        if (gg.cdpycssgdh.draadjrbmk(this.f34257iobyxmoadg) < i13) {
            long[] jArr = this.f34257iobyxmoadg;
            long[] jArrCopyOf = Arrays.copyOf(jArr, zg.gtknphoqwx.gxszxtbevo(i13, gg.cdpycssgdh.draadjrbmk(jArr) * 2));
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(jArrCopyOf, "copyOf(...)");
            this.f34257iobyxmoadg = gg.cdpycssgdh.ppxfxbqfkf(jArrCopyOf);
        }
    }

    private yzdjzghtvl(long[] bufferWithData) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bufferWithData, "bufferWithData");
        this.f34257iobyxmoadg = bufferWithData;
        this.f34258zoijcleaow = gg.cdpycssgdh.draadjrbmk(bufferWithData);
        zoijcleaow(10);
    }
}
