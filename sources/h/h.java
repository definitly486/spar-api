package h;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f38898iobyxmoadg = new iobyxmoadg(null);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final int f38901zoijcleaow = wkgbmnqykc(0);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final int f38899ppxfxbqfkf = wkgbmnqykc(1);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final int f38900wkgbmnqykc = wkgbmnqykc(2);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final int iobyxmoadg() {
            return h.f38900wkgbmnqykc;
        }

        public final int ppxfxbqfkf() {
            return h.f38899ppxfxbqfkf;
        }

        public final int zoijcleaow() {
            return h.f38901zoijcleaow;
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
        if (eablkybsjg(i13, f38901zoijcleaow)) {
            return "Miter";
        }
        if (eablkybsjg(i13, f38899ppxfxbqfkf)) {
            return "Round";
        }
        return eablkybsjg(i13, f38900wkgbmnqykc) ? "Bevel" : "Unknown";
    }

    public static int wkgbmnqykc(int i13) {
        return i13;
    }
}
