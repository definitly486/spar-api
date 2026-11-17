package xa;

/* JADX INFO: loaded from: classes2.dex */
public abstract class draadjrbmk {
    public static void agtfadlqog(int i13, int i14, int i15) {
        if (i13 < 0 || i14 < i13 || i14 > i15) {
            throw new IndexOutOfBoundsException(ppxfxbqfkf(i13, i14, i15));
        }
    }

    public static Object btonecajqb(Object obj) {
        obj.getClass();
        return obj;
    }

    public static int draadjrbmk(int i13, int i14) {
        return wflxmlrfwp(i13, i14, "index");
    }

    public static int dxjokdxxww(int i13, int i14, String str) {
        if (i13 < 0 || i13 >= i14) {
            throw new IndexOutOfBoundsException(iobyxmoadg(i13, i14, str));
        }
        return i13;
    }

    public static void eablkybsjg(boolean z13, Object obj) {
        if (!z13) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static Object gtknphoqwx(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    public static void gxszxtbevo(boolean z13, String str, int i13, int i14) {
        if (!z13) {
            throw new IllegalArgumentException(rgvfuqvkyq.zoijcleaow(str, Integer.valueOf(i13), Integer.valueOf(i14)));
        }
    }

    private static String iobyxmoadg(int i13, int i14, String str) {
        if (i13 < 0) {
            return rgvfuqvkyq.zoijcleaow("%s (%s) must not be negative", str, Integer.valueOf(i13));
        }
        if (i14 >= 0) {
            return rgvfuqvkyq.zoijcleaow("%s (%s) must be less than size (%s)", str, Integer.valueOf(i13), Integer.valueOf(i14));
        }
        throw new IllegalArgumentException("negative size: " + i14);
    }

    public static void lqeggnwhkg(boolean z13, String str, long j13) {
        if (!z13) {
            throw new IllegalArgumentException(rgvfuqvkyq.zoijcleaow(str, Long.valueOf(j13)));
        }
    }

    public static int nufgyqmvbu(int i13, int i14) {
        return dxjokdxxww(i13, i14, "index");
    }

    public static void ojitshcjhn(boolean z13) {
        if (!z13) {
            throw new IllegalStateException();
        }
    }

    private static String ppxfxbqfkf(int i13, int i14, int i15) {
        if (i13 < 0 || i13 > i15) {
            return zoijcleaow(i13, i15, "start index");
        }
        return (i14 < 0 || i14 > i15) ? zoijcleaow(i14, i15, "end index") : rgvfuqvkyq.zoijcleaow("end index (%s) must not be less than start index (%s)", Integer.valueOf(i14), Integer.valueOf(i13));
    }

    public static void rgvfuqvkyq(boolean z13, Object obj) {
        if (!z13) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static int wflxmlrfwp(int i13, int i14, String str) {
        if (i13 < 0 || i13 > i14) {
            throw new IndexOutOfBoundsException(zoijcleaow(i13, i14, str));
        }
        return i13;
    }

    public static void wkgbmnqykc(boolean z13) {
        if (!z13) {
            throw new IllegalArgumentException();
        }
    }

    private static String zoijcleaow(int i13, int i14, String str) {
        if (i13 < 0) {
            return rgvfuqvkyq.zoijcleaow("%s (%s) must not be negative", str, Integer.valueOf(i13));
        }
        if (i14 >= 0) {
            return rgvfuqvkyq.zoijcleaow("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i13), Integer.valueOf(i14));
        }
        throw new IllegalArgumentException("negative size: " + i14);
    }
}
