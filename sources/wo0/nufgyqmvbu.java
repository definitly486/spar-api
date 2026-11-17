package wo0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class nufgyqmvbu implements gtknphoqwx {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f120317eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final float f120318iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f120319ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Integer f120320wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f120321zoijcleaow;

    public nufgyqmvbu(float f13, String text, String valuesDifference, Integer num, boolean z13) {
        zdlpuopuiu.btonecajqb(text, "text");
        zdlpuopuiu.btonecajqb(valuesDifference, "valuesDifference");
        this.f120318iobyxmoadg = f13;
        this.f120321zoijcleaow = text;
        this.f120319ppxfxbqfkf = valuesDifference;
        this.f120320wkgbmnqykc = num;
        this.f120317eablkybsjg = z13;
    }

    public final boolean eablkybsjg() {
        return this.f120317eablkybsjg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nufgyqmvbu)) {
            return false;
        }
        nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
        return Float.compare(this.f120318iobyxmoadg, nufgyqmvbuVar.f120318iobyxmoadg) == 0 && zdlpuopuiu.eablkybsjg(this.f120321zoijcleaow, nufgyqmvbuVar.f120321zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f120319ppxfxbqfkf, nufgyqmvbuVar.f120319ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f120320wkgbmnqykc, nufgyqmvbuVar.f120320wkgbmnqykc) && this.f120317eablkybsjg == nufgyqmvbuVar.f120317eablkybsjg;
    }

    @Override // wo0.gtknphoqwx
    public Object getId() {
        return getType().name();
    }

    @Override // wo0.gtknphoqwx
    public draadjrbmk getType() {
        return draadjrbmk.PROGRESS_BAR;
    }

    public int hashCode() {
        int iHashCode = ((((Float.hashCode(this.f120318iobyxmoadg) * 31) + this.f120321zoijcleaow.hashCode()) * 31) + this.f120319ppxfxbqfkf.hashCode()) * 31;
        Integer num = this.f120320wkgbmnqykc;
        return ((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Boolean.hashCode(this.f120317eablkybsjg);
    }

    public final Integer iobyxmoadg() {
        return this.f120320wkgbmnqykc;
    }

    public final String ppxfxbqfkf() {
        return this.f120321zoijcleaow;
    }

    public String toString() {
        return "CartProgressBarUiModel(progressPercent=" + this.f120318iobyxmoadg + ", text=" + this.f120321zoijcleaow + ", valuesDifference=" + this.f120319ppxfxbqfkf + ", color=" + this.f120320wkgbmnqykc + ", isClickable=" + this.f120317eablkybsjg + ")";
    }

    public final String wkgbmnqykc() {
        return this.f120319ppxfxbqfkf;
    }

    public final float zoijcleaow() {
        return this.f120318iobyxmoadg;
    }
}
