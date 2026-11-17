package ez0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.handler.ProductMessageType;
import ru.myspar.proloyalty.core.domain.interactor.product_change.models.ChangeProductAnalyticParams;
import ru.myspar.proloyalty.core.domain.models.cart.ProductData;
import ru.myspar.proloyalty.core.domain.models.cart.ProductUIData;
import ru.myspar.proloyalty.core.models.measure_type.MeasureType;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final List f32338eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final ChangeProductAnalyticParams f32339gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f32340iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final double f32341ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final MeasureType f32342wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f32343zoijcleaow;

    public iobyxmoadg(String id2, String article, double d13, MeasureType measure, List limits, ChangeProductAnalyticParams changeProductAnalyticParams) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(article, "article");
        zdlpuopuiu.btonecajqb(measure, "measure");
        zdlpuopuiu.btonecajqb(limits, "limits");
        this.f32340iobyxmoadg = id2;
        this.f32343zoijcleaow = article;
        this.f32341ppxfxbqfkf = d13;
        this.f32342wkgbmnqykc = measure;
        this.f32338eablkybsjg = limits;
        this.f32339gxszxtbevo = changeProductAnalyticParams;
    }

    public static /* synthetic */ ProductData btonecajqb(iobyxmoadg iobyxmoadgVar, boolean z13, ProductMessageType productMessageType, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z13 = false;
        }
        if ((i13 & 2) != 0) {
            productMessageType = null;
        }
        return iobyxmoadgVar.dxjokdxxww(z13, productMessageType);
    }

    public static /* synthetic */ iobyxmoadg ppxfxbqfkf(iobyxmoadg iobyxmoadgVar, String str, String str2, double d13, MeasureType measureType, List list, ChangeProductAnalyticParams changeProductAnalyticParams, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = iobyxmoadgVar.f32340iobyxmoadg;
        }
        if ((i13 & 2) != 0) {
            str2 = iobyxmoadgVar.f32343zoijcleaow;
        }
        String str3 = str2;
        if ((i13 & 4) != 0) {
            d13 = iobyxmoadgVar.f32341ppxfxbqfkf;
        }
        double d14 = d13;
        if ((i13 & 8) != 0) {
            measureType = iobyxmoadgVar.f32342wkgbmnqykc;
        }
        MeasureType measureType2 = measureType;
        if ((i13 & 16) != 0) {
            list = iobyxmoadgVar.f32338eablkybsjg;
        }
        List list2 = list;
        if ((i13 & 32) != 0) {
            changeProductAnalyticParams = iobyxmoadgVar.f32339gxszxtbevo;
        }
        return iobyxmoadgVar.zoijcleaow(str, str3, d14, measureType2, list2, changeProductAnalyticParams);
    }

    public final ProductData dxjokdxxww(boolean z13, ProductMessageType productMessageType) {
        return new ProductData(this.f32340iobyxmoadg, this.f32343zoijcleaow, this.f32341ppxfxbqfkf, this.f32342wkgbmnqykc, z13, this.f32338eablkybsjg, productMessageType);
    }

    public final String eablkybsjg() {
        return this.f32343zoijcleaow;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f32340iobyxmoadg, iobyxmoadgVar.f32340iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f32343zoijcleaow, iobyxmoadgVar.f32343zoijcleaow) && Double.compare(this.f32341ppxfxbqfkf, iobyxmoadgVar.f32341ppxfxbqfkf) == 0 && zdlpuopuiu.eablkybsjg(this.f32342wkgbmnqykc, iobyxmoadgVar.f32342wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f32338eablkybsjg, iobyxmoadgVar.f32338eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f32339gxszxtbevo, iobyxmoadgVar.f32339gxszxtbevo);
    }

    public final ProductUIData gtknphoqwx(boolean z13, ProductMessageType productMessageType) {
        return new ProductUIData(this.f32340iobyxmoadg, this.f32343zoijcleaow, this.f32341ppxfxbqfkf, this.f32342wkgbmnqykc, z13, this.f32338eablkybsjg, productMessageType);
    }

    public final String gxszxtbevo() {
        return this.f32340iobyxmoadg;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.f32340iobyxmoadg.hashCode() * 31) + this.f32343zoijcleaow.hashCode()) * 31) + Double.hashCode(this.f32341ppxfxbqfkf)) * 31) + this.f32342wkgbmnqykc.hashCode()) * 31) + this.f32338eablkybsjg.hashCode()) * 31;
        ChangeProductAnalyticParams changeProductAnalyticParams = this.f32339gxszxtbevo;
        return iHashCode + (changeProductAnalyticParams == null ? 0 : changeProductAnalyticParams.hashCode());
    }

    public final boolean iobyxmoadg(lz0.iobyxmoadg productSourceData) {
        zdlpuopuiu.btonecajqb(productSourceData, "productSourceData");
        return zdlpuopuiu.eablkybsjg(this.f32340iobyxmoadg, productSourceData.iobyxmoadg()) && this.f32341ppxfxbqfkf == productSourceData.wkgbmnqykc() && zdlpuopuiu.eablkybsjg(this.f32342wkgbmnqykc, productSourceData.ppxfxbqfkf());
    }

    public final MeasureType lqeggnwhkg() {
        return this.f32342wkgbmnqykc;
    }

    public final double nufgyqmvbu() {
        return this.f32341ppxfxbqfkf;
    }

    public String toString() {
        return "ChangeProductData(id=" + this.f32340iobyxmoadg + ", article=" + this.f32343zoijcleaow + ", quantity=" + this.f32341ppxfxbqfkf + ", measure=" + this.f32342wkgbmnqykc + ", limits=" + this.f32338eablkybsjg + ", analyticParams=" + this.f32339gxszxtbevo + ")";
    }

    public final ChangeProductAnalyticParams wkgbmnqykc() {
        return this.f32339gxszxtbevo;
    }

    public final iobyxmoadg zoijcleaow(String id2, String article, double d13, MeasureType measure, List limits, ChangeProductAnalyticParams changeProductAnalyticParams) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(article, "article");
        zdlpuopuiu.btonecajqb(measure, "measure");
        zdlpuopuiu.btonecajqb(limits, "limits");
        return new iobyxmoadg(id2, article, d13, measure, limits, changeProductAnalyticParams);
    }
}
