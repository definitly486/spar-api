package oy;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.product.ProductLimit;
import ru.myspar.core.models.measure_type.MeasureType;
import ru.myspar.core.models.measure_type.MeasureTypeModel;
import tz.ProductLimitDto;

/* JADX INFO: loaded from: classes4.dex */
public final class nufgyqmvbu implements tg.rgvfuqvkyq {
    private final MeasureType iobyxmoadg(MeasureTypeModel measureTypeModel, ProductLimitDto productLimitDto) {
        Object next;
        Iterator it = measureTypeModel.getUnits().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (zdlpuopuiu.eablkybsjg(((MeasureType) next).getValue(), productLimitDto.getMeasure())) {
                return (MeasureType) next;
            }
        }
        next = null;
        return (MeasureType) next;
    }

    @Override // tg.rgvfuqvkyq
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public List invoke(List list, MeasureTypeModel measureTypeModel) {
        zdlpuopuiu.btonecajqb(measureTypeModel, "measureTypeModel");
        if (list == null) {
            return jyumaefscl.wflxmlrfwp();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ProductLimitDto productLimitDto = (ProductLimitDto) it.next();
            MeasureType measureTypeIobyxmoadg = iobyxmoadg(measureTypeModel, productLimitDto);
            ProductLimit productLimit = measureTypeIobyxmoadg != null ? new ProductLimit(measureTypeIobyxmoadg, productLimitDto.getQuantity()) : null;
            if (productLimit != null) {
                arrayList.add(productLimit);
            }
        }
        return arrayList;
    }
}
