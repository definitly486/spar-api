package yh1;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import hg.ikoacuggdj;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.product.Product;
import ru.myspar.proloyalty.products_from_banner.impl.domain.product_set.State;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf implements a8.ppxfxbqfkf {
    private final State ppxfxbqfkf(lqeggnwhkg.wkgbmnqykc wkgbmnqykcVar, State state) {
        return state.zoijcleaow((130943 & 1) != 0 ? state.blockId : null, (130943 & 2) != 0 ? state.isLoading : false, (130943 & 4) != 0 ? state.title : null, (130943 & 8) != 0 ? state.imageBannerUrl : null, (130943 & 16) != 0 ? state.isChangeProductCountEnabled : false, (130943 & 32) != 0 ? state.products : null, (130943 & 64) != 0 ? state.productData : null, (130943 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.selectedProductsIds : wkgbmnqykcVar.zoijcleaow() ? ikoacuggdj.wflxmlrfwp(state.getSelectedProductsIds(), wkgbmnqykcVar.iobyxmoadg()) : ikoacuggdj.gtknphoqwx(state.getSelectedProductsIds(), wkgbmnqykcVar.iobyxmoadg()), (130943 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.expandedProductIds : null, (130943 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.favoriteDisabledProductIds : null, (130943 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.actualSum : null, (130943 & 2048) != 0 ? state.oldSum : null, (130943 & 4096) != 0 ? state.isPurchasesListFeatureEnabled : false, (130943 & 8192) != 0 ? state.isSharedFeatureEnabled : false, (130943 & 16384) != 0 ? state.isCatalogRatingFeatureEnabled : false, (130943 & 32768) != 0 ? state.isVivinoFeatureEnabled : false, (130943 & 65536) != 0 ? state.productSetCount : 0);
    }

    private final State wkgbmnqykc(lqeggnwhkg.gxszxtbevo gxszxtbevoVar, State state) {
        Set setEablkybsjg;
        if (gxszxtbevoVar.wkgbmnqykc()) {
            List listZoijcleaow = gxszxtbevoVar.zoijcleaow();
            setEablkybsjg = new HashSet();
            Iterator it = listZoijcleaow.iterator();
            while (it.hasNext()) {
                setEablkybsjg.add(((Product) it.next()).getId());
            }
        } else {
            setEablkybsjg = ikoacuggdj.eablkybsjg();
        }
        return state.zoijcleaow((130943 & 1) != 0 ? state.blockId : null, (130943 & 2) != 0 ? state.isLoading : false, (130943 & 4) != 0 ? state.title : gxszxtbevoVar.ppxfxbqfkf(), (130943 & 8) != 0 ? state.imageBannerUrl : gxszxtbevoVar.iobyxmoadg(), (130943 & 16) != 0 ? state.isChangeProductCountEnabled : gxszxtbevoVar.wkgbmnqykc(), (130943 & 32) != 0 ? state.products : gxszxtbevoVar.zoijcleaow(), (130943 & 64) != 0 ? state.productData : null, (130943 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.selectedProductsIds : setEablkybsjg, (130943 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.expandedProductIds : null, (130943 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.favoriteDisabledProductIds : null, (130943 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.actualSum : null, (130943 & 2048) != 0 ? state.oldSum : null, (130943 & 4096) != 0 ? state.isPurchasesListFeatureEnabled : false, (130943 & 8192) != 0 ? state.isSharedFeatureEnabled : false, (130943 & 16384) != 0 ? state.isCatalogRatingFeatureEnabled : false, (130943 & 32768) != 0 ? state.isVivinoFeatureEnabled : false, (130943 & 65536) != 0 ? state.productSetCount : 0);
    }

    private final State zoijcleaow(lqeggnwhkg.ppxfxbqfkf ppxfxbqfkfVar, State state) {
        List<Product> products = state.getProducts();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(products, 10));
        for (Product productZoijcleaow : products) {
            if (zdlpuopuiu.eablkybsjg(productZoijcleaow.getId(), ppxfxbqfkfVar.iobyxmoadg())) {
                productZoijcleaow = productZoijcleaow.zoijcleaow(((-513) & 1) != 0 ? productZoijcleaow.id : null, ((-513) & 2) != 0 ? productZoijcleaow.name : null, ((-513) & 4) != 0 ? productZoijcleaow.article : null, ((-513) & 8) != 0 ? productZoijcleaow.price : 0.0d, ((-513) & 16) != 0 ? productZoijcleaow.oldPrice : null, ((-513) & 32) != 0 ? productZoijcleaow.discount : null, ((-513) & 64) != 0 ? productZoijcleaow.isDispPer100 : false, ((-513) & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? productZoijcleaow.measureTypeModel : null, ((-513) & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? productZoijcleaow.avgWeight : null, ((-513) & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? productZoijcleaow.isFavorite : ppxfxbqfkfVar.zoijcleaow(), ((-513) & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? productZoijcleaow.isAvailable : false, ((-513) & 2048) != 0 ? productZoijcleaow.isAvailableToBuy : false, ((-513) & 4096) != 0 ? productZoijcleaow.productPropertyNames : null, ((-513) & 8192) != 0 ? productZoijcleaow.productProperties : null, ((-513) & 16384) != 0 ? productZoijcleaow.photoUrl : null, ((-513) & 32768) != 0 ? productZoijcleaow.photoUrls : null, ((-513) & 65536) != 0 ? productZoijcleaow.energy : null, ((-513) & 131072) != 0 ? productZoijcleaow.fats : null, ((-513) & 262144) != 0 ? productZoijcleaow.carbs : null, ((-513) & 524288) != 0 ? productZoijcleaow.protein : null, ((-513) & 1048576) != 0 ? productZoijcleaow.params : null, ((-513) & 2097152) != 0 ? productZoijcleaow.description : null, ((-513) & 4194304) != 0 ? productZoijcleaow.chemical : null, ((-513) & 8388608) != 0 ? productZoijcleaow.hasDiscount : false, ((-513) & 16777216) != 0 ? productZoijcleaow.hints : null, ((-513) & 33554432) != 0 ? productZoijcleaow.hidePrice : false, ((-513) & 67108864) != 0 ? productZoijcleaow.rating : null, ((-513) & 134217728) != 0 ? productZoijcleaow.reviews : 0, ((-513) & 268435456) != 0 ? productZoijcleaow.isPmProduct : false, ((-513) & 536870912) != 0 ? productZoijcleaow.video : null, ((-513) & 1073741824) != 0 ? productZoijcleaow.colorsModel : null, ((-513) & Integer.MIN_VALUE) != 0 ? productZoijcleaow.country : null, (32767 & 1) != 0 ? productZoijcleaow.region : null, (32767 & 2) != 0 ? productZoijcleaow.countryFlagEmoji : null, (32767 & 4) != 0 ? productZoijcleaow.type : null, (32767 & 8) != 0 ? productZoijcleaow.kind : null, (32767 & 16) != 0 ? productZoijcleaow.grape : null, (32767 & 32) != 0 ? productZoijcleaow.standart : null, (32767 & 64) != 0 ? productZoijcleaow.countryMapIcon : null, (32767 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? productZoijcleaow.tasting : null, (32767 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? productZoijcleaow.styling : null, (32767 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? productZoijcleaow.button : null, (32767 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? productZoijcleaow.limits : null, (32767 & 2048) != 0 ? productZoijcleaow.vivino : null, (32767 & 4096) != 0 ? productZoijcleaow.productVariants : null, (32767 & 8192) != 0 ? productZoijcleaow.quantity : 0.0d, (32767 & 16384) != 0 ? productZoijcleaow.declarations : null);
            }
            arrayList.add(productZoijcleaow);
        }
        Set favoriteDisabledProductIds = state.getFavoriteDisabledProductIds();
        return state.zoijcleaow((130943 & 1) != 0 ? state.blockId : null, (130943 & 2) != 0 ? state.isLoading : false, (130943 & 4) != 0 ? state.title : null, (130943 & 8) != 0 ? state.imageBannerUrl : null, (130943 & 16) != 0 ? state.isChangeProductCountEnabled : false, (130943 & 32) != 0 ? state.products : arrayList, (130943 & 64) != 0 ? state.productData : null, (130943 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.selectedProductsIds : null, (130943 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.expandedProductIds : null, (130943 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.favoriteDisabledProductIds : ppxfxbqfkfVar.ppxfxbqfkf() ? ikoacuggdj.gtknphoqwx(favoriteDisabledProductIds, ppxfxbqfkfVar.iobyxmoadg()) : ikoacuggdj.wflxmlrfwp(favoriteDisabledProductIds, ppxfxbqfkfVar.iobyxmoadg()), (130943 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.actualSum : null, (130943 & 2048) != 0 ? state.oldSum : null, (130943 & 4096) != 0 ? state.isPurchasesListFeatureEnabled : false, (130943 & 8192) != 0 ? state.isSharedFeatureEnabled : false, (130943 & 16384) != 0 ? state.isCatalogRatingFeatureEnabled : false, (130943 & 32768) != 0 ? state.isVivinoFeatureEnabled : false, (130943 & 65536) != 0 ? state.productSetCount : 0);
    }

    @Override // a8.ppxfxbqfkf
    /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
    public State iobyxmoadg(State state, lqeggnwhkg msg) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        zdlpuopuiu.btonecajqb(msg, "msg");
        if (msg instanceof lqeggnwhkg.iobyxmoadg) {
            return state.zoijcleaow((130943 & 1) != 0 ? state.blockId : null, (130943 & 2) != 0 ? state.isLoading : ((lqeggnwhkg.iobyxmoadg) msg).iobyxmoadg(), (130943 & 4) != 0 ? state.title : null, (130943 & 8) != 0 ? state.imageBannerUrl : null, (130943 & 16) != 0 ? state.isChangeProductCountEnabled : false, (130943 & 32) != 0 ? state.products : null, (130943 & 64) != 0 ? state.productData : null, (130943 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.selectedProductsIds : null, (130943 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.expandedProductIds : null, (130943 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.favoriteDisabledProductIds : null, (130943 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.actualSum : null, (130943 & 2048) != 0 ? state.oldSum : null, (130943 & 4096) != 0 ? state.isPurchasesListFeatureEnabled : false, (130943 & 8192) != 0 ? state.isSharedFeatureEnabled : false, (130943 & 16384) != 0 ? state.isCatalogRatingFeatureEnabled : false, (130943 & 32768) != 0 ? state.isVivinoFeatureEnabled : false, (130943 & 65536) != 0 ? state.productSetCount : 0);
        }
        if (msg instanceof lqeggnwhkg.dxjokdxxww) {
            lqeggnwhkg.dxjokdxxww dxjokdxxwwVar = (lqeggnwhkg.dxjokdxxww) msg;
            return state.zoijcleaow((130943 & 1) != 0 ? state.blockId : null, (130943 & 2) != 0 ? state.isLoading : false, (130943 & 4) != 0 ? state.title : null, (130943 & 8) != 0 ? state.imageBannerUrl : null, (130943 & 16) != 0 ? state.isChangeProductCountEnabled : false, (130943 & 32) != 0 ? state.products : null, (130943 & 64) != 0 ? state.productData : null, (130943 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.selectedProductsIds : null, (130943 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.expandedProductIds : null, (130943 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.favoriteDisabledProductIds : null, (130943 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.actualSum : null, (130943 & 2048) != 0 ? state.oldSum : null, (130943 & 4096) != 0 ? state.isPurchasesListFeatureEnabled : dxjokdxxwwVar.iobyxmoadg(), (130943 & 8192) != 0 ? state.isSharedFeatureEnabled : dxjokdxxwwVar.ppxfxbqfkf(), (130943 & 16384) != 0 ? state.isCatalogRatingFeatureEnabled : dxjokdxxwwVar.zoijcleaow(), (130943 & 32768) != 0 ? state.isVivinoFeatureEnabled : dxjokdxxwwVar.wkgbmnqykc(), (130943 & 65536) != 0 ? state.productSetCount : 0);
        }
        if (msg instanceof lqeggnwhkg.zoijcleaow) {
            return state.zoijcleaow((130943 & 1) != 0 ? state.blockId : null, (130943 & 2) != 0 ? state.isLoading : false, (130943 & 4) != 0 ? state.title : null, (130943 & 8) != 0 ? state.imageBannerUrl : null, (130943 & 16) != 0 ? state.isChangeProductCountEnabled : false, (130943 & 32) != 0 ? state.products : null, (130943 & 64) != 0 ? state.productData : ((lqeggnwhkg.zoijcleaow) msg).iobyxmoadg(), (130943 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.selectedProductsIds : null, (130943 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.expandedProductIds : null, (130943 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.favoriteDisabledProductIds : null, (130943 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.actualSum : null, (130943 & 2048) != 0 ? state.oldSum : null, (130943 & 4096) != 0 ? state.isPurchasesListFeatureEnabled : false, (130943 & 8192) != 0 ? state.isSharedFeatureEnabled : false, (130943 & 16384) != 0 ? state.isCatalogRatingFeatureEnabled : false, (130943 & 32768) != 0 ? state.isVivinoFeatureEnabled : false, (130943 & 65536) != 0 ? state.productSetCount : 0);
        }
        if (msg instanceof lqeggnwhkg.wkgbmnqykc) {
            return ppxfxbqfkf((lqeggnwhkg.wkgbmnqykc) msg, state);
        }
        if (msg instanceof lqeggnwhkg.gxszxtbevo) {
            return wkgbmnqykc((lqeggnwhkg.gxszxtbevo) msg, state);
        }
        if (zdlpuopuiu.eablkybsjg(msg, lqeggnwhkg.C3193lqeggnwhkg.f125222iobyxmoadg)) {
            List products = state.getProducts();
            HashSet hashSet = new HashSet();
            Iterator it = products.iterator();
            while (it.hasNext()) {
                hashSet.add(((Product) it.next()).getId());
            }
            return state.zoijcleaow((130943 & 1) != 0 ? state.blockId : null, (130943 & 2) != 0 ? state.isLoading : false, (130943 & 4) != 0 ? state.title : null, (130943 & 8) != 0 ? state.imageBannerUrl : null, (130943 & 16) != 0 ? state.isChangeProductCountEnabled : false, (130943 & 32) != 0 ? state.products : null, (130943 & 64) != 0 ? state.productData : null, (130943 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.selectedProductsIds : hashSet, (130943 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.expandedProductIds : null, (130943 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.favoriteDisabledProductIds : null, (130943 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.actualSum : null, (130943 & 2048) != 0 ? state.oldSum : null, (130943 & 4096) != 0 ? state.isPurchasesListFeatureEnabled : false, (130943 & 8192) != 0 ? state.isSharedFeatureEnabled : false, (130943 & 16384) != 0 ? state.isCatalogRatingFeatureEnabled : false, (130943 & 32768) != 0 ? state.isVivinoFeatureEnabled : false, (130943 & 65536) != 0 ? state.productSetCount : 0);
        }
        if (zdlpuopuiu.eablkybsjg(msg, lqeggnwhkg.nufgyqmvbu.f125223iobyxmoadg)) {
            return state.zoijcleaow((130943 & 1) != 0 ? state.blockId : null, (130943 & 2) != 0 ? state.isLoading : false, (130943 & 4) != 0 ? state.title : null, (130943 & 8) != 0 ? state.imageBannerUrl : null, (130943 & 16) != 0 ? state.isChangeProductCountEnabled : false, (130943 & 32) != 0 ? state.products : null, (130943 & 64) != 0 ? state.productData : null, (130943 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.selectedProductsIds : ikoacuggdj.eablkybsjg(), (130943 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.expandedProductIds : null, (130943 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.favoriteDisabledProductIds : null, (130943 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.actualSum : null, (130943 & 2048) != 0 ? state.oldSum : null, (130943 & 4096) != 0 ? state.isPurchasesListFeatureEnabled : false, (130943 & 8192) != 0 ? state.isSharedFeatureEnabled : false, (130943 & 16384) != 0 ? state.isCatalogRatingFeatureEnabled : false, (130943 & 32768) != 0 ? state.isVivinoFeatureEnabled : false, (130943 & 65536) != 0 ? state.productSetCount : 0);
        }
        if (msg instanceof lqeggnwhkg.ppxfxbqfkf) {
            return zoijcleaow((lqeggnwhkg.ppxfxbqfkf) msg, state);
        }
        if (msg instanceof lqeggnwhkg.eablkybsjg) {
            return state.zoijcleaow((130943 & 1) != 0 ? state.blockId : null, (130943 & 2) != 0 ? state.isLoading : false, (130943 & 4) != 0 ? state.title : null, (130943 & 8) != 0 ? state.imageBannerUrl : null, (130943 & 16) != 0 ? state.isChangeProductCountEnabled : false, (130943 & 32) != 0 ? state.products : null, (130943 & 64) != 0 ? state.productData : null, (130943 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.selectedProductsIds : null, (130943 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.expandedProductIds : null, (130943 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.favoriteDisabledProductIds : null, (130943 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.actualSum : null, (130943 & 2048) != 0 ? state.oldSum : null, (130943 & 4096) != 0 ? state.isPurchasesListFeatureEnabled : false, (130943 & 8192) != 0 ? state.isSharedFeatureEnabled : false, (130943 & 16384) != 0 ? state.isCatalogRatingFeatureEnabled : false, (130943 & 32768) != 0 ? state.isVivinoFeatureEnabled : false, (130943 & 65536) != 0 ? state.productSetCount : ((lqeggnwhkg.eablkybsjg) msg).iobyxmoadg());
        }
        throw new NoWhenBranchMatchedException();
    }
}
