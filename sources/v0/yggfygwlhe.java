package v0;

/* JADX INFO: loaded from: classes.dex */
public final class yggfygwlhe {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final yggfygwlhe f115026eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final iobyxmoadg f115027ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final yggfygwlhe f115028wkgbmnqykc;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f115029iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f115030zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final yggfygwlhe iobyxmoadg() {
            return yggfygwlhe.f115028wkgbmnqykc;
        }

        private iobyxmoadg() {
        }
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f115035iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final iobyxmoadg f115034zoijcleaow = new iobyxmoadg(null);

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private static final int f115032ppxfxbqfkf = eablkybsjg(1);

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private static final int f115033wkgbmnqykc = eablkybsjg(2);

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private static final int f115031eablkybsjg = eablkybsjg(3);

        public static final class iobyxmoadg {
            public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
                this();
            }

            public final int iobyxmoadg() {
                return zoijcleaow.f115033wkgbmnqykc;
            }

            public final int ppxfxbqfkf() {
                return zoijcleaow.f115031eablkybsjg;
            }

            public final int zoijcleaow() {
                return zoijcleaow.f115032ppxfxbqfkf;
            }

            private iobyxmoadg() {
            }
        }

        private /* synthetic */ zoijcleaow(int i13) {
            this.f115035iobyxmoadg = i13;
        }

        public static String dxjokdxxww(int i13) {
            if (lqeggnwhkg(i13, f115032ppxfxbqfkf)) {
                return "Linearity.Linear";
            }
            if (lqeggnwhkg(i13, f115033wkgbmnqykc)) {
                return "Linearity.FontHinting";
            }
            return lqeggnwhkg(i13, f115031eablkybsjg) ? "Linearity.None" : "Invalid";
        }

        private static int eablkybsjg(int i13) {
            return i13;
        }

        public static boolean gxszxtbevo(int i13, Object obj) {
            return (obj instanceof zoijcleaow) && i13 == ((zoijcleaow) obj).btonecajqb();
        }

        public static final boolean lqeggnwhkg(int i13, int i14) {
            return i13 == i14;
        }

        public static int nufgyqmvbu(int i13) {
            return Integer.hashCode(i13);
        }

        public static final /* synthetic */ zoijcleaow wkgbmnqykc(int i13) {
            return new zoijcleaow(i13);
        }

        public final /* synthetic */ int btonecajqb() {
            return this.f115035iobyxmoadg;
        }

        public boolean equals(Object obj) {
            return gxszxtbevo(this.f115035iobyxmoadg, obj);
        }

        public int hashCode() {
            return nufgyqmvbu(this.f115035iobyxmoadg);
        }

        public String toString() {
            return dxjokdxxww(this.f115035iobyxmoadg);
        }
    }

    static {
        kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar = null;
        f115027ppxfxbqfkf = new iobyxmoadg(gtknphoqwxVar);
        zoijcleaow.iobyxmoadg iobyxmoadgVar = zoijcleaow.f115034zoijcleaow;
        f115028wkgbmnqykc = new yggfygwlhe(iobyxmoadgVar.iobyxmoadg(), false, gtknphoqwxVar);
        f115026eablkybsjg = new yggfygwlhe(iobyxmoadgVar.zoijcleaow(), true, gtknphoqwxVar);
    }

    public /* synthetic */ yggfygwlhe(int i13, boolean z13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(i13, z13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yggfygwlhe)) {
            return false;
        }
        yggfygwlhe yggfygwlheVar = (yggfygwlhe) obj;
        return zoijcleaow.lqeggnwhkg(this.f115029iobyxmoadg, yggfygwlheVar.f115029iobyxmoadg) && this.f115030zoijcleaow == yggfygwlheVar.f115030zoijcleaow;
    }

    public int hashCode() {
        return (zoijcleaow.nufgyqmvbu(this.f115029iobyxmoadg) * 31) + Boolean.hashCode(this.f115030zoijcleaow);
    }

    public final boolean ppxfxbqfkf() {
        return this.f115030zoijcleaow;
    }

    public String toString() {
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this, f115028wkgbmnqykc)) {
            return "TextMotion.Static";
        }
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this, f115026eablkybsjg) ? "TextMotion.Animated" : "Invalid";
    }

    public final int zoijcleaow() {
        return this.f115029iobyxmoadg;
    }

    private yggfygwlhe(int i13, boolean z13) {
        this.f115029iobyxmoadg = i13;
        this.f115030zoijcleaow = z13;
    }
}
