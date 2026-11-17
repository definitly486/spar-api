package xe;

import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class draadjrbmk extends agtfadlqog {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final int[] f122205zoijcleaow = {1, 1, 1, 1};

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final int[] f122203ppxfxbqfkf = {3, 1, 1};

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final int[][] f122204wkgbmnqykc = {new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    @Override // xe.agtfadlqog
    protected Collection gxszxtbevo() {
        return Collections.singleton(com.google.zxing.iobyxmoadg.ITF);
    }

    @Override // xe.agtfadlqog
    public boolean[] wkgbmnqykc(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("The length of the input should be even");
        }
        if (length > 80) {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
        }
        agtfadlqog.ppxfxbqfkf(str);
        boolean[] zArr = new boolean[(length * 9) + 9];
        int iZoijcleaow = agtfadlqog.zoijcleaow(zArr, 0, f122205zoijcleaow, true);
        for (int i13 = 0; i13 < length; i13 += 2) {
            int iDigit = Character.digit(str.charAt(i13), 10);
            int iDigit2 = Character.digit(str.charAt(i13 + 1), 10);
            int[] iArr = new int[10];
            for (int i14 = 0; i14 < 5; i14++) {
                int i15 = i14 * 2;
                int[][] iArr2 = f122204wkgbmnqykc;
                iArr[i15] = iArr2[iDigit][i14];
                iArr[i15 + 1] = iArr2[iDigit2][i14];
            }
            iZoijcleaow += agtfadlqog.zoijcleaow(zArr, iZoijcleaow, iArr, true);
        }
        agtfadlqog.zoijcleaow(zArr, iZoijcleaow, f122203ppxfxbqfkf, true);
        return zArr;
    }
}
