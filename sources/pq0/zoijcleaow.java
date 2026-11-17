package pq0;

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
import n91.ppxfxbqfkf;
import q11.dxjokdxxww;
import qq0.eablkybsjg;
import qq0.gxszxtbevo;
import qq0.wkgbmnqykc;
import ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.SpecificProductStore$Dialog;
import ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.State;
import ru.myspar.proloyalty.common.view.counter.model.CounterModel;
import ru.myspar.proloyalty.common.view.hint.model.HintUiModel;
import ru.myspar.proloyalty.common.view.product.model.product.ProductUiModel;
import ru.myspar.proloyalty.core.domain.models.ColorsModel;
import ru.myspar.proloyalty.core.domain.models.ColorsUiModel;
import ru.myspar.proloyalty.core.domain.models.VivinoRatingUiModel;
import ru.myspar.proloyalty.core.domain.models.product.Product;
import ru.myspar.proloyalty.core.domain.models.recommendations.Recommendation;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;
import ru.myspar.proloyalty.core.models.measure_type.MeasureTypeModel;
import ru.myspar.proloyalty.rate.review.api.model.ReviewItem;
import ru.myspar.proloyalty.rate.review.api.model.ReviewUser;
import ru.myspar.proloyalty.rate.review.api.model.Reviews;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;
import vk0.lqeggnwhkg;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow implements draadjrbmk {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final q41.iobyxmoadg f77143cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final ppxfxbqfkf f77144esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final xr0.zoijcleaow f77145iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final pq0.iobyxmoadg f77146jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final n91.iobyxmoadg f77147yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final o91.zoijcleaow f77148zdlpuopuiu;

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

    /* JADX INFO: renamed from: pq0.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    /* synthetic */ class C1707zoijcleaow extends vdvldrhtss implements rgvfuqvkyq {
        C1707zoijcleaow(Object obj) {
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

    public zoijcleaow(o91.zoijcleaow productUiModelMapper, n91.iobyxmoadg colorsUiModelMapper, pq0.iobyxmoadg productToParamListMapper, xr0.zoijcleaow dateUtils, q41.iobyxmoadg resources, ppxfxbqfkf comboSetUiMapper) {
        zdlpuopuiu.btonecajqb(productUiModelMapper, "productUiModelMapper");
        zdlpuopuiu.btonecajqb(colorsUiModelMapper, "colorsUiModelMapper");
        zdlpuopuiu.btonecajqb(productToParamListMapper, "productToParamListMapper");
        zdlpuopuiu.btonecajqb(dateUtils, "dateUtils");
        zdlpuopuiu.btonecajqb(resources, "resources");
        zdlpuopuiu.btonecajqb(comboSetUiMapper, "comboSetUiMapper");
        this.f77148zdlpuopuiu = productUiModelMapper;
        this.f77147yggfygwlhe = colorsUiModelMapper;
        this.f77146jyumaefscl = productToParamListMapper;
        this.f77145iwizpuwonk = dateUtils;
        this.f77143cqumvgiudr = resources;
        this.f77144esjtqupxsv = comboSetUiMapper;
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
                arrayList2.add(this.f77148zdlpuopuiu.ppxfxbqfkf((Product) it.next(), list, deliveryCode, z13, z14, z15, (64 & 64) != 0 ? null : null, new C1707zoijcleaow(this.f77143cqumvgiudr)));
            }
            ArrayList arrayList3 = new ArrayList(jyumaefscl.cqumvgiudr(arrayList2, 10));
            for (ProductUiModel productUiModelLqeggnwhkg : arrayList2) {
                if (set.contains(productUiModelLqeggnwhkg.getId())) {
                    CounterModel counterModel = productUiModelLqeggnwhkg.getCounterModel();
                    productUiModelLqeggnwhkg = productUiModelLqeggnwhkg.lqeggnwhkg(((-1025) & 1) != 0 ? productUiModelLqeggnwhkg.id : null, ((-1025) & 2) != 0 ? productUiModelLqeggnwhkg.name : null, ((-1025) & 4) != 0 ? productUiModelLqeggnwhkg.article : null, ((-1025) & 8) != 0 ? productUiModelLqeggnwhkg.isProductWithZeroPrice : false, ((-1025) & 16) != 0 ? productUiModelLqeggnwhkg.price : 0.0d, ((-1025) & 32) != 0 ? productUiModelLqeggnwhkg.oldPrice : null, ((-1025) & 64) != 0 ? productUiModelLqeggnwhkg.discount : null, ((-1025) & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? productUiModelLqeggnwhkg.discountString : null, ((-1025) & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? productUiModelLqeggnwhkg.hasDiscount : false, ((-1025) & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? productUiModelLqeggnwhkg.isDispPer100 : false, ((-1025) & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? productUiModelLqeggnwhkg.measureTypeModel : null, ((-1025) & 2048) != 0 ? productUiModelLqeggnwhkg.avgWeight : null, ((-1025) & 4096) != 0 ? productUiModelLqeggnwhkg.isFavorite : false, ((-1025) & 8192) != 0 ? productUiModelLqeggnwhkg.favoriteEnabledState : false, ((-1025) & 16384) != 0 ? productUiModelLqeggnwhkg.inCart : false, ((-1025) & 32768) != 0 ? productUiModelLqeggnwhkg.photoUrl : null, ((-1025) & 65536) != 0 ? productUiModelLqeggnwhkg.photoUrls : null, ((-1025) & 131072) != 0 ? productUiModelLqeggnwhkg.isMultiPhotos : false, ((-1025) & 262144) != 0 ? productUiModelLqeggnwhkg.fats : null, ((-1025) & 524288) != 0 ? productUiModelLqeggnwhkg.carbs : null, ((-1025) & 1048576) != 0 ? productUiModelLqeggnwhkg.protein : null, ((-1025) & 2097152) != 0 ? productUiModelLqeggnwhkg.energy : null, ((-1025) & 4194304) != 0 ? productUiModelLqeggnwhkg.params : null, ((-1025) & 8388608) != 0 ? productUiModelLqeggnwhkg.description : null, ((-1025) & 16777216) != 0 ? productUiModelLqeggnwhkg.chemical : null, ((-1025) & 33554432) != 0 ? productUiModelLqeggnwhkg.buyState : null, ((-1025) & 67108864) != 0 ? productUiModelLqeggnwhkg.stickers : null, ((-1025) & 134217728) != 0 ? productUiModelLqeggnwhkg.hidePrice : false, ((-1025) & 268435456) != 0 ? productUiModelLqeggnwhkg.rating : null, ((-1025) & 536870912) != 0 ? productUiModelLqeggnwhkg.reviewsCount : 0, ((-1025) & 1073741824) != 0 ? productUiModelLqeggnwhkg.basketQuantity : null, ((-1025) & Integer.MIN_VALUE) != 0 ? productUiModelLqeggnwhkg.isPmProduct : false, (16777215 & 1) != 0 ? productUiModelLqeggnwhkg.video : null, (16777215 & 2) != 0 ? productUiModelLqeggnwhkg.isRatingFeatureEnabled : false, (16777215 & 4) != 0 ? productUiModelLqeggnwhkg.isPurchaseListsFeatureEnabled : false, (16777215 & 8) != 0 ? productUiModelLqeggnwhkg.country : null, (16777215 & 16) != 0 ? productUiModelLqeggnwhkg.region : null, (16777215 & 32) != 0 ? productUiModelLqeggnwhkg.countryFlagEmoji : null, (16777215 & 64) != 0 ? productUiModelLqeggnwhkg.type : null, (16777215 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? productUiModelLqeggnwhkg.kind : null, (16777215 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? productUiModelLqeggnwhkg.grape : null, (16777215 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? productUiModelLqeggnwhkg.standart : null, (16777215 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? productUiModelLqeggnwhkg.countryMapIcon : null, (16777215 & 2048) != 0 ? productUiModelLqeggnwhkg.tasting : null, (16777215 & 4096) != 0 ? productUiModelLqeggnwhkg.styling : null, (16777215 & 8192) != 0 ? productUiModelLqeggnwhkg.button : null, (16777215 & 16384) != 0 ? productUiModelLqeggnwhkg.hints : null, (16777215 & 32768) != 0 ? productUiModelLqeggnwhkg.colorsUiModel : null, (16777215 & 65536) != 0 ? productUiModelLqeggnwhkg.counterModel : counterModel.zoijcleaow((14714 & 1) != 0 ? counterModel.isLoading : false, (14714 & 2) != 0 ? counterModel.isAvailableToBuy : false, (14714 & 4) != 0 ? counterModel.isExpand : true, (14714 & 8) != 0 ? counterModel.priceModel : null, (14714 & 16) != 0 ? counterModel.oldPriceModel : null, (14714 & 32) != 0 ? counterModel.avgWeight : null, (14714 & 64) != 0 ? counterModel.isDispPer100 : false, (14714 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? counterModel.quantity : 0.0d, (14714 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? counterModel.isMeasureTypeSwitchable : false, (14714 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? counterModel.measureType : null, (14714 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? counterModel.productLimitText : null, (14714 & 2048) != 0 ? counterModel.message : productUiModelLqeggnwhkg.getAvailabilityModel().gxszxtbevo(), (14714 & 4096) != 0 ? counterModel.autoHideMessage : !productUiModelLqeggnwhkg.getAvailabilityModel().getIsAvailableToBuy(), (14714 & 8192) != 0 ? counterModel.colorsModel : null), (16777215 & 131072) != 0 ? productUiModelLqeggnwhkg.deliveryCode : null, (16777215 & 262144) != 0 ? productUiModelLqeggnwhkg.vivino : null, (16777215 & 524288) != 0 ? productUiModelLqeggnwhkg.limits : null, (16777215 & 1048576) != 0 ? productUiModelLqeggnwhkg.availabilityModel : null, (16777215 & 2097152) != 0 ? productUiModelLqeggnwhkg.productVariants : null, (16777215 & 4194304) != 0 ? productUiModelLqeggnwhkg.isSelected : null, (16777215 & 8388608) != 0 ? productUiModelLqeggnwhkg.adv : null);
                }
                arrayList3.add(productUiModelLqeggnwhkg);
            }
            arrayList.add(new ot0.zoijcleaow(recommendationBlockId, arrayList3, title));
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
            String strEablkybsjg = this.f77145iwizpuwonk.eablkybsjg(reviewItem.getDate(), "dd MMMM yyyy");
            if (strEablkybsjg == null) {
                strEablkybsjg = "";
            }
            arrayList.add(new eablkybsjg(id2, user2, strEablkybsjg, reviewItem.getRating(), reviewItem.getComment()));
        }
        if (user.getIsCanEdit()) {
            numValueOf = Integer.valueOf(lqeggnwhkg.proloyalty_reviews_edit);
        } else if (user.getIsCanAdd()) {
            numValueOf = Integer.valueOf(lqeggnwhkg.proloyalty_reviews_add_new);
        }
        return new gxszxtbevo(iIntValue, arrayList, numValueOf);
    }

    private final qq0.iobyxmoadg iobyxmoadg(ProductUiModel productUiModel, boolean z13, boolean z14) {
        CounterModel counterModel = productUiModel.getCounterModel();
        if (z13) {
            counterModel = counterModel.zoijcleaow((14714 & 1) != 0 ? counterModel.isLoading : false, (14714 & 2) != 0 ? counterModel.isAvailableToBuy : false, (14714 & 4) != 0 ? counterModel.isExpand : true, (14714 & 8) != 0 ? counterModel.priceModel : null, (14714 & 16) != 0 ? counterModel.oldPriceModel : null, (14714 & 32) != 0 ? counterModel.avgWeight : null, (14714 & 64) != 0 ? counterModel.isDispPer100 : false, (14714 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? counterModel.quantity : 0.0d, (14714 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? counterModel.isMeasureTypeSwitchable : false, (14714 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? counterModel.measureType : null, (14714 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? counterModel.productLimitText : null, (14714 & 2048) != 0 ? counterModel.message : productUiModel.getAvailabilityModel().gxszxtbevo(), (14714 & 4096) != 0 ? counterModel.autoHideMessage : !productUiModel.getAvailabilityModel().getIsAvailableToBuy(), (14714 & 8192) != 0 ? counterModel.colorsModel : null);
        }
        MeasureTypeModel measureTypeModel = productUiModel.getMeasureTypeModel();
        if (!counterModel.getIsMeasureTypeSwitchable() || !counterModel.nufgyqmvbu() || productUiModel.getIsProductWithZeroPrice()) {
            measureTypeModel = null;
        }
        return new qq0.iobyxmoadg(counterModel, measureTypeModel, z14, productUiModel.getAvailabilityModel());
    }

    private final qq0.lqeggnwhkg lqeggnwhkg(ProductUiModel productUiModel) {
        StringBuilder sb3 = new StringBuilder();
        String countryFlagEmoji = productUiModel.getCountryFlagEmoji();
        if (countryFlagEmoji != null && !kcexrzcfyt.zfvoamnweg(countryFlagEmoji)) {
            sb3.append(" " + productUiModel.getCountryFlagEmoji() + "  ");
        }
        sb3.append(dxjokdxxww.zoijcleaow(productUiModel.getCountry(), productUiModel.getRegion(), null, 4, null));
        String string = sb3.toString();
        if (kcexrzcfyt.zfvoamnweg(productUiModel.getCountry()) && kcexrzcfyt.zfvoamnweg(productUiModel.getRegion())) {
            string = null;
        }
        List listPpxfxbqfkf = jyumaefscl.ppxfxbqfkf();
        if (!kcexrzcfyt.zfvoamnweg(productUiModel.getType()) || !kcexrzcfyt.zfvoamnweg(productUiModel.getKind())) {
            listPpxfxbqfkf.add(new qq0.lqeggnwhkg.iobyxmoadg(b31.gxszxtbevo.ic_glass_24, dxjokdxxww.zoijcleaow(productUiModel.getType(), productUiModel.getKind(), null, 4, null)));
        }
        if (!kcexrzcfyt.zfvoamnweg(productUiModel.getGrape())) {
            listPpxfxbqfkf.add(new qq0.lqeggnwhkg.iobyxmoadg(b31.gxszxtbevo.ic_grape_24, productUiModel.getGrape()));
        }
        if (!kcexrzcfyt.zfvoamnweg(productUiModel.getStandart())) {
            listPpxfxbqfkf.add(new qq0.lqeggnwhkg.iobyxmoadg(b31.gxszxtbevo.ic_marker_24, productUiModel.getStandart()));
        }
        qq0.lqeggnwhkg lqeggnwhkgVar = new qq0.lqeggnwhkg(string, jyumaefscl.iobyxmoadg(listPpxfxbqfkf));
        if (lqeggnwhkgVar.iobyxmoadg() == null && lqeggnwhkgVar.zoijcleaow().isEmpty()) {
            return null;
        }
        return lqeggnwhkgVar;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0020  */
    private final qq0.ppxfxbqfkf ppxfxbqfkf(ProductUiModel productUiModel) {
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
            listPpxfxbqfkf.add(wkgbmnqykc.iobyxmoadg.f80520iobyxmoadg);
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
            arrayList.add(ru.myspar.proloyalty.common.view.hint.model.iobyxmoadg.zoijcleaow((HintUiModel) it.next(), HintUiModel.iobyxmoadg.BIG));
        }
        List photoUrls = productUiModel.getPhotoUrls();
        List stickers = productUiModel.getStickers();
        if (stickers == null) {
            stickers = jyumaefscl.wflxmlrfwp();
        }
        return new qq0.ppxfxbqfkf(name, photoUrls, listIobyxmoadg, stickers, arrayList, string, productUiModel.getIsFavorite());
    }

    @Override // tg.draadjrbmk
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ru.myspar.proloyalty.catalog.impl.specific_product.presentation.ppxfxbqfkf invoke(State state) {
        ru.myspar.proloyalty.catalog.impl.specific_product.presentation.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar;
        List listEablkybsjg;
        List list;
        zdlpuopuiu.btonecajqb(state, "state");
        ru.myspar.proloyalty.catalog.impl.specific_product.presentation.ppxfxbqfkf.zoijcleaow zoijcleaowVar = null;
        if (state.getMainProduct() != null) {
            ColorsModel colorsModel = state.getMainProduct().getColorsModel();
            ColorsUiModel colorsUiModelIobyxmoadg = colorsModel != null ? this.f77147yggfygwlhe.iobyxmoadg(colorsModel) : null;
            ProductUiModel productUiModelPpxfxbqfkf = this.f77148zdlpuopuiu.ppxfxbqfkf(state.getMainProduct(), state.getProductDataList(), state.getDeliveryCode(), state.getIsRatingFeatureEnabled(), state.getIsPurchaseListsFeatureEnabled(), state.getIsVivinoFeatureEnabled(), (64 & 64) != 0 ? null : null, new iobyxmoadg(this.f77143cqumvgiudr));
            qq0.ppxfxbqfkf ppxfxbqfkfVarPpxfxbqfkf = ppxfxbqfkf(productUiModelPpxfxbqfkf);
            qq0.zoijcleaow zoijcleaowVar2 = new qq0.zoijcleaow(dxjokdxxww.wkgbmnqykc(productUiModelPpxfxbqfkf.getDescription()), dxjokdxxww.wkgbmnqykc(productUiModelPpxfxbqfkf.getStyling()), dxjokdxxww.wkgbmnqykc(productUiModelPpxfxbqfkf.getTasting()));
            qq0.lqeggnwhkg lqeggnwhkgVarLqeggnwhkg = lqeggnwhkg(productUiModelPpxfxbqfkf);
            List listInvoke = this.f77146jyumaefscl.invoke(state.getMainProduct());
            List comboSetList = state.getComboSetList();
            List listIobyxmoadg = (comboSetList == null || (list = (List) this.f77144esjtqupxsv.invoke(comboSetList)) == null) ? null : q11.zoijcleaow.iobyxmoadg(list);
            Reviews reviews = state.getReviews();
            gxszxtbevo gxszxtbevoVarGxszxtbevo = reviews != null ? gxszxtbevo(reviews, state.getMainProduct()) : null;
            Map recommendations = state.getRecommendations();
            if (recommendations != null) {
                listEablkybsjg = eablkybsjg(recommendations, state.getProductDataList(), state.getDeliveryCode(), state.getIsRatingFeatureEnabled(), state.getIsPurchaseListsFeatureEnabled(), state.getIsVivinoFeatureEnabled(), state.getExpandedProductIds());
            } else {
                listEablkybsjg = null;
            }
            qq0.iobyxmoadg iobyxmoadgVarIobyxmoadg = iobyxmoadg(productUiModelPpxfxbqfkf, state.getExpandedProductIds().contains(state.getMainProduct().getId()), state.getPayload().getIsOrderEdit());
            String id2 = productUiModelPpxfxbqfkf.getId();
            String preview = productUiModelPpxfxbqfkf.getVideo().getPreview();
            iobyxmoadgVar = new ru.myspar.proloyalty.catalog.impl.specific_product.presentation.ppxfxbqfkf.iobyxmoadg(id2, colorsUiModelIobyxmoadg, ppxfxbqfkfVarPpxfxbqfkf, productUiModelPpxfxbqfkf.getProductVariants(), lqeggnwhkgVarLqeggnwhkg, zoijcleaowVar2, listInvoke, !kcexrzcfyt.zfvoamnweg(preview) ? preview : null, productUiModelPpxfxbqfkf.getVideo().getAdv(), listIobyxmoadg, gxszxtbevoVarGxszxtbevo, listEablkybsjg, iobyxmoadgVarIobyxmoadg);
        } else {
            iobyxmoadgVar = null;
        }
        boolean z13 = state.getMainProduct() == null || state.getIsLoading();
        SpecificProductStore$Dialog dialog = state.getDialog();
        if (dialog instanceof SpecificProductStore$Dialog.ProductNotFound) {
            String string = this.f77143cqumvgiudr.getString(lqeggnwhkg.proloyalty_error);
            String message = ((SpecificProductStore$Dialog.ProductNotFound) state.getDialog()).getMessage();
            if (message == null) {
                message = this.f77143cqumvgiudr.getString(lqeggnwhkg.proloyalty_product_not_found);
            }
            zoijcleaowVar = new ru.myspar.proloyalty.catalog.impl.specific_product.presentation.ppxfxbqfkf.zoijcleaow(this.f77143cqumvgiudr.getString(lqeggnwhkg.proloyalty_ok), string, message, null, 8, null);
        } else if (zdlpuopuiu.eablkybsjg(dialog, SpecificProductStore$Dialog.ComboAddedToBasket.f93404zdlpuopuiu)) {
            zoijcleaowVar = new ru.myspar.proloyalty.catalog.impl.specific_product.presentation.ppxfxbqfkf.zoijcleaow(this.f77143cqumvgiudr.getString(lqeggnwhkg.proloyalty_specific_purchase_success_retry_return), this.f77143cqumvgiudr.getString(lqeggnwhkg.proloyalty_specific_purchase_success_retry_title), this.f77143cqumvgiudr.getString(lqeggnwhkg.proloyalty_specific_purchase_success_retry_subtitle), this.f77143cqumvgiudr.getString(lqeggnwhkg.proloyalty_action_close));
        }
        return new ru.myspar.proloyalty.catalog.impl.specific_product.presentation.ppxfxbqfkf(iobyxmoadgVar, z13, zoijcleaowVar);
    }
}
