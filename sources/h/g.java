package h;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f38891iobyxmoadg = new iobyxmoadg(null);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final int f38894zoijcleaow = wkgbmnqykc(0);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final int f38892ppxfxbqfkf = wkgbmnqykc(1);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final int f38893wkgbmnqykc = wkgbmnqykc(2);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final int iobyxmoadg() {
            return g.f38894zoijcleaow;
        }

        public final int ppxfxbqfkf() {
            return g.f38893wkgbmnqykc;
        }

        public final int zoijcleaow() {
            return g.f38892ppxfxbqfkf;
        }

        private iobyxmoadg() {
        }
    }

    public static final boolean eablkybsjg(int i13, int i14) {
        return i13 == i14;
    }

    public static int gxszxtbevo(int i13) {
        return Integer.hashCode(i13);
    }

    public static String lqeggnwhkg(int i13) {
        if (eablkybsjg(i13, f38894zoijcleaow)) {
            return "Butt";
        }
        if (eablkybsjg(i13, f38892ppxfxbqfkf)) {
            return "Round";
        }
        return eablkybsjg(i13, f38893wkgbmnqykc) ? "Square" : "Unknown";
    }

    public static int wkgbmnqykc(int i13) {
        return i13;
    }
}
