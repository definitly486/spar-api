package w0;

/* JADX INFO: loaded from: classes.dex */
public final class nufgyqmvbu implements Comparable {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final float f118268zdlpuopuiu;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public static final iobyxmoadg f118267yggfygwlhe = new iobyxmoadg(null);

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private static final float f118266jyumaefscl = lqeggnwhkg(0.0f);

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private static final float f118265iwizpuwonk = lqeggnwhkg(Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private static final float f118264cqumvgiudr = lqeggnwhkg(Float.NaN);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final float iobyxmoadg() {
            return nufgyqmvbu.f118266jyumaefscl;
        }

        public final float ppxfxbqfkf() {
            return nufgyqmvbu.f118264cqumvgiudr;
        }

        public final float zoijcleaow() {
            return nufgyqmvbu.f118265iwizpuwonk;
        }

        private iobyxmoadg() {
        }
    }

    private /* synthetic */ nufgyqmvbu(float f13) {
        this.f118268zdlpuopuiu = f13;
    }

    public static int btonecajqb(float f13) {
        return Float.hashCode(f13);
    }

    public static final boolean dxjokdxxww(float f13, float f14) {
        return Float.compare(f13, f14) == 0;
    }

    public static String gtknphoqwx(float f13) {
        if (Float.isNaN(f13)) {
            return "Dp.Unspecified";
        }
        return f13 + ".dp";
    }

    public static int gxszxtbevo(float f13, float f14) {
        return Float.compare(f13, f14);
    }

    public static float lqeggnwhkg(float f13) {
        return f13;
    }

    public static boolean nufgyqmvbu(float f13, Object obj) {
        return (obj instanceof nufgyqmvbu) && Float.compare(f13, ((nufgyqmvbu) obj).draadjrbmk()) == 0;
    }

    public static final /* synthetic */ nufgyqmvbu wkgbmnqykc(float f13) {
        return new nufgyqmvbu(f13);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return eablkybsjg(((nufgyqmvbu) obj).draadjrbmk());
    }

    public final /* synthetic */ float draadjrbmk() {
        return this.f118268zdlpuopuiu;
    }

    public int eablkybsjg(float f13) {
        return gxszxtbevo(this.f118268zdlpuopuiu, f13);
    }

    public boolean equals(Object obj) {
        return nufgyqmvbu(this.f118268zdlpuopuiu, obj);
    }

    public int hashCode() {
        return btonecajqb(this.f118268zdlpuopuiu);
    }

    public String toString() {
        return gtknphoqwx(this.f118268zdlpuopuiu);
    }
}
