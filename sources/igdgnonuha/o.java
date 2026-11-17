package igdgnonuha;

/* JADX INFO: loaded from: classes.dex */
public final class o implements x6 {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final float f43486iobyxmoadg;

    public o(float f13) {
        this.f43486iobyxmoadg = f13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && Float.compare(this.f43486iobyxmoadg, ((o) obj).f43486iobyxmoadg) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.f43486iobyxmoadg);
    }

    @Override // igdgnonuha.x6
    public float iobyxmoadg(w0.wkgbmnqykc wkgbmnqykcVar, float f13, float f14) {
        return y0.wkgbmnqykc.zoijcleaow(f13, f14, this.f43486iobyxmoadg);
    }

    public String toString() {
        return "FractionalThreshold(fraction=" + this.f43486iobyxmoadg + ')';
    }
}
