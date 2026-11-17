package fd0;

import ru.myspar.core.domain.models.ColorsUiModel;

/* JADX INFO: loaded from: classes4.dex */
public final class zdlpuopuiu {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final ColorsUiModel f33448dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f33449eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final boolean f33450gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final qb0.iobyxmoadg f33451iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final int f33452lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final boolean f33453nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final qb0.zoijcleaow f33454ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f33455wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final qb0.wkgbmnqykc f33456zoijcleaow;

    public zdlpuopuiu(qb0.iobyxmoadg ratingHeaderUiModel, qb0.wkgbmnqykc reviewsUiModel, qb0.zoijcleaow awaitingEvaluationStub, int i13, boolean z13, boolean z14, int i14, boolean z15, ColorsUiModel colorsModel) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(ratingHeaderUiModel, "ratingHeaderUiModel");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(reviewsUiModel, "reviewsUiModel");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(awaitingEvaluationStub, "awaitingEvaluationStub");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(colorsModel, "colorsModel");
        this.f33451iobyxmoadg = ratingHeaderUiModel;
        this.f33456zoijcleaow = reviewsUiModel;
        this.f33454ppxfxbqfkf = awaitingEvaluationStub;
        this.f33455wkgbmnqykc = i13;
        this.f33449eablkybsjg = z13;
        this.f33450gxszxtbevo = z14;
        this.f33452lqeggnwhkg = i14;
        this.f33453nufgyqmvbu = z15;
        this.f33448dxjokdxxww = colorsModel;
    }

    public final boolean dxjokdxxww() {
        return this.f33453nufgyqmvbu;
    }

    public final qb0.wkgbmnqykc eablkybsjg() {
        return this.f33456zoijcleaow;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zdlpuopuiu)) {
            return false;
        }
        zdlpuopuiu zdlpuopuiuVar = (zdlpuopuiu) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f33451iobyxmoadg, zdlpuopuiuVar.f33451iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f33456zoijcleaow, zdlpuopuiuVar.f33456zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f33454ppxfxbqfkf, zdlpuopuiuVar.f33454ppxfxbqfkf) && this.f33455wkgbmnqykc == zdlpuopuiuVar.f33455wkgbmnqykc && this.f33449eablkybsjg == zdlpuopuiuVar.f33449eablkybsjg && this.f33450gxszxtbevo == zdlpuopuiuVar.f33450gxszxtbevo && this.f33452lqeggnwhkg == zdlpuopuiuVar.f33452lqeggnwhkg && this.f33453nufgyqmvbu == zdlpuopuiuVar.f33453nufgyqmvbu && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f33448dxjokdxxww, zdlpuopuiuVar.f33448dxjokdxxww);
    }

    public final int gxszxtbevo() {
        return this.f33455wkgbmnqykc;
    }

    public int hashCode() {
        return (((((((((((((((this.f33451iobyxmoadg.hashCode() * 31) + this.f33456zoijcleaow.hashCode()) * 31) + this.f33454ppxfxbqfkf.hashCode()) * 31) + Integer.hashCode(this.f33455wkgbmnqykc)) * 31) + Boolean.hashCode(this.f33449eablkybsjg)) * 31) + Boolean.hashCode(this.f33450gxszxtbevo)) * 31) + Integer.hashCode(this.f33452lqeggnwhkg)) * 31) + Boolean.hashCode(this.f33453nufgyqmvbu)) * 31) + this.f33448dxjokdxxww.hashCode();
    }

    public final qb0.zoijcleaow iobyxmoadg() {
        return this.f33454ppxfxbqfkf;
    }

    public final boolean lqeggnwhkg() {
        return this.f33450gxszxtbevo;
    }

    public final boolean nufgyqmvbu() {
        return this.f33449eablkybsjg;
    }

    public final ColorsUiModel ppxfxbqfkf() {
        return this.f33448dxjokdxxww;
    }

    public String toString() {
        return "Model(ratingHeaderUiModel=" + this.f33451iobyxmoadg + ", reviewsUiModel=" + this.f33456zoijcleaow + ", awaitingEvaluationStub=" + this.f33454ppxfxbqfkf + ", titleBarRes=" + this.f33455wkgbmnqykc + ", isLoading=" + this.f33449eablkybsjg + ", isAddReviewVisible=" + this.f33450gxszxtbevo + ", buttonEditTextRes=" + this.f33452lqeggnwhkg + ", isNeedScrollToTop=" + this.f33453nufgyqmvbu + ", colorsModel=" + this.f33448dxjokdxxww + ")";
    }

    public final qb0.iobyxmoadg wkgbmnqykc() {
        return this.f33451iobyxmoadg;
    }

    public final int zoijcleaow() {
        return this.f33452lqeggnwhkg;
    }
}
