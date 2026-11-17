package as;

import bs.eablkybsjg;
import bs.gxszxtbevo;
import bs.lqeggnwhkg;
import bs.wkgbmnqykc;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.vdvldrhtss;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import ob0.ppxfxbqfkf;
import pm.dxjokdxxww;
import ru.myspar.catalog.impl.specific_product.domain.store.SpecificProductStore$Dialog;
import ru.myspar.catalog.impl.specific_product.domain.store.State;
import ru.myspar.common.view.counter.model.CounterModel;
import ru.myspar.common.view.hint.model.HintUiModel;
import ru.myspar.common.view.product.model.product.ProductUiModel;
import ru.myspar.core.domain.models.ColorsModel;
import ru.myspar.core.domain.models.ColorsUiModel;
import ru.myspar.core.domain.models.VivinoRatingUiModel;
import ru.myspar.core.domain.models.product.Product;
import ru.myspar.core.domain.models.recommendations.Recommendation;
import ru.myspar.core.models.delivery.DeliveryCode;
import ru.myspar.core.models.measure_type.MeasureTypeModel;
import ru.myspar.rate.review.api.model.ReviewItem;
import ru.myspar.rate.review.api.model.ReviewUser;
import ru.myspar.rate.review.api.model.Reviews;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow implements draadjrbmk {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final ppxfxbqfkf f14412cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final d60.iobyxmoadg f14413esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final dt.zoijcleaow f14414iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final as.iobyxmoadg f14415jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final ob0.iobyxmoadg f14416yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final pb0.zoijcleaow f14417zdlpuopuiu;

    /* synthetic */ class iobyxmoadg extends vdvldrhtss implements rgvfuqvkyq {
        iobyxmoadg(Object obj) {
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

    /* JADX INFO: renamed from: as.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    /* synthetic */ class C0227zoijcleaow extends vdvldrhtss implements rgvfuqvkyq {
        C0227zoijcleaow(Object obj) {
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

    public zoijcleaow(pb0.zoijcleaow productUiModelMapper, ob0.iobyxmoadg colorsUiModelMapper, as.iobyxmoadg productToParamListMapper, dt.zoijcleaow dateUtils, ppxfxbqfkf comboSetUiMapper, d60.iobyxmoadg resources) {
        zdlpuopuiu.btonecajqb(productUiModelMapper, "productUiModelMapper");
        zdlpuopuiu.btonecajqb(colorsUiModelMapper, "colorsUiModelMapper");
        zdlpuopuiu.btonecajqb(productToParamListMapper, "productToParamListMapper");
        zdlpuopuiu.btonecajqb(dateUtils, "dateUtils");
        zdlpuopuiu.btonecajqb(comboSetUiMapper, "comboSetUiMapper");
        zdlpuopuiu.btonecajqb(resources, "resources");
        this.f14417zdlpuopuiu = productUiModelMapper;
        this.f14416yggfygwlhe = colorsUiModelMapper;
        this.f14415jyumaefscl = productToParamListMapper;
        this.f14414iwizpuwonk = dateUtils;
        this.f14412cqumvgiudr = comboSetUiMapper;
        this.f14413esjtqupxsv = resources;
    }

    private final List eablkybsjg(Map map, List list, DeliveryCode deliveryCode, boolean z13, boolean z14, boolean z15, Set set) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            Recommendation recommendation = (Recommendation) entry.getValue();
            String recommendationBlockId = recommendation.getRecommendationBlockId();
            String title = recommendation.getTitle();
            List productList = recommendation.getProductList();
            ArrayList<ProductUiModel> arrayList2 = new ArrayList(jyumaefscl.cqumvgiudr(productList, 10));
            Iterator it = productList.iterator();
            while (it.hasNext()) {
                arrayList2.add(this.f14417zdlpuopuiu.ppxfxbqfkf((Product) it.next(), list, deliveryCode, z13, z14, z15, (64 & 64) != 0 ? null : null, new C0227zoijcleaow(this.f14413esjtqupxsv)));
            }
            ArrayList arrayList3 = new ArrayList(jyumaefscl.cqumvgiudr(arrayList2, 10));
            for (ProductUiModel productUiModelLqeggnwhkg : arrayList2) {
                if (set.contains(productUiModelLqeggnwhkg.getId())) {
                    CounterModel counterModel = productUiModelLqeggnwhkg.getCounterModel();
                    productUiModelLqeggnwhkg = productUiModelLqeggnwhkg.lqeggnwhkg(((-1025) & 1) != 0 ? productUiModelLqeggnwhkg.id : null, ((-1025) & 2) != 0 ? productUiModelLqeggnwhkg.name : null, ((-1025) & 4) != 0 ? productUiModelLqeggnwhkg.article : null, ((-1025) & 8) != 0 ? productUiModelLqeggnwhkg.isProductWithZeroPrice : false, ((-1025) & 16) != 0 ? productUiModelLqeggnwhkg.price : 0.0d, ((-1025) & 32) != 0 ? productUiModelLqeggnwhkg.oldPrice : null, ((-1025) & 64) != 0 ? productUiModelLqeggnwhkg.discount : null, ((-1025) & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? productUiModelLqeggnwhkg.discountString : null, ((-1025) & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? productUiModelLqeggnwhkg.hasDiscount : false, ((-1025) & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? productUiModelLqeggnwhkg.isDispPer100 : false, ((-1025) & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? productUiModelLqeggnwhkg.measureTypeModel : null, ((-1025) & 2048) != 0 ? productUiModelLqeggnwhkg.avgWeight : null, ((-1025) & 4096) != 0 ? productUiModelLqeggnwhkg.isFavorite : false, ((-1025) & 8192) != 0 ? productUiModelLqeggnwhkg.favoriteEnabledState : false, ((-1025) & 16384) != 0 ? productUiModelLqeggnwhkg.inCart : false, ((-1025) & 32768) != 0 ? productUiModelLqeggnwhkg.photoUrl : null, ((-1025) & 65536) != 0 ? productUiModelLqeggnwhkg.photoUrls : null, ((-1025) & 131072) != 0 ? productUiModelLqeggnwhkg.isMultiPhotos : false, ((-1025) & 262144) != 0 ? productUiModelLqeggnwhkg.fats : null, ((-1025) & 524288) != 0 ? productUiModelLqeggnwhkg.carbs : null, ((-1025) & 1048576) != 0 ? productUiModelLqeggnwhkg.protein : null, ((-1025) & 2097152) != 0 ? productUiModelLqeggnwhkg.energy : null, ((-1025) & 4194304) != 0 ? productUiModelLqeggnwhkg.params : null, ((-1025) & 8388608) != 0 ? productUiModelLqeggnwhkg.description : null, ((-1025) & 16777216) != 0 ? productUiModelLqeggnwhkg.chemical : null, ((-1025) & 33554432) != 0 ? productUiModelLqeggnwhkg.buyState : null, ((-1025) & 67108864) != 0 ? productUiModelLqeggnwhkg.stickers : null, ((-1025) & 134217728) != 0 ? productUiModelLqeggnwhkg.hidePrice : false, ((-1025) & 268435456) != 0 ? productUiModelLqeggnwhkg.rating : null, ((-1025) & 536870912) != 0 ? productUiModelLqeggnwhkg.reviewsCount : 0, ((-1025) & 1073741824) != 0 ? productUiModelLqeggnwhkg.basketQuantity : null, ((-1025) & Integer.MIN_VALUE) != 0 ? productUiModelLqeggnwhkg.isPmProduct : false, (16777215 & 1) != 0 ? productUiModelLqeggnwhkg.video : null, (16777215 & 2) != 0 ? productUiModelLqeggnwhkg.isRatingFeatureEnabled : false, (16777215 & 4) != 0 ? productUiModelLqeggnwhkg.isPurchaseListsFeatureEnabled : false, (16777215 & 8) != 0 ? productUiModelLqeggnwhkg.country : null, (16777215 & 16) != 0 ? productUiModelLqeggnwhkg.region : null, (16777215 & 32) != 0 ? productUiModelLqeggnwhkg.countryFlagEmoji : null, (16777215 & 64) != 0 ? productUiModelLqeggnwhkg.type : null, (16777215 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? productUiModelLqeggnwhkg.kind : null, (16777215 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? productUiModelLqeggnwhkg.grape : null, (16777215 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? productUiModelLqeggnwhkg.standart : null, (16777215 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? productUiModelLqeggnwhkg.countryMapIcon : null, (16777215 & 2048) != 0 ? productUiModelLqeggnwhkg.tasting : null, (16777215 & 4096) != 0 ? productUiModelLqeggnwhkg.styling : null, (16777215 & 8192) != 0 ? productUiModelLqeggnwhkg.button : null, (16777215 & 16384) != 0 ? productUiModelLqeggnwhkg.hints : null, (16777215 & 32768) != 0 ? productUiModelLqeggnwhkg.colorsUiModel : null, (16777215 & 65536) != 0 ? productUiModelLqeggnwhkg.counterModel : counterModel.zoijcleaow((10235 & 1) != 0 ? counterModel.isLoading : false, (10235 & 2) != 0 ? counterModel.isAvailableToBuy : false, (10235 & 4) != 0 ? counterModel.isExpand : true, (10235 & 8) != 0 ? counterModel.priceModel : null, (10235 & 16) != 0 ? counterModel.oldPriceModel : null, (10235 & 32) != 0 ? counterModel.avgWeight : null, (10235 & 64) != 0 ? counterModel.isDispPer100 : false, (10235 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? counterModel.quantity : 0.0d, (10235 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? counterModel.isMeasureTypeSwitchable : false, (10235 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? counterModel.measureType : null, (10235 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? counterModel.productLimitText : null, (10235 & 2048) != 0 ? counterModel.message : productUiModelLqeggnwhkg.getAvailabilityModel().nufgyqmvbu(), (10235 & 4096) != 0 ? counterModel.autoHideMessage : !productUiModelLqeggnwhkg.getAvailabilityModel().getIsAvailableToBuy(), (10235 & 8192) != 0 ? counterModel.colorsModel : null), (16777215 & 131072) != 0 ? productUiModelLqeggnwhkg.deliveryCode : null, (16777215 & 262144) != 0 ? productUiModelLqeggnwhkg.vivino : null, (16777215 & 524288) != 0 ? productUiModelLqeggnwhkg.limits : null, (16777215 & 1048576) != 0 ? productUiModelLqeggnwhkg.availabilityModel : null, (16777215 & 2097152) != 0 ? productUiModelLqeggnwhkg.productVariants : null, (16777215 & 4194304) != 0 ? productUiModelLqeggnwhkg.isSelected : null, (16777215 & 8388608) != 0 ? productUiModelLqeggnwhkg.adv : null);
                }
                arrayList3.add(productUiModelLqeggnwhkg);
            }
            arrayList.add(new uu.zoijcleaow(recommendationBlockId, arrayList3, title));
        }
        return arrayList;
    }

    private final gxszxtbevo gxszxtbevo(Reviews reviews, Product product) {
        Integer reviewsCount = reviews.getSumHeaderItem().getReviewsCount();
        int iIntValue = reviewsCount != null ? reviewsCount.intValue() : product.getReviews();
        ReviewUser user = reviews.getUser();
        Integer numValueOf = null;
        if (iIntValue <= 0 && !user.getIsCanAdd() && !user.getIsCanEdit()) {
            return null;
        }
        List<ReviewItem> items = reviews.getItems();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(items, 10));
        for (ReviewItem reviewItem : items) {
            String id2 = reviewItem.getId();
            String user2 = reviewItem.getUser();
            String strEablkybsjg = this.f14414iwizpuwonk.eablkybsjg(reviewItem.getDate(), "dd MMMM yyyy");
            if (strEablkybsjg == null) {
                strEablkybsjg = "";
            }
            arrayList.add(new eablkybsjg(id2, user2, strEablkybsjg, reviewItem.getRating(), reviewItem.getComment()));
        }
        if (user.getIsCanEdit()) {
            numValueOf = Integer.valueOf(dxjokdxxww.reviews_edit);
        } else if (user.getIsCanAdd()) {
            numValueOf = Integer.valueOf(dxjokdxxww.reviews_add_new);
        }
        return new gxszxtbevo(iIntValue, arrayList, numValueOf);
    }

    private final bs.iobyxmoadg iobyxmoadg(ProductUiModel productUiModel, DeliveryCode deliveryCode, boolean z13, boolean z14) {
        CounterModel counterModel = productUiModel.getCounterModel();
        if (z13) {
            counterModel = counterModel.zoijcleaow((10235 & 1) != 0 ? counterModel.isLoading : false, (10235 & 2) != 0 ? counterModel.isAvailableToBuy : false, (10235 & 4) != 0 ? counterModel.isExpand : true, (10235 & 8) != 0 ? counterModel.priceModel : null, (10235 & 16) != 0 ? counterModel.oldPriceModel : null, (10235 & 32) != 0 ? counterModel.avgWeight : null, (10235 & 64) != 0 ? counterModel.isDispPer100 : false, (10235 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? counterModel.quantity : 0.0d, (10235 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? counterModel.isMeasureTypeSwitchable : false, (10235 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? counterModel.measureType : null, (10235 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? counterModel.productLimitText : null, (10235 & 2048) != 0 ? counterModel.message : productUiModel.getAvailabilityModel().nufgyqmvbu(), (10235 & 4096) != 0 ? counterModel.autoHideMessage : !productUiModel.getAvailabilityModel().getIsAvailableToBuy(), (10235 & 8192) != 0 ? counterModel.colorsModel : null);
        }
        CounterModel counterModel2 = counterModel;
        MeasureTypeModel measureTypeModel = productUiModel.getMeasureTypeModel();
        if (!counterModel2.getIsMeasureTypeSwitchable() || !counterModel2.nufgyqmvbu() || productUiModel.getIsProductWithZeroPrice()) {
            measureTypeModel = null;
        }
        return new bs.iobyxmoadg(counterModel2, measureTypeModel, z14, productUiModel.getAvailabilityModel(), deliveryCode == DeliveryCode.PICKUP);
    }

    private final lqeggnwhkg lqeggnwhkg(ProductUiModel productUiModel) {
        StringBuilder sb3 = new StringBuilder();
        String countryFlagEmoji = productUiModel.getCountryFlagEmoji();
        if (countryFlagEmoji != null && !kcexrzcfyt.zfvoamnweg(countryFlagEmoji)) {
            sb3.append(" " + productUiModel.getCountryFlagEmoji() + "  ");
        }
        sb3.append(k30.draadjrbmk.zoijcleaow(productUiModel.getCountry(), productUiModel.getRegion(), null, 4, null));
        String string = sb3.toString();
        if (kcexrzcfyt.zfvoamnweg(productUiModel.getCountry()) && kcexrzcfyt.zfvoamnweg(productUiModel.getRegion())) {
            string = null;
        }
        List listPpxfxbqfkf = jyumaefscl.ppxfxbqfkf();
        if (!kcexrzcfyt.zfvoamnweg(productUiModel.getType()) || !kcexrzcfyt.zfvoamnweg(productUiModel.getKind())) {
            listPpxfxbqfkf.add(new lqeggnwhkg.iobyxmoadg(s40.gxszxtbevo.ic_glass_24, k30.draadjrbmk.zoijcleaow(productUiModel.getType(), productUiModel.getKind(), null, 4, null)));
        }
        if (!kcexrzcfyt.zfvoamnweg(productUiModel.getGrape())) {
            listPpxfxbqfkf.add(new lqeggnwhkg.iobyxmoadg(s40.gxszxtbevo.ic_grape_24, productUiModel.getGrape()));
        }
        if (!kcexrzcfyt.zfvoamnweg(productUiModel.getStandart())) {
            listPpxfxbqfkf.add(new lqeggnwhkg.iobyxmoadg(s40.gxszxtbevo.ic_marker_24, productUiModel.getStandart()));
        }
        lqeggnwhkg lqeggnwhkgVar = new lqeggnwhkg(string, jyumaefscl.iobyxmoadg(listPpxfxbqfkf));
        if (lqeggnwhkgVar.iobyxmoadg() == null && lqeggnwhkgVar.zoijcleaow().isEmpty()) {
            return null;
        }
        return lqeggnwhkgVar;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0020  */
    private final bs.ppxfxbqfkf ppxfxbqfkf(ProductUiModel productUiModel) {
        String string;
        Integer discount = productUiModel.getDiscount();
        String string2 = null;
        if (discount == null) {
            string = null;
        } else {
            if (discount.intValue() <= 0 || productUiModel.getPrice() == 0.0d) {
                discount = null;
            }
            if (discount != null) {
                string = discount.toString();
            } else {
                string = null;
            }
        }
        List listPpxfxbqfkf = jyumaefscl.ppxfxbqfkf();
        VivinoRatingUiModel vivino = productUiModel.getVivino();
        if (vivino != null) {
            listPpxfxbqfkf.add(new wkgbmnqykc.ppxfxbqfkf(String.valueOf(vivino.getRating())));
        }
        Double rating = productUiModel.getRating();
        boolean z13 = rating == null || rating.doubleValue() <= 0.0d;
        boolean z14 = productUiModel.getReviewsCount() == 0;
        if (z13 && z14) {
            listPpxfxbqfkf.add(wkgbmnqykc.iobyxmoadg.f16988iobyxmoadg);
        } else {
            if (rating != null) {
                if (z13) {
                    rating = null;
                }
                if (rating != null) {
                    string2 = rating.toString();
                }
            }
            if (string2 == null) {
                string2 = "";
            }
            listPpxfxbqfkf.add(new wkgbmnqykc.zoijcleaow(string2, productUiModel.getReviewsCount()));
        }
        List listIobyxmoadg = jyumaefscl.iobyxmoadg(listPpxfxbqfkf);
        String name = productUiModel.getName();
        List hints = productUiModel.getHints();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(hints, 10));
        Iterator it = hints.iterator();
        while (it.hasNext()) {
            arrayList.add(ru.myspar.common.view.hint.model.iobyxmoadg.zoijcleaow((HintUiModel) it.next(), HintUiModel.iobyxmoadg.BIG));
        }
        List photoUrls = productUiModel.getPhotoUrls();
        List stickers = productUiModel.getStickers();
        if (stickers == null) {
            stickers = jyumaefscl.wflxmlrfwp();
        }
        return new bs.ppxfxbqfkf(name, photoUrls, listIobyxmoadg, stickers, arrayList, string, productUiModel.getIsFavorite());
    }

    @Override // tg.draadjrbmk
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ru.myspar.catalog.impl.specific_product.presentation.zoijcleaow invoke(State state) {
        ru.myspar.catalog.impl.specific_product.presentation.zoijcleaow.iobyxmoadg iobyxmoadgVar;
        List listEablkybsjg;
        List listPpxfxbqfkf;
        zdlpuopuiu.btonecajqb(state, "state");
        ru.myspar.catalog.impl.specific_product.presentation.zoijcleaow.C1973zoijcleaow c1973zoijcleaow = null;
        if (state.getMainProduct() != null) {
            ColorsModel colorsModel = state.getMainProduct().getColorsModel();
            ColorsUiModel colorsUiModelIobyxmoadg = colorsModel != null ? this.f14416yggfygwlhe.iobyxmoadg(colorsModel) : null;
            ProductUiModel productUiModelPpxfxbqfkf = this.f14417zdlpuopuiu.ppxfxbqfkf(state.getMainProduct(), state.getProductDataList(), state.getDeliveryCode(), state.getIsRatingFeatureEnabled(), state.getIsPurchaseListsFeatureEnabled(), state.getIsVivinoFeatureEnabled(), (64 & 64) != 0 ? null : null, new iobyxmoadg(this.f14413esjtqupxsv));
            bs.ppxfxbqfkf ppxfxbqfkfVarPpxfxbqfkf = ppxfxbqfkf(productUiModelPpxfxbqfkf);
            bs.zoijcleaow zoijcleaowVar = new bs.zoijcleaow(k30.draadjrbmk.wkgbmnqykc(productUiModelPpxfxbqfkf.getDescription()), k30.draadjrbmk.wkgbmnqykc(productUiModelPpxfxbqfkf.getStyling()), k30.draadjrbmk.wkgbmnqykc(productUiModelPpxfxbqfkf.getTasting()));
            lqeggnwhkg lqeggnwhkgVarLqeggnwhkg = lqeggnwhkg(productUiModelPpxfxbqfkf);
            List listInvoke = this.f14415jyumaefscl.invoke(state.getMainProduct());
            List comboSetList = state.getComboSetList();
            List listIobyxmoadg = (comboSetList == null || (listPpxfxbqfkf = this.f14412cqumvgiudr.ppxfxbqfkf(comboSetList, false)) == null) ? null : k30.zoijcleaow.iobyxmoadg(listPpxfxbqfkf);
            Reviews reviews = state.getReviews();
            gxszxtbevo gxszxtbevoVarGxszxtbevo = reviews != null ? gxszxtbevo(reviews, state.getMainProduct()) : null;
            Map recommendations = state.getRecommendations();
            if (recommendations != null) {
                listEablkybsjg = eablkybsjg(recommendations, state.getProductDataList(), state.getDeliveryCode(), state.getIsRatingFeatureEnabled(), state.getIsPurchaseListsFeatureEnabled(), state.getIsVivinoFeatureEnabled(), state.getExpandedProductIds());
            } else {
                listEablkybsjg = null;
            }
            bs.iobyxmoadg iobyxmoadgVarIobyxmoadg = iobyxmoadg(productUiModelPpxfxbqfkf, state.getDeliveryCode(), state.getExpandedProductIds().contains(state.getMainProduct().getId()), state.getPayload().getIsOrderEdit());
            String id2 = productUiModelPpxfxbqfkf.getId();
            String preview = productUiModelPpxfxbqfkf.getVideo().getPreview();
            iobyxmoadgVar = new ru.myspar.catalog.impl.specific_product.presentation.zoijcleaow.iobyxmoadg(id2, colorsUiModelIobyxmoadg, ppxfxbqfkfVarPpxfxbqfkf, productUiModelPpxfxbqfkf.getProductVariants(), lqeggnwhkgVarLqeggnwhkg, zoijcleaowVar, listInvoke, !kcexrzcfyt.zfvoamnweg(preview) ? preview : null, listIobyxmoadg, gxszxtbevoVarGxszxtbevo, listEablkybsjg, iobyxmoadgVarIobyxmoadg);
        } else {
            iobyxmoadgVar = null;
        }
        boolean z13 = state.getMainProduct() == null || state.getIsLoading();
        SpecificProductStore$Dialog dialog = state.getDialog();
        if (dialog instanceof SpecificProductStore$Dialog.AvailableOnlyForPickup) {
            String string = this.f14413esjtqupxsv.getString(dxjokdxxww.attention);
            String message = ((SpecificProductStore$Dialog.AvailableOnlyForPickup) state.getDialog()).getMessage();
            if (message == null) {
                message = this.f14413esjtqupxsv.getString(dxjokdxxww.available_only_for_pickup_product);
            }
            c1973zoijcleaow = new ru.myspar.catalog.impl.specific_product.presentation.zoijcleaow.C1973zoijcleaow(this.f14413esjtqupxsv.getString(s40.draadjrbmk.action_edit), string, message, this.f14413esjtqupxsv.getString(dxjokdxxww.action_cancel));
        } else if (dialog instanceof SpecificProductStore$Dialog.ProductNotFound) {
            String string2 = this.f14413esjtqupxsv.getString(dxjokdxxww.error);
            String message2 = ((SpecificProductStore$Dialog.ProductNotFound) state.getDialog()).getMessage();
            if (message2 == null) {
                message2 = this.f14413esjtqupxsv.getString(dxjokdxxww.product_not_found);
            }
            c1973zoijcleaow = new ru.myspar.catalog.impl.specific_product.presentation.zoijcleaow.C1973zoijcleaow(this.f14413esjtqupxsv.getString(dxjokdxxww.f76951ok), string2, message2, null, 8, null);
        } else if (zdlpuopuiu.eablkybsjg(dialog, SpecificProductStore$Dialog.ComboAddedToBasket.f85674zdlpuopuiu)) {
            c1973zoijcleaow = new ru.myspar.catalog.impl.specific_product.presentation.zoijcleaow.C1973zoijcleaow(this.f14413esjtqupxsv.getString(dxjokdxxww.specific_purchase_success_retry_return), this.f14413esjtqupxsv.getString(dxjokdxxww.specific_purchase_success_retry_title), this.f14413esjtqupxsv.getString(dxjokdxxww.specific_purchase_success_retry_subtitle), this.f14413esjtqupxsv.getString(dxjokdxxww.action_close));
        }
        return new ru.myspar.catalog.impl.specific_product.presentation.zoijcleaow(iobyxmoadgVar, z13, c1973zoijcleaow);
    }
}
