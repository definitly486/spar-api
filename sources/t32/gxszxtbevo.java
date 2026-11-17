package t32;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import hg.jyumaefscl;
import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final List f109597btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final double f109598draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final x30.iobyxmoadg f109599dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f109600eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final String f109601gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final double f109602gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f109603iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final String f109604lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final String f109605nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f109606ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final boolean f109607wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f109608wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f109609zoijcleaow;

    public gxszxtbevo(int i13, String article, String name, String str, String amount, double d13, String pricePerUnit, String totalPrice, x30.iobyxmoadg measureType, List markCodes, String warningMessage, double d14, boolean z13) {
        zdlpuopuiu.btonecajqb(article, "article");
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(amount, "amount");
        zdlpuopuiu.btonecajqb(pricePerUnit, "pricePerUnit");
        zdlpuopuiu.btonecajqb(totalPrice, "totalPrice");
        zdlpuopuiu.btonecajqb(measureType, "measureType");
        zdlpuopuiu.btonecajqb(markCodes, "markCodes");
        zdlpuopuiu.btonecajqb(warningMessage, "warningMessage");
        this.f109603iobyxmoadg = i13;
        this.f109609zoijcleaow = article;
        this.f109606ppxfxbqfkf = name;
        this.f109608wkgbmnqykc = str;
        this.f109600eablkybsjg = amount;
        this.f109602gxszxtbevo = d13;
        this.f109604lqeggnwhkg = pricePerUnit;
        this.f109605nufgyqmvbu = totalPrice;
        this.f109599dxjokdxxww = measureType;
        this.f109597btonecajqb = markCodes;
        this.f109601gtknphoqwx = warningMessage;
        this.f109598draadjrbmk = d14;
        this.f109607wflxmlrfwp = z13;
    }

    public final String eablkybsjg() {
        return this.f109605nufgyqmvbu;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxszxtbevo)) {
            return false;
        }
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
        return this.f109603iobyxmoadg == gxszxtbevoVar.f109603iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f109609zoijcleaow, gxszxtbevoVar.f109609zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f109606ppxfxbqfkf, gxszxtbevoVar.f109606ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f109608wkgbmnqykc, gxszxtbevoVar.f109608wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f109600eablkybsjg, gxszxtbevoVar.f109600eablkybsjg) && Double.compare(this.f109602gxszxtbevo, gxszxtbevoVar.f109602gxszxtbevo) == 0 && zdlpuopuiu.eablkybsjg(this.f109604lqeggnwhkg, gxszxtbevoVar.f109604lqeggnwhkg) && zdlpuopuiu.eablkybsjg(this.f109605nufgyqmvbu, gxszxtbevoVar.f109605nufgyqmvbu) && this.f109599dxjokdxxww == gxszxtbevoVar.f109599dxjokdxxww && zdlpuopuiu.eablkybsjg(this.f109597btonecajqb, gxszxtbevoVar.f109597btonecajqb) && zdlpuopuiu.eablkybsjg(this.f109601gtknphoqwx, gxszxtbevoVar.f109601gtknphoqwx) && Double.compare(this.f109598draadjrbmk, gxszxtbevoVar.f109598draadjrbmk) == 0 && this.f109607wflxmlrfwp == gxszxtbevoVar.f109607wflxmlrfwp;
    }

    public final boolean gxszxtbevo() {
        return this.f109607wflxmlrfwp;
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.f109603iobyxmoadg) * 31) + this.f109609zoijcleaow.hashCode()) * 31) + this.f109606ppxfxbqfkf.hashCode()) * 31;
        String str = this.f109608wkgbmnqykc;
        return ((((((((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f109600eablkybsjg.hashCode()) * 31) + Double.hashCode(this.f109602gxszxtbevo)) * 31) + this.f109604lqeggnwhkg.hashCode()) * 31) + this.f109605nufgyqmvbu.hashCode()) * 31) + this.f109599dxjokdxxww.hashCode()) * 31) + this.f109597btonecajqb.hashCode()) * 31) + this.f109601gtknphoqwx.hashCode()) * 31) + Double.hashCode(this.f109598draadjrbmk)) * 31) + Boolean.hashCode(this.f109607wflxmlrfwp);
    }

    public final String iobyxmoadg() {
        return this.f109600eablkybsjg;
    }

    public final String ppxfxbqfkf() {
        return this.f109608wkgbmnqykc;
    }

    public String toString() {
        return "Model(id=" + this.f109603iobyxmoadg + ", article=" + this.f109609zoijcleaow + ", name=" + this.f109606ppxfxbqfkf + ", pictureUrl=" + this.f109608wkgbmnqykc + ", amount=" + this.f109600eablkybsjg + ", quantity=" + this.f109602gxszxtbevo + ", pricePerUnit=" + this.f109604lqeggnwhkg + ", totalPrice=" + this.f109605nufgyqmvbu + ", measureType=" + this.f109599dxjokdxxww + ", markCodes=" + this.f109597btonecajqb + ", warningMessage=" + this.f109601gtknphoqwx + ", price=" + this.f109598draadjrbmk + ", isLoading=" + this.f109607wflxmlrfwp + ")";
    }

    public final String wkgbmnqykc() {
        return this.f109604lqeggnwhkg;
    }

    public final String zoijcleaow() {
        return this.f109606ppxfxbqfkf;
    }

    public /* synthetic */ gxszxtbevo(int i13, String str, String str2, String str3, String str4, double d13, String str5, String str6, x30.iobyxmoadg iobyxmoadgVar, List list, String str7, double d14, boolean z13, int i14, gtknphoqwx gtknphoqwxVar) {
        this((i14 & 1) != 0 ? 0 : i13, (i14 & 2) != 0 ? "" : str, (i14 & 4) != 0 ? "" : str2, (i14 & 8) != 0 ? null : str3, (i14 & 16) != 0 ? "" : str4, (i14 & 32) != 0 ? 0.0d : d13, (i14 & 64) != 0 ? "" : str5, (i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? "" : str6, (i14 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? x30.iobyxmoadg.UNDEFINED : iobyxmoadgVar, (i14 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? jyumaefscl.wflxmlrfwp() : list, (i14 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? "" : str7, d14, (i14 & 4096) != 0 ? false : z13);
    }
}
