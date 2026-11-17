package cl;

import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public abstract class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final char[] f19982iobyxmoadg = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: Access modifiers changed from: private */
    public static final int eablkybsjg(char c13) {
        if ('0' <= c13 && c13 < ':') {
            return c13 - '0';
        }
        if ('a' <= c13 && c13 < 'g') {
            return c13 - 'W';
        }
        if ('A' <= c13 && c13 < 'G') {
            return c13 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c13);
    }

    public static final char[] gxszxtbevo() {
        return f19982iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ppxfxbqfkf(byte[] bArr, int i13) {
        byte b13;
        int i14;
        int length = bArr.length;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (i15 < length) {
            byte b14 = bArr[i15];
            if (b14 >= 0) {
                int i18 = i17 + 1;
                if (i17 == i13) {
                    return i16;
                }
                if ((b14 != 10 && b14 != 13 && ((b14 >= 0 && b14 < 32) || (127 <= b14 && b14 < 160))) || b14 == 65533) {
                    return -1;
                }
                i16 += b14 < 65536 ? 1 : 2;
                i15++;
                while (true) {
                    i17 = i18;
                    if (i15 >= length || (b13 = bArr[i15]) < 0) {
                        break;
                    }
                    i15++;
                    i18 = i17 + 1;
                    if (i17 == i13) {
                        return i16;
                    }
                    if ((b13 != 10 && b13 != 13 && ((b13 >= 0 && b13 < 32) || (127 <= b13 && b13 < 160))) || b13 == 65533) {
                        return -1;
                    }
                    i16 += b13 < 65536 ? 1 : 2;
                }
            } else {
                if ((b14 >> 5) == -2) {
                    int i19 = i15 + 1;
                    if (length <= i19) {
                        if (i17 == i13) {
                            return i16;
                        }
                        return -1;
                    }
                    byte b15 = bArr[i19];
                    if ((b15 & 192) != 128) {
                        if (i17 == i13) {
                            return i16;
                        }
                        return -1;
                    }
                    int i23 = (b15 ^ 3968) ^ (b14 << 6);
                    if (i23 < 128) {
                        if (i17 == i13) {
                            return i16;
                        }
                        return -1;
                    }
                    i14 = i17 + 1;
                    if (i17 == i13) {
                        return i16;
                    }
                    if ((i23 != 10 && i23 != 13 && ((i23 >= 0 && i23 < 32) || (127 <= i23 && i23 < 160))) || i23 == 65533) {
                        return -1;
                    }
                    i16 += i23 < 65536 ? 1 : 2;
                    wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                    i15 += 2;
                } else if ((b14 >> 4) == -2) {
                    int i24 = i15 + 2;
                    if (length <= i24) {
                        if (i17 == i13) {
                            return i16;
                        }
                        return -1;
                    }
                    byte b16 = bArr[i15 + 1];
                    if ((b16 & 192) != 128) {
                        if (i17 == i13) {
                            return i16;
                        }
                        return -1;
                    }
                    byte b17 = bArr[i24];
                    if ((b17 & 192) != 128) {
                        if (i17 == i13) {
                            return i16;
                        }
                        return -1;
                    }
                    int i25 = ((b16 << 6) ^ ((-123008) ^ b17)) ^ (b14 << 12);
                    if (i25 < 2048) {
                        if (i17 == i13) {
                            return i16;
                        }
                        return -1;
                    }
                    if (55296 <= i25 && i25 < 57344) {
                        if (i17 == i13) {
                            return i16;
                        }
                        return -1;
                    }
                    i14 = i17 + 1;
                    if (i17 == i13) {
                        return i16;
                    }
                    if ((i25 != 10 && i25 != 13 && ((i25 >= 0 && i25 < 32) || (127 <= i25 && i25 < 160))) || i25 == 65533) {
                        return -1;
                    }
                    i16 += i25 < 65536 ? 1 : 2;
                    wwaezpbzkn wwaezpbzknVar2 = wwaezpbzkn.f37140iobyxmoadg;
                    i15 += 3;
                } else {
                    if ((b14 >> 3) != -2) {
                        if (i17 == i13) {
                            return i16;
                        }
                        return -1;
                    }
                    int i26 = i15 + 3;
                    if (length <= i26) {
                        if (i17 == i13) {
                            return i16;
                        }
                        return -1;
                    }
                    byte b18 = bArr[i15 + 1];
                    if ((b18 & 192) != 128) {
                        if (i17 == i13) {
                            return i16;
                        }
                        return -1;
                    }
                    byte b19 = bArr[i15 + 2];
                    if ((b19 & 192) != 128) {
                        if (i17 == i13) {
                            return i16;
                        }
                        return -1;
                    }
                    byte b23 = bArr[i26];
                    if ((b23 & 192) != 128) {
                        if (i17 == i13) {
                            return i16;
                        }
                        return -1;
                    }
                    int i27 = (((b23 ^ 3678080) ^ (b19 << 6)) ^ (b18 << 12)) ^ (b14 << 18);
                    if (i27 > 1114111) {
                        if (i17 == i13) {
                            return i16;
                        }
                        return -1;
                    }
                    if (55296 <= i27 && i27 < 57344) {
                        if (i17 == i13) {
                            return i16;
                        }
                        return -1;
                    }
                    if (i27 < 65536) {
                        if (i17 == i13) {
                            return i16;
                        }
                        return -1;
                    }
                    i14 = i17 + 1;
                    if (i17 == i13) {
                        return i16;
                    }
                    if ((i27 != 10 && i27 != 13 && ((i27 >= 0 && i27 < 32) || (127 <= i27 && i27 < 160))) || i27 == 65533) {
                        return -1;
                    }
                    i16 += i27 < 65536 ? 1 : 2;
                    wwaezpbzkn wwaezpbzknVar3 = wwaezpbzkn.f37140iobyxmoadg;
                    i15 += 4;
                }
                i17 = i14;
            }
        }
        return i16;
    }

    public static final void wkgbmnqykc(bl.gxszxtbevo gxszxtbevoVar, bl.ppxfxbqfkf buffer, int i13, int i14) {
        zdlpuopuiu.btonecajqb(gxszxtbevoVar, "<this>");
        zdlpuopuiu.btonecajqb(buffer, "buffer");
        buffer.gtknphoqwx(gxszxtbevoVar.agtfadlqog(), i13, i14);
    }
}
