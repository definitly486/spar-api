package rm0;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import o91.zoijcleaow;
import ru.myspar.proloyalty.common.view.product.model.product.ProductUiModel;
import ru.myspar.proloyalty.core.domain.models.product.Product;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;
import ru.myspar.proloyalty.core.models.measure_type.MeasureType;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final int f83138zoijcleaow = zoijcleaow.f72372eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final zoijcleaow f83139iobyxmoadg;

    public iobyxmoadg(zoijcleaow productUiModelMapper) {
        zdlpuopuiu.btonecajqb(productUiModelMapper, "productUiModelMapper");
        this.f83139iobyxmoadg = productUiModelMapper;
    }

    private final double iobyxmoadg(MeasureType measureType) {
        return measureType.getBasketDefault();
    }

    private final sm0.iobyxmoadg ppxfxbqfkf(ProductUiModel productUiModel) {
        String id2 = productUiModel.getId();
        List hints = productUiModel.getHints();
        String photoUrl = productUiModel.getPhotoUrl();
        Integer discount = productUiModel.getDiscount();
        return new sm0.iobyxmoadg(id2, hints, photoUrl, discount != null ? discount.intValue() : 0, productUiModel.getName(), iobyxmoadg(productUiModel.getMeasureTypeModel().getCurrentMeasure()), zoijcleaow(productUiModel.getMeasureTypeModel().getCurrentMeasure(), productUiModel.getIsDispPer100()), productUiModel.getPrice(), productUiModel.getOldPrice(), null, UserVerificationMethods.USER_VERIFY_NONE, null);
    }

    private final sm0.iobyxmoadg.zoijcleaow zoijcleaow(MeasureType measureType, boolean z13) {
        if (measureType instanceof MeasureType.AMOUNT) {
            return sm0.iobyxmoadg.zoijcleaow.AMOUNT;
        }
        if (measureType instanceof MeasureType.WEIGHT) {
            return z13 ? sm0.iobyxmoadg.zoijcleaow.WEIGHT_PER_100 : sm0.iobyxmoadg.zoijcleaow.WEIGHT;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final sm0.iobyxmoadg wkgbmnqykc(Product products, DeliveryCode deliveryCode, rgvfuqvkyq getStringRes) {
        zdlpuopuiu.btonecajqb(products, "products");
        zdlpuopuiu.btonecajqb(getStringRes, "getStringRes");
        return ppxfxbqfkf(this.f83139iobyxmoadg.ppxfxbqfkf(products, null, deliveryCode, true, true, false, (64 & 64) != 0 ? null : null, getStringRes));
    }
}
