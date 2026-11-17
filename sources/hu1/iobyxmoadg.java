package hu1;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import lu1.AgreementBlockDto;
import lu1.AvailableProductsBlockDto;
import lu1.CustomizableParameterDto;
import lu1.CustomizableParametersBlockDto;
import lu1.ImageBannerDto;
import lu1.PriceInfoBlockDto;
import lu1.ProgressBarBlockDto;
import lu1.PromoCodeBlockDto;
import lu1.SubscriptionDetailDto;
import lu1.TermDto;
import q11.dxjokdxxww;
import ru.myspar.proloyalty.core.models.progress_bar.CartProgressBarRapid;
import ru.myspar.proloyalty.core.models.promocode.Promocode;
import ru.myspar.proloyalty.subscription.api.model.detail.SubscriptionDetailAgreement;
import ru.myspar.proloyalty.subscription.api.model.detail.SubscriptionDetailAvailableProducts;
import ru.myspar.proloyalty.subscription.api.model.detail.SubscriptionDetailCustomizableParameter;
import ru.myspar.proloyalty.subscription.api.model.detail.SubscriptionDetailCustomizableParametersBlock;
import ru.myspar.proloyalty.subscription.api.model.detail.SubscriptionDetailImageBanner;
import ru.myspar.proloyalty.subscription.api.model.detail.SubscriptionDetailInfo;
import ru.myspar.proloyalty.subscription.api.model.detail.SubscriptionDetailPriceInfo;
import ru.myspar.proloyalty.subscription.api.model.detail.SubscriptionDetailProgressBar;
import ru.myspar.proloyalty.subscription.api.model.detail.SubscriptionDetailTerm;

/* JADX INFO: loaded from: classes6.dex */
public abstract class iobyxmoadg {
    private static final SubscriptionDetailTerm btonecajqb(TermDto termDto) {
        String iconUrl = termDto.getIconUrl();
        if (iconUrl == null) {
            iconUrl = "";
        }
        String title = termDto.getTitle();
        return new SubscriptionDetailTerm(iconUrl, title != null ? title : "");
    }

    private static final Promocode dxjokdxxww(PromoCodeBlockDto promoCodeBlockDto) {
        String value = promoCodeBlockDto.getValue();
        if (value == null) {
            value = "";
        }
        boolean status = promoCodeBlockDto.getStatus();
        String statusText = promoCodeBlockDto.getStatusText();
        return new Promocode(value, status, statusText != null ? statusText : "");
    }

    private static final SubscriptionDetailImageBanner eablkybsjg(ImageBannerDto imageBannerDto) {
        String imageUrl = imageBannerDto.getImageUrl();
        if (imageUrl == null) {
            imageUrl = "";
        }
        String title = imageBannerDto.getTitle();
        if (title == null) {
            title = "";
        }
        String subtitle = imageBannerDto.getSubtitle();
        if (subtitle == null) {
            subtitle = "";
        }
        String backgroundColorHex = imageBannerDto.getBackgroundColorHex();
        return new SubscriptionDetailImageBanner(imageUrl, title, subtitle, backgroundColorHex != null ? backgroundColorHex : "");
    }

    public static final SubscriptionDetailInfo gxszxtbevo(SubscriptionDetailDto subscriptionDetailDto) {
        ArrayList arrayList;
        zdlpuopuiu.btonecajqb(subscriptionDetailDto, "<this>");
        String id2 = subscriptionDetailDto.getId();
        String str = id2 == null ? "" : id2;
        String title = subscriptionDetailDto.getTitle();
        String str2 = title == null ? "" : title;
        Boolean isAvailableForOrder = subscriptionDetailDto.getIsAvailableForOrder();
        boolean zBooleanValue = isAvailableForOrder != null ? isAvailableForOrder.booleanValue() : true;
        Boolean autoRenewal = subscriptionDetailDto.getAutoRenewal();
        ImageBannerDto imageBanner = subscriptionDetailDto.getImageBanner();
        SubscriptionDetailImageBanner subscriptionDetailImageBannerEablkybsjg = imageBanner != null ? eablkybsjg(imageBanner) : null;
        ProgressBarBlockDto progressBar = subscriptionDetailDto.getProgressBar();
        SubscriptionDetailProgressBar subscriptionDetailProgressBarNufgyqmvbu = progressBar != null ? nufgyqmvbu(progressBar) : null;
        AvailableProductsBlockDto availableProducts = subscriptionDetailDto.getAvailableProducts();
        SubscriptionDetailAvailableProducts subscriptionDetailAvailableProductsPpxfxbqfkf = availableProducts != null ? ppxfxbqfkf(availableProducts) : null;
        CustomizableParametersBlockDto customizableParameters = subscriptionDetailDto.getCustomizableParameters();
        SubscriptionDetailCustomizableParametersBlock subscriptionDetailCustomizableParametersBlockWkgbmnqykc = customizableParameters != null ? wkgbmnqykc(customizableParameters) : null;
        PromoCodeBlockDto promoCode = subscriptionDetailDto.getPromoCode();
        Promocode promocodeDxjokdxxww = promoCode != null ? dxjokdxxww(promoCode) : null;
        List terms = subscriptionDetailDto.getTerms();
        if (terms != null) {
            arrayList = new ArrayList(jyumaefscl.cqumvgiudr(terms, 10));
            Iterator it = terms.iterator();
            while (it.hasNext()) {
                arrayList.add(btonecajqb((TermDto) it.next()));
            }
        } else {
            arrayList = null;
        }
        List listWflxmlrfwp = arrayList == null ? jyumaefscl.wflxmlrfwp() : arrayList;
        AgreementBlockDto agreement = subscriptionDetailDto.getAgreement();
        SubscriptionDetailAgreement subscriptionDetailAgreementZoijcleaow = agreement != null ? zoijcleaow(agreement) : null;
        PriceInfoBlockDto priceInfo = subscriptionDetailDto.getPriceInfo();
        SubscriptionDetailPriceInfo subscriptionDetailPriceInfoLqeggnwhkg = priceInfo != null ? lqeggnwhkg(priceInfo) : null;
        List payments = subscriptionDetailDto.getPayments();
        List listIobyxmoadg = payments != null ? xu0.iobyxmoadg.iobyxmoadg(payments) : null;
        return new SubscriptionDetailInfo(str, str2, zBooleanValue, autoRenewal, subscriptionDetailImageBannerEablkybsjg, subscriptionDetailProgressBarNufgyqmvbu, subscriptionDetailAvailableProductsPpxfxbqfkf, subscriptionDetailCustomizableParametersBlockWkgbmnqykc, promocodeDxjokdxxww, listWflxmlrfwp, subscriptionDetailAgreementZoijcleaow, subscriptionDetailPriceInfoLqeggnwhkg, listIobyxmoadg == null ? jyumaefscl.wflxmlrfwp() : listIobyxmoadg);
    }

    private static final SubscriptionDetailCustomizableParameter.AdditionalInfo iobyxmoadg(CustomizableParameterDto.AdditionalInfo additionalInfo) {
        List listWflxmlrfwp;
        String strWkgbmnqykc;
        String title = additionalInfo.getTitle();
        List<CustomizableParameterDto.AdditionalInfo.RapidItemDto> rapids = additionalInfo.getRapids();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(rapids, 10));
        for (CustomizableParameterDto.AdditionalInfo.RapidItemDto rapidItemDto : rapids) {
            String icon = rapidItemDto.getIcon();
            if (icon == null) {
                icon = "";
            }
            String title2 = rapidItemDto.getTitle();
            String str = title2 != null ? title2 : "";
            String value = rapidItemDto.getValue();
            if (value == null || (strWkgbmnqykc = dxjokdxxww.wkgbmnqykc(value)) == null || (listWflxmlrfwp = jyumaefscl.eablkybsjg(strWkgbmnqykc)) == null) {
                listWflxmlrfwp = jyumaefscl.wflxmlrfwp();
            }
            arrayList.add(new CartProgressBarRapid(icon, str, listWflxmlrfwp));
        }
        return new SubscriptionDetailCustomizableParameter.AdditionalInfo(title, arrayList);
    }

    private static final SubscriptionDetailPriceInfo lqeggnwhkg(PriceInfoBlockDto priceInfoBlockDto) {
        double sum = priceInfoBlockDto.getSum();
        String sumNoDiscounts = priceInfoBlockDto.getSumNoDiscounts();
        if (sumNoDiscounts == null) {
            sumNoDiscounts = "";
        }
        return new SubscriptionDetailPriceInfo(sum, sumNoDiscounts);
    }

    private static final SubscriptionDetailProgressBar nufgyqmvbu(ProgressBarBlockDto progressBarBlockDto) {
        String title = progressBarBlockDto.getTitle();
        if (title == null) {
            title = "";
        }
        String subtitle = progressBarBlockDto.getSubtitle();
        String str = subtitle != null ? subtitle : "";
        Integer currentValue = progressBarBlockDto.getCurrentValue();
        int iIntValue = currentValue != null ? currentValue.intValue() : 0;
        Integer neededValue = progressBarBlockDto.getNeededValue();
        return new SubscriptionDetailProgressBar(title, str, iIntValue, neededValue != null ? neededValue.intValue() : 0);
    }

    private static final SubscriptionDetailAvailableProducts ppxfxbqfkf(AvailableProductsBlockDto availableProductsBlockDto) {
        String title = availableProductsBlockDto.getTitle();
        if (title == null) {
            title = "";
        }
        List<AvailableProductsBlockDto.Product> items = availableProductsBlockDto.getItems();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(items, 10));
        for (AvailableProductsBlockDto.Product product : items) {
            String imageUrl = product.getImageUrl();
            if (imageUrl == null) {
                imageUrl = "";
            }
            String name = product.getName();
            if (name == null) {
                name = "";
            }
            arrayList.add(new SubscriptionDetailAvailableProducts.Product(imageUrl, name));
        }
        return new SubscriptionDetailAvailableProducts(title, arrayList);
    }

    private static final SubscriptionDetailCustomizableParametersBlock wkgbmnqykc(CustomizableParametersBlockDto customizableParametersBlockDto) {
        String title = customizableParametersBlockDto.getTitle();
        if (title == null) {
            title = "";
        }
        String description = customizableParametersBlockDto.getDescription();
        String str = description != null ? description : "";
        List<CustomizableParameterDto> items = customizableParametersBlockDto.getItems();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(items, 10));
        for (CustomizableParameterDto customizableParameterDto : items) {
            String id2 = customizableParameterDto.getId();
            String name = customizableParameterDto.getName();
            List<CustomizableParameterDto.Value> values = customizableParameterDto.getValues();
            ArrayList arrayList2 = new ArrayList(jyumaefscl.cqumvgiudr(values, 10));
            for (CustomizableParameterDto.Value value : values) {
                arrayList2.add(new SubscriptionDetailCustomizableParameter.Value(value.getId(), value.getValue(), value.getIsSelected()));
            }
            CustomizableParameterDto.AdditionalInfo additionalInfo = customizableParameterDto.getAdditionalInfo();
            arrayList.add(new SubscriptionDetailCustomizableParameter(id2, name, arrayList2, additionalInfo != null ? iobyxmoadg(additionalInfo) : null));
        }
        return new SubscriptionDetailCustomizableParametersBlock(title, str, arrayList);
    }

    private static final SubscriptionDetailAgreement zoijcleaow(AgreementBlockDto agreementBlockDto) {
        String title = agreementBlockDto.getTitle();
        if (title == null) {
            title = "";
        }
        String documentUrl = agreementBlockDto.getDocumentUrl();
        return new SubscriptionDetailAgreement(title, documentUrl != null ? documentUrl : "");
    }
}
