package jx0;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.zdlpuopuiu;
import px0.MeasureParamsDto;
import ru.myspar.proloyalty.core.models.measure_type.MeasureType;
import ru.myspar.proloyalty.core.models.measure_type.MeasureTypeModel;

/* JADX INFO: loaded from: classes5.dex */
public final class lqeggnwhkg {
    private final MeasureType zoijcleaow(Map.Entry entry) {
        MeasureType weight;
        String str = (String) entry.getKey();
        if (zdlpuopuiu.eablkybsjg(str, "шт")) {
            Double basketDefault = ((MeasureParamsDto) entry.getValue()).getBasketDefault();
            double dDoubleValue = basketDefault != null ? basketDefault.doubleValue() : 1.0d;
            Double minAvailable = ((MeasureParamsDto) entry.getValue()).getMinAvailable();
            double dDoubleValue2 = minAvailable != null ? minAvailable.doubleValue() : 1.0d;
            Double ratio = ((MeasureParamsDto) entry.getValue()).getRatio();
            weight = new MeasureType.AMOUNT(dDoubleValue, dDoubleValue2, ratio != null ? ratio.doubleValue() : 1.0d);
        } else {
            if (zdlpuopuiu.eablkybsjg(str, "кг")) {
                Double basketDefault2 = ((MeasureParamsDto) entry.getValue()).getBasketDefault();
                double dDoubleValue3 = basketDefault2 != null ? basketDefault2.doubleValue() : 1.0d;
                Double minAvailable2 = ((MeasureParamsDto) entry.getValue()).getMinAvailable();
                double dDoubleValue4 = minAvailable2 != null ? minAvailable2.doubleValue() : 0.1d;
                Double ratio2 = ((MeasureParamsDto) entry.getValue()).getRatio();
                weight = new MeasureType.WEIGHT(dDoubleValue3, dDoubleValue4, ratio2 != null ? ratio2.doubleValue() : 0.1d);
            } else {
                Double basketDefault3 = ((MeasureParamsDto) entry.getValue()).getBasketDefault();
                double dDoubleValue5 = basketDefault3 != null ? basketDefault3.doubleValue() : 1.0d;
                Double minAvailable3 = ((MeasureParamsDto) entry.getValue()).getMinAvailable();
                double dDoubleValue6 = minAvailable3 != null ? minAvailable3.doubleValue() : 0.1d;
                Double ratio3 = ((MeasureParamsDto) entry.getValue()).getRatio();
                weight = new MeasureType.WEIGHT(dDoubleValue5, dDoubleValue6, ratio3 != null ? ratio3.doubleValue() : 0.1d);
            }
        }
        return weight;
    }

    public final MeasureTypeModel iobyxmoadg(String str) {
        Object next;
        List listEablkybsjg = jyumaefscl.eablkybsjg(MeasureType.INSTANCE.iobyxmoadg(str));
        Iterator it = listEablkybsjg.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!zdlpuopuiu.eablkybsjg(((MeasureType) next).getValue(), str));
        MeasureType measureTypeZoijcleaow = (MeasureType) next;
        if (measureTypeZoijcleaow == null && (measureTypeZoijcleaow = (MeasureType) jyumaefscl.weqkydbzbr(listEablkybsjg)) == null) {
            measureTypeZoijcleaow = MeasureType.INSTANCE.zoijcleaow();
        }
        return new MeasureTypeModel(listEablkybsjg, measureTypeZoijcleaow, measureTypeZoijcleaow);
    }

    public final MeasureTypeModel ppxfxbqfkf(Map units, String str) {
        Object next;
        zdlpuopuiu.btonecajqb(units, "units");
        ArrayList arrayList = new ArrayList(units.size());
        Iterator it = units.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(zoijcleaow((Map.Entry) it.next()));
        }
        Iterator it2 = arrayList.iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!zdlpuopuiu.eablkybsjg(((MeasureType) next).getValue(), str));
        MeasureType measureTypeZoijcleaow = (MeasureType) next;
        if (measureTypeZoijcleaow == null && (measureTypeZoijcleaow = (MeasureType) jyumaefscl.weqkydbzbr(arrayList)) == null) {
            measureTypeZoijcleaow = MeasureType.INSTANCE.zoijcleaow();
        }
        return new MeasureTypeModel(arrayList, measureTypeZoijcleaow, measureTypeZoijcleaow);
    }
}
