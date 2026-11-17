package ks0;

import b31.gxszxtbevo;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.models.measure_type.MeasureType;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zoijcleaow {
    public static final int iobyxmoadg(MeasureType measureType) {
        zdlpuopuiu.btonecajqb(measureType, "<this>");
        if (measureType instanceof MeasureType.WEIGHT) {
            return z11.iobyxmoadg.proloyalty_measure_weight_value;
        }
        if (measureType instanceof MeasureType.AMOUNT) {
            return z11.iobyxmoadg.proloyalty_measure_amount_value;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int ppxfxbqfkf(MeasureType measureType, boolean z13) {
        zdlpuopuiu.btonecajqb(measureType, "<this>");
        if (measureType instanceof MeasureType.WEIGHT) {
            return z13 ? z11.iobyxmoadg.proloyalty_measure_per_100_value : iobyxmoadg(measureType);
        }
        if (measureType instanceof MeasureType.AMOUNT) {
            return iobyxmoadg(measureType);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int zoijcleaow(MeasureType measureType, boolean z13, js0.zoijcleaow counterStyle) {
        zdlpuopuiu.btonecajqb(measureType, "<this>");
        zdlpuopuiu.btonecajqb(counterStyle, "counterStyle");
        if (counterStyle == js0.zoijcleaow.PRICE_AND_AMOUNT) {
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
