package zq;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import hg.jyumaefscl;
import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f130921eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final ht.nufgyqmvbu f130922gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final xq.iobyxmoadg f130923iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final List f130924lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final boolean f130925nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f130926ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f130927wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f130928zoijcleaow;

    public nufgyqmvbu(xq.iobyxmoadg selectedTab, boolean z13, List items, boolean z14, String str, ht.nufgyqmvbu addressTopBar, List partnerItems, boolean z15) {
        zdlpuopuiu.btonecajqb(selectedTab, "selectedTab");
        zdlpuopuiu.btonecajqb(items, "items");
        zdlpuopuiu.btonecajqb(addressTopBar, "addressTopBar");
        zdlpuopuiu.btonecajqb(partnerItems, "partnerItems");
        this.f130923iobyxmoadg = selectedTab;
        this.f130928zoijcleaow = z13;
        this.f130926ppxfxbqfkf = items;
        this.f130927wkgbmnqykc = z14;
        this.f130921eablkybsjg = str;
        this.f130922gxszxtbevo = addressTopBar;
        this.f130924lqeggnwhkg = partnerItems;
        this.f130925nufgyqmvbu = z15;
    }

    public final xq.iobyxmoadg eablkybsjg() {
        return this.f130923iobyxmoadg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nufgyqmvbu)) {
            return false;
        }
        nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
        return this.f130923iobyxmoadg == nufgyqmvbuVar.f130923iobyxmoadg && this.f130928zoijcleaow == nufgyqmvbuVar.f130928zoijcleaow && zdlpuopuiu.eablkybsjg(this.f130926ppxfxbqfkf, nufgyqmvbuVar.f130926ppxfxbqfkf) && this.f130927wkgbmnqykc == nufgyqmvbuVar.f130927wkgbmnqykc && zdlpuopuiu.eablkybsjg(this.f130921eablkybsjg, nufgyqmvbuVar.f130921eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f130922gxszxtbevo, nufgyqmvbuVar.f130922gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f130924lqeggnwhkg, nufgyqmvbuVar.f130924lqeggnwhkg) && this.f130925nufgyqmvbu == nufgyqmvbuVar.f130925nufgyqmvbu;
    }

    public final boolean gxszxtbevo() {
        return this.f130925nufgyqmvbu;
    }

    public int hashCode() {
        int iHashCode = ((((((this.f130923iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f130928zoijcleaow)) * 31) + this.f130926ppxfxbqfkf.hashCode()) * 31) + Boolean.hashCode(this.f130927wkgbmnqykc)) * 31;
        String str = this.f130921eablkybsjg;
        return ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f130922gxszxtbevo.hashCode()) * 31) + this.f130924lqeggnwhkg.hashCode()) * 31) + Boolean.hashCode(this.f130925nufgyqmvbu);
    }

    public final ht.nufgyqmvbu iobyxmoadg() {
        return this.f130922gxszxtbevo;
    }

    public final boolean lqeggnwhkg() {
        return this.f130927wkgbmnqykc;
    }

    public final List ppxfxbqfkf() {
        return this.f130926ppxfxbqfkf;
    }

    public String toString() {
        return "Model(selectedTab=" + this.f130923iobyxmoadg + ", enableTabs=" + this.f130928zoijcleaow + ", items=" + this.f130926ppxfxbqfkf + ", isLoading=" + this.f130927wkgbmnqykc + ", address=" + this.f130921eablkybsjg + ", addressTopBar=" + this.f130922gxszxtbevo + ", partnerItems=" + this.f130924lqeggnwhkg + ", isEditMode=" + this.f130925nufgyqmvbu + ")";
    }

    public final List wkgbmnqykc() {
        return this.f130924lqeggnwhkg;
    }

    public final boolean zoijcleaow() {
        return this.f130928zoijcleaow;
    }

    public /* synthetic */ nufgyqmvbu(xq.iobyxmoadg iobyxmoadgVar, boolean z13, List list, boolean z14, String str, ht.nufgyqmvbu nufgyqmvbuVar, List list2, boolean z15, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? xq.iobyxmoadg.Spar : iobyxmoadgVar, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? jyumaefscl.wflxmlrfwp() : list, (i13 & 8) != 0 ? false : z14, (i13 & 16) != 0 ? null : str, nufgyqmvbuVar, (i13 & 64) != 0 ? jyumaefscl.wflxmlrfwp() : list2, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? false : z15);
    }
}
