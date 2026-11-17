package wp;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import kq.wflxmlrfwp;
import ru.myspar.cart.impl.domain.store.CartStore$CartDialogType;

/* JADX INFO: loaded from: classes4.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f120340eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final CartStore$CartDialogType f120341gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final wflxmlrfwp f120342iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final boolean f120343lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final boolean f120344nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f120345ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final yu.wkgbmnqykc f120346wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ht.nufgyqmvbu f120347zoijcleaow;

    public lqeggnwhkg(wflxmlrfwp warningState, ht.nufgyqmvbu addressTopBar, List content, yu.wkgbmnqykc wkgbmnqykcVar, boolean z13, CartStore$CartDialogType cartStore$CartDialogType, boolean z14, boolean z15) {
        zdlpuopuiu.btonecajqb(warningState, "warningState");
        zdlpuopuiu.btonecajqb(addressTopBar, "addressTopBar");
        zdlpuopuiu.btonecajqb(content, "content");
        this.f120342iobyxmoadg = warningState;
        this.f120347zoijcleaow = addressTopBar;
        this.f120345ppxfxbqfkf = content;
        this.f120346wkgbmnqykc = wkgbmnqykcVar;
        this.f120340eablkybsjg = z13;
        this.f120341gxszxtbevo = cartStore$CartDialogType;
        this.f120343lqeggnwhkg = z14;
        this.f120344nufgyqmvbu = z15;
    }

    public final yu.wkgbmnqykc eablkybsjg() {
        return this.f120346wkgbmnqykc;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
        return this.f120342iobyxmoadg == lqeggnwhkgVar.f120342iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f120347zoijcleaow, lqeggnwhkgVar.f120347zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f120345ppxfxbqfkf, lqeggnwhkgVar.f120345ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f120346wkgbmnqykc, lqeggnwhkgVar.f120346wkgbmnqykc) && this.f120340eablkybsjg == lqeggnwhkgVar.f120340eablkybsjg && zdlpuopuiu.eablkybsjg(this.f120341gxszxtbevo, lqeggnwhkgVar.f120341gxszxtbevo) && this.f120343lqeggnwhkg == lqeggnwhkgVar.f120343lqeggnwhkg && this.f120344nufgyqmvbu == lqeggnwhkgVar.f120344nufgyqmvbu;
    }

    public final wflxmlrfwp gxszxtbevo() {
        return this.f120342iobyxmoadg;
    }

    public int hashCode() {
        int iHashCode = ((((this.f120342iobyxmoadg.hashCode() * 31) + this.f120347zoijcleaow.hashCode()) * 31) + this.f120345ppxfxbqfkf.hashCode()) * 31;
        yu.wkgbmnqykc wkgbmnqykcVar = this.f120346wkgbmnqykc;
        int iHashCode2 = (((iHashCode + (wkgbmnqykcVar == null ? 0 : wkgbmnqykcVar.hashCode())) * 31) + Boolean.hashCode(this.f120340eablkybsjg)) * 31;
        CartStore$CartDialogType cartStore$CartDialogType = this.f120341gxszxtbevo;
        return ((((iHashCode2 + (cartStore$CartDialogType != null ? cartStore$CartDialogType.hashCode() : 0)) * 31) + Boolean.hashCode(this.f120343lqeggnwhkg)) * 31) + Boolean.hashCode(this.f120344nufgyqmvbu);
    }

    public final ht.nufgyqmvbu iobyxmoadg() {
        return this.f120347zoijcleaow;
    }

    public final boolean lqeggnwhkg() {
        return this.f120340eablkybsjg;
    }

    public final boolean nufgyqmvbu() {
        return this.f120344nufgyqmvbu;
    }

    public final CartStore$CartDialogType ppxfxbqfkf() {
        return this.f120341gxszxtbevo;
    }

    public String toString() {
        return "Model(warningState=" + this.f120342iobyxmoadg + ", addressTopBar=" + this.f120347zoijcleaow + ", content=" + this.f120345ppxfxbqfkf + ", totalPrice=" + this.f120346wkgbmnqykc + ", isLoading=" + this.f120340eablkybsjg + ", dialogType=" + this.f120341gxszxtbevo + ", removeProgressVisible=" + this.f120343lqeggnwhkg + ", isNeededScrollContentToTop=" + this.f120344nufgyqmvbu + ")";
    }

    public final boolean wkgbmnqykc() {
        return this.f120343lqeggnwhkg;
    }

    public final List zoijcleaow() {
        return this.f120345ppxfxbqfkf;
    }
}
