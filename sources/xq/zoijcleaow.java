package xq;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f123020eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final String f123021gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f123022iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f123023ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f123024wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f123025zoijcleaow;

    public zoijcleaow(String itemId, String name, String icon, String placeholder, String deliveryTimeFormatted, String deliveryPriceFormatted) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(icon, "icon");
        zdlpuopuiu.btonecajqb(placeholder, "placeholder");
        zdlpuopuiu.btonecajqb(deliveryTimeFormatted, "deliveryTimeFormatted");
        zdlpuopuiu.btonecajqb(deliveryPriceFormatted, "deliveryPriceFormatted");
        this.f123022iobyxmoadg = itemId;
        this.f123025zoijcleaow = name;
        this.f123023ppxfxbqfkf = icon;
        this.f123024wkgbmnqykc = placeholder;
        this.f123020eablkybsjg = deliveryTimeFormatted;
        this.f123021gxszxtbevo = deliveryPriceFormatted;
    }

    public final String eablkybsjg() {
        return this.f123025zoijcleaow;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f123022iobyxmoadg, zoijcleaowVar.f123022iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f123025zoijcleaow, zoijcleaowVar.f123025zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f123023ppxfxbqfkf, zoijcleaowVar.f123023ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f123024wkgbmnqykc, zoijcleaowVar.f123024wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f123020eablkybsjg, zoijcleaowVar.f123020eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f123021gxszxtbevo, zoijcleaowVar.f123021gxszxtbevo);
    }

    public final String gxszxtbevo() {
        return this.f123024wkgbmnqykc;
    }

    public int hashCode() {
        return (((((((((this.f123022iobyxmoadg.hashCode() * 31) + this.f123025zoijcleaow.hashCode()) * 31) + this.f123023ppxfxbqfkf.hashCode()) * 31) + this.f123024wkgbmnqykc.hashCode()) * 31) + this.f123020eablkybsjg.hashCode()) * 31) + this.f123021gxszxtbevo.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f123021gxszxtbevo;
    }

    public final String ppxfxbqfkf() {
        return this.f123023ppxfxbqfkf;
    }

    public String toString() {
        return "RestaurantUiModel(itemId=" + this.f123022iobyxmoadg + ", name=" + this.f123025zoijcleaow + ", icon=" + this.f123023ppxfxbqfkf + ", placeholder=" + this.f123024wkgbmnqykc + ", deliveryTimeFormatted=" + this.f123020eablkybsjg + ", deliveryPriceFormatted=" + this.f123021gxszxtbevo + ")";
    }

    public final String wkgbmnqykc() {
        return this.f123022iobyxmoadg;
    }

    public final String zoijcleaow() {
        return this.f123020eablkybsjg;
    }
}
