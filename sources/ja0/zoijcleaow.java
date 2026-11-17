package ja0;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import ha0.dxjokdxxww;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.vdvldrhtss;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.common.view.counter.model.CounterModel;
import ru.myspar.common.view.product.model.product.ProductUiModel;
import ru.myspar.core.domain.models.BaseProduct;
import ru.myspar.core.domain.models.LoadingBase;
import ru.myspar.core.domain.models.product.Product;
import ru.myspar.favorites.impl.domain.store.State;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow implements draadjrbmk {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final d60.iobyxmoadg f50928jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final pb0.zoijcleaow f50929yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final ja0.iobyxmoadg f50930zdlpuopuiu;

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

    public zoijcleaow(ja0.iobyxmoadg favoriteFilterUiMapper, pb0.zoijcleaow productUiModelMapper, d60.iobyxmoadg resourcesManager) {
        zdlpuopuiu.btonecajqb(favoriteFilterUiMapper, "favoriteFilterUiMapper");
        zdlpuopuiu.btonecajqb(productUiModelMapper, "productUiModelMapper");
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        this.f50930zdlpuopuiu = favoriteFilterUiMapper;
        this.f50929yggfygwlhe = productUiModelMapper;
        this.f50928jyumaefscl = resourcesManager;
    }

    @Override // tg.draadjrbmk
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public dxjokdxxww invoke(State state) {
        List listWflxmlrfwp;
        Object c1168zoijcleaow;
        zdlpuopuiu.btonecajqb(state, "state");
        List<BaseProduct> productList = state.getProducts().getProductList();
        if (productList != null) {
            listWflxmlrfwp = new ArrayList(jyumaefscl.cqumvgiudr(productList, 10));
            for (BaseProduct baseProduct : productList) {
                if (baseProduct instanceof LoadingBase) {
                    c1168zoijcleaow = ka0.zoijcleaow.iobyxmoadg.f54353iobyxmoadg;
                } else if (baseProduct instanceof Product) {
                    ProductUiModel productUiModelPpxfxbqfkf = this.f50929yggfygwlhe.ppxfxbqfkf((Product) baseProduct, state.getProductDataList(), state.getDeliveryCode(), true, false, false, (64 & 64) != 0 ? null : null, new iobyxmoadg(this.f50928jyumaefscl));
                    if (zdlpuopuiu.eablkybsjg(productUiModelPpxfxbqfkf.getId(), state.getCounterMessageProductId())) {
                        CounterModel counterModel = productUiModelPpxfxbqfkf.getCounterModel();
                        productUiModelPpxfxbqfkf = productUiModelPpxfxbqfkf.lqeggnwhkg(((-1025) & 1) != 0 ? productUiModelPpxfxbqfkf.id : null, ((-1025) & 2) != 0 ? productUiModelPpxfxbqfkf.name : null, ((-1025) & 4) != 0 ? productUiModelPpxfxbqfkf.article : null, ((-1025) & 8) != 0 ? productUiModelPpxfxbqfkf.isProductWithZeroPrice : false, ((-1025) & 16) != 0 ? productUiModelPpxfxbqfkf.price : 0.0d, ((-1025) & 32) != 0 ? productUiModelPpxfxbqfkf.oldPrice : null, ((-1025) & 64) != 0 ? productUiModelPpxfxbqfkf.discount : null, ((-1025) & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? productUiModelPpxfxbqfkf.discountString : null, ((-1025) & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? productUiModelPpxfxbqfkf.hasDiscount : false, ((-1025) & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? productUiModelPpxfxbqfkf.isDispPer100 : false, ((-1025) & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? productUiModelPpxfxbqfkf.measureTypeModel : null, ((-1025) & 2048) != 0 ? productUiModelPpxfxbqfkf.avgWeight : null, ((-1025) & 4096) != 0 ? productUiModelPpxfxbqfkf.isFavorite : false, ((-1025) & 8192) != 0 ? productUiModelPpxfxbqfkf.favoriteEnabledState : false, ((-1025) & 16384) != 0 ? productUiModelPpxfxbqfkf.inCart : false, ((-1025) & 32768) != 0 ? productUiModelPpxfxbqfkf.photoUrl : null, ((-1025) & 65536) != 0 ? productUiModelPpxfxbqfkf.photoUrls : null, ((-1025) & 131072) != 0 ? productUiModelPpxfxbqfkf.isMultiPhotos : false, ((-1025) & 262144) != 0 ? productUiModelPpxfxbqfkf.fats : null, ((-1025) & 524288) != 0 ? productUiModelPpxfxbqfkf.carbs : null, ((-1025) & 1048576) != 0 ? productUiModelPpxfxbqfkf.protein : null, ((-1025) & 2097152) != 0 ? productUiModelPpxfxbqfkf.energy : null, ((-1025) & 4194304) != 0 ? productUiModelPpxfxbqfkf.params : null, ((-1025) & 8388608) != 0 ? productUiModelPpxfxbqfkf.description : null, ((-1025) & 16777216) != 0 ? productUiModelPpxfxbqfkf.chemical : null, ((-1025) & 33554432) != 0 ? productUiModelPpxfxbqfkf.buyState : null, ((-1025) & 67108864) != 0 ? productUiModelPpxfxbqfkf.stickers : null, ((-1025) & 134217728) != 0 ? productUiModelPpxfxbqfkf.hidePrice : false, ((-1025) & 268435456) != 0 ? productUiModelPpxfxbqfkf.rating : null, ((-1025) & 536870912) != 0 ? productUiModelPpxfxbqfkf.reviewsCount : 0, ((-1025) & 1073741824) != 0 ? productUiModelPpxfxbqfkf.basketQuantity : null, ((-1025) & Integer.MIN_VALUE) != 0 ? productUiModelPpxfxbqfkf.isPmProduct : false, (16777215 & 1) != 0 ? productUiModelPpxfxbqfkf.video : null, (16777215 & 2) != 0 ? productUiModelPpxfxbqfkf.isRatingFeatureEnabled : false, (16777215 & 4) != 0 ? productUiModelPpxfxbqfkf.isPurchaseListsFeatureEnabled : false, (16777215 & 8) != 0 ? productUiModelPpxfxbqfkf.country : null, (16777215 & 16) != 0 ? productUiModelPpxfxbqfkf.region : null, (16777215 & 32) != 0 ? productUiModelPpxfxbqfkf.countryFlagEmoji : null, (16777215 & 64) != 0 ? productUiModelPpxfxbqfkf.type : null, (16777215 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? productUiModelPpxfxbqfkf.kind : null, (16777215 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? productUiModelPpxfxbqfkf.grape : null, (16777215 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? productUiModelPpxfxbqfkf.standart : null, (16777215 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? productUiModelPpxfxbqfkf.countryMapIcon : null, (16777215 & 2048) != 0 ? productUiModelPpxfxbqfkf.tasting : null, (16777215 & 4096) != 0 ? productUiModelPpxfxbqfkf.styling : null, (16777215 & 8192) != 0 ? productUiModelPpxfxbqfkf.button : null, (16777215 & 16384) != 0 ? productUiModelPpxfxbqfkf.hints : null, (16777215 & 32768) != 0 ? productUiModelPpxfxbqfkf.colorsUiModel : null, (16777215 & 65536) != 0 ? productUiModelPpxfxbqfkf.counterModel : counterModel.zoijcleaow((10235 & 1) != 0 ? counterModel.isLoading : false, (10235 & 2) != 0 ? counterModel.isAvailableToBuy : false, (10235 & 4) != 0 ? counterModel.isExpand : state.getExpandCounter(), (10235 & 8) != 0 ? counterModel.priceModel : null, (10235 & 16) != 0 ? counterModel.oldPriceModel : null, (10235 & 32) != 0 ? counterModel.avgWeight : null, (10235 & 64) != 0 ? counterModel.isDispPer100 : false, (10235 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? counterModel.quantity : 0.0d, (10235 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? counterModel.isMeasureTypeSwitchable : false, (10235 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? counterModel.measureType : null, (10235 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? counterModel.productLimitText : null, (10235 & 2048) != 0 ? counterModel.message : state.getCounterMessage(), (10235 & 4096) != 0 ? counterModel.autoHideMessage : state.getAutoHideCounterMessage(), (10235 & 8192) != 0 ? counterModel.colorsModel : null), (16777215 & 131072) != 0 ? productUiModelPpxfxbqfkf.deliveryCode : null, (16777215 & 262144) != 0 ? productUiModelPpxfxbqfkf.vivino : null, (16777215 & 524288) != 0 ? productUiModelPpxfxbqfkf.limits : null, (16777215 & 1048576) != 0 ? productUiModelPpxfxbqfkf.availabilityModel : null, (16777215 & 2097152) != 0 ? productUiModelPpxfxbqfkf.productVariants : null, (16777215 & 4194304) != 0 ? productUiModelPpxfxbqfkf.isSelected : null, (16777215 & 8388608) != 0 ? productUiModelPpxfxbqfkf.adv : null);
                    }
                    c1168zoijcleaow = new ka0.zoijcleaow.C1168zoijcleaow(productUiModelPpxfxbqfkf);
                } else {
                    c1168zoijcleaow = ka0.zoijcleaow.iobyxmoadg.f54353iobyxmoadg;
                }
                listWflxmlrfwp.add(c1168zoijcleaow);
            }
        } else {
            listWflxmlrfwp = null;
        }
        if (listWflxmlrfwp == null) {
            listWflxmlrfwp = jyumaefscl.wflxmlrfwp();
        }
        List list = listWflxmlrfwp;
        ja0.iobyxmoadg iobyxmoadgVar = this.f50930zdlpuopuiu;
        List favoriteFilterSections = state.getProducts().getFavoriteFilterSections();
        if (favoriteFilterSections == null) {
            favoriteFilterSections = jyumaefscl.wflxmlrfwp();
        }
        List<ka0.iobyxmoadg> listInvoke = iobyxmoadgVar.invoke(favoriteFilterSections);
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(listInvoke, 10));
        for (ka0.iobyxmoadg iobyxmoadgVar2 : listInvoke) {
            arrayList.add(ka0.iobyxmoadg.zoijcleaow(iobyxmoadgVar2, null, null, zdlpuopuiu.eablkybsjg(iobyxmoadgVar2.ppxfxbqfkf(), state.getSelectedFilterId()), 3, null));
        }
        return new dxjokdxxww(list, arrayList, state.getIsFilterVisible(), state.getWarningState(), state.getIsRefreshLayoutLoading(), state.getIsFullScreenLoading(), state.getCurrentPage());
    }
}
