package p0;

/* JADX INFO: loaded from: classes.dex */
public final class lereixgezr {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f75259iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final iobyxmoadg f75258zoijcleaow = new iobyxmoadg(null);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final int f75256ppxfxbqfkf = draadjrbmk(0);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final int f75257wkgbmnqykc = draadjrbmk(1);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final int f75251eablkybsjg = draadjrbmk(2);

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final int f75253gxszxtbevo = draadjrbmk(3);

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final int f75254lqeggnwhkg = draadjrbmk(4);

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private static final int f75255nufgyqmvbu = draadjrbmk(5);

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private static final int f75250dxjokdxxww = draadjrbmk(6);

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private static final int f75248btonecajqb = draadjrbmk(7);

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private static final int f75252gtknphoqwx = draadjrbmk(8);

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private static final int f75249draadjrbmk = draadjrbmk(9);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final int btonecajqb() {
            return lereixgezr.f75255nufgyqmvbu;
        }

        public final int dxjokdxxww() {
            return lereixgezr.f75256ppxfxbqfkf;
        }

        public final int eablkybsjg() {
            return lereixgezr.f75252gtknphoqwx;
        }

        public final int gxszxtbevo() {
            return lereixgezr.f75248btonecajqb;
        }

        public final int iobyxmoadg() {
            return lereixgezr.f75251eablkybsjg;
        }

        public final int lqeggnwhkg() {
            return lereixgezr.f75254lqeggnwhkg;
        }

        public final int nufgyqmvbu() {
            return lereixgezr.f75257wkgbmnqykc;
        }

        public final int ppxfxbqfkf() {
            return lereixgezr.f75250dxjokdxxww;
        }

        public final int wkgbmnqykc() {
            return lereixgezr.f75253gxszxtbevo;
        }

        public final int zoijcleaow() {
            return lereixgezr.f75249draadjrbmk;
        }

        private iobyxmoadg() {
        }
    }

    private /* synthetic */ lereixgezr(int i13) {
        this.f75259iobyxmoadg = i13;
    }

    public static final boolean agtfadlqog(int i13, int i14) {
        return i13 == i14;
    }

    private static int draadjrbmk(int i13) {
        return i13;
    }

    public static final /* synthetic */ lereixgezr gtknphoqwx(int i13) {
        return new lereixgezr(i13);
    }

    public static int ojitshcjhn(int i13) {
        return Integer.hashCode(i13);
    }

    public static String rgvfuqvkyq(int i13) {
        if (agtfadlqog(i13, f75256ppxfxbqfkf)) {
            return "Unspecified";
        }
        if (agtfadlqog(i13, f75257wkgbmnqykc)) {
            return "Text";
        }
        if (agtfadlqog(i13, f75251eablkybsjg)) {
            return "Ascii";
        }
        if (agtfadlqog(i13, f75253gxszxtbevo)) {
            return "Number";
        }
        if (agtfadlqog(i13, f75254lqeggnwhkg)) {
            return "Phone";
        }
        if (agtfadlqog(i13, f75255nufgyqmvbu)) {
            return "Uri";
        }
        if (agtfadlqog(i13, f75250dxjokdxxww)) {
            return "Email";
        }
        if (agtfadlqog(i13, f75248btonecajqb)) {
            return "Password";
        }
        if (agtfadlqog(i13, f75252gtknphoqwx)) {
            return "NumberPassword";
        }
        return agtfadlqog(i13, f75249draadjrbmk) ? "Decimal" : "Invalid";
    }

    public static boolean wflxmlrfwp(int i13, Object obj) {
        return (obj instanceof lereixgezr) && i13 == ((lereixgezr) obj).vdvldrhtss();
    }

    public boolean equals(Object obj) {
        return wflxmlrfwp(this.f75259iobyxmoadg, obj);
    }

    public int hashCode() {
        return ojitshcjhn(this.f75259iobyxmoadg);
    }

    public String toString() {
        return rgvfuqvkyq(this.f75259iobyxmoadg);
    }

    public final /* synthetic */ int vdvldrhtss() {
        return this.f75259iobyxmoadg;
    }
}
