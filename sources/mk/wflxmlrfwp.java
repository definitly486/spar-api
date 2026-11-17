package mk;

import bl.iwizpuwonk;
import hg.jyumaefscl;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.zdlpuopuiu;
import lk.istkbnxepw;
import lk.yadqdtsiqt;
import lk.yggfygwlhe;
import mj.kcexrzcfyt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wflxmlrfwp {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final yadqdtsiqt f67376eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final byte[] f67377iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final yggfygwlhe f67378ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final istkbnxepw f67379wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final iwizpuwonk f67380zoijcleaow;

    static {
        byte[] bArr = new byte[0];
        f67377iobyxmoadg = bArr;
        iwizpuwonk.iobyxmoadg iobyxmoadgVar = iwizpuwonk.f16705iwizpuwonk;
        bl.gxszxtbevo.iobyxmoadg iobyxmoadgVar2 = bl.gxszxtbevo.f16674iwizpuwonk;
        f67380zoijcleaow = iobyxmoadgVar.wkgbmnqykc(iobyxmoadgVar2.zoijcleaow("efbbbf"), iobyxmoadgVar2.zoijcleaow("feff"), iobyxmoadgVar2.zoijcleaow("fffe"), iobyxmoadgVar2.zoijcleaow("0000ffff"), iobyxmoadgVar2.zoijcleaow("ffff0000"));
        f67378ppxfxbqfkf = yggfygwlhe.f63244yggfygwlhe.iobyxmoadg(new String[0]);
        f67379wkgbmnqykc = istkbnxepw.iobyxmoadg.gtknphoqwx(istkbnxepw.f63065iobyxmoadg, bArr, null, 0, 0, 7, null);
        f67376eablkybsjg = yadqdtsiqt.zoijcleaow.eablkybsjg(yadqdtsiqt.f63238yggfygwlhe, bArr, null, 1, null);
    }

    public static final iwizpuwonk agtfadlqog() {
        return f67380zoijcleaow;
    }

    public static /* synthetic */ int btonecajqb(String str, char c13, int i13, int i14, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            i13 = 0;
        }
        if ((i15 & 4) != 0) {
            i14 = str.length();
        }
        return nufgyqmvbu(str, c13, i13, i14);
    }

    public static final long cdpycssgdh(String str, long j13) {
        zdlpuopuiu.btonecajqb(str, "<this>");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j13;
        }
    }

    public static final String[] cqumvgiudr(String[] strArr, String[] other, Comparator comparator) {
        zdlpuopuiu.btonecajqb(strArr, "<this>");
        zdlpuopuiu.btonecajqb(other, "other");
        zdlpuopuiu.btonecajqb(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            for (String str2 : other) {
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        zdlpuopuiu.nufgyqmvbu(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (String[]) array;
    }

    public static final istkbnxepw draadjrbmk() {
        return f67379wkgbmnqykc;
    }

    public static final int dxjokdxxww(String str, String delimiters, int i13, int i14) {
        zdlpuopuiu.btonecajqb(str, "<this>");
        zdlpuopuiu.btonecajqb(delimiters, "delimiters");
        while (i13 < i14) {
            if (kcexrzcfyt.ulzqkzuiru(delimiters, str.charAt(i13), false, 2, null)) {
                return i13;
            }
            i13++;
        }
        return i14;
    }

    public static final void eablkybsjg(long j13, long j14, long j15) {
        if ((j14 | j15) < 0 || j14 > j13 || j13 - j14 < j15) {
            throw new ArrayIndexOutOfBoundsException("length=" + j13 + ", offset=" + j14 + ", count=" + j14);
        }
    }

    public static final boolean esjtqupxsv(String name) {
        zdlpuopuiu.btonecajqb(name, "name");
        return kcexrzcfyt.istkbnxepw(name, "Authorization", true) || kcexrzcfyt.istkbnxepw(name, "Cookie", true) || kcexrzcfyt.istkbnxepw(name, "Proxy-Authorization", true) || kcexrzcfyt.istkbnxepw(name, "Set-Cookie", true);
    }

    public static final yggfygwlhe gtknphoqwx() {
        return f67378ppxfxbqfkf;
    }

    public static final void gxszxtbevo(Closeable closeable) {
        zdlpuopuiu.btonecajqb(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e13) {
            throw e13;
        } catch (Exception unused) {
        }
    }

    public static final void iobyxmoadg(List list, Object obj) {
        zdlpuopuiu.btonecajqb(list, "<this>");
        if (list.contains(obj)) {
            return;
        }
        list.add(obj);
    }

    public static final String iozdgvuglv(String str, int i13, int i14) {
        zdlpuopuiu.btonecajqb(str, "<this>");
        int iOxmwwwfdhm = oxmwwwfdhm(str, i13, i14);
        String strSubstring = str.substring(iOxmwwwfdhm, zdlpuopuiu(str, iOxmwwwfdhm, i14));
        zdlpuopuiu.dxjokdxxww(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static final int istkbnxepw(bl.ppxfxbqfkf ppxfxbqfkfVar, byte b13) {
        zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        int i13 = 0;
        while (!ppxfxbqfkfVar.n() && ppxfxbqfkfVar.agtfadlqog(0L) == b13) {
            i13++;
            ppxfxbqfkfVar.readByte();
        }
        return i13;
    }

    public static final List iwizpuwonk(Iterable a13, Iterable b13) {
        zdlpuopuiu.btonecajqb(a13, "a");
        zdlpuopuiu.btonecajqb(b13, "b");
        Iterator it = a13.iterator();
        Iterator it2 = b13.iterator();
        List listPpxfxbqfkf = jyumaefscl.ppxfxbqfkf();
        while (true) {
            if (!it.hasNext() && !it2.hasNext()) {
                return jyumaefscl.iobyxmoadg(listPpxfxbqfkf);
            }
            if (it.hasNext()) {
                listPpxfxbqfkf.add(it.next());
            }
            if (it2.hasNext()) {
                listPpxfxbqfkf.add(it2.next());
            }
        }
    }

    public static final int jyumaefscl(String str, int i13) {
        zdlpuopuiu.btonecajqb(str, "<this>");
        int length = str.length();
        while (i13 < length) {
            char cCharAt = str.charAt(i13);
            if (cCharAt != ' ' && cCharAt != '\t') {
                return i13;
            }
            i13++;
        }
        return str.length();
    }

    public static /* synthetic */ int kcexrzcfyt(String str, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i13 = 0;
        }
        if ((i15 & 2) != 0) {
            i14 = str.length();
        }
        return oxmwwwfdhm(str, i13, i14);
    }

    public static final mj.draadjrbmk lereixgezr(mj.rgvfuqvkyq rgvfuqvkyqVar, CharSequence input, int i13) {
        zdlpuopuiu.btonecajqb(rgvfuqvkyqVar, "<this>");
        zdlpuopuiu.btonecajqb(input, "input");
        mj.draadjrbmk draadjrbmkVarLqeggnwhkg = rgvfuqvkyqVar.lqeggnwhkg(input, i13);
        if (draadjrbmkVarLqeggnwhkg != null && draadjrbmkVarLqeggnwhkg.ppxfxbqfkf().wkgbmnqykc() == i13) {
            return draadjrbmkVarLqeggnwhkg;
        }
        return null;
    }

    public static /* synthetic */ String lmojexxdyd(String str, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i13 = 0;
        }
        if ((i15 & 2) != 0) {
            i14 = str.length();
        }
        return iozdgvuglv(str, i13, i14);
    }

    public static final String[] lqeggnwhkg(String[] strArr, String value) {
        zdlpuopuiu.btonecajqb(strArr, "<this>");
        zdlpuopuiu.btonecajqb(value, "value");
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length + 1);
        zdlpuopuiu.dxjokdxxww(objArrCopyOf, "copyOf(this, newSize)");
        String[] strArr2 = (String[]) objArrCopyOf;
        strArr2[hg.agtfadlqog.opjhrmiecq(strArr2)] = value;
        zdlpuopuiu.nufgyqmvbu(strArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
        return strArr2;
    }

    public static final int nufgyqmvbu(String str, char c13, int i13, int i14) {
        zdlpuopuiu.btonecajqb(str, "<this>");
        while (i13 < i14) {
            if (str.charAt(i13) == c13) {
                return i13;
            }
            i13++;
        }
        return i14;
    }

    public static final boolean ojitshcjhn(String[] strArr, String[] strArr2, Comparator comparator) {
        zdlpuopuiu.btonecajqb(strArr, "<this>");
        zdlpuopuiu.btonecajqb(comparator, "comparator");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                Iterator itIobyxmoadg = kotlin.jvm.internal.ppxfxbqfkf.iobyxmoadg(strArr2);
                while (itIobyxmoadg.hasNext()) {
                    if (comparator.compare(str, (String) itIobyxmoadg.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final int oxmwwwfdhm(String str, int i13, int i14) {
        zdlpuopuiu.btonecajqb(str, "<this>");
        while (i13 < i14) {
            char cCharAt = str.charAt(i13);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i13;
            }
            i13++;
        }
        return i14;
    }

    public static final int pmvmpeiblj(char c13) {
        if ('0' <= c13 && c13 < ':') {
            return c13 - '0';
        }
        if ('a' <= c13 && c13 < 'g') {
            return c13 - 'W';
        }
        if ('A' > c13 || c13 >= 'G') {
            return -1;
        }
        return c13 - '7';
    }

    public static final int ppxfxbqfkf(short s13, int i13) {
        return s13 & i13;
    }

    public static final int rgvfuqvkyq(String[] strArr, String value, Comparator comparator) {
        zdlpuopuiu.btonecajqb(strArr, "<this>");
        zdlpuopuiu.btonecajqb(value, "value");
        zdlpuopuiu.btonecajqb(comparator, "comparator");
        int length = strArr.length;
        for (int i13 = 0; i13 < length; i13++) {
            if (comparator.compare(strArr[i13], value) == 0) {
                return i13;
            }
        }
        return -1;
    }

    public static final int vdvldrhtss(String str) {
        zdlpuopuiu.btonecajqb(str, "<this>");
        int length = str.length();
        for (int i13 = 0; i13 < length; i13++) {
            char cCharAt = str.charAt(i13);
            if (zdlpuopuiu.draadjrbmk(cCharAt, 31) <= 0 || zdlpuopuiu.draadjrbmk(cCharAt, 127) >= 0) {
                return i13;
            }
        }
        return -1;
    }

    public static final yadqdtsiqt wflxmlrfwp() {
        return f67376eablkybsjg;
    }

    public static final long wkgbmnqykc(int i13, long j13) {
        return ((long) i13) & j13;
    }

    public static final Throwable wwaezpbzkn(Exception exc, List suppressed) {
        zdlpuopuiu.btonecajqb(exc, "<this>");
        zdlpuopuiu.btonecajqb(suppressed, "suppressed");
        Iterator it = suppressed.iterator();
        while (it.hasNext()) {
            gg.lqeggnwhkg.iobyxmoadg(exc, (Exception) it.next());
        }
        return exc;
    }

    public static final int yadqdtsiqt(String str, int i13) {
        if (str != null) {
            try {
                long j13 = Long.parseLong(str);
                if (j13 > 2147483647L) {
                    return Integer.MAX_VALUE;
                }
                if (j13 < 0) {
                    return 0;
                }
                return (int) j13;
            } catch (NumberFormatException unused) {
            }
        }
        return i13;
    }

    public static /* synthetic */ int yggfygwlhe(String str, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i13 = 0;
        }
        if ((i15 & 2) != 0) {
            i14 = str.length();
        }
        return zdlpuopuiu(str, i13, i14);
    }

    public static final void ylkuphrtab(bl.wkgbmnqykc wkgbmnqykcVar, int i13) {
        zdlpuopuiu.btonecajqb(wkgbmnqykcVar, "<this>");
        wkgbmnqykcVar.o((i13 >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        wkgbmnqykcVar.o((i13 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        wkgbmnqykcVar.o(i13 & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public static final int zdlpuopuiu(String str, int i13, int i14) {
        zdlpuopuiu.btonecajqb(str, "<this>");
        int i15 = i14 - 1;
        if (i13 <= i15) {
            while (true) {
                char cCharAt = str.charAt(i15);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i15 + 1;
                }
                if (i15 != i13) {
                    i15--;
                }
            }
        }
        return i13;
    }

    public static final int zoijcleaow(byte b13, int i13) {
        return b13 & i13;
    }

    public static final int zynmafqrjb(bl.eablkybsjg eablkybsjgVar) {
        zdlpuopuiu.btonecajqb(eablkybsjgVar, "<this>");
        return zoijcleaow(eablkybsjgVar.readByte(), KotlinVersion.MAX_COMPONENT_VALUE) | (zoijcleaow(eablkybsjgVar.readByte(), KotlinVersion.MAX_COMPONENT_VALUE) << 16) | (zoijcleaow(eablkybsjgVar.readByte(), KotlinVersion.MAX_COMPONENT_VALUE) << 8);
    }
}
