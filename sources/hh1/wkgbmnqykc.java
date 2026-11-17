package hh1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final iobyxmoadg f40408iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final eablkybsjg f40409zoijcleaow;

    public wkgbmnqykc(iobyxmoadg banner, eablkybsjg popupType) {
        zdlpuopuiu.btonecajqb(banner, "banner");
        zdlpuopuiu.btonecajqb(popupType, "popupType");
        this.f40408iobyxmoadg = banner;
        this.f40409zoijcleaow = popupType;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkgbmnqykc)) {
            return false;
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
        return zdlpuopuiu.eablkybsjg(this.f40408iobyxmoadg, wkgbmnqykcVar.f40408iobyxmoadg) && this.f40409zoijcleaow == wkgbmnqykcVar.f40409zoijcleaow;
    }

    public int hashCode() {
        return (this.f40408iobyxmoadg.hashCode() * 31) + this.f40409zoijcleaow.hashCode();
    }

    public final iobyxmoadg iobyxmoadg() {
        return this.f40408iobyxmoadg;
    }

    public String toString() {
        return "BannerPopup(banner=" + this.f40408iobyxmoadg + ", popupType=" + this.f40409zoijcleaow + ")";
    }

    public final eablkybsjg zoijcleaow() {
        return this.f40409zoijcleaow;
    }
}
