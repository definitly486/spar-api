package dh;

import java.lang.ref.SoftReference;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e {

    public static class iobyxmoadg extends zoijcleaow implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private volatile SoftReference f28186jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final tg.iobyxmoadg f28187yggfygwlhe;

        public iobyxmoadg(Object obj, tg.iobyxmoadg iobyxmoadgVar) {
            if (iobyxmoadgVar == null) {
                eablkybsjg(0);
            }
            this.f28186jyumaefscl = null;
            this.f28187yggfygwlhe = iobyxmoadgVar;
            if (obj != null) {
                this.f28186jyumaefscl = new SoftReference(iobyxmoadg(obj));
            }
        }

        private static /* synthetic */ void eablkybsjg(int i13) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal", "<init>"));
        }

        @Override // dh.e.zoijcleaow, tg.iobyxmoadg
        public Object invoke() {
            Object obj;
            SoftReference softReference = this.f28186jyumaefscl;
            if (softReference != null && (obj = softReference.get()) != null) {
                return ppxfxbqfkf(obj);
            }
            Object objInvoke = this.f28187yggfygwlhe.invoke();
            this.f28186jyumaefscl = new SoftReference(iobyxmoadg(objInvoke));
            return objInvoke;
        }
    }

    public static abstract class zoijcleaow {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private static final Object f28188zdlpuopuiu = new iobyxmoadg();

        static class iobyxmoadg {
            iobyxmoadg() {
            }
        }

        public abstract Object invoke();

        protected Object iobyxmoadg(Object obj) {
            return obj == null ? f28188zdlpuopuiu : obj;
        }

        protected Object ppxfxbqfkf(Object obj) {
            if (obj == f28188zdlpuopuiu) {
                return null;
            }
            return obj;
        }

        public final Object zoijcleaow(Object obj, Object obj2) {
            return invoke();
        }
    }

    private static /* synthetic */ void iobyxmoadg(int i13) {
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties", "lazySoft"));
    }

    public static iobyxmoadg ppxfxbqfkf(tg.iobyxmoadg iobyxmoadgVar) {
        if (iobyxmoadgVar == null) {
            iobyxmoadg(1);
        }
        return zoijcleaow(null, iobyxmoadgVar);
    }

    public static iobyxmoadg zoijcleaow(Object obj, tg.iobyxmoadg iobyxmoadgVar) {
        if (iobyxmoadgVar == null) {
            iobyxmoadg(0);
        }
        return new iobyxmoadg(obj, iobyxmoadgVar);
    }
}
