package pp1;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import hg.jyumaefscl;
import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final List f77105btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final double f77106draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final c21.iobyxmoadg f77107dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f77108eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final String f77109gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final double f77110gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f77111iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final String f77112lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final String f77113nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f77114ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final boolean f77115wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f77116wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f77117zoijcleaow;

    public gxszxtbevo(int i13, String article, String name, String str, String amount, double d13, String pricePerUnit, String totalPrice, c21.iobyxmoadg measureType, List markCodes, String warningMessage, double d14, boolean z13) {
        zdlpuopuiu.btonecajqb(article, "article");
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(amount, "amount");
        zdlpuopuiu.btonecajqb(pricePerUnit, "pricePerUnit");
        zdlpuopuiu.btonecajqb(totalPrice, "totalPrice");
        zdlpuopuiu.btonecajqb(measureType, "measureType");
        zdlpuopuiu.btonecajqb(markCodes, "markCodes");
        zdlpuopuiu.btonecajqb(warningMessage, "warningMessage");
        this.f77111iobyxmoadg = i13;
        this.f77117zoijcleaow = article;
        this.f77114ppxfxbqfkf = name;
        this.f77116wkgbmnqykc = str;
        this.f77108eablkybsjg = amount;
        this.f77110gxszxtbevo = d13;
        this.f77112lqeggnwhkg = pricePerUnit;
        this.f77113nufgyqmvbu = totalPrice;
        this.f77107dxjokdxxww = measureType;
        this.f77105btonecajqb = markCodes;
        this.f77109gtknphoqwx = warningMessage;
        this.f77106draadjrbmk = d14;
        this.f77115wflxmlrfwp = z13;
    }

    public final String eablkybsjg() {
        return this.f77113nufgyqmvbu;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxszxtbevo)) {
            return false;
        }
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
        return this.f77111iobyxmoadg == gxszxtbevoVar.f77111iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f77117zoijcleaow, gxszxtbevoVar.f77117zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f77114ppxfxbqfkf, gxszxtbevoVar.f77114ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f77116wkgbmnqykc, gxszxtbevoVar.f77116wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f77108eablkybsjg, gxszxtbevoVar.f77108eablkybsjg) && Double.compare(this.f77110gxszxtbevo, gxszxtbevoVar.f77110gxszxtbevo) == 0 && zdlpuopuiu.eablkybsjg(this.f77112lqeggnwhkg, gxszxtbevoVar.f77112lqeggnwhkg) && zdlpuopuiu.eablkybsjg(this.f77113nufgyqmvbu, gxszxtbevoVar.f77113nufgyqmvbu) && this.f77107dxjokdxxww == gxszxtbevoVar.f77107dxjokdxxww && zdlpuopuiu.eablkybsjg(this.f77105btonecajqb, gxszxtbevoVar.f77105btonecajqb) && zdlpuopuiu.eablkybsjg(this.f77109gtknphoqwx, gxszxtbevoVar.f77109gtknphoqwx) && Double.compare(this.f77106draadjrbmk, gxszxtbevoVar.f77106draadjrbmk) == 0 && this.f77115wflxmlrfwp == gxszxtbevoVar.f77115wflxmlrfwp;
    }

    public final boolean gxszxtbevo() {
        return this.f77115wflxmlrfwp;
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.f77111iobyxmoadg) * 31) + this.f77117zoijcleaow.hashCode()) * 31) + this.f77114ppxfxbqfkf.hashCode()) * 31;
        String str = this.f77116wkgbmnqykc;
        return ((((((((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f77108eablkybsjg.hashCode()) * 31) + Double.hashCode(this.f77110gxszxtbevo)) * 31) + this.f77112lqeggnwhkg.hashCode()) * 31) + this.f77113nufgyqmvbu.hashCode()) * 31) + this.f77107dxjokdxxww.hashCode()) * 31) + this.f77105btonecajqb.hashCode()) * 31) + this.f77109gtknphoqwx.hashCode()) * 31) + Double.hashCode(this.f77106draadjrbmk)) * 31) + Boolean.hashCode(this.f77115wflxmlrfwp);
    }

    public final String iobyxmoadg() {
        return this.f77108eablkybsjg;
    }

    public final String ppxfxbqfkf() {
        return this.f77116wkgbmnqykc;
    }

    public String toString() {
        return "Model(id=" + this.f77111iobyxmoadg + ", article=" + this.f77117zoijcleaow + ", name=" + this.f77114ppxfxbqfkf + ", pictureUrl=" + this.f77116wkgbmnqykc + ", amount=" + this.f77108eablkybsjg + ", quantity=" + this.f77110gxszxtbevo + ", pricePerUnit=" + this.f77112lqeggnwhkg + ", totalPrice=" + this.f77113nufgyqmvbu + ", measureType=" + this.f77107dxjokdxxww + ", markCodes=" + this.f77105btonecajqb + ", warningMessage=" + this.f77109gtknphoqwx + ", price=" + this.f77106draadjrbmk + ", isLoading=" + this.f77115wflxmlrfwp + ")";
    }

    public final String wkgbmnqykc() {
        return this.f77112lqeggnwhkg;
    }

    public final String zoijcleaow() {
        return this.f77114ppxfxbqfkf;
    }

    public /* synthetic */ gxszxtbevo(int i13, String str, String str2, String str3, String str4, double d13, String str5, String str6, c21.iobyxmoadg iobyxmoadgVar, List list, String str7, double d14, boolean z13, int i14, gtknphoqwx gtknphoqwxVar) {
        this((i14 & 1) != 0 ? 0 : i13, (i14 & 2) != 0 ? "" : str, (i14 & 4) != 0 ? "" : str2, (i14 & 8) != 0 ? null : str3, (i14 & 16) != 0 ? "" : str4, (i14 & 32) != 0 ? 0.0d : d13, (i14 & 64) != 0 ? "" : str5, (i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? "" : str6, (i14 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? c21.iobyxmoadg.UNDEFINED : iobyxmoadgVar, (i14 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? jyumaefscl.wflxmlrfwp() : list, (i14 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? "" : str7, d14, (i14 & 4096) != 0 ? false : z13);
    }
}
