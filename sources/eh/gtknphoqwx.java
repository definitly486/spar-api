package eh;

import hg.jyumaefscl;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gtknphoqwx implements nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Method f31320iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Type f31321ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f31322zoijcleaow;

    public static final class iobyxmoadg extends gtknphoqwx implements lqeggnwhkg {

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final Object f31323wkgbmnqykc;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(Method unboxMethod, Object obj) {
            super(unboxMethod, jyumaefscl.wflxmlrfwp(), null);
            zdlpuopuiu.btonecajqb(unboxMethod, "unboxMethod");
            this.f31323wkgbmnqykc = obj;
        }

        @Override // eh.nufgyqmvbu
        public Object call(Object[] args) {
            zdlpuopuiu.btonecajqb(args, "args");
            wkgbmnqykc(args);
            return ppxfxbqfkf(this.f31323wkgbmnqykc, args);
        }
    }

    public static final class zoijcleaow extends gtknphoqwx {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(Method unboxMethod) {
            super(unboxMethod, jyumaefscl.eablkybsjg(unboxMethod.getDeclaringClass()), null);
            zdlpuopuiu.btonecajqb(unboxMethod, "unboxMethod");
        }

        @Override // eh.nufgyqmvbu
        public Object call(Object[] args) {
            zdlpuopuiu.btonecajqb(args, "args");
            wkgbmnqykc(args);
            Object obj = args[0];
            dxjokdxxww.wkgbmnqykc wkgbmnqykcVar = dxjokdxxww.f31305eablkybsjg;
            return ppxfxbqfkf(obj, args.length <= 1 ? new Object[0] : hg.agtfadlqog.yggfygwlhe(args, 1, args.length));
        }
    }

    public /* synthetic */ gtknphoqwx(Method method, List list, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(method, list);
    }

    @Override // eh.nufgyqmvbu
    /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
    public final Method zoijcleaow() {
        return null;
    }

    @Override // eh.nufgyqmvbu
    public final Type getReturnType() {
        return this.f31321ppxfxbqfkf;
    }

    @Override // eh.nufgyqmvbu
    public final List iobyxmoadg() {
        return this.f31322zoijcleaow;
    }

    protected final Object ppxfxbqfkf(Object obj, Object[] args) {
        zdlpuopuiu.btonecajqb(args, "args");
        return this.f31320iobyxmoadg.invoke(obj, Arrays.copyOf(args, args.length));
    }

    public void wkgbmnqykc(Object[] objArr) {
        nufgyqmvbu.iobyxmoadg.iobyxmoadg(this, objArr);
    }

    private gtknphoqwx(Method method, List list) {
        this.f31320iobyxmoadg = method;
        this.f31322zoijcleaow = list;
        Class<?> returnType = method.getReturnType();
        zdlpuopuiu.dxjokdxxww(returnType, "getReturnType(...)");
        this.f31321ppxfxbqfkf = returnType;
    }
}
