package jm1;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.rate.rate_product.impl.domain.model.RateProductReviewData;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f51710iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final RateProductReviewData f51711zoijcleaow;

    public zoijcleaow(String productArticle, RateProductReviewData review) {
        zdlpuopuiu.btonecajqb(productArticle, "productArticle");
        zdlpuopuiu.btonecajqb(review, "review");
        this.f51710iobyxmoadg = productArticle;
        this.f51711zoijcleaow = review;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f51710iobyxmoadg, zoijcleaowVar.f51710iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f51711zoijcleaow, zoijcleaowVar.f51711zoijcleaow);
    }

    public int hashCode() {
        return (this.f51710iobyxmoadg.hashCode() * 31) + this.f51711zoijcleaow.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f51710iobyxmoadg;
    }

    public String toString() {
        return "RateProductReviewParams(productArticle=" + this.f51710iobyxmoadg + ", review=" + this.f51711zoijcleaow + ")";
    }

    public final RateProductReviewData zoijcleaow() {
        return this.f51711zoijcleaow;
    }
}
