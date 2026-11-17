package xe;

import com.google.zxing.FormatException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class rgvfuqvkyq extends wflxmlrfwp {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    static final int[][] f122218eablkybsjg;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    static final int[][] f122221wkgbmnqykc;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    static final int[] f122219iobyxmoadg = {1, 1, 1};

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    static final int[] f122222zoijcleaow = {1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    static final int[] f122220ppxfxbqfkf = {1, 1, 1, 1, 1, 1};

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f122221wkgbmnqykc = iArr;
        int[][] iArr2 = new int[20][];
        f122218eablkybsjg = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i13 = 10; i13 < 20; i13++) {
            int[] iArr3 = f122221wkgbmnqykc[i13 - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i14 = 0; i14 < iArr3.length; i14++) {
                iArr4[i14] = iArr3[(iArr3.length - i14) - 1];
            }
            f122218eablkybsjg[i13] = iArr4;
        }
    }

    static boolean iobyxmoadg(CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i13 = length - 1;
        return zoijcleaow(charSequence.subSequence(0, i13)) == Character.digit(charSequence.charAt(i13), 10);
    }

    static int zoijcleaow(CharSequence charSequence) throws FormatException {
        int length = charSequence.length();
        int i13 = 0;
        for (int i14 = length - 1; i14 >= 0; i14 -= 2) {
            int iCharAt = charSequence.charAt(i14) - '0';
            if (iCharAt < 0 || iCharAt > 9) {
                throw FormatException.iobyxmoadg();
            }
            i13 += iCharAt;
        }
        int i15 = i13 * 3;
        for (int i16 = length - 2; i16 >= 0; i16 -= 2) {
            int iCharAt2 = charSequence.charAt(i16) - '0';
            if (iCharAt2 < 0 || iCharAt2 > 9) {
                throw FormatException.iobyxmoadg();
            }
            i15 += iCharAt2;
        }
        return (1000 - i15) % 10;
    }
}
