package js0;

import modern.payments.ecomAndroid.util.networkErrorHandler.impl.ApiErrorHandlerImpl;
import ru.myspar.proloyalty.common.view.counter.model.CounterModel;
import ru.myspar.proloyalty.common.view.counter.model.Price;
import ru.myspar.proloyalty.core.domain.models.ColorsUiModel;
import ru.myspar.proloyalty.core.models.measure_type.MeasureType;

/* JADX INFO: loaded from: classes5.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final CounterModel f52263iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final CounterModel f52264zoijcleaow;

    static {
        Price price = new Price("649", "90", 649.9d);
        Price price2 = new Price(ApiErrorHandlerImpl.ERROR_CODE_UNAVAILABLE, "90", 999.9d);
        MeasureType.WEIGHT weight = new MeasureType.WEIGHT(1.0d, 0.1d, 0.1d);
        ColorsUiModel.Hex hex = new ColorsUiModel.Hex(new ColorsUiModel.Hex.Tints("#15b742", "#5BCD7B", "#FFFFFF", "#D0F1D9", "#E8F8EC", null, null, 96, null), new ColorsUiModel.Hex.Tints("#15b742", "#5BCD7B", "#FFFFFF", "#D0F1D9", "#E8F8EC", null, null, 96, null));
        Double dValueOf = Double.valueOf(0.57d);
        f52263iobyxmoadg = new CounterModel(false, true, false, price, price2, dValueOf, false, 0.0d, false, weight, null, null, false, hex, 7424, null);
        f52264zoijcleaow = new CounterModel(false, true, true, new Price("649", "90", 649.9d), null, dValueOf, false, 1.1d, true, new MeasureType.WEIGHT(1.0d, 0.1d, 0.1d), null, null, false, new ColorsUiModel.Hex(new ColorsUiModel.Hex.Tints("#15b742", "#5BCD7B", "#FFFFFF", "#D0F1D9", "#E8F8EC", null, null, 96, null), new ColorsUiModel.Hex.Tints("#15b742", "#5BCD7B", "#FFFFFF", "#D0F1D9", "#E8F8EC", null, null, 96, null)), 7168, null);
    }

    public static final CounterModel iobyxmoadg() {
        return f52264zoijcleaow;
    }
}
