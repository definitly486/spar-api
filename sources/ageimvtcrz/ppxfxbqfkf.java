package ageimvtcrz;

/* JADX INFO: loaded from: classes.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final float f1843iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final float f1844ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final float f1845wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final float f1846zoijcleaow;

    public ppxfxbqfkf(float f13, float f14, float f15, float f16) {
        this.f1843iobyxmoadg = f13;
        this.f1846zoijcleaow = f14;
        this.f1844ppxfxbqfkf = f15;
        this.f1845wkgbmnqykc = f16;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return this.f1843iobyxmoadg == ppxfxbqfkfVar.f1843iobyxmoadg && this.f1846zoijcleaow == ppxfxbqfkfVar.f1846zoijcleaow && this.f1844ppxfxbqfkf == ppxfxbqfkfVar.f1844ppxfxbqfkf && this.f1845wkgbmnqykc == ppxfxbqfkfVar.f1845wkgbmnqykc;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f1843iobyxmoadg) * 31) + Float.hashCode(this.f1846zoijcleaow)) * 31) + Float.hashCode(this.f1844ppxfxbqfkf)) * 31) + Float.hashCode(this.f1845wkgbmnqykc);
    }

    public final float iobyxmoadg() {
        return this.f1843iobyxmoadg;
    }

    public final float ppxfxbqfkf() {
        return this.f1844ppxfxbqfkf;
    }

    public String toString() {
        return "RippleAlpha(draggedAlpha=" + this.f1843iobyxmoadg + ", focusedAlpha=" + this.f1846zoijcleaow + ", hoveredAlpha=" + this.f1844ppxfxbqfkf + ", pressedAlpha=" + this.f1845wkgbmnqykc + ')';
    }

    public final float wkgbmnqykc() {
        return this.f1845wkgbmnqykc;
    }

    public final float zoijcleaow() {
        return this.f1846zoijcleaow;
    }
}
