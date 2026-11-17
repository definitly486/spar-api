package sz0;

import hg.jyumaefscl;
import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final List f109027eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final List f109028gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f109029iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f109030ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final List f109031wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f109032zoijcleaow;

    public ppxfxbqfkf(List statusIds, List evaluationNegative, List evaluationPositive, List orderReasons, List additional, List forStockPacker) {
        zdlpuopuiu.btonecajqb(statusIds, "statusIds");
        zdlpuopuiu.btonecajqb(evaluationNegative, "evaluationNegative");
        zdlpuopuiu.btonecajqb(evaluationPositive, "evaluationPositive");
        zdlpuopuiu.btonecajqb(orderReasons, "orderReasons");
        zdlpuopuiu.btonecajqb(additional, "additional");
        zdlpuopuiu.btonecajqb(forStockPacker, "forStockPacker");
        this.f109029iobyxmoadg = statusIds;
        this.f109032zoijcleaow = evaluationNegative;
        this.f109030ppxfxbqfkf = evaluationPositive;
        this.f109031wkgbmnqykc = orderReasons;
        this.f109027eablkybsjg = additional;
        this.f109028gxszxtbevo = forStockPacker;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return zdlpuopuiu.eablkybsjg(this.f109029iobyxmoadg, ppxfxbqfkfVar.f109029iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f109032zoijcleaow, ppxfxbqfkfVar.f109032zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f109030ppxfxbqfkf, ppxfxbqfkfVar.f109030ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f109031wkgbmnqykc, ppxfxbqfkfVar.f109031wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f109027eablkybsjg, ppxfxbqfkfVar.f109027eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f109028gxszxtbevo, ppxfxbqfkfVar.f109028gxszxtbevo);
    }

    public int hashCode() {
        return (((((((((this.f109029iobyxmoadg.hashCode() * 31) + this.f109032zoijcleaow.hashCode()) * 31) + this.f109030ppxfxbqfkf.hashCode()) * 31) + this.f109031wkgbmnqykc.hashCode()) * 31) + this.f109027eablkybsjg.hashCode()) * 31) + this.f109028gxszxtbevo.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f109032zoijcleaow;
    }

    public final List ppxfxbqfkf() {
        return this.f109031wkgbmnqykc;
    }

    public String toString() {
        return "OrderReferences(statusIds=" + this.f109029iobyxmoadg + ", evaluationNegative=" + this.f109032zoijcleaow + ", evaluationPositive=" + this.f109030ppxfxbqfkf + ", orderReasons=" + this.f109031wkgbmnqykc + ", additional=" + this.f109027eablkybsjg + ", forStockPacker=" + this.f109028gxszxtbevo + ")";
    }

    public final List zoijcleaow() {
        return this.f109030ppxfxbqfkf;
    }

    public /* synthetic */ ppxfxbqfkf(List list, List list2, List list3, List list4, List list5, List list6, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? jyumaefscl.wflxmlrfwp() : list, (i13 & 2) != 0 ? jyumaefscl.wflxmlrfwp() : list2, (i13 & 4) != 0 ? jyumaefscl.wflxmlrfwp() : list3, (i13 & 8) != 0 ? jyumaefscl.wflxmlrfwp() : list4, (i13 & 16) != 0 ? jyumaefscl.wflxmlrfwp() : list5, (i13 & 32) != 0 ? jyumaefscl.wflxmlrfwp() : list6);
    }
}
