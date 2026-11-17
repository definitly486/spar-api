package u;

/* JADX INFO: loaded from: classes.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private long f112394iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private float f112395zoijcleaow;

    public iobyxmoadg(long j13, float f13) {
        this.f112394iobyxmoadg = j13;
        this.f112395zoijcleaow = f13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return this.f112394iobyxmoadg == iobyxmoadgVar.f112394iobyxmoadg && Float.compare(this.f112395zoijcleaow, iobyxmoadgVar.f112395zoijcleaow) == 0;
    }

    public int hashCode() {
        return (Long.hashCode(this.f112394iobyxmoadg) * 31) + Float.hashCode(this.f112395zoijcleaow);
    }

    public final float iobyxmoadg() {
        return this.f112395zoijcleaow;
    }

    public final void ppxfxbqfkf(float f13) {
        this.f112395zoijcleaow = f13;
    }

    public String toString() {
        return "DataPointAtTime(time=" + this.f112394iobyxmoadg + ", dataPoint=" + this.f112395zoijcleaow + ')';
    }

    public final void wkgbmnqykc(long j13) {
        this.f112394iobyxmoadg = j13;
    }

    public final long zoijcleaow() {
        return this.f112394iobyxmoadg;
    }
}
