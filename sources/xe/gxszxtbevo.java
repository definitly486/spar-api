package xe;

import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class gxszxtbevo extends agtfadlqog {
    /* JADX WARN: Code duplicated, block: B:51:0x00d4  */
    private static String dxjokdxxww(String str) {
        int length = str.length();
        StringBuilder sb3 = new StringBuilder();
        for (int i13 = 0; i13 < length; i13++) {
            char cCharAt = str.charAt(i13);
            if (cCharAt == 0) {
                sb3.append("%U");
            } else if (cCharAt == ' ') {
                sb3.append(cCharAt);
            } else if (cCharAt == '@') {
                sb3.append("%V");
            } else if (cCharAt == '`') {
                sb3.append("%W");
            } else if (cCharAt == '-' || cCharAt == '.') {
                sb3.append(cCharAt);
            } else if (cCharAt <= 26) {
                sb3.append('$');
                sb3.append((char) (cCharAt + '@'));
            } else if (cCharAt < ' ') {
                sb3.append('%');
                sb3.append((char) (cCharAt + '&'));
            } else if (cCharAt <= ',' || cCharAt == '/' || cCharAt == ':') {
                sb3.append('/');
                sb3.append((char) (cCharAt + ' '));
            } else if (cCharAt <= '9') {
                sb3.append(cCharAt);
            } else if (cCharAt <= '?') {
                sb3.append('%');
                sb3.append((char) (cCharAt + 11));
            } else if (cCharAt <= 'Z') {
                sb3.append(cCharAt);
            } else if (cCharAt <= '_') {
                sb3.append('%');
                sb3.append((char) (cCharAt - 16));
            } else if (cCharAt <= 'z') {
                sb3.append('+');
                sb3.append((char) (cCharAt - ' '));
            } else {
                if (cCharAt > 127) {
                    throw new IllegalArgumentException("Requested content contains a non-encodable character: '" + str.charAt(i13) + "'");
                }
                sb3.append('%');
                sb3.append((char) (cCharAt - '+'));
            }
        }
        return sb3.toString();
    }

    private static void nufgyqmvbu(int i13, int[] iArr) {
        for (int i14 = 0; i14 < 9; i14++) {
            int i15 = 1;
            if (((1 << (8 - i14)) & i13) != 0) {
                i15 = 2;
            }
            iArr[i14] = i15;
        }
    }

    @Override // xe.agtfadlqog
    protected Collection gxszxtbevo() {
        return Collections.singleton(com.google.zxing.iobyxmoadg.CODE_39);
    }

    @Override // xe.agtfadlqog
    public boolean[] wkgbmnqykc(String str) {
        int length = str.length();
        if (length > 80) {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
        }
        for (int i13 = 0; i13 < length; i13++) {
            if ("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i13)) < 0) {
                str = dxjokdxxww(str);
                length = str.length();
                if (length <= 80) {
                    break;
                }
                throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got " + length + " (extended full ASCII mode)");
            }
        }
        int[] iArr = new int[9];
        boolean[] zArr = new boolean[(length * 13) + 25];
        nufgyqmvbu(148, iArr);
        int iZoijcleaow = agtfadlqog.zoijcleaow(zArr, 0, iArr, true);
        int[] iArr2 = {1};
        int iZoijcleaow2 = iZoijcleaow + agtfadlqog.zoijcleaow(zArr, iZoijcleaow, iArr2, false);
        for (int i14 = 0; i14 < length; i14++) {
            nufgyqmvbu(eablkybsjg.f122207iobyxmoadg["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i14))], iArr);
            int iZoijcleaow3 = iZoijcleaow2 + agtfadlqog.zoijcleaow(zArr, iZoijcleaow2, iArr, true);
            iZoijcleaow2 = iZoijcleaow3 + agtfadlqog.zoijcleaow(zArr, iZoijcleaow3, iArr2, false);
        }
        nufgyqmvbu(148, iArr);
        agtfadlqog.zoijcleaow(zArr, iZoijcleaow2, iArr, true);
        return zArr;
    }
}
