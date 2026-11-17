package gy;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f38724eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final CartProgressBarDeliveryTermsEntity f38725gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f38726iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final double f38727ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f38728wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final double f38729zoijcleaow;

    public nufgyqmvbu(String title, double d13, double d14, String valuesDifference, String progressColor, CartProgressBarDeliveryTermsEntity lqeggnwhkgVar) {
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(valuesDifference, "valuesDifference");
        zdlpuopuiu.btonecajqb(progressColor, "progressColor");
        this.f38726iobyxmoadg = title;
        this.f38729zoijcleaow = d13;
        this.f38727ppxfxbqfkf = d14;
        this.f38728wkgbmnqykc = valuesDifference;
        this.f38724eablkybsjg = progressColor;
        this.f38725gxszxtbevo = lqeggnwhkgVar;
    }

    public final String eablkybsjg() {
        return this.f38726iobyxmoadg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nufgyqmvbu)) {
            return false;
        }
        nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
        return zdlpuopuiu.eablkybsjg(this.f38726iobyxmoadg, nufgyqmvbuVar.f38726iobyxmoadg) && Double.compare(this.f38729zoijcleaow, nufgyqmvbuVar.f38729zoijcleaow) == 0 && Double.compare(this.f38727ppxfxbqfkf, nufgyqmvbuVar.f38727ppxfxbqfkf) == 0 && zdlpuopuiu.eablkybsjg(this.f38728wkgbmnqykc, nufgyqmvbuVar.f38728wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f38724eablkybsjg, nufgyqmvbuVar.f38724eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f38725gxszxtbevo, nufgyqmvbuVar.f38725gxszxtbevo);
    }

    public final String gxszxtbevo() {
        return this.f38728wkgbmnqykc;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.f38726iobyxmoadg.hashCode() * 31) + Double.hashCode(this.f38729zoijcleaow)) * 31) + Double.hashCode(this.f38727ppxfxbqfkf)) * 31) + this.f38728wkgbmnqykc.hashCode()) * 31) + this.f38724eablkybsjg.hashCode()) * 31;
        CartProgressBarDeliveryTermsEntity lqeggnwhkgVar = this.f38725gxszxtbevo;
        return iHashCode + (lqeggnwhkgVar == null ? 0 : lqeggnwhkgVar.hashCode());
    }

    public final double iobyxmoadg() {
        return this.f38729zoijcleaow;
    }

    public final double ppxfxbqfkf() {
        return this.f38727ppxfxbqfkf;
    }

    public String toString() {
        return "CartProgressBarEntity(title=" + this.f38726iobyxmoadg + ", currentValue=" + this.f38729zoijcleaow + ", neededValue=" + this.f38727ppxfxbqfkf + ", valuesDifference=" + this.f38728wkgbmnqykc + ", progressColor=" + this.f38724eablkybsjg + ", deliveryTerms=" + this.f38725gxszxtbevo + ")";
    }

    public final String wkgbmnqykc() {
        return this.f38724eablkybsjg;
    }

    public final CartProgressBarDeliveryTermsEntity zoijcleaow() {
        return this.f38725gxszxtbevo;
    }
}
