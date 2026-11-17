package v0;

/* JADX INFO: loaded from: classes.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final nufgyqmvbu f114994eablkybsjg;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final zoijcleaow f114995wkgbmnqykc;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final float f114996iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f114997ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f114998zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final float f115004iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final C2861iobyxmoadg f115003zoijcleaow = new C2861iobyxmoadg(null);

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private static final float f115001ppxfxbqfkf = eablkybsjg(0.0f);

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private static final float f115002wkgbmnqykc = eablkybsjg(0.5f);

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private static final float f114999eablkybsjg = eablkybsjg(-1.0f);

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private static final float f115000gxszxtbevo = eablkybsjg(1.0f);

        /* JADX INFO: renamed from: v0.nufgyqmvbu$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C2861iobyxmoadg {
            public /* synthetic */ C2861iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
                this();
            }

            public final float iobyxmoadg() {
                return iobyxmoadg.f115002wkgbmnqykc;
            }

            public final float ppxfxbqfkf() {
                return iobyxmoadg.f115001ppxfxbqfkf;
            }

            public final float zoijcleaow() {
                return iobyxmoadg.f114999eablkybsjg;
            }

            private C2861iobyxmoadg() {
            }
        }

        private /* synthetic */ iobyxmoadg(float f13) {
            this.f115004iobyxmoadg = f13;
        }

        public static String dxjokdxxww(float f13) {
            if (f13 == f115001ppxfxbqfkf) {
                return "LineHeightStyle.Alignment.Top";
            }
            if (f13 == f115002wkgbmnqykc) {
                return "LineHeightStyle.Alignment.Center";
            }
            if (f13 == f114999eablkybsjg) {
                return "LineHeightStyle.Alignment.Proportional";
            }
            if (f13 == f115000gxszxtbevo) {
                return "LineHeightStyle.Alignment.Bottom";
            }
            return "LineHeightStyle.Alignment(topPercentage = " + f13 + ')';
        }

        public static float eablkybsjg(float f13) {
            if (!((0.0f <= f13 && f13 <= 1.0f) || f13 == -1.0f)) {
                q0.iobyxmoadg.ppxfxbqfkf("topRatio should be in [0..1] range or -1");
            }
            return f13;
        }

        public static boolean gxszxtbevo(float f13, Object obj) {
            return (obj instanceof iobyxmoadg) && Float.compare(f13, ((iobyxmoadg) obj).btonecajqb()) == 0;
        }

        public static final boolean lqeggnwhkg(float f13, float f14) {
            return Float.compare(f13, f14) == 0;
        }

        public static int nufgyqmvbu(float f13) {
            return Float.hashCode(f13);
        }

        public static final /* synthetic */ iobyxmoadg wkgbmnqykc(float f13) {
            return new iobyxmoadg(f13);
        }

        public final /* synthetic */ float btonecajqb() {
            return this.f115004iobyxmoadg;
        }

        public boolean equals(Object obj) {
            return gxszxtbevo(this.f115004iobyxmoadg, obj);
        }

        public int hashCode() {
            return nufgyqmvbu(this.f115004iobyxmoadg);
        }

        public String toString() {
            return dxjokdxxww(this.f115004iobyxmoadg);
        }
    }

    public static final class ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f115008iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final iobyxmoadg f115007zoijcleaow = new iobyxmoadg(null);

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private static final int f115005ppxfxbqfkf = wkgbmnqykc(0);

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private static final int f115006wkgbmnqykc = wkgbmnqykc(1);

        public static final class iobyxmoadg {
            public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
                this();
            }

            public final int iobyxmoadg() {
                return ppxfxbqfkf.f115005ppxfxbqfkf;
            }

            public final int zoijcleaow() {
                return ppxfxbqfkf.f115006wkgbmnqykc;
            }

            private iobyxmoadg() {
            }
        }

        private /* synthetic */ ppxfxbqfkf(int i13) {
            this.f115008iobyxmoadg = i13;
        }

        public static boolean eablkybsjg(int i13, Object obj) {
            return (obj instanceof ppxfxbqfkf) && i13 == ((ppxfxbqfkf) obj).dxjokdxxww();
        }

        public static final boolean gxszxtbevo(int i13, int i14) {
            return i13 == i14;
        }

        public static int lqeggnwhkg(int i13) {
            return Integer.hashCode(i13);
        }

        public static String nufgyqmvbu(int i13) {
            return "Mode(value=" + i13 + ')';
        }

        public static final /* synthetic */ ppxfxbqfkf ppxfxbqfkf(int i13) {
            return new ppxfxbqfkf(i13);
        }

        private static int wkgbmnqykc(int i13) {
            return i13;
        }

        public final /* synthetic */ int dxjokdxxww() {
            return this.f115008iobyxmoadg;
        }

        public boolean equals(Object obj) {
            return eablkybsjg(this.f115008iobyxmoadg, obj);
        }

        public int hashCode() {
            return lqeggnwhkg(this.f115008iobyxmoadg);
        }

        public String toString() {
            return nufgyqmvbu(this.f115008iobyxmoadg);
        }
    }

    public static final class wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f115014iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final iobyxmoadg f115013zoijcleaow = new iobyxmoadg(null);

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private static final int f115011ppxfxbqfkf = eablkybsjg(1);

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private static final int f115012wkgbmnqykc = eablkybsjg(16);

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private static final int f115009eablkybsjg = eablkybsjg(17);

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private static final int f115010gxszxtbevo = eablkybsjg(0);

        public static final class iobyxmoadg {
            public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
                this();
            }

            public final int iobyxmoadg() {
                return wkgbmnqykc.f115009eablkybsjg;
            }

            public final int ppxfxbqfkf() {
                return wkgbmnqykc.f115010gxszxtbevo;
            }

            public final int zoijcleaow() {
                return wkgbmnqykc.f115011ppxfxbqfkf;
            }

            private iobyxmoadg() {
            }
        }

        private /* synthetic */ wkgbmnqykc(int i13) {
            this.f115014iobyxmoadg = i13;
        }

        public static final boolean btonecajqb(int i13) {
            return (i13 & 16) > 0;
        }

        public static final boolean dxjokdxxww(int i13) {
            return (i13 & 1) > 0;
        }

        private static int eablkybsjg(int i13) {
            return i13;
        }

        public static String gtknphoqwx(int i13) {
            if (i13 == f115011ppxfxbqfkf) {
                return "LineHeightStyle.Trim.FirstLineTop";
            }
            if (i13 == f115012wkgbmnqykc) {
                return "LineHeightStyle.Trim.LastLineBottom";
            }
            if (i13 == f115009eablkybsjg) {
                return "LineHeightStyle.Trim.Both";
            }
            return i13 == f115010gxszxtbevo ? "LineHeightStyle.Trim.None" : "Invalid";
        }

        public static boolean gxszxtbevo(int i13, Object obj) {
            return (obj instanceof wkgbmnqykc) && i13 == ((wkgbmnqykc) obj).draadjrbmk();
        }

        public static final boolean lqeggnwhkg(int i13, int i14) {
            return i13 == i14;
        }

        public static int nufgyqmvbu(int i13) {
            return Integer.hashCode(i13);
        }

        public static final /* synthetic */ wkgbmnqykc wkgbmnqykc(int i13) {
            return new wkgbmnqykc(i13);
        }

        public final /* synthetic */ int draadjrbmk() {
            return this.f115014iobyxmoadg;
        }

        public boolean equals(Object obj) {
            return gxszxtbevo(this.f115014iobyxmoadg, obj);
        }

        public int hashCode() {
            return nufgyqmvbu(this.f115014iobyxmoadg);
        }

        public String toString() {
            return gtknphoqwx(this.f115014iobyxmoadg);
        }
    }

    public static final class zoijcleaow {
        public /* synthetic */ zoijcleaow(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final nufgyqmvbu iobyxmoadg() {
            return nufgyqmvbu.f114994eablkybsjg;
        }

        private zoijcleaow() {
        }
    }

    static {
        kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar = null;
        f114995wkgbmnqykc = new zoijcleaow(gtknphoqwxVar);
        f114994eablkybsjg = new nufgyqmvbu(iobyxmoadg.f115003zoijcleaow.zoijcleaow(), wkgbmnqykc.f115013zoijcleaow.iobyxmoadg(), ppxfxbqfkf.f115007zoijcleaow.iobyxmoadg(), gtknphoqwxVar);
    }

    public /* synthetic */ nufgyqmvbu(float f13, int i13, int i14, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(f13, i13, i14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nufgyqmvbu)) {
            return false;
        }
        nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
        return iobyxmoadg.lqeggnwhkg(this.f114996iobyxmoadg, nufgyqmvbuVar.f114996iobyxmoadg) && wkgbmnqykc.lqeggnwhkg(this.f114998zoijcleaow, nufgyqmvbuVar.f114998zoijcleaow) && ppxfxbqfkf.gxszxtbevo(this.f114997ppxfxbqfkf, nufgyqmvbuVar.f114997ppxfxbqfkf);
    }

    public int hashCode() {
        return (((iobyxmoadg.nufgyqmvbu(this.f114996iobyxmoadg) * 31) + wkgbmnqykc.nufgyqmvbu(this.f114998zoijcleaow)) * 31) + ppxfxbqfkf.lqeggnwhkg(this.f114997ppxfxbqfkf);
    }

    public final int ppxfxbqfkf() {
        return this.f114997ppxfxbqfkf;
    }

    public String toString() {
        return "LineHeightStyle(alignment=" + ((Object) iobyxmoadg.dxjokdxxww(this.f114996iobyxmoadg)) + ", trim=" + ((Object) wkgbmnqykc.gtknphoqwx(this.f114998zoijcleaow)) + ",mode=" + ((Object) ppxfxbqfkf.nufgyqmvbu(this.f114997ppxfxbqfkf)) + ')';
    }

    public final int wkgbmnqykc() {
        return this.f114998zoijcleaow;
    }

    public final float zoijcleaow() {
        return this.f114996iobyxmoadg;
    }

    public /* synthetic */ nufgyqmvbu(float f13, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(f13, i13);
    }

    private nufgyqmvbu(float f13, int i13, int i14) {
        this.f114996iobyxmoadg = f13;
        this.f114998zoijcleaow = i13;
        this.f114997ppxfxbqfkf = i14;
    }

    private nufgyqmvbu(float f13, int i13) {
        this(f13, i13, ppxfxbqfkf.f115007zoijcleaow.iobyxmoadg(), null);
    }
}
