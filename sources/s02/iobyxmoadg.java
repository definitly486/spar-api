package s02;

import gg.pmvmpeiblj;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.rate.rate_product.impl.domain.model.RateProductItem;
import ru.myspar.rate.rate_product.impl.domain.model.RateProductReviewData;
import z02.RateProductItemDto;

/* JADX INFO: loaded from: classes6.dex */
public abstract class iobyxmoadg {
    public static final RateProductItem iobyxmoadg(RateProductItemDto rateProductItemDto) {
        zdlpuopuiu.btonecajqb(rateProductItemDto, "<this>");
        String productArticle = rateProductItemDto.getProductArticle();
        String productName = rateProductItemDto.getProductName();
        String imageUrl = rateProductItemDto.getImageUrl();
        Integer userRating = rateProductItemDto.getUserRating();
        int iZoijcleaow = userRating != null ? pmvmpeiblj.zoijcleaow(userRating.intValue()) : 0;
        String userReview = rateProductItemDto.getUserReview();
        if (userReview == null) {
            userReview = "";
        }
        return new RateProductItem(productArticle, productName, imageUrl, new RateProductReviewData(iZoijcleaow, userReview, null));
    }
}
