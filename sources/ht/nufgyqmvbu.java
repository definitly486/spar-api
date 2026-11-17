package ht;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public static final int f41066lqeggnwhkg = 0;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f41067eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final boolean f41068gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f41069iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Integer f41070ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Integer f41071wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f41072zoijcleaow;

    public nufgyqmvbu(String title, String description, Integer num, Integer num2, String deliveryPrice, boolean z13) {
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(description, "description");
        zdlpuopuiu.btonecajqb(deliveryPrice, "deliveryPrice");
        this.f41069iobyxmoadg = title;
        this.f41072zoijcleaow = description;
        this.f41070ppxfxbqfkf = num;
        this.f41071wkgbmnqykc = num2;
        this.f41067eablkybsjg = deliveryPrice;
        this.f41068gxszxtbevo = z13;
    }

    public final String eablkybsjg() {
        return this.f41069iobyxmoadg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nufgyqmvbu)) {
            return false;
        }
        nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
        return zdlpuopuiu.eablkybsjg(this.f41069iobyxmoadg, nufgyqmvbuVar.f41069iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f41072zoijcleaow, nufgyqmvbuVar.f41072zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f41070ppxfxbqfkf, nufgyqmvbuVar.f41070ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f41071wkgbmnqykc, nufgyqmvbuVar.f41071wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f41067eablkybsjg, nufgyqmvbuVar.f41067eablkybsjg) && this.f41068gxszxtbevo == nufgyqmvbuVar.f41068gxszxtbevo;
    }

    public final boolean gxszxtbevo() {
        return this.f41068gxszxtbevo;
    }

    public int hashCode() {
        int iHashCode = ((this.f41069iobyxmoadg.hashCode() * 31) + this.f41072zoijcleaow.hashCode()) * 31;
        Integer num = this.f41070ppxfxbqfkf;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f41071wkgbmnqykc;
        return ((((iHashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31) + this.f41067eablkybsjg.hashCode()) * 31) + Boolean.hashCode(this.f41068gxszxtbevo);
    }

    public final String iobyxmoadg() {
        return this.f41067eablkybsjg;
    }

    public final Integer ppxfxbqfkf() {
        return this.f41071wkgbmnqykc;
    }

    public String toString() {
        return "MySparAddressBarUiModel(title=" + this.f41069iobyxmoadg + ", description=" + this.f41072zoijcleaow + ", iconRes=" + this.f41070ppxfxbqfkf + ", iconColorRes=" + this.f41071wkgbmnqykc + ", deliveryPrice=" + this.f41067eablkybsjg + ", isAddressTitleIconVisible=" + this.f41068gxszxtbevo + ")";
    }

    public final Integer wkgbmnqykc() {
        return this.f41070ppxfxbqfkf;
    }

    public final String zoijcleaow() {
        return this.f41072zoijcleaow;
    }
}
