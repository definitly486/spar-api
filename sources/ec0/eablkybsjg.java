package ec0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class eablkybsjg {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final boolean f31086agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final List f31087btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final String f31088draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final String f31089dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f31090eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final String f31091gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final String f31092gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f31093iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final String f31094lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final iobyxmoadg f31095nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final boolean f31096ojitshcjhn;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f31097ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final String f31098wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f31099wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f31100zoijcleaow;

    public eablkybsjg(String itemId, String title, String description, String expiredDate, boolean z13, String promoCode, String backgroundColor, iobyxmoadg promocodeBackgroundColors, String imageUrl, List hints, String buttonText, String action, String reference, boolean z14, boolean z15) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(description, "description");
        zdlpuopuiu.btonecajqb(expiredDate, "expiredDate");
        zdlpuopuiu.btonecajqb(promoCode, "promoCode");
        zdlpuopuiu.btonecajqb(backgroundColor, "backgroundColor");
        zdlpuopuiu.btonecajqb(promocodeBackgroundColors, "promocodeBackgroundColors");
        zdlpuopuiu.btonecajqb(imageUrl, "imageUrl");
        zdlpuopuiu.btonecajqb(hints, "hints");
        zdlpuopuiu.btonecajqb(buttonText, "buttonText");
        zdlpuopuiu.btonecajqb(action, "action");
        zdlpuopuiu.btonecajqb(reference, "reference");
        this.f31093iobyxmoadg = itemId;
        this.f31100zoijcleaow = title;
        this.f31097ppxfxbqfkf = description;
        this.f31099wkgbmnqykc = expiredDate;
        this.f31090eablkybsjg = z13;
        this.f31092gxszxtbevo = promoCode;
        this.f31094lqeggnwhkg = backgroundColor;
        this.f31095nufgyqmvbu = promocodeBackgroundColors;
        this.f31089dxjokdxxww = imageUrl;
        this.f31087btonecajqb = hints;
        this.f31091gtknphoqwx = buttonText;
        this.f31088draadjrbmk = action;
        this.f31098wflxmlrfwp = reference;
        this.f31086agtfadlqog = z14;
        this.f31096ojitshcjhn = z15;
    }

    public final wkgbmnqykc agtfadlqog() {
        if (this.f31092gxszxtbevo.length() > 0) {
            return wkgbmnqykc.PROMO_CODE;
        }
        return this.f31096ojitshcjhn ? wkgbmnqykc.QR_CODE : wkgbmnqykc.DEFAULT;
    }

    public final String btonecajqb() {
        return this.f31092gxszxtbevo;
    }

    public final String draadjrbmk() {
        return this.f31098wflxmlrfwp;
    }

    public final String dxjokdxxww() {
        return this.f31093iobyxmoadg;
    }

    public final boolean eablkybsjg() {
        return this.f31086agtfadlqog;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eablkybsjg)) {
            return false;
        }
        eablkybsjg eablkybsjgVar = (eablkybsjg) obj;
        return zdlpuopuiu.eablkybsjg(this.f31093iobyxmoadg, eablkybsjgVar.f31093iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f31100zoijcleaow, eablkybsjgVar.f31100zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f31097ppxfxbqfkf, eablkybsjgVar.f31097ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f31099wkgbmnqykc, eablkybsjgVar.f31099wkgbmnqykc) && this.f31090eablkybsjg == eablkybsjgVar.f31090eablkybsjg && zdlpuopuiu.eablkybsjg(this.f31092gxszxtbevo, eablkybsjgVar.f31092gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f31094lqeggnwhkg, eablkybsjgVar.f31094lqeggnwhkg) && zdlpuopuiu.eablkybsjg(this.f31095nufgyqmvbu, eablkybsjgVar.f31095nufgyqmvbu) && zdlpuopuiu.eablkybsjg(this.f31089dxjokdxxww, eablkybsjgVar.f31089dxjokdxxww) && zdlpuopuiu.eablkybsjg(this.f31087btonecajqb, eablkybsjgVar.f31087btonecajqb) && zdlpuopuiu.eablkybsjg(this.f31091gtknphoqwx, eablkybsjgVar.f31091gtknphoqwx) && zdlpuopuiu.eablkybsjg(this.f31088draadjrbmk, eablkybsjgVar.f31088draadjrbmk) && zdlpuopuiu.eablkybsjg(this.f31098wflxmlrfwp, eablkybsjgVar.f31098wflxmlrfwp) && this.f31086agtfadlqog == eablkybsjgVar.f31086agtfadlqog && this.f31096ojitshcjhn == eablkybsjgVar.f31096ojitshcjhn;
    }

    public final iobyxmoadg gtknphoqwx() {
        return this.f31095nufgyqmvbu;
    }

    public final String gxszxtbevo() {
        return this.f31099wkgbmnqykc;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((this.f31093iobyxmoadg.hashCode() * 31) + this.f31100zoijcleaow.hashCode()) * 31) + this.f31097ppxfxbqfkf.hashCode()) * 31) + this.f31099wkgbmnqykc.hashCode()) * 31) + Boolean.hashCode(this.f31090eablkybsjg)) * 31) + this.f31092gxszxtbevo.hashCode()) * 31) + this.f31094lqeggnwhkg.hashCode()) * 31) + this.f31095nufgyqmvbu.hashCode()) * 31) + this.f31089dxjokdxxww.hashCode()) * 31) + this.f31087btonecajqb.hashCode()) * 31) + this.f31091gtknphoqwx.hashCode()) * 31) + this.f31088draadjrbmk.hashCode()) * 31) + this.f31098wflxmlrfwp.hashCode()) * 31) + Boolean.hashCode(this.f31086agtfadlqog)) * 31) + Boolean.hashCode(this.f31096ojitshcjhn);
    }

    public final String iobyxmoadg() {
        return this.f31088draadjrbmk;
    }

    public final List lqeggnwhkg() {
        return this.f31087btonecajqb;
    }

    public final String nufgyqmvbu() {
        return this.f31089dxjokdxxww;
    }

    public final boolean ojitshcjhn() {
        return this.f31090eablkybsjg;
    }

    public final String ppxfxbqfkf() {
        return this.f31091gtknphoqwx;
    }

    public String toString() {
        return "CouponUiModel(itemId=" + this.f31093iobyxmoadg + ", title=" + this.f31100zoijcleaow + ", description=" + this.f31097ppxfxbqfkf + ", expiredDate=" + this.f31099wkgbmnqykc + ", isHot=" + this.f31090eablkybsjg + ", promoCode=" + this.f31092gxszxtbevo + ", backgroundColor=" + this.f31094lqeggnwhkg + ", promocodeBackgroundColors=" + this.f31095nufgyqmvbu + ", imageUrl=" + this.f31089dxjokdxxww + ", hints=" + this.f31087btonecajqb + ", buttonText=" + this.f31091gtknphoqwx + ", action=" + this.f31088draadjrbmk + ", reference=" + this.f31098wflxmlrfwp + ", disabled=" + this.f31086agtfadlqog + ", qrButton=" + this.f31096ojitshcjhn + ")";
    }

    public final String wflxmlrfwp() {
        return this.f31100zoijcleaow;
    }

    public final String wkgbmnqykc() {
        return this.f31097ppxfxbqfkf;
    }

    public final String zoijcleaow() {
        return this.f31094lqeggnwhkg;
    }
}
