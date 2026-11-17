package cq0;

import bp0.lqeggnwhkg;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import dq0.btonecajqb;
import dq0.dxjokdxxww;
import dq0.eablkybsjg;
import dq0.gxszxtbevo;
import dq0.nufgyqmvbu;
import dq0.wkgbmnqykc;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.vdvldrhtss;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import ru.myspar.proloyalty.catalog.impl.search.domain.State;
import ru.myspar.proloyalty.common.view.counter.model.CounterModel;
import ru.myspar.proloyalty.common.view.product.model.product.ProductUiModel;
import ru.myspar.proloyalty.core.domain.models.product.Product;
import ru.myspar.proloyalty.core.domain.models.product.ProductListData;
import ru.myspar.proloyalty.core.domain.models.product.PromoProduct;
import ru.myspar.proloyalty.core.domain.models.product.SearchFeatureModel;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
public final class ppxfxbqfkf implements draadjrbmk {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final q41.iobyxmoadg f25508iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final zoijcleaow f25509jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final cq0.iobyxmoadg f25510yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final o91.zoijcleaow f25511zdlpuopuiu;

    /* synthetic */ class iobyxmoadg extends vdvldrhtss implements rgvfuqvkyq {
        iobyxmoadg(Object obj) {
            super(2, obj, q41.iobyxmoadg.class, "getStringWithArrayArgs", "getStringWithArrayArgs(I[Ljava/lang/Object;)Ljava/lang/String;", 0);
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return iobyxmoadg(((Number) obj).intValue(), (Object[]) obj2);
        }

        public final String iobyxmoadg(int i13, Object[] objArr) {
            return ((q41.iobyxmoadg) this.receiver).eablkybsjg(i13, objArr);
        }
    }

    public ppxfxbqfkf(o91.zoijcleaow productUiModelMapper, cq0.iobyxmoadg historyItemsUiMapper, zoijcleaow searchCategoriesUiMapper, q41.iobyxmoadg resourcesManager) {
        zdlpuopuiu.btonecajqb(productUiModelMapper, "productUiModelMapper");
        zdlpuopuiu.btonecajqb(historyItemsUiMapper, "historyItemsUiMapper");
        zdlpuopuiu.btonecajqb(searchCategoriesUiMapper, "searchCategoriesUiMapper");
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        this.f25511zdlpuopuiu = productUiModelMapper;
        this.f25510yggfygwlhe = historyItemsUiMapper;
        this.f25509jyumaefscl = searchCategoriesUiMapper;
        this.f25508iwizpuwonk = resourcesManager;
    }

    private final List btonecajqb(State state, List list) {
        ProductUiModel productUiModelEablkybsjg;
        PromoProduct promo;
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Product product = (Product) it.next();
            o91.zoijcleaow zoijcleaowVar = this.f25511zdlpuopuiu;
            List cartProductDataList = state.getCartProductDataList();
            DeliveryCode deliveryCode = state.getDeliveryCode();
            boolean isRatingFeatureEnabled = state.getIsRatingFeatureEnabled();
            boolean isPurchaseListsFeatureEnabled = state.getIsPurchaseListsFeatureEnabled();
            boolean isVivinoFeatureEnabled = state.getIsVivinoFeatureEnabled();
            ProductListData productListData = state.getProductListData();
            ProductUiModel productUiModelPpxfxbqfkf = zoijcleaowVar.ppxfxbqfkf(product, cartProductDataList, deliveryCode, isRatingFeatureEnabled, isPurchaseListsFeatureEnabled, isVivinoFeatureEnabled, (productListData == null || (promo = productListData.getPromo()) == null) ? null : promo.getAdv(), new iobyxmoadg(this.f25508iwizpuwonk));
            ProductUiModel productUiModel = state.getExpandedProductIds().contains(productUiModelPpxfxbqfkf.getId()) ? productUiModelPpxfxbqfkf : null;
            ProductUiModel productUiModel2 = (productUiModel == null || (productUiModelEablkybsjg = eablkybsjg(productUiModel)) == null) ? productUiModelPpxfxbqfkf : productUiModelEablkybsjg;
            arrayList.add(productUiModel2.lqeggnwhkg(((-1025) & 1) != 0 ? productUiModel2.id : null, ((-1025) & 2) != 0 ? productUiModel2.name : null, ((-1025) & 4) != 0 ? productUiModel2.article : null, ((-1025) & 8) != 0 ? productUiModel2.isProductWithZeroPrice : false, ((-1025) & 16) != 0 ? productUiModel2.price : 0.0d, ((-1025) & 32) != 0 ? productUiModel2.oldPrice : null, ((-1025) & 64) != 0 ? productUiModel2.discount : null, ((-1025) & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? productUiModel2.discountString : null, ((-1025) & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? productUiModel2.hasDiscount : false, ((-1025) & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? productUiModel2.isDispPer100 : false, ((-1025) & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? productUiModel2.measureTypeModel : null, ((-1025) & 2048) != 0 ? productUiModel2.avgWeight : null, ((-1025) & 4096) != 0 ? productUiModel2.isFavorite : state.getFavoritesProductIds().contains(productUiModel2.getId()), ((-1025) & 8192) != 0 ? productUiModel2.favoriteEnabledState : false, ((-1025) & 16384) != 0 ? productUiModel2.inCart : false, ((-1025) & 32768) != 0 ? productUiModel2.photoUrl : null, ((-1025) & 65536) != 0 ? productUiModel2.photoUrls : null, ((-1025) & 131072) != 0 ? productUiModel2.isMultiPhotos : false, ((-1025) & 262144) != 0 ? productUiModel2.fats : null, ((-1025) & 524288) != 0 ? productUiModel2.carbs : null, ((-1025) & 1048576) != 0 ? productUiModel2.protein : null, ((-1025) & 2097152) != 0 ? productUiModel2.energy : null, ((-1025) & 4194304) != 0 ? productUiModel2.params : null, ((-1025) & 8388608) != 0 ? productUiModel2.description : null, ((-1025) & 16777216) != 0 ? productUiModel2.chemical : null, ((-1025) & 33554432) != 0 ? productUiModel2.buyState : null, ((-1025) & 67108864) != 0 ? productUiModel2.stickers : null, ((-1025) & 134217728) != 0 ? productUiModel2.hidePrice : false, ((-1025) & 268435456) != 0 ? productUiModel2.rating : null, ((-1025) & 536870912) != 0 ? productUiModel2.reviewsCount : 0, ((-1025) & 1073741824) != 0 ? productUiModel2.basketQuantity : null, ((-1025) & Integer.MIN_VALUE) != 0 ? productUiModel2.isPmProduct : false, (16777215 & 1) != 0 ? productUiModel2.video : null, (16777215 & 2) != 0 ? productUiModel2.isRatingFeatureEnabled : false, (16777215 & 4) != 0 ? productUiModel2.isPurchaseListsFeatureEnabled : false, (16777215 & 8) != 0 ? productUiModel2.country : null, (16777215 & 16) != 0 ? productUiModel2.region : null, (16777215 & 32) != 0 ? productUiModel2.countryFlagEmoji : null, (16777215 & 64) != 0 ? productUiModel2.type : null, (16777215 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? productUiModel2.kind : null, (16777215 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? productUiModel2.grape : null, (16777215 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? productUiModel2.standart : null, (16777215 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? productUiModel2.countryMapIcon : null, (16777215 & 2048) != 0 ? productUiModel2.tasting : null, (16777215 & 4096) != 0 ? productUiModel2.styling : null, (16777215 & 8192) != 0 ? productUiModel2.button : null, (16777215 & 16384) != 0 ? productUiModel2.hints : null, (16777215 & 32768) != 0 ? productUiModel2.colorsUiModel : null, (16777215 & 65536) != 0 ? productUiModel2.counterModel : null, (16777215 & 131072) != 0 ? productUiModel2.deliveryCode : null, (16777215 & 262144) != 0 ? productUiModel2.vivino : null, (16777215 & 524288) != 0 ? productUiModel2.limits : null, (16777215 & 1048576) != 0 ? productUiModel2.availabilityModel : null, (16777215 & 2097152) != 0 ? productUiModel2.productVariants : null, (16777215 & 4194304) != 0 ? productUiModel2.isSelected : null, (16777215 & 8388608) != 0 ? productUiModel2.adv : null));
        }
        return arrayList;
    }

    private final ProductUiModel eablkybsjg(ProductUiModel productUiModel) {
        CounterModel counterModel = productUiModel.getCounterModel();
        return productUiModel.lqeggnwhkg(((-1025) & 1) != 0 ? productUiModel.id : null, ((-1025) & 2) != 0 ? productUiModel.name : null, ((-1025) & 4) != 0 ? productUiModel.article : null, ((-1025) & 8) != 0 ? productUiModel.isProductWithZeroPrice : false, ((-1025) & 16) != 0 ? productUiModel.price : 0.0d, ((-1025) & 32) != 0 ? productUiModel.oldPrice : null, ((-1025) & 64) != 0 ? productUiModel.discount : null, ((-1025) & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? productUiModel.discountString : null, ((-1025) & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? productUiModel.hasDiscount : false, ((-1025) & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? productUiModel.isDispPer100 : false, ((-1025) & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? productUiModel.measureTypeModel : null, ((-1025) & 2048) != 0 ? productUiModel.avgWeight : null, ((-1025) & 4096) != 0 ? productUiModel.isFavorite : false, ((-1025) & 8192) != 0 ? productUiModel.favoriteEnabledState : false, ((-1025) & 16384) != 0 ? productUiModel.inCart : false, ((-1025) & 32768) != 0 ? productUiModel.photoUrl : null, ((-1025) & 65536) != 0 ? productUiModel.photoUrls : null, ((-1025) & 131072) != 0 ? productUiModel.isMultiPhotos : false, ((-1025) & 262144) != 0 ? productUiModel.fats : null, ((-1025) & 524288) != 0 ? productUiModel.carbs : null, ((-1025) & 1048576) != 0 ? productUiModel.protein : null, ((-1025) & 2097152) != 0 ? productUiModel.energy : null, ((-1025) & 4194304) != 0 ? productUiModel.params : null, ((-1025) & 8388608) != 0 ? productUiModel.description : null, ((-1025) & 16777216) != 0 ? productUiModel.chemical : null, ((-1025) & 33554432) != 0 ? productUiModel.buyState : null, ((-1025) & 67108864) != 0 ? productUiModel.stickers : null, ((-1025) & 134217728) != 0 ? productUiModel.hidePrice : false, ((-1025) & 268435456) != 0 ? productUiModel.rating : null, ((-1025) & 536870912) != 0 ? productUiModel.reviewsCount : 0, ((-1025) & 1073741824) != 0 ? productUiModel.basketQuantity : null, ((-1025) & Integer.MIN_VALUE) != 0 ? productUiModel.isPmProduct : false, (16777215 & 1) != 0 ? productUiModel.video : null, (16777215 & 2) != 0 ? productUiModel.isRatingFeatureEnabled : false, (16777215 & 4) != 0 ? productUiModel.isPurchaseListsFeatureEnabled : false, (16777215 & 8) != 0 ? productUiModel.country : null, (16777215 & 16) != 0 ? productUiModel.region : null, (16777215 & 32) != 0 ? productUiModel.countryFlagEmoji : null, (16777215 & 64) != 0 ? productUiModel.type : null, (16777215 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? productUiModel.kind : null, (16777215 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? productUiModel.grape : null, (16777215 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? productUiModel.standart : null, (16777215 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? productUiModel.countryMapIcon : null, (16777215 & 2048) != 0 ? productUiModel.tasting : null, (16777215 & 4096) != 0 ? productUiModel.styling : null, (16777215 & 8192) != 0 ? productUiModel.button : null, (16777215 & 16384) != 0 ? productUiModel.hints : null, (16777215 & 32768) != 0 ? productUiModel.colorsUiModel : null, (16777215 & 65536) != 0 ? productUiModel.counterModel : counterModel.zoijcleaow((14714 & 1) != 0 ? counterModel.isLoading : false, (14714 & 2) != 0 ? counterModel.isAvailableToBuy : false, (14714 & 4) != 0 ? counterModel.isExpand : true, (14714 & 8) != 0 ? counterModel.priceModel : null, (14714 & 16) != 0 ? counterModel.oldPriceModel : null, (14714 & 32) != 0 ? counterModel.avgWeight : null, (14714 & 64) != 0 ? counterModel.isDispPer100 : false, (14714 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? counterModel.quantity : 0.0d, (14714 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? counterModel.isMeasureTypeSwitchable : false, (14714 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? counterModel.measureType : null, (14714 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? counterModel.productLimitText : null, (14714 & 2048) != 0 ? counterModel.message : productUiModel.getAvailabilityModel().gxszxtbevo(), (14714 & 4096) != 0 ? counterModel.autoHideMessage : !productUiModel.getAvailabilityModel().getIsAvailableToBuy(), (14714 & 8192) != 0 ? counterModel.colorsModel : null), (16777215 & 131072) != 0 ? productUiModel.deliveryCode : null, (16777215 & 262144) != 0 ? productUiModel.vivino : null, (16777215 & 524288) != 0 ? productUiModel.limits : null, (16777215 & 1048576) != 0 ? productUiModel.availabilityModel : null, (16777215 & 2097152) != 0 ? productUiModel.productVariants : null, (16777215 & 4194304) != 0 ? productUiModel.isSelected : null, (16777215 & 8388608) != 0 ? productUiModel.adv : null);
    }

    private final int gxszxtbevo(State state) {
        String sectionId = state.getPayload().getSectionId();
        return (sectionId == null || sectionId.length() == 0) ? lqeggnwhkg.proloyalty_title_search : lqeggnwhkg.proloyalty_title_search_in_category;
    }

    private final List iobyxmoadg(State state) {
        List listBtonecajqb;
        eablkybsjg eablkybsjgVar;
        ArrayList arrayList = new ArrayList();
        List searchHistory = state.getSearchHistory();
        if (searchHistory.isEmpty()) {
            searchHistory = null;
        }
        if (searchHistory == null || (eablkybsjgVar = (eablkybsjg) this.f25510yggfygwlhe.invoke(searchHistory)) == null) {
            boolean isLoading = state.getIsLoading();
            Boolean boolValueOf = Boolean.valueOf(isLoading);
            if (isLoading) {
                boolValueOf = null;
            }
            if (boolValueOf != null) {
                arrayList.add(dxjokdxxww.f29311zdlpuopuiu);
            }
        } else {
            arrayList.add(eablkybsjgVar);
        }
        List searchRecommendations = state.getSearchRecommendations();
        List list = searchRecommendations.isEmpty() ? null : searchRecommendations;
        if (list != null && (listBtonecajqb = btonecajqb(state, list)) != null) {
            arrayList.add(nufgyqmvbu.f29324zdlpuopuiu);
            ArrayList arrayList2 = new ArrayList(jyumaefscl.cqumvgiudr(listBtonecajqb, 10));
            Iterator it = listBtonecajqb.iterator();
            while (it.hasNext()) {
                arrayList2.add(new dq0.lqeggnwhkg((ProductUiModel) it.next()));
            }
            arrayList.addAll(arrayList2);
        }
        return arrayList;
    }

    private final List ppxfxbqfkf(State state) {
        List listBtonecajqb;
        ArrayList arrayList = new ArrayList();
        arrayList.add(gxszxtbevo.f29315zdlpuopuiu);
        List searchRecommendations = state.getSearchRecommendations();
        if (searchRecommendations.isEmpty()) {
            searchRecommendations = null;
        }
        if (searchRecommendations != null && (listBtonecajqb = btonecajqb(state, searchRecommendations)) != null) {
            arrayList.add(nufgyqmvbu.f29324zdlpuopuiu);
            ArrayList arrayList2 = new ArrayList(jyumaefscl.cqumvgiudr(listBtonecajqb, 10));
            Iterator it = listBtonecajqb.iterator();
            while (it.hasNext()) {
                arrayList2.add(new dq0.lqeggnwhkg((ProductUiModel) it.next()));
            }
            arrayList.addAll(arrayList2);
        }
        return arrayList;
    }

    private final List zoijcleaow(State state) {
        List listBtonecajqb;
        List searchCategories;
        List features;
        List searchSuggestions;
        ArrayList arrayList = new ArrayList();
        ProductListData productListData = state.getProductListData();
        if (productListData != null && (searchSuggestions = productListData.getSearchSuggestions()) != null) {
            arrayList.add(new btonecajqb(searchSuggestions));
        }
        ProductListData productListData2 = state.getProductListData();
        if (productListData2 != null && (features = productListData2.getFeatures()) != null) {
            if (state.getPayload().getFlow() == mz0.iobyxmoadg.ORDER_EDIT || features.isEmpty()) {
                features = null;
            }
            if (features != null) {
                ArrayList arrayList2 = new ArrayList(jyumaefscl.cqumvgiudr(features, 10));
                Iterator it = features.iterator();
                while (it.hasNext()) {
                    arrayList2.add(dq0.zoijcleaow.iobyxmoadg((SearchFeatureModel) it.next()));
                }
                arrayList.add(new wkgbmnqykc(arrayList2));
            }
        }
        ProductListData productListData3 = state.getProductListData();
        if (productListData3 != null && (searchCategories = productListData3.getSearchCategories()) != null) {
            arrayList.add(new dq0.ppxfxbqfkf(this.f25509jyumaefscl.invoke(searchCategories)));
        }
        List listWflxmlrfwp = state.wflxmlrfwp();
        if (listWflxmlrfwp.isEmpty()) {
            listWflxmlrfwp = null;
        }
        if (listWflxmlrfwp != null && (listBtonecajqb = btonecajqb(state, listWflxmlrfwp)) != null) {
            arrayList.addAll(listBtonecajqb);
        }
        boolean isPageLoading = state.getIsPageLoading();
        if ((isPageLoading ? Boolean.valueOf(isPageLoading) : null) != null) {
            arrayList.add(jt0.iobyxmoadg.f52316zdlpuopuiu);
        }
        return arrayList;
    }

    @Override // tg.draadjrbmk
    /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
    public yp0.rgvfuqvkyq invoke(State state) {
        List listIobyxmoadg;
        zdlpuopuiu.btonecajqb(state, "state");
        String strDraadjrbmk = state.getSearchQuery().draadjrbmk();
        boolean zZfvoamnweg = kcexrzcfyt.zfvoamnweg(strDraadjrbmk);
        boolean z13 = kcexrzcfyt.p(strDraadjrbmk).toString().length() >= 2;
        if (zZfvoamnweg || !z13 || state.getProductListData() == null || !state.wflxmlrfwp().isEmpty()) {
            listIobyxmoadg = (!z13 || state.wflxmlrfwp().isEmpty()) ? iobyxmoadg(state) : zoijcleaow(state);
        } else {
            listIobyxmoadg = ppxfxbqfkf(state);
        }
        return new yp0.rgvfuqvkyq(state.getIsLoading(), state.getPayload().getFlow() == mz0.iobyxmoadg.ORDER_EDIT, state.getSearchQuery(), gxszxtbevo(state), Integer.valueOf(state.getCurrentPage()), listIobyxmoadg, state.getFilterSortPanelIsVisible(), state.getSortType(), state.getIsGridType(), state.wflxmlrfwp().size() > 1);
    }
}
