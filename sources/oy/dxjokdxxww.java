package oy;

import hg.jyumaefscl;
import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.promo.Promotion;
import uz.PromotionDto;

/* JADX INFO: loaded from: classes4.dex */
public final class dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final DateTimeFormatter f75080iobyxmoadg = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");

    private final Promotion.PromotionOnboarding eablkybsjg(PromotionDto.PromotionOnboardingDto promotionOnboardingDto) {
        return new Promotion.PromotionOnboarding(promotionOnboardingDto.getTitle(), promotionOnboardingDto.getDescription(), promotionOnboardingDto.getImage(), promotionOnboardingDto.getOrder());
    }

    private final Promotion.SponsorItem gxszxtbevo(PromotionDto.SponsorDto sponsorDto) {
        return new Promotion.SponsorItem(sponsorDto.getCode(), sponsorDto.getName(), sponsorDto.getPic());
    }

    private final Promotion lqeggnwhkg(PromotionDto promotionDto) {
        Integer balance = promotionDto.getBalance();
        String balanceFormat = promotionDto.getBalanceFormat();
        String lastUpdatedBalance = promotionDto.getLastUpdatedBalance();
        String str = lastUpdatedBalance == null ? "" : lastUpdatedBalance;
        Promotion.zoijcleaow.iobyxmoadg iobyxmoadgVar = Promotion.zoijcleaow.f87352yggfygwlhe;
        String type = promotionDto.getType();
        if (type == null) {
            type = "";
        }
        Promotion.zoijcleaow zoijcleaowVarIobyxmoadg = iobyxmoadgVar.iobyxmoadg(type);
        String codePromo = promotionDto.getCodePromo();
        String dashboardName = promotionDto.getDashboardName();
        String dashboardShortDescription = promotionDto.getDashboardShortDescription();
        List onboardings = promotionDto.getOnboardings();
        if (onboardings == null) {
            onboardings = jyumaefscl.wflxmlrfwp();
        }
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(onboardings, 10));
        Iterator it = onboardings.iterator();
        while (it.hasNext()) {
            arrayList.add(eablkybsjg((PromotionDto.PromotionOnboardingDto) it.next()));
        }
        String promoName = promotionDto.getPromoName();
        String shortDescription = promotionDto.getShortDescription();
        String fullDescription = promotionDto.getFullDescription();
        String productsText = promotionDto.getProductsText();
        String commonRulesDescription = promotionDto.getCommonRulesDescription();
        String promoSticker = promotionDto.getPromoSticker();
        String str2 = promoSticker == null ? "" : promoSticker;
        String promoStickers = promotionDto.getPromoStickers();
        String str3 = promoStickers == null ? "" : promoStickers;
        String imagePromo = promotionDto.getImagePromo();
        String str4 = imagePromo == null ? "" : imagePromo;
        String color = promotionDto.getColor();
        String colorNotActive = promotionDto.getColorNotActive();
        String str5 = colorNotActive == null ? "" : colorNotActive;
        String buttonText = promotionDto.getButtonText();
        String str6 = buttonText == null ? "" : buttonText;
        Promotion.PromotionDate promotionDatePpxfxbqfkf = ppxfxbqfkf(promotionDto.getExpirationDate());
        List items = promotionDto.getItems();
        ArrayList arrayList2 = new ArrayList(jyumaefscl.cqumvgiudr(items, 10));
        Iterator it2 = items.iterator();
        while (it2.hasNext()) {
            arrayList2.add(wkgbmnqykc((PromotionDto.PromotionItemDto) it2.next()));
        }
        boolean showSponsors = promotionDto.getShowSponsors();
        List sponsors = promotionDto.getSponsors();
        ArrayList arrayList3 = new ArrayList(jyumaefscl.cqumvgiudr(sponsors, 10));
        Iterator it3 = sponsors.iterator();
        while (it3.hasNext()) {
            arrayList3.add(gxszxtbevo((PromotionDto.SponsorDto) it3.next()));
        }
        return new Promotion(balance, balanceFormat, str, zoijcleaowVarIobyxmoadg, codePromo, dashboardName, dashboardShortDescription, arrayList, promoName, shortDescription, fullDescription, productsText, commonRulesDescription, str2, str3, str4, color, str5, str6, promotionDatePpxfxbqfkf, arrayList2, showSponsors, arrayList3, f40.zoijcleaow.f32832yggfygwlhe.iobyxmoadg(promotionDto.getNavLink()), promotionDto.getReference());
    }

    private final Promotion.PromotionDate ppxfxbqfkf(PromotionDto.PromotionDateDto promotionDateDto) {
        return new Promotion.PromotionDate(zoijcleaow(promotionDateDto.getStart()), zoijcleaow(promotionDateDto.getEnd()));
    }

    private final Promotion.PromotionItem wkgbmnqykc(PromotionDto.PromotionItemDto promotionItemDto) {
        String id2 = promotionItemDto.getId();
        if (id2 == null) {
            id2 = promotionItemDto.getName();
        }
        String str = id2;
        String name = promotionItemDto.getName();
        double price = promotionItemDto.getPrice();
        double oldPrice = promotionItemDto.getOldPrice();
        String unit = promotionItemDto.getUnit();
        int needs = promotionItemDto.getNeeds();
        String qrCode = promotionItemDto.getQrCode();
        String image = promotionItemDto.getImage();
        String description = promotionItemDto.getDescription();
        if (description == null) {
            description = "";
        }
        String str2 = description;
        String rewardText = promotionItemDto.getRewardText();
        Boolean isOpen = promotionItemDto.getIsOpen();
        return new Promotion.PromotionItem(str, name, price, oldPrice, unit, needs, qrCode, image, str2, rewardText, isOpen != null ? isOpen.booleanValue() : false);
    }

    private final LocalDateTime zoijcleaow(String str) {
        if (str.length() <= 0) {
            return null;
        }
        try {
            return LocalDateTime.parse(str, this.f75080iobyxmoadg);
        } catch (DateTimeException unused) {
            return null;
        }
    }

    public final Promotion iobyxmoadg(PromotionDto dto) {
        zdlpuopuiu.btonecajqb(dto, "dto");
        return lqeggnwhkg(dto);
    }
}
