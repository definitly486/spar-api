package rt;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.models.measure_type.MeasureType;
import s40.gxszxtbevo;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zoijcleaow {
    public static final int iobyxmoadg(MeasureType measureType) {
        zdlpuopuiu.btonecajqb(measureType, "<this>");
        if (measureType instanceof MeasureType.WEIGHT) {
            return u30.iobyxmoadg.measure_weight_value;
        }
        if (measureType instanceof MeasureType.AMOUNT) {
            return u30.iobyxmoadg.measure_amount_value;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int ppxfxbqfkf(MeasureType measureType, boolean z13) {
        zdlpuopuiu.btonecajqb(measureType, "<this>");
        if (measureType instanceof MeasureType.WEIGHT) {
            return z13 ? u30.iobyxmoadg.measure_per_100_value : iobyxmoadg(measureType);
        }
        if (measureType instanceof MeasureType.AMOUNT) {
            return iobyxmoadg(measureType);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int zoijcleaow(MeasureType measureType, boolean z13, qt.zoijcleaow counterStyle) {
        zdlpuopuiu.btonecajqb(measureType, "<this>");
        zdlpuopuiu.btonecajqb(counterStyle, "counterStyle");
        if (counterStyle == qt.zoijcleaow.PRICE_AND_AMOUNT) {
            return gxszxtbevo.ic_rub_one;
        }
        if (measureType instanceof MeasureType.WEIGHT) {
            return z13 ? gxszxtbevo.ic_rub_per_100g : gxszxtbevo.ic_rub_per_kg;
        }
        if (measureType instanceof MeasureType.AMOUNT) {
            return gxszxtbevo.ic_rub_per_piece;
        }
        throw new NoWhenBranchMatchedException();
    }
}
