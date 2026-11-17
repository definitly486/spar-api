package s02;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.rate.rate_product.impl.domain.model.RateProductReviewData;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f105172iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final RateProductReviewData f105173zoijcleaow;

    public zoijcleaow(String productArticle, RateProductReviewData review) {
        zdlpuopuiu.btonecajqb(productArticle, "productArticle");
        zdlpuopuiu.btonecajqb(review, "review");
        this.f105172iobyxmoadg = productArticle;
        this.f105173zoijcleaow = review;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f105172iobyxmoadg, zoijcleaowVar.f105172iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f105173zoijcleaow, zoijcleaowVar.f105173zoijcleaow);
    }

    public int hashCode() {
        return (this.f105172iobyxmoadg.hashCode() * 31) + this.f105173zoijcleaow.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f105172iobyxmoadg;
    }

    public String toString() {
        return "RateProductReviewParams(productArticle=" + this.f105172iobyxmoadg + ", review=" + this.f105173zoijcleaow + ")";
    }

    public final RateProductReviewData zoijcleaow() {
        return this.f105173zoijcleaow;
    }
}
