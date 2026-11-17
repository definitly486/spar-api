package n0;

/* JADX INFO: loaded from: classes.dex */
public final class lereixgezr {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f68284iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final iobyxmoadg f68283zoijcleaow = new iobyxmoadg(null);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final int f68281ppxfxbqfkf = wkgbmnqykc(0);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final int f68282wkgbmnqykc = wkgbmnqykc(1);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final int iobyxmoadg() {
            return lereixgezr.f68282wkgbmnqykc;
        }

        public final int zoijcleaow() {
            return lereixgezr.f68281ppxfxbqfkf;
        }

        private iobyxmoadg() {
        }
    }

    private /* synthetic */ lereixgezr(int i13) {
        this.f68284iobyxmoadg = i13;
    }

    public static boolean eablkybsjg(int i13, Object obj) {
        return (obj instanceof lereixgezr) && i13 == ((lereixgezr) obj).dxjokdxxww();
    }

    public static final boolean gxszxtbevo(int i13, int i14) {
        return i13 == i14;
    }

    public static int lqeggnwhkg(int i13) {
        return Integer.hashCode(i13);
    }

    public static String nufgyqmvbu(int i13) {
        if (gxszxtbevo(i13, f68281ppxfxbqfkf)) {
            return "Normal";
        }
        return gxszxtbevo(i13, f68282wkgbmnqykc) ? "Italic" : "Invalid";
    }

    public static final /* synthetic */ lereixgezr ppxfxbqfkf(int i13) {
        return new lereixgezr(i13);
    }

    public static int wkgbmnqykc(int i13) {
        return i13;
    }

    public final /* synthetic */ int dxjokdxxww() {
        return this.f68284iobyxmoadg;
    }

    public boolean equals(Object obj) {
        return eablkybsjg(this.f68284iobyxmoadg, obj);
    }

    public int hashCode() {
        return lqeggnwhkg(this.f68284iobyxmoadg);
    }

    public String toString() {
        return nufgyqmvbu(this.f68284iobyxmoadg);
    }
}
