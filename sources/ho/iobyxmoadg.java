package ho;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import pb0.zoijcleaow;
import ru.myspar.common.view.product.model.product.ProductUiModel;
import ru.myspar.core.domain.models.product.Product;
import ru.myspar.core.models.delivery.DeliveryCode;
import ru.myspar.core.models.measure_type.MeasureType;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes3.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final int f40827zoijcleaow = zoijcleaow.f76305eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final zoijcleaow f40828iobyxmoadg;

    public iobyxmoadg(zoijcleaow productUiModelMapper) {
        zdlpuopuiu.btonecajqb(productUiModelMapper, "productUiModelMapper");
        this.f40828iobyxmoadg = productUiModelMapper;
    }

    private final double iobyxmoadg(MeasureType measureType) {
        return measureType.getBasketDefault();
    }

    private final io.iobyxmoadg ppxfxbqfkf(ProductUiModel productUiModel) {
        String id2 = productUiModel.getId();
        List hints = productUiModel.getHints();
        String photoUrl = productUiModel.getPhotoUrl();
        Integer discount = productUiModel.getDiscount();
        return new io.iobyxmoadg(id2, hints, photoUrl, discount != null ? discount.intValue() : 0, productUiModel.getName(), iobyxmoadg(productUiModel.getMeasureTypeModel().getCurrentMeasure()), zoijcleaow(productUiModel.getMeasureTypeModel().getCurrentMeasure(), productUiModel.getIsDispPer100()), productUiModel.getPrice(), productUiModel.getOldPrice(), null, UserVerificationMethods.USER_VERIFY_NONE, null);
    }

    private final io.iobyxmoadg.zoijcleaow zoijcleaow(MeasureType measureType, boolean z13) {
        if (measureType instanceof MeasureType.AMOUNT) {
            return io.iobyxmoadg.zoijcleaow.AMOUNT;
        }
        if (measureType instanceof MeasureType.WEIGHT) {
            return z13 ? io.iobyxmoadg.zoijcleaow.WEIGHT_PER_100 : io.iobyxmoadg.zoijcleaow.WEIGHT;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final io.iobyxmoadg wkgbmnqykc(Product products, DeliveryCode deliveryCode, rgvfuqvkyq getStringRes) {
        zdlpuopuiu.btonecajqb(products, "products");
        zdlpuopuiu.btonecajqb(getStringRes, "getStringRes");
        return ppxfxbqfkf(this.f40828iobyxmoadg.ppxfxbqfkf(products, null, deliveryCode, true, true, false, (64 & 64) != 0 ? null : null, getStringRes));
    }
}
