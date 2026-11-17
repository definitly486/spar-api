package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Method;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;

/* JADX INFO: loaded from: classes3.dex */
final class dxjokdxxww {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static iobyxmoadg f59990ppxfxbqfkf;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final dxjokdxxww f59989iobyxmoadg = new dxjokdxxww();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final iobyxmoadg f59991zoijcleaow = new iobyxmoadg(null, null, null);

    private static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final Method f59992iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public final Method f59993ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final Method f59994zoijcleaow;

        public iobyxmoadg(Method method, Method method2, Method method3) {
            this.f59992iobyxmoadg = method;
            this.f59994zoijcleaow = method2;
            this.f59993ppxfxbqfkf = method3;
        }
    }

    private dxjokdxxww() {
    }

    private final iobyxmoadg iobyxmoadg(kotlin.coroutines.jvm.internal.iobyxmoadg iobyxmoadgVar) {
        try {
            iobyxmoadg iobyxmoadgVar2 = new iobyxmoadg(Class.class.getDeclaredMethod("getModule", null), iobyxmoadgVar.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), iobyxmoadgVar.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod(ExternalMetricsManagerImpl.NAME, null));
            f59990ppxfxbqfkf = iobyxmoadgVar2;
            return iobyxmoadgVar2;
        } catch (Exception unused) {
            iobyxmoadg iobyxmoadgVar3 = f59991zoijcleaow;
            f59990ppxfxbqfkf = iobyxmoadgVar3;
            return iobyxmoadgVar3;
        }
    }

    public final String zoijcleaow(kotlin.coroutines.jvm.internal.iobyxmoadg continuation) {
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        zdlpuopuiu.btonecajqb(continuation, "continuation");
        iobyxmoadg iobyxmoadgVarIobyxmoadg = f59990ppxfxbqfkf;
        if (iobyxmoadgVarIobyxmoadg == null) {
            iobyxmoadgVarIobyxmoadg = iobyxmoadg(continuation);
        }
        if (iobyxmoadgVarIobyxmoadg == f59991zoijcleaow || (method = iobyxmoadgVarIobyxmoadg.f59992iobyxmoadg) == null || (objInvoke = method.invoke(continuation.getClass(), null)) == null || (method2 = iobyxmoadgVarIobyxmoadg.f59994zoijcleaow) == null || (objInvoke2 = method2.invoke(objInvoke, null)) == null) {
            return null;
        }
        Method method3 = iobyxmoadgVarIobyxmoadg.f59993ppxfxbqfkf;
        Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
        if (objInvoke3 instanceof String) {
            return (String) objInvoke3;
        }
        return null;
    }
}
