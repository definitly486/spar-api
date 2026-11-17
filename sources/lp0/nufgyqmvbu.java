package lp0;

import bs0.rgvfuqvkyq;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import hg.jyumaefscl;
import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f63767eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final rgvfuqvkyq f63768gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final jp0.iobyxmoadg f63769iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final List f63770lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final boolean f63771nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f63772ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f63773wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f63774zoijcleaow;

    public nufgyqmvbu(jp0.iobyxmoadg selectedTab, boolean z13, List items, boolean z14, String str, rgvfuqvkyq addressTopBar, List partnerItems, boolean z15) {
        zdlpuopuiu.btonecajqb(selectedTab, "selectedTab");
        zdlpuopuiu.btonecajqb(items, "items");
        zdlpuopuiu.btonecajqb(addressTopBar, "addressTopBar");
        zdlpuopuiu.btonecajqb(partnerItems, "partnerItems");
        this.f63769iobyxmoadg = selectedTab;
        this.f63774zoijcleaow = z13;
        this.f63772ppxfxbqfkf = items;
        this.f63773wkgbmnqykc = z14;
        this.f63767eablkybsjg = str;
        this.f63768gxszxtbevo = addressTopBar;
        this.f63770lqeggnwhkg = partnerItems;
        this.f63771nufgyqmvbu = z15;
    }

    public final jp0.iobyxmoadg eablkybsjg() {
        return this.f63769iobyxmoadg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nufgyqmvbu)) {
            return false;
        }
        nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
        return this.f63769iobyxmoadg == nufgyqmvbuVar.f63769iobyxmoadg && this.f63774zoijcleaow == nufgyqmvbuVar.f63774zoijcleaow && zdlpuopuiu.eablkybsjg(this.f63772ppxfxbqfkf, nufgyqmvbuVar.f63772ppxfxbqfkf) && this.f63773wkgbmnqykc == nufgyqmvbuVar.f63773wkgbmnqykc && zdlpuopuiu.eablkybsjg(this.f63767eablkybsjg, nufgyqmvbuVar.f63767eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f63768gxszxtbevo, nufgyqmvbuVar.f63768gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f63770lqeggnwhkg, nufgyqmvbuVar.f63770lqeggnwhkg) && this.f63771nufgyqmvbu == nufgyqmvbuVar.f63771nufgyqmvbu;
    }

    public final boolean gxszxtbevo() {
        return this.f63771nufgyqmvbu;
    }

    public int hashCode() {
        int iHashCode = ((((((this.f63769iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f63774zoijcleaow)) * 31) + this.f63772ppxfxbqfkf.hashCode()) * 31) + Boolean.hashCode(this.f63773wkgbmnqykc)) * 31;
        String str = this.f63767eablkybsjg;
        return ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f63768gxszxtbevo.hashCode()) * 31) + this.f63770lqeggnwhkg.hashCode()) * 31) + Boolean.hashCode(this.f63771nufgyqmvbu);
    }

    public final rgvfuqvkyq iobyxmoadg() {
        return this.f63768gxszxtbevo;
    }

    public final boolean lqeggnwhkg() {
        return this.f63773wkgbmnqykc;
    }

    public final List ppxfxbqfkf() {
        return this.f63772ppxfxbqfkf;
    }

    public String toString() {
        return "Model(selectedTab=" + this.f63769iobyxmoadg + ", enableTabs=" + this.f63774zoijcleaow + ", items=" + this.f63772ppxfxbqfkf + ", isLoading=" + this.f63773wkgbmnqykc + ", address=" + this.f63767eablkybsjg + ", addressTopBar=" + this.f63768gxszxtbevo + ", partnerItems=" + this.f63770lqeggnwhkg + ", isEditMode=" + this.f63771nufgyqmvbu + ")";
    }

    public final List wkgbmnqykc() {
        return this.f63770lqeggnwhkg;
    }

    public final boolean zoijcleaow() {
        return this.f63774zoijcleaow;
    }

    public /* synthetic */ nufgyqmvbu(jp0.iobyxmoadg iobyxmoadgVar, boolean z13, List list, boolean z14, String str, rgvfuqvkyq rgvfuqvkyqVar, List list2, boolean z15, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? jp0.iobyxmoadg.Spar : iobyxmoadgVar, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? jyumaefscl.wflxmlrfwp() : list, (i13 & 8) != 0 ? false : z14, (i13 & 16) != 0 ? null : str, rgvfuqvkyqVar, (i13 & 64) != 0 ? jyumaefscl.wflxmlrfwp() : list2, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? false : z15);
    }
}
