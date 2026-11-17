package g0;

/* JADX INFO: loaded from: classes.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f35738iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final iobyxmoadg f35737zoijcleaow = new iobyxmoadg(null);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final int f35735ppxfxbqfkf = gtknphoqwx(0);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final int f35736wkgbmnqykc = gtknphoqwx(1);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final int f35730eablkybsjg = gtknphoqwx(2);

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final int f35732gxszxtbevo = gtknphoqwx(3);

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final int f35733lqeggnwhkg = gtknphoqwx(4);

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private static final int f35734nufgyqmvbu = gtknphoqwx(5);

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private static final int f35729dxjokdxxww = gtknphoqwx(6);

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private static final int f35728btonecajqb = gtknphoqwx(7);

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private static final int f35731gtknphoqwx = gtknphoqwx(8);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final int dxjokdxxww() {
            return nufgyqmvbu.f35728btonecajqb;
        }

        public final int eablkybsjg() {
            return nufgyqmvbu.f35734nufgyqmvbu;
        }

        public final int gxszxtbevo() {
            return nufgyqmvbu.f35732gxszxtbevo;
        }

        public final int iobyxmoadg() {
            return nufgyqmvbu.f35735ppxfxbqfkf;
        }

        public final int lqeggnwhkg() {
            return nufgyqmvbu.f35730eablkybsjg;
        }

        public final int nufgyqmvbu() {
            return nufgyqmvbu.f35733lqeggnwhkg;
        }

        public final int ppxfxbqfkf() {
            return nufgyqmvbu.f35736wkgbmnqykc;
        }

        public final int wkgbmnqykc() {
            return nufgyqmvbu.f35729dxjokdxxww;
        }

        public final int zoijcleaow() {
            return nufgyqmvbu.f35731gtknphoqwx;
        }

        private iobyxmoadg() {
        }
    }

    private /* synthetic */ nufgyqmvbu(int i13) {
        this.f35738iobyxmoadg = i13;
    }

    public static int agtfadlqog(int i13) {
        return Integer.hashCode(i13);
    }

    public static final /* synthetic */ nufgyqmvbu btonecajqb(int i13) {
        return new nufgyqmvbu(i13);
    }

    public static boolean draadjrbmk(int i13, Object obj) {
        return (obj instanceof nufgyqmvbu) && i13 == ((nufgyqmvbu) obj).rgvfuqvkyq();
    }

    private static int gtknphoqwx(int i13) {
        return i13;
    }

    public static String ojitshcjhn(int i13) {
        if (wflxmlrfwp(i13, f35735ppxfxbqfkf)) {
            return "Button";
        }
        if (wflxmlrfwp(i13, f35736wkgbmnqykc)) {
            return "Checkbox";
        }
        if (wflxmlrfwp(i13, f35730eablkybsjg)) {
            return "Switch";
        }
        if (wflxmlrfwp(i13, f35732gxszxtbevo)) {
            return "RadioButton";
        }
        if (wflxmlrfwp(i13, f35733lqeggnwhkg)) {
            return "Tab";
        }
        if (wflxmlrfwp(i13, f35734nufgyqmvbu)) {
            return "Image";
        }
        if (wflxmlrfwp(i13, f35729dxjokdxxww)) {
            return "DropdownList";
        }
        if (wflxmlrfwp(i13, f35728btonecajqb)) {
            return "Picker";
        }
        return wflxmlrfwp(i13, f35731gtknphoqwx) ? "Carousel" : "Unknown";
    }

    public static final boolean wflxmlrfwp(int i13, int i14) {
        return i13 == i14;
    }

    public boolean equals(Object obj) {
        return draadjrbmk(this.f35738iobyxmoadg, obj);
    }

    public int hashCode() {
        return agtfadlqog(this.f35738iobyxmoadg);
    }

    public final /* synthetic */ int rgvfuqvkyq() {
        return this.f35738iobyxmoadg;
    }

    public String toString() {
        return ojitshcjhn(this.f35738iobyxmoadg);
    }
}
