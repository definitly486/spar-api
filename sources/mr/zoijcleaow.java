package mr;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.vdvldrhtss;
import kotlin.jvm.internal.zdlpuopuiu;
import ob0.ppxfxbqfkf;
import ru.myspar.catalog.impl.product_list.domain.State;
import ru.myspar.catalog.impl.product_list.domain.model.ProductListRecommendationBlock;
import ru.myspar.common.view.counter.model.CounterModel;
import ru.myspar.common.view.product.model.product.ProductUiModel;
import ru.myspar.core.domain.models.ColorsUiModel;
import ru.myspar.core.domain.models.catalog.CatalogWithSubCatalogs;
import ru.myspar.core.domain.models.product.Product;
import ru.myspar.core.domain.models.product.ProductListData;
import ru.myspar.core.domain.models.product.PromoProduct;
import ru.myspar.core.models.delivery.DeliveryCode;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;
import zg.gtknphoqwx;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow implements draadjrbmk {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final d60.iobyxmoadg f67861iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final ppxfxbqfkf f67862jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final pb0.zoijcleaow f67863yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final ob0.iobyxmoadg f67864zdlpuopuiu;

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f67865iobyxmoadg;

        static {
            int[] iArr = new int[mr.iobyxmoadg.values().length];
            try {
                iArr[mr.iobyxmoadg.PROMO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[mr.iobyxmoadg.FIRST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[mr.iobyxmoadg.SECOND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f67865iobyxmoadg = iArr;
        }
    }

    /* JADX INFO: renamed from: mr.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    /* synthetic */ class C1442zoijcleaow extends vdvldrhtss implements rgvfuqvkyq {
        C1442zoijcleaow(Object obj) {
            super(2, obj, d60.iobyxmoadg.class, "getStringWithArrayArgs", "getStringWithArrayArgs(I[Ljava/lang/Object;)Ljava/lang/String;", 0);
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return iobyxmoadg(((Number) obj).intValue(), (Object[]) obj2);
        }

        public final String iobyxmoadg(int i13, Object[] objArr) {
            return ((d60.iobyxmoadg) this.receiver).eablkybsjg(i13, objArr);
        }
    }

    public zoijcleaow(ob0.iobyxmoadg colorsUiModelMapper, pb0.zoijcleaow productToUiModelMapper, ppxfxbqfkf comboSetUiMapper, d60.iobyxmoadg resourcesManager) {
        zdlpuopuiu.btonecajqb(colorsUiModelMapper, "colorsUiModelMapper");
        zdlpuopuiu.btonecajqb(productToUiModelMapper, "productToUiModelMapper");
        zdlpuopuiu.btonecajqb(comboSetUiMapper, "comboSetUiMapper");
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        this.f67864zdlpuopuiu = colorsUiModelMapper;
        this.f67863yggfygwlhe = productToUiModelMapper;
        this.f67862jyumaefscl = comboSetUiMapper;
        this.f67861iwizpuwonk = resourcesManager;
    }

    private static final List btonecajqb(zoijcleaow zoijcleaowVar, List list) {
        return zoijcleaowVar.f67862jyumaefscl.ppxfxbqfkf(list, false);
    }

    private final List eablkybsjg(State state, List list, ColorsUiModel colorsUiModel) {
        k10.ppxfxbqfkf additionalBlocksOption;
        List listPpxfxbqfkf = jyumaefscl.ppxfxbqfkf();
        if (!list.isEmpty()) {
            List listOxmwwwfdhm = oxmwwwfdhm(list);
            tu.iobyxmoadg iobyxmoadgVarWflxmlrfwp = wflxmlrfwp(state);
            uu.iobyxmoadg iobyxmoadgVarGtknphoqwx = gtknphoqwx(state, colorsUiModel);
            qu.ppxfxbqfkf ppxfxbqfkfVarLqeggnwhkg = lqeggnwhkg(state.getComboSetList(), state.getIsNeededShowComboSetShimmer());
            ProductListData productListData = state.getProductListData();
            boolean zContains = (productListData == null || (additionalBlocksOption = productListData.getAdditionalBlocksOption()) == null) ? true : jyumaefscl.rgvfuqvkyq(k10.ppxfxbqfkf.COMBO_FIRST, k10.ppxfxbqfkf.COMBO_ONLY).contains(additionalBlocksOption);
            int i13 = 0;
            for (Object obj : mr.iobyxmoadg.lqeggnwhkg()) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    jyumaefscl.iwizpuwonk();
                }
                mr.iobyxmoadg iobyxmoadgVar = (mr.iobyxmoadg) obj;
                List listWflxmlrfwp = (List) jyumaefscl.lrnfpwlwnk(listOxmwwwfdhm, i13);
                if (listWflxmlrfwp == null) {
                    listWflxmlrfwp = jyumaefscl.wflxmlrfwp();
                }
                listPpxfxbqfkf.addAll(listWflxmlrfwp);
                int i15 = iobyxmoadg.f67865iobyxmoadg[iobyxmoadgVar.ordinal()];
                if (i15 == 1) {
                    zoijcleaow(listPpxfxbqfkf, iobyxmoadgVarWflxmlrfwp);
                } else if (i15 == 2) {
                    iobyxmoadg(listPpxfxbqfkf, zContains, ppxfxbqfkfVarLqeggnwhkg, iobyxmoadgVarGtknphoqwx);
                } else {
                    if (i15 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ppxfxbqfkf(listPpxfxbqfkf, !zContains, ppxfxbqfkfVarLqeggnwhkg, iobyxmoadgVarGtknphoqwx);
                }
                i13 = i14;
            }
            listPpxfxbqfkf.addAll(jyumaefscl.lereixgezr(jyumaefscl.rlfsiqarku(listOxmwwwfdhm, mr.iobyxmoadg.lqeggnwhkg().size())));
            if (state.getIsProductListLoading()) {
                listPpxfxbqfkf.add(pu.iobyxmoadg.f77322zdlpuopuiu);
            }
        }
        return jyumaefscl.iobyxmoadg(listPpxfxbqfkf);
    }

    private final uu.iobyxmoadg gtknphoqwx(State state, ColorsUiModel colorsUiModel) {
        ProductListRecommendationBlock recommendations = state.getRecommendations();
        ColorsUiModel.Hex hex = colorsUiModel instanceof ColorsUiModel.Hex ? (ColorsUiModel.Hex) colorsUiModel : null;
        if (!recommendations.getProducts().isEmpty()) {
            return new uu.iobyxmoadg.C2838iobyxmoadg(recommendations.getTitle(), recommendations.getTitle(), ojitshcjhn(recommendations.getProducts(), state, hex), hex);
        }
        if (recommendations.getIsNeededShowShimmer()) {
            return new uu.iobyxmoadg.zoijcleaow(hex);
        }
        return null;
    }

    private final ProductUiModel gxszxtbevo(ProductUiModel productUiModel) {
        CounterModel counterModel = productUiModel.getCounterModel();
        return productUiModel.lqeggnwhkg(((-1025) & 1) != 0 ? productUiModel.id : null, ((-1025) & 2) != 0 ? productUiModel.name : null, ((-1025) & 4) != 0 ? productUiModel.article : null, ((-1025) & 8) != 0 ? productUiModel.isProductWithZeroPrice : false, ((-1025) & 16) != 0 ? productUiModel.price : 0.0d, ((-1025) & 32) != 0 ? productUiModel.oldPrice : null, ((-1025) & 64) != 0 ? productUiModel.discount : null, ((-1025) & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? productUiModel.discountString : null, ((-1025) & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? productUiModel.hasDiscount : false, ((-1025) & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? productUiModel.isDispPer100 : false, ((-1025) & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? productUiModel.measureTypeModel : null, ((-1025) & 2048) != 0 ? productUiModel.avgWeight : null, ((-1025) & 4096) != 0 ? productUiModel.isFavorite : false, ((-1025) & 8192) != 0 ? productUiModel.favoriteEnabledState : false, ((-1025) & 16384) != 0 ? productUiModel.inCart : false, ((-1025) & 32768) != 0 ? productUiModel.photoUrl : null, ((-1025) & 65536) != 0 ? productUiModel.photoUrls : null, ((-1025) & 131072) != 0 ? productUiModel.isMultiPhotos : false, ((-1025) & 262144) != 0 ? productUiModel.fats : null, ((-1025) & 524288) != 0 ? productUiModel.carbs : null, ((-1025) & 1048576) != 0 ? productUiModel.protein : null, ((-1025) & 2097152) != 0 ? productUiModel.energy : null, ((-1025) & 4194304) != 0 ? productUiModel.params : null, ((-1025) & 8388608) != 0 ? productUiModel.description : null, ((-1025) & 16777216) != 0 ? productUiModel.chemical : null, ((-1025) & 33554432) != 0 ? productUiModel.buyState : null, ((-1025) & 67108864) != 0 ? productUiModel.stickers : null, ((-1025) & 134217728) != 0 ? productUiModel.hidePrice : false, ((-1025) & 268435456) != 0 ? productUiModel.rating : null, ((-1025) & 536870912) != 0 ? productUiModel.reviewsCount : 0, ((-1025) & 1073741824) != 0 ? productUiModel.basketQuantity : null, ((-1025) & Integer.MIN_VALUE) != 0 ? productUiModel.isPmProduct : false, (16777215 & 1) != 0 ? productUiModel.video : null, (16777215 & 2) != 0 ? productUiModel.isRatingFeatureEnabled : false, (16777215 & 4) != 0 ? productUiModel.isPurchaseListsFeatureEnabled : false, (16777215 & 8) != 0 ? productUiModel.country : null, (16777215 & 16) != 0 ? productUiModel.region : null, (16777215 & 32) != 0 ? productUiModel.countryFlagEmoji : null, (16777215 & 64) != 0 ? productUiModel.type : null, (16777215 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? productUiModel.kind : null, (16777215 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? productUiModel.grape : null, (16777215 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? productUiModel.standart : null, (16777215 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? productUiModel.countryMapIcon : null, (16777215 & 2048) != 0 ? productUiModel.tasting : null, (16777215 & 4096) != 0 ? productUiModel.styling : null, (16777215 & 8192) != 0 ? productUiModel.button : null, (16777215 & 16384) != 0 ? productUiModel.hints : null, (16777215 & 32768) != 0 ? productUiModel.colorsUiModel : null, (16777215 & 65536) != 0 ? productUiModel.counterModel : counterModel.zoijcleaow((10235 & 1) != 0 ? counterModel.isLoading : false, (10235 & 2) != 0 ? counterModel.isAvailableToBuy : false, (10235 & 4) != 0 ? counterModel.isExpand : true, (10235 & 8) != 0 ? counterModel.priceModel : null, (10235 & 16) != 0 ? counterModel.oldPriceModel : null, (10235 & 32) != 0 ? counterModel.avgWeight : null, (10235 & 64) != 0 ? counterModel.isDispPer100 : false, (10235 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? counterModel.quantity : 0.0d, (10235 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? counterModel.isMeasureTypeSwitchable : false, (10235 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? counterModel.measureType : null, (10235 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? counterModel.productLimitText : null, (10235 & 2048) != 0 ? counterModel.message : productUiModel.getAvailabilityModel().nufgyqmvbu(), (10235 & 4096) != 0 ? counterModel.autoHideMessage : !productUiModel.getAvailabilityModel().getIsAvailableToBuy(), (10235 & 8192) != 0 ? counterModel.colorsModel : null), (16777215 & 131072) != 0 ? productUiModel.deliveryCode : null, (16777215 & 262144) != 0 ? productUiModel.vivino : null, (16777215 & 524288) != 0 ? productUiModel.limits : null, (16777215 & 1048576) != 0 ? productUiModel.availabilityModel : null, (16777215 & 2097152) != 0 ? productUiModel.productVariants : null, (16777215 & 4194304) != 0 ? productUiModel.isSelected : null, (16777215 & 8388608) != 0 ? productUiModel.adv : null);
    }

    private final Boolean iobyxmoadg(List list, boolean z13, pu.zoijcleaow zoijcleaowVar, pu.zoijcleaow zoijcleaowVar2) {
        boolean zAdd;
        if (z13) {
            if (zoijcleaowVar == null) {
                return null;
            }
            zAdd = list.add(zoijcleaowVar);
        } else {
            if (zoijcleaowVar2 == null) {
                return null;
            }
            zAdd = list.add(zoijcleaowVar2);
        }
        return Boolean.valueOf(zAdd);
    }

    private final List kcexrzcfyt(List list, State state) {
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(zdlpuopuiu((Product) it.next(), state));
        }
        return arrayList;
    }

    private final qu.ppxfxbqfkf lqeggnwhkg(List list, boolean z13) {
        boolean zIsEmpty = list.isEmpty();
        boolean z14 = list.size() == 1;
        if (zIsEmpty && z13) {
            return qu.ppxfxbqfkf.wkgbmnqykc.f80662yggfygwlhe;
        }
        if (zIsEmpty) {
            return null;
        }
        return z14 ? new qu.ppxfxbqfkf.C1793ppxfxbqfkf((qu.iobyxmoadg) jyumaefscl.opjhrmiecq(btonecajqb(this, list))) : new qu.ppxfxbqfkf.zoijcleaow(btonecajqb(this, list));
    }

    private final List ojitshcjhn(List list, State state, ColorsUiModel.Hex hex) {
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ProductUiModel productUiModelZdlpuopuiu = zdlpuopuiu((Product) it.next(), state);
            CounterModel counterModel = productUiModelZdlpuopuiu.getCounterModel();
            arrayList.add(productUiModelZdlpuopuiu.lqeggnwhkg(((-1025) & 1) != 0 ? productUiModelZdlpuopuiu.id : null, ((-1025) & 2) != 0 ? productUiModelZdlpuopuiu.name : null, ((-1025) & 4) != 0 ? productUiModelZdlpuopuiu.article : null, ((-1025) & 8) != 0 ? productUiModelZdlpuopuiu.isProductWithZeroPrice : false, ((-1025) & 16) != 0 ? productUiModelZdlpuopuiu.price : 0.0d, ((-1025) & 32) != 0 ? productUiModelZdlpuopuiu.oldPrice : null, ((-1025) & 64) != 0 ? productUiModelZdlpuopuiu.discount : null, ((-1025) & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? productUiModelZdlpuopuiu.discountString : null, ((-1025) & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? productUiModelZdlpuopuiu.hasDiscount : false, ((-1025) & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? productUiModelZdlpuopuiu.isDispPer100 : false, ((-1025) & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? productUiModelZdlpuopuiu.measureTypeModel : null, ((-1025) & 2048) != 0 ? productUiModelZdlpuopuiu.avgWeight : null, ((-1025) & 4096) != 0 ? productUiModelZdlpuopuiu.isFavorite : false, ((-1025) & 8192) != 0 ? productUiModelZdlpuopuiu.favoriteEnabledState : false, ((-1025) & 16384) != 0 ? productUiModelZdlpuopuiu.inCart : false, ((-1025) & 32768) != 0 ? productUiModelZdlpuopuiu.photoUrl : null, ((-1025) & 65536) != 0 ? productUiModelZdlpuopuiu.photoUrls : null, ((-1025) & 131072) != 0 ? productUiModelZdlpuopuiu.isMultiPhotos : false, ((-1025) & 262144) != 0 ? productUiModelZdlpuopuiu.fats : null, ((-1025) & 524288) != 0 ? productUiModelZdlpuopuiu.carbs : null, ((-1025) & 1048576) != 0 ? productUiModelZdlpuopuiu.protein : null, ((-1025) & 2097152) != 0 ? productUiModelZdlpuopuiu.energy : null, ((-1025) & 4194304) != 0 ? productUiModelZdlpuopuiu.params : null, ((-1025) & 8388608) != 0 ? productUiModelZdlpuopuiu.description : null, ((-1025) & 16777216) != 0 ? productUiModelZdlpuopuiu.chemical : null, ((-1025) & 33554432) != 0 ? productUiModelZdlpuopuiu.buyState : null, ((-1025) & 67108864) != 0 ? productUiModelZdlpuopuiu.stickers : null, ((-1025) & 134217728) != 0 ? productUiModelZdlpuopuiu.hidePrice : false, ((-1025) & 268435456) != 0 ? productUiModelZdlpuopuiu.rating : null, ((-1025) & 536870912) != 0 ? productUiModelZdlpuopuiu.reviewsCount : 0, ((-1025) & 1073741824) != 0 ? productUiModelZdlpuopuiu.basketQuantity : null, ((-1025) & Integer.MIN_VALUE) != 0 ? productUiModelZdlpuopuiu.isPmProduct : false, (16777215 & 1) != 0 ? productUiModelZdlpuopuiu.video : null, (16777215 & 2) != 0 ? productUiModelZdlpuopuiu.isRatingFeatureEnabled : false, (16777215 & 4) != 0 ? productUiModelZdlpuopuiu.isPurchaseListsFeatureEnabled : false, (16777215 & 8) != 0 ? productUiModelZdlpuopuiu.country : null, (16777215 & 16) != 0 ? productUiModelZdlpuopuiu.region : null, (16777215 & 32) != 0 ? productUiModelZdlpuopuiu.countryFlagEmoji : null, (16777215 & 64) != 0 ? productUiModelZdlpuopuiu.type : null, (16777215 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? productUiModelZdlpuopuiu.kind : null, (16777215 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? productUiModelZdlpuopuiu.grape : null, (16777215 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? productUiModelZdlpuopuiu.standart : null, (16777215 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? productUiModelZdlpuopuiu.countryMapIcon : null, (16777215 & 2048) != 0 ? productUiModelZdlpuopuiu.tasting : null, (16777215 & 4096) != 0 ? productUiModelZdlpuopuiu.styling : null, (16777215 & 8192) != 0 ? productUiModelZdlpuopuiu.button : null, (16777215 & 16384) != 0 ? productUiModelZdlpuopuiu.hints : null, (16777215 & 32768) != 0 ? productUiModelZdlpuopuiu.colorsUiModel : hex, (16777215 & 65536) != 0 ? productUiModelZdlpuopuiu.counterModel : counterModel.zoijcleaow((10235 & 1) != 0 ? counterModel.isLoading : false, (10235 & 2) != 0 ? counterModel.isAvailableToBuy : false, (10235 & 4) != 0 ? counterModel.isExpand : false, (10235 & 8) != 0 ? counterModel.priceModel : null, (10235 & 16) != 0 ? counterModel.oldPriceModel : null, (10235 & 32) != 0 ? counterModel.avgWeight : null, (10235 & 64) != 0 ? counterModel.isDispPer100 : false, (10235 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? counterModel.quantity : 0.0d, (10235 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? counterModel.isMeasureTypeSwitchable : false, (10235 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? counterModel.measureType : null, (10235 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? counterModel.productLimitText : null, (10235 & 2048) != 0 ? counterModel.message : null, (10235 & 4096) != 0 ? counterModel.autoHideMessage : false, (10235 & 8192) != 0 ? counterModel.colorsModel : hex), (16777215 & 131072) != 0 ? productUiModelZdlpuopuiu.deliveryCode : null, (16777215 & 262144) != 0 ? productUiModelZdlpuopuiu.vivino : null, (16777215 & 524288) != 0 ? productUiModelZdlpuopuiu.limits : null, (16777215 & 1048576) != 0 ? productUiModelZdlpuopuiu.availabilityModel : null, (16777215 & 2097152) != 0 ? productUiModelZdlpuopuiu.productVariants : null, (16777215 & 4194304) != 0 ? productUiModelZdlpuopuiu.isSelected : null, (16777215 & 8388608) != 0 ? productUiModelZdlpuopuiu.adv : null));
        }
        return arrayList;
    }

    private final List oxmwwwfdhm(List list) {
        List listPpxfxbqfkf = jyumaefscl.ppxfxbqfkf();
        if (!list.isEmpty()) {
            ng.iobyxmoadg iobyxmoadgVarLqeggnwhkg = mr.iobyxmoadg.lqeggnwhkg();
            ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(iobyxmoadgVarLqeggnwhkg, 10));
            Iterator<E> it = iobyxmoadgVarLqeggnwhkg.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((mr.iobyxmoadg) it.next()).wkgbmnqykc()));
            }
            Iterator it2 = arrayList.iterator();
            int i13 = 0;
            while (it2.hasNext()) {
                int iBtonecajqb = gtknphoqwx.btonecajqb(((Number) it2.next()).intValue(), list.size());
                listPpxfxbqfkf.add(list.subList(i13, iBtonecajqb));
                i13 = iBtonecajqb;
            }
            if (i13 < list.size()) {
                listPpxfxbqfkf.add(list.subList(i13, list.size()));
            }
        }
        return jyumaefscl.iobyxmoadg(listPpxfxbqfkf);
    }

    private final Boolean ppxfxbqfkf(List list, boolean z13, pu.zoijcleaow zoijcleaowVar, pu.zoijcleaow zoijcleaowVar2) {
        boolean zAdd;
        if (z13) {
            if (zoijcleaowVar == null) {
                return null;
            }
            zAdd = list.add(zoijcleaowVar);
        } else {
            if (zoijcleaowVar2 == null) {
                return null;
            }
            zAdd = list.add(zoijcleaowVar2);
        }
        return Boolean.valueOf(zAdd);
    }

    private final tu.iobyxmoadg wflxmlrfwp(State state) {
        PromoProduct promo;
        Product product;
        ProductUiModel productUiModelZdlpuopuiu;
        ProductListData productListData = state.getProductListData();
        if (productListData == null || (promo = productListData.getPromo()) == null || (product = promo.getProduct()) == null || (productUiModelZdlpuopuiu = zdlpuopuiu(product, state)) == null) {
            return null;
        }
        PromoProduct promo2 = state.getProductListData().getPromo();
        return new tu.iobyxmoadg(productUiModelZdlpuopuiu, promo2 != null ? promo2.getBackgroundColor() : null);
    }

    private final ProductUiModel zdlpuopuiu(Product product, State state) {
        ProductUiModel productUiModelGxszxtbevo;
        PromoProduct promo;
        pb0.zoijcleaow zoijcleaowVar = this.f67863yggfygwlhe;
        List productDataList = state.getProductDataList();
        DeliveryCode deliveryCode = state.getDeliveryCode();
        boolean isRatingEnabled = state.getFeatureToggles().getIsRatingEnabled();
        boolean isPurchasesListEnabled = state.getFeatureToggles().getIsPurchasesListEnabled();
        boolean isVivinoEnabled = state.getFeatureToggles().getIsVivinoEnabled();
        C1442zoijcleaow c1442zoijcleaow = new C1442zoijcleaow(this.f67861iwizpuwonk);
        ProductListData productListData = state.getProductListData();
        ProductUiModel productUiModelPpxfxbqfkf = zoijcleaowVar.ppxfxbqfkf(product, productDataList, deliveryCode, isRatingEnabled, isPurchasesListEnabled, isVivinoEnabled, (productListData == null || (promo = productListData.getPromo()) == null) ? null : promo.getAdv(), c1442zoijcleaow);
        ProductUiModel productUiModel = state.getExpandedProductIds().contains(productUiModelPpxfxbqfkf.getId()) ? productUiModelPpxfxbqfkf : null;
        return (productUiModel == null || (productUiModelGxszxtbevo = gxszxtbevo(productUiModel)) == null) ? productUiModelPpxfxbqfkf : productUiModelGxszxtbevo;
    }

    private final Boolean zoijcleaow(List list, pu.zoijcleaow zoijcleaowVar) {
        if (zoijcleaowVar != null) {
            return Boolean.valueOf(list.add(zoijcleaowVar));
        }
        return null;
    }

    @Override // tg.draadjrbmk
    /* JADX INFO: renamed from: agtfadlqog, reason: merged with bridge method [inline-methods] */
    public hr.vdvldrhtss invoke(State state) {
        List listWflxmlrfwp;
        oq.zoijcleaow zoijcleaowVarPpxfxbqfkf;
        List<oq.iobyxmoadg> listIobyxmoadg;
        oq.iobyxmoadg iobyxmoadgVarWkgbmnqykc;
        List productList;
        zdlpuopuiu.btonecajqb(state, "state");
        ProductListData productListData = state.getProductListData();
        List listKcexrzcfyt = (productListData == null || (productList = productListData.getProductList()) == null) ? null : kcexrzcfyt(productList, state);
        if (listKcexrzcfyt == null) {
            listKcexrzcfyt = jyumaefscl.wflxmlrfwp();
        }
        CatalogWithSubCatalogs catalogSection = state.getCatalogSection();
        if (catalogSection == null || (zoijcleaowVarPpxfxbqfkf = wq.iobyxmoadg.ppxfxbqfkf(catalogSection, this.f67864zdlpuopuiu)) == null || (listIobyxmoadg = zoijcleaowVarPpxfxbqfkf.iobyxmoadg()) == null) {
            listWflxmlrfwp = null;
        } else {
            listWflxmlrfwp = new ArrayList(jyumaefscl.cqumvgiudr(listIobyxmoadg, 10));
            for (oq.iobyxmoadg iobyxmoadgVar : listIobyxmoadg) {
                oq.iobyxmoadg iobyxmoadgVar2 = zdlpuopuiu.eablkybsjg(iobyxmoadgVar.getItemId(), state.getSelectedCatalogSectionId()) ? iobyxmoadgVar : null;
                if (iobyxmoadgVar2 != null && (iobyxmoadgVarWkgbmnqykc = oq.iobyxmoadg.wkgbmnqykc(iobyxmoadgVar2, null, null, null, false, true, null, null, 111, null)) != null) {
                    iobyxmoadgVar = iobyxmoadgVarWkgbmnqykc;
                }
                listWflxmlrfwp.add(iobyxmoadgVar);
            }
        }
        ob0.iobyxmoadg iobyxmoadgVar3 = this.f67864zdlpuopuiu;
        ProductListData productListData2 = state.getProductListData();
        ColorsUiModel colorsUiModelIobyxmoadg = iobyxmoadgVar3.iobyxmoadg(productListData2 != null ? productListData2.getColorsModel() : null);
        boolean isGridType = state.getIsGridType();
        boolean z13 = listKcexrzcfyt.size() > 1;
        v00.ppxfxbqfkf selectedSort = state.getSelectedSort();
        List listEablkybsjg = eablkybsjg(state, listKcexrzcfyt, colorsUiModelIobyxmoadg);
        ProductListData productListData3 = state.getProductListData();
        String textBefore = productListData3 != null ? productListData3.getTextBefore() : null;
        if (textBefore == null) {
            textBefore = "";
        }
        String str = textBefore;
        hr.vdvldrhtss.zoijcleaow zoijcleaowVar = hr.vdvldrhtss.zoijcleaow.CATEGORY;
        hr.vdvldrhtss.iobyxmoadg headerType = state.getHeaderType();
        String strGtknphoqwx = state.gtknphoqwx();
        ProductListData productListData4 = state.getProductListData();
        String strWkgbmnqykc = k30.draadjrbmk.wkgbmnqykc(productListData4 != null ? productListData4.getTitleImage() : null);
        if (listWflxmlrfwp == null) {
            listWflxmlrfwp = jyumaefscl.wflxmlrfwp();
        }
        boolean z14 = state.getProductListData() == null;
        List listIobyxmoadg2 = k30.zoijcleaow.iobyxmoadg(state.getBanners());
        return new hr.vdvldrhtss(isGridType, z13, selectedSort, listEablkybsjg, str, zoijcleaowVar, headerType, strGtknphoqwx, strWkgbmnqykc, listWflxmlrfwp, colorsUiModelIobyxmoadg, z14, listIobyxmoadg2 != null ? wq.iobyxmoadg.iobyxmoadg(listIobyxmoadg2) : null, state.getPayload().wflxmlrfwp(), state.getIsSwipeToRefreshLoading(), state.getIsFullScreenLoading());
    }
}
