package androidx.compose.runtime;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class xrmfcynszj {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public int[] f6098iobyxmoadg = new int[10];

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public int f6099zoijcleaow;

    private final int[] dxjokdxxww() {
        int[] iArr = this.f6098iobyxmoadg;
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(iArrCopyOf, "copyOf(...)");
        this.f6098iobyxmoadg = iArrCopyOf;
        return iArrCopyOf;
    }

    public final int eablkybsjg() {
        return this.f6098iobyxmoadg[this.f6099zoijcleaow - 2];
    }

    public final int gxszxtbevo(int i13) {
        int i14 = this.f6099zoijcleaow - 1;
        return i14 >= 0 ? this.f6098iobyxmoadg[i14] : i13;
    }

    public final void iobyxmoadg() {
        this.f6099zoijcleaow = 0;
    }

    public final int lqeggnwhkg() {
        int[] iArr = this.f6098iobyxmoadg;
        int i13 = this.f6099zoijcleaow - 1;
        this.f6099zoijcleaow = i13;
        return iArr[i13];
    }

    public final void nufgyqmvbu(int i13) {
        int[] iArrDxjokdxxww = this.f6098iobyxmoadg;
        if (this.f6099zoijcleaow >= iArrDxjokdxxww.length) {
            iArrDxjokdxxww = dxjokdxxww();
        }
        int i14 = this.f6099zoijcleaow;
        this.f6099zoijcleaow = i14 + 1;
        iArrDxjokdxxww[i14] = i13;
    }

    public final int ppxfxbqfkf() {
        return this.f6098iobyxmoadg[this.f6099zoijcleaow - 1];
    }

    public final int wkgbmnqykc(int i13) {
        return this.f6098iobyxmoadg[i13];
    }

    public final int zoijcleaow(int i13) {
        int[] iArr = this.f6098iobyxmoadg;
        int iMin = Math.min(iArr.length, this.f6099zoijcleaow);
        for (int i14 = 0; i14 < iMin; i14++) {
            if (iArr[i14] == i13) {
                return i14;
            }
        }
        return -1;
    }
}
