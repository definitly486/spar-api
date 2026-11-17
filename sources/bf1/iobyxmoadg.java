package bf1;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final List f16054eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final m91.wkgbmnqykc f16055gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final m91.wkgbmnqykc f16056iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final m91.wkgbmnqykc f16057lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final m91.wkgbmnqykc f16058ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final m91.wkgbmnqykc f16059wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final m91.wkgbmnqykc f16060zoijcleaow;

    public iobyxmoadg(m91.wkgbmnqykc wkgbmnqykcVar, m91.wkgbmnqykc wkgbmnqykcVar2, m91.wkgbmnqykc wkgbmnqykcVar3, m91.wkgbmnqykc wkgbmnqykcVar4, List features, m91.wkgbmnqykc wkgbmnqykcVar5, m91.wkgbmnqykc wkgbmnqykcVar6) {
        zdlpuopuiu.btonecajqb(features, "features");
        this.f16056iobyxmoadg = wkgbmnqykcVar;
        this.f16060zoijcleaow = wkgbmnqykcVar2;
        this.f16058ppxfxbqfkf = wkgbmnqykcVar3;
        this.f16059wkgbmnqykc = wkgbmnqykcVar4;
        this.f16054eablkybsjg = features;
        this.f16055gxszxtbevo = wkgbmnqykcVar5;
        this.f16057lqeggnwhkg = wkgbmnqykcVar6;
    }

    public final m91.wkgbmnqykc eablkybsjg() {
        return this.f16058ppxfxbqfkf;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f16056iobyxmoadg, iobyxmoadgVar.f16056iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f16060zoijcleaow, iobyxmoadgVar.f16060zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f16058ppxfxbqfkf, iobyxmoadgVar.f16058ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f16059wkgbmnqykc, iobyxmoadgVar.f16059wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f16054eablkybsjg, iobyxmoadgVar.f16054eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f16055gxszxtbevo, iobyxmoadgVar.f16055gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f16057lqeggnwhkg, iobyxmoadgVar.f16057lqeggnwhkg);
    }

    public final m91.wkgbmnqykc gxszxtbevo() {
        return this.f16057lqeggnwhkg;
    }

    public int hashCode() {
        m91.wkgbmnqykc wkgbmnqykcVar = this.f16056iobyxmoadg;
        int iHashCode = (wkgbmnqykcVar == null ? 0 : wkgbmnqykcVar.hashCode()) * 31;
        m91.wkgbmnqykc wkgbmnqykcVar2 = this.f16060zoijcleaow;
        int iHashCode2 = (iHashCode + (wkgbmnqykcVar2 == null ? 0 : wkgbmnqykcVar2.hashCode())) * 31;
        m91.wkgbmnqykc wkgbmnqykcVar3 = this.f16058ppxfxbqfkf;
        int iHashCode3 = (iHashCode2 + (wkgbmnqykcVar3 == null ? 0 : wkgbmnqykcVar3.hashCode())) * 31;
        m91.wkgbmnqykc wkgbmnqykcVar4 = this.f16059wkgbmnqykc;
        int iHashCode4 = (((iHashCode3 + (wkgbmnqykcVar4 == null ? 0 : wkgbmnqykcVar4.hashCode())) * 31) + this.f16054eablkybsjg.hashCode()) * 31;
        m91.wkgbmnqykc wkgbmnqykcVar5 = this.f16055gxszxtbevo;
        int iHashCode5 = (iHashCode4 + (wkgbmnqykcVar5 == null ? 0 : wkgbmnqykcVar5.hashCode())) * 31;
        m91.wkgbmnqykc wkgbmnqykcVar6 = this.f16057lqeggnwhkg;
        return iHashCode5 + (wkgbmnqykcVar6 != null ? wkgbmnqykcVar6.hashCode() : 0);
    }

    public final m91.wkgbmnqykc iobyxmoadg() {
        return this.f16055gxszxtbevo;
    }

    public final m91.wkgbmnqykc lqeggnwhkg() {
        return this.f16059wkgbmnqykc;
    }

    public final m91.wkgbmnqykc ppxfxbqfkf() {
        return this.f16056iobyxmoadg;
    }

    public String toString() {
        return "BannersUiModel(promo=" + this.f16056iobyxmoadg + ", restaurants=" + this.f16060zoijcleaow + ", specials=" + this.f16058ppxfxbqfkf + ", videos=" + this.f16059wkgbmnqykc + ", features=" + this.f16054eablkybsjg + ", discount=" + this.f16055gxszxtbevo + ", underOptions=" + this.f16057lqeggnwhkg + ")";
    }

    public final m91.wkgbmnqykc wkgbmnqykc() {
        return this.f16060zoijcleaow;
    }

    public final List zoijcleaow() {
        return this.f16054eablkybsjg;
    }
}
