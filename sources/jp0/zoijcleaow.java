package jp0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f51904eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final String f51905gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f51906iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f51907ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f51908wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f51909zoijcleaow;

    public zoijcleaow(String itemId, String name, String icon, String placeholder, String deliveryTimeFormatted, String deliveryPriceFormatted) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(icon, "icon");
        zdlpuopuiu.btonecajqb(placeholder, "placeholder");
        zdlpuopuiu.btonecajqb(deliveryTimeFormatted, "deliveryTimeFormatted");
        zdlpuopuiu.btonecajqb(deliveryPriceFormatted, "deliveryPriceFormatted");
        this.f51906iobyxmoadg = itemId;
        this.f51909zoijcleaow = name;
        this.f51907ppxfxbqfkf = icon;
        this.f51908wkgbmnqykc = placeholder;
        this.f51904eablkybsjg = deliveryTimeFormatted;
        this.f51905gxszxtbevo = deliveryPriceFormatted;
    }

    public final String eablkybsjg() {
        return this.f51909zoijcleaow;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f51906iobyxmoadg, zoijcleaowVar.f51906iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f51909zoijcleaow, zoijcleaowVar.f51909zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f51907ppxfxbqfkf, zoijcleaowVar.f51907ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f51908wkgbmnqykc, zoijcleaowVar.f51908wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f51904eablkybsjg, zoijcleaowVar.f51904eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f51905gxszxtbevo, zoijcleaowVar.f51905gxszxtbevo);
    }

    public final String gxszxtbevo() {
        return this.f51908wkgbmnqykc;
    }

    public int hashCode() {
        return (((((((((this.f51906iobyxmoadg.hashCode() * 31) + this.f51909zoijcleaow.hashCode()) * 31) + this.f51907ppxfxbqfkf.hashCode()) * 31) + this.f51908wkgbmnqykc.hashCode()) * 31) + this.f51904eablkybsjg.hashCode()) * 31) + this.f51905gxszxtbevo.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f51905gxszxtbevo;
    }

    public final String ppxfxbqfkf() {
        return this.f51907ppxfxbqfkf;
    }

    public String toString() {
        return "RestaurantUiModel(itemId=" + this.f51906iobyxmoadg + ", name=" + this.f51909zoijcleaow + ", icon=" + this.f51907ppxfxbqfkf + ", placeholder=" + this.f51908wkgbmnqykc + ", deliveryTimeFormatted=" + this.f51904eablkybsjg + ", deliveryPriceFormatted=" + this.f51905gxszxtbevo + ")";
    }

    public final String wkgbmnqykc() {
        return this.f51906iobyxmoadg;
    }

    public final String zoijcleaow() {
        return this.f51904eablkybsjg;
    }
}
