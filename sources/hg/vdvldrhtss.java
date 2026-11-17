package hg;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.SortedSet;
import java.util.TreeSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class vdvldrhtss extends rgvfuqvkyq {

    public static final class iobyxmoadg extends wkgbmnqykc implements RandomAccess {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ int[] f40265yggfygwlhe;

        iobyxmoadg(int[] iArr) {
            this.f40265yggfygwlhe = iArr;
        }

        public int agtfadlqog(int i13) {
            return kcexrzcfyt.nuxfzjnpeb(this.f40265yggfygwlhe, i13);
        }

        public boolean btonecajqb(int i13) {
            return agtfadlqog.jhduphickx(this.f40265yggfygwlhe, i13);
        }

        @Override // hg.zoijcleaow, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Integer) {
                return btonecajqb(((Number) obj).intValue());
            }
            return false;
        }

        @Override // hg.wkgbmnqykc, java.util.List
        /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
        public Integer get(int i13) {
            return Integer.valueOf(this.f40265yggfygwlhe[i13]);
        }

        @Override // hg.wkgbmnqykc, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Integer) {
                return agtfadlqog(((Number) obj).intValue());
            }
            return -1;
        }

        @Override // hg.zoijcleaow, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f40265yggfygwlhe.length == 0;
        }

        @Override // hg.wkgbmnqykc, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Integer) {
                return ojitshcjhn(((Number) obj).intValue());
            }
            return -1;
        }

        public int ojitshcjhn(int i13) {
            return kcexrzcfyt.fiwbwshyhd(this.f40265yggfygwlhe, i13);
        }

        @Override // hg.zoijcleaow
        public int wkgbmnqykc() {
            return this.f40265yggfygwlhe.length;
        }
    }

    public static Object[] agtfadlqog(Object[] objArr, Object[] destination, int i13, int i14, int i15) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(objArr, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(destination, "destination");
        System.arraycopy(objArr, i14, destination, i13, i15 - i14);
        return destination;
    }

    public static char[] btonecajqb(char[] cArr, char[] destination, int i13, int i14, int i15) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cArr, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(destination, "destination");
        System.arraycopy(cArr, i14, destination, i13, i15 - i14);
        return destination;
    }

    public static /* synthetic */ void cdpycssgdh(Object[] objArr, Object obj, int i13, int i14, int i15, Object obj2) {
        if ((i15 & 2) != 0) {
            i13 = 0;
        }
        if ((i15 & 4) != 0) {
            i14 = objArr.length;
        }
        agtfadlqog.lereixgezr(objArr, obj, i13, i14);
    }

    public static void cllcsxoeiz(int[] iArr, int i13, int i14) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iArr, "<this>");
        Arrays.sort(iArr, i13, i14);
    }

    public static final void cqumvgiudr(int[] iArr, int i13, int i14, int i15) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iArr, "<this>");
        Arrays.fill(iArr, i14, i15, i13);
    }

    public static int[] draadjrbmk(int[] iArr, int[] destination, int i13, int i14, int i15) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iArr, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(destination, "destination");
        System.arraycopy(iArr, i14, destination, i13, i15 - i14);
        return destination;
    }

    public static final void dsvhmnatus(Object[] objArr) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(objArr, "<this>");
        if (objArr.length > 1) {
            Arrays.sort(objArr);
        }
    }

    public static byte[] dxjokdxxww(byte[] bArr, byte[] destination, int i13, int i14, int i15) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bArr, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(destination, "destination");
        System.arraycopy(bArr, i14, destination, i13, i15 - i14);
        return destination;
    }

    public static List eablkybsjg(int[] iArr) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iArr, "<this>");
        return new iobyxmoadg(iArr);
    }

    public static void esjtqupxsv(long[] jArr, long j13, int i13, int i14) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(jArr, "<this>");
        Arrays.fill(jArr, i13, i14, j13);
    }

    public static float[] gtknphoqwx(float[] fArr, float[] destination, int i13, int i14, int i15) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fArr, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(destination, "destination");
        System.arraycopy(fArr, i14, destination, i13, i15 - i14);
        return destination;
    }

    public static List gxszxtbevo(Object[] objArr) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(objArr, "<this>");
        List listIobyxmoadg = zdlpuopuiu.iobyxmoadg(objArr);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(listIobyxmoadg, "asList(...)");
        return listIobyxmoadg;
    }

    public static Object[] hcddaimhww(Object[] objArr, Object[] elements) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(objArr, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
        int length = objArr.length;
        int length2 = elements.length;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, length + length2);
        System.arraycopy(elements, 0, objArrCopyOf, length, length2);
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(objArrCopyOf);
        return objArrCopyOf;
    }

    public static void hkdspvbjdz(int[] iArr) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iArr, "<this>");
        if (iArr.length > 1) {
            Arrays.sort(iArr);
        }
    }

    public static int[] iozdgvuglv(int[] iArr, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iArr, "<this>");
        int length = iArr.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
        iArrCopyOf[length] = i13;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(iArrCopyOf);
        return iArrCopyOf;
    }

    public static /* synthetic */ void istkbnxepw(long[] jArr, long j13, int i13, int i14, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            i13 = 0;
        }
        if ((i15 & 4) != 0) {
            i14 = jArr.length;
        }
        agtfadlqog.esjtqupxsv(jArr, j13, i13, i14);
    }

    public static final void iwizpuwonk(float[] fArr, float f13, int i13, int i14) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fArr, "<this>");
        Arrays.fill(fArr, i13, i14, f13);
    }

    public static boolean[] jpowsppfya(boolean[] zArr, boolean[] elements) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(zArr, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
        int length = zArr.length;
        int length2 = elements.length;
        boolean[] zArrCopyOf = Arrays.copyOf(zArr, length + length2);
        System.arraycopy(elements, 0, zArrCopyOf, length, length2);
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(zArrCopyOf);
        return zArrCopyOf;
    }

    public static void jyumaefscl(byte[] bArr, byte b13, int i13, int i14) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bArr, "<this>");
        Arrays.fill(bArr, i13, i14, b13);
    }

    public static /* synthetic */ Object[] kcexrzcfyt(Object[] objArr, Object[] objArr2, int i13, int i14, int i15, int i16, Object obj) {
        if ((i16 & 2) != 0) {
            i13 = 0;
        }
        if ((i16 & 4) != 0) {
            i14 = 0;
        }
        if ((i16 & 8) != 0) {
            i15 = objArr.length;
        }
        return agtfadlqog.agtfadlqog(objArr, objArr2, i13, i14, i15);
    }

    public static SortedSet kegysxyocb(Comparable[] comparableArr) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(comparableArr, "<this>");
        return (SortedSet) kcexrzcfyt.krqnebusok(comparableArr, new TreeSet());
    }

    public static void lereixgezr(Object[] objArr, Object obj, int i13, int i14) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(objArr, "<this>");
        Arrays.fill(objArr, i13, i14, obj);
    }

    public static int[] lmojexxdyd(int[] iArr, int[] elements) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iArr, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
        int length = iArr.length;
        int length2 = elements.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + length2);
        System.arraycopy(elements, 0, iArrCopyOf, length, length2);
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(iArrCopyOf);
        return iArrCopyOf;
    }

    public static final int lqeggnwhkg(float[] fArr, float f13, int i13, int i14) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fArr, "<this>");
        return Arrays.binarySearch(fArr, i13, i14, f13);
    }

    public static Float[] mbcevpiqjq(float[] fArr) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fArr, "<this>");
        Float[] fArr2 = new Float[fArr.length];
        int length = fArr.length;
        for (int i13 = 0; i13 < length; i13++) {
            fArr2[i13] = Float.valueOf(fArr[i13]);
        }
        return fArr2;
    }

    public static Integer[] ntlheqmsrt(int[] iArr) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iArr, "<this>");
        Integer[] numArr = new Integer[iArr.length];
        int length = iArr.length;
        for (int i13 = 0; i13 < length; i13++) {
            numArr[i13] = Integer.valueOf(iArr[i13]);
        }
        return numArr;
    }

    public static /* synthetic */ int nufgyqmvbu(float[] fArr, float f13, int i13, int i14, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            i13 = 0;
        }
        if ((i15 & 4) != 0) {
            i14 = fArr.length;
        }
        return lqeggnwhkg(fArr, f13, i13, i14);
    }

    public static /* synthetic */ byte[] ojitshcjhn(byte[] bArr, byte[] bArr2, int i13, int i14, int i15, int i16, Object obj) {
        if ((i16 & 2) != 0) {
            i13 = 0;
        }
        if ((i16 & 4) != 0) {
            i14 = 0;
        }
        if ((i16 & 8) != 0) {
            i15 = bArr.length;
        }
        return agtfadlqog.dxjokdxxww(bArr, bArr2, i13, i14, i15);
    }

    public static /* synthetic */ long[] oxmwwwfdhm(long[] jArr, long[] jArr2, int i13, int i14, int i15, int i16, Object obj) {
        if ((i16 & 2) != 0) {
            i13 = 0;
        }
        if ((i16 & 4) != 0) {
            i14 = 0;
        }
        if ((i16 & 8) != 0) {
            i15 = jArr.length;
        }
        return agtfadlqog.wflxmlrfwp(jArr, jArr2, i13, i14, i15);
    }

    public static Object[] pkzmftpjix(Object[] objArr, Collection elements) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(objArr, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
        int length = objArr.length;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, elements.size() + length);
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            objArrCopyOf[length] = it.next();
            length++;
        }
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(objArrCopyOf);
        return objArrCopyOf;
    }

    public static /* synthetic */ void pmvmpeiblj(float[] fArr, float f13, int i13, int i14, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            i13 = 0;
        }
        if ((i15 & 4) != 0) {
            i14 = fArr.length;
        }
        iwizpuwonk(fArr, f13, i13, i14);
    }

    public static /* synthetic */ float[] rgvfuqvkyq(float[] fArr, float[] fArr2, int i13, int i14, int i15, int i16, Object obj) {
        if ((i16 & 2) != 0) {
            i13 = 0;
        }
        if ((i16 & 4) != 0) {
            i14 = 0;
        }
        if ((i16 & 8) != 0) {
            i15 = fArr.length;
        }
        return agtfadlqog.gtknphoqwx(fArr, fArr2, i13, i14, i15);
    }

    public static void stevsuqkhv(Object[] objArr, Comparator comparator, int i13, int i14) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(objArr, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(comparator, "comparator");
        Arrays.sort(objArr, i13, i14, comparator);
    }

    public static Boolean[] tzroggbefp(boolean[] zArr) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(zArr, "<this>");
        Boolean[] boolArr = new Boolean[zArr.length];
        int length = zArr.length;
        for (int i13 = 0; i13 < length; i13++) {
            boolArr[i13] = Boolean.valueOf(zArr[i13]);
        }
        return boolArr;
    }

    public static Long[] ulzqkzuiru(long[] jArr) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(jArr, "<this>");
        Long[] lArr = new Long[jArr.length];
        int length = jArr.length;
        for (int i13 = 0; i13 < length; i13++) {
            lArr[i13] = Long.valueOf(jArr[i13]);
        }
        return lArr;
    }

    public static /* synthetic */ int[] vdvldrhtss(int[] iArr, int[] iArr2, int i13, int i14, int i15, int i16, Object obj) {
        if ((i16 & 2) != 0) {
            i13 = 0;
        }
        if ((i16 & 4) != 0) {
            i14 = 0;
        }
        if ((i16 & 8) != 0) {
            i15 = iArr.length;
        }
        return agtfadlqog.draadjrbmk(iArr, iArr2, i13, i14, i15);
    }

    public static long[] wflxmlrfwp(long[] jArr, long[] destination, int i13, int i14, int i15) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(jArr, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(destination, "destination");
        System.arraycopy(jArr, i14, destination, i13, i15 - i14);
        return destination;
    }

    public static long[] wwaezpbzkn(long[] jArr, long[] elements) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(jArr, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
        int length = jArr.length;
        int length2 = elements.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, length + length2);
        System.arraycopy(elements, 0, jArrCopyOf, length, length2);
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(jArrCopyOf);
        return jArrCopyOf;
    }

    public static void wypolnanlu(Object[] objArr, Comparator comparator) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(objArr, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(comparator, "comparator");
        if (objArr.length > 1) {
            Arrays.sort(objArr, comparator);
        }
    }

    public static float[] yadqdtsiqt(float[] fArr, float[] elements) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fArr, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
        int length = fArr.length;
        int length2 = elements.length;
        float[] fArrCopyOf = Arrays.copyOf(fArr, length + length2);
        System.arraycopy(elements, 0, fArrCopyOf, length, length2);
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(fArrCopyOf);
        return fArrCopyOf;
    }

    public static Object[] yggfygwlhe(Object[] objArr, int i13, int i14) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(objArr, "<this>");
        ojitshcjhn.ppxfxbqfkf(i14, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i13, i14);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    public static Object[] ylkuphrtab(Object[] objArr, Object obj) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(objArr, "<this>");
        int length = objArr.length;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, length + 1);
        objArrCopyOf[length] = obj;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(objArrCopyOf);
        return objArrCopyOf;
    }

    public static byte[] zdlpuopuiu(byte[] bArr, int i13, int i14) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bArr, "<this>");
        ojitshcjhn.ppxfxbqfkf(i14, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i13, i14);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(bArrCopyOfRange, "copyOfRange(...)");
        return bArrCopyOfRange;
    }

    public static /* synthetic */ void zynmafqrjb(int[] iArr, int i13, int i14, int i15, int i16, Object obj) {
        if ((i16 & 2) != 0) {
            i14 = 0;
        }
        if ((i16 & 4) != 0) {
            i15 = iArr.length;
        }
        cqumvgiudr(iArr, i13, i14, i15);
    }
}
