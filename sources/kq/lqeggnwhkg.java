package kq;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class lqeggnwhkg implements btonecajqb {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f60375eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final float f60376iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f60377ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Integer f60378wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f60379zoijcleaow;

    public lqeggnwhkg(float f13, String text, String valuesDifference, Integer num, boolean z13) {
        zdlpuopuiu.btonecajqb(text, "text");
        zdlpuopuiu.btonecajqb(valuesDifference, "valuesDifference");
        this.f60376iobyxmoadg = f13;
        this.f60379zoijcleaow = text;
        this.f60377ppxfxbqfkf = valuesDifference;
        this.f60378wkgbmnqykc = num;
        this.f60375eablkybsjg = z13;
    }

    public final boolean eablkybsjg() {
        return this.f60375eablkybsjg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
        return Float.compare(this.f60376iobyxmoadg, lqeggnwhkgVar.f60376iobyxmoadg) == 0 && zdlpuopuiu.eablkybsjg(this.f60379zoijcleaow, lqeggnwhkgVar.f60379zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f60377ppxfxbqfkf, lqeggnwhkgVar.f60377ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f60378wkgbmnqykc, lqeggnwhkgVar.f60378wkgbmnqykc) && this.f60375eablkybsjg == lqeggnwhkgVar.f60375eablkybsjg;
    }

    @Override // kq.btonecajqb
    public Object getId() {
        return getType().name();
    }

    @Override // kq.btonecajqb
    public gtknphoqwx getType() {
        return gtknphoqwx.PROGRESS_BAR;
    }

    public int hashCode() {
        int iHashCode = ((((Float.hashCode(this.f60376iobyxmoadg) * 31) + this.f60379zoijcleaow.hashCode()) * 31) + this.f60377ppxfxbqfkf.hashCode()) * 31;
        Integer num = this.f60378wkgbmnqykc;
        return ((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Boolean.hashCode(this.f60375eablkybsjg);
    }

    public final Integer iobyxmoadg() {
        return this.f60378wkgbmnqykc;
    }

    public final String ppxfxbqfkf() {
        return this.f60379zoijcleaow;
    }

    public String toString() {
        return "CartProgressBarUiModel(progressPercent=" + this.f60376iobyxmoadg + ", text=" + this.f60379zoijcleaow + ", valuesDifference=" + this.f60377ppxfxbqfkf + ", color=" + this.f60378wkgbmnqykc + ", isClickable=" + this.f60375eablkybsjg + ")";
    }

    public final String wkgbmnqykc() {
        return this.f60377ppxfxbqfkf;
    }

    public final float zoijcleaow() {
        return this.f60376iobyxmoadg;
    }
}
