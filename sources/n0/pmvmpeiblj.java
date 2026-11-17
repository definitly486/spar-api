package n0;

/* JADX INFO: loaded from: classes.dex */
public final class pmvmpeiblj {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f68324iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final iobyxmoadg f68323zoijcleaow = new iobyxmoadg(null);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final int f68321ppxfxbqfkf = gxszxtbevo(0);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final int f68322wkgbmnqykc = gxszxtbevo(1);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final int f68319eablkybsjg = gxszxtbevo(2);

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final int f68320gxszxtbevo = gxszxtbevo(65535);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final int iobyxmoadg() {
            return pmvmpeiblj.f68320gxszxtbevo;
        }

        public final int ppxfxbqfkf() {
            return pmvmpeiblj.f68319eablkybsjg;
        }

        public final int wkgbmnqykc() {
            return pmvmpeiblj.f68322wkgbmnqykc;
        }

        public final int zoijcleaow() {
            return pmvmpeiblj.f68321ppxfxbqfkf;
        }

        private iobyxmoadg() {
        }
    }

    private /* synthetic */ pmvmpeiblj(int i13) {
        this.f68324iobyxmoadg = i13;
    }

    public static final boolean btonecajqb(int i13) {
        return (i13 & 2) != 0;
    }

    public static String draadjrbmk(int i13) {
        if (nufgyqmvbu(i13, f68321ppxfxbqfkf)) {
            return "None";
        }
        if (nufgyqmvbu(i13, f68322wkgbmnqykc)) {
            return "Weight";
        }
        if (nufgyqmvbu(i13, f68319eablkybsjg)) {
            return "Style";
        }
        return nufgyqmvbu(i13, f68320gxszxtbevo) ? "All" : "Invalid";
    }

    public static int dxjokdxxww(int i13) {
        return Integer.hashCode(i13);
    }

    public static final /* synthetic */ pmvmpeiblj eablkybsjg(int i13) {
        return new pmvmpeiblj(i13);
    }

    public static final boolean gtknphoqwx(int i13) {
        return (i13 & 1) != 0;
    }

    public static int gxszxtbevo(int i13) {
        return i13;
    }

    public static boolean lqeggnwhkg(int i13, Object obj) {
        return (obj instanceof pmvmpeiblj) && i13 == ((pmvmpeiblj) obj).wflxmlrfwp();
    }

    public static final boolean nufgyqmvbu(int i13, int i14) {
        return i13 == i14;
    }

    public boolean equals(Object obj) {
        return lqeggnwhkg(this.f68324iobyxmoadg, obj);
    }

    public int hashCode() {
        return dxjokdxxww(this.f68324iobyxmoadg);
    }

    public String toString() {
        return draadjrbmk(this.f68324iobyxmoadg);
    }

    public final /* synthetic */ int wflxmlrfwp() {
        return this.f68324iobyxmoadg;
    }
}
