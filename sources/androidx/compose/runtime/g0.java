package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

/* JADX INFO: loaded from: classes.dex */
public abstract class g0 {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final long[] f5622iobyxmoadg = new long[0];

    /* JADX INFO: Access modifiers changed from: private */
    public static final zoijcleaow agtfadlqog(ArrayList arrayList, int i13, int i14) {
        int iKcexrzcfyt = kcexrzcfyt(arrayList, i13, i14);
        if (iKcexrzcfyt >= 0) {
            return (zoijcleaow) arrayList.get(iKcexrzcfyt);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cqumvgiudr(int[] iArr, int i13, boolean z13) {
        int i14 = (i13 * 5) + 1;
        iArr[i14] = ((z13 ? 1 : 0) << 27) | (iArr[i14] & (-134217729));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void esjtqupxsv(int[] iArr, int i13, int i14) {
        if (i14 >= 0) {
        }
        int i15 = (i13 * 5) + 1;
        iArr[i15] = i14 | (iArr[i15] & (-67108864));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void iwizpuwonk(int[] iArr, int i13, int i14) {
        iArr[(i13 * 5) + 3] = i14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void jyumaefscl(int[] iArr, int i13, boolean z13) {
        int i14 = (i13 * 5) + 1;
        iArr[i14] = ((z13 ? 1 : 0) << 26) | (iArr[i14] & (-67108865));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int kcexrzcfyt(ArrayList arrayList, int i13, int i14) {
        int size = arrayList.size() - 1;
        int i15 = 0;
        while (i15 <= size) {
            int i16 = (i15 + size) >>> 1;
            int iIobyxmoadg = ((zoijcleaow) arrayList.get(i16)).iobyxmoadg();
            if (iIobyxmoadg < 0) {
                iIobyxmoadg += i14;
            }
            int iDraadjrbmk = kotlin.jvm.internal.zdlpuopuiu.draadjrbmk(iIobyxmoadg, i13);
            if (iDraadjrbmk < 0) {
                i15 = i16 + 1;
            } else {
                if (iDraadjrbmk <= 0) {
                    return i16;
                }
                size = i16 - 1;
            }
        }
        return -(i15 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ojitshcjhn(int[] iArr, int i13) {
        return iArr[(i13 * 5) + 3];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int oxmwwwfdhm(int[] iArr, int i13) {
        int i14 = i13 * 5;
        return iArr[i14 + 4] + Integer.bitCount(iArr[i14 + 1] >> 30);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rgvfuqvkyq(int[] iArr, int i13, int i14, boolean z13, boolean z14, boolean z15, int i15, int i16) {
        int i17 = i13 * 5;
        iArr[i17] = i14;
        iArr[i17 + 1] = ((z13 ? 1 : 0) << 30) | ((z14 ? 1 : 0) << 29) | ((z15 ? 1 : 0) << 28);
        iArr[i17 + 2] = i15;
        iArr[i17 + 3] = 0;
        iArr[i17 + 4] = i16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int vdvldrhtss(ArrayList arrayList, int i13, int i14) {
        int iKcexrzcfyt = kcexrzcfyt(arrayList, i13, i14);
        return iKcexrzcfyt >= 0 ? iKcexrzcfyt : -(iKcexrzcfyt + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int wflxmlrfwp(int[] iArr, int i13) {
        int i14 = i13 * 5;
        if (i14 >= iArr.length) {
            return iArr.length;
        }
        return Integer.bitCount(iArr[i14 + 1] >> 29) + iArr[i14 + 4];
    }

    public static final void yggfygwlhe() {
        throw new ConcurrentModificationException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int zdlpuopuiu(int[] iArr, int i13) {
        int i14 = i13 * 5;
        return iArr[i14 + 4] + Integer.bitCount(iArr[i14 + 1] >> 28);
    }
}
