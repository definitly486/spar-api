package fm;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ppxfxbqfkf {
    public static long btonecajqb(long j13, long j14) {
        long j15 = j13 + j14;
        if ((j13 ^ j15) >= 0 || (j13 ^ j14) < 0) {
            return j15;
        }
        throw new ArithmeticException("Addition overflows a long: " + j13 + " + " + j14);
    }

    public static long draadjrbmk(long j13, long j14) {
        long j15 = j13 - j14;
        if ((j13 ^ j15) >= 0 || (j13 ^ j14) >= 0) {
            return j15;
        }
        throw new ArithmeticException("Subtraction overflows a long: " + j13 + " - " + j14);
    }

    public static Object dxjokdxxww(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str + " must not be null");
    }

    public static long eablkybsjg(long j13, long j14) {
        return j13 >= 0 ? j13 / j14 : ((j13 + 1) / j14) - 1;
    }

    public static long gtknphoqwx(long j13, int i13) {
        if (i13 == -1) {
            if (j13 != Long.MIN_VALUE) {
                return -j13;
            }
            throw new ArithmeticException("Multiplication overflows a long: " + j13 + " * " + i13);
        }
        if (i13 == 0) {
            return 0L;
        }
        if (i13 == 1) {
            return j13;
        }
        long j14 = i13;
        long j15 = j13 * j14;
        if (j15 / j14 == j13) {
            return j15;
        }
        throw new ArithmeticException("Multiplication overflows a long: " + j13 + " * " + i13);
    }

    public static int gxszxtbevo(int i13, int i14) {
        return ((i13 % i14) + i14) % i14;
    }

    public static int iobyxmoadg(int i13, int i14) {
        if (i13 < i14) {
            return -1;
        }
        return i13 > i14 ? 1 : 0;
    }

    public static int lqeggnwhkg(long j13, int i13) {
        long j14 = i13;
        return (int) (((j13 % j14) + j14) % j14);
    }

    public static long nufgyqmvbu(long j13, long j14) {
        return ((j13 % j14) + j14) % j14;
    }

    public static boolean ppxfxbqfkf(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        if (obj2 == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    public static int wflxmlrfwp(long j13) {
        if (j13 <= 2147483647L && j13 >= -2147483648L) {
            return (int) j13;
        }
        throw new ArithmeticException("Calculation overflows an int: " + j13);
    }

    public static int wkgbmnqykc(int i13, int i14) {
        return i13 >= 0 ? i13 / i14 : ((i13 + 1) / i14) - 1;
    }

    public static int zoijcleaow(long j13, long j14) {
        if (j13 < j14) {
            return -1;
        }
        return j13 > j14 ? 1 : 0;
    }
}
