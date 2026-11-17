package v0;

/* JADX INFO: loaded from: classes.dex */
public final class btonecajqb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f114935iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final iobyxmoadg f114934zoijcleaow = new iobyxmoadg(null);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final int f114932ppxfxbqfkf = dxjokdxxww(1);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final int f114933wkgbmnqykc = dxjokdxxww(2);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final int f114928eablkybsjg = dxjokdxxww(3);

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final int f114929gxszxtbevo = dxjokdxxww(4);

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final int f114930lqeggnwhkg = dxjokdxxww(5);

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private static final int f114931nufgyqmvbu = dxjokdxxww(6);

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private static final int f114927dxjokdxxww = dxjokdxxww(Integer.MIN_VALUE);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final int eablkybsjg() {
            return btonecajqb.f114933wkgbmnqykc;
        }

        public final int gxszxtbevo() {
            return btonecajqb.f114930lqeggnwhkg;
        }

        public final int iobyxmoadg() {
            return btonecajqb.f114928eablkybsjg;
        }

        public final int lqeggnwhkg() {
            return btonecajqb.f114927dxjokdxxww;
        }

        public final int ppxfxbqfkf() {
            return btonecajqb.f114929gxszxtbevo;
        }

        public final int wkgbmnqykc() {
            return btonecajqb.f114932ppxfxbqfkf;
        }

        public final int zoijcleaow() {
            return btonecajqb.f114931nufgyqmvbu;
        }

        private iobyxmoadg() {
        }
    }

    private /* synthetic */ btonecajqb(int i13) {
        this.f114935iobyxmoadg = i13;
    }

    public static boolean btonecajqb(int i13, Object obj) {
        return (obj instanceof btonecajqb) && i13 == ((btonecajqb) obj).agtfadlqog();
    }

    public static int draadjrbmk(int i13) {
        return Integer.hashCode(i13);
    }

    public static int dxjokdxxww(int i13) {
        return i13;
    }

    public static final boolean gtknphoqwx(int i13, int i14) {
        return i13 == i14;
    }

    public static final /* synthetic */ btonecajqb nufgyqmvbu(int i13) {
        return new btonecajqb(i13);
    }

    public static String wflxmlrfwp(int i13) {
        if (gtknphoqwx(i13, f114932ppxfxbqfkf)) {
            return "Left";
        }
        if (gtknphoqwx(i13, f114933wkgbmnqykc)) {
            return "Right";
        }
        if (gtknphoqwx(i13, f114928eablkybsjg)) {
            return "Center";
        }
        if (gtknphoqwx(i13, f114929gxszxtbevo)) {
            return "Justify";
        }
        if (gtknphoqwx(i13, f114930lqeggnwhkg)) {
            return "Start";
        }
        if (gtknphoqwx(i13, f114931nufgyqmvbu)) {
            return "End";
        }
        return gtknphoqwx(i13, f114927dxjokdxxww) ? "Unspecified" : "Invalid";
    }

    public final /* synthetic */ int agtfadlqog() {
        return this.f114935iobyxmoadg;
    }

    public boolean equals(Object obj) {
        return btonecajqb(this.f114935iobyxmoadg, obj);
    }

    public int hashCode() {
        return draadjrbmk(this.f114935iobyxmoadg);
    }

    public String toString() {
        return wflxmlrfwp(this.f114935iobyxmoadg);
    }
}
