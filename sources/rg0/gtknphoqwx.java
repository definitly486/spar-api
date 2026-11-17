package rg0;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.myspar.impl.domain.model.Promotion;
import uz.PromotionDto;

/* JADX INFO: loaded from: classes4.dex */
public abstract class gtknphoqwx {
    public static final Promotion iobyxmoadg(PromotionDto promotionDto) {
        zdlpuopuiu.btonecajqb(promotionDto, "<this>");
        String codePromo = promotionDto.getCodePromo();
        String dashboardName = promotionDto.getDashboardName();
        String dashboardShortDescription = promotionDto.getDashboardShortDescription();
        String promoSticker = promotionDto.getPromoSticker();
        if (promoSticker == null) {
            promoSticker = "";
        }
        return new Promotion(dashboardName, dashboardShortDescription, promoSticker, promotionDto.getColor(), f40.zoijcleaow.f32832yggfygwlhe.iobyxmoadg(promotionDto.getNavLink()), promotionDto.getReference(), codePromo);
    }
}
