package z82;

import a92.ppxfxbqfkf;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k30.draadjrbmk;
import k82.zoijcleaow;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import qs.eablkybsjg;
import ru.myspar.common.view.bottomsheet.additional_info.AdditionalInfoUiModel;
import ru.myspar.common.view.counter.model.Price;
import ru.myspar.common.view.promo_code.PromoCodeEditorState;
import ru.myspar.core.models.progress_bar.CartProgressBarRapid;
import ru.myspar.core.models.promocode.Promocode;
import ru.myspar.subscription.api.model.detail.SubscriptionDetailAgreement;
import ru.myspar.subscription.api.model.detail.SubscriptionDetailAvailableProducts;
import ru.myspar.subscription.api.model.detail.SubscriptionDetailCustomizableParameter;
import ru.myspar.subscription.api.model.detail.SubscriptionDetailCustomizableParametersBlock;
import ru.myspar.subscription.api.model.detail.SubscriptionDetailImageBanner;
import ru.myspar.subscription.api.model.detail.SubscriptionDetailInfo;
import ru.myspar.subscription.api.model.detail.SubscriptionDetailPriceInfo;
import ru.myspar.subscription.api.model.detail.SubscriptionDetailProgressBar;
import ru.myspar.subscription.api.model.detail.SubscriptionDetailTerm;
import ru.myspar.subscription.impl.detail.domain.State;
import vu.btonecajqb;
import w82.gxszxtbevo;
import yu.wkgbmnqykc;

/* JADX INFO: loaded from: classes6.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: z82.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public /* synthetic */ class C3286iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f129341iobyxmoadg;

        static {
            int[] iArr = new int[btonecajqb.values().length];
            try {
                iArr[btonecajqb.NOT_ENTERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[btonecajqb.APPLIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[btonecajqb.NOT_APPLIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f129341iobyxmoadg = iArr;
        }
    }

    private static final List dxjokdxxww(List list, Map map) {
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SubscriptionDetailCustomizableParameter subscriptionDetailCustomizableParameter = (SubscriptionDetailCustomizableParameter) it.next();
            String str = (String) map.get(subscriptionDetailCustomizableParameter.getId());
            String id2 = subscriptionDetailCustomizableParameter.getId();
            String name = subscriptionDetailCustomizableParameter.getName();
            List<SubscriptionDetailCustomizableParameter.Value> values = subscriptionDetailCustomizableParameter.getValues();
            ArrayList arrayList2 = new ArrayList(jyumaefscl.cqumvgiudr(values, 10));
            for (SubscriptionDetailCustomizableParameter.Value value : values) {
                arrayList2.add(new ppxfxbqfkf.iobyxmoadg(value.getId(), value.getValue(), str != null ? zdlpuopuiu.eablkybsjg(str, value.getValue()) : value.getIsSelected()));
            }
            arrayList.add(new ppxfxbqfkf(id2, name, arrayList2, subscriptionDetailCustomizableParameter.getAdditionalInfo() != null));
        }
        return arrayList;
    }

    private static final vu.iobyxmoadg eablkybsjg(PromoCodeEditorState promoCodeEditorState, String str) {
        int i13 = C3286iobyxmoadg.f129341iobyxmoadg[promoCodeEditorState.getStateFromInput().ordinal()];
        if (i13 == 1) {
            return new vu.iobyxmoadg.ppxfxbqfkf(promoCodeEditorState.getPromoCodeFromInput());
        }
        if (i13 == 2) {
            return new vu.iobyxmoadg.C2930iobyxmoadg(promoCodeEditorState.getPromoCodeFromInput(), str);
        }
        if (i13 == 3) {
            return new vu.iobyxmoadg.zoijcleaow(promoCodeEditorState.getPromoCodeFromInput(), str);
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final wkgbmnqykc gxszxtbevo(State state, boolean z13) {
        SubscriptionDetailInfo detailInfo = state.getDetailInfo();
        SubscriptionDetailPriceInfo priceInfo = detailInfo != null ? detailInfo.getPriceInfo() : null;
        if (z13 || priceInfo == null) {
            return null;
        }
        Price priceWkgbmnqykc = rt.ppxfxbqfkf.wkgbmnqykc(rt.ppxfxbqfkf.f83717iobyxmoadg, priceInfo.getSum(), 2, false, 4, null);
        return new wkgbmnqykc(priceWkgbmnqykc.getPrice(), priceWkgbmnqykc.getPriceFractional(), priceInfo.getSumNoDiscounts(), !state.getIsLoading() && state.getDetailInfo().getIsAvailableForOrder(), draadjrbmk.ppxfxbqfkf(), false);
    }

    private static final AdditionalInfoUiModel iobyxmoadg(SubscriptionDetailCustomizableParametersBlock subscriptionDetailCustomizableParametersBlock, String str) {
        List items;
        Object next;
        SubscriptionDetailCustomizableParameter.AdditionalInfo additionalInfo;
        if (subscriptionDetailCustomizableParametersBlock == null || (items = subscriptionDetailCustomizableParametersBlock.getItems()) == null) {
            return null;
        }
        Iterator it = items.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!zdlpuopuiu.eablkybsjg(((SubscriptionDetailCustomizableParameter) next).getId(), str));
        SubscriptionDetailCustomizableParameter subscriptionDetailCustomizableParameter = (SubscriptionDetailCustomizableParameter) next;
        if (subscriptionDetailCustomizableParameter == null || (additionalInfo = subscriptionDetailCustomizableParameter.getAdditionalInfo()) == null) {
            return null;
        }
        String title = additionalInfo.getTitle();
        String strPpxfxbqfkf = draadjrbmk.ppxfxbqfkf();
        String strPpxfxbqfkf2 = draadjrbmk.ppxfxbqfkf();
        List rapids = additionalInfo.getRapids();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(rapids, 10));
        int i13 = 0;
        for (Object obj : rapids) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                jyumaefscl.iwizpuwonk();
            }
            CartProgressBarRapid cartProgressBarRapid = (CartProgressBarRapid) obj;
            arrayList.add(new AdditionalInfoUiModel.Item(String.valueOf(i13), cartProgressBarRapid.getImageUrl(), cartProgressBarRapid.getTitle(), cartProgressBarRapid.getMessageList()));
            i13 = i14;
        }
        return new AdditionalInfoUiModel(title, strPpxfxbqfkf, strPpxfxbqfkf2, arrayList);
    }

    private static final List lqeggnwhkg(List list) {
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SubscriptionDetailAvailableProducts.Product product = (SubscriptionDetailAvailableProducts.Product) it.next();
            arrayList.add(new zoijcleaow(product.getImageUrl(), product.getName(), null, 4, null));
        }
        return arrayList;
    }

    public static final gxszxtbevo nufgyqmvbu(State state) {
        Boolean autoRenewal;
        zdlpuopuiu.btonecajqb(state, "<this>");
        SubscriptionDetailInfo detailInfo = state.getDetailInfo();
        boolean zBooleanValue = false;
        boolean z13 = (detailInfo != null ? detailInfo.getAutoRenewal() : null) != null;
        boolean isLoading = state.getIsLoading();
        boolean isNeededShowSkeleton = state.getIsNeededShowSkeleton();
        SubscriptionDetailInfo detailInfo2 = state.getDetailInfo();
        String title = detailInfo2 != null ? detailInfo2.getTitle() : null;
        if (title == null) {
            title = "";
        }
        String str = title;
        SubscriptionDetailInfo detailInfo3 = state.getDetailInfo();
        boolean z14 = (detailInfo3 != null ? detailInfo3.getAutoRenewal() : null) != null;
        List listZoijcleaow = zoijcleaow(state, z13);
        wkgbmnqykc wkgbmnqykcVarGxszxtbevo = gxszxtbevo(state, z13);
        SubscriptionDetailInfo detailInfo4 = state.getDetailInfo();
        AdditionalInfoUiModel additionalInfoUiModelIobyxmoadg = iobyxmoadg(detailInfo4 != null ? detailInfo4.getCustomizableParameters() : null, state.getAdditionalInfoSettingId());
        boolean openSettingsBottomSheet = state.getOpenSettingsBottomSheet();
        SubscriptionDetailInfo detailInfo5 = state.getDetailInfo();
        if (detailInfo5 != null && (autoRenewal = detailInfo5.getAutoRenewal()) != null) {
            zBooleanValue = autoRenewal.booleanValue();
        }
        return new gxszxtbevo(isLoading, isNeededShowSkeleton, str, z14, listZoijcleaow, wkgbmnqykcVarGxszxtbevo, additionalInfoUiModelIobyxmoadg, openSettingsBottomSheet, zBooleanValue, !state.getIsAutoRenewalLoading());
    }

    private static final void ppxfxbqfkf(a92.zoijcleaow zoijcleaowVar, List list) {
        list.add(zoijcleaowVar);
    }

    private static final k82.ppxfxbqfkf wkgbmnqykc(SubscriptionDetailProgressBar subscriptionDetailProgressBar) {
        Integer numValueOf = Integer.valueOf(subscriptionDetailProgressBar.getNeededValue());
        if (numValueOf.intValue() <= 0) {
            numValueOf = null;
        }
        return new k82.ppxfxbqfkf(subscriptionDetailProgressBar.getTitle(), subscriptionDetailProgressBar.getSubtitle(), (float) Math.min(1.0d, eablkybsjg.ppxfxbqfkf(subscriptionDetailProgressBar.getCurrentValue(), numValueOf != null ? numValueOf.intValue() : 1.0d, null, 2, null)));
    }

    private static final List zoijcleaow(State state, boolean z13) {
        a92.zoijcleaow ppxfxbqfkfVar;
        String title;
        String strWkgbmnqykc;
        SubscriptionDetailInfo detailInfo = state.getDetailInfo();
        if (detailInfo == null) {
            return jyumaefscl.wflxmlrfwp();
        }
        ArrayList arrayList = new ArrayList();
        SubscriptionDetailImageBanner imageBanner = detailInfo.getImageBanner();
        SubscriptionDetailProgressBar progressBar = detailInfo.getProgressBar();
        if (imageBanner != null && z13) {
            ppxfxbqfkfVar = new a92.zoijcleaow.wkgbmnqykc(imageBanner.getImageUrl(), imageBanner.getBackgroundColorHex(), imageBanner.getTitle(), imageBanner.getSubtitle(), progressBar != null ? wkgbmnqykc(progressBar) : null);
        } else if (progressBar == null || !z13) {
            ppxfxbqfkfVar = imageBanner != null ? new a92.zoijcleaow.ppxfxbqfkf(imageBanner.getImageUrl()) : null;
        } else {
            ppxfxbqfkfVar = new a92.zoijcleaow.gxszxtbevo(wkgbmnqykc(progressBar));
        }
        if (ppxfxbqfkfVar != null) {
            ppxfxbqfkf(ppxfxbqfkfVar, arrayList);
        }
        SubscriptionDetailAvailableProducts availableProducts = detailInfo.getAvailableProducts();
        if (availableProducts != null) {
            if (availableProducts.getItems().isEmpty()) {
                availableProducts = null;
            }
            if (availableProducts != null) {
                ppxfxbqfkf(new a92.zoijcleaow.eablkybsjg(availableProducts.getTitle(), lqeggnwhkg(availableProducts.getItems())), arrayList);
            }
        }
        SubscriptionDetailCustomizableParametersBlock customizableParameters = detailInfo.getCustomizableParameters();
        if (customizableParameters != null) {
            if (z13 || customizableParameters.getItems().isEmpty()) {
                customizableParameters = null;
            }
            if (customizableParameters != null) {
                ppxfxbqfkf(new a92.zoijcleaow.nufgyqmvbu(customizableParameters.getTitle(), customizableParameters.getDescription(), dxjokdxxww(customizableParameters.getItems(), state.getChangedParamsBuffer())), arrayList);
            }
        }
        Promocode promoCode = detailInfo.getPromoCode();
        if (promoCode != null) {
            Promocode promocode = z13 ? null : promoCode;
            if (promocode != null) {
                ppxfxbqfkf(new a92.zoijcleaow.lqeggnwhkg(eablkybsjg(state.getPromoCodeEditorState(), promocode.getStatusText())), arrayList);
            }
        }
        List<SubscriptionDetailTerm> listIobyxmoadg = k30.zoijcleaow.iobyxmoadg(detailInfo.getTerms());
        if (listIobyxmoadg != null) {
            ArrayList arrayList2 = new ArrayList(jyumaefscl.cqumvgiudr(listIobyxmoadg, 10));
            for (SubscriptionDetailTerm subscriptionDetailTerm : listIobyxmoadg) {
                arrayList2.add(new a92.iobyxmoadg(subscriptionDetailTerm.getIconUrl(), subscriptionDetailTerm.getTitle()));
            }
            ppxfxbqfkf(new a92.zoijcleaow.iobyxmoadg(arrayList2), arrayList);
        }
        SubscriptionDetailAgreement agreement = detailInfo.getAgreement();
        if (agreement != null && (title = agreement.getTitle()) != null && (strWkgbmnqykc = draadjrbmk.wkgbmnqykc(title)) != null) {
            ppxfxbqfkf(new a92.zoijcleaow.C0020zoijcleaow(strWkgbmnqykc), arrayList);
        }
        return arrayList;
    }
}
