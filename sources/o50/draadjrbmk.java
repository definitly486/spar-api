package o50;

import w0.agtfadlqog;

/* JADX INFO: loaded from: classes4.dex */
public final class draadjrbmk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final long f72068iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final float f72069ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f72070zoijcleaow;

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
        return agtfadlqog.nufgyqmvbu(this.f72068iobyxmoadg, draadjrbmkVar.f72068iobyxmoadg) && this.f72070zoijcleaow == draadjrbmkVar.f72070zoijcleaow && Float.compare(this.f72069ppxfxbqfkf, draadjrbmkVar.f72069ppxfxbqfkf) == 0;
    }

    public int hashCode() {
        return (((agtfadlqog.gtknphoqwx(this.f72068iobyxmoadg) * 31) + Boolean.hashCode(this.f72070zoijcleaow)) * 31) + Float.hashCode(this.f72069ppxfxbqfkf);
    }

    public final float iobyxmoadg() {
        return this.f72069ppxfxbqfkf;
    }

    public final boolean ppxfxbqfkf() {
        return this.f72070zoijcleaow;
    }

    public String toString() {
        return "TooltipPopupPosition(offset=" + agtfadlqog.agtfadlqog(this.f72068iobyxmoadg) + ", isTop=" + this.f72070zoijcleaow + ", centerPositionX=" + this.f72069ppxfxbqfkf + ")";
    }

    public final long zoijcleaow() {
        return this.f72068iobyxmoadg;
    }

    private draadjrbmk(long j13, boolean z13, float f13) {
        this.f72068iobyxmoadg = j13;
        this.f72070zoijcleaow = z13;
        this.f72069ppxfxbqfkf = f13;
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
