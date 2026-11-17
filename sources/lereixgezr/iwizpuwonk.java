package lereixgezr;

/* JADX INFO: loaded from: classes.dex */
public final class iwizpuwonk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f62293iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f62294zoijcleaow;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final iwizpuwonk f62291ppxfxbqfkf = new iwizpuwonk(0, 0);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final iwizpuwonk f62292wkgbmnqykc = new iwizpuwonk(1, 8);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final iwizpuwonk f62287eablkybsjg = new iwizpuwonk(2, 10);

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public static final iwizpuwonk f62288gxszxtbevo = new iwizpuwonk(3, 10);

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public static final iwizpuwonk f62289lqeggnwhkg = new iwizpuwonk(4, 10);

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public static final iwizpuwonk f62290nufgyqmvbu = new iwizpuwonk(5, 10);

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public static final iwizpuwonk f62286dxjokdxxww = new iwizpuwonk(6, 10);

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public static final iwizpuwonk f62285btonecajqb = new iwizpuwonk(6, 8);

    public iwizpuwonk(int i13, int i14) {
        this.f62293iobyxmoadg = i13;
        this.f62294zoijcleaow = i14;
    }

    private static String ppxfxbqfkf(int i13) {
        switch (i13) {
            case 0:
                return "UNSPECIFIED";
            case 1:
                return "SDR";
            case 2:
                return "HDR_UNSPECIFIED";
            case 3:
                return "HLG";
            case 4:
                return "HDR10";
            case 5:
                return "HDR10_PLUS";
            case 6:
                return "DOLBY_VISION";
            default:
                return "<Unknown>";
        }
    }

    public boolean eablkybsjg() {
        return (zoijcleaow() == 0 || zoijcleaow() == 2 || iobyxmoadg() == 0) ? false : true;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof iwizpuwonk)) {
            return false;
        }
        iwizpuwonk iwizpuwonkVar = (iwizpuwonk) obj;
        return this.f62293iobyxmoadg == iwizpuwonkVar.zoijcleaow() && this.f62294zoijcleaow == iwizpuwonkVar.iobyxmoadg();
    }

    public int hashCode() {
        return ((this.f62293iobyxmoadg ^ 1000003) * 1000003) ^ this.f62294zoijcleaow;
    }

    public int iobyxmoadg() {
        return this.f62294zoijcleaow;
    }

    public String toString() {
        return "DynamicRange@" + Integer.toHexString(System.identityHashCode(this)) + "{encoding=" + ppxfxbqfkf(this.f62293iobyxmoadg) + ", bitDepth=" + this.f62294zoijcleaow + "}";
    }

    public boolean wkgbmnqykc() {
        return eablkybsjg() && zoijcleaow() != 1 && iobyxmoadg() == 10;
    }

    public int zoijcleaow() {
        return this.f62293iobyxmoadg;
    }
}
