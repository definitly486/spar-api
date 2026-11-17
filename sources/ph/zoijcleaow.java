package ph;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final zoijcleaow f76619iobyxmoadg = new zoijcleaow();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static iobyxmoadg f76620zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Method f76621iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final Method f76622ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final Method f76623wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final Method f76624zoijcleaow;

        public iobyxmoadg(Method method, Method method2, Method method3, Method method4) {
            this.f76621iobyxmoadg = method;
            this.f76624zoijcleaow = method2;
            this.f76622ppxfxbqfkf = method3;
            this.f76623wkgbmnqykc = method4;
        }

        public final Method iobyxmoadg() {
            return this.f76624zoijcleaow;
        }

        public final Method ppxfxbqfkf() {
            return this.f76622ppxfxbqfkf;
        }

        public final Method wkgbmnqykc() {
            return this.f76621iobyxmoadg;
        }

        public final Method zoijcleaow() {
            return this.f76623wkgbmnqykc;
        }
    }

    private zoijcleaow() {
    }

    private final iobyxmoadg iobyxmoadg() {
        try {
            return new iobyxmoadg(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null));
        } catch (NoSuchMethodException unused) {
            return new iobyxmoadg(null, null, null, null);
        }
    }

    private final iobyxmoadg zoijcleaow() {
        iobyxmoadg iobyxmoadgVar = f76620zoijcleaow;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        iobyxmoadg iobyxmoadgVarIobyxmoadg = iobyxmoadg();
        f76620zoijcleaow = iobyxmoadgVarIobyxmoadg;
        return iobyxmoadgVarIobyxmoadg;
    }

    public final Boolean eablkybsjg(Class clazz) throws IllegalAccessException, InvocationTargetException {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(clazz, "clazz");
        Method methodPpxfxbqfkf = zoijcleaow().ppxfxbqfkf();
        if (methodPpxfxbqfkf == null) {
            return null;
        }
        Object objInvoke = methodPpxfxbqfkf.invoke(clazz, null);
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
        return (Boolean) objInvoke;
    }

    public final Boolean gxszxtbevo(Class clazz) throws IllegalAccessException, InvocationTargetException {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(clazz, "clazz");
        Method methodWkgbmnqykc = zoijcleaow().wkgbmnqykc();
        if (methodWkgbmnqykc == null) {
            return null;
        }
        Object objInvoke = methodWkgbmnqykc.invoke(clazz, null);
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
        return (Boolean) objInvoke;
    }

    public final Class[] ppxfxbqfkf(Class clazz) throws IllegalAccessException, InvocationTargetException {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(clazz, "clazz");
        Method methodIobyxmoadg = zoijcleaow().iobyxmoadg();
        if (methodIobyxmoadg == null) {
            return null;
        }
        Object objInvoke = methodIobyxmoadg.invoke(clazz, null);
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(objInvoke, "null cannot be cast to non-null type kotlin.Array<java.lang.Class<*>>");
        return (Class[]) objInvoke;
    }

    public final Object[] wkgbmnqykc(Class clazz) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(clazz, "clazz");
        Method methodZoijcleaow = zoijcleaow().zoijcleaow();
        if (methodZoijcleaow == null) {
            return null;
        }
        return (Object[]) methodZoijcleaow.invoke(clazz, null);
    }
}
