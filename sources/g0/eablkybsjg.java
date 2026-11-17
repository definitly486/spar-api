package g0;

/* JADX INFO: loaded from: classes.dex */
public final class eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f35647iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final iobyxmoadg f35646zoijcleaow = new iobyxmoadg(null);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final int f35644ppxfxbqfkf = wkgbmnqykc(0);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final int f35645wkgbmnqykc = wkgbmnqykc(1);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final int iobyxmoadg() {
            return eablkybsjg.f35645wkgbmnqykc;
        }

        public final int zoijcleaow() {
            return eablkybsjg.f35644ppxfxbqfkf;
        }

        private iobyxmoadg() {
        }
    }

    private /* synthetic */ eablkybsjg(int i13) {
        this.f35647iobyxmoadg = i13;
    }

    public static boolean eablkybsjg(int i13, Object obj) {
        return (obj instanceof eablkybsjg) && i13 == ((eablkybsjg) obj).dxjokdxxww();
    }

    public static final boolean gxszxtbevo(int i13, int i14) {
        return i13 == i14;
    }

    public static int lqeggnwhkg(int i13) {
        return Integer.hashCode(i13);
    }

    public static String nufgyqmvbu(int i13) {
        if (gxszxtbevo(i13, f35644ppxfxbqfkf)) {
            return "Polite";
        }
        return gxszxtbevo(i13, f35645wkgbmnqykc) ? "Assertive" : "Unknown";
    }

    public static final /* synthetic */ eablkybsjg ppxfxbqfkf(int i13) {
        return new eablkybsjg(i13);
    }

    private static int wkgbmnqykc(int i13) {
        return i13;
    }

    public final /* synthetic */ int dxjokdxxww() {
        return this.f35647iobyxmoadg;
    }

    public boolean equals(Object obj) {
        return eablkybsjg(this.f35647iobyxmoadg, obj);
    }

    public int hashCode() {
        return lqeggnwhkg(this.f35647iobyxmoadg);
    }

    public String toString() {
        return nufgyqmvbu(this.f35647iobyxmoadg);
    }
}
