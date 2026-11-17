package da1;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class eablkybsjg {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final boolean f27323agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final List f27324btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final String f27325draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final String f27326dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f27327eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final String f27328gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final String f27329gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f27330iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final String f27331lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final iobyxmoadg f27332nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final boolean f27333ojitshcjhn;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f27334ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final String f27335wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f27336wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f27337zoijcleaow;

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
        this.f27330iobyxmoadg = itemId;
        this.f27337zoijcleaow = title;
        this.f27334ppxfxbqfkf = description;
        this.f27336wkgbmnqykc = expiredDate;
        this.f27327eablkybsjg = z13;
        this.f27329gxszxtbevo = promoCode;
        this.f27331lqeggnwhkg = backgroundColor;
        this.f27332nufgyqmvbu = promocodeBackgroundColors;
        this.f27326dxjokdxxww = imageUrl;
        this.f27324btonecajqb = hints;
        this.f27328gtknphoqwx = buttonText;
        this.f27325draadjrbmk = action;
        this.f27335wflxmlrfwp = reference;
        this.f27323agtfadlqog = z14;
        this.f27333ojitshcjhn = z15;
    }

    public final wkgbmnqykc agtfadlqog() {
        if (this.f27329gxszxtbevo.length() > 0) {
            return wkgbmnqykc.PROMO_CODE;
        }
        return this.f27333ojitshcjhn ? wkgbmnqykc.QR_CODE : wkgbmnqykc.DEFAULT;
    }

    public final String btonecajqb() {
        return this.f27329gxszxtbevo;
    }

    public final String draadjrbmk() {
        return this.f27335wflxmlrfwp;
    }

    public final String dxjokdxxww() {
        return this.f27330iobyxmoadg;
    }

    public final boolean eablkybsjg() {
        return this.f27323agtfadlqog;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eablkybsjg)) {
            return false;
        }
        eablkybsjg eablkybsjgVar = (eablkybsjg) obj;
        return zdlpuopuiu.eablkybsjg(this.f27330iobyxmoadg, eablkybsjgVar.f27330iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f27337zoijcleaow, eablkybsjgVar.f27337zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f27334ppxfxbqfkf, eablkybsjgVar.f27334ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f27336wkgbmnqykc, eablkybsjgVar.f27336wkgbmnqykc) && this.f27327eablkybsjg == eablkybsjgVar.f27327eablkybsjg && zdlpuopuiu.eablkybsjg(this.f27329gxszxtbevo, eablkybsjgVar.f27329gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f27331lqeggnwhkg, eablkybsjgVar.f27331lqeggnwhkg) && zdlpuopuiu.eablkybsjg(this.f27332nufgyqmvbu, eablkybsjgVar.f27332nufgyqmvbu) && zdlpuopuiu.eablkybsjg(this.f27326dxjokdxxww, eablkybsjgVar.f27326dxjokdxxww) && zdlpuopuiu.eablkybsjg(this.f27324btonecajqb, eablkybsjgVar.f27324btonecajqb) && zdlpuopuiu.eablkybsjg(this.f27328gtknphoqwx, eablkybsjgVar.f27328gtknphoqwx) && zdlpuopuiu.eablkybsjg(this.f27325draadjrbmk, eablkybsjgVar.f27325draadjrbmk) && zdlpuopuiu.eablkybsjg(this.f27335wflxmlrfwp, eablkybsjgVar.f27335wflxmlrfwp) && this.f27323agtfadlqog == eablkybsjgVar.f27323agtfadlqog && this.f27333ojitshcjhn == eablkybsjgVar.f27333ojitshcjhn;
    }

    public final iobyxmoadg gtknphoqwx() {
        return this.f27332nufgyqmvbu;
    }

    public final String gxszxtbevo() {
        return this.f27336wkgbmnqykc;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((this.f27330iobyxmoadg.hashCode() * 31) + this.f27337zoijcleaow.hashCode()) * 31) + this.f27334ppxfxbqfkf.hashCode()) * 31) + this.f27336wkgbmnqykc.hashCode()) * 31) + Boolean.hashCode(this.f27327eablkybsjg)) * 31) + this.f27329gxszxtbevo.hashCode()) * 31) + this.f27331lqeggnwhkg.hashCode()) * 31) + this.f27332nufgyqmvbu.hashCode()) * 31) + this.f27326dxjokdxxww.hashCode()) * 31) + this.f27324btonecajqb.hashCode()) * 31) + this.f27328gtknphoqwx.hashCode()) * 31) + this.f27325draadjrbmk.hashCode()) * 31) + this.f27335wflxmlrfwp.hashCode()) * 31) + Boolean.hashCode(this.f27323agtfadlqog)) * 31) + Boolean.hashCode(this.f27333ojitshcjhn);
    }

    public final String iobyxmoadg() {
        return this.f27325draadjrbmk;
    }

    public final List lqeggnwhkg() {
        return this.f27324btonecajqb;
    }

    public final String nufgyqmvbu() {
        return this.f27326dxjokdxxww;
    }

    public final boolean ojitshcjhn() {
        return this.f27327eablkybsjg;
    }

    public final String ppxfxbqfkf() {
        return this.f27328gtknphoqwx;
    }

    public String toString() {
        return "CouponUiModel(itemId=" + this.f27330iobyxmoadg + ", title=" + this.f27337zoijcleaow + ", description=" + this.f27334ppxfxbqfkf + ", expiredDate=" + this.f27336wkgbmnqykc + ", isHot=" + this.f27327eablkybsjg + ", promoCode=" + this.f27329gxszxtbevo + ", backgroundColor=" + this.f27331lqeggnwhkg + ", promocodeBackgroundColors=" + this.f27332nufgyqmvbu + ", imageUrl=" + this.f27326dxjokdxxww + ", hints=" + this.f27324btonecajqb + ", buttonText=" + this.f27328gtknphoqwx + ", action=" + this.f27325draadjrbmk + ", reference=" + this.f27335wflxmlrfwp + ", disabled=" + this.f27323agtfadlqog + ", qrButton=" + this.f27333ojitshcjhn + ")";
    }

    public final String wflxmlrfwp() {
        return this.f27337zoijcleaow;
    }

    public final String wkgbmnqykc() {
        return this.f27334ppxfxbqfkf;
    }

    public final String zoijcleaow() {
        return this.f27331lqeggnwhkg;
    }
}
