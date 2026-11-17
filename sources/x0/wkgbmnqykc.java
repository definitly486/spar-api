package x0;

/* JADX INFO: loaded from: classes.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final wkgbmnqykc f120885iobyxmoadg = new wkgbmnqykc();

    private wkgbmnqykc() {
    }

    public final float iobyxmoadg(float f13, float f14, float f15, float f16, float f17) {
        return zoijcleaow(f13, f14, Math.max(0.0f, Math.min(1.0f, ppxfxbqfkf(f15, f16, f17))));
    }

    public final float ppxfxbqfkf(float f13, float f14, float f15) {
        if (f13 == f14) {
            return 0.0f;
        }
        return (f15 - f13) / (f14 - f13);
    }

    public final float zoijcleaow(float f13, float f14, float f15) {
        return f13 + ((f14 - f13) * f15);
    }
}
