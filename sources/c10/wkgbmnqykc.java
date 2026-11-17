package c10;

import hg.jyumaefscl;
import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final List f18472eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final List f18473gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f18474iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f18475ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final List f18476wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f18477zoijcleaow;

    public wkgbmnqykc(List statusIds, List evaluationNegative, List evaluationPositive, List orderReasons, List additional, List forStockPacker) {
        zdlpuopuiu.btonecajqb(statusIds, "statusIds");
        zdlpuopuiu.btonecajqb(evaluationNegative, "evaluationNegative");
        zdlpuopuiu.btonecajqb(evaluationPositive, "evaluationPositive");
        zdlpuopuiu.btonecajqb(orderReasons, "orderReasons");
        zdlpuopuiu.btonecajqb(additional, "additional");
        zdlpuopuiu.btonecajqb(forStockPacker, "forStockPacker");
        this.f18474iobyxmoadg = statusIds;
        this.f18477zoijcleaow = evaluationNegative;
        this.f18475ppxfxbqfkf = evaluationPositive;
        this.f18476wkgbmnqykc = orderReasons;
        this.f18472eablkybsjg = additional;
        this.f18473gxszxtbevo = forStockPacker;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkgbmnqykc)) {
            return false;
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
        return zdlpuopuiu.eablkybsjg(this.f18474iobyxmoadg, wkgbmnqykcVar.f18474iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f18477zoijcleaow, wkgbmnqykcVar.f18477zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f18475ppxfxbqfkf, wkgbmnqykcVar.f18475ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f18476wkgbmnqykc, wkgbmnqykcVar.f18476wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f18472eablkybsjg, wkgbmnqykcVar.f18472eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f18473gxszxtbevo, wkgbmnqykcVar.f18473gxszxtbevo);
    }

    public int hashCode() {
        return (((((((((this.f18474iobyxmoadg.hashCode() * 31) + this.f18477zoijcleaow.hashCode()) * 31) + this.f18475ppxfxbqfkf.hashCode()) * 31) + this.f18476wkgbmnqykc.hashCode()) * 31) + this.f18472eablkybsjg.hashCode()) * 31) + this.f18473gxszxtbevo.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f18477zoijcleaow;
    }

    public final List ppxfxbqfkf() {
        return this.f18476wkgbmnqykc;
    }

    public String toString() {
        return "OrderReferences(statusIds=" + this.f18474iobyxmoadg + ", evaluationNegative=" + this.f18477zoijcleaow + ", evaluationPositive=" + this.f18475ppxfxbqfkf + ", orderReasons=" + this.f18476wkgbmnqykc + ", additional=" + this.f18472eablkybsjg + ", forStockPacker=" + this.f18473gxszxtbevo + ")";
    }

    public final List zoijcleaow() {
        return this.f18475ppxfxbqfkf;
    }

    public /* synthetic */ wkgbmnqykc(List list, List list2, List list3, List list4, List list5, List list6, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? jyumaefscl.wflxmlrfwp() : list, (i13 & 2) != 0 ? jyumaefscl.wflxmlrfwp() : list2, (i13 & 4) != 0 ? jyumaefscl.wflxmlrfwp() : list3, (i13 & 8) != 0 ? jyumaefscl.wflxmlrfwp() : list4, (i13 & 16) != 0 ? jyumaefscl.wflxmlrfwp() : list5, (i13 & 32) != 0 ? jyumaefscl.wflxmlrfwp() : list6);
    }
}
