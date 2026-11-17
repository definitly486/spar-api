package m00;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.handler.ProductMessageType;
import ru.myspar.core.domain.interactor.product_change.models.ChangeProductAnalyticParams;
import ru.myspar.core.domain.models.cart.ProductData;
import ru.myspar.core.domain.models.cart.ProductUIData;
import ru.myspar.core.models.measure_type.MeasureType;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final List f64847eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final ChangeProductAnalyticParams f64848gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f64849iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final double f64850ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final MeasureType f64851wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f64852zoijcleaow;

    public iobyxmoadg(String id2, String article, double d13, MeasureType measure, List limits, ChangeProductAnalyticParams changeProductAnalyticParams) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(article, "article");
        zdlpuopuiu.btonecajqb(measure, "measure");
        zdlpuopuiu.btonecajqb(limits, "limits");
        this.f64849iobyxmoadg = id2;
        this.f64852zoijcleaow = article;
        this.f64850ppxfxbqfkf = d13;
        this.f64851wkgbmnqykc = measure;
        this.f64847eablkybsjg = limits;
        this.f64848gxszxtbevo = changeProductAnalyticParams;
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
            str = iobyxmoadgVar.f64849iobyxmoadg;
        }
        if ((i13 & 2) != 0) {
            str2 = iobyxmoadgVar.f64852zoijcleaow;
        }
        String str3 = str2;
        if ((i13 & 4) != 0) {
            d13 = iobyxmoadgVar.f64850ppxfxbqfkf;
        }
        double d14 = d13;
        if ((i13 & 8) != 0) {
            measureType = iobyxmoadgVar.f64851wkgbmnqykc;
        }
        MeasureType measureType2 = measureType;
        if ((i13 & 16) != 0) {
            list = iobyxmoadgVar.f64847eablkybsjg;
        }
        List list2 = list;
        if ((i13 & 32) != 0) {
            changeProductAnalyticParams = iobyxmoadgVar.f64848gxszxtbevo;
        }
        return iobyxmoadgVar.zoijcleaow(str, str3, d14, measureType2, list2, changeProductAnalyticParams);
    }

    public final ProductData dxjokdxxww(boolean z13, ProductMessageType productMessageType) {
        return new ProductData(this.f64849iobyxmoadg, this.f64852zoijcleaow, this.f64850ppxfxbqfkf, this.f64851wkgbmnqykc, z13, this.f64847eablkybsjg, productMessageType);
    }

    public final String eablkybsjg() {
        return this.f64852zoijcleaow;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f64849iobyxmoadg, iobyxmoadgVar.f64849iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f64852zoijcleaow, iobyxmoadgVar.f64852zoijcleaow) && Double.compare(this.f64850ppxfxbqfkf, iobyxmoadgVar.f64850ppxfxbqfkf) == 0 && zdlpuopuiu.eablkybsjg(this.f64851wkgbmnqykc, iobyxmoadgVar.f64851wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f64847eablkybsjg, iobyxmoadgVar.f64847eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f64848gxszxtbevo, iobyxmoadgVar.f64848gxszxtbevo);
    }

    public final ProductUIData gtknphoqwx(boolean z13, ProductMessageType productMessageType) {
        return new ProductUIData(this.f64849iobyxmoadg, this.f64852zoijcleaow, this.f64850ppxfxbqfkf, this.f64851wkgbmnqykc, z13, this.f64847eablkybsjg, productMessageType);
    }

    public final String gxszxtbevo() {
        return this.f64849iobyxmoadg;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.f64849iobyxmoadg.hashCode() * 31) + this.f64852zoijcleaow.hashCode()) * 31) + Double.hashCode(this.f64850ppxfxbqfkf)) * 31) + this.f64851wkgbmnqykc.hashCode()) * 31) + this.f64847eablkybsjg.hashCode()) * 31;
        ChangeProductAnalyticParams changeProductAnalyticParams = this.f64848gxszxtbevo;
        return iHashCode + (changeProductAnalyticParams == null ? 0 : changeProductAnalyticParams.hashCode());
    }

    public final boolean iobyxmoadg(u00.iobyxmoadg productSourceData) {
        zdlpuopuiu.btonecajqb(productSourceData, "productSourceData");
        return zdlpuopuiu.eablkybsjg(this.f64849iobyxmoadg, productSourceData.iobyxmoadg()) && this.f64850ppxfxbqfkf == productSourceData.wkgbmnqykc() && zdlpuopuiu.eablkybsjg(this.f64851wkgbmnqykc, productSourceData.ppxfxbqfkf());
    }

    public final MeasureType lqeggnwhkg() {
        return this.f64851wkgbmnqykc;
    }

    public final double nufgyqmvbu() {
        return this.f64850ppxfxbqfkf;
    }

    public String toString() {
        return "ChangeProductData(id=" + this.f64849iobyxmoadg + ", article=" + this.f64852zoijcleaow + ", quantity=" + this.f64850ppxfxbqfkf + ", measure=" + this.f64851wkgbmnqykc + ", limits=" + this.f64847eablkybsjg + ", analyticParams=" + this.f64848gxszxtbevo + ")";
    }

    public final ChangeProductAnalyticParams wkgbmnqykc() {
        return this.f64848gxszxtbevo;
    }

    public final iobyxmoadg zoijcleaow(String id2, String article, double d13, MeasureType measure, List limits, ChangeProductAnalyticParams changeProductAnalyticParams) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(article, "article");
        zdlpuopuiu.btonecajqb(measure, "measure");
        zdlpuopuiu.btonecajqb(limits, "limits");
        return new iobyxmoadg(id2, article, d13, measure, limits, changeProductAnalyticParams);
    }
}
