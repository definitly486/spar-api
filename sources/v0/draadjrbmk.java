package v0;

/* JADX INFO: loaded from: classes.dex */
public final class draadjrbmk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f114943iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final iobyxmoadg f114942zoijcleaow = new iobyxmoadg(null);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final int f114940ppxfxbqfkf = nufgyqmvbu(1);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final int f114941wkgbmnqykc = nufgyqmvbu(2);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final int f114936eablkybsjg = nufgyqmvbu(3);

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final int f114937gxszxtbevo = nufgyqmvbu(4);

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final int f114938lqeggnwhkg = nufgyqmvbu(5);

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private static final int f114939nufgyqmvbu = nufgyqmvbu(Integer.MIN_VALUE);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final int eablkybsjg() {
            return draadjrbmk.f114941wkgbmnqykc;
        }

        public final int gxszxtbevo() {
            return draadjrbmk.f114939nufgyqmvbu;
        }

        public final int iobyxmoadg() {
            return draadjrbmk.f114936eablkybsjg;
        }

        public final int ppxfxbqfkf() {
            return draadjrbmk.f114938lqeggnwhkg;
        }

        public final int wkgbmnqykc() {
            return draadjrbmk.f114940ppxfxbqfkf;
        }

        public final int zoijcleaow() {
            return draadjrbmk.f114937gxszxtbevo;
        }

        private iobyxmoadg() {
        }
    }

    private /* synthetic */ draadjrbmk(int i13) {
        this.f114943iobyxmoadg = i13;
    }

    public static final boolean btonecajqb(int i13, int i14) {
        return i13 == i14;
    }

    public static String draadjrbmk(int i13) {
        if (btonecajqb(i13, f114940ppxfxbqfkf)) {
            return "Ltr";
        }
        if (btonecajqb(i13, f114941wkgbmnqykc)) {
            return "Rtl";
        }
        if (btonecajqb(i13, f114936eablkybsjg)) {
            return "Content";
        }
        if (btonecajqb(i13, f114937gxszxtbevo)) {
            return "ContentOrLtr";
        }
        if (btonecajqb(i13, f114938lqeggnwhkg)) {
            return "ContentOrRtl";
        }
        return btonecajqb(i13, f114939nufgyqmvbu) ? "Unspecified" : "Invalid";
    }

    public static boolean dxjokdxxww(int i13, Object obj) {
        return (obj instanceof draadjrbmk) && i13 == ((draadjrbmk) obj).wflxmlrfwp();
    }

    public static int gtknphoqwx(int i13) {
        return Integer.hashCode(i13);
    }

    public static final /* synthetic */ draadjrbmk lqeggnwhkg(int i13) {
        return new draadjrbmk(i13);
    }

    public static int nufgyqmvbu(int i13) {
        return i13;
    }

    public boolean equals(Object obj) {
        return dxjokdxxww(this.f114943iobyxmoadg, obj);
    }

    public int hashCode() {
        return gtknphoqwx(this.f114943iobyxmoadg);
    }

    public String toString() {
        return draadjrbmk(this.f114943iobyxmoadg);
    }

    public final /* synthetic */ int wflxmlrfwp() {
        return this.f114943iobyxmoadg;
    }
}
