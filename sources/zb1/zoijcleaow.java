package zb1;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.common.view.counter.model.CounterModel;
import ru.myspar.proloyalty.common.view.product.model.product.ProductUiModel;
import ru.myspar.proloyalty.core.domain.handler.ProductMessageType;
import ru.myspar.proloyalty.core.domain.models.cart.ProductUIData;
import ru.myspar.proloyalty.core.models.measure_type.MeasureType;
import ru.myspar.proloyalty.core.models.measure_type.MeasureTypeModel;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow implements rgvfuqvkyq {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public static final int f129512zdlpuopuiu = 0;

    @Override // tg.rgvfuqvkyq
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public ProductUiModel invoke(ProductUiModel uiModel, ProductUIData productUIData) {
        MeasureType originalMeasure;
        ProductMessageType messageType;
        zdlpuopuiu.btonecajqb(uiModel, "uiModel");
        if (productUIData == null || (originalMeasure = productUIData.getMeasureType()) == null) {
            originalMeasure = uiModel.getMeasureTypeModel().getOriginalMeasure();
        }
        MeasureTypeModel measureTypeModelPpxfxbqfkf = MeasureTypeModel.ppxfxbqfkf(uiModel.getMeasureTypeModel(), null, null, originalMeasure, 3, null);
        boolean z13 = productUIData != null;
        double quantity = productUIData != null ? productUIData.getQuantity() : 0.0d;
        CounterModel counterModel = uiModel.getCounterModel();
        return uiModel.lqeggnwhkg(((-1025) & 1) != 0 ? uiModel.id : null, ((-1025) & 2) != 0 ? uiModel.name : null, ((-1025) & 4) != 0 ? uiModel.article : null, ((-1025) & 8) != 0 ? uiModel.isProductWithZeroPrice : false, ((-1025) & 16) != 0 ? uiModel.price : 0.0d, ((-1025) & 32) != 0 ? uiModel.oldPrice : null, ((-1025) & 64) != 0 ? uiModel.discount : null, ((-1025) & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? uiModel.discountString : null, ((-1025) & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? uiModel.hasDiscount : false, ((-1025) & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? uiModel.isDispPer100 : false, ((-1025) & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? uiModel.measureTypeModel : measureTypeModelPpxfxbqfkf, ((-1025) & 2048) != 0 ? uiModel.avgWeight : null, ((-1025) & 4096) != 0 ? uiModel.isFavorite : false, ((-1025) & 8192) != 0 ? uiModel.favoriteEnabledState : false, ((-1025) & 16384) != 0 ? uiModel.inCart : z13, ((-1025) & 32768) != 0 ? uiModel.photoUrl : null, ((-1025) & 65536) != 0 ? uiModel.photoUrls : null, ((-1025) & 131072) != 0 ? uiModel.isMultiPhotos : false, ((-1025) & 262144) != 0 ? uiModel.fats : null, ((-1025) & 524288) != 0 ? uiModel.carbs : null, ((-1025) & 1048576) != 0 ? uiModel.protein : null, ((-1025) & 2097152) != 0 ? uiModel.energy : null, ((-1025) & 4194304) != 0 ? uiModel.params : null, ((-1025) & 8388608) != 0 ? uiModel.description : null, ((-1025) & 16777216) != 0 ? uiModel.chemical : null, ((-1025) & 33554432) != 0 ? uiModel.buyState : null, ((-1025) & 67108864) != 0 ? uiModel.stickers : null, ((-1025) & 134217728) != 0 ? uiModel.hidePrice : false, ((-1025) & 268435456) != 0 ? uiModel.rating : null, ((-1025) & 536870912) != 0 ? uiModel.reviewsCount : 0, ((-1025) & 1073741824) != 0 ? uiModel.basketQuantity : null, ((-1025) & Integer.MIN_VALUE) != 0 ? uiModel.isPmProduct : false, (16777215 & 1) != 0 ? uiModel.video : null, (16777215 & 2) != 0 ? uiModel.isRatingFeatureEnabled : false, (16777215 & 4) != 0 ? uiModel.isPurchaseListsFeatureEnabled : false, (16777215 & 8) != 0 ? uiModel.country : null, (16777215 & 16) != 0 ? uiModel.region : null, (16777215 & 32) != 0 ? uiModel.countryFlagEmoji : null, (16777215 & 64) != 0 ? uiModel.type : null, (16777215 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? uiModel.kind : null, (16777215 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? uiModel.grape : null, (16777215 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? uiModel.standart : null, (16777215 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? uiModel.countryMapIcon : null, (16777215 & 2048) != 0 ? uiModel.tasting : null, (16777215 & 4096) != 0 ? uiModel.styling : null, (16777215 & 8192) != 0 ? uiModel.button : null, (16777215 & 16384) != 0 ? uiModel.hints : null, (16777215 & 32768) != 0 ? uiModel.colorsUiModel : null, (16777215 & 65536) != 0 ? uiModel.counterModel : counterModel.zoijcleaow((14714 & 1) != 0 ? counterModel.isLoading : productUIData != null ? productUIData.getIsLoading() : false, (14714 & 2) != 0 ? counterModel.isAvailableToBuy : false, (14714 & 4) != 0 ? counterModel.isExpand : productUIData != null, (14714 & 8) != 0 ? counterModel.priceModel : null, (14714 & 16) != 0 ? counterModel.oldPriceModel : null, (14714 & 32) != 0 ? counterModel.avgWeight : null, (14714 & 64) != 0 ? counterModel.isDispPer100 : false, (14714 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? counterModel.quantity : quantity, (14714 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? counterModel.isMeasureTypeSwitchable : false, (14714 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? counterModel.measureType : measureTypeModelPpxfxbqfkf.getCurrentMeasure(), (14714 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? counterModel.productLimitText : (productUIData == null || (messageType = productUIData.getMessageType()) == null) ? null : is0.iobyxmoadg.ppxfxbqfkf(messageType, quantity, measureTypeModelPpxfxbqfkf.getCurrentMeasure()), (14714 & 2048) != 0 ? counterModel.message : null, (14714 & 4096) != 0 ? counterModel.autoHideMessage : false, (14714 & 8192) != 0 ? counterModel.colorsModel : null), (16777215 & 131072) != 0 ? uiModel.deliveryCode : null, (16777215 & 262144) != 0 ? uiModel.vivino : null, (16777215 & 524288) != 0 ? uiModel.limits : null, (16777215 & 1048576) != 0 ? uiModel.availabilityModel : null, (16777215 & 2097152) != 0 ? uiModel.productVariants : null, (16777215 & 4194304) != 0 ? uiModel.isSelected : null, (16777215 & 8388608) != 0 ? uiModel.adv : null);
    }
}
