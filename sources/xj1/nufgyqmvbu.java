package xj1;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.common.view.counter.model.Price;

/* JADX INFO: loaded from: classes6.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f122634eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final int f122635gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ak1.iobyxmoadg f122636iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final boolean f122637lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f122638ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f122639wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Price f122640zoijcleaow;

    public nufgyqmvbu(ak1.iobyxmoadg iobyxmoadgVar, Price price, List list, int i13, boolean z13, int i14, boolean z14) {
        this.f122636iobyxmoadg = iobyxmoadgVar;
        this.f122640zoijcleaow = price;
        this.f122638ppxfxbqfkf = list;
        this.f122639wkgbmnqykc = i13;
        this.f122634eablkybsjg = z13;
        this.f122635gxszxtbevo = i14;
        this.f122637lqeggnwhkg = z14;
    }

    public final int eablkybsjg() {
        return this.f122635gxszxtbevo;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nufgyqmvbu)) {
            return false;
        }
        nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
        return zdlpuopuiu.eablkybsjg(this.f122636iobyxmoadg, nufgyqmvbuVar.f122636iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f122640zoijcleaow, nufgyqmvbuVar.f122640zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f122638ppxfxbqfkf, nufgyqmvbuVar.f122638ppxfxbqfkf) && this.f122639wkgbmnqykc == nufgyqmvbuVar.f122639wkgbmnqykc && this.f122634eablkybsjg == nufgyqmvbuVar.f122634eablkybsjg && this.f122635gxszxtbevo == nufgyqmvbuVar.f122635gxszxtbevo && this.f122637lqeggnwhkg == nufgyqmvbuVar.f122637lqeggnwhkg;
    }

    public final int gxszxtbevo() {
        return this.f122639wkgbmnqykc;
    }

    public int hashCode() {
        ak1.iobyxmoadg iobyxmoadgVar = this.f122636iobyxmoadg;
        int iHashCode = (iobyxmoadgVar == null ? 0 : iobyxmoadgVar.hashCode()) * 31;
        Price price = this.f122640zoijcleaow;
        int iHashCode2 = (iHashCode + (price == null ? 0 : price.hashCode())) * 31;
        List list = this.f122638ppxfxbqfkf;
        return ((((((((iHashCode2 + (list != null ? list.hashCode() : 0)) * 31) + Integer.hashCode(this.f122639wkgbmnqykc)) * 31) + Boolean.hashCode(this.f122634eablkybsjg)) * 31) + Integer.hashCode(this.f122635gxszxtbevo)) * 31) + Boolean.hashCode(this.f122637lqeggnwhkg);
    }

    public final ak1.iobyxmoadg iobyxmoadg() {
        return this.f122636iobyxmoadg;
    }

    public final boolean lqeggnwhkg() {
        return this.f122637lqeggnwhkg;
    }

    public final List ppxfxbqfkf() {
        return this.f122638ppxfxbqfkf;
    }

    public String toString() {
        return "Model(deliveryInfo=" + this.f122636iobyxmoadg + ", price=" + this.f122640zoijcleaow + ", products=" + this.f122638ppxfxbqfkf + ", screenTitleRes=" + this.f122639wkgbmnqykc + ", repeatButtonIsVisible=" + this.f122634eablkybsjg + ", repeatButtonTitleRes=" + this.f122635gxszxtbevo + ", isLoading=" + this.f122637lqeggnwhkg + ")";
    }

    public final boolean wkgbmnqykc() {
        return this.f122634eablkybsjg;
    }

    public final Price zoijcleaow() {
        return this.f122640zoijcleaow;
    }
}
