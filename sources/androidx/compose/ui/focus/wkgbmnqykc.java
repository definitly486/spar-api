package androidx.compose.ui.focus;

/* JADX INFO: loaded from: classes.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f6267iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final iobyxmoadg f6266zoijcleaow = new iobyxmoadg(null);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final int f6264ppxfxbqfkf = btonecajqb(1);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final int f6265wkgbmnqykc = btonecajqb(2);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final int f6260eablkybsjg = btonecajqb(3);

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final int f6261gxszxtbevo = btonecajqb(4);

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final int f6262lqeggnwhkg = btonecajqb(5);

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private static final int f6263nufgyqmvbu = btonecajqb(6);

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private static final int f6259dxjokdxxww = btonecajqb(7);

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private static final int f6258btonecajqb = btonecajqb(8);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final int eablkybsjg() {
            return wkgbmnqykc.f6264ppxfxbqfkf;
        }

        public final int gxszxtbevo() {
            return wkgbmnqykc.f6265wkgbmnqykc;
        }

        public final int iobyxmoadg() {
            return wkgbmnqykc.f6263nufgyqmvbu;
        }

        public final int lqeggnwhkg() {
            return wkgbmnqykc.f6261gxszxtbevo;
        }

        public final int nufgyqmvbu() {
            return wkgbmnqykc.f6262lqeggnwhkg;
        }

        public final int ppxfxbqfkf() {
            return wkgbmnqykc.f6258btonecajqb;
        }

        public final int wkgbmnqykc() {
            return wkgbmnqykc.f6260eablkybsjg;
        }

        public final int zoijcleaow() {
            return wkgbmnqykc.f6259dxjokdxxww;
        }

        private iobyxmoadg() {
        }
    }

    private /* synthetic */ wkgbmnqykc(int i13) {
        this.f6267iobyxmoadg = i13;
    }

    public static String agtfadlqog(int i13) {
        if (draadjrbmk(i13, f6264ppxfxbqfkf)) {
            return "Next";
        }
        if (draadjrbmk(i13, f6265wkgbmnqykc)) {
            return "Previous";
        }
        if (draadjrbmk(i13, f6260eablkybsjg)) {
            return "Left";
        }
        if (draadjrbmk(i13, f6261gxszxtbevo)) {
            return "Right";
        }
        if (draadjrbmk(i13, f6262lqeggnwhkg)) {
            return "Up";
        }
        if (draadjrbmk(i13, f6263nufgyqmvbu)) {
            return "Down";
        }
        if (draadjrbmk(i13, f6259dxjokdxxww)) {
            return "Enter";
        }
        return draadjrbmk(i13, f6258btonecajqb) ? "Exit" : "Invalid FocusDirection";
    }

    public static int btonecajqb(int i13) {
        return i13;
    }

    public static final boolean draadjrbmk(int i13, int i14) {
        return i13 == i14;
    }

    public static final /* synthetic */ wkgbmnqykc dxjokdxxww(int i13) {
        return new wkgbmnqykc(i13);
    }

    public static boolean gtknphoqwx(int i13, Object obj) {
        return (obj instanceof wkgbmnqykc) && i13 == ((wkgbmnqykc) obj).ojitshcjhn();
    }

    public static int wflxmlrfwp(int i13) {
        return Integer.hashCode(i13);
    }

    public boolean equals(Object obj) {
        return gtknphoqwx(this.f6267iobyxmoadg, obj);
    }

    public int hashCode() {
        return wflxmlrfwp(this.f6267iobyxmoadg);
    }

    public final /* synthetic */ int ojitshcjhn() {
        return this.f6267iobyxmoadg;
    }

    public String toString() {
        return agtfadlqog(this.f6267iobyxmoadg);
    }
}
