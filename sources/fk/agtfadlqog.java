package fk;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class agtfadlqog extends zeieaojujs {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private char[] f34100iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private int f34101zoijcleaow;

    public agtfadlqog(char[] bufferWithData) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bufferWithData, "bufferWithData");
        this.f34100iobyxmoadg = bufferWithData;
        this.f34101zoijcleaow = bufferWithData.length;
        zoijcleaow(10);
    }

    public final void eablkybsjg(char c13) {
        zeieaojujs.ppxfxbqfkf(this, 0, 1, null);
        char[] cArr = this.f34100iobyxmoadg;
        int iWkgbmnqykc = wkgbmnqykc();
        this.f34101zoijcleaow = iWkgbmnqykc + 1;
        cArr[iWkgbmnqykc] = c13;
    }

    @Override // fk.zeieaojujs
    /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
    public char[] iobyxmoadg() {
        char[] cArrCopyOf = Arrays.copyOf(this.f34100iobyxmoadg, wkgbmnqykc());
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(cArrCopyOf, "copyOf(...)");
        return cArrCopyOf;
    }

    @Override // fk.zeieaojujs
    public int wkgbmnqykc() {
        return this.f34101zoijcleaow;
    }

    @Override // fk.zeieaojujs
    public void zoijcleaow(int i13) {
        char[] cArr = this.f34100iobyxmoadg;
        if (cArr.length < i13) {
            char[] cArrCopyOf = Arrays.copyOf(cArr, zg.gtknphoqwx.gxszxtbevo(i13, cArr.length * 2));
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(cArrCopyOf, "copyOf(...)");
            this.f34100iobyxmoadg = cArrCopyOf;
        }
    }
}
