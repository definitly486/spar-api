package ph;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final ppxfxbqfkf f76598iobyxmoadg = new ppxfxbqfkf();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static iobyxmoadg f76599zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Method f76600iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final Method f76601zoijcleaow;

        public iobyxmoadg(Method method, Method method2) {
            this.f76600iobyxmoadg = method;
            this.f76601zoijcleaow = method2;
        }

        public final Method iobyxmoadg() {
            return this.f76601zoijcleaow;
        }

        public final Method zoijcleaow() {
            return this.f76600iobyxmoadg;
        }
    }

    private ppxfxbqfkf() {
    }

    public final iobyxmoadg iobyxmoadg(Member member) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(member, "member");
        Class<?> cls = member.getClass();
        try {
            return new iobyxmoadg(cls.getMethod("getParameters", null), gxszxtbevo.btonecajqb(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", null));
        } catch (NoSuchMethodException unused) {
            return new iobyxmoadg(null, null);
        }
    }

    public final List zoijcleaow(Member member) throws IllegalAccessException, InvocationTargetException {
        Method methodIobyxmoadg;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(member, "member");
        iobyxmoadg iobyxmoadgVarIobyxmoadg = f76599zoijcleaow;
        if (iobyxmoadgVarIobyxmoadg == null) {
            synchronized (this) {
                iobyxmoadgVarIobyxmoadg = f76599zoijcleaow;
                if (iobyxmoadgVarIobyxmoadg == null) {
                    iobyxmoadgVarIobyxmoadg = f76598iobyxmoadg.iobyxmoadg(member);
                    f76599zoijcleaow = iobyxmoadgVarIobyxmoadg;
                }
            }
        }
        Method methodZoijcleaow = iobyxmoadgVarIobyxmoadg.zoijcleaow();
        if (methodZoijcleaow == null || (methodIobyxmoadg = iobyxmoadgVarIobyxmoadg.iobyxmoadg()) == null) {
            return null;
        }
        Object objInvoke = methodZoijcleaow.invoke(member, null);
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(objInvoke, "null cannot be cast to non-null type kotlin.Array<*>");
        Object[] objArr = (Object[]) objInvoke;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            Object objInvoke2 = methodIobyxmoadg.invoke(obj, null);
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(objInvoke2, "null cannot be cast to non-null type kotlin.String");
            arrayList.add((String) objInvoke2);
        }
        return arrayList;
    }
}
