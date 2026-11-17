package p0;

/* JADX INFO: loaded from: classes.dex */
public final class kcexrzcfyt {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f75247iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final iobyxmoadg f75246zoijcleaow = new iobyxmoadg(null);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final int f75244ppxfxbqfkf = gtknphoqwx(-1);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final int f75245wkgbmnqykc = gtknphoqwx(1);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final int f75239eablkybsjg = gtknphoqwx(0);

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final int f75241gxszxtbevo = gtknphoqwx(2);

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final int f75242lqeggnwhkg = gtknphoqwx(3);

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private static final int f75243nufgyqmvbu = gtknphoqwx(4);

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private static final int f75238dxjokdxxww = gtknphoqwx(5);

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private static final int f75237btonecajqb = gtknphoqwx(6);

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private static final int f75240gtknphoqwx = gtknphoqwx(7);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final int dxjokdxxww() {
            return kcexrzcfyt.f75244ppxfxbqfkf;
        }

        public final int eablkybsjg() {
            return kcexrzcfyt.f75239eablkybsjg;
        }

        public final int gxszxtbevo() {
            return kcexrzcfyt.f75238dxjokdxxww;
        }

        public final int iobyxmoadg() {
            return kcexrzcfyt.f75245wkgbmnqykc;
        }

        public final int lqeggnwhkg() {
            return kcexrzcfyt.f75242lqeggnwhkg;
        }

        public final int nufgyqmvbu() {
            return kcexrzcfyt.f75243nufgyqmvbu;
        }

        public final int ppxfxbqfkf() {
            return kcexrzcfyt.f75241gxszxtbevo;
        }

        public final int wkgbmnqykc() {
            return kcexrzcfyt.f75237btonecajqb;
        }

        public final int zoijcleaow() {
            return kcexrzcfyt.f75240gtknphoqwx;
        }

        private iobyxmoadg() {
        }
    }

    private /* synthetic */ kcexrzcfyt(int i13) {
        this.f75247iobyxmoadg = i13;
    }

    public static int agtfadlqog(int i13) {
        return Integer.hashCode(i13);
    }

    public static final /* synthetic */ kcexrzcfyt btonecajqb(int i13) {
        return new kcexrzcfyt(i13);
    }

    public static boolean draadjrbmk(int i13, Object obj) {
        return (obj instanceof kcexrzcfyt) && i13 == ((kcexrzcfyt) obj).rgvfuqvkyq();
    }

    private static int gtknphoqwx(int i13) {
        return i13;
    }

    public static String ojitshcjhn(int i13) {
        if (wflxmlrfwp(i13, f75244ppxfxbqfkf)) {
            return "Unspecified";
        }
        if (wflxmlrfwp(i13, f75239eablkybsjg)) {
            return "None";
        }
        if (wflxmlrfwp(i13, f75245wkgbmnqykc)) {
            return "Default";
        }
        if (wflxmlrfwp(i13, f75241gxszxtbevo)) {
            return "Go";
        }
        if (wflxmlrfwp(i13, f75242lqeggnwhkg)) {
            return "Search";
        }
        if (wflxmlrfwp(i13, f75243nufgyqmvbu)) {
            return "Send";
        }
        if (wflxmlrfwp(i13, f75238dxjokdxxww)) {
            return "Previous";
        }
        if (wflxmlrfwp(i13, f75237btonecajqb)) {
            return "Next";
        }
        return wflxmlrfwp(i13, f75240gtknphoqwx) ? "Done" : "Invalid";
    }

    public static final boolean wflxmlrfwp(int i13, int i14) {
        return i13 == i14;
    }

    public boolean equals(Object obj) {
        return draadjrbmk(this.f75247iobyxmoadg, obj);
    }

    public int hashCode() {
        return agtfadlqog(this.f75247iobyxmoadg);
    }

    public final /* synthetic */ int rgvfuqvkyq() {
        return this.f75247iobyxmoadg;
    }

    public String toString() {
        return ojitshcjhn(this.f75247iobyxmoadg);
    }
}
