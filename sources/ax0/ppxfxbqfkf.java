package ax0;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import hg.jyumaefscl;
import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class ppxfxbqfkf implements u41.iobyxmoadg {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final List f14700dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final double f14701eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final int f14702gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f14703iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final List f14704lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final Boolean f14705nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final long f14706ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f14707wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f14708zoijcleaow;

    public ppxfxbqfkf(int i13, String sessionExpiresAt, long j13, String shopId, double d13, int i14, List products, Boolean bool, List list) {
        zdlpuopuiu.btonecajqb(sessionExpiresAt, "sessionExpiresAt");
        zdlpuopuiu.btonecajqb(shopId, "shopId");
        zdlpuopuiu.btonecajqb(products, "products");
        this.f14703iobyxmoadg = i13;
        this.f14708zoijcleaow = sessionExpiresAt;
        this.f14706ppxfxbqfkf = j13;
        this.f14707wkgbmnqykc = shopId;
        this.f14701eablkybsjg = d13;
        this.f14702gxszxtbevo = i14;
        this.f14704lqeggnwhkg = products;
        this.f14705nufgyqmvbu = bool;
        this.f14700dxjokdxxww = list;
    }

    public final Boolean dxjokdxxww() {
        return this.f14705nufgyqmvbu;
    }

    public final long eablkybsjg() {
        return this.f14706ppxfxbqfkf;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return this.f14703iobyxmoadg == ppxfxbqfkfVar.f14703iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f14708zoijcleaow, ppxfxbqfkfVar.f14708zoijcleaow) && this.f14706ppxfxbqfkf == ppxfxbqfkfVar.f14706ppxfxbqfkf && zdlpuopuiu.eablkybsjg(this.f14707wkgbmnqykc, ppxfxbqfkfVar.f14707wkgbmnqykc) && Double.compare(this.f14701eablkybsjg, ppxfxbqfkfVar.f14701eablkybsjg) == 0 && this.f14702gxszxtbevo == ppxfxbqfkfVar.f14702gxszxtbevo && zdlpuopuiu.eablkybsjg(this.f14704lqeggnwhkg, ppxfxbqfkfVar.f14704lqeggnwhkg) && zdlpuopuiu.eablkybsjg(this.f14705nufgyqmvbu, ppxfxbqfkfVar.f14705nufgyqmvbu) && zdlpuopuiu.eablkybsjg(this.f14700dxjokdxxww, ppxfxbqfkfVar.f14700dxjokdxxww);
    }

    public final String gxszxtbevo() {
        return this.f14708zoijcleaow;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((Integer.hashCode(this.f14703iobyxmoadg) * 31) + this.f14708zoijcleaow.hashCode()) * 31) + Long.hashCode(this.f14706ppxfxbqfkf)) * 31) + this.f14707wkgbmnqykc.hashCode()) * 31) + Double.hashCode(this.f14701eablkybsjg)) * 31) + Integer.hashCode(this.f14702gxszxtbevo)) * 31) + this.f14704lqeggnwhkg.hashCode()) * 31;
        Boolean bool = this.f14705nufgyqmvbu;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        List list = this.f14700dxjokdxxww;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final int iobyxmoadg() {
        return this.f14703iobyxmoadg;
    }

    public final String lqeggnwhkg() {
        return this.f14707wkgbmnqykc;
    }

    public final double nufgyqmvbu() {
        return this.f14701eablkybsjg;
    }

    public final List ppxfxbqfkf() {
        return this.f14700dxjokdxxww;
    }

    public String toString() {
        return "ScanGoCartEntity(id=" + this.f14703iobyxmoadg + ", sessionExpiresAt=" + this.f14708zoijcleaow + ", secondsToComplete=" + this.f14706ppxfxbqfkf + ", shopId=" + this.f14707wkgbmnqykc + ", totalCost=" + this.f14701eablkybsjg + ", numberOfProducts=" + this.f14702gxszxtbevo + ", products=" + this.f14704lqeggnwhkg + ", isWalletPayNeedVerify=" + this.f14705nufgyqmvbu + ", payment=" + this.f14700dxjokdxxww + ")";
    }

    public final List wkgbmnqykc() {
        return this.f14704lqeggnwhkg;
    }

    public final int zoijcleaow() {
        return this.f14702gxszxtbevo;
    }

    public /* synthetic */ ppxfxbqfkf(int i13, String str, long j13, String str2, double d13, int i14, List list, Boolean bool, List list2, int i15, gtknphoqwx gtknphoqwxVar) {
        this((i15 & 1) != 0 ? 0 : i13, (i15 & 2) != 0 ? "" : str, (i15 & 4) != 0 ? 0L : j13, (i15 & 8) == 0 ? str2 : "", (i15 & 16) != 0 ? 0.0d : d13, (i15 & 32) == 0 ? i14 : 0, (i15 & 64) != 0 ? jyumaefscl.wflxmlrfwp() : list, (i15 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : bool, (i15 & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 0 ? list2 : null);
    }
}
