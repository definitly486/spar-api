package pg;

import hg.agtfadlqog;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public abstract class iobyxmoadg extends og.iobyxmoadg {

    /* JADX INFO: renamed from: pg.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    private static final class C1694iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C1694iobyxmoadg f76555iobyxmoadg = new C1694iobyxmoadg();

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final Integer f76556zoijcleaow;

        static {
            Integer num;
            Integer num2 = null;
            try {
                Object obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
                num = obj instanceof Integer ? (Integer) obj : null;
            } catch (Throwable unused) {
            }
            if (num != null && num.intValue() > 0) {
                num2 = num;
            }
            f76556zoijcleaow = num2;
        }

        private C1694iobyxmoadg() {
        }
    }

    private final boolean wkgbmnqykc(int i13) {
        Integer num = C1694iobyxmoadg.f76556zoijcleaow;
        return num == null || num.intValue() >= i13;
    }

    @Override // og.iobyxmoadg
    public void iobyxmoadg(Throwable cause, Throwable exception) throws IllegalAccessException, InvocationTargetException {
        zdlpuopuiu.btonecajqb(cause, "cause");
        zdlpuopuiu.btonecajqb(exception, "exception");
        if (wkgbmnqykc(19)) {
            cause.addSuppressed(exception);
        } else {
            super.iobyxmoadg(cause, exception);
        }
    }

    @Override // og.iobyxmoadg
    public List ppxfxbqfkf(Throwable exception) {
        zdlpuopuiu.btonecajqb(exception, "exception");
        if (!wkgbmnqykc(19)) {
            return super.ppxfxbqfkf(exception);
        }
        Throwable[] suppressed = exception.getSuppressed();
        zdlpuopuiu.dxjokdxxww(suppressed, "getSuppressed(...)");
        return agtfadlqog.gxszxtbevo(suppressed);
    }
}
