package pf0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final q00.zoijcleaow f76516iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final zoijcleaow f76517zoijcleaow;

    public iobyxmoadg(q00.zoijcleaow banner, zoijcleaow popupType) {
        zdlpuopuiu.btonecajqb(banner, "banner");
        zdlpuopuiu.btonecajqb(popupType, "popupType");
        this.f76516iobyxmoadg = banner;
        this.f76517zoijcleaow = popupType;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f76516iobyxmoadg, iobyxmoadgVar.f76516iobyxmoadg) && this.f76517zoijcleaow == iobyxmoadgVar.f76517zoijcleaow;
    }

    public int hashCode() {
        return (this.f76516iobyxmoadg.hashCode() * 31) + this.f76517zoijcleaow.hashCode();
    }

    public final q00.zoijcleaow iobyxmoadg() {
        return this.f76516iobyxmoadg;
    }

    public String toString() {
        return "BannerPopup(banner=" + this.f76516iobyxmoadg + ", popupType=" + this.f76517zoijcleaow + ")";
    }

    public final zoijcleaow zoijcleaow() {
        return this.f76517zoijcleaow;
    }
}
