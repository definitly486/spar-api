package z60;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f129222eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f129223iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f129224ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f129225wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f129226zoijcleaow;

    public ppxfxbqfkf(String id2, String dayDate, String timeTitle, String deliveryPrice, boolean z13) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(dayDate, "dayDate");
        zdlpuopuiu.btonecajqb(timeTitle, "timeTitle");
        zdlpuopuiu.btonecajqb(deliveryPrice, "deliveryPrice");
        this.f129223iobyxmoadg = id2;
        this.f129226zoijcleaow = dayDate;
        this.f129224ppxfxbqfkf = timeTitle;
        this.f129225wkgbmnqykc = deliveryPrice;
        this.f129222eablkybsjg = z13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return zdlpuopuiu.eablkybsjg(this.f129223iobyxmoadg, ppxfxbqfkfVar.f129223iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f129226zoijcleaow, ppxfxbqfkfVar.f129226zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f129224ppxfxbqfkf, ppxfxbqfkfVar.f129224ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f129225wkgbmnqykc, ppxfxbqfkfVar.f129225wkgbmnqykc) && this.f129222eablkybsjg == ppxfxbqfkfVar.f129222eablkybsjg;
    }

    public int hashCode() {
        return (((((((this.f129223iobyxmoadg.hashCode() * 31) + this.f129226zoijcleaow.hashCode()) * 31) + this.f129224ppxfxbqfkf.hashCode()) * 31) + this.f129225wkgbmnqykc.hashCode()) * 31) + Boolean.hashCode(this.f129222eablkybsjg);
    }

    public final String iobyxmoadg() {
        return this.f129226zoijcleaow;
    }

    public final String ppxfxbqfkf() {
        return this.f129224ppxfxbqfkf;
    }

    public String toString() {
        return "TimeDeliveryIntervalUiModel(id=" + this.f129223iobyxmoadg + ", dayDate=" + this.f129226zoijcleaow + ", timeTitle=" + this.f129224ppxfxbqfkf + ", deliveryPrice=" + this.f129225wkgbmnqykc + ", isSelected=" + this.f129222eablkybsjg + ")";
    }

    public final boolean wkgbmnqykc() {
        return this.f129222eablkybsjg;
    }

    public final String zoijcleaow() {
        return this.f129225wkgbmnqykc;
    }
}
