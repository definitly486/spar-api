package ph;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f76576iobyxmoadg = new iobyxmoadg();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static C1696iobyxmoadg f76577zoijcleaow;

    /* JADX INFO: renamed from: ph.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C1696iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Method f76578iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final Method f76579zoijcleaow;

        public C1696iobyxmoadg(Method method, Method method2) {
            this.f76578iobyxmoadg = method;
            this.f76579zoijcleaow = method2;
        }

        public final Method iobyxmoadg() {
            return this.f76579zoijcleaow;
        }

        public final Method zoijcleaow() {
            return this.f76578iobyxmoadg;
        }
    }

    private iobyxmoadg() {
    }

    private final C1696iobyxmoadg iobyxmoadg(Object obj) {
        Class<?> cls = obj.getClass();
        try {
            return new C1696iobyxmoadg(cls.getMethod("getType", null), cls.getMethod("getAccessor", null));
        } catch (NoSuchMethodException unused) {
            return new C1696iobyxmoadg(null, null);
        }
    }

    private final C1696iobyxmoadg zoijcleaow(Object obj) {
        C1696iobyxmoadg c1696iobyxmoadg = f76577zoijcleaow;
        if (c1696iobyxmoadg != null) {
            return c1696iobyxmoadg;
        }
        C1696iobyxmoadg c1696iobyxmoadgIobyxmoadg = iobyxmoadg(obj);
        f76577zoijcleaow = c1696iobyxmoadgIobyxmoadg;
        return c1696iobyxmoadgIobyxmoadg;
    }

    public final Method ppxfxbqfkf(Object recordComponent) throws IllegalAccessException, InvocationTargetException {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(recordComponent, "recordComponent");
        Method methodIobyxmoadg = zoijcleaow(recordComponent).iobyxmoadg();
        if (methodIobyxmoadg == null) {
            return null;
        }
        Object objInvoke = methodIobyxmoadg.invoke(recordComponent, null);
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(objInvoke, "null cannot be cast to non-null type java.lang.reflect.Method");
        return (Method) objInvoke;
    }

    public final Class wkgbmnqykc(Object recordComponent) throws IllegalAccessException, InvocationTargetException {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(recordComponent, "recordComponent");
        Method methodZoijcleaow = zoijcleaow(recordComponent).zoijcleaow();
        if (methodZoijcleaow == null) {
            return null;
        }
        Object objInvoke = methodZoijcleaow.invoke(recordComponent, null);
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(objInvoke, "null cannot be cast to non-null type java.lang.Class<*>");
        return (Class) objInvoke;
    }
}
