package gg;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class kcexrzcfyt implements Serializable {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public static final iobyxmoadg f37117yggfygwlhe = new iobyxmoadg(null);

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Object f37118zdlpuopuiu;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public static final class zoijcleaow implements Serializable {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public final Throwable f37119zdlpuopuiu;

        public zoijcleaow(Throwable exception) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(exception, "exception");
            this.f37119zdlpuopuiu = exception;
        }

        public boolean equals(Object obj) {
            return (obj instanceof zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f37119zdlpuopuiu, ((zoijcleaow) obj).f37119zdlpuopuiu);
        }

        public int hashCode() {
            return this.f37119zdlpuopuiu.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f37119zdlpuopuiu + ')';
        }
    }

    private /* synthetic */ kcexrzcfyt(Object obj) {
        this.f37118zdlpuopuiu = obj;
    }

    public static final boolean agtfadlqog(Object obj) {
        return !(obj instanceof zoijcleaow);
    }

    public static int btonecajqb(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean draadjrbmk(Object obj) {
        return obj instanceof zoijcleaow;
    }

    public static final Throwable dxjokdxxww(Object obj) {
        if (obj instanceof zoijcleaow) {
            return ((zoijcleaow) obj).f37119zdlpuopuiu;
        }
        return null;
    }

    public static final /* synthetic */ kcexrzcfyt iobyxmoadg(Object obj) {
        return new kcexrzcfyt(obj);
    }

    public static boolean lqeggnwhkg(Object obj, Object obj2) {
        return (obj2 instanceof kcexrzcfyt) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(obj, ((kcexrzcfyt) obj2).rgvfuqvkyq());
    }

    public static final boolean nufgyqmvbu(Object obj, Object obj2) {
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(obj, obj2);
    }

    public static String ojitshcjhn(Object obj) {
        if (obj instanceof zoijcleaow) {
            return ((zoijcleaow) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    public static Object wkgbmnqykc(Object obj) {
        return obj;
    }

    public boolean equals(Object obj) {
        return lqeggnwhkg(this.f37118zdlpuopuiu, obj);
    }

    public int hashCode() {
        return btonecajqb(this.f37118zdlpuopuiu);
    }

    public final /* synthetic */ Object rgvfuqvkyq() {
        return this.f37118zdlpuopuiu;
    }

    public String toString() {
        return ojitshcjhn(this.f37118zdlpuopuiu);
    }
}
