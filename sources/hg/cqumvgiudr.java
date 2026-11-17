package hg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class cqumvgiudr extends iwizpuwonk {
    public static zg.btonecajqb agtfadlqog(Collection collection) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(collection, "<this>");
        return new zg.btonecajqb(0, collection.size() - 1);
    }

    public static final int btonecajqb(List list, Comparable comparable, int i13, int i14) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(list, "<this>");
        yggfygwlhe(list.size(), i13, i14);
        int i15 = i14 - 1;
        while (i13 <= i15) {
            int i16 = (i13 + i15) >>> 1;
            int iWkgbmnqykc = kg.iobyxmoadg.wkgbmnqykc((Comparable) list.get(i16), comparable);
            if (iWkgbmnqykc < 0) {
                i13 = i16 + 1;
            } else {
                if (iWkgbmnqykc <= 0) {
                    return i16;
                }
                i15 = i16 - 1;
            }
        }
        return -(i13 + 1);
    }

    public static /* synthetic */ int draadjrbmk(List list, Comparable comparable, int i13, int i14, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            i13 = 0;
        }
        if ((i15 & 4) != 0) {
            i14 = list.size();
        }
        return btonecajqb(list, comparable, i13, i14);
    }

    public static final int dxjokdxxww(List list, int i13, int i14, tg.draadjrbmk comparison) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(list, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(comparison, "comparison");
        yggfygwlhe(list.size(), i13, i14);
        int i15 = i14 - 1;
        while (i13 <= i15) {
            int i16 = (i13 + i15) >>> 1;
            int iIntValue = ((Number) comparison.invoke(list.get(i16))).intValue();
            if (iIntValue < 0) {
                i13 = i16 + 1;
            } else {
                if (iIntValue <= 0) {
                    return i16;
                }
                i15 = i16 - 1;
            }
        }
        return -(i13 + 1);
    }

    public static /* synthetic */ int gtknphoqwx(List list, int i13, int i14, tg.draadjrbmk draadjrbmkVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i13 = 0;
        }
        if ((i15 & 2) != 0) {
            i14 = list.size();
        }
        return dxjokdxxww(list, i13, i14, draadjrbmkVar);
    }

    public static void iwizpuwonk() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static void jyumaefscl() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static List kcexrzcfyt(Object... elements) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
        return elements.length == 0 ? new ArrayList() : new ArrayList(new draadjrbmk(elements, true));
    }

    public static ArrayList lqeggnwhkg(Object... elements) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
        return elements.length == 0 ? new ArrayList() : new ArrayList(new draadjrbmk(elements, true));
    }

    public static final Collection nufgyqmvbu(Object[] objArr) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(objArr, "<this>");
        return new draadjrbmk(objArr, false);
    }

    public static int ojitshcjhn(List list) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(list, "<this>");
        return list.size() - 1;
    }

    public static List oxmwwwfdhm(Object... elements) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
        return agtfadlqog.metgxyhuhe(elements);
    }

    public static List rgvfuqvkyq(Object... elements) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
        return elements.length > 0 ? agtfadlqog.gxszxtbevo(elements) : jyumaefscl.wflxmlrfwp();
    }

    public static List vdvldrhtss(Object obj) {
        return obj != null ? jyumaefscl.eablkybsjg(obj) : jyumaefscl.wflxmlrfwp();
    }

    public static List wflxmlrfwp() {
        return pkzmftpjix.f40259zdlpuopuiu;
    }

    private static final void yggfygwlhe(int i13, int i14, int i15) {
        if (i14 > i15) {
            throw new IllegalArgumentException("fromIndex (" + i14 + ") is greater than toIndex (" + i15 + ").");
        }
        if (i14 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i14 + ") is less than zero.");
        }
        if (i15 <= i13) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i15 + ") is greater than size (" + i13 + ").");
    }

    public static final List zdlpuopuiu(List list) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(list, "<this>");
        int size = list.size();
        if (size != 0) {
            return size != 1 ? list : jyumaefscl.eablkybsjg(list.get(0));
        }
        return jyumaefscl.wflxmlrfwp();
    }
}
