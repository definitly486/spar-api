package sm0;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import hg.jyumaefscl;
import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final EnumC2645iobyxmoadg f107688btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final Double f107689dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f107690eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final double f107691gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f107692iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final zoijcleaow f107693lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final double f107694nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f107695ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f107696wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f107697zoijcleaow;

    /* JADX INFO: renamed from: sm0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public enum EnumC2645iobyxmoadg {
        RUB;


        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private static final /* synthetic */ ng.iobyxmoadg f107698jyumaefscl = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());
    }

    public enum zoijcleaow {
        AMOUNT,
        WEIGHT_PER_100,
        WEIGHT,
        UNDEFINED;


        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        private static final /* synthetic */ ng.iobyxmoadg f107702esjtqupxsv = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());
    }

    public iobyxmoadg(String id2, List hints, String productPhoto, int i13, String productName, double d13, zoijcleaow measureUiType, double d14, Double d15, EnumC2645iobyxmoadg currency) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(hints, "hints");
        zdlpuopuiu.btonecajqb(productPhoto, "productPhoto");
        zdlpuopuiu.btonecajqb(productName, "productName");
        zdlpuopuiu.btonecajqb(measureUiType, "measureUiType");
        zdlpuopuiu.btonecajqb(currency, "currency");
        this.f107692iobyxmoadg = id2;
        this.f107697zoijcleaow = hints;
        this.f107695ppxfxbqfkf = productPhoto;
        this.f107696wkgbmnqykc = i13;
        this.f107690eablkybsjg = productName;
        this.f107691gxszxtbevo = d13;
        this.f107693lqeggnwhkg = measureUiType;
        this.f107694nufgyqmvbu = d14;
        this.f107689dxjokdxxww = d15;
        this.f107688btonecajqb = currency;
    }

    public final String dxjokdxxww() {
        return this.f107695ppxfxbqfkf;
    }

    public final zoijcleaow eablkybsjg() {
        return this.f107693lqeggnwhkg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f107692iobyxmoadg, iobyxmoadgVar.f107692iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f107697zoijcleaow, iobyxmoadgVar.f107697zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f107695ppxfxbqfkf, iobyxmoadgVar.f107695ppxfxbqfkf) && this.f107696wkgbmnqykc == iobyxmoadgVar.f107696wkgbmnqykc && zdlpuopuiu.eablkybsjg(this.f107690eablkybsjg, iobyxmoadgVar.f107690eablkybsjg) && Double.compare(this.f107691gxszxtbevo, iobyxmoadgVar.f107691gxszxtbevo) == 0 && this.f107693lqeggnwhkg == iobyxmoadgVar.f107693lqeggnwhkg && Double.compare(this.f107694nufgyqmvbu, iobyxmoadgVar.f107694nufgyqmvbu) == 0 && zdlpuopuiu.eablkybsjg(this.f107689dxjokdxxww, iobyxmoadgVar.f107689dxjokdxxww) && this.f107688btonecajqb == iobyxmoadgVar.f107688btonecajqb;
    }

    public final Double gxszxtbevo() {
        return this.f107689dxjokdxxww;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((this.f107692iobyxmoadg.hashCode() * 31) + this.f107697zoijcleaow.hashCode()) * 31) + this.f107695ppxfxbqfkf.hashCode()) * 31) + Integer.hashCode(this.f107696wkgbmnqykc)) * 31) + this.f107690eablkybsjg.hashCode()) * 31) + Double.hashCode(this.f107691gxszxtbevo)) * 31) + this.f107693lqeggnwhkg.hashCode()) * 31) + Double.hashCode(this.f107694nufgyqmvbu)) * 31;
        Double d13 = this.f107689dxjokdxxww;
        return ((iHashCode + (d13 == null ? 0 : d13.hashCode())) * 31) + this.f107688btonecajqb.hashCode();
    }

    public final double iobyxmoadg() {
        return this.f107691gxszxtbevo;
    }

    public final double lqeggnwhkg() {
        return this.f107694nufgyqmvbu;
    }

    public final String nufgyqmvbu() {
        return this.f107690eablkybsjg;
    }

    public final int ppxfxbqfkf() {
        return this.f107696wkgbmnqykc;
    }

    public String toString() {
        return "ProductDayUiModel(id=" + this.f107692iobyxmoadg + ", hints=" + this.f107697zoijcleaow + ", productPhoto=" + this.f107695ppxfxbqfkf + ", discountAmount=" + this.f107696wkgbmnqykc + ", productName=" + this.f107690eablkybsjg + ", amount=" + this.f107691gxszxtbevo + ", measureUiType=" + this.f107693lqeggnwhkg + ", price=" + this.f107694nufgyqmvbu + ", oldPrice=" + this.f107689dxjokdxxww + ", currency=" + this.f107688btonecajqb + ")";
    }

    public final List wkgbmnqykc() {
        return this.f107697zoijcleaow;
    }

    public final EnumC2645iobyxmoadg zoijcleaow() {
        return this.f107688btonecajqb;
    }

    public /* synthetic */ iobyxmoadg(String str, List list, String str2, int i13, String str3, double d13, zoijcleaow zoijcleaowVar, double d14, Double d15, EnumC2645iobyxmoadg enumC2645iobyxmoadg, int i14, gtknphoqwx gtknphoqwxVar) {
        this((i14 & 1) != 0 ? "" : str, (i14 & 2) != 0 ? jyumaefscl.wflxmlrfwp() : list, (i14 & 4) != 0 ? "" : str2, (i14 & 8) != 0 ? 0 : i13, (i14 & 16) == 0 ? str3 : "", (i14 & 32) != 0 ? 0.0d : d13, (i14 & 64) != 0 ? zoijcleaow.UNDEFINED : zoijcleaowVar, (i14 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0 ? d14 : 0.0d, (i14 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? null : d15, (i14 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? EnumC2645iobyxmoadg.RUB : enumC2645iobyxmoadg);
    }
}
