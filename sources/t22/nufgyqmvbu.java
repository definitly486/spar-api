package t22;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import hg.jyumaefscl;
import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final boolean f109339agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final List f109340btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final f22.iobyxmoadg f109341draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final x30.iobyxmoadg f109342dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f109343eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final String f109344gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final double f109345gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f109346iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final String f109347lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final String f109348nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f109349ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final boolean f109350wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f109351wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f109352zoijcleaow;

    public nufgyqmvbu(int i13, String article, String name, String str, String amount, double d13, String pricePerUnit, String totalPrice, x30.iobyxmoadg measureType, List markCodes, String warningMessage, f22.iobyxmoadg scanGoAmountMode, boolean z13, boolean z14) {
        zdlpuopuiu.btonecajqb(article, "article");
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(amount, "amount");
        zdlpuopuiu.btonecajqb(pricePerUnit, "pricePerUnit");
        zdlpuopuiu.btonecajqb(totalPrice, "totalPrice");
        zdlpuopuiu.btonecajqb(measureType, "measureType");
        zdlpuopuiu.btonecajqb(markCodes, "markCodes");
        zdlpuopuiu.btonecajqb(warningMessage, "warningMessage");
        zdlpuopuiu.btonecajqb(scanGoAmountMode, "scanGoAmountMode");
        this.f109346iobyxmoadg = i13;
        this.f109352zoijcleaow = article;
        this.f109349ppxfxbqfkf = name;
        this.f109351wkgbmnqykc = str;
        this.f109343eablkybsjg = amount;
        this.f109345gxszxtbevo = d13;
        this.f109347lqeggnwhkg = pricePerUnit;
        this.f109348nufgyqmvbu = totalPrice;
        this.f109342dxjokdxxww = measureType;
        this.f109340btonecajqb = markCodes;
        this.f109344gtknphoqwx = warningMessage;
        this.f109341draadjrbmk = scanGoAmountMode;
        this.f109350wflxmlrfwp = z13;
        this.f109339agtfadlqog = z14;
    }

    public final double eablkybsjg() {
        return this.f109345gxszxtbevo;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nufgyqmvbu)) {
            return false;
        }
        nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
        return this.f109346iobyxmoadg == nufgyqmvbuVar.f109346iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f109352zoijcleaow, nufgyqmvbuVar.f109352zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f109349ppxfxbqfkf, nufgyqmvbuVar.f109349ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f109351wkgbmnqykc, nufgyqmvbuVar.f109351wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f109343eablkybsjg, nufgyqmvbuVar.f109343eablkybsjg) && Double.compare(this.f109345gxszxtbevo, nufgyqmvbuVar.f109345gxszxtbevo) == 0 && zdlpuopuiu.eablkybsjg(this.f109347lqeggnwhkg, nufgyqmvbuVar.f109347lqeggnwhkg) && zdlpuopuiu.eablkybsjg(this.f109348nufgyqmvbu, nufgyqmvbuVar.f109348nufgyqmvbu) && this.f109342dxjokdxxww == nufgyqmvbuVar.f109342dxjokdxxww && zdlpuopuiu.eablkybsjg(this.f109340btonecajqb, nufgyqmvbuVar.f109340btonecajqb) && zdlpuopuiu.eablkybsjg(this.f109344gtknphoqwx, nufgyqmvbuVar.f109344gtknphoqwx) && this.f109341draadjrbmk == nufgyqmvbuVar.f109341draadjrbmk && this.f109350wflxmlrfwp == nufgyqmvbuVar.f109350wflxmlrfwp && this.f109339agtfadlqog == nufgyqmvbuVar.f109339agtfadlqog;
    }

    public final String gxszxtbevo() {
        return this.f109348nufgyqmvbu;
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.f109346iobyxmoadg) * 31) + this.f109352zoijcleaow.hashCode()) * 31) + this.f109349ppxfxbqfkf.hashCode()) * 31;
        String str = this.f109351wkgbmnqykc;
        return ((((((((((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f109343eablkybsjg.hashCode()) * 31) + Double.hashCode(this.f109345gxszxtbevo)) * 31) + this.f109347lqeggnwhkg.hashCode()) * 31) + this.f109348nufgyqmvbu.hashCode()) * 31) + this.f109342dxjokdxxww.hashCode()) * 31) + this.f109340btonecajqb.hashCode()) * 31) + this.f109344gtknphoqwx.hashCode()) * 31) + this.f109341draadjrbmk.hashCode()) * 31) + Boolean.hashCode(this.f109350wflxmlrfwp)) * 31) + Boolean.hashCode(this.f109339agtfadlqog);
    }

    public final String iobyxmoadg() {
        return this.f109343eablkybsjg;
    }

    public final String lqeggnwhkg() {
        return this.f109344gtknphoqwx;
    }

    public final String ppxfxbqfkf() {
        return this.f109351wkgbmnqykc;
    }

    public String toString() {
        return "Model(id=" + this.f109346iobyxmoadg + ", article=" + this.f109352zoijcleaow + ", name=" + this.f109349ppxfxbqfkf + ", pictureUrl=" + this.f109351wkgbmnqykc + ", amount=" + this.f109343eablkybsjg + ", quantity=" + this.f109345gxszxtbevo + ", pricePerUnit=" + this.f109347lqeggnwhkg + ", totalPrice=" + this.f109348nufgyqmvbu + ", measureType=" + this.f109342dxjokdxxww + ", markCodes=" + this.f109340btonecajqb + ", warningMessage=" + this.f109344gtknphoqwx + ", scanGoAmountMode=" + this.f109341draadjrbmk + ", allowChangeQuantityAction=" + this.f109350wflxmlrfwp + ", isLoading=" + this.f109339agtfadlqog + ")";
    }

    public final String wkgbmnqykc() {
        return this.f109347lqeggnwhkg;
    }

    public final String zoijcleaow() {
        return this.f109349ppxfxbqfkf;
    }

    public /* synthetic */ nufgyqmvbu(int i13, String str, String str2, String str3, String str4, double d13, String str5, String str6, x30.iobyxmoadg iobyxmoadgVar, List list, String str7, f22.iobyxmoadg iobyxmoadgVar2, boolean z13, boolean z14, int i14, gtknphoqwx gtknphoqwxVar) {
        this((i14 & 1) != 0 ? 0 : i13, (i14 & 2) != 0 ? "" : str, (i14 & 4) != 0 ? "" : str2, (i14 & 8) != 0 ? null : str3, (i14 & 16) != 0 ? "" : str4, (i14 & 32) != 0 ? 0.0d : d13, (i14 & 64) != 0 ? "" : str5, (i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? "" : str6, (i14 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? x30.iobyxmoadg.UNDEFINED : iobyxmoadgVar, (i14 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? jyumaefscl.wflxmlrfwp() : list, (i14 & UserVerificationMethods.USER_VERIFY_ALL) == 0 ? str7 : "", (i14 & 2048) != 0 ? f22.iobyxmoadg.INCREASE : iobyxmoadgVar2, (i14 & 4096) != 0 ? true : z13, (i14 & 8192) == 0 ? z14 : false);
    }
}
