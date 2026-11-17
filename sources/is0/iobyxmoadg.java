package is0;

import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.tzroggbefp;
import kotlin.jvm.internal.zdlpuopuiu;
import ks0.ppxfxbqfkf;
import ru.myspar.proloyalty.common.view.counter.model.CounterModel;
import ru.myspar.proloyalty.core.domain.handler.ProductMessageType;
import ru.myspar.proloyalty.core.domain.models.ColorsUiModel;
import ru.myspar.proloyalty.core.models.measure_type.MeasureType;

/* JADX INFO: loaded from: classes5.dex */
public abstract class iobyxmoadg {
    public static final CounterModel iobyxmoadg(boolean z13, boolean z14, boolean z15, double d13, Double d14, Double d15, boolean z16, double d16, boolean z17, MeasureType measureType, ProductMessageType productMessageType, ColorsUiModel.Hex hex) {
        zdlpuopuiu.btonecajqb(measureType, "measureType");
        ppxfxbqfkf ppxfxbqfkfVar = ppxfxbqfkf.f60512iobyxmoadg;
        return new CounterModel(z15, z13, z14, ppxfxbqfkf.wkgbmnqykc(ppxfxbqfkfVar, d13, 0, false, 6, null), d14 != null ? ppxfxbqfkf.wkgbmnqykc(ppxfxbqfkfVar, d14.doubleValue(), 0, false, 6, null) : null, d15, z16, d16, z17, measureType, productMessageType != null ? ppxfxbqfkf(productMessageType, d16, measureType) : null, null, false, hex, 6144, null);
    }

    public static final String ppxfxbqfkf(ProductMessageType productMessageType, double d13, MeasureType currentMeasure) {
        zdlpuopuiu.btonecajqb(productMessageType, "<this>");
        zdlpuopuiu.btonecajqb(currentMeasure, "currentMeasure");
        if (!zdlpuopuiu.eablkybsjg(productMessageType, ProductMessageType.Limit.f94392yggfygwlhe)) {
            return null;
        }
        tzroggbefp tzroggbefpVar = tzroggbefp.f60034iobyxmoadg;
        String str = String.format("Доступно %s %s", Arrays.copyOf(new Object[]{wkgbmnqykc(d13, currentMeasure), currentMeasure.getValue()}, 2));
        zdlpuopuiu.dxjokdxxww(str, "format(...)");
        return str;
    }

    private static final String wkgbmnqykc(double d13, MeasureType measureType) {
        if (measureType instanceof MeasureType.AMOUNT) {
            return String.valueOf((int) d13);
        }
        if (measureType instanceof MeasureType.WEIGHT) {
            return String.valueOf(d13);
        }
        throw new NoWhenBranchMatchedException();
    }
}
