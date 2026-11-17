package o51;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f72137eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f72138iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f72139ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f72140wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f72141zoijcleaow;

    public ppxfxbqfkf(String id2, String dayDate, String timeTitle, String deliveryPrice, boolean z13) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(dayDate, "dayDate");
        zdlpuopuiu.btonecajqb(timeTitle, "timeTitle");
        zdlpuopuiu.btonecajqb(deliveryPrice, "deliveryPrice");
        this.f72138iobyxmoadg = id2;
        this.f72141zoijcleaow = dayDate;
        this.f72139ppxfxbqfkf = timeTitle;
        this.f72140wkgbmnqykc = deliveryPrice;
        this.f72137eablkybsjg = z13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return zdlpuopuiu.eablkybsjg(this.f72138iobyxmoadg, ppxfxbqfkfVar.f72138iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f72141zoijcleaow, ppxfxbqfkfVar.f72141zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f72139ppxfxbqfkf, ppxfxbqfkfVar.f72139ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f72140wkgbmnqykc, ppxfxbqfkfVar.f72140wkgbmnqykc) && this.f72137eablkybsjg == ppxfxbqfkfVar.f72137eablkybsjg;
    }

    public int hashCode() {
        return (((((((this.f72138iobyxmoadg.hashCode() * 31) + this.f72141zoijcleaow.hashCode()) * 31) + this.f72139ppxfxbqfkf.hashCode()) * 31) + this.f72140wkgbmnqykc.hashCode()) * 31) + Boolean.hashCode(this.f72137eablkybsjg);
    }

    public final String iobyxmoadg() {
        return this.f72141zoijcleaow;
    }

    public final String ppxfxbqfkf() {
        return this.f72139ppxfxbqfkf;
    }

    public String toString() {
        return "TimeDeliveryIntervalUiModel(id=" + this.f72138iobyxmoadg + ", dayDate=" + this.f72141zoijcleaow + ", timeTitle=" + this.f72139ppxfxbqfkf + ", deliveryPrice=" + this.f72140wkgbmnqykc + ", isSelected=" + this.f72137eablkybsjg + ")";
    }

    public final boolean wkgbmnqykc() {
        return this.f72137eablkybsjg;
    }

    public final String zoijcleaow() {
        return this.f72140wkgbmnqykc;
    }
}
