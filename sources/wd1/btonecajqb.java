package wd1;

import k21.ojitshcjhn;
import kotlin.jvm.internal.zdlpuopuiu;
import my0.PromotionDto;
import ru.myspar.proloyalty.myspar.impl.domain.model.Promotion;

/* JADX INFO: loaded from: classes5.dex */
public abstract class btonecajqb {
    public static final Promotion iobyxmoadg(PromotionDto promotionDto) {
        zdlpuopuiu.btonecajqb(promotionDto, "<this>");
        String codePromo = promotionDto.getCodePromo();
        String dashboardName = promotionDto.getDashboardName();
        String dashboardShortDescription = promotionDto.getDashboardShortDescription();
        String promoSticker = promotionDto.getPromoSticker();
        if (promoSticker == null) {
            promoSticker = "";
        }
        return new Promotion(dashboardName, dashboardShortDescription, promoSticker, promotionDto.getColor(), ojitshcjhn.f53516yggfygwlhe.iobyxmoadg(promotionDto.getNavLink()), promotionDto.getReference(), codePromo);
    }
}
