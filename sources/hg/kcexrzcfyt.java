package hg;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class kcexrzcfyt extends vdvldrhtss {

    public static final class iobyxmoadg implements Iterable, ug.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Object[] f40245zdlpuopuiu;

        public iobyxmoadg(Object[] objArr) {
            this.f40245zdlpuopuiu = objArr;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return kotlin.jvm.internal.ppxfxbqfkf.iobyxmoadg(this.f40245zdlpuopuiu);
        }
    }

    public static final class zoijcleaow implements lj.btonecajqb {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ Object[] f40246iobyxmoadg;

        public zoijcleaow(Object[] objArr) {
            this.f40246iobyxmoadg = objArr;
        }

        @Override // lj.btonecajqb
        public Iterator iterator() {
            return kotlin.jvm.internal.ppxfxbqfkf.iobyxmoadg(this.f40246iobyxmoadg);
        }
    }

    public static HashSet a(int[] iArr) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iArr, "<this>");
        return (HashSet) eslsurpljm(iArr, new HashSet(tzroggbefp.eablkybsjg(iArr.length)));
    }

    public static int ageimvtcrz(Object[] objArr, Object obj) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i13 = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i13 >= 0) {
                        length = i13;
                    }
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i14 = length2 - 1;
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(obj, objArr[length2])) {
                        return length2;
                    }
                    if (i14 < 0) {
                        break;
                    }
                    length2 = i14;
                }
            }
        }
        return -1;
    }

    public static final Appendable auzgnhcxok(byte[] bArr, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i13, CharSequence truncated, tg.draadjrbmk draadjrbmkVar) throws IOException {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bArr, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(buffer, "buffer");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(separator, "separator");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(prefix, "prefix");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(postfix, "postfix");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(truncated, "truncated");
        buffer.append(prefix);
        int i14 = 0;
        for (byte b13 : bArr) {
            i14++;
            if (i14 > 1) {
                buffer.append(separator);
            }
            if (i13 >= 0 && i14 > i13) {
                break;
            }
            if (draadjrbmkVar != null) {
                buffer.append((CharSequence) draadjrbmkVar.invoke(Byte.valueOf(b13)));
            } else {
                buffer.append(String.valueOf((int) b13));
            }
        }
        if (i13 >= 0 && i14 > i13) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static HashSet b(Object[] objArr) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(objArr, "<this>");
        return (HashSet) krqnebusok(objArr, new HashSet(tzroggbefp.eablkybsjg(objArr.length)));
    }

    public static int bfopjjpdmp(long[] jArr) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(jArr, "<this>");
        return jArr.length - 1;
    }

    public static List c(byte[] bArr) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bArr, "<this>");
        int length = bArr.length;
        if (length != 0) {
            return length != 1 ? l(bArr) : jyumaefscl.eablkybsjg(Byte.valueOf(bArr[0]));
        }
        return jyumaefscl.wflxmlrfwp();
    }

    public static Iterable crxdokpmqz(Object[] objArr) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(objArr, "<this>");
        return objArr.length == 0 ? jyumaefscl.wflxmlrfwp() : new iobyxmoadg(objArr);
    }

    public static float czzsidtyhn(float[] fArr) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fArr, "<this>");
        if (fArr.length != 0) {
            return fArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static List d(char[] cArr) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cArr, "<this>");
        int length = cArr.length;
        if (length != 0) {
            return length != 1 ? m(cArr) : jyumaefscl.eablkybsjg(Character.valueOf(cArr[0]));
        }
        return jyumaefscl.wflxmlrfwp();
    }

    public static List e(double[] dArr) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dArr, "<this>");
        int length = dArr.length;
        if (length != 0) {
            return length != 1 ? n(dArr) : jyumaefscl.eablkybsjg(Double.valueOf(dArr[0]));
        }
        return jyumaefscl.wflxmlrfwp();
    }

    public static final Collection eslsurpljm(int[] iArr, Collection destination) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iArr, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(destination, "destination");
        for (int i13 : iArr) {
            destination.add(Integer.valueOf(i13));
        }
        return destination;
    }

    public static List ezmngbhpjk(Object[] objArr, Comparator comparator) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(objArr, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(comparator, "comparator");
        return agtfadlqog.gxszxtbevo(fmlbqenlif(objArr, comparator));
    }

    public static List f(float[] fArr) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fArr, "<this>");
        int length = fArr.length;
        if (length != 0) {
            return length != 1 ? o(fArr) : jyumaefscl.eablkybsjg(Float.valueOf(fArr[0]));
        }
        return jyumaefscl.wflxmlrfwp();
    }

    public static final int fiwbwshyhd(int[] iArr, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iArr, "<this>");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i14 = length - 1;
                if (i13 == iArr[length]) {
                    return length;
                }
                if (i14 >= 0) {
                    length = i14;
                }
            }
        }
        return -1;
    }

    public static final Object[] fmlbqenlif(Object[] objArr, Comparator comparator) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(objArr, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(comparator, "comparator");
        if (objArr.length == 0) {
            return objArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(objArrCopyOf, "copyOf(...)");
        agtfadlqog.wypolnanlu(objArrCopyOf, comparator);
        return objArrCopyOf;
    }

    public static Object fyldjkxazc(Object[] objArr) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(objArr, "<this>");
        if (objArr.length == 0) {
            return null;
        }
        return objArr[objArr.length - 1];
    }

    public static List g(int[] iArr) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iArr, "<this>");
        int length = iArr.length;
        if (length != 0) {
            return length != 1 ? p(iArr) : jyumaefscl.eablkybsjg(Integer.valueOf(iArr[0]));
        }
        return jyumaefscl.wflxmlrfwp();
    }

    public static Comparable grlcpdaxtj(Comparable[] comparableArr) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(comparableArr, "<this>");
        if (comparableArr.length == 0) {
            return null;
        }
        Comparable comparable = comparableArr[0];
        int iOpjhrmiecq = agtfadlqog.opjhrmiecq(comparableArr);
        int i13 = 1;
        if (1 <= iOpjhrmiecq) {
            while (true) {
                Comparable comparable2 = comparableArr[i13];
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
                if (i13 == iOpjhrmiecq) {
                    break;
                }
                i13++;
            }
        }
        return comparable;
    }

    public static List h(long[] jArr) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(jArr, "<this>");
        int length = jArr.length;
        if (length != 0) {
            return length != 1 ? q(jArr) : jyumaefscl.eablkybsjg(Long.valueOf(jArr[0]));
        }
        return jyumaefscl.wflxmlrfwp();
    }

    public static Object hszhottldk(Object[] objArr) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[agtfadlqog.opjhrmiecq(objArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static List i(Object[] objArr) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(objArr, "<this>");
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? agtfadlqog.r(objArr) : jyumaefscl.eablkybsjg(objArr[0]);
        }
        return jyumaefscl.wflxmlrfwp();
    }

    public static String igdgnonuha(Object[] objArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i13, CharSequence truncated, tg.draadjrbmk draadjrbmkVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(objArr, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(separator, "separator");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(prefix, "prefix");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(postfix, "postfix");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(truncated, "truncated");
        return ((StringBuilder) iwxlajgraz(objArr, new StringBuilder(), separator, prefix, postfix, i13, truncated, draadjrbmkVar)).toString();
    }

    public static boolean ikoacuggdj(long[] jArr, long j13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(jArr, "<this>");
        return tbqsvytpvh(jArr, j13) >= 0;
    }

    public static List ipoelvxyzq(Object[] objArr, tg.draadjrbmk transform) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(objArr, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(transform, "transform");
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(transform.invoke(obj));
        }
        return arrayList;
    }

    public static final Appendable iwxlajgraz(Object[] objArr, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i13, CharSequence truncated, tg.draadjrbmk draadjrbmkVar) throws IOException {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(objArr, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(buffer, "buffer");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(separator, "separator");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(prefix, "prefix");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(postfix, "postfix");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(truncated, "truncated");
        buffer.append(prefix);
        int i14 = 0;
        for (Object obj : objArr) {
            i14++;
            if (i14 > 1) {
                buffer.append(separator);
            }
            if (i13 >= 0 && i14 > i13) {
                break;
            }
            mj.kcexrzcfyt.iobyxmoadg(buffer, obj, draadjrbmkVar);
        }
        if (i13 >= 0 && i14 > i13) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static Object ixidwrxhsl(Object[] objArr) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return objArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static Integer iyctptxqzt(int[] iArr, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iArr, "<this>");
        if (i13 < 0 || i13 >= iArr.length) {
            return null;
        }
        return Integer.valueOf(iArr[i13]);
    }

    public static List j(short[] sArr) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sArr, "<this>");
        int length = sArr.length;
        if (length != 0) {
            return length != 1 ? s(sArr) : jyumaefscl.eablkybsjg(Short.valueOf(sArr[0]));
        }
        return jyumaefscl.wflxmlrfwp();
    }

    public static boolean jhduphickx(int[] iArr, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iArr, "<this>");
        return nuxfzjnpeb(iArr, i13) >= 0;
    }

    public static lj.btonecajqb jlmebxxoox(Object[] objArr) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(objArr, "<this>");
        return objArr.length == 0 ? lj.wflxmlrfwp.dxjokdxxww() : new zoijcleaow(objArr);
    }

    public static Object jrbgnlbqoe(Object[] objArr) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(objArr, "<this>");
        if (objArr.length == 1) {
            return objArr[0];
        }
        return null;
    }

    public static boolean jztzpxfvev(short[] sArr, short s13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sArr, "<this>");
        return uawqvzlxes(sArr, s13) >= 0;
    }

    public static List k(boolean[] zArr) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(zArr, "<this>");
        int length = zArr.length;
        if (length != 0) {
            return length != 1 ? t(zArr) : jyumaefscl.eablkybsjg(Boolean.valueOf(zArr[0]));
        }
        return jyumaefscl.wflxmlrfwp();
    }

    public static final Collection krqnebusok(Object[] objArr, Collection destination) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(objArr, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(destination, "destination");
        for (Object obj : objArr) {
            destination.add(obj);
        }
        return destination;
    }

    public static final List l(byte[] bArr) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bArr, "<this>");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b13 : bArr) {
            arrayList.add(Byte.valueOf(b13));
        }
        return arrayList;
    }

    public static final int lrnfpwlwnk(byte[] bArr, byte b13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bArr, "<this>");
        int length = bArr.length;
        for (int i13 = 0; i13 < length; i13++) {
            if (b13 == bArr[i13]) {
                return i13;
            }
        }
        return -1;
    }

    public static /* synthetic */ String lxfrhoxuzk(byte[] bArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i13, CharSequence charSequence4, tg.draadjrbmk draadjrbmkVar, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i14 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i14 & 4) == 0 ? charSequence3 : "";
        if ((i14 & 8) != 0) {
            i13 = -1;
        }
        int i15 = i13;
        if ((i14 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i14 & 32) != 0) {
            draadjrbmkVar = null;
        }
        return skhdrjzrfn(bArr, charSequence, charSequence5, charSequence6, i15, charSequence7, draadjrbmkVar);
    }

    public static final List m(char[] cArr) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cArr, "<this>");
        ArrayList arrayList = new ArrayList(cArr.length);
        for (char c13 : cArr) {
            arrayList.add(Character.valueOf(c13));
        }
        return arrayList;
    }

    public static List metgxyhuhe(Object[] objArr) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(objArr, "<this>");
        return (List) rlfsiqarku(objArr, new ArrayList());
    }

    public static char mhtqkkgtqm(char[] cArr) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static final List n(double[] dArr) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dArr, "<this>");
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d13 : dArr) {
            arrayList.add(Double.valueOf(d13));
        }
        return arrayList;
    }

    public static final int nuxfzjnpeb(int[] iArr, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iArr, "<this>");
        int length = iArr.length;
        for (int i14 = 0; i14 < length; i14++) {
            if (i13 == iArr[i14]) {
                return i14;
            }
        }
        return -1;
    }

    public static final List o(float[] fArr) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fArr, "<this>");
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f13 : fArr) {
            arrayList.add(Float.valueOf(f13));
        }
        return arrayList;
    }

    public static int oipsdeybqn(int[] iArr) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iArr, "<this>");
        return iArr.length - 1;
    }

    public static boolean okpsazkaxt(Object[] objArr, Object obj) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(objArr, "<this>");
        return agtfadlqog.roivzttewh(objArr, obj) >= 0;
    }

    public static int opjhrmiecq(Object[] objArr) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(objArr, "<this>");
        return objArr.length - 1;
    }

    public static final List p(int[] iArr) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i13 : iArr) {
            arrayList.add(Integer.valueOf(i13));
        }
        return arrayList;
    }

    public static final List q(long[] jArr) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(jArr, "<this>");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j13 : jArr) {
            arrayList.add(Long.valueOf(j13));
        }
        return arrayList;
    }

    public static List r(Object[] objArr) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(objArr, "<this>");
        return new ArrayList(cqumvgiudr.nufgyqmvbu(objArr));
    }

    public static int rhgxfdycjh(int[] iArr) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iArr, "<this>");
        int i13 = 0;
        for (int i14 : iArr) {
            i13 += i14;
        }
        return i13;
    }

    public static boolean ribwqtqdhb(byte[] bArr, byte b13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bArr, "<this>");
        return lrnfpwlwnk(bArr, b13) >= 0;
    }

    public static final Collection rlfsiqarku(Object[] objArr, Collection destination) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(objArr, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(destination, "destination");
        for (Object obj : objArr) {
            if (obj != null) {
                destination.add(obj);
            }
        }
        return destination;
    }

    public static int roivzttewh(Object[] objArr, Object obj) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(objArr, "<this>");
        int i13 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i13 < length) {
                if (objArr[i13] == null) {
                    return i13;
                }
                i13++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i13 < length2) {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(obj, objArr[i13])) {
                return i13;
            }
            i13++;
        }
        return -1;
    }

    public static final List s(short[] sArr) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sArr, "<this>");
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s13 : sArr) {
            arrayList.add(Short.valueOf(s13));
        }
        return arrayList;
    }

    public static zg.btonecajqb sflfametgt(int[] iArr) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iArr, "<this>");
        return new zg.btonecajqb(0, agtfadlqog.oipsdeybqn(iArr));
    }

    public static final String skhdrjzrfn(byte[] bArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i13, CharSequence truncated, tg.draadjrbmk draadjrbmkVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bArr, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(separator, "separator");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(prefix, "prefix");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(postfix, "postfix");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(truncated, "truncated");
        return ((StringBuilder) auzgnhcxok(bArr, new StringBuilder(), separator, prefix, postfix, i13, truncated, draadjrbmkVar)).toString();
    }

    public static final List t(boolean[] zArr) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(zArr, "<this>");
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z13 : zArr) {
            arrayList.add(Boolean.valueOf(z13));
        }
        return arrayList;
    }

    public static final int tbqsvytpvh(long[] jArr, long j13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(jArr, "<this>");
        int length = jArr.length;
        for (int i13 = 0; i13 < length; i13++) {
            if (j13 == jArr[i13]) {
                return i13;
            }
        }
        return -1;
    }

    public static Set u(Object[] objArr) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(objArr, "<this>");
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? (Set) krqnebusok(objArr, new LinkedHashSet(tzroggbefp.eablkybsjg(objArr.length))) : ikoacuggdj.wkgbmnqykc(objArr[0]);
        }
        return ikoacuggdj.eablkybsjg();
    }

    public static final int uawqvzlxes(short[] sArr, short s13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sArr, "<this>");
        int length = sArr.length;
        for (int i13 = 0; i13 < length; i13++) {
            if (s13 == sArr[i13]) {
                return i13;
            }
        }
        return -1;
    }

    public static int uwvvkdfqfp(int[] iArr) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iArr, "<this>");
        if (iArr.length != 0) {
            return iArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static Iterable v(final Object[] objArr) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(objArr, "<this>");
        return new dsvhmnatus(new tg.iobyxmoadg() { // from class: hg.oxmwwwfdhm
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return kcexrzcfyt.w(objArr);
            }
        });
    }

    public static boolean vipkmwdibw(char[] cArr, char c13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cArr, "<this>");
        return zeieaojujs(cArr, c13) >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterator w(Object[] objArr) {
        return kotlin.jvm.internal.ppxfxbqfkf.iobyxmoadg(objArr);
    }

    public static Object weqkydbzbr(Object[] objArr, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(objArr, "<this>");
        if (i13 < 0 || i13 >= objArr.length) {
            return null;
        }
        return objArr[i13];
    }

    public static /* synthetic */ String wizcaqwiak(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i13, CharSequence charSequence4, tg.draadjrbmk draadjrbmkVar, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i14 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i14 & 4) == 0 ? charSequence3 : "";
        if ((i14 & 8) != 0) {
            i13 = -1;
        }
        int i15 = i13;
        if ((i14 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i14 & 32) != 0) {
            draadjrbmkVar = null;
        }
        return agtfadlqog.igdgnonuha(objArr, charSequence, charSequence5, charSequence6, i15, charSequence7, draadjrbmkVar);
    }

    public static List x(int[] iArr, Object[] other) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iArr, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(other, "other");
        int iMin = Math.min(iArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i13 = 0; i13 < iMin; i13++) {
            int i14 = iArr[i13];
            arrayList.add(gg.cqumvgiudr.iobyxmoadg(Integer.valueOf(i14), other[i13]));
        }
        return arrayList;
    }

    public static List xrmfcynszj(Object[] objArr, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(objArr, "<this>");
        if (i13 >= 0) {
            return yzdjzghtvl(objArr, zg.gtknphoqwx.gxszxtbevo(objArr.length - i13, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i13 + " is less than zero.").toString());
    }

    public static List y(Object[] objArr, Iterable other) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(objArr, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(other, "other");
        int length = objArr.length;
        ArrayList arrayList = new ArrayList(Math.min(jyumaefscl.cqumvgiudr(other, 10), length));
        int i13 = 0;
        for (Object obj : other) {
            if (i13 >= length) {
                break;
            }
            arrayList.add(gg.cqumvgiudr.iobyxmoadg(objArr[i13], obj));
            i13++;
        }
        return arrayList;
    }

    public static Object ydmasvzmpa(Object[] objArr) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(objArr, "<this>");
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    public static Object yfnezrywwk(Object[] objArr) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final List yzdjzghtvl(Object[] objArr, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(objArr, "<this>");
        if (i13 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i13 + " is less than zero.").toString());
        }
        if (i13 == 0) {
            return jyumaefscl.wflxmlrfwp();
        }
        int length = objArr.length;
        if (i13 >= length) {
            return agtfadlqog.i(objArr);
        }
        if (i13 == 1) {
            return jyumaefscl.eablkybsjg(objArr[length - 1]);
        }
        ArrayList arrayList = new ArrayList(i13);
        for (int i14 = length - i13; i14 < length; i14++) {
            arrayList.add(objArr[i14]);
        }
        return arrayList;
    }

    public static List z(Object[] objArr, Object[] other) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(objArr, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(other, "other");
        int iMin = Math.min(objArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i13 = 0; i13 < iMin; i13++) {
            arrayList.add(gg.cqumvgiudr.iobyxmoadg(objArr[i13], other[i13]));
        }
        return arrayList;
    }

    public static final int zeieaojujs(char[] cArr, char c13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cArr, "<this>");
        int length = cArr.length;
        for (int i13 = 0; i13 < length; i13++) {
            if (c13 == cArr[i13]) {
                return i13;
            }
        }
        return -1;
    }

    public static zg.btonecajqb zfvoamnweg(Object[] objArr) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(objArr, "<this>");
        return new zg.btonecajqb(0, agtfadlqog.opjhrmiecq(objArr));
    }
}
