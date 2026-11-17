package wd1;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import mk.wflxmlrfwp;
import qm1.RateProductItemDto;
import ru.myspar.proloyalty.core.domain.models.reviewWithBonuses.ReviewWithBonuses;
import ru.myspar.proloyalty.core.domain.models.reviewWithBonuses.ReviewWithBonusesItem;
import zd1.BonusReviewDto;

/* JADX INFO: loaded from: classes5.dex */
public abstract class iobyxmoadg {
    public static final ReviewWithBonuses iobyxmoadg(BonusReviewDto bonusReviewDto) {
        zdlpuopuiu.btonecajqb(bonusReviewDto, "<this>");
        ReviewWithBonusesItem reviewWithBonusesItemZoijcleaow = zoijcleaow(bonusReviewDto.getProductItem());
        String place = bonusReviewDto.getPlace();
        Integer numVdvldrhtss = kcexrzcfyt.vdvldrhtss(bonusReviewDto.getBonusQuantity());
        Integer num = (numVdvldrhtss == null || numVdvldrhtss.intValue() <= 0) ? null : numVdvldrhtss;
        nj.iobyxmoadg.C1516iobyxmoadg c1516iobyxmoadg = nj.iobyxmoadg.f70173yggfygwlhe;
        return new ReviewWithBonuses(0, reviewWithBonusesItemZoijcleaow, place, num, nj.iobyxmoadg.ojitshcjhn(nj.ppxfxbqfkf.zdlpuopuiu(wflxmlrfwp.cdpycssgdh(bonusReviewDto.getDelay(), 0L), nj.wkgbmnqykc.SECONDS)), bonusReviewDto.getPlaceholder(), 1, (gtknphoqwx) null);
    }

    private static final ReviewWithBonusesItem zoijcleaow(RateProductItemDto rateProductItemDto) {
        String productArticle = rateProductItemDto.getProductArticle();
        String productName = rateProductItemDto.getProductName();
        String imageUrl = rateProductItemDto.getImageUrl();
        if (imageUrl == null) {
            imageUrl = "";
        }
        return new ReviewWithBonusesItem(productArticle, productName, imageUrl);
    }
}
