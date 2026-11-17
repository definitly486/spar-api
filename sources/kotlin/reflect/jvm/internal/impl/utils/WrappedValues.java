package kotlin.reflect.jvm.internal.impl.utils;

import jj.wkgbmnqykc;

/* JADX INFO: loaded from: classes3.dex */
public abstract class WrappedValues {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final Object f60187iobyxmoadg = new iobyxmoadg();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static volatile boolean f60188zoijcleaow = false;

    public static class WrappedProcessCanceledException extends RuntimeException {
        public WrappedProcessCanceledException(Throwable th2) {
            super("Rethrow stored exception", th2);
        }
    }

    static class iobyxmoadg {
        iobyxmoadg() {
        }

        public String toString() {
            return "NULL_VALUE";
        }
    }

    private static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f60189iobyxmoadg;

        /* synthetic */ zoijcleaow(Throwable th2, iobyxmoadg iobyxmoadgVar) {
            this(th2);
        }

        private static /* synthetic */ void iobyxmoadg(int i13) {
            String str = i13 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i13 != 1 ? 3 : 2];
            if (i13 != 1) {
                objArr[0] = "throwable";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
            }
            if (i13 != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
            } else {
                objArr[1] = "getThrowable";
            }
            if (i13 != 1) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i13 == 1) {
                throw new IllegalStateException(str2);
            }
        }

        public String toString() {
            return this.f60189iobyxmoadg.toString();
        }

        public Throwable zoijcleaow() {
            Throwable th2 = this.f60189iobyxmoadg;
            if (th2 == null) {
                iobyxmoadg(1);
            }
            return th2;
        }

        private zoijcleaow(Throwable th2) {
            if (th2 == null) {
                iobyxmoadg(0);
            }
            this.f60189iobyxmoadg = th2;
        }
    }

    public static Object eablkybsjg(Object obj) {
        if (obj == null) {
            iobyxmoadg(0);
        }
        if (obj == f60187iobyxmoadg) {
            return null;
        }
        return obj;
    }

    public static Object gxszxtbevo(Object obj) {
        if (!(obj instanceof zoijcleaow)) {
            return obj;
        }
        Throwable thZoijcleaow = ((zoijcleaow) obj).zoijcleaow();
        if (f60188zoijcleaow && wkgbmnqykc.iobyxmoadg(thZoijcleaow)) {
            throw new WrappedProcessCanceledException(thZoijcleaow);
        }
        throw wkgbmnqykc.zoijcleaow(thZoijcleaow);
    }

    private static /* synthetic */ void iobyxmoadg(int i13) {
        String str = (i13 == 1 || i13 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i13 == 1 || i13 == 2) ? 2 : 3];
        if (i13 == 1 || i13 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues";
        } else if (i13 != 3) {
            objArr[0] = "value";
        } else {
            objArr[0] = "throwable";
        }
        if (i13 == 1 || i13 == 2) {
            objArr[1] = "escapeNull";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues";
        }
        if (i13 != 1 && i13 != 2) {
            if (i13 == 3) {
                objArr[2] = "escapeThrowable";
            } else if (i13 != 4) {
                objArr[2] = "unescapeNull";
            } else {
                objArr[2] = "unescapeExceptionOrNull";
            }
        }
        String str2 = String.format(str, objArr);
        if (i13 != 1 && i13 != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static Object ppxfxbqfkf(Throwable th2) {
        if (th2 == null) {
            iobyxmoadg(3);
        }
        return new zoijcleaow(th2, null);
    }

    public static Object wkgbmnqykc(Object obj) {
        if (obj == null) {
            iobyxmoadg(4);
        }
        return eablkybsjg(gxszxtbevo(obj));
    }

    public static Object zoijcleaow(Object obj) {
        if (obj == null && (obj = f60187iobyxmoadg) == null) {
            iobyxmoadg(1);
        }
        return obj;
    }
}
