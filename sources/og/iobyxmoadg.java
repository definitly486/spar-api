package og;

import hg.agtfadlqog;
import hg.jyumaefscl;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: og.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    private static final class C1582iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C1582iobyxmoadg f72826iobyxmoadg = new C1582iobyxmoadg();

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final Method f72827ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final Method f72828zoijcleaow;

        static {
            Method method;
            Method method2;
            Method[] methods = Throwable.class.getMethods();
            zdlpuopuiu.lqeggnwhkg(methods);
            int length = methods.length;
            int i13 = 0;
            while (true) {
                method = null;
                if (i13 >= length) {
                    method2 = null;
                    break;
                }
                method2 = methods[i13];
                if (zdlpuopuiu.eablkybsjg(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    zdlpuopuiu.dxjokdxxww(parameterTypes, "getParameterTypes(...)");
                    if (zdlpuopuiu.eablkybsjg(agtfadlqog.jrbgnlbqoe(parameterTypes), Throwable.class)) {
                        break;
                    }
                }
                i13++;
            }
            f72828zoijcleaow = method2;
            for (Method method3 : methods) {
                if (zdlpuopuiu.eablkybsjg(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
            }
            f72827ppxfxbqfkf = method;
        }

        private C1582iobyxmoadg() {
        }
    }

    public void iobyxmoadg(Throwable cause, Throwable exception) throws IllegalAccessException, InvocationTargetException {
        zdlpuopuiu.btonecajqb(cause, "cause");
        zdlpuopuiu.btonecajqb(exception, "exception");
        Method method = C1582iobyxmoadg.f72828zoijcleaow;
        if (method != null) {
            method.invoke(cause, exception);
        }
    }

    public List ppxfxbqfkf(Throwable exception) {
        Object objInvoke;
        List listGxszxtbevo;
        zdlpuopuiu.btonecajqb(exception, "exception");
        Method method = C1582iobyxmoadg.f72827ppxfxbqfkf;
        return (method == null || (objInvoke = method.invoke(exception, null)) == null || (listGxszxtbevo = agtfadlqog.gxszxtbevo((Throwable[]) objInvoke)) == null) ? jyumaefscl.wflxmlrfwp() : listGxszxtbevo;
    }

    public xg.ppxfxbqfkf zoijcleaow() {
        return new xg.zoijcleaow();
    }
}
