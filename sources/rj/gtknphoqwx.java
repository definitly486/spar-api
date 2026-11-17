package rj;

/* JADX INFO: loaded from: classes3.dex */
public final class gtknphoqwx {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Object f82881iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final zoijcleaow f82880zoijcleaow = new zoijcleaow(null);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final ppxfxbqfkf f82879ppxfxbqfkf = new ppxfxbqfkf();

    public static final class iobyxmoadg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final Throwable f82882iobyxmoadg;

        public iobyxmoadg(Throwable th2) {
            this.f82882iobyxmoadg = th2;
        }

        public boolean equals(Object obj) {
            return (obj instanceof iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f82882iobyxmoadg, ((iobyxmoadg) obj).f82882iobyxmoadg);
        }

        public int hashCode() {
            Throwable th2 = this.f82882iobyxmoadg;
            if (th2 != null) {
                return th2.hashCode();
            }
            return 0;
        }

        @Override // rj.gtknphoqwx.ppxfxbqfkf
        public String toString() {
            return "Closed(" + this.f82882iobyxmoadg + ')';
        }
    }

    public static class ppxfxbqfkf {
        public String toString() {
            return "Failed";
        }
    }

    public static final class zoijcleaow {
        public /* synthetic */ zoijcleaow(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final Object iobyxmoadg(Throwable th2) {
            return gtknphoqwx.ppxfxbqfkf(new iobyxmoadg(th2));
        }

        public final Object ppxfxbqfkf(Object obj) {
            return gtknphoqwx.ppxfxbqfkf(obj);
        }

        public final Object zoijcleaow() {
            return gtknphoqwx.ppxfxbqfkf(gtknphoqwx.f82879ppxfxbqfkf);
        }

        private zoijcleaow() {
        }
    }

    private /* synthetic */ gtknphoqwx(Object obj) {
        this.f82881iobyxmoadg = obj;
    }

    public static String btonecajqb(Object obj) {
        if (obj instanceof iobyxmoadg) {
            return ((iobyxmoadg) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    public static final boolean dxjokdxxww(Object obj) {
        return !(obj instanceof ppxfxbqfkf);
    }

    public static final Throwable eablkybsjg(Object obj) {
        iobyxmoadg iobyxmoadgVar = obj instanceof iobyxmoadg ? (iobyxmoadg) obj : null;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar.f82882iobyxmoadg;
        }
        return null;
    }

    public static final Object gxszxtbevo(Object obj) {
        if (obj instanceof ppxfxbqfkf) {
            return null;
        }
        return obj;
    }

    public static int lqeggnwhkg(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean nufgyqmvbu(Object obj) {
        return obj instanceof iobyxmoadg;
    }

    public static Object ppxfxbqfkf(Object obj) {
        return obj;
    }

    public static boolean wkgbmnqykc(Object obj, Object obj2) {
        return (obj2 instanceof gtknphoqwx) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(obj, ((gtknphoqwx) obj2).gtknphoqwx());
    }

    public static final /* synthetic */ gtknphoqwx zoijcleaow(Object obj) {
        return new gtknphoqwx(obj);
    }

    public boolean equals(Object obj) {
        return wkgbmnqykc(this.f82881iobyxmoadg, obj);
    }

    public final /* synthetic */ Object gtknphoqwx() {
        return this.f82881iobyxmoadg;
    }

    public int hashCode() {
        return lqeggnwhkg(this.f82881iobyxmoadg);
    }

    public String toString() {
        return btonecajqb(this.f82881iobyxmoadg);
    }
}
