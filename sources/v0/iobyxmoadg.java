package v0;

/* JADX INFO: loaded from: classes.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final float f114983iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final C2860iobyxmoadg f114982zoijcleaow = new C2860iobyxmoadg(null);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final float f114980ppxfxbqfkf = eablkybsjg(0.5f);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final float f114981wkgbmnqykc = eablkybsjg(-0.5f);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final float f114979eablkybsjg = eablkybsjg(0.0f);

    /* JADX INFO: renamed from: v0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C2860iobyxmoadg {
        public /* synthetic */ C2860iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final float iobyxmoadg() {
            return iobyxmoadg.f114979eablkybsjg;
        }

        public final float ppxfxbqfkf() {
            return iobyxmoadg.f114980ppxfxbqfkf;
        }

        public final float zoijcleaow() {
            return iobyxmoadg.f114981wkgbmnqykc;
        }

        private C2860iobyxmoadg() {
        }
    }

    private /* synthetic */ iobyxmoadg(float f13) {
        this.f114983iobyxmoadg = f13;
    }

    public static String dxjokdxxww(float f13) {
        return "BaselineShift(multiplier=" + f13 + ')';
    }

    public static float eablkybsjg(float f13) {
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
        return this.f114983iobyxmoadg;
    }

    public boolean equals(Object obj) {
        return gxszxtbevo(this.f114983iobyxmoadg, obj);
    }

    public int hashCode() {
        return nufgyqmvbu(this.f114983iobyxmoadg);
    }

    public String toString() {
        return dxjokdxxww(this.f114983iobyxmoadg);
    }
}
