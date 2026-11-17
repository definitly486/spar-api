package qn;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f79207eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final boolean f79208gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final rm.zoijcleaow f79209iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f79210ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f79211wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f79212zoijcleaow;

    public iobyxmoadg(rm.zoijcleaow selectedDeliveryType, String addressText, boolean z13, boolean z14, boolean z15, boolean z16) {
        zdlpuopuiu.btonecajqb(selectedDeliveryType, "selectedDeliveryType");
        zdlpuopuiu.btonecajqb(addressText, "addressText");
        this.f79209iobyxmoadg = selectedDeliveryType;
        this.f79212zoijcleaow = addressText;
        this.f79210ppxfxbqfkf = z13;
        this.f79211wkgbmnqykc = z14;
        this.f79207eablkybsjg = z15;
        this.f79208gxszxtbevo = z16;
    }

    public final boolean eablkybsjg() {
        return this.f79207eablkybsjg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return this.f79209iobyxmoadg == iobyxmoadgVar.f79209iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f79212zoijcleaow, iobyxmoadgVar.f79212zoijcleaow) && this.f79210ppxfxbqfkf == iobyxmoadgVar.f79210ppxfxbqfkf && this.f79211wkgbmnqykc == iobyxmoadgVar.f79211wkgbmnqykc && this.f79207eablkybsjg == iobyxmoadgVar.f79207eablkybsjg && this.f79208gxszxtbevo == iobyxmoadgVar.f79208gxszxtbevo;
    }

    public final boolean gxszxtbevo() {
        return this.f79211wkgbmnqykc;
    }

    public int hashCode() {
        return (((((((((this.f79209iobyxmoadg.hashCode() * 31) + this.f79212zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f79210ppxfxbqfkf)) * 31) + Boolean.hashCode(this.f79211wkgbmnqykc)) * 31) + Boolean.hashCode(this.f79207eablkybsjg)) * 31) + Boolean.hashCode(this.f79208gxszxtbevo);
    }

    public final String iobyxmoadg() {
        return this.f79212zoijcleaow;
    }

    public final boolean ppxfxbqfkf() {
        return this.f79208gxszxtbevo;
    }

    public String toString() {
        return "AddressMapBottomBarUiModel(selectedDeliveryType=" + this.f79209iobyxmoadg + ", addressText=" + this.f79212zoijcleaow + ", isBtnAcceptEnabled=" + this.f79210ppxfxbqfkf + ", isNeededShowShimmer=" + this.f79211wkgbmnqykc + ", isIncludedInTheDeliveryArea=" + this.f79207eablkybsjg + ", typeSelectionEnable=" + this.f79208gxszxtbevo + ")";
    }

    public final boolean wkgbmnqykc() {
        return this.f79210ppxfxbqfkf;
    }

    public final rm.zoijcleaow zoijcleaow() {
        return this.f79209iobyxmoadg;
    }
}
