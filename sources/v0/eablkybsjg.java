package v0;

/* JADX INFO: loaded from: classes.dex */
public final class eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f114952iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final iobyxmoadg f114951zoijcleaow = new iobyxmoadg(null);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final int f114949ppxfxbqfkf = eablkybsjg(1);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final int f114950wkgbmnqykc = eablkybsjg(2);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final int f114948eablkybsjg = eablkybsjg(Integer.MIN_VALUE);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final int iobyxmoadg() {
            return eablkybsjg.f114950wkgbmnqykc;
        }

        public final int ppxfxbqfkf() {
            return eablkybsjg.f114948eablkybsjg;
        }

        public final int zoijcleaow() {
            return eablkybsjg.f114949ppxfxbqfkf;
        }

        private iobyxmoadg() {
        }
    }

    private /* synthetic */ eablkybsjg(int i13) {
        this.f114952iobyxmoadg = i13;
    }

    public static String dxjokdxxww(int i13) {
        if (lqeggnwhkg(i13, f114949ppxfxbqfkf)) {
            return "Hyphens.None";
        }
        if (lqeggnwhkg(i13, f114950wkgbmnqykc)) {
            return "Hyphens.Auto";
        }
        return lqeggnwhkg(i13, f114948eablkybsjg) ? "Hyphens.Unspecified" : "Invalid";
    }

    private static int eablkybsjg(int i13) {
        return i13;
    }

    public static boolean gxszxtbevo(int i13, Object obj) {
        return (obj instanceof eablkybsjg) && i13 == ((eablkybsjg) obj).btonecajqb();
    }

    public static final boolean lqeggnwhkg(int i13, int i14) {
        return i13 == i14;
    }

    public static int nufgyqmvbu(int i13) {
        return Integer.hashCode(i13);
    }

    public static final /* synthetic */ eablkybsjg wkgbmnqykc(int i13) {
        return new eablkybsjg(i13);
    }

    public final /* synthetic */ int btonecajqb() {
        return this.f114952iobyxmoadg;
    }

    public boolean equals(Object obj) {
        return gxszxtbevo(this.f114952iobyxmoadg, obj);
    }

    public int hashCode() {
        return nufgyqmvbu(this.f114952iobyxmoadg);
    }

    public String toString() {
        return dxjokdxxww(this.f114952iobyxmoadg);
    }
}
