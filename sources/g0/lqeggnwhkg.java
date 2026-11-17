package g0;

/* JADX INFO: loaded from: classes.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final float f35725iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f35726ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final zg.gxszxtbevo f35727zoijcleaow;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final iobyxmoadg f35724wkgbmnqykc = new iobyxmoadg(null);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final lqeggnwhkg f35723eablkybsjg = new lqeggnwhkg(0.0f, zg.gtknphoqwx.ppxfxbqfkf(0.0f, 0.0f), 0, 4, null);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final lqeggnwhkg iobyxmoadg() {
            return lqeggnwhkg.f35723eablkybsjg;
        }

        private iobyxmoadg() {
        }
    }

    public lqeggnwhkg(float f13, zg.gxszxtbevo gxszxtbevoVar, int i13) {
        this.f35725iobyxmoadg = f13;
        this.f35727zoijcleaow = gxszxtbevoVar;
        this.f35726ppxfxbqfkf = i13;
        if (Float.isNaN(f13)) {
            throw new IllegalArgumentException("current must not be NaN");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
        return this.f35725iobyxmoadg == lqeggnwhkgVar.f35725iobyxmoadg && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f35727zoijcleaow, lqeggnwhkgVar.f35727zoijcleaow) && this.f35726ppxfxbqfkf == lqeggnwhkgVar.f35726ppxfxbqfkf;
    }

    public int hashCode() {
        return (((Float.hashCode(this.f35725iobyxmoadg) * 31) + this.f35727zoijcleaow.hashCode()) * 31) + this.f35726ppxfxbqfkf;
    }

    public final zg.gxszxtbevo ppxfxbqfkf() {
        return this.f35727zoijcleaow;
    }

    public String toString() {
        return "ProgressBarRangeInfo(current=" + this.f35725iobyxmoadg + ", range=" + this.f35727zoijcleaow + ", steps=" + this.f35726ppxfxbqfkf + ')';
    }

    public final int wkgbmnqykc() {
        return this.f35726ppxfxbqfkf;
    }

    public final float zoijcleaow() {
        return this.f35725iobyxmoadg;
    }

    public /* synthetic */ lqeggnwhkg(float f13, zg.gxszxtbevo gxszxtbevoVar, int i13, int i14, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(f13, gxszxtbevoVar, (i14 & 4) != 0 ? 0 : i13);
    }
}
