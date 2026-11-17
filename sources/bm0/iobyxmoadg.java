package bm0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f16784eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final boolean f16785gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final cl0.zoijcleaow f16786iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f16787ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f16788wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f16789zoijcleaow;

    public iobyxmoadg(cl0.zoijcleaow selectedDeliveryType, String addressText, boolean z13, boolean z14, boolean z15, boolean z16) {
        zdlpuopuiu.btonecajqb(selectedDeliveryType, "selectedDeliveryType");
        zdlpuopuiu.btonecajqb(addressText, "addressText");
        this.f16786iobyxmoadg = selectedDeliveryType;
        this.f16789zoijcleaow = addressText;
        this.f16787ppxfxbqfkf = z13;
        this.f16788wkgbmnqykc = z14;
        this.f16784eablkybsjg = z15;
        this.f16785gxszxtbevo = z16;
    }

    public final boolean eablkybsjg() {
        return this.f16784eablkybsjg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return this.f16786iobyxmoadg == iobyxmoadgVar.f16786iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f16789zoijcleaow, iobyxmoadgVar.f16789zoijcleaow) && this.f16787ppxfxbqfkf == iobyxmoadgVar.f16787ppxfxbqfkf && this.f16788wkgbmnqykc == iobyxmoadgVar.f16788wkgbmnqykc && this.f16784eablkybsjg == iobyxmoadgVar.f16784eablkybsjg && this.f16785gxszxtbevo == iobyxmoadgVar.f16785gxszxtbevo;
    }

    public final boolean gxszxtbevo() {
        return this.f16788wkgbmnqykc;
    }

    public int hashCode() {
        return (((((((((this.f16786iobyxmoadg.hashCode() * 31) + this.f16789zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f16787ppxfxbqfkf)) * 31) + Boolean.hashCode(this.f16788wkgbmnqykc)) * 31) + Boolean.hashCode(this.f16784eablkybsjg)) * 31) + Boolean.hashCode(this.f16785gxszxtbevo);
    }

    public final String iobyxmoadg() {
        return this.f16789zoijcleaow;
    }

    public final boolean ppxfxbqfkf() {
        return this.f16785gxszxtbevo;
    }

    public String toString() {
        return "AddressMapBottomBarUiModel(selectedDeliveryType=" + this.f16786iobyxmoadg + ", addressText=" + this.f16789zoijcleaow + ", isBtnAcceptEnabled=" + this.f16787ppxfxbqfkf + ", isNeededShowShimmer=" + this.f16788wkgbmnqykc + ", isIncludedInTheDeliveryArea=" + this.f16784eablkybsjg + ", typeSelectionEnable=" + this.f16785gxszxtbevo + ")";
    }

    public final boolean wkgbmnqykc() {
        return this.f16787ppxfxbqfkf;
    }

    public final cl0.zoijcleaow zoijcleaow() {
        return this.f16786iobyxmoadg;
    }
}
