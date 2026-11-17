package ry1;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.common.view.counter.model.Price;

/* JADX INFO: loaded from: classes6.dex */
public final class dxjokdxxww {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f105048eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final int f105049gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final uy1.iobyxmoadg f105050iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final boolean f105051lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f105052ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f105053wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Price f105054zoijcleaow;

    public dxjokdxxww(uy1.iobyxmoadg iobyxmoadgVar, Price price, List list, int i13, boolean z13, int i14, boolean z14) {
        this.f105050iobyxmoadg = iobyxmoadgVar;
        this.f105054zoijcleaow = price;
        this.f105052ppxfxbqfkf = list;
        this.f105053wkgbmnqykc = i13;
        this.f105048eablkybsjg = z13;
        this.f105049gxszxtbevo = i14;
        this.f105051lqeggnwhkg = z14;
    }

    public final int eablkybsjg() {
        return this.f105049gxszxtbevo;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxjokdxxww)) {
            return false;
        }
        dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) obj;
        return zdlpuopuiu.eablkybsjg(this.f105050iobyxmoadg, dxjokdxxwwVar.f105050iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f105054zoijcleaow, dxjokdxxwwVar.f105054zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f105052ppxfxbqfkf, dxjokdxxwwVar.f105052ppxfxbqfkf) && this.f105053wkgbmnqykc == dxjokdxxwwVar.f105053wkgbmnqykc && this.f105048eablkybsjg == dxjokdxxwwVar.f105048eablkybsjg && this.f105049gxszxtbevo == dxjokdxxwwVar.f105049gxszxtbevo && this.f105051lqeggnwhkg == dxjokdxxwwVar.f105051lqeggnwhkg;
    }

    public final int gxszxtbevo() {
        return this.f105053wkgbmnqykc;
    }

    public int hashCode() {
        uy1.iobyxmoadg iobyxmoadgVar = this.f105050iobyxmoadg;
        int iHashCode = (iobyxmoadgVar == null ? 0 : iobyxmoadgVar.hashCode()) * 31;
        Price price = this.f105054zoijcleaow;
        int iHashCode2 = (iHashCode + (price == null ? 0 : price.hashCode())) * 31;
        List list = this.f105052ppxfxbqfkf;
        return ((((((((iHashCode2 + (list != null ? list.hashCode() : 0)) * 31) + Integer.hashCode(this.f105053wkgbmnqykc)) * 31) + Boolean.hashCode(this.f105048eablkybsjg)) * 31) + Integer.hashCode(this.f105049gxszxtbevo)) * 31) + Boolean.hashCode(this.f105051lqeggnwhkg);
    }

    public final uy1.iobyxmoadg iobyxmoadg() {
        return this.f105050iobyxmoadg;
    }

    public final boolean lqeggnwhkg() {
        return this.f105051lqeggnwhkg;
    }

    public final List ppxfxbqfkf() {
        return this.f105052ppxfxbqfkf;
    }

    public String toString() {
        return "Model(deliveryInfo=" + this.f105050iobyxmoadg + ", price=" + this.f105054zoijcleaow + ", products=" + this.f105052ppxfxbqfkf + ", screenTitleRes=" + this.f105053wkgbmnqykc + ", repeatButtonIsVisible=" + this.f105048eablkybsjg + ", repeatButtonTitleRes=" + this.f105049gxszxtbevo + ", isLoading=" + this.f105051lqeggnwhkg + ")";
    }

    public final boolean wkgbmnqykc() {
        return this.f105048eablkybsjg;
    }

    public final Price zoijcleaow() {
        return this.f105054zoijcleaow;
    }
}
