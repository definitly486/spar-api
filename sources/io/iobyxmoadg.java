package io;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import hg.jyumaefscl;
import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final EnumC1046iobyxmoadg f49040btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final Double f49041dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f49042eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final double f49043gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f49044iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final zoijcleaow f49045lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final double f49046nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f49047ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f49048wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f49049zoijcleaow;

    /* JADX INFO: renamed from: io.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public enum EnumC1046iobyxmoadg {
        RUB;


        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private static final /* synthetic */ ng.iobyxmoadg f49050jyumaefscl = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());
    }

    public enum zoijcleaow {
        AMOUNT,
        WEIGHT_PER_100,
        WEIGHT,
        UNDEFINED;


        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        private static final /* synthetic */ ng.iobyxmoadg f49054esjtqupxsv = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());
    }

    public iobyxmoadg(String id2, List hints, String productPhoto, int i13, String productName, double d13, zoijcleaow measureUiType, double d14, Double d15, EnumC1046iobyxmoadg currency) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(hints, "hints");
        zdlpuopuiu.btonecajqb(productPhoto, "productPhoto");
        zdlpuopuiu.btonecajqb(productName, "productName");
        zdlpuopuiu.btonecajqb(measureUiType, "measureUiType");
        zdlpuopuiu.btonecajqb(currency, "currency");
        this.f49044iobyxmoadg = id2;
        this.f49049zoijcleaow = hints;
        this.f49047ppxfxbqfkf = productPhoto;
        this.f49048wkgbmnqykc = i13;
        this.f49042eablkybsjg = productName;
        this.f49043gxszxtbevo = d13;
        this.f49045lqeggnwhkg = measureUiType;
        this.f49046nufgyqmvbu = d14;
        this.f49041dxjokdxxww = d15;
        this.f49040btonecajqb = currency;
    }

    public final String dxjokdxxww() {
        return this.f49047ppxfxbqfkf;
    }

    public final zoijcleaow eablkybsjg() {
        return this.f49045lqeggnwhkg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f49044iobyxmoadg, iobyxmoadgVar.f49044iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f49049zoijcleaow, iobyxmoadgVar.f49049zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f49047ppxfxbqfkf, iobyxmoadgVar.f49047ppxfxbqfkf) && this.f49048wkgbmnqykc == iobyxmoadgVar.f49048wkgbmnqykc && zdlpuopuiu.eablkybsjg(this.f49042eablkybsjg, iobyxmoadgVar.f49042eablkybsjg) && Double.compare(this.f49043gxszxtbevo, iobyxmoadgVar.f49043gxszxtbevo) == 0 && this.f49045lqeggnwhkg == iobyxmoadgVar.f49045lqeggnwhkg && Double.compare(this.f49046nufgyqmvbu, iobyxmoadgVar.f49046nufgyqmvbu) == 0 && zdlpuopuiu.eablkybsjg(this.f49041dxjokdxxww, iobyxmoadgVar.f49041dxjokdxxww) && this.f49040btonecajqb == iobyxmoadgVar.f49040btonecajqb;
    }

    public final Double gxszxtbevo() {
        return this.f49041dxjokdxxww;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((this.f49044iobyxmoadg.hashCode() * 31) + this.f49049zoijcleaow.hashCode()) * 31) + this.f49047ppxfxbqfkf.hashCode()) * 31) + Integer.hashCode(this.f49048wkgbmnqykc)) * 31) + this.f49042eablkybsjg.hashCode()) * 31) + Double.hashCode(this.f49043gxszxtbevo)) * 31) + this.f49045lqeggnwhkg.hashCode()) * 31) + Double.hashCode(this.f49046nufgyqmvbu)) * 31;
        Double d13 = this.f49041dxjokdxxww;
        return ((iHashCode + (d13 == null ? 0 : d13.hashCode())) * 31) + this.f49040btonecajqb.hashCode();
    }

    public final double iobyxmoadg() {
        return this.f49043gxszxtbevo;
    }

    public final double lqeggnwhkg() {
        return this.f49046nufgyqmvbu;
    }

    public final String nufgyqmvbu() {
        return this.f49042eablkybsjg;
    }

    public final int ppxfxbqfkf() {
        return this.f49048wkgbmnqykc;
    }

    public String toString() {
        return "ProductDayUiModel(id=" + this.f49044iobyxmoadg + ", hints=" + this.f49049zoijcleaow + ", productPhoto=" + this.f49047ppxfxbqfkf + ", discountAmount=" + this.f49048wkgbmnqykc + ", productName=" + this.f49042eablkybsjg + ", amount=" + this.f49043gxszxtbevo + ", measureUiType=" + this.f49045lqeggnwhkg + ", price=" + this.f49046nufgyqmvbu + ", oldPrice=" + this.f49041dxjokdxxww + ", currency=" + this.f49040btonecajqb + ")";
    }

    public final List wkgbmnqykc() {
        return this.f49049zoijcleaow;
    }

    public final EnumC1046iobyxmoadg zoijcleaow() {
        return this.f49040btonecajqb;
    }

    public /* synthetic */ iobyxmoadg(String str, List list, String str2, int i13, String str3, double d13, zoijcleaow zoijcleaowVar, double d14, Double d15, EnumC1046iobyxmoadg enumC1046iobyxmoadg, int i14, gtknphoqwx gtknphoqwxVar) {
        this((i14 & 1) != 0 ? "" : str, (i14 & 2) != 0 ? jyumaefscl.wflxmlrfwp() : list, (i14 & 4) != 0 ? "" : str2, (i14 & 8) != 0 ? 0 : i13, (i14 & 16) == 0 ? str3 : "", (i14 & 32) != 0 ? 0.0d : d13, (i14 & 64) != 0 ? zoijcleaow.UNDEFINED : zoijcleaowVar, (i14 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0 ? d14 : 0.0d, (i14 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? null : d15, (i14 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? EnumC1046iobyxmoadg.RUB : enumC1046iobyxmoadg);
    }
}
