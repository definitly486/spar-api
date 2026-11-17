package xe;

import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public class nufgyqmvbu extends agtfadlqog {
    static String btonecajqb(String str) {
        int length = str.length();
        StringBuilder sb3 = new StringBuilder(length << 1);
        for (int i13 = 0; i13 < length; i13++) {
            char cCharAt = str.charAt(i13);
            if (cCharAt == 0) {
                sb3.append("bU");
            } else if (cCharAt <= 26) {
                sb3.append('a');
                sb3.append((char) (cCharAt + '@'));
            } else if (cCharAt <= 31) {
                sb3.append('b');
                sb3.append((char) (cCharAt + '&'));
            } else if (cCharAt == ' ' || cCharAt == '$' || cCharAt == '%' || cCharAt == '+') {
                sb3.append(cCharAt);
            } else if (cCharAt <= ',') {
                sb3.append('c');
                sb3.append((char) (cCharAt + ' '));
            } else if (cCharAt <= '9') {
                sb3.append(cCharAt);
            } else if (cCharAt == ':') {
                sb3.append("cZ");
            } else if (cCharAt <= '?') {
                sb3.append('b');
                sb3.append((char) (cCharAt + 11));
            } else if (cCharAt == '@') {
                sb3.append("bV");
            } else if (cCharAt <= 'Z') {
                sb3.append(cCharAt);
            } else if (cCharAt <= '_') {
                sb3.append('b');
                sb3.append((char) (cCharAt - 16));
            } else if (cCharAt == '`') {
                sb3.append("bW");
            } else if (cCharAt <= 'z') {
                sb3.append('d');
                sb3.append((char) (cCharAt - ' '));
            } else {
                if (cCharAt > 127) {
                    throw new IllegalArgumentException("Requested content contains a non-encodable character: '" + cCharAt + "'");
                }
                sb3.append('b');
                sb3.append((char) (cCharAt - '+'));
            }
        }
        return sb3.toString();
    }

    private static int dxjokdxxww(String str, int i13) {
        int iIndexOf = 0;
        int i14 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            iIndexOf += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(length)) * i14;
            i14++;
            if (i14 > i13) {
                i14 = 1;
            }
        }
        return iIndexOf % 47;
    }

    private static int nufgyqmvbu(boolean[] zArr, int i13, int i14) {
        for (int i15 = 0; i15 < 9; i15++) {
            boolean z13 = true;
            int i16 = i13 + i15;
            if (((1 << (8 - i15)) & i14) == 0) {
                z13 = false;
            }
            zArr[i16] = z13;
        }
        return 9;
    }

    @Override // xe.agtfadlqog
    protected Collection gxszxtbevo() {
        return Collections.singleton(com.google.zxing.iobyxmoadg.CODE_93);
    }

    @Override // xe.agtfadlqog
    public boolean[] wkgbmnqykc(String str) {
        String strBtonecajqb = btonecajqb(str);
        int length = strBtonecajqb.length();
        if (length > 80) {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long after converting to extended encoding, but got ".concat(String.valueOf(length)));
        }
        boolean[] zArr = new boolean[((strBtonecajqb.length() + 4) * 9) + 1];
        int iNufgyqmvbu = nufgyqmvbu(zArr, 0, lqeggnwhkg.f122212ppxfxbqfkf);
        for (int i13 = 0; i13 < length; i13++) {
            iNufgyqmvbu += nufgyqmvbu(zArr, iNufgyqmvbu, lqeggnwhkg.f122213zoijcleaow["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(strBtonecajqb.charAt(i13))]);
        }
        int iDxjokdxxww = dxjokdxxww(strBtonecajqb, 20);
        int[] iArr = lqeggnwhkg.f122213zoijcleaow;
        int iNufgyqmvbu2 = iNufgyqmvbu + nufgyqmvbu(zArr, iNufgyqmvbu, iArr[iDxjokdxxww]);
        int iNufgyqmvbu3 = iNufgyqmvbu2 + nufgyqmvbu(zArr, iNufgyqmvbu2, iArr[dxjokdxxww(strBtonecajqb + "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".charAt(iDxjokdxxww), 15)]);
        zArr[iNufgyqmvbu3 + nufgyqmvbu(zArr, iNufgyqmvbu3, lqeggnwhkg.f122212ppxfxbqfkf)] = true;
        return zArr;
    }
}
