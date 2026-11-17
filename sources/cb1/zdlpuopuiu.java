package cb1;

import ru.myspar.proloyalty.core.domain.models.ColorsUiModel;

/* JADX INFO: loaded from: classes5.dex */
public final class zdlpuopuiu {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final ColorsUiModel f19542dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f19543eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final boolean f19544gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final p91.iobyxmoadg f19545iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final int f19546lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final boolean f19547nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final p91.zoijcleaow f19548ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f19549wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final p91.wkgbmnqykc f19550zoijcleaow;

    public zdlpuopuiu(p91.iobyxmoadg ratingHeaderUiModel, p91.wkgbmnqykc reviewsUiModel, p91.zoijcleaow awaitingEvaluationStub, int i13, boolean z13, boolean z14, int i14, boolean z15, ColorsUiModel colorsModel) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(ratingHeaderUiModel, "ratingHeaderUiModel");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(reviewsUiModel, "reviewsUiModel");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(awaitingEvaluationStub, "awaitingEvaluationStub");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(colorsModel, "colorsModel");
        this.f19545iobyxmoadg = ratingHeaderUiModel;
        this.f19550zoijcleaow = reviewsUiModel;
        this.f19548ppxfxbqfkf = awaitingEvaluationStub;
        this.f19549wkgbmnqykc = i13;
        this.f19543eablkybsjg = z13;
        this.f19544gxszxtbevo = z14;
        this.f19546lqeggnwhkg = i14;
        this.f19547nufgyqmvbu = z15;
        this.f19542dxjokdxxww = colorsModel;
    }

    public final boolean dxjokdxxww() {
        return this.f19547nufgyqmvbu;
    }

    public final p91.wkgbmnqykc eablkybsjg() {
        return this.f19550zoijcleaow;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zdlpuopuiu)) {
            return false;
        }
        zdlpuopuiu zdlpuopuiuVar = (zdlpuopuiu) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f19545iobyxmoadg, zdlpuopuiuVar.f19545iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f19550zoijcleaow, zdlpuopuiuVar.f19550zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f19548ppxfxbqfkf, zdlpuopuiuVar.f19548ppxfxbqfkf) && this.f19549wkgbmnqykc == zdlpuopuiuVar.f19549wkgbmnqykc && this.f19543eablkybsjg == zdlpuopuiuVar.f19543eablkybsjg && this.f19544gxszxtbevo == zdlpuopuiuVar.f19544gxszxtbevo && this.f19546lqeggnwhkg == zdlpuopuiuVar.f19546lqeggnwhkg && this.f19547nufgyqmvbu == zdlpuopuiuVar.f19547nufgyqmvbu && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f19542dxjokdxxww, zdlpuopuiuVar.f19542dxjokdxxww);
    }

    public final int gxszxtbevo() {
        return this.f19549wkgbmnqykc;
    }

    public int hashCode() {
        return (((((((((((((((this.f19545iobyxmoadg.hashCode() * 31) + this.f19550zoijcleaow.hashCode()) * 31) + this.f19548ppxfxbqfkf.hashCode()) * 31) + Integer.hashCode(this.f19549wkgbmnqykc)) * 31) + Boolean.hashCode(this.f19543eablkybsjg)) * 31) + Boolean.hashCode(this.f19544gxszxtbevo)) * 31) + Integer.hashCode(this.f19546lqeggnwhkg)) * 31) + Boolean.hashCode(this.f19547nufgyqmvbu)) * 31) + this.f19542dxjokdxxww.hashCode();
    }

    public final p91.zoijcleaow iobyxmoadg() {
        return this.f19548ppxfxbqfkf;
    }

    public final boolean lqeggnwhkg() {
        return this.f19544gxszxtbevo;
    }

    public final boolean nufgyqmvbu() {
        return this.f19543eablkybsjg;
    }

    public final ColorsUiModel ppxfxbqfkf() {
        return this.f19542dxjokdxxww;
    }

    public String toString() {
        return "Model(ratingHeaderUiModel=" + this.f19545iobyxmoadg + ", reviewsUiModel=" + this.f19550zoijcleaow + ", awaitingEvaluationStub=" + this.f19548ppxfxbqfkf + ", titleBarRes=" + this.f19549wkgbmnqykc + ", isLoading=" + this.f19543eablkybsjg + ", isAddReviewVisible=" + this.f19544gxszxtbevo + ", buttonEditTextRes=" + this.f19546lqeggnwhkg + ", isNeedScrollToTop=" + this.f19547nufgyqmvbu + ", colorsModel=" + this.f19542dxjokdxxww + ")";
    }

    public final p91.iobyxmoadg wkgbmnqykc() {
        return this.f19545iobyxmoadg;
    }

    public final int zoijcleaow() {
        return this.f19546lqeggnwhkg;
    }
}
