package kotlin.jvm.internal;

import java.util.Arrays;
import kotlin.KotlinNullPointerException;
import kotlin.UninitializedPropertyAccessException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zdlpuopuiu {

    public static class iobyxmoadg {
    }

    private static String agtfadlqog(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = zdlpuopuiu.class.getName();
        int i13 = 0;
        while (!stackTrace[i13].getClassName().equals(name)) {
            i13++;
        }
        while (stackTrace[i13].getClassName().equals(name)) {
            i13++;
        }
        StackTraceElement stackTraceElement = stackTrace[i13];
        return "Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str;
    }

    public static void btonecajqb(Object obj, String str) {
        if (obj == null) {
            iwizpuwonk(str);
        }
    }

    public static void cqumvgiudr() {
        esjtqupxsv("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static int draadjrbmk(int i13, int i14) {
        if (i13 < i14) {
            return -1;
        }
        return i13 == i14 ? 0 : 1;
    }

    public static void dxjokdxxww(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((NullPointerException) rgvfuqvkyq(new NullPointerException(str + " must not be null")));
    }

    public static boolean eablkybsjg(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static void esjtqupxsv(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static void gtknphoqwx(Object obj, String str) {
        if (obj == null) {
            jyumaefscl(str);
        }
    }

    public static void gxszxtbevo(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((IllegalStateException) rgvfuqvkyq(new IllegalStateException(str + " must not be null")));
    }

    public static boolean iobyxmoadg(Double d13, double d14) {
        return d13 != null && d13.doubleValue() == d14;
    }

    private static void iwizpuwonk(String str) {
        throw ((NullPointerException) rgvfuqvkyq(new NullPointerException(agtfadlqog(str))));
    }

    private static void jyumaefscl(String str) {
        throw ((IllegalArgumentException) rgvfuqvkyq(new IllegalArgumentException(agtfadlqog(str))));
    }

    public static void kcexrzcfyt() {
        throw ((NullPointerException) rgvfuqvkyq(new NullPointerException()));
    }

    public static void lereixgezr(String str) {
        throw ((UninitializedPropertyAccessException) rgvfuqvkyq(new UninitializedPropertyAccessException(str)));
    }

    public static void lqeggnwhkg(Object obj) {
        if (obj == null) {
            kcexrzcfyt();
        }
    }

    public static void nufgyqmvbu(Object obj, String str) {
        if (obj == null) {
            zdlpuopuiu(str);
        }
    }

    public static void ojitshcjhn(int i13, String str) {
        cqumvgiudr();
    }

    public static String oxmwwwfdhm(String str, Object obj) {
        return str + obj;
    }

    public static void pmvmpeiblj(String str) {
        lereixgezr("lateinit property " + str + " has not been initialized");
    }

    public static boolean ppxfxbqfkf(Float f13, float f14) {
        return f13 != null && f13.floatValue() == f14;
    }

    private static Throwable rgvfuqvkyq(Throwable th2) {
        return vdvldrhtss(th2, zdlpuopuiu.class.getName());
    }

    static Throwable vdvldrhtss(Throwable th2, String str) {
        StackTraceElement[] stackTrace = th2.getStackTrace();
        int length = stackTrace.length;
        int i13 = -1;
        for (int i14 = 0; i14 < length; i14++) {
            if (str.equals(stackTrace[i14].getClassName())) {
                i13 = i14;
            }
        }
        th2.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i13 + 1, length));
        return th2;
    }

    public static int wflxmlrfwp(long j13, long j14) {
        if (j13 < j14) {
            return -1;
        }
        return j13 == j14 ? 0 : 1;
    }

    public static boolean wkgbmnqykc(Float f13, Float f14) {
        if (f13 == null) {
            if (f14 != null) {
                return false;
            }
        } else if (f14 == null || f13.floatValue() != f14.floatValue()) {
            return false;
        }
        return true;
    }

    public static void yggfygwlhe() {
        throw ((KotlinNullPointerException) rgvfuqvkyq(new KotlinNullPointerException()));
    }

    public static void zdlpuopuiu(String str) {
        throw ((NullPointerException) rgvfuqvkyq(new NullPointerException(str)));
    }

    public static boolean zoijcleaow(Double d13, Double d14) {
        if (d13 == null) {
            if (d14 != null) {
                return false;
            }
        } else if (d14 == null || d13.doubleValue() != d14.doubleValue()) {
            return false;
        }
        return true;
    }
}
