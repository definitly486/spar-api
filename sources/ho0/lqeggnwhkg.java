package ho0;

import bs0.rgvfuqvkyq;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.cart.impl.domain.store.CartStore$CartDialogType;
import wo0.agtfadlqog;

/* JADX INFO: loaded from: classes5.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f40829eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final CartStore$CartDialogType f40830gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final rgvfuqvkyq f40831iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final boolean f40832lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final boolean f40833nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final st0.wkgbmnqykc f40834ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final agtfadlqog f40835wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f40836zoijcleaow;

    public lqeggnwhkg(rgvfuqvkyq addressTopBar, List content, st0.wkgbmnqykc wkgbmnqykcVar, agtfadlqog agtfadlqogVar, boolean z13, CartStore$CartDialogType cartStore$CartDialogType, boolean z14, boolean z15) {
        zdlpuopuiu.btonecajqb(addressTopBar, "addressTopBar");
        zdlpuopuiu.btonecajqb(content, "content");
        this.f40831iobyxmoadg = addressTopBar;
        this.f40836zoijcleaow = content;
        this.f40834ppxfxbqfkf = wkgbmnqykcVar;
        this.f40835wkgbmnqykc = agtfadlqogVar;
        this.f40829eablkybsjg = z13;
        this.f40830gxszxtbevo = cartStore$CartDialogType;
        this.f40832lqeggnwhkg = z14;
        this.f40833nufgyqmvbu = z15;
    }

    public final boolean eablkybsjg() {
        return this.f40832lqeggnwhkg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
        return zdlpuopuiu.eablkybsjg(this.f40831iobyxmoadg, lqeggnwhkgVar.f40831iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f40836zoijcleaow, lqeggnwhkgVar.f40836zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f40834ppxfxbqfkf, lqeggnwhkgVar.f40834ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f40835wkgbmnqykc, lqeggnwhkgVar.f40835wkgbmnqykc) && this.f40829eablkybsjg == lqeggnwhkgVar.f40829eablkybsjg && zdlpuopuiu.eablkybsjg(this.f40830gxszxtbevo, lqeggnwhkgVar.f40830gxszxtbevo) && this.f40832lqeggnwhkg == lqeggnwhkgVar.f40832lqeggnwhkg && this.f40833nufgyqmvbu == lqeggnwhkgVar.f40833nufgyqmvbu;
    }

    public final st0.wkgbmnqykc gxszxtbevo() {
        return this.f40834ppxfxbqfkf;
    }

    public int hashCode() {
        int iHashCode = ((this.f40831iobyxmoadg.hashCode() * 31) + this.f40836zoijcleaow.hashCode()) * 31;
        st0.wkgbmnqykc wkgbmnqykcVar = this.f40834ppxfxbqfkf;
        int iHashCode2 = (iHashCode + (wkgbmnqykcVar == null ? 0 : wkgbmnqykcVar.hashCode())) * 31;
        agtfadlqog agtfadlqogVar = this.f40835wkgbmnqykc;
        int iHashCode3 = (((iHashCode2 + (agtfadlqogVar == null ? 0 : agtfadlqogVar.hashCode())) * 31) + Boolean.hashCode(this.f40829eablkybsjg)) * 31;
        CartStore$CartDialogType cartStore$CartDialogType = this.f40830gxszxtbevo;
        return ((((iHashCode3 + (cartStore$CartDialogType != null ? cartStore$CartDialogType.hashCode() : 0)) * 31) + Boolean.hashCode(this.f40832lqeggnwhkg)) * 31) + Boolean.hashCode(this.f40833nufgyqmvbu);
    }

    public final rgvfuqvkyq iobyxmoadg() {
        return this.f40831iobyxmoadg;
    }

    public final boolean lqeggnwhkg() {
        return this.f40829eablkybsjg;
    }

    public final boolean nufgyqmvbu() {
        return this.f40833nufgyqmvbu;
    }

    public final CartStore$CartDialogType ppxfxbqfkf() {
        return this.f40830gxszxtbevo;
    }

    public String toString() {
        return "Model(addressTopBar=" + this.f40831iobyxmoadg + ", content=" + this.f40836zoijcleaow + ", totalPrice=" + this.f40834ppxfxbqfkf + ", emptyCartState=" + this.f40835wkgbmnqykc + ", isLoading=" + this.f40829eablkybsjg + ", dialogType=" + this.f40830gxszxtbevo + ", removeProgressVisible=" + this.f40832lqeggnwhkg + ", isNeededScrollContentToTop=" + this.f40833nufgyqmvbu + ")";
    }

    public final agtfadlqog wkgbmnqykc() {
        return this.f40835wkgbmnqykc;
    }

    public final List zoijcleaow() {
        return this.f40836zoijcleaow;
    }
}
