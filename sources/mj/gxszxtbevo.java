package mj;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final int[] f67267iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final int[] f67268ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final long[] f67269wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final int[] f67270zoijcleaow;

    static {
        int[] iArr = new int[UserVerificationMethods.USER_VERIFY_HANDPRINT];
        int i13 = 0;
        for (int i14 = 0; i14 < 256; i14++) {
            iArr[i14] = "0123456789abcdef".charAt(i14 & 15) | ("0123456789abcdef".charAt(i14 >> 4) << '\b');
        }
        f67267iobyxmoadg = iArr;
        int[] iArr2 = new int[UserVerificationMethods.USER_VERIFY_HANDPRINT];
        for (int i15 = 0; i15 < 256; i15++) {
            iArr2[i15] = "0123456789ABCDEF".charAt(i15 & 15) | ("0123456789ABCDEF".charAt(i15 >> 4) << '\b');
        }
        f67270zoijcleaow = iArr2;
        int[] iArr3 = new int[UserVerificationMethods.USER_VERIFY_HANDPRINT];
        for (int i16 = 0; i16 < 256; i16++) {
            iArr3[i16] = -1;
        }
        int i17 = 0;
        int i18 = 0;
        while (i17 < "0123456789abcdef".length()) {
            iArr3["0123456789abcdef".charAt(i17)] = i18;
            i17++;
            i18++;
        }
        int i19 = 0;
        int i23 = 0;
        while (i19 < "0123456789ABCDEF".length()) {
            iArr3["0123456789ABCDEF".charAt(i19)] = i23;
            i19++;
            i23++;
        }
        f67268ppxfxbqfkf = iArr3;
        long[] jArr = new long[UserVerificationMethods.USER_VERIFY_HANDPRINT];
        for (int i24 = 0; i24 < 256; i24++) {
            jArr[i24] = -1;
        }
        int i25 = 0;
        int i26 = 0;
        while (i25 < "0123456789abcdef".length()) {
            jArr["0123456789abcdef".charAt(i25)] = i26;
            i25++;
            i26++;
        }
        int i27 = 0;
        while (i13 < "0123456789ABCDEF".length()) {
            jArr["0123456789ABCDEF".charAt(i13)] = i27;
            i13++;
            i27++;
        }
        f67269wkgbmnqykc = jArr;
    }

    private static final void btonecajqb(String str, int i13, int i14, String str2, int i15) {
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(i13, i14);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strSubstring, "substring(...)");
        throw new NumberFormatException("Expected " + str2 + ' ' + i15 + " hexadecimal digits at index " + i13 + ", but was \"" + strSubstring + "\" of length " + (i14 - i13));
    }

    private static final void draadjrbmk(String str, int i13, int i14, String str2, String str3) {
        int iBtonecajqb = zg.gtknphoqwx.btonecajqb(str2.length() + i13, i14);
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(i13, iBtonecajqb);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strSubstring, "substring(...)");
        throw new NumberFormatException("Expected " + str3 + " \"" + str2 + "\" at index " + i13 + ", but was " + strSubstring);
    }

    private static final Void dxjokdxxww(String str, int i13) {
        throw new NumberFormatException("Expected a hexadecimal digit at index " + i13 + ", but was " + str.charAt(i13));
    }

    public static final long eablkybsjg(String str, int i13, int i14, lqeggnwhkg format) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(str, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(format, "format");
        return lqeggnwhkg(str, i13, i14, format, 16);
    }

    private static final void gtknphoqwx(String str, int i13, int i14, String str2, String str3) {
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(i13, i14);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strSubstring, "substring(...)");
        throw new NumberFormatException("Expected a hexadecimal number with prefix \"" + str2 + "\" and suffix \"" + str3 + "\", but was " + strSubstring);
    }

    public static /* synthetic */ long gxszxtbevo(String str, int i13, int i14, lqeggnwhkg lqeggnwhkgVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i13 = 0;
        }
        if ((i15 & 2) != 0) {
            i14 = str.length();
        }
        if ((i15 & 4) != 0) {
            lqeggnwhkgVar = lqeggnwhkg.f67277wkgbmnqykc.iobyxmoadg();
        }
        return eablkybsjg(str, i13, i14, lqeggnwhkgVar);
    }

    private static final void iobyxmoadg(String str, int i13, int i14, int i15) {
        int i16 = i14 - i13;
        if (i16 < 1) {
            btonecajqb(str, i13, i14, "at least", 1);
        } else if (i16 > i15) {
            ppxfxbqfkf(str, i13, (i16 + i13) - i15);
        }
    }

    private static final long lqeggnwhkg(String str, int i13, int i14, lqeggnwhkg lqeggnwhkgVar, int i15) {
        hg.wkgbmnqykc.f40274zdlpuopuiu.iobyxmoadg(i13, i14, str.length());
        lqeggnwhkg.ppxfxbqfkf ppxfxbqfkfVarZoijcleaow = lqeggnwhkgVar.zoijcleaow();
        if (ppxfxbqfkfVarZoijcleaow.gxszxtbevo()) {
            iobyxmoadg(str, i13, i14, i15);
            return nufgyqmvbu(str, i13, i14);
        }
        String strWkgbmnqykc = ppxfxbqfkfVarZoijcleaow.wkgbmnqykc();
        String strEablkybsjg = ppxfxbqfkfVarZoijcleaow.eablkybsjg();
        zoijcleaow(str, i13, i14, strWkgbmnqykc, strEablkybsjg, ppxfxbqfkfVarZoijcleaow.ppxfxbqfkf(), i15);
        return nufgyqmvbu(str, i13 + strWkgbmnqykc.length(), i14 - strEablkybsjg.length());
    }

    private static final long nufgyqmvbu(String str, int i13, int i14) {
        long j13 = 0;
        while (i13 < i14) {
            long j14 = j13 << 4;
            char cCharAt = str.charAt(i13);
            if ((cCharAt >>> '\b') == 0) {
                long j15 = f67269wkgbmnqykc[cCharAt];
                if (j15 >= 0) {
                    j13 = j14 | j15;
                    i13++;
                }
            }
            dxjokdxxww(str, i13);
            throw new KotlinNothingValueException();
        }
        return j13;
    }

    private static final void ppxfxbqfkf(String str, int i13, int i14) {
        while (i13 < i14) {
            if (str.charAt(i13) != '0') {
                throw new NumberFormatException("Expected the hexadecimal digit '0' at index " + i13 + ", but was '" + str.charAt(i13) + "'.\nThe result won't fit the type being parsed.");
            }
            i13++;
        }
    }

    public static final int[] wkgbmnqykc() {
        return f67267iobyxmoadg;
    }

    private static final void zoijcleaow(String str, int i13, int i14, String str2, String str3, boolean z13, int i15) {
        if ((i14 - i13) - str2.length() <= str3.length()) {
            gtknphoqwx(str, i13, i14, str2, str3);
        }
        if (str2.length() != 0) {
            int length = str2.length();
            for (int i16 = 0; i16 < length; i16++) {
                if (!ppxfxbqfkf.gxszxtbevo(str2.charAt(i16), str.charAt(i13 + i16), z13)) {
                    draadjrbmk(str, i13, i14, str2, "prefix");
                }
            }
            i13 += str2.length();
        }
        int length2 = i14 - str3.length();
        if (str3.length() != 0) {
            int length3 = str3.length();
            for (int i17 = 0; i17 < length3; i17++) {
                if (!ppxfxbqfkf.gxszxtbevo(str3.charAt(i17), str.charAt(length2 + i17), z13)) {
                    draadjrbmk(str, length2, i14, str3, "suffix");
                }
            }
        }
        iobyxmoadg(str, i13, length2, i15);
    }
}
