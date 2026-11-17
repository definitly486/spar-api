package xp0;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.vdvldrhtss;
import kotlin.jvm.internal.zdlpuopuiu;
import n91.ppxfxbqfkf;
import q11.dxjokdxxww;
import ru.myspar.proloyalty.catalog.impl.product_list.domain.State;
import ru.myspar.proloyalty.catalog.impl.product_list.domain.model.ProductListRecommendationBlock;
import ru.myspar.proloyalty.common.view.counter.model.CounterModel;
import ru.myspar.proloyalty.common.view.product.model.product.ProductUiModel;
import ru.myspar.proloyalty.core.domain.models.ColorsUiModel;
import ru.myspar.proloyalty.core.domain.models.catalog.CatalogWithSubCatalogs;
import ru.myspar.proloyalty.core.domain.models.product.Product;
import ru.myspar.proloyalty.core.domain.models.product.ProductListData;
import ru.myspar.proloyalty.core.domain.models.product.ProductsPromoBanner;
import ru.myspar.proloyalty.core.domain.models.product.PromoProduct;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;
import zg.gtknphoqwx;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg implements draadjrbmk {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final q41.iobyxmoadg f122990iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final ppxfxbqfkf f122991jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final o91.zoijcleaow f122992yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final n91.iobyxmoadg f122993zdlpuopuiu;

    /* JADX INFO: renamed from: xp0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public /* synthetic */ class C3104iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f122994iobyxmoadg;

        static {
            int[] iArr = new int[a01.ppxfxbqfkf.values().length];
            try {
                iArr[a01.ppxfxbqfkf.COMBO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a01.ppxfxbqfkf.RECOMMENDATIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a01.ppxfxbqfkf.PROMO_BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a01.ppxfxbqfkf.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f122994iobyxmoadg = iArr;
        }
    }

    /* synthetic */ class zoijcleaow extends vdvldrhtss implements rgvfuqvkyq {
        zoijcleaow(Object obj) {
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

    public iobyxmoadg(n91.iobyxmoadg colorsUiModelMapper, o91.zoijcleaow productToUiModelMapper, ppxfxbqfkf comboSetUiMapper, q41.iobyxmoadg resourcesManager) {
        zdlpuopuiu.btonecajqb(colorsUiModelMapper, "colorsUiModelMapper");
        zdlpuopuiu.btonecajqb(productToUiModelMapper, "productToUiModelMapper");
        zdlpuopuiu.btonecajqb(comboSetUiMapper, "comboSetUiMapper");
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        this.f122993zdlpuopuiu = colorsUiModelMapper;
        this.f122992yggfygwlhe = productToUiModelMapper;
        this.f122991jyumaefscl = comboSetUiMapper;
        this.f122990iwizpuwonk = resourcesManager;
    }

    private final int agtfadlqog(int i13) {
        return (i13 + 1) * 2;
    }

    private final nt0.ppxfxbqfkf btonecajqb(State state) {
        PromoProduct promo;
        Product product;
        ProductUiModel productUiModelZdlpuopuiu;
        ProductListData productListData = state.getProductListData();
        if (productListData == null || (promo = productListData.getPromo()) == null || (product = promo.getProduct()) == null || (productUiModelZdlpuopuiu = zdlpuopuiu(product, state)) == null) {
            return null;
        }
        PromoProduct promo2 = state.getProductListData().getPromo();
        return new nt0.ppxfxbqfkf(productUiModelZdlpuopuiu, promo2 != null ? promo2.getBackgroundColor() : null);
    }

    private final kt0.ppxfxbqfkf eablkybsjg(List list, boolean z13) {
        boolean zIsEmpty = list.isEmpty();
        boolean z14 = list.size() == 1;
        if (zIsEmpty && z13) {
            return kt0.ppxfxbqfkf.wkgbmnqykc.f60554yggfygwlhe;
        }
        if (zIsEmpty) {
            return null;
        }
        return z14 ? new kt0.ppxfxbqfkf.C1213ppxfxbqfkf((kt0.iobyxmoadg) jyumaefscl.opjhrmiecq(gxszxtbevo(this, list))) : new kt0.ppxfxbqfkf.zoijcleaow(gxszxtbevo(this, list));
    }

    private static final List gxszxtbevo(iobyxmoadg iobyxmoadgVar, List list) {
        return iobyxmoadgVar.f122991jyumaefscl.invoke(list);
    }

    private final Boolean iobyxmoadg(List list, jt0.zoijcleaow zoijcleaowVar) {
        if (zoijcleaowVar != null) {
            return Boolean.valueOf(list.add(zoijcleaowVar));
        }
        return null;
    }

    private final nt0.iobyxmoadg kcexrzcfyt(ProductsPromoBanner productsPromoBanner) {
        return new nt0.iobyxmoadg(productsPromoBanner.getId(), productsPromoBanner.getImageUrl(), productsPromoBanner.getAdv());
    }

    private final ot0.iobyxmoadg lqeggnwhkg(State state, ColorsUiModel colorsUiModel) {
        ProductListRecommendationBlock recommendations = state.getRecommendations();
        ColorsUiModel.Hex hex = colorsUiModel instanceof ColorsUiModel.Hex ? (ColorsUiModel.Hex) colorsUiModel : null;
        if (!recommendations.getProducts().isEmpty()) {
            return new ot0.iobyxmoadg.C1620iobyxmoadg(recommendations.getTitle(), recommendations.getTitle(), wflxmlrfwp(recommendations.getProducts(), state, hex), hex);
        }
        if (recommendations.getIsNeededShowShimmer()) {
            return new ot0.iobyxmoadg.zoijcleaow(hex);
        }
        return null;
    }

    private final List ojitshcjhn(List list, int i13) {
        List listPpxfxbqfkf = jyumaefscl.ppxfxbqfkf();
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList(i13);
            int i14 = 0;
            for (int i15 = 0; i15 < i13; i15++) {
                arrayList.add(Integer.valueOf(agtfadlqog(i15)));
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                int iBtonecajqb = gtknphoqwx.btonecajqb(((Number) it.next()).intValue(), list.size());
                listPpxfxbqfkf.add(list.subList(i14, iBtonecajqb));
                i14 = iBtonecajqb;
            }
            if (i14 < list.size()) {
                listPpxfxbqfkf.add(list.subList(i14, list.size()));
            }
        }
        return jyumaefscl.iobyxmoadg(listPpxfxbqfkf);
    }

    private final List oxmwwwfdhm(List list, State state) {
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(zdlpuopuiu((Product) it.next(), state));
        }
        return arrayList;
    }

    private final ProductUiModel ppxfxbqfkf(ProductUiModel productUiModel) {
        CounterModel counterModel = productUiModel.getCounterModel();
        return productUiModel.lqeggnwhkg(((-1025) & 1) != 0 ? productUiModel.id : null, ((-1025) & 2) != 0 ? productUiModel.name : null, ((-1025) & 4) != 0 ? productUiModel.article : null, ((-1025) & 8) != 0 ? productUiModel.isProductWithZeroPrice : false, ((-1025) & 16) != 0 ? productUiModel.price : 0.0d, ((-1025) & 32) != 0 ? productUiModel.oldPrice : null, ((-1025) & 64) != 0 ? productUiModel.discount : null, ((-1025) & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? productUiModel.discountString : null, ((-1025) & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? productUiModel.hasDiscount : false, ((-1025) & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? productUiModel.isDispPer100 : false, ((-1025) & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? productUiModel.measureTypeModel : null, ((-1025) & 2048) != 0 ? productUiModel.avgWeight : null, ((-1025) & 4096) != 0 ? productUiModel.isFavorite : false, ((-1025) & 8192) != 0 ? productUiModel.favoriteEnabledState : false, ((-1025) & 16384) != 0 ? productUiModel.inCart : false, ((-1025) & 32768) != 0 ? productUiModel.photoUrl : null, ((-1025) & 65536) != 0 ? productUiModel.photoUrls : null, ((-1025) & 131072) != 0 ? productUiModel.isMultiPhotos : false, ((-1025) & 262144) != 0 ? productUiModel.fats : null, ((-1025) & 524288) != 0 ? productUiModel.carbs : null, ((-1025) & 1048576) != 0 ? productUiModel.protein : null, ((-1025) & 2097152) != 0 ? productUiModel.energy : null, ((-1025) & 4194304) != 0 ? productUiModel.params : null, ((-1025) & 8388608) != 0 ? productUiModel.description : null, ((-1025) & 16777216) != 0 ? productUiModel.chemical : null, ((-1025) & 33554432) != 0 ? productUiModel.buyState : null, ((-1025) & 67108864) != 0 ? productUiModel.stickers : null, ((-1025) & 134217728) != 0 ? productUiModel.hidePrice : false, ((-1025) & 268435456) != 0 ? productUiModel.rating : null, ((-1025) & 536870912) != 0 ? productUiModel.reviewsCount : 0, ((-1025) & 1073741824) != 0 ? productUiModel.basketQuantity : null, ((-1025) & Integer.MIN_VALUE) != 0 ? productUiModel.isPmProduct : false, (16777215 & 1) != 0 ? productUiModel.video : null, (16777215 & 2) != 0 ? productUiModel.isRatingFeatureEnabled : false, (16777215 & 4) != 0 ? productUiModel.isPurchaseListsFeatureEnabled : false, (16777215 & 8) != 0 ? productUiModel.country : null, (16777215 & 16) != 0 ? productUiModel.region : null, (16777215 & 32) != 0 ? productUiModel.countryFlagEmoji : null, (16777215 & 64) != 0 ? productUiModel.type : null, (16777215 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? productUiModel.kind : null, (16777215 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? productUiModel.grape : null, (16777215 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? productUiModel.standart : null, (16777215 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? productUiModel.countryMapIcon : null, (16777215 & 2048) != 0 ? productUiModel.tasting : null, (16777215 & 4096) != 0 ? productUiModel.styling : null, (16777215 & 8192) != 0 ? productUiModel.button : null, (16777215 & 16384) != 0 ? productUiModel.hints : null, (16777215 & 32768) != 0 ? productUiModel.colorsUiModel : null, (16777215 & 65536) != 0 ? productUiModel.counterModel : counterModel.zoijcleaow((14714 & 1) != 0 ? counterModel.isLoading : false, (14714 & 2) != 0 ? counterModel.isAvailableToBuy : false, (14714 & 4) != 0 ? counterModel.isExpand : true, (14714 & 8) != 0 ? counterModel.priceModel : null, (14714 & 16) != 0 ? counterModel.oldPriceModel : null, (14714 & 32) != 0 ? counterModel.avgWeight : null, (14714 & 64) != 0 ? counterModel.isDispPer100 : false, (14714 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? counterModel.quantity : 0.0d, (14714 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? counterModel.isMeasureTypeSwitchable : false, (14714 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? counterModel.measureType : null, (14714 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? counterModel.productLimitText : null, (14714 & 2048) != 0 ? counterModel.message : productUiModel.getAvailabilityModel().gxszxtbevo(), (14714 & 4096) != 0 ? counterModel.autoHideMessage : !productUiModel.getAvailabilityModel().getIsAvailableToBuy(), (14714 & 8192) != 0 ? counterModel.colorsModel : null), (16777215 & 131072) != 0 ? productUiModel.deliveryCode : null, (16777215 & 262144) != 0 ? productUiModel.vivino : null, (16777215 & 524288) != 0 ? productUiModel.limits : null, (16777215 & 1048576) != 0 ? productUiModel.availabilityModel : null, (16777215 & 2097152) != 0 ? productUiModel.productVariants : null, (16777215 & 4194304) != 0 ? productUiModel.isSelected : null, (16777215 & 8388608) != 0 ? productUiModel.adv : null);
    }

    private final List wflxmlrfwp(List list, State state, ColorsUiModel.Hex hex) {
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ProductUiModel productUiModelZdlpuopuiu = zdlpuopuiu((Product) it.next(), state);
            CounterModel counterModel = productUiModelZdlpuopuiu.getCounterModel();
            arrayList.add(productUiModelZdlpuopuiu.lqeggnwhkg(((-1025) & 1) != 0 ? productUiModelZdlpuopuiu.id : null, ((-1025) & 2) != 0 ? productUiModelZdlpuopuiu.name : null, ((-1025) & 4) != 0 ? productUiModelZdlpuopuiu.article : null, ((-1025) & 8) != 0 ? productUiModelZdlpuopuiu.isProductWithZeroPrice : false, ((-1025) & 16) != 0 ? productUiModelZdlpuopuiu.price : 0.0d, ((-1025) & 32) != 0 ? productUiModelZdlpuopuiu.oldPrice : null, ((-1025) & 64) != 0 ? productUiModelZdlpuopuiu.discount : null, ((-1025) & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? productUiModelZdlpuopuiu.discountString : null, ((-1025) & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? productUiModelZdlpuopuiu.hasDiscount : false, ((-1025) & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? productUiModelZdlpuopuiu.isDispPer100 : false, ((-1025) & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? productUiModelZdlpuopuiu.measureTypeModel : null, ((-1025) & 2048) != 0 ? productUiModelZdlpuopuiu.avgWeight : null, ((-1025) & 4096) != 0 ? productUiModelZdlpuopuiu.isFavorite : false, ((-1025) & 8192) != 0 ? productUiModelZdlpuopuiu.favoriteEnabledState : false, ((-1025) & 16384) != 0 ? productUiModelZdlpuopuiu.inCart : false, ((-1025) & 32768) != 0 ? productUiModelZdlpuopuiu.photoUrl : null, ((-1025) & 65536) != 0 ? productUiModelZdlpuopuiu.photoUrls : null, ((-1025) & 131072) != 0 ? productUiModelZdlpuopuiu.isMultiPhotos : false, ((-1025) & 262144) != 0 ? productUiModelZdlpuopuiu.fats : null, ((-1025) & 524288) != 0 ? productUiModelZdlpuopuiu.carbs : null, ((-1025) & 1048576) != 0 ? productUiModelZdlpuopuiu.protein : null, ((-1025) & 2097152) != 0 ? productUiModelZdlpuopuiu.energy : null, ((-1025) & 4194304) != 0 ? productUiModelZdlpuopuiu.params : null, ((-1025) & 8388608) != 0 ? productUiModelZdlpuopuiu.description : null, ((-1025) & 16777216) != 0 ? productUiModelZdlpuopuiu.chemical : null, ((-1025) & 33554432) != 0 ? productUiModelZdlpuopuiu.buyState : null, ((-1025) & 67108864) != 0 ? productUiModelZdlpuopuiu.stickers : null, ((-1025) & 134217728) != 0 ? productUiModelZdlpuopuiu.hidePrice : false, ((-1025) & 268435456) != 0 ? productUiModelZdlpuopuiu.rating : null, ((-1025) & 536870912) != 0 ? productUiModelZdlpuopuiu.reviewsCount : 0, ((-1025) & 1073741824) != 0 ? productUiModelZdlpuopuiu.basketQuantity : null, ((-1025) & Integer.MIN_VALUE) != 0 ? productUiModelZdlpuopuiu.isPmProduct : false, (16777215 & 1) != 0 ? productUiModelZdlpuopuiu.video : null, (16777215 & 2) != 0 ? productUiModelZdlpuopuiu.isRatingFeatureEnabled : false, (16777215 & 4) != 0 ? productUiModelZdlpuopuiu.isPurchaseListsFeatureEnabled : false, (16777215 & 8) != 0 ? productUiModelZdlpuopuiu.country : null, (16777215 & 16) != 0 ? productUiModelZdlpuopuiu.region : null, (16777215 & 32) != 0 ? productUiModelZdlpuopuiu.countryFlagEmoji : null, (16777215 & 64) != 0 ? productUiModelZdlpuopuiu.type : null, (16777215 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? productUiModelZdlpuopuiu.kind : null, (16777215 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? productUiModelZdlpuopuiu.grape : null, (16777215 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? productUiModelZdlpuopuiu.standart : null, (16777215 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? productUiModelZdlpuopuiu.countryMapIcon : null, (16777215 & 2048) != 0 ? productUiModelZdlpuopuiu.tasting : null, (16777215 & 4096) != 0 ? productUiModelZdlpuopuiu.styling : null, (16777215 & 8192) != 0 ? productUiModelZdlpuopuiu.button : null, (16777215 & 16384) != 0 ? productUiModelZdlpuopuiu.hints : null, (16777215 & 32768) != 0 ? productUiModelZdlpuopuiu.colorsUiModel : hex, (16777215 & 65536) != 0 ? productUiModelZdlpuopuiu.counterModel : counterModel.zoijcleaow((14714 & 1) != 0 ? counterModel.isLoading : false, (14714 & 2) != 0 ? counterModel.isAvailableToBuy : false, (14714 & 4) != 0 ? counterModel.isExpand : false, (14714 & 8) != 0 ? counterModel.priceModel : null, (14714 & 16) != 0 ? counterModel.oldPriceModel : null, (14714 & 32) != 0 ? counterModel.avgWeight : null, (14714 & 64) != 0 ? counterModel.isDispPer100 : false, (14714 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? counterModel.quantity : 0.0d, (14714 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? counterModel.isMeasureTypeSwitchable : false, (14714 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? counterModel.measureType : null, (14714 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? counterModel.productLimitText : null, (14714 & 2048) != 0 ? counterModel.message : null, (14714 & 4096) != 0 ? counterModel.autoHideMessage : false, (14714 & 8192) != 0 ? counterModel.colorsModel : hex), (16777215 & 131072) != 0 ? productUiModelZdlpuopuiu.deliveryCode : null, (16777215 & 262144) != 0 ? productUiModelZdlpuopuiu.vivino : null, (16777215 & 524288) != 0 ? productUiModelZdlpuopuiu.limits : null, (16777215 & 1048576) != 0 ? productUiModelZdlpuopuiu.availabilityModel : null, (16777215 & 2097152) != 0 ? productUiModelZdlpuopuiu.productVariants : null, (16777215 & 4194304) != 0 ? productUiModelZdlpuopuiu.isSelected : null, (16777215 & 8388608) != 0 ? productUiModelZdlpuopuiu.adv : null));
        }
        return arrayList;
    }

    private final ProductUiModel zdlpuopuiu(Product product, State state) {
        ProductUiModel productUiModelPpxfxbqfkf;
        PromoProduct promo;
        o91.zoijcleaow zoijcleaowVar = this.f122992yggfygwlhe;
        List productDataList = state.getProductDataList();
        DeliveryCode deliveryCode = state.getDeliveryCode();
        boolean isRatingEnabled = state.getFeatureToggles().getIsRatingEnabled();
        boolean isPurchasesListEnabled = state.getFeatureToggles().getIsPurchasesListEnabled();
        boolean isVivinoEnabled = state.getFeatureToggles().getIsVivinoEnabled();
        zoijcleaow zoijcleaowVar2 = new zoijcleaow(this.f122990iwizpuwonk);
        ProductListData productListData = state.getProductListData();
        ProductUiModel productUiModelPpxfxbqfkf2 = zoijcleaowVar.ppxfxbqfkf(product, productDataList, deliveryCode, isRatingEnabled, isPurchasesListEnabled, isVivinoEnabled, (productListData == null || (promo = productListData.getPromo()) == null) ? null : promo.getAdv(), zoijcleaowVar2);
        ProductUiModel productUiModel = state.getExpandedProductIds().contains(productUiModelPpxfxbqfkf2.getId()) ? productUiModelPpxfxbqfkf2 : null;
        return (productUiModel == null || (productUiModelPpxfxbqfkf = ppxfxbqfkf(productUiModel)) == null) ? productUiModelPpxfxbqfkf2 : productUiModelPpxfxbqfkf;
    }

    private final List zoijcleaow(State state, List list, ColorsUiModel colorsUiModel) {
        nt0.iobyxmoadg iobyxmoadgVar;
        List listPpxfxbqfkf = jyumaefscl.ppxfxbqfkf();
        if (!list.isEmpty()) {
            iobyxmoadg(listPpxfxbqfkf, btonecajqb(state));
            ProductListData productListData = state.getProductListData();
            List additionalBlocks = productListData != null ? productListData.getAdditionalBlocks() : null;
            if (additionalBlocks == null || additionalBlocks.isEmpty()) {
                listPpxfxbqfkf.addAll(list);
            } else {
                List listOjitshcjhn = ojitshcjhn(list, additionalBlocks.size());
                ot0.iobyxmoadg iobyxmoadgVarLqeggnwhkg = lqeggnwhkg(state, colorsUiModel);
                kt0.ppxfxbqfkf ppxfxbqfkfVarEablkybsjg = eablkybsjg(state.getComboSetList(), state.getIsNeededShowComboSetShimmer());
                ProductsPromoBanner promoBanner = state.getPromoBanner();
                nt0.iobyxmoadg iobyxmoadgVarKcexrzcfyt = promoBanner != null ? kcexrzcfyt(promoBanner) : null;
                int i13 = 0;
                for (Object obj : additionalBlocks) {
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        jyumaefscl.iwizpuwonk();
                    }
                    a01.ppxfxbqfkf ppxfxbqfkfVar = (a01.ppxfxbqfkf) obj;
                    List listWflxmlrfwp = (List) jyumaefscl.lrnfpwlwnk(listOjitshcjhn, i13);
                    if (listWflxmlrfwp == null) {
                        listWflxmlrfwp = jyumaefscl.wflxmlrfwp();
                    }
                    listPpxfxbqfkf.addAll(listWflxmlrfwp);
                    int i15 = C3104iobyxmoadg.f122994iobyxmoadg[ppxfxbqfkfVar.ordinal()];
                    if (i15 == 1) {
                        iobyxmoadgVar = ppxfxbqfkfVarEablkybsjg;
                    } else if (i15 == 2) {
                        iobyxmoadgVar = iobyxmoadgVarLqeggnwhkg;
                    } else if (i15 == 3) {
                        iobyxmoadgVar = iobyxmoadgVarKcexrzcfyt;
                    } else {
                        if (i15 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        iobyxmoadgVar = null;
                    }
                    if (iobyxmoadgVar != null) {
                        if (list.size() < agtfadlqog(i13)) {
                            iobyxmoadgVar = null;
                        }
                        if (iobyxmoadgVar != null) {
                            listPpxfxbqfkf.add(iobyxmoadgVar);
                        }
                    }
                    i13 = i14;
                }
                listPpxfxbqfkf.addAll(jyumaefscl.lereixgezr(jyumaefscl.rlfsiqarku(listOjitshcjhn, additionalBlocks.size())));
            }
            if (state.getIsProductListLoading()) {
                listPpxfxbqfkf.add(jt0.iobyxmoadg.f52316zdlpuopuiu);
            }
        }
        return jyumaefscl.iobyxmoadg(listPpxfxbqfkf);
    }

    @Override // tg.draadjrbmk
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public tp0.rgvfuqvkyq invoke(State state) {
        List listWflxmlrfwp;
        ap0.zoijcleaow zoijcleaowVarZoijcleaow;
        List<ap0.iobyxmoadg> listIobyxmoadg;
        ap0.iobyxmoadg iobyxmoadgVarWkgbmnqykc;
        List productList;
        zdlpuopuiu.btonecajqb(state, "state");
        ProductListData productListData = state.getProductListData();
        List listOxmwwwfdhm = (productListData == null || (productList = productListData.getProductList()) == null) ? null : oxmwwwfdhm(productList, state);
        if (listOxmwwwfdhm == null) {
            listOxmwwwfdhm = jyumaefscl.wflxmlrfwp();
        }
        CatalogWithSubCatalogs catalogSection = state.getCatalogSection();
        if (catalogSection == null || (zoijcleaowVarZoijcleaow = ip0.iobyxmoadg.zoijcleaow(catalogSection, this.f122993zdlpuopuiu)) == null || (listIobyxmoadg = zoijcleaowVarZoijcleaow.iobyxmoadg()) == null) {
            listWflxmlrfwp = null;
        } else {
            listWflxmlrfwp = new ArrayList(jyumaefscl.cqumvgiudr(listIobyxmoadg, 10));
            for (ap0.iobyxmoadg iobyxmoadgVar : listIobyxmoadg) {
                ap0.iobyxmoadg iobyxmoadgVar2 = zdlpuopuiu.eablkybsjg(iobyxmoadgVar.getItemId(), state.getSelectedCatalogSectionId()) ? iobyxmoadgVar : null;
                if (iobyxmoadgVar2 != null && (iobyxmoadgVarWkgbmnqykc = ap0.iobyxmoadg.wkgbmnqykc(iobyxmoadgVar2, null, null, null, false, true, null, null, 111, null)) != null) {
                    iobyxmoadgVar = iobyxmoadgVarWkgbmnqykc;
                }
                listWflxmlrfwp.add(iobyxmoadgVar);
            }
        }
        n91.iobyxmoadg iobyxmoadgVar3 = this.f122993zdlpuopuiu;
        ProductListData productListData2 = state.getProductListData();
        ColorsUiModel colorsUiModelIobyxmoadg = iobyxmoadgVar3.iobyxmoadg(productListData2 != null ? productListData2.getColorsModel() : null);
        boolean isGridType = state.getIsGridType();
        boolean z13 = listOxmwwwfdhm.size() > 1;
        mz0.ppxfxbqfkf selectedSort = state.getSelectedSort();
        List listZoijcleaow = zoijcleaow(state, listOxmwwwfdhm, colorsUiModelIobyxmoadg);
        ProductListData productListData3 = state.getProductListData();
        String textBefore = productListData3 != null ? productListData3.getTextBefore() : null;
        if (textBefore == null) {
            textBefore = "";
        }
        String str = textBefore;
        tp0.rgvfuqvkyq.zoijcleaow zoijcleaowVar = tp0.rgvfuqvkyq.zoijcleaow.CATEGORY;
        tp0.rgvfuqvkyq.iobyxmoadg headerType = state.getHeaderType();
        String strGtknphoqwx = state.gtknphoqwx();
        ProductListData productListData4 = state.getProductListData();
        String strWkgbmnqykc = dxjokdxxww.wkgbmnqykc(productListData4 != null ? productListData4.getTitleImage() : null);
        if (listWflxmlrfwp == null) {
            listWflxmlrfwp = jyumaefscl.wflxmlrfwp();
        }
        boolean z14 = state.getProductListData() == null;
        List listIobyxmoadg2 = q11.zoijcleaow.iobyxmoadg(state.getBanners());
        return new tp0.rgvfuqvkyq(isGridType, z13, selectedSort, listZoijcleaow, str, zoijcleaowVar, headerType, strGtknphoqwx, strWkgbmnqykc, listWflxmlrfwp, colorsUiModelIobyxmoadg, z14, listIobyxmoadg2 != null ? ip0.iobyxmoadg.ppxfxbqfkf(listIobyxmoadg2) : null, state.getPayload().wflxmlrfwp(), state.getIsSwipeToRefreshLoading(), false, 32768, null);
    }
}
