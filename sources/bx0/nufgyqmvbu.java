package bx0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f17290eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final CartProgressBarDeliveryTermsEntity f17291gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f17292iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final double f17293ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f17294wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final double f17295zoijcleaow;

    public nufgyqmvbu(String title, double d13, double d14, String valuesDifference, String progressColor, CartProgressBarDeliveryTermsEntity lqeggnwhkgVar) {
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(valuesDifference, "valuesDifference");
        zdlpuopuiu.btonecajqb(progressColor, "progressColor");
        this.f17292iobyxmoadg = title;
        this.f17295zoijcleaow = d13;
        this.f17293ppxfxbqfkf = d14;
        this.f17294wkgbmnqykc = valuesDifference;
        this.f17290eablkybsjg = progressColor;
        this.f17291gxszxtbevo = lqeggnwhkgVar;
    }

    public final String eablkybsjg() {
        return this.f17292iobyxmoadg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nufgyqmvbu)) {
            return false;
        }
        nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
        return zdlpuopuiu.eablkybsjg(this.f17292iobyxmoadg, nufgyqmvbuVar.f17292iobyxmoadg) && Double.compare(this.f17295zoijcleaow, nufgyqmvbuVar.f17295zoijcleaow) == 0 && Double.compare(this.f17293ppxfxbqfkf, nufgyqmvbuVar.f17293ppxfxbqfkf) == 0 && zdlpuopuiu.eablkybsjg(this.f17294wkgbmnqykc, nufgyqmvbuVar.f17294wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f17290eablkybsjg, nufgyqmvbuVar.f17290eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f17291gxszxtbevo, nufgyqmvbuVar.f17291gxszxtbevo);
    }

    public final String gxszxtbevo() {
        return this.f17294wkgbmnqykc;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.f17292iobyxmoadg.hashCode() * 31) + Double.hashCode(this.f17295zoijcleaow)) * 31) + Double.hashCode(this.f17293ppxfxbqfkf)) * 31) + this.f17294wkgbmnqykc.hashCode()) * 31) + this.f17290eablkybsjg.hashCode()) * 31;
        CartProgressBarDeliveryTermsEntity lqeggnwhkgVar = this.f17291gxszxtbevo;
        return iHashCode + (lqeggnwhkgVar == null ? 0 : lqeggnwhkgVar.hashCode());
    }

    public final double iobyxmoadg() {
        return this.f17295zoijcleaow;
    }

    public final double ppxfxbqfkf() {
        return this.f17293ppxfxbqfkf;
    }

    public String toString() {
        return "CartProgressBarEntity(title=" + this.f17292iobyxmoadg + ", currentValue=" + this.f17295zoijcleaow + ", neededValue=" + this.f17293ppxfxbqfkf + ", valuesDifference=" + this.f17294wkgbmnqykc + ", progressColor=" + this.f17290eablkybsjg + ", deliveryTerms=" + this.f17291gxszxtbevo + ")";
    }

    public final String wkgbmnqykc() {
        return this.f17290eablkybsjg;
    }

    public final CartProgressBarDeliveryTermsEntity zoijcleaow() {
        return this.f17291gxszxtbevo;
    }
}
