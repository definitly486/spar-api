package p0;

/* JADX INFO: loaded from: classes.dex */
public final class esjtqupxsv {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f75217iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final iobyxmoadg f75216zoijcleaow = new iobyxmoadg(null);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final int f75214ppxfxbqfkf = lqeggnwhkg(-1);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final int f75215wkgbmnqykc = lqeggnwhkg(0);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final int f75211eablkybsjg = lqeggnwhkg(1);

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final int f75212gxszxtbevo = lqeggnwhkg(2);

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final int f75213lqeggnwhkg = lqeggnwhkg(3);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final int eablkybsjg() {
            return esjtqupxsv.f75212gxszxtbevo;
        }

        public final int iobyxmoadg() {
            return esjtqupxsv.f75211eablkybsjg;
        }

        public final int ppxfxbqfkf() {
            return esjtqupxsv.f75213lqeggnwhkg;
        }

        public final int wkgbmnqykc() {
            return esjtqupxsv.f75214ppxfxbqfkf;
        }

        public final int zoijcleaow() {
            return esjtqupxsv.f75215wkgbmnqykc;
        }

        private iobyxmoadg() {
        }
    }

    private /* synthetic */ esjtqupxsv(int i13) {
        this.f75217iobyxmoadg = i13;
    }

    public static int btonecajqb(int i13) {
        return Integer.hashCode(i13);
    }

    public static final boolean dxjokdxxww(int i13, int i14) {
        return i13 == i14;
    }

    public static String gtknphoqwx(int i13) {
        if (dxjokdxxww(i13, f75214ppxfxbqfkf)) {
            return "Unspecified";
        }
        if (dxjokdxxww(i13, f75215wkgbmnqykc)) {
            return "None";
        }
        if (dxjokdxxww(i13, f75211eablkybsjg)) {
            return "Characters";
        }
        if (dxjokdxxww(i13, f75212gxszxtbevo)) {
            return "Words";
        }
        return dxjokdxxww(i13, f75213lqeggnwhkg) ? "Sentences" : "Invalid";
    }

    public static final /* synthetic */ esjtqupxsv gxszxtbevo(int i13) {
        return new esjtqupxsv(i13);
    }

    private static int lqeggnwhkg(int i13) {
        return i13;
    }

    public static boolean nufgyqmvbu(int i13, Object obj) {
        return (obj instanceof esjtqupxsv) && i13 == ((esjtqupxsv) obj).draadjrbmk();
    }

    public final /* synthetic */ int draadjrbmk() {
        return this.f75217iobyxmoadg;
    }

    public boolean equals(Object obj) {
        return nufgyqmvbu(this.f75217iobyxmoadg, obj);
    }

    public int hashCode() {
        return btonecajqb(this.f75217iobyxmoadg);
    }

    public String toString() {
        return gtknphoqwx(this.f75217iobyxmoadg);
    }
}
