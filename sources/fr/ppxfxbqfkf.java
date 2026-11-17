package fr;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import hg.ikoacuggdj;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.catalog.impl.product_list.domain.State;
import ru.myspar.catalog.impl.product_list.domain.model.ProductListRecommendationBlock;
import ru.myspar.core.domain.models.catalog.ProductRecommendationsBlock;
import ru.myspar.core.domain.models.product.Product;
import ru.myspar.core.domain.models.product.ProductListData;
import ru.myspar.core.domain.models.product.PromoProduct;
import ru.myspar.core.models.delivery.DeliveryCode;

/* JADX INFO: loaded from: classes4.dex */
public final class ppxfxbqfkf implements a8.ppxfxbqfkf {
    private final State ppxfxbqfkf(State state, lqeggnwhkg.draadjrbmk draadjrbmkVar) {
        ProductListData productListDataPpxfxbqfkf = draadjrbmkVar.ppxfxbqfkf();
        if (!draadjrbmkVar.wkgbmnqykc()) {
            productListDataPpxfxbqfkf = wkgbmnqykc(productListDataPpxfxbqfkf, state.getProductListData());
        }
        ProductListData productListData = productListDataPpxfxbqfkf;
        List listIobyxmoadg = draadjrbmkVar.iobyxmoadg();
        if (!draadjrbmkVar.wkgbmnqykc()) {
            listIobyxmoadg = null;
        }
        if (listIobyxmoadg == null) {
            listIobyxmoadg = state.getBanners();
        }
        List list = listIobyxmoadg;
        DeliveryCode deliveryCodeZoijcleaow = draadjrbmkVar.zoijcleaow();
        List productList = productListData.getProductList();
        if (productList == null) {
            productList = jyumaefscl.wflxmlrfwp();
        }
        boolean isGridType = productList.size() < 2 ? false : state.getIsGridType();
        Set expandedProductIds = draadjrbmkVar.wkgbmnqykc() ? null : state.getExpandedProductIds();
        return state.zoijcleaow((184831 & 1) != 0 ? state.payload : null, (184831 & 2) != 0 ? state.headerType : null, (184831 & 4) != 0 ? state.isSwipeToRefreshLoading : false, (184831 & 8) != 0 ? state.isProductListLoading : false, (184831 & 16) != 0 ? state.isFullScreenLoading : false, (184831 & 32) != 0 ? state.featureToggles : null, (184831 & 64) != 0 ? state.catalogSection : null, (184831 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.selectedCatalogSectionId : null, (184831 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.productDataList : null, (184831 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.productListData : productListData, (184831 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.deliveryCode : deliveryCodeZoijcleaow, (184831 & 2048) != 0 ? state.banners : list, (184831 & 4096) != 0 ? state.selectedSort : null, (184831 & 8192) != 0 ? state.isGridType : isGridType, (184831 & 16384) != 0 ? state.comboSetList : null, (184831 & 32768) != 0 ? state.isNeededShowComboSetShimmer : false, (184831 & 65536) != 0 ? state.expandedProductIds : expandedProductIds == null ? ikoacuggdj.eablkybsjg() : expandedProductIds, (184831 & 131072) != 0 ? state.recommendations : null);
    }

    private final ProductListData wkgbmnqykc(ProductListData productListData, ProductListData productListData2) {
        if (productListData2 == null) {
            return productListData;
        }
        List productList = productListData2.getProductList();
        if (productList == null) {
            productList = jyumaefscl.wflxmlrfwp();
        }
        List productList2 = productListData.getProductList();
        if (productList2 == null) {
            productList2 = jyumaefscl.wflxmlrfwp();
        }
        List listIxidwrxhsl = jyumaefscl.ixidwrxhsl(productList, productList2);
        ProductListData.SelectionsData selectionsData = productListData.getSelectionsData();
        if (selectionsData == null) {
            selectionsData = productListData2.getSelectionsData();
        }
        ProductListData.SelectionsData selectionsData2 = selectionsData;
        PromoProduct promo = productListData.getPromo();
        if (promo == null) {
            promo = productListData2.getPromo();
        }
        PromoProduct promoProduct = promo;
        k10.ppxfxbqfkf additionalBlocksOption = productListData.getAdditionalBlocksOption();
        if (additionalBlocksOption == null) {
            additionalBlocksOption = productListData2.getAdditionalBlocksOption();
        }
        return productListData.zoijcleaow((131067 & 1) != 0 ? productListData.searchSuggestions : null, (131067 & 2) != 0 ? productListData.searchCategories : null, (131067 & 4) != 0 ? productListData.productList : listIxidwrxhsl, (131067 & 8) != 0 ? productListData.paging : null, (131067 & 16) != 0 ? productListData.filterSections : null, (131067 & 32) != 0 ? productListData.titleImage : null, (131067 & 64) != 0 ? productListData.selectionsData : selectionsData2, (131067 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? productListData.textModal : null, (131067 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? productListData.headerModal : null, (131067 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? productListData.buttonModal : null, (131067 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? productListData.textBefore : null, (131067 & 2048) != 0 ? productListData.isAgeCheckNeeded : false, (131067 & 4096) != 0 ? productListData.section : null, (131067 & 8192) != 0 ? productListData.colorsModel : null, (131067 & 16384) != 0 ? productListData.promo : promoProduct, (131067 & 32768) != 0 ? productListData.features : null, (131067 & 65536) != 0 ? productListData.additionalBlocksOption : additionalBlocksOption);
    }

    private final State zoijcleaow(State state, lqeggnwhkg.gxszxtbevo gxszxtbevoVar) {
        ArrayList arrayList;
        List<Product> productList;
        Product productZoijcleaow;
        ProductListData productListData = state.getProductListData();
        if (productListData == null || (productList = productListData.getProductList()) == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(jyumaefscl.cqumvgiudr(productList, 10));
            for (Product product : productList) {
                Product product2 = zdlpuopuiu.eablkybsjg(product.getId(), gxszxtbevoVar.iobyxmoadg()) ? product : null;
                if (product2 != null && (productZoijcleaow = product2.zoijcleaow(((-513) & 1) != 0 ? product2.id : null, ((-513) & 2) != 0 ? product2.name : null, ((-513) & 4) != 0 ? product2.article : null, ((-513) & 8) != 0 ? product2.price : 0.0d, ((-513) & 16) != 0 ? product2.oldPrice : null, ((-513) & 32) != 0 ? product2.discount : null, ((-513) & 64) != 0 ? product2.isDispPer100 : false, ((-513) & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? product2.measureTypeModel : null, ((-513) & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? product2.avgWeight : null, ((-513) & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? product2.isFavorite : gxszxtbevoVar.zoijcleaow(), ((-513) & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? product2.isAvailable : false, ((-513) & 2048) != 0 ? product2.availableOnlyForPickup : false, ((-513) & 4096) != 0 ? product2.onlyInShop : false, ((-513) & 8192) != 0 ? product2.isAvailableToBuy : false, ((-513) & 16384) != 0 ? product2.productPropertyNames : null, ((-513) & 32768) != 0 ? product2.productProperties : null, ((-513) & 65536) != 0 ? product2.photoUrl : null, ((-513) & 131072) != 0 ? product2.photoUrls : null, ((-513) & 262144) != 0 ? product2.energy : null, ((-513) & 524288) != 0 ? product2.fats : null, ((-513) & 1048576) != 0 ? product2.carbs : null, ((-513) & 2097152) != 0 ? product2.protein : null, ((-513) & 4194304) != 0 ? product2.params : null, ((-513) & 8388608) != 0 ? product2.description : null, ((-513) & 16777216) != 0 ? product2.chemical : null, ((-513) & 33554432) != 0 ? product2.hasDiscount : false, ((-513) & 67108864) != 0 ? product2.hints : null, ((-513) & 134217728) != 0 ? product2.hidePrice : false, ((-513) & 268435456) != 0 ? product2.rating : null, ((-513) & 536870912) != 0 ? product2.reviews : 0, ((-513) & 1073741824) != 0 ? product2.isPmProduct : false, ((-513) & Integer.MIN_VALUE) != 0 ? product2.video : null, (65535 & 1) != 0 ? product2.colorsModel : null, (65535 & 2) != 0 ? product2.country : null, (65535 & 4) != 0 ? product2.region : null, (65535 & 8) != 0 ? product2.countryFlagEmoji : null, (65535 & 16) != 0 ? product2.type : null, (65535 & 32) != 0 ? product2.kind : null, (65535 & 64) != 0 ? product2.grape : null, (65535 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? product2.standart : null, (65535 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? product2.countryMapIcon : null, (65535 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? product2.tasting : null, (65535 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? product2.styling : null, (65535 & 2048) != 0 ? product2.button : null, (65535 & 4096) != 0 ? product2.limits : null, (65535 & 8192) != 0 ? product2.vivino : null, (65535 & 16384) != 0 ? product2.productVariants : null, (65535 & 32768) != 0 ? product2.quantity : 0.0d)) != null) {
                    product = productZoijcleaow;
                }
                arrayList2.add(product);
            }
            arrayList = arrayList2;
        }
        ProductListData productListData2 = state.getProductListData();
        return state.zoijcleaow((184831 & 1) != 0 ? state.payload : null, (184831 & 2) != 0 ? state.headerType : null, (184831 & 4) != 0 ? state.isSwipeToRefreshLoading : false, (184831 & 8) != 0 ? state.isProductListLoading : false, (184831 & 16) != 0 ? state.isFullScreenLoading : false, (184831 & 32) != 0 ? state.featureToggles : null, (184831 & 64) != 0 ? state.catalogSection : null, (184831 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.selectedCatalogSectionId : null, (184831 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.productDataList : null, (184831 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.productListData : productListData2 != null ? productListData2.zoijcleaow((131067 & 1) != 0 ? productListData2.searchSuggestions : null, (131067 & 2) != 0 ? productListData2.searchCategories : null, (131067 & 4) != 0 ? productListData2.productList : arrayList, (131067 & 8) != 0 ? productListData2.paging : null, (131067 & 16) != 0 ? productListData2.filterSections : null, (131067 & 32) != 0 ? productListData2.titleImage : null, (131067 & 64) != 0 ? productListData2.selectionsData : null, (131067 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? productListData2.textModal : null, (131067 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? productListData2.headerModal : null, (131067 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? productListData2.buttonModal : null, (131067 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? productListData2.textBefore : null, (131067 & 2048) != 0 ? productListData2.isAgeCheckNeeded : false, (131067 & 4096) != 0 ? productListData2.section : null, (131067 & 8192) != 0 ? productListData2.colorsModel : null, (131067 & 16384) != 0 ? productListData2.promo : null, (131067 & 32768) != 0 ? productListData2.features : null, (131067 & 65536) != 0 ? productListData2.additionalBlocksOption : null) : null, (184831 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.deliveryCode : null, (184831 & 2048) != 0 ? state.banners : null, (184831 & 4096) != 0 ? state.selectedSort : null, (184831 & 8192) != 0 ? state.isGridType : false, (184831 & 16384) != 0 ? state.comboSetList : null, (184831 & 32768) != 0 ? state.isNeededShowComboSetShimmer : false, (184831 & 65536) != 0 ? state.expandedProductIds : null, (184831 & 131072) != 0 ? state.recommendations : null);
    }

    @Override // a8.ppxfxbqfkf
    /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
    public State iobyxmoadg(State state, lqeggnwhkg msg) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        zdlpuopuiu.btonecajqb(msg, "msg");
        if (msg instanceof lqeggnwhkg.gtknphoqwx) {
            return state.zoijcleaow((184831 & 1) != 0 ? state.payload : null, (184831 & 2) != 0 ? state.headerType : null, (184831 & 4) != 0 ? state.isSwipeToRefreshLoading : ((lqeggnwhkg.gtknphoqwx) msg).iobyxmoadg(), (184831 & 8) != 0 ? state.isProductListLoading : false, (184831 & 16) != 0 ? state.isFullScreenLoading : false, (184831 & 32) != 0 ? state.featureToggles : null, (184831 & 64) != 0 ? state.catalogSection : null, (184831 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.selectedCatalogSectionId : null, (184831 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.productDataList : null, (184831 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.productListData : null, (184831 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.deliveryCode : null, (184831 & 2048) != 0 ? state.banners : null, (184831 & 4096) != 0 ? state.selectedSort : null, (184831 & 8192) != 0 ? state.isGridType : false, (184831 & 16384) != 0 ? state.comboSetList : null, (184831 & 32768) != 0 ? state.isNeededShowComboSetShimmer : false, (184831 & 65536) != 0 ? state.expandedProductIds : null, (184831 & 131072) != 0 ? state.recommendations : null);
        }
        if (msg instanceof lqeggnwhkg.C0769lqeggnwhkg) {
            return state.zoijcleaow((184831 & 1) != 0 ? state.payload : null, (184831 & 2) != 0 ? state.headerType : null, (184831 & 4) != 0 ? state.isSwipeToRefreshLoading : false, (184831 & 8) != 0 ? state.isProductListLoading : ((lqeggnwhkg.C0769lqeggnwhkg) msg).iobyxmoadg(), (184831 & 16) != 0 ? state.isFullScreenLoading : false, (184831 & 32) != 0 ? state.featureToggles : null, (184831 & 64) != 0 ? state.catalogSection : null, (184831 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.selectedCatalogSectionId : null, (184831 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.productDataList : null, (184831 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.productListData : null, (184831 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.deliveryCode : null, (184831 & 2048) != 0 ? state.banners : null, (184831 & 4096) != 0 ? state.selectedSort : null, (184831 & 8192) != 0 ? state.isGridType : false, (184831 & 16384) != 0 ? state.comboSetList : null, (184831 & 32768) != 0 ? state.isNeededShowComboSetShimmer : false, (184831 & 65536) != 0 ? state.expandedProductIds : null, (184831 & 131072) != 0 ? state.recommendations : null);
        }
        if (msg instanceof lqeggnwhkg.wkgbmnqykc) {
            return state.zoijcleaow((184831 & 1) != 0 ? state.payload : null, (184831 & 2) != 0 ? state.headerType : null, (184831 & 4) != 0 ? state.isSwipeToRefreshLoading : false, (184831 & 8) != 0 ? state.isProductListLoading : false, (184831 & 16) != 0 ? state.isFullScreenLoading : ((lqeggnwhkg.wkgbmnqykc) msg).iobyxmoadg(), (184831 & 32) != 0 ? state.featureToggles : null, (184831 & 64) != 0 ? state.catalogSection : null, (184831 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.selectedCatalogSectionId : null, (184831 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.productDataList : null, (184831 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.productListData : null, (184831 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.deliveryCode : null, (184831 & 2048) != 0 ? state.banners : null, (184831 & 4096) != 0 ? state.selectedSort : null, (184831 & 8192) != 0 ? state.isGridType : false, (184831 & 16384) != 0 ? state.comboSetList : null, (184831 & 32768) != 0 ? state.isNeededShowComboSetShimmer : false, (184831 & 65536) != 0 ? state.expandedProductIds : null, (184831 & 131072) != 0 ? state.recommendations : null);
        }
        if (msg instanceof lqeggnwhkg.ppxfxbqfkf) {
            return state.zoijcleaow((184831 & 1) != 0 ? state.payload : null, (184831 & 2) != 0 ? state.headerType : null, (184831 & 4) != 0 ? state.isSwipeToRefreshLoading : false, (184831 & 8) != 0 ? state.isProductListLoading : false, (184831 & 16) != 0 ? state.isFullScreenLoading : false, (184831 & 32) != 0 ? state.featureToggles : ((lqeggnwhkg.ppxfxbqfkf) msg).iobyxmoadg(), (184831 & 64) != 0 ? state.catalogSection : null, (184831 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.selectedCatalogSectionId : null, (184831 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.productDataList : null, (184831 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.productListData : null, (184831 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.deliveryCode : null, (184831 & 2048) != 0 ? state.banners : null, (184831 & 4096) != 0 ? state.selectedSort : null, (184831 & 8192) != 0 ? state.isGridType : false, (184831 & 16384) != 0 ? state.comboSetList : null, (184831 & 32768) != 0 ? state.isNeededShowComboSetShimmer : false, (184831 & 65536) != 0 ? state.expandedProductIds : null, (184831 & 131072) != 0 ? state.recommendations : null);
        }
        if (msg instanceof lqeggnwhkg.rgvfuqvkyq) {
            return state.zoijcleaow((184831 & 1) != 0 ? state.payload : null, (184831 & 2) != 0 ? state.headerType : null, (184831 & 4) != 0 ? state.isSwipeToRefreshLoading : false, (184831 & 8) != 0 ? state.isProductListLoading : false, (184831 & 16) != 0 ? state.isFullScreenLoading : false, (184831 & 32) != 0 ? state.featureToggles : null, (184831 & 64) != 0 ? state.catalogSection : null, (184831 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.selectedCatalogSectionId : null, (184831 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.productDataList : ((lqeggnwhkg.rgvfuqvkyq) msg).iobyxmoadg(), (184831 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.productListData : null, (184831 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.deliveryCode : null, (184831 & 2048) != 0 ? state.banners : null, (184831 & 4096) != 0 ? state.selectedSort : null, (184831 & 8192) != 0 ? state.isGridType : false, (184831 & 16384) != 0 ? state.comboSetList : null, (184831 & 32768) != 0 ? state.isNeededShowComboSetShimmer : false, (184831 & 65536) != 0 ? state.expandedProductIds : null, (184831 & 131072) != 0 ? state.recommendations : null);
        }
        if (msg instanceof lqeggnwhkg.gxszxtbevo) {
            return zoijcleaow(state, (lqeggnwhkg.gxszxtbevo) msg);
        }
        if (msg instanceof lqeggnwhkg.vdvldrhtss) {
            return state.zoijcleaow((184831 & 1) != 0 ? state.payload : null, (184831 & 2) != 0 ? state.headerType : null, (184831 & 4) != 0 ? state.isSwipeToRefreshLoading : false, (184831 & 8) != 0 ? state.isProductListLoading : false, (184831 & 16) != 0 ? state.isFullScreenLoading : false, (184831 & 32) != 0 ? state.featureToggles : null, (184831 & 64) != 0 ? state.catalogSection : ((lqeggnwhkg.vdvldrhtss) msg).iobyxmoadg(), (184831 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.selectedCatalogSectionId : null, (184831 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.productDataList : null, (184831 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.productListData : null, (184831 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.deliveryCode : null, (184831 & 2048) != 0 ? state.banners : null, (184831 & 4096) != 0 ? state.selectedSort : null, (184831 & 8192) != 0 ? state.isGridType : false, (184831 & 16384) != 0 ? state.comboSetList : null, (184831 & 32768) != 0 ? state.isNeededShowComboSetShimmer : false, (184831 & 65536) != 0 ? state.expandedProductIds : null, (184831 & 131072) != 0 ? state.recommendations : null);
        }
        if (msg instanceof lqeggnwhkg.btonecajqb) {
            return state.zoijcleaow((184831 & 1) != 0 ? state.payload : null, (184831 & 2) != 0 ? state.headerType : null, (184831 & 4) != 0 ? state.isSwipeToRefreshLoading : false, (184831 & 8) != 0 ? state.isProductListLoading : false, (184831 & 16) != 0 ? state.isFullScreenLoading : false, (184831 & 32) != 0 ? state.featureToggles : null, (184831 & 64) != 0 ? state.catalogSection : null, (184831 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.selectedCatalogSectionId : ((lqeggnwhkg.btonecajqb) msg).iobyxmoadg(), (184831 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.productDataList : null, (184831 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.productListData : null, (184831 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.deliveryCode : null, (184831 & 2048) != 0 ? state.banners : null, (184831 & 4096) != 0 ? state.selectedSort : null, (184831 & 8192) != 0 ? state.isGridType : false, (184831 & 16384) != 0 ? state.comboSetList : null, (184831 & 32768) != 0 ? state.isNeededShowComboSetShimmer : false, (184831 & 65536) != 0 ? state.expandedProductIds : null, (184831 & 131072) != 0 ? state.recommendations : null);
        }
        if (msg instanceof lqeggnwhkg.eablkybsjg) {
            return state.zoijcleaow((184831 & 1) != 0 ? state.payload : null, (184831 & 2) != 0 ? state.headerType : null, (184831 & 4) != 0 ? state.isSwipeToRefreshLoading : false, (184831 & 8) != 0 ? state.isProductListLoading : false, (184831 & 16) != 0 ? state.isFullScreenLoading : false, (184831 & 32) != 0 ? state.featureToggles : null, (184831 & 64) != 0 ? state.catalogSection : null, (184831 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.selectedCatalogSectionId : null, (184831 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.productDataList : null, (184831 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.productListData : null, (184831 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.deliveryCode : null, (184831 & 2048) != 0 ? state.banners : null, (184831 & 4096) != 0 ? state.selectedSort : null, (184831 & 8192) != 0 ? state.isGridType : ((lqeggnwhkg.eablkybsjg) msg).iobyxmoadg(), (184831 & 16384) != 0 ? state.comboSetList : null, (184831 & 32768) != 0 ? state.isNeededShowComboSetShimmer : false, (184831 & 65536) != 0 ? state.expandedProductIds : null, (184831 & 131072) != 0 ? state.recommendations : null);
        }
        if (msg instanceof lqeggnwhkg.draadjrbmk) {
            return ppxfxbqfkf(state, (lqeggnwhkg.draadjrbmk) msg);
        }
        if (zdlpuopuiu.eablkybsjg(msg, lqeggnwhkg.agtfadlqog.f34690iobyxmoadg)) {
            return state.zoijcleaow((184831 & 1) != 0 ? state.payload : null, (184831 & 2) != 0 ? state.headerType : null, (184831 & 4) != 0 ? state.isSwipeToRefreshLoading : false, (184831 & 8) != 0 ? state.isProductListLoading : false, (184831 & 16) != 0 ? state.isFullScreenLoading : false, (184831 & 32) != 0 ? state.featureToggles : null, (184831 & 64) != 0 ? state.catalogSection : null, (184831 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.selectedCatalogSectionId : null, (184831 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.productDataList : null, (184831 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.productListData : null, (184831 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.deliveryCode : null, (184831 & 2048) != 0 ? state.banners : null, (184831 & 4096) != 0 ? state.selectedSort : null, (184831 & 8192) != 0 ? state.isGridType : false, (184831 & 16384) != 0 ? state.comboSetList : null, (184831 & 32768) != 0 ? state.isNeededShowComboSetShimmer : true, (184831 & 65536) != 0 ? state.expandedProductIds : null, (184831 & 131072) != 0 ? state.recommendations : null);
        }
        if (msg instanceof lqeggnwhkg.zoijcleaow) {
            return state.zoijcleaow((184831 & 1) != 0 ? state.payload : null, (184831 & 2) != 0 ? state.headerType : null, (184831 & 4) != 0 ? state.isSwipeToRefreshLoading : false, (184831 & 8) != 0 ? state.isProductListLoading : false, (184831 & 16) != 0 ? state.isFullScreenLoading : false, (184831 & 32) != 0 ? state.featureToggles : null, (184831 & 64) != 0 ? state.catalogSection : null, (184831 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.selectedCatalogSectionId : null, (184831 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.productDataList : null, (184831 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.productListData : null, (184831 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.deliveryCode : null, (184831 & 2048) != 0 ? state.banners : null, (184831 & 4096) != 0 ? state.selectedSort : null, (184831 & 8192) != 0 ? state.isGridType : false, (184831 & 16384) != 0 ? state.comboSetList : ((lqeggnwhkg.zoijcleaow) msg).iobyxmoadg(), (184831 & 32768) != 0 ? state.isNeededShowComboSetShimmer : false, (184831 & 65536) != 0 ? state.expandedProductIds : null, (184831 & 131072) != 0 ? state.recommendations : null);
        }
        if (msg instanceof lqeggnwhkg.nufgyqmvbu) {
            return state.zoijcleaow((184831 & 1) != 0 ? state.payload : null, (184831 & 2) != 0 ? state.headerType : null, (184831 & 4) != 0 ? state.isSwipeToRefreshLoading : false, (184831 & 8) != 0 ? state.isProductListLoading : false, (184831 & 16) != 0 ? state.isFullScreenLoading : false, (184831 & 32) != 0 ? state.featureToggles : null, (184831 & 64) != 0 ? state.catalogSection : null, (184831 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.selectedCatalogSectionId : null, (184831 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.productDataList : null, (184831 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.productListData : null, (184831 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.deliveryCode : null, (184831 & 2048) != 0 ? state.banners : null, (184831 & 4096) != 0 ? state.selectedSort : ((lqeggnwhkg.nufgyqmvbu) msg).iobyxmoadg(), (184831 & 8192) != 0 ? state.isGridType : false, (184831 & 16384) != 0 ? state.comboSetList : null, (184831 & 32768) != 0 ? state.isNeededShowComboSetShimmer : false, (184831 & 65536) != 0 ? state.expandedProductIds : null, (184831 & 131072) != 0 ? state.recommendations : null);
        }
        if (msg instanceof lqeggnwhkg.iobyxmoadg) {
            return state.zoijcleaow((184831 & 1) != 0 ? state.payload : null, (184831 & 2) != 0 ? state.headerType : null, (184831 & 4) != 0 ? state.isSwipeToRefreshLoading : false, (184831 & 8) != 0 ? state.isProductListLoading : false, (184831 & 16) != 0 ? state.isFullScreenLoading : false, (184831 & 32) != 0 ? state.featureToggles : null, (184831 & 64) != 0 ? state.catalogSection : null, (184831 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.selectedCatalogSectionId : null, (184831 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.productDataList : null, (184831 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.productListData : null, (184831 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.deliveryCode : null, (184831 & 2048) != 0 ? state.banners : null, (184831 & 4096) != 0 ? state.selectedSort : null, (184831 & 8192) != 0 ? state.isGridType : false, (184831 & 16384) != 0 ? state.comboSetList : null, (184831 & 32768) != 0 ? state.isNeededShowComboSetShimmer : false, (184831 & 65536) != 0 ? state.expandedProductIds : ikoacuggdj.wflxmlrfwp(state.getExpandedProductIds(), ((lqeggnwhkg.iobyxmoadg) msg).iobyxmoadg()), (184831 & 131072) != 0 ? state.recommendations : null);
        }
        if (msg instanceof lqeggnwhkg.wflxmlrfwp) {
            return state.zoijcleaow((184831 & 1) != 0 ? state.payload : null, (184831 & 2) != 0 ? state.headerType : null, (184831 & 4) != 0 ? state.isSwipeToRefreshLoading : false, (184831 & 8) != 0 ? state.isProductListLoading : false, (184831 & 16) != 0 ? state.isFullScreenLoading : false, (184831 & 32) != 0 ? state.featureToggles : null, (184831 & 64) != 0 ? state.catalogSection : null, (184831 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.selectedCatalogSectionId : null, (184831 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.productDataList : null, (184831 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.productListData : null, (184831 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.deliveryCode : null, (184831 & 2048) != 0 ? state.banners : null, (184831 & 4096) != 0 ? state.selectedSort : null, (184831 & 8192) != 0 ? state.isGridType : false, (184831 & 16384) != 0 ? state.comboSetList : null, (184831 & 32768) != 0 ? state.isNeededShowComboSetShimmer : false, (184831 & 65536) != 0 ? state.expandedProductIds : ikoacuggdj.gtknphoqwx(state.getExpandedProductIds(), ((lqeggnwhkg.wflxmlrfwp) msg).iobyxmoadg()), (184831 & 131072) != 0 ? state.recommendations : null);
        }
        if (!(msg instanceof lqeggnwhkg.dxjokdxxww)) {
            if (zdlpuopuiu.eablkybsjg(msg, lqeggnwhkg.ojitshcjhn.f34704iobyxmoadg)) {
                return state.zoijcleaow((184831 & 1) != 0 ? state.payload : null, (184831 & 2) != 0 ? state.headerType : null, (184831 & 4) != 0 ? state.isSwipeToRefreshLoading : false, (184831 & 8) != 0 ? state.isProductListLoading : false, (184831 & 16) != 0 ? state.isFullScreenLoading : false, (184831 & 32) != 0 ? state.featureToggles : null, (184831 & 64) != 0 ? state.catalogSection : null, (184831 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.selectedCatalogSectionId : null, (184831 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.productDataList : null, (184831 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.productListData : null, (184831 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.deliveryCode : null, (184831 & 2048) != 0 ? state.banners : null, (184831 & 4096) != 0 ? state.selectedSort : null, (184831 & 8192) != 0 ? state.isGridType : false, (184831 & 16384) != 0 ? state.comboSetList : null, (184831 & 32768) != 0 ? state.isNeededShowComboSetShimmer : false, (184831 & 65536) != 0 ? state.expandedProductIds : null, (184831 & 131072) != 0 ? state.recommendations : ProductListRecommendationBlock.ppxfxbqfkf(state.getRecommendations(), null, null, null, true, 7, null));
            }
            throw new NoWhenBranchMatchedException();
        }
        ProductListRecommendationBlock recommendations = state.getRecommendations();
        lqeggnwhkg.dxjokdxxww dxjokdxxwwVar = (lqeggnwhkg.dxjokdxxww) msg;
        ProductRecommendationsBlock productRecommendationsBlockIobyxmoadg = dxjokdxxwwVar.iobyxmoadg();
        String title = productRecommendationsBlockIobyxmoadg != null ? productRecommendationsBlockIobyxmoadg.getTitle() : null;
        if (title == null) {
            title = "";
        }
        ProductRecommendationsBlock productRecommendationsBlockIobyxmoadg2 = dxjokdxxwwVar.iobyxmoadg();
        List products = productRecommendationsBlockIobyxmoadg2 != null ? productRecommendationsBlockIobyxmoadg2.getProducts() : null;
        return state.zoijcleaow((184831 & 1) != 0 ? state.payload : null, (184831 & 2) != 0 ? state.headerType : null, (184831 & 4) != 0 ? state.isSwipeToRefreshLoading : false, (184831 & 8) != 0 ? state.isProductListLoading : false, (184831 & 16) != 0 ? state.isFullScreenLoading : false, (184831 & 32) != 0 ? state.featureToggles : null, (184831 & 64) != 0 ? state.catalogSection : null, (184831 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.selectedCatalogSectionId : null, (184831 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.productDataList : null, (184831 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.productListData : null, (184831 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.deliveryCode : null, (184831 & 2048) != 0 ? state.banners : null, (184831 & 4096) != 0 ? state.selectedSort : null, (184831 & 8192) != 0 ? state.isGridType : false, (184831 & 16384) != 0 ? state.comboSetList : null, (184831 & 32768) != 0 ? state.isNeededShowComboSetShimmer : false, (184831 & 65536) != 0 ? state.expandedProductIds : null, (184831 & 131072) != 0 ? state.recommendations : ProductListRecommendationBlock.ppxfxbqfkf(recommendations, title, products == null ? jyumaefscl.wflxmlrfwp() : products, null, false, 4, null));
    }
}
