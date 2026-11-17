package mk;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final mj.rgvfuqvkyq f67365iobyxmoadg = new mj.rgvfuqvkyq("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    /* JADX WARN: Code duplicated, block: B:31:0x0070  */
    /* JADX WARN: Code duplicated, block: B:33:0x007a A[LOOP:1: B:30:0x006e->B:33:0x007a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:53:0x0080 A[EDGE_INSN: B:53:0x0080->B:34:0x0080 BREAK  A[LOOP:1: B:30:0x006e->B:33:0x007a], SYNTHETIC] */
    public static final byte[] eablkybsjg(String input, int i13, int i14) {
        int i15;
        int i16;
        int iPmvmpeiblj;
        zdlpuopuiu.btonecajqb(input, "input");
        byte[] bArr = new byte[16];
        int i17 = i13;
        int i18 = -1;
        int i19 = -1;
        int i23 = 0;
        while (i17 < i14) {
            if (i23 == 16) {
                return null;
            }
            int i24 = i17 + 2;
            if (i24 <= i14 && kcexrzcfyt.wypolnanlu(input, "::", i17, false, 4, null)) {
                if (i18 != -1) {
                    return null;
                }
                i23 += 2;
                if (i24 == i14) {
                    i18 = i23;
                    break;
                }
                i19 = i24;
                i18 = i23;
                i17 = i19;
                i15 = 0;
                while (i17 < i14) {
                    iPmvmpeiblj = wflxmlrfwp.pmvmpeiblj(input.charAt(i17));
                    if (iPmvmpeiblj != -1) {
                        break;
                        break;
                    }
                    i15 = (i15 << 4) + iPmvmpeiblj;
                    i17++;
                }
                i16 = i17 - i19;
                if (i16 != 0) {
                }
                return null;
            }
            if (i23 != 0) {
                if (!kcexrzcfyt.wypolnanlu(input, StringUtils.PROCESS_POSTFIX_DELIMITER, i17, false, 4, null)) {
                    if (!kcexrzcfyt.wypolnanlu(input, ".", i17, false, 4, null) || !wkgbmnqykc(input, i19, i14, bArr, i23 - 2)) {
                        return null;
                    }
                    i23 += 2;
                    break;
                }
                i17++;
            }
            i19 = i17;
            i17 = i19;
            i15 = 0;
            while (i17 < i14) {
                iPmvmpeiblj = wflxmlrfwp.pmvmpeiblj(input.charAt(i17));
                if (iPmvmpeiblj != -1) {
                    break;
                }
                i15 = (i15 << 4) + iPmvmpeiblj;
                i17++;
            }
            i16 = i17 - i19;
            if (i16 != 0 || i16 > 4) {
                return null;
            }
            int i25 = i23 + 1;
            bArr[i23] = (byte) ((i15 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            i23 += 2;
            bArr[i25] = (byte) (i15 & KotlinVersion.MAX_COMPONENT_VALUE);
        }
        if (i23 != 16) {
            if (i18 == -1) {
                return null;
            }
            hg.agtfadlqog.dxjokdxxww(bArr, bArr, 16 - (i23 - i18), i18, i23);
            hg.agtfadlqog.jyumaefscl(bArr, (byte) 0, i18, (16 - i23) + i18);
        }
        return bArr;
    }

    public static final String gxszxtbevo(byte[] address) {
        zdlpuopuiu.btonecajqb(address, "address");
        int i13 = -1;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i15 < address.length) {
            int i17 = i15;
            while (i17 < 16 && address[i17] == 0 && address[i17 + 1] == 0) {
                i17 += 2;
            }
            int i18 = i17 - i15;
            if (i18 > i16 && i18 >= 4) {
                i13 = i15;
                i16 = i18;
            }
            i15 = i17 + 2;
        }
        bl.ppxfxbqfkf ppxfxbqfkfVar = new bl.ppxfxbqfkf();
        while (i14 < address.length) {
            if (i14 == i13) {
                ppxfxbqfkfVar.o(58);
                i14 += i16;
                if (i14 == 16) {
                    ppxfxbqfkfVar.o(58);
                }
            } else {
                if (i14 > 0) {
                    ppxfxbqfkfVar.o(58);
                }
                ppxfxbqfkfVar.I((wflxmlrfwp.zoijcleaow(address[i14], KotlinVersion.MAX_COMPONENT_VALUE) << 8) | wflxmlrfwp.zoijcleaow(address[i14 + 1], KotlinVersion.MAX_COMPONENT_VALUE));
                i14 += 2;
            }
        }
        return ppxfxbqfkfVar.istkbnxepw();
    }

    public static final boolean iobyxmoadg(String str) {
        zdlpuopuiu.btonecajqb(str, "<this>");
        return f67365iobyxmoadg.ojitshcjhn(str);
    }

    public static final boolean ppxfxbqfkf(String str) {
        zdlpuopuiu.btonecajqb(str, "<this>");
        int length = str.length();
        if (1 <= length && length < 254) {
            int i13 = 0;
            while (true) {
                int iYfnezrywwk = kcexrzcfyt.yfnezrywwk(str, '.', i13, false, 4, null);
                int length2 = iYfnezrywwk == -1 ? str.length() - i13 : iYfnezrywwk - i13;
                if (1 <= length2 && length2 < 64) {
                    if (iYfnezrywwk == -1 || iYfnezrywwk == str.length() - 1) {
                        break;
                    }
                    i13 = iYfnezrywwk + 1;
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean wkgbmnqykc(String input, int i13, int i14, byte[] address, int i15) {
        zdlpuopuiu.btonecajqb(input, "input");
        zdlpuopuiu.btonecajqb(address, "address");
        int i16 = i15;
        while (i13 < i14) {
            if (i16 == address.length) {
                return false;
            }
            if (i16 != i15) {
                if (input.charAt(i13) != '.') {
                    return false;
                }
                i13++;
            }
            int i17 = i13;
            int i18 = 0;
            while (i17 < i14) {
                char cCharAt = input.charAt(i17);
                if (zdlpuopuiu.draadjrbmk(cCharAt, 48) < 0 || zdlpuopuiu.draadjrbmk(cCharAt, 57) > 0) {
                    break;
                }
                if ((i18 == 0 && i13 != i17) || (i18 = ((i18 * 10) + cCharAt) - 48) > 255) {
                    return false;
                }
                i17++;
            }
            if (i17 - i13 == 0) {
                return false;
            }
            address[i16] = (byte) i18;
            i16++;
            i13 = i17;
        }
        return i16 == i15 + 4;
    }

    public static final boolean zoijcleaow(String str) {
        zdlpuopuiu.btonecajqb(str, "<this>");
        int length = str.length();
        for (int i13 = 0; i13 < length; i13++) {
            char cCharAt = str.charAt(i13);
            if (zdlpuopuiu.draadjrbmk(cCharAt, 31) <= 0 || zdlpuopuiu.draadjrbmk(cCharAt, 127) >= 0 || kcexrzcfyt.yfnezrywwk(" #%/:?@[\\]", cCharAt, 0, false, 6, null) != -1) {
                return true;
            }
        }
        return false;
    }
}
