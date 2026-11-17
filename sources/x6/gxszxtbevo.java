package x6;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final gxszxtbevo f121213iobyxmoadg = new gxszxtbevo();

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f121214iobyxmoadg;

        static {
            int[] iArr = new int[f7.nufgyqmvbu.values().length];
            try {
                iArr[f7.nufgyqmvbu.FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f7.nufgyqmvbu.FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f121214iobyxmoadg = iArr;
        }
    }

    private gxszxtbevo() {
    }

    public static final int iobyxmoadg(int i13, int i14, int i15, int i16, f7.nufgyqmvbu nufgyqmvbuVar) {
        int iMin;
        int iHighestOneBit = Integer.highestOneBit(i13 / i15);
        int iHighestOneBit2 = Integer.highestOneBit(i14 / i16);
        int i17 = iobyxmoadg.f121214iobyxmoadg[nufgyqmvbuVar.ordinal()];
        if (i17 == 1) {
            iMin = Math.min(iHighestOneBit, iHighestOneBit2);
        } else {
            if (i17 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            iMin = Math.max(iHighestOneBit, iHighestOneBit2);
        }
        return zg.gtknphoqwx.gxszxtbevo(iMin, 1);
    }

    public static final double ppxfxbqfkf(int i13, int i14, int i15, int i16, f7.nufgyqmvbu nufgyqmvbuVar) {
        double d13 = ((double) i15) / ((double) i13);
        double d14 = ((double) i16) / ((double) i14);
        int i17 = iobyxmoadg.f121214iobyxmoadg[nufgyqmvbuVar.ordinal()];
        if (i17 == 1) {
            return Math.max(d13, d14);
        }
        if (i17 == 2) {
            return Math.min(d13, d14);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final float wkgbmnqykc(float f13, float f14, float f15, float f16, f7.nufgyqmvbu nufgyqmvbuVar) {
        float f17 = f15 / f13;
        float f18 = f16 / f14;
        int i13 = iobyxmoadg.f121214iobyxmoadg[nufgyqmvbuVar.ordinal()];
        if (i13 == 1) {
            return Math.max(f17, f18);
        }
        if (i13 == 2) {
            return Math.min(f17, f18);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final double zoijcleaow(double d13, double d14, double d15, double d16, f7.nufgyqmvbu nufgyqmvbuVar) {
        double d17 = d15 / d13;
        double d18 = d16 / d14;
        int i13 = iobyxmoadg.f121214iobyxmoadg[nufgyqmvbuVar.ordinal()];
        if (i13 == 1) {
            return Math.max(d17, d18);
        }
        if (i13 == 2) {
            return Math.min(d17, d18);
        }
        throw new NoWhenBranchMatchedException();
    }
}
