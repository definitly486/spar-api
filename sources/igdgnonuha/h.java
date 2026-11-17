package igdgnonuha;

/* JADX INFO: loaded from: classes.dex */
public final class h implements x6 {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final float f43001iobyxmoadg;

    public /* synthetic */ h(float f13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(f13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && w0.nufgyqmvbu.dxjokdxxww(this.f43001iobyxmoadg, ((h) obj).f43001iobyxmoadg);
    }

    public int hashCode() {
        return w0.nufgyqmvbu.btonecajqb(this.f43001iobyxmoadg);
    }

    @Override // igdgnonuha.x6
    public float iobyxmoadg(w0.wkgbmnqykc wkgbmnqykcVar, float f13, float f14) {
        return f13 + (wkgbmnqykcVar.I(this.f43001iobyxmoadg) * Math.signum(f14 - f13));
    }

    public String toString() {
        return "FixedThreshold(offset=" + ((Object) w0.nufgyqmvbu.gtknphoqwx(this.f43001iobyxmoadg)) + ')';
    }

    private h(float f13) {
        this.f43001iobyxmoadg = f13;
    }
}
