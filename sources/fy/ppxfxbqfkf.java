package fy;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import hg.jyumaefscl;
import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class ppxfxbqfkf implements h60.iobyxmoadg {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final List f35300dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final double f35301eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final int f35302gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f35303iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final List f35304lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final Boolean f35305nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final long f35306ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f35307wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f35308zoijcleaow;

    public ppxfxbqfkf(int i13, String sessionExpiresAt, long j13, String shopId, double d13, int i14, List products, Boolean bool, List list) {
        zdlpuopuiu.btonecajqb(sessionExpiresAt, "sessionExpiresAt");
        zdlpuopuiu.btonecajqb(shopId, "shopId");
        zdlpuopuiu.btonecajqb(products, "products");
        this.f35303iobyxmoadg = i13;
        this.f35308zoijcleaow = sessionExpiresAt;
        this.f35306ppxfxbqfkf = j13;
        this.f35307wkgbmnqykc = shopId;
        this.f35301eablkybsjg = d13;
        this.f35302gxszxtbevo = i14;
        this.f35304lqeggnwhkg = products;
        this.f35305nufgyqmvbu = bool;
        this.f35300dxjokdxxww = list;
    }

    public final Boolean dxjokdxxww() {
        return this.f35305nufgyqmvbu;
    }

    public final long eablkybsjg() {
        return this.f35306ppxfxbqfkf;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return this.f35303iobyxmoadg == ppxfxbqfkfVar.f35303iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f35308zoijcleaow, ppxfxbqfkfVar.f35308zoijcleaow) && this.f35306ppxfxbqfkf == ppxfxbqfkfVar.f35306ppxfxbqfkf && zdlpuopuiu.eablkybsjg(this.f35307wkgbmnqykc, ppxfxbqfkfVar.f35307wkgbmnqykc) && Double.compare(this.f35301eablkybsjg, ppxfxbqfkfVar.f35301eablkybsjg) == 0 && this.f35302gxszxtbevo == ppxfxbqfkfVar.f35302gxszxtbevo && zdlpuopuiu.eablkybsjg(this.f35304lqeggnwhkg, ppxfxbqfkfVar.f35304lqeggnwhkg) && zdlpuopuiu.eablkybsjg(this.f35305nufgyqmvbu, ppxfxbqfkfVar.f35305nufgyqmvbu) && zdlpuopuiu.eablkybsjg(this.f35300dxjokdxxww, ppxfxbqfkfVar.f35300dxjokdxxww);
    }

    public final String gxszxtbevo() {
        return this.f35308zoijcleaow;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((Integer.hashCode(this.f35303iobyxmoadg) * 31) + this.f35308zoijcleaow.hashCode()) * 31) + Long.hashCode(this.f35306ppxfxbqfkf)) * 31) + this.f35307wkgbmnqykc.hashCode()) * 31) + Double.hashCode(this.f35301eablkybsjg)) * 31) + Integer.hashCode(this.f35302gxszxtbevo)) * 31) + this.f35304lqeggnwhkg.hashCode()) * 31;
        Boolean bool = this.f35305nufgyqmvbu;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        List list = this.f35300dxjokdxxww;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final int iobyxmoadg() {
        return this.f35303iobyxmoadg;
    }

    public final String lqeggnwhkg() {
        return this.f35307wkgbmnqykc;
    }

    public final double nufgyqmvbu() {
        return this.f35301eablkybsjg;
    }

    public final List ppxfxbqfkf() {
        return this.f35300dxjokdxxww;
    }

    public String toString() {
        return "ScanGoCartEntity(id=" + this.f35303iobyxmoadg + ", sessionExpiresAt=" + this.f35308zoijcleaow + ", secondsToComplete=" + this.f35306ppxfxbqfkf + ", shopId=" + this.f35307wkgbmnqykc + ", totalCost=" + this.f35301eablkybsjg + ", numberOfProducts=" + this.f35302gxszxtbevo + ", products=" + this.f35304lqeggnwhkg + ", isWalletPayNeedVerify=" + this.f35305nufgyqmvbu + ", payment=" + this.f35300dxjokdxxww + ")";
    }

    public final List wkgbmnqykc() {
        return this.f35304lqeggnwhkg;
    }

    public final int zoijcleaow() {
        return this.f35302gxszxtbevo;
    }

    public /* synthetic */ ppxfxbqfkf(int i13, String str, long j13, String str2, double d13, int i14, List list, Boolean bool, List list2, int i15, gtknphoqwx gtknphoqwxVar) {
        this((i15 & 1) != 0 ? 0 : i13, (i15 & 2) != 0 ? "" : str, (i15 & 4) != 0 ? 0L : j13, (i15 & 8) == 0 ? str2 : "", (i15 & 16) != 0 ? 0.0d : d13, (i15 & 32) == 0 ? i14 : 0, (i15 & 64) != 0 ? jyumaefscl.wflxmlrfwp() : list, (i15 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : bool, (i15 & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 0 ? list2 : null);
    }
}
