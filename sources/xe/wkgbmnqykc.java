package xe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class wkgbmnqykc extends agtfadlqog {

    private enum iobyxmoadg {
        UNCODABLE,
        ONE_DIGIT,
        TWO_DIGITS,
        FNC_1
    }

    private static iobyxmoadg dxjokdxxww(CharSequence charSequence, int i13) {
        int length = charSequence.length();
        if (i13 >= length) {
            return iobyxmoadg.UNCODABLE;
        }
        char cCharAt = charSequence.charAt(i13);
        if (cCharAt == 241) {
            return iobyxmoadg.FNC_1;
        }
        if (cCharAt < '0' || cCharAt > '9') {
            return iobyxmoadg.UNCODABLE;
        }
        int i14 = i13 + 1;
        if (i14 >= length) {
            return iobyxmoadg.ONE_DIGIT;
        }
        char cCharAt2 = charSequence.charAt(i14);
        return (cCharAt2 < '0' || cCharAt2 > '9') ? iobyxmoadg.ONE_DIGIT : iobyxmoadg.TWO_DIGITS;
    }

    private static int nufgyqmvbu(CharSequence charSequence, int i13, int i14) {
        iobyxmoadg iobyxmoadgVarDxjokdxxww;
        iobyxmoadg iobyxmoadgVarDxjokdxxww2;
        char cCharAt;
        iobyxmoadg iobyxmoadgVarDxjokdxxww3 = dxjokdxxww(charSequence, i13);
        iobyxmoadg iobyxmoadgVar = iobyxmoadg.ONE_DIGIT;
        if (iobyxmoadgVarDxjokdxxww3 == iobyxmoadgVar) {
            return i14 == 101 ? 101 : 100;
        }
        iobyxmoadg iobyxmoadgVar2 = iobyxmoadg.UNCODABLE;
        if (iobyxmoadgVarDxjokdxxww3 == iobyxmoadgVar2) {
            return (i13 >= charSequence.length() || ((cCharAt = charSequence.charAt(i13)) >= ' ' && (i14 != 101 || (cCharAt >= '`' && (cCharAt < 241 || cCharAt > 244))))) ? 100 : 101;
        }
        if (i14 == 101 && iobyxmoadgVarDxjokdxxww3 == iobyxmoadg.FNC_1) {
            return 101;
        }
        if (i14 == 99) {
            return 99;
        }
        if (i14 != 100) {
            if (iobyxmoadgVarDxjokdxxww3 == iobyxmoadg.FNC_1) {
                iobyxmoadgVarDxjokdxxww3 = dxjokdxxww(charSequence, i13 + 1);
            }
            return iobyxmoadgVarDxjokdxxww3 == iobyxmoadg.TWO_DIGITS ? 99 : 100;
        }
        iobyxmoadg iobyxmoadgVar3 = iobyxmoadg.FNC_1;
        if (iobyxmoadgVarDxjokdxxww3 == iobyxmoadgVar3 || (iobyxmoadgVarDxjokdxxww = dxjokdxxww(charSequence, i13 + 2)) == iobyxmoadgVar2 || iobyxmoadgVarDxjokdxxww == iobyxmoadgVar) {
            return 100;
        }
        if (iobyxmoadgVarDxjokdxxww == iobyxmoadgVar3) {
            return dxjokdxxww(charSequence, i13 + 3) == iobyxmoadg.TWO_DIGITS ? 99 : 100;
        }
        int i15 = i13 + 4;
        while (true) {
            iobyxmoadgVarDxjokdxxww2 = dxjokdxxww(charSequence, i15);
            if (iobyxmoadgVarDxjokdxxww2 != iobyxmoadg.TWO_DIGITS) {
                break;
            }
            i15 += 2;
        }
        return iobyxmoadgVarDxjokdxxww2 == iobyxmoadg.ONE_DIGIT ? 100 : 99;
    }

    @Override // xe.agtfadlqog
    protected Collection gxszxtbevo() {
        return Collections.singleton(com.google.zxing.iobyxmoadg.CODE_128);
    }

    @Override // xe.agtfadlqog
    public boolean[] wkgbmnqykc(String str) {
        int length = str.length();
        if (length <= 0 || length > 80) {
            throw new IllegalArgumentException("Contents length should be between 1 and 80 characters, but got ".concat(String.valueOf(length)));
        }
        int iZoijcleaow = 0;
        for (int i13 = 0; i13 < length; i13++) {
            char cCharAt = str.charAt(i13);
            switch (cCharAt) {
                case 241:
                case 242:
                case 243:
                case 244:
                    break;
                default:
                    if (cCharAt > 127) {
                        throw new IllegalArgumentException("Bad character in input: ".concat(String.valueOf(cCharAt)));
                    }
                    break;
                    break;
            }
        }
        ArrayList<int[]> arrayList = new ArrayList();
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 1;
        while (true) {
            int i18 = 103;
            if (i14 >= length) {
                int[][] iArr = ppxfxbqfkf.f122217iobyxmoadg;
                arrayList.add(iArr[i15 % 103]);
                arrayList.add(iArr[106]);
                int i19 = 0;
                for (int[] iArr2 : arrayList) {
                    for (int i23 : iArr2) {
                        i19 += i23;
                    }
                }
                boolean[] zArr = new boolean[i19];
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    iZoijcleaow += agtfadlqog.zoijcleaow(zArr, iZoijcleaow, (int[]) it.next(), true);
                }
                return zArr;
            }
            int iNufgyqmvbu = nufgyqmvbu(str, i14, i16);
            int iCharAt = 100;
            if (iNufgyqmvbu == i16) {
                switch (str.charAt(i14)) {
                    case 241:
                        iCharAt = 102;
                        break;
                    case 242:
                        iCharAt = 97;
                        break;
                    case 243:
                        iCharAt = 96;
                        break;
                    case 244:
                        if (i16 == 101) {
                            iCharAt = 101;
                        }
                        break;
                    default:
                        if (i16 == 100) {
                            iCharAt = str.charAt(i14) - ' ';
                        } else if (i16 != 101) {
                            iCharAt = Integer.parseInt(str.substring(i14, i14 + 2));
                            i14++;
                        } else {
                            char cCharAt2 = str.charAt(i14);
                            iCharAt = cCharAt2 - ' ';
                            if (iCharAt < 0) {
                                iCharAt = cCharAt2 + '@';
                            }
                        }
                        break;
                }
                i14++;
            } else {
                if (i16 != 0) {
                    i18 = iNufgyqmvbu;
                } else if (iNufgyqmvbu == 100) {
                    i18 = 104;
                } else if (iNufgyqmvbu != 101) {
                    i18 = 105;
                }
                iCharAt = i18;
                i16 = iNufgyqmvbu;
            }
            arrayList.add(ppxfxbqfkf.f122217iobyxmoadg[iCharAt]);
            i15 += iCharAt * i17;
            if (i14 != 0) {
                i17++;
            }
        }
    }
}
