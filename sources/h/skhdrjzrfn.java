package h;

/* JADX INFO: loaded from: classes.dex */
public final class skhdrjzrfn {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f38966iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final iobyxmoadg f38965zoijcleaow = new iobyxmoadg(null);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final int f38963ppxfxbqfkf = lqeggnwhkg(0);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final int f38964wkgbmnqykc = lqeggnwhkg(1);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final int f38960eablkybsjg = lqeggnwhkg(2);

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final int f38961gxszxtbevo = lqeggnwhkg(3);

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final int f38962lqeggnwhkg = lqeggnwhkg(4);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final int eablkybsjg() {
            return skhdrjzrfn.f38960eablkybsjg;
        }

        public final int iobyxmoadg() {
            return skhdrjzrfn.f38964wkgbmnqykc;
        }

        public final int ppxfxbqfkf() {
            return skhdrjzrfn.f38961gxszxtbevo;
        }

        public final int wkgbmnqykc() {
            return skhdrjzrfn.f38962lqeggnwhkg;
        }

        public final int zoijcleaow() {
            return skhdrjzrfn.f38963ppxfxbqfkf;
        }

        private iobyxmoadg() {
        }
    }

    private /* synthetic */ skhdrjzrfn(int i13) {
        this.f38966iobyxmoadg = i13;
    }

    public static int btonecajqb(int i13) {
        return Integer.hashCode(i13);
    }

    public static final boolean dxjokdxxww(int i13, int i14) {
        return i13 == i14;
    }

    public static String gtknphoqwx(int i13) {
        if (dxjokdxxww(i13, f38963ppxfxbqfkf)) {
            return "Argb8888";
        }
        if (dxjokdxxww(i13, f38964wkgbmnqykc)) {
            return "Alpha8";
        }
        if (dxjokdxxww(i13, f38960eablkybsjg)) {
            return "Rgb565";
        }
        if (dxjokdxxww(i13, f38961gxszxtbevo)) {
            return "F16";
        }
        return dxjokdxxww(i13, f38962lqeggnwhkg) ? "Gpu" : "Unknown";
    }

    public static final /* synthetic */ skhdrjzrfn gxszxtbevo(int i13) {
        return new skhdrjzrfn(i13);
    }

    public static int lqeggnwhkg(int i13) {
        return i13;
    }

    public static boolean nufgyqmvbu(int i13, Object obj) {
        return (obj instanceof skhdrjzrfn) && i13 == ((skhdrjzrfn) obj).draadjrbmk();
    }

    public final /* synthetic */ int draadjrbmk() {
        return this.f38966iobyxmoadg;
    }

    public boolean equals(Object obj) {
        return nufgyqmvbu(this.f38966iobyxmoadg, obj);
    }

    public int hashCode() {
        return btonecajqb(this.f38966iobyxmoadg);
    }

    public String toString() {
        return gtknphoqwx(this.f38966iobyxmoadg);
    }
}
