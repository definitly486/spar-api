package b41;

import w0.agtfadlqog;

/* JADX INFO: loaded from: classes5.dex */
public final class draadjrbmk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final long f15128iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final float f15129ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f15130zoijcleaow;

    public /* synthetic */ draadjrbmk(long j13, boolean z13, float f13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(j13, z13, f13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof draadjrbmk)) {
            return false;
        }
        draadjrbmk draadjrbmkVar = (draadjrbmk) obj;
        return agtfadlqog.nufgyqmvbu(this.f15128iobyxmoadg, draadjrbmkVar.f15128iobyxmoadg) && this.f15130zoijcleaow == draadjrbmkVar.f15130zoijcleaow && Float.compare(this.f15129ppxfxbqfkf, draadjrbmkVar.f15129ppxfxbqfkf) == 0;
    }

    public int hashCode() {
        return (((agtfadlqog.gtknphoqwx(this.f15128iobyxmoadg) * 31) + Boolean.hashCode(this.f15130zoijcleaow)) * 31) + Float.hashCode(this.f15129ppxfxbqfkf);
    }

    public final float iobyxmoadg() {
        return this.f15129ppxfxbqfkf;
    }

    public final boolean ppxfxbqfkf() {
        return this.f15130zoijcleaow;
    }

    public String toString() {
        return "TooltipPopupPosition(offset=" + agtfadlqog.agtfadlqog(this.f15128iobyxmoadg) + ", isTop=" + this.f15130zoijcleaow + ", centerPositionX=" + this.f15129ppxfxbqfkf + ")";
    }

    public final long zoijcleaow() {
        return this.f15128iobyxmoadg;
    }

    private draadjrbmk(long j13, boolean z13, float f13) {
        this.f15128iobyxmoadg = j13;
        this.f15130zoijcleaow = z13;
        this.f15129ppxfxbqfkf = f13;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ draadjrbmk(long j13, boolean z13, float f13, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        if ((i13 & 1) != 0) {
            long j14 = 0;
            j13 = agtfadlqog.wkgbmnqykc((j14 & 4294967295L) | (j14 << 32));
        }
        this(j13, (i13 & 2) != 0 ? true : z13, (i13 & 4) != 0 ? 0.0f : f13, null);
    }
}
