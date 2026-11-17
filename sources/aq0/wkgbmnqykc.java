package aq0;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import hg.ikoacuggdj;
import hg.jyumaefscl;
import j0.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;
import ru.myspar.proloyalty.catalog.impl.search.domain.State;
import ru.myspar.proloyalty.core.domain.models.product.Product;
import ru.myspar.proloyalty.core.domain.models.product.ProductListData;
import ru.myspar.proloyalty.core.domain.models.searchquery.HistoryItemModel;

/* JADX INFO: loaded from: classes5.dex */
public final class wkgbmnqykc implements a8.ppxfxbqfkf {

    private static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Set f14344iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final Set f14345zoijcleaow;

        public iobyxmoadg(Set favorites, Set notFavorites) {
            zdlpuopuiu.btonecajqb(favorites, "favorites");
            zdlpuopuiu.btonecajqb(notFavorites, "notFavorites");
            this.f14344iobyxmoadg = favorites;
            this.f14345zoijcleaow = notFavorites;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f14344iobyxmoadg, iobyxmoadgVar.f14344iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f14345zoijcleaow, iobyxmoadgVar.f14345zoijcleaow);
        }

        public int hashCode() {
            return (this.f14344iobyxmoadg.hashCode() * 31) + this.f14345zoijcleaow.hashCode();
        }

        public final Set iobyxmoadg() {
            return this.f14344iobyxmoadg;
        }

        public String toString() {
            return "FavoriteProductId(favorites=" + this.f14344iobyxmoadg + ", notFavorites=" + this.f14345zoijcleaow + ")";
        }

        public final Set zoijcleaow() {
            return this.f14345zoijcleaow;
        }
    }

    private final iobyxmoadg zoijcleaow(List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Product product = (Product) it.next();
            boolean isFavorite = product.getIsFavorite();
            String id2 = product.getId();
            if (isFavorite) {
                linkedHashSet.add(id2);
            } else {
                linkedHashSet2.add(id2);
            }
        }
        return new iobyxmoadg(linkedHashSet, linkedHashSet2);
    }

    /* JADX WARN: Code duplicated, block: B:61:0x02e0  */
    @Override // a8.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public State iobyxmoadg(State state, nufgyqmvbu msg) {
        ProductListData productListData;
        ProductListData productListDataZoijcleaow;
        List productList;
        zdlpuopuiu.btonecajqb(state, "<this>");
        zdlpuopuiu.btonecajqb(msg, "msg");
        if (msg instanceof nufgyqmvbu.lqeggnwhkg) {
            return state.zoijcleaow((524279 & 1) != 0 ? state.payload : null, (524279 & 2) != 0 ? state.isGridType : false, (524279 & 4) != 0 ? state.sortType : null, (524279 & 8) != 0 ? state.isLoading : ((nufgyqmvbu.lqeggnwhkg) msg).iobyxmoadg(), (524279 & 16) != 0 ? state.isPageLoading : false, (524279 & 32) != 0 ? state.searchQuery : null, (524279 & 64) != 0 ? state.productListData : null, (524279 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.expandedProductIds : null, (524279 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.searchHistory : null, (524279 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.searchRecommendations : null, (524279 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.cartProductDataList : null, (524279 & 2048) != 0 ? state.favoritesProductIds : null, (524279 & 4096) != 0 ? state.currentPage : 0, (524279 & 8192) != 0 ? state.deliveryCode : null, (524279 & 16384) != 0 ? state.filterSortPanelIsVisible : false, (524279 & 32768) != 0 ? state.isRatingFeatureEnabled : false, (524279 & 65536) != 0 ? state.isPurchaseListsFeatureEnabled : false, (524279 & 131072) != 0 ? state.isVivinoFeatureEnabled : false, (524279 & 262144) != 0 ? state.isSearchSuggestionsEnabled : false);
        }
        if (msg instanceof nufgyqmvbu.C0219nufgyqmvbu) {
            return state.zoijcleaow((524279 & 1) != 0 ? state.payload : null, (524279 & 2) != 0 ? state.isGridType : false, (524279 & 4) != 0 ? state.sortType : null, (524279 & 8) != 0 ? state.isLoading : false, (524279 & 16) != 0 ? state.isPageLoading : ((nufgyqmvbu.C0219nufgyqmvbu) msg).iobyxmoadg(), (524279 & 32) != 0 ? state.searchQuery : null, (524279 & 64) != 0 ? state.productListData : null, (524279 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.expandedProductIds : null, (524279 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.searchHistory : null, (524279 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.searchRecommendations : null, (524279 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.cartProductDataList : null, (524279 & 2048) != 0 ? state.favoritesProductIds : null, (524279 & 4096) != 0 ? state.currentPage : 0, (524279 & 8192) != 0 ? state.deliveryCode : null, (524279 & 16384) != 0 ? state.filterSortPanelIsVisible : false, (524279 & 32768) != 0 ? state.isRatingFeatureEnabled : false, (524279 & 65536) != 0 ? state.isPurchaseListsFeatureEnabled : false, (524279 & 131072) != 0 ? state.isVivinoFeatureEnabled : false, (524279 & 262144) != 0 ? state.isSearchSuggestionsEnabled : false);
        }
        if (msg instanceof nufgyqmvbu.gxszxtbevo) {
            nufgyqmvbu.gxszxtbevo gxszxtbevoVar = (nufgyqmvbu.gxszxtbevo) msg;
            iobyxmoadg iobyxmoadgVarZoijcleaow = zoijcleaow(gxszxtbevoVar.zoijcleaow());
            return state.zoijcleaow((524279 & 1) != 0 ? state.payload : null, (524279 & 2) != 0 ? state.isGridType : false, (524279 & 4) != 0 ? state.sortType : null, (524279 & 8) != 0 ? state.isLoading : false, (524279 & 16) != 0 ? state.isPageLoading : false, (524279 & 32) != 0 ? state.searchQuery : null, (524279 & 64) != 0 ? state.productListData : null, (524279 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.expandedProductIds : null, (524279 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.searchHistory : gxszxtbevoVar.iobyxmoadg(), (524279 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.searchRecommendations : gxszxtbevoVar.zoijcleaow(), (524279 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.cartProductDataList : null, (524279 & 2048) != 0 ? state.favoritesProductIds : ikoacuggdj.btonecajqb(ikoacuggdj.draadjrbmk(state.getFavoritesProductIds(), iobyxmoadgVarZoijcleaow.iobyxmoadg()), iobyxmoadgVarZoijcleaow.zoijcleaow()), (524279 & 4096) != 0 ? state.currentPage : 0, (524279 & 8192) != 0 ? state.deliveryCode : null, (524279 & 16384) != 0 ? state.filterSortPanelIsVisible : false, (524279 & 32768) != 0 ? state.isRatingFeatureEnabled : false, (524279 & 65536) != 0 ? state.isPurchaseListsFeatureEnabled : false, (524279 & 131072) != 0 ? state.isVivinoFeatureEnabled : false, (524279 & 262144) != 0 ? state.isSearchSuggestionsEnabled : false);
        }
        if (msg instanceof nufgyqmvbu.eablkybsjg) {
            return state.zoijcleaow((524279 & 1) != 0 ? state.payload : null, (524279 & 2) != 0 ? state.isGridType : ((nufgyqmvbu.eablkybsjg) msg).iobyxmoadg(), (524279 & 4) != 0 ? state.sortType : null, (524279 & 8) != 0 ? state.isLoading : false, (524279 & 16) != 0 ? state.isPageLoading : false, (524279 & 32) != 0 ? state.searchQuery : null, (524279 & 64) != 0 ? state.productListData : null, (524279 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.expandedProductIds : null, (524279 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.searchHistory : null, (524279 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.searchRecommendations : null, (524279 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.cartProductDataList : null, (524279 & 2048) != 0 ? state.favoritesProductIds : null, (524279 & 4096) != 0 ? state.currentPage : 0, (524279 & 8192) != 0 ? state.deliveryCode : null, (524279 & 16384) != 0 ? state.filterSortPanelIsVisible : false, (524279 & 32768) != 0 ? state.isRatingFeatureEnabled : false, (524279 & 65536) != 0 ? state.isPurchaseListsFeatureEnabled : false, (524279 & 131072) != 0 ? state.isVivinoFeatureEnabled : false, (524279 & 262144) != 0 ? state.isSearchSuggestionsEnabled : false);
        }
        if (msg instanceof nufgyqmvbu.zoijcleaow) {
            return state.zoijcleaow((524279 & 1) != 0 ? state.payload : null, (524279 & 2) != 0 ? state.isGridType : false, (524279 & 4) != 0 ? state.sortType : null, (524279 & 8) != 0 ? state.isLoading : false, (524279 & 16) != 0 ? state.isPageLoading : false, (524279 & 32) != 0 ? state.searchQuery : null, (524279 & 64) != 0 ? state.productListData : null, (524279 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.expandedProductIds : null, (524279 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.searchHistory : null, (524279 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.searchRecommendations : null, (524279 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.cartProductDataList : ((nufgyqmvbu.zoijcleaow) msg).iobyxmoadg(), (524279 & 2048) != 0 ? state.favoritesProductIds : null, (524279 & 4096) != 0 ? state.currentPage : 0, (524279 & 8192) != 0 ? state.deliveryCode : null, (524279 & 16384) != 0 ? state.filterSortPanelIsVisible : false, (524279 & 32768) != 0 ? state.isRatingFeatureEnabled : false, (524279 & 65536) != 0 ? state.isPurchaseListsFeatureEnabled : false, (524279 & 131072) != 0 ? state.isVivinoFeatureEnabled : false, (524279 & 262144) != 0 ? state.isSearchSuggestionsEnabled : false);
        }
        if (msg instanceof nufgyqmvbu.dxjokdxxww) {
            return state.zoijcleaow((524279 & 1) != 0 ? state.payload : null, (524279 & 2) != 0 ? state.isGridType : false, (524279 & 4) != 0 ? state.sortType : null, (524279 & 8) != 0 ? state.isLoading : false, (524279 & 16) != 0 ? state.isPageLoading : false, (524279 & 32) != 0 ? state.searchQuery : ((nufgyqmvbu.dxjokdxxww) msg).iobyxmoadg(), (524279 & 64) != 0 ? state.productListData : null, (524279 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.expandedProductIds : null, (524279 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.searchHistory : null, (524279 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.searchRecommendations : null, (524279 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.cartProductDataList : null, (524279 & 2048) != 0 ? state.favoritesProductIds : null, (524279 & 4096) != 0 ? state.currentPage : 0, (524279 & 8192) != 0 ? state.deliveryCode : null, (524279 & 16384) != 0 ? state.filterSortPanelIsVisible : false, (524279 & 32768) != 0 ? state.isRatingFeatureEnabled : false, (524279 & 65536) != 0 ? state.isPurchaseListsFeatureEnabled : false, (524279 & 131072) != 0 ? state.isVivinoFeatureEnabled : false, (524279 & 262144) != 0 ? state.isSearchSuggestionsEnabled : false);
        }
        if (msg instanceof nufgyqmvbu.ppxfxbqfkf) {
            nufgyqmvbu.ppxfxbqfkf ppxfxbqfkfVar = (nufgyqmvbu.ppxfxbqfkf) msg;
            return state.zoijcleaow((524279 & 1) != 0 ? state.payload : null, (524279 & 2) != 0 ? state.isGridType : false, (524279 & 4) != 0 ? state.sortType : null, (524279 & 8) != 0 ? state.isLoading : false, (524279 & 16) != 0 ? state.isPageLoading : false, (524279 & 32) != 0 ? state.searchQuery : null, (524279 & 64) != 0 ? state.productListData : null, (524279 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.expandedProductIds : null, (524279 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.searchHistory : null, (524279 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.searchRecommendations : null, (524279 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.cartProductDataList : null, (524279 & 2048) != 0 ? state.favoritesProductIds : ppxfxbqfkfVar.zoijcleaow() ? ikoacuggdj.wflxmlrfwp(state.getFavoritesProductIds(), ppxfxbqfkfVar.iobyxmoadg()) : ikoacuggdj.gtknphoqwx(state.getFavoritesProductIds(), ppxfxbqfkfVar.iobyxmoadg()), (524279 & 4096) != 0 ? state.currentPage : 0, (524279 & 8192) != 0 ? state.deliveryCode : null, (524279 & 16384) != 0 ? state.filterSortPanelIsVisible : false, (524279 & 32768) != 0 ? state.isRatingFeatureEnabled : false, (524279 & 65536) != 0 ? state.isPurchaseListsFeatureEnabled : false, (524279 & 131072) != 0 ? state.isVivinoFeatureEnabled : false, (524279 & 262144) != 0 ? state.isSearchSuggestionsEnabled : false);
        }
        if (msg instanceof nufgyqmvbu.btonecajqb) {
            return state.zoijcleaow((524279 & 1) != 0 ? state.payload : null, (524279 & 2) != 0 ? state.isGridType : false, (524279 & 4) != 0 ? state.sortType : ((nufgyqmvbu.btonecajqb) msg).iobyxmoadg(), (524279 & 8) != 0 ? state.isLoading : false, (524279 & 16) != 0 ? state.isPageLoading : false, (524279 & 32) != 0 ? state.searchQuery : null, (524279 & 64) != 0 ? state.productListData : null, (524279 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.expandedProductIds : null, (524279 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.searchHistory : null, (524279 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.searchRecommendations : null, (524279 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.cartProductDataList : null, (524279 & 2048) != 0 ? state.favoritesProductIds : null, (524279 & 4096) != 0 ? state.currentPage : 0, (524279 & 8192) != 0 ? state.deliveryCode : null, (524279 & 16384) != 0 ? state.filterSortPanelIsVisible : false, (524279 & 32768) != 0 ? state.isRatingFeatureEnabled : false, (524279 & 65536) != 0 ? state.isPurchaseListsFeatureEnabled : false, (524279 & 131072) != 0 ? state.isVivinoFeatureEnabled : false, (524279 & 262144) != 0 ? state.isSearchSuggestionsEnabled : false);
        }
        if (msg instanceof nufgyqmvbu.wkgbmnqykc) {
            nufgyqmvbu.wkgbmnqykc wkgbmnqykcVar = (nufgyqmvbu.wkgbmnqykc) msg;
            return state.zoijcleaow((524279 & 1) != 0 ? state.payload : null, (524279 & 2) != 0 ? state.isGridType : false, (524279 & 4) != 0 ? state.sortType : null, (524279 & 8) != 0 ? state.isLoading : false, (524279 & 16) != 0 ? state.isPageLoading : false, (524279 & 32) != 0 ? state.searchQuery : null, (524279 & 64) != 0 ? state.productListData : null, (524279 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.expandedProductIds : null, (524279 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.searchHistory : null, (524279 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.searchRecommendations : null, (524279 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.cartProductDataList : null, (524279 & 2048) != 0 ? state.favoritesProductIds : null, (524279 & 4096) != 0 ? state.currentPage : 0, (524279 & 8192) != 0 ? state.deliveryCode : null, (524279 & 16384) != 0 ? state.filterSortPanelIsVisible : false, (524279 & 32768) != 0 ? state.isRatingFeatureEnabled : wkgbmnqykcVar.zoijcleaow(), (524279 & 65536) != 0 ? state.isPurchaseListsFeatureEnabled : wkgbmnqykcVar.iobyxmoadg(), (524279 & 131072) != 0 ? state.isVivinoFeatureEnabled : wkgbmnqykcVar.wkgbmnqykc(), (524279 & 262144) != 0 ? state.isSearchSuggestionsEnabled : wkgbmnqykcVar.ppxfxbqfkf());
        }
        if (msg instanceof nufgyqmvbu.iobyxmoadg) {
            return state.zoijcleaow((524279 & 1) != 0 ? state.payload : null, (524279 & 2) != 0 ? state.isGridType : false, (524279 & 4) != 0 ? state.sortType : null, (524279 & 8) != 0 ? state.isLoading : false, (524279 & 16) != 0 ? state.isPageLoading : false, (524279 & 32) != 0 ? state.searchQuery : null, (524279 & 64) != 0 ? state.productListData : null, (524279 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.expandedProductIds : ikoacuggdj.wflxmlrfwp(state.getExpandedProductIds(), ((nufgyqmvbu.iobyxmoadg) msg).iobyxmoadg()), (524279 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.searchHistory : null, (524279 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.searchRecommendations : null, (524279 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.cartProductDataList : null, (524279 & 2048) != 0 ? state.favoritesProductIds : null, (524279 & 4096) != 0 ? state.currentPage : 0, (524279 & 8192) != 0 ? state.deliveryCode : null, (524279 & 16384) != 0 ? state.filterSortPanelIsVisible : false, (524279 & 32768) != 0 ? state.isRatingFeatureEnabled : false, (524279 & 65536) != 0 ? state.isPurchaseListsFeatureEnabled : false, (524279 & 131072) != 0 ? state.isVivinoFeatureEnabled : false, (524279 & 262144) != 0 ? state.isSearchSuggestionsEnabled : false);
        }
        if (msg instanceof nufgyqmvbu.rgvfuqvkyq) {
            return state.zoijcleaow((524279 & 1) != 0 ? state.payload : null, (524279 & 2) != 0 ? state.isGridType : false, (524279 & 4) != 0 ? state.sortType : null, (524279 & 8) != 0 ? state.isLoading : false, (524279 & 16) != 0 ? state.isPageLoading : false, (524279 & 32) != 0 ? state.searchQuery : null, (524279 & 64) != 0 ? state.productListData : null, (524279 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.expandedProductIds : ikoacuggdj.gtknphoqwx(state.getExpandedProductIds(), ((nufgyqmvbu.rgvfuqvkyq) msg).iobyxmoadg()), (524279 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.searchHistory : null, (524279 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.searchRecommendations : null, (524279 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.cartProductDataList : null, (524279 & 2048) != 0 ? state.favoritesProductIds : null, (524279 & 4096) != 0 ? state.currentPage : 0, (524279 & 8192) != 0 ? state.deliveryCode : null, (524279 & 16384) != 0 ? state.filterSortPanelIsVisible : false, (524279 & 32768) != 0 ? state.isRatingFeatureEnabled : false, (524279 & 65536) != 0 ? state.isPurchaseListsFeatureEnabled : false, (524279 & 131072) != 0 ? state.isVivinoFeatureEnabled : false, (524279 & 262144) != 0 ? state.isSearchSuggestionsEnabled : false);
        }
        if (!(msg instanceof nufgyqmvbu.ojitshcjhn)) {
            if (msg instanceof nufgyqmvbu.draadjrbmk) {
                return state.zoijcleaow((524279 & 1) != 0 ? state.payload : null, (524279 & 2) != 0 ? state.isGridType : false, (524279 & 4) != 0 ? state.sortType : null, (524279 & 8) != 0 ? state.isLoading : false, (524279 & 16) != 0 ? state.isPageLoading : false, (524279 & 32) != 0 ? state.searchQuery : null, (524279 & 64) != 0 ? state.productListData : null, (524279 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.expandedProductIds : null, (524279 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.searchHistory : jyumaefscl.wflxmlrfwp(), (524279 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.searchRecommendations : null, (524279 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.cartProductDataList : null, (524279 & 2048) != 0 ? state.favoritesProductIds : null, (524279 & 4096) != 0 ? state.currentPage : 0, (524279 & 8192) != 0 ? state.deliveryCode : null, (524279 & 16384) != 0 ? state.filterSortPanelIsVisible : false, (524279 & 32768) != 0 ? state.isRatingFeatureEnabled : false, (524279 & 65536) != 0 ? state.isPurchaseListsFeatureEnabled : false, (524279 & 131072) != 0 ? state.isVivinoFeatureEnabled : false, (524279 & 262144) != 0 ? state.isSearchSuggestionsEnabled : false);
            }
            if (!(msg instanceof nufgyqmvbu.agtfadlqog)) {
                if (msg instanceof nufgyqmvbu.wflxmlrfwp) {
                    return state.zoijcleaow((524279 & 1) != 0 ? state.payload : null, (524279 & 2) != 0 ? state.isGridType : false, (524279 & 4) != 0 ? state.sortType : null, (524279 & 8) != 0 ? state.isLoading : false, (524279 & 16) != 0 ? state.isPageLoading : false, (524279 & 32) != 0 ? state.searchQuery : new tzroggbefp((String) null, 0L, (l) null, 7, (gtknphoqwx) null), (524279 & 64) != 0 ? state.productListData : null, (524279 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.expandedProductIds : null, (524279 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.searchHistory : null, (524279 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.searchRecommendations : null, (524279 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.cartProductDataList : null, (524279 & 2048) != 0 ? state.favoritesProductIds : ikoacuggdj.eablkybsjg(), (524279 & 4096) != 0 ? state.currentPage : 1, (524279 & 8192) != 0 ? state.deliveryCode : null, (524279 & 16384) != 0 ? state.filterSortPanelIsVisible : false, (524279 & 32768) != 0 ? state.isRatingFeatureEnabled : false, (524279 & 65536) != 0 ? state.isPurchaseListsFeatureEnabled : false, (524279 & 131072) != 0 ? state.isVivinoFeatureEnabled : false, (524279 & 262144) != 0 ? state.isSearchSuggestionsEnabled : false);
                }
                if (msg instanceof nufgyqmvbu.gtknphoqwx) {
                    return state.zoijcleaow((524279 & 1) != 0 ? state.payload : null, (524279 & 2) != 0 ? state.isGridType : false, (524279 & 4) != 0 ? state.sortType : null, (524279 & 8) != 0 ? state.isLoading : false, (524279 & 16) != 0 ? state.isPageLoading : false, (524279 & 32) != 0 ? state.searchQuery : null, (524279 & 64) != 0 ? state.productListData : null, (524279 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.expandedProductIds : null, (524279 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.searchHistory : null, (524279 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.searchRecommendations : null, (524279 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.cartProductDataList : null, (524279 & 2048) != 0 ? state.favoritesProductIds : null, (524279 & 4096) != 0 ? state.currentPage : 1, (524279 & 8192) != 0 ? state.deliveryCode : null, (524279 & 16384) != 0 ? state.filterSortPanelIsVisible : false, (524279 & 32768) != 0 ? state.isRatingFeatureEnabled : false, (524279 & 65536) != 0 ? state.isPurchaseListsFeatureEnabled : false, (524279 & 131072) != 0 ? state.isVivinoFeatureEnabled : false, (524279 & 262144) != 0 ? state.isSearchSuggestionsEnabled : false);
                }
                throw new NoWhenBranchMatchedException();
            }
            List searchHistory = state.getSearchHistory();
            ArrayList arrayList = new ArrayList();
            for (Object obj : searchHistory) {
                if (!zdlpuopuiu.eablkybsjg(((HistoryItemModel) obj).getQuery(), ((nufgyqmvbu.agtfadlqog) msg).iobyxmoadg())) {
                    arrayList.add(obj);
                }
            }
            return state.zoijcleaow((524279 & 1) != 0 ? state.payload : null, (524279 & 2) != 0 ? state.isGridType : false, (524279 & 4) != 0 ? state.sortType : null, (524279 & 8) != 0 ? state.isLoading : false, (524279 & 16) != 0 ? state.isPageLoading : false, (524279 & 32) != 0 ? state.searchQuery : null, (524279 & 64) != 0 ? state.productListData : null, (524279 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.expandedProductIds : null, (524279 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.searchHistory : arrayList, (524279 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.searchRecommendations : null, (524279 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.cartProductDataList : null, (524279 & 2048) != 0 ? state.favoritesProductIds : null, (524279 & 4096) != 0 ? state.currentPage : 0, (524279 & 8192) != 0 ? state.deliveryCode : null, (524279 & 16384) != 0 ? state.filterSortPanelIsVisible : false, (524279 & 32768) != 0 ? state.isRatingFeatureEnabled : false, (524279 & 65536) != 0 ? state.isPurchaseListsFeatureEnabled : false, (524279 & 131072) != 0 ? state.isVivinoFeatureEnabled : false, (524279 & 262144) != 0 ? state.isSearchSuggestionsEnabled : false);
        }
        nufgyqmvbu.ojitshcjhn ojitshcjhnVar = (nufgyqmvbu.ojitshcjhn) msg;
        if (ojitshcjhnVar.iobyxmoadg() != 1) {
            ProductListData productListData2 = state.getProductListData();
            List productList2 = productListData2 != null ? productListData2.getProductList() : null;
            if (productList2 == null) {
                productList2 = jyumaefscl.wflxmlrfwp();
            }
            List productList3 = ojitshcjhnVar.wkgbmnqykc().getProductList();
            if (productList3 == null) {
                productList3 = jyumaefscl.wflxmlrfwp();
            }
            List listIxidwrxhsl = jyumaefscl.ixidwrxhsl(productList2, productList3);
            ProductListData productListData3 = state.getProductListData();
            if (productListData3 != null) {
                productListDataZoijcleaow = productListData3.zoijcleaow((262139 & 1) != 0 ? productListData3.searchSuggestions : null, (262139 & 2) != 0 ? productListData3.searchCategories : null, (262139 & 4) != 0 ? productListData3.productList : listIxidwrxhsl, (262139 & 8) != 0 ? productListData3.paging : null, (262139 & 16) != 0 ? productListData3.filterSections : null, (262139 & 32) != 0 ? productListData3.titleImage : null, (262139 & 64) != 0 ? productListData3.selectionsData : null, (262139 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? productListData3.textModal : null, (262139 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? productListData3.headerModal : null, (262139 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? productListData3.buttonModal : null, (262139 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? productListData3.textBefore : null, (262139 & 2048) != 0 ? productListData3.isAgeCheckNeeded : false, (262139 & 4096) != 0 ? productListData3.section : null, (262139 & 8192) != 0 ? productListData3.colorsModel : null, (262139 & 16384) != 0 ? productListData3.promo : null, (262139 & 32768) != 0 ? productListData3.features : null, (262139 & 65536) != 0 ? productListData3.additionalBlocks : null, (262139 & 131072) != 0 ? productListData3.promoBanner : null);
            } else {
                productListData = null;
            }
            productList = ojitshcjhnVar.wkgbmnqykc().getProductList();
            if (productList == null) {
                productList = jyumaefscl.wflxmlrfwp();
            }
            iobyxmoadg iobyxmoadgVarZoijcleaow2 = zoijcleaow(productList);
            return state.zoijcleaow((524279 & 1) != 0 ? state.payload : null, (524279 & 2) != 0 ? state.isGridType : false, (524279 & 4) != 0 ? state.sortType : null, (524279 & 8) != 0 ? state.isLoading : false, (524279 & 16) != 0 ? state.isPageLoading : false, (524279 & 32) != 0 ? state.searchQuery : null, (524279 & 64) != 0 ? state.productListData : productListData, (524279 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.expandedProductIds : null, (524279 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.searchHistory : null, (524279 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.searchRecommendations : null, (524279 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.cartProductDataList : null, (524279 & 2048) != 0 ? state.favoritesProductIds : ikoacuggdj.btonecajqb(ikoacuggdj.draadjrbmk(state.getFavoritesProductIds(), iobyxmoadgVarZoijcleaow2.iobyxmoadg()), iobyxmoadgVarZoijcleaow2.zoijcleaow()), (524279 & 4096) != 0 ? state.currentPage : ojitshcjhnVar.iobyxmoadg(), (524279 & 8192) != 0 ? state.deliveryCode : ojitshcjhnVar.zoijcleaow(), (524279 & 16384) != 0 ? state.filterSortPanelIsVisible : ojitshcjhnVar.ppxfxbqfkf(), (524279 & 32768) != 0 ? state.isRatingFeatureEnabled : false, (524279 & 65536) != 0 ? state.isPurchaseListsFeatureEnabled : false, (524279 & 131072) != 0 ? state.isVivinoFeatureEnabled : false, (524279 & 262144) != 0 ? state.isSearchSuggestionsEnabled : false);
        }
        productListDataZoijcleaow = ojitshcjhnVar.wkgbmnqykc();
        productListData = productListDataZoijcleaow;
        productList = ojitshcjhnVar.wkgbmnqykc().getProductList();
        if (productList == null) {
            productList = jyumaefscl.wflxmlrfwp();
        }
        iobyxmoadg iobyxmoadgVarZoijcleaow3 = zoijcleaow(productList);
        return state.zoijcleaow((524279 & 1) != 0 ? state.payload : null, (524279 & 2) != 0 ? state.isGridType : false, (524279 & 4) != 0 ? state.sortType : null, (524279 & 8) != 0 ? state.isLoading : false, (524279 & 16) != 0 ? state.isPageLoading : false, (524279 & 32) != 0 ? state.searchQuery : null, (524279 & 64) != 0 ? state.productListData : productListData, (524279 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.expandedProductIds : null, (524279 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.searchHistory : null, (524279 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.searchRecommendations : null, (524279 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.cartProductDataList : null, (524279 & 2048) != 0 ? state.favoritesProductIds : ikoacuggdj.btonecajqb(ikoacuggdj.draadjrbmk(state.getFavoritesProductIds(), iobyxmoadgVarZoijcleaow3.iobyxmoadg()), iobyxmoadgVarZoijcleaow3.zoijcleaow()), (524279 & 4096) != 0 ? state.currentPage : ojitshcjhnVar.iobyxmoadg(), (524279 & 8192) != 0 ? state.deliveryCode : ojitshcjhnVar.zoijcleaow(), (524279 & 16384) != 0 ? state.filterSortPanelIsVisible : ojitshcjhnVar.ppxfxbqfkf(), (524279 & 32768) != 0 ? state.isRatingFeatureEnabled : false, (524279 & 65536) != 0 ? state.isPurchaseListsFeatureEnabled : false, (524279 & 131072) != 0 ? state.isVivinoFeatureEnabled : false, (524279 & 262144) != 0 ? state.isSearchSuggestionsEnabled : false);
    }
}
