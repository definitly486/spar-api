package ks0;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.common.view.counter.model.CounterModel;
import ru.myspar.proloyalty.common.view.counter.model.Price;
import ru.myspar.proloyalty.core.models.measure_type.MeasureType;

/* JADX INFO: loaded from: classes5.dex */
public abstract class iobyxmoadg {
    public static final String eablkybsjg(CounterModel counterModel) {
        zdlpuopuiu.btonecajqb(counterModel, "<this>");
        return counterModel.getMeasureType() instanceof MeasureType.AMOUNT ? t11.iobyxmoadg.f109303iobyxmoadg.wflxmlrfwp(Double.valueOf(counterModel.getQuantity())) : t11.iobyxmoadg.f109303iobyxmoadg.draadjrbmk(counterModel.getQuantity());
    }

    public static final Price gxszxtbevo(CounterModel counterModel) {
        zdlpuopuiu.btonecajqb(counterModel, "<this>");
        Double dIobyxmoadg = iobyxmoadg(counterModel);
        if (dIobyxmoadg == null) {
            return null;
        }
        return ppxfxbqfkf.wkgbmnqykc(ppxfxbqfkf.f60512iobyxmoadg, dIobyxmoadg.doubleValue(), 1, false, 4, null);
    }

    private static final Double iobyxmoadg(CounterModel counterModel) {
        if (counterModel.getOldPriceModel() == null) {
            return null;
        }
        ppxfxbqfkf ppxfxbqfkfVar = ppxfxbqfkf.f60512iobyxmoadg;
        MeasureType measureType = counterModel.getMeasureType();
        Price oldPriceModel = counterModel.getOldPriceModel();
        if (oldPriceModel != null) {
            return Double.valueOf(ppxfxbqfkfVar.zoijcleaow(measureType, Double.valueOf(oldPriceModel.getPriceDouble()), counterModel.getAvgWeight(), Boolean.valueOf(counterModel.getIsDispPer100())));
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final Price lqeggnwhkg(CounterModel counterModel) {
        zdlpuopuiu.btonecajqb(counterModel, "<this>");
        return ppxfxbqfkf.f60512iobyxmoadg.ppxfxbqfkf(zoijcleaow(counterModel), 2, true);
    }

    public static final Price nufgyqmvbu(CounterModel counterModel) {
        zdlpuopuiu.btonecajqb(counterModel, "<this>");
        return ppxfxbqfkf.wkgbmnqykc(ppxfxbqfkf.f60512iobyxmoadg, wkgbmnqykc(counterModel, 0.0d, 2, null), 0, false, 6, null);
    }

    private static final double ppxfxbqfkf(CounterModel counterModel, double d13) {
        return ppxfxbqfkf.f60512iobyxmoadg.iobyxmoadg(d13, counterModel.getMeasureType(), Double.valueOf(counterModel.getPriceModel().getPriceDouble() > 0.009d ? counterModel.getPriceModel().getPriceDouble() : 0.0d), counterModel.getAvgWeight(), counterModel.getIsDispPer100());
    }

    static /* synthetic */ double wkgbmnqykc(CounterModel counterModel, double d13, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            d13 = counterModel.getQuantity();
        }
        return ppxfxbqfkf(counterModel, d13);
    }

    private static final double zoijcleaow(CounterModel counterModel) {
        return ppxfxbqfkf.f60512iobyxmoadg.zoijcleaow(counterModel.getMeasureType(), Double.valueOf(counterModel.getPriceModel().getPriceDouble()), counterModel.getAvgWeight(), Boolean.valueOf(counterModel.getIsDispPer100()));
    }
}
