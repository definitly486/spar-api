package fk;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class tzroggbefp extends zeieaojujs {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private long[] f34238iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private int f34239zoijcleaow;

    public tzroggbefp(long[] bufferWithData) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bufferWithData, "bufferWithData");
        this.f34238iobyxmoadg = bufferWithData;
        this.f34239zoijcleaow = bufferWithData.length;
        zoijcleaow(10);
    }

    public final void eablkybsjg(long j13) {
        zeieaojujs.ppxfxbqfkf(this, 0, 1, null);
        long[] jArr = this.f34238iobyxmoadg;
        int iWkgbmnqykc = wkgbmnqykc();
        this.f34239zoijcleaow = iWkgbmnqykc + 1;
        jArr[iWkgbmnqykc] = j13;
    }

    @Override // fk.zeieaojujs
    /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
    public long[] iobyxmoadg() {
        long[] jArrCopyOf = Arrays.copyOf(this.f34238iobyxmoadg, wkgbmnqykc());
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(jArrCopyOf, "copyOf(...)");
        return jArrCopyOf;
    }

    @Override // fk.zeieaojujs
    public int wkgbmnqykc() {
        return this.f34239zoijcleaow;
    }

    @Override // fk.zeieaojujs
    public void zoijcleaow(int i13) {
        long[] jArr = this.f34238iobyxmoadg;
        if (jArr.length < i13) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, zg.gtknphoqwx.gxszxtbevo(i13, jArr.length * 2));
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(jArrCopyOf, "copyOf(...)");
            this.f34238iobyxmoadg = jArrCopyOf;
        }
    }
}
