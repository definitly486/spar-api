package xe;

import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class zoijcleaow extends agtfadlqog {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final char f122228eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final char[] f122229ppxfxbqfkf = {'T', 'N', '*', 'E'};

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final char[] f122230wkgbmnqykc = {'/', ':', '+', '.'};

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final char[] f122231zoijcleaow;

    static {
        char[] cArr = {'A', 'B', 'C', 'D'};
        f122231zoijcleaow = cArr;
        f122228eablkybsjg = cArr[0];
    }

    @Override // xe.agtfadlqog
    protected Collection gxszxtbevo() {
        return Collections.singleton(com.google.zxing.iobyxmoadg.CODABAR);
    }

    @Override // xe.agtfadlqog
    public boolean[] wkgbmnqykc(String str) {
        int i13;
        if (str.length() < 2) {
            StringBuilder sb3 = new StringBuilder();
            char c13 = f122228eablkybsjg;
            sb3.append(c13);
            sb3.append(str);
            sb3.append(c13);
            str = sb3.toString();
        } else {
            char upperCase = Character.toUpperCase(str.charAt(0));
            char upperCase2 = Character.toUpperCase(str.charAt(str.length() - 1));
            char[] cArr = f122231zoijcleaow;
            boolean zIobyxmoadg = iobyxmoadg.iobyxmoadg(cArr, upperCase);
            boolean zIobyxmoadg2 = iobyxmoadg.iobyxmoadg(cArr, upperCase2);
            char[] cArr2 = f122229ppxfxbqfkf;
            boolean zIobyxmoadg3 = iobyxmoadg.iobyxmoadg(cArr2, upperCase);
            boolean zIobyxmoadg4 = iobyxmoadg.iobyxmoadg(cArr2, upperCase2);
            if (zIobyxmoadg) {
                if (!zIobyxmoadg2) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
                }
            } else if (!zIobyxmoadg3) {
                if (zIobyxmoadg2 || zIobyxmoadg4) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
                }
                StringBuilder sb4 = new StringBuilder();
                char c14 = f122228eablkybsjg;
                sb4.append(c14);
                sb4.append(str);
                sb4.append(c14);
                str = sb4.toString();
            } else if (!zIobyxmoadg4) {
                throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
            }
        }
        int i14 = 20;
        for (int i15 = 1; i15 < str.length() - 1; i15++) {
            if (Character.isDigit(str.charAt(i15)) || str.charAt(i15) == '-' || str.charAt(i15) == '$') {
                i14 += 9;
            } else {
                if (!iobyxmoadg.iobyxmoadg(f122230wkgbmnqykc, str.charAt(i15))) {
                    throw new IllegalArgumentException("Cannot encode : '" + str.charAt(i15) + '\'');
                }
                i14 += 10;
            }
        }
        boolean[] zArr = new boolean[i14 + (str.length() - 1)];
        int i16 = 0;
        for (int i17 = 0; i17 < str.length(); i17++) {
            char upperCase3 = Character.toUpperCase(str.charAt(i17));
            if (i17 == 0 || i17 == str.length() - 1) {
                if (upperCase3 == '*') {
                    upperCase3 = 'C';
                } else if (upperCase3 == 'E') {
                    upperCase3 = 'D';
                } else if (upperCase3 == 'N') {
                    upperCase3 = 'B';
                } else if (upperCase3 == 'T') {
                    upperCase3 = 'A';
                }
            }
            int i18 = 0;
            while (true) {
                char[] cArr3 = iobyxmoadg.f122208iobyxmoadg;
                if (i18 >= cArr3.length) {
                    i13 = 0;
                    break;
                }
                if (upperCase3 == cArr3[i18]) {
                    i13 = iobyxmoadg.f122210zoijcleaow[i18];
                    break;
                }
                i18++;
            }
            int i19 = 0;
            int i23 = 0;
            boolean z13 = true;
            while (i19 < 7) {
                zArr[i16] = z13;
                i16++;
                if (((i13 >> (6 - i19)) & 1) == 0 || i23 == 1) {
                    z13 = !z13;
                    i19++;
                    i23 = 0;
                } else {
                    i23++;
                }
            }
            if (i17 < str.length() - 1) {
                zArr[i16] = false;
                i16++;
            }
        }
        return zArr;
    }
}
