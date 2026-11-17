package z;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class lereixgezr {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private int[] f127045iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private int f127046zoijcleaow;

    public lereixgezr(int i13) {
        this.f127045iobyxmoadg = new int[i13];
    }

    private final int[] btonecajqb(int[] iArr) {
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(iArrCopyOf, "copyOf(...)");
        this.f127045iobyxmoadg = iArrCopyOf;
        return iArrCopyOf;
    }

    private final void draadjrbmk(int i13, int i14) {
        int[] iArr = this.f127045iobyxmoadg;
        ikoacuggdj.dxjokdxxww(iArr, i13, i14);
        ikoacuggdj.dxjokdxxww(iArr, i13 + 1, i14 + 1);
        ikoacuggdj.dxjokdxxww(iArr, i13 + 2, i14 + 2);
    }

    private final void dxjokdxxww(int i13, int i14, int i15) {
        if (i13 < i14) {
            int iEablkybsjg = eablkybsjg(i13, i14, i15);
            dxjokdxxww(i13, iEablkybsjg - i15, i15);
            dxjokdxxww(iEablkybsjg + i15, i14, i15);
        }
    }

    private final int eablkybsjg(int i13, int i14, int i15) {
        int i16 = i13 - i15;
        while (i13 < i14) {
            if (iobyxmoadg(i13, i14)) {
                i16 += i15;
                draadjrbmk(i16, i13);
            }
            i13 += i15;
        }
        int i17 = i16 + i15;
        draadjrbmk(i17, i14);
        return i17;
    }

    private final boolean iobyxmoadg(int i13, int i14) {
        int[] iArr = this.f127045iobyxmoadg;
        int i15 = iArr[i13];
        int i16 = iArr[i14];
        if (i15 >= i16) {
            return i15 == i16 && iArr[i13 + 1] <= iArr[i14 + 1];
        }
        return true;
    }

    public final void gtknphoqwx() {
        int i13 = this.f127046zoijcleaow;
        if (!(i13 % 3 == 0)) {
            w.iobyxmoadg.zoijcleaow("Array size not a multiple of 3");
        }
        if (i13 > 3) {
            dxjokdxxww(0, i13 - 3, 3);
        }
    }

    public final int gxszxtbevo() {
        int[] iArr = this.f127045iobyxmoadg;
        int i13 = this.f127046zoijcleaow - 1;
        this.f127046zoijcleaow = i13;
        return iArr[i13];
    }

    public final void lqeggnwhkg(int i13, int i14, int i15) {
        int i16 = this.f127046zoijcleaow;
        int[] iArrBtonecajqb = this.f127045iobyxmoadg;
        int i17 = i16 + 3;
        if (i17 >= iArrBtonecajqb.length) {
            iArrBtonecajqb = btonecajqb(iArrBtonecajqb);
        }
        iArrBtonecajqb[i16] = i13 + i15;
        iArrBtonecajqb[i16 + 1] = i14 + i15;
        iArrBtonecajqb[i16 + 2] = i15;
        this.f127046zoijcleaow = i17;
    }

    public final void nufgyqmvbu(int i13, int i14, int i15, int i16) {
        int i17 = this.f127046zoijcleaow;
        int[] iArrBtonecajqb = this.f127045iobyxmoadg;
        int i18 = i17 + 4;
        if (i18 >= iArrBtonecajqb.length) {
            iArrBtonecajqb = btonecajqb(iArrBtonecajqb);
        }
        iArrBtonecajqb[i17] = i13;
        iArrBtonecajqb[i17 + 1] = i14;
        iArrBtonecajqb[i17 + 2] = i15;
        iArrBtonecajqb[i17 + 3] = i16;
        this.f127046zoijcleaow = i18;
    }

    public final int ppxfxbqfkf() {
        return this.f127046zoijcleaow;
    }

    public final boolean wkgbmnqykc() {
        return this.f127046zoijcleaow != 0;
    }

    public final int zoijcleaow(int i13) {
        return this.f127045iobyxmoadg[i13];
    }
}
