package tz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.myspar.core.domain.models.product.FilterSection;

/* JADX INFO: loaded from: classes4.dex */
public abstract class eablkybsjg {
    public static final FilterSection iobyxmoadg(FilterSectionDto filterSectionDto) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(filterSectionDto, "<this>");
        String code = filterSectionDto.getCode();
        String name = filterSectionDto.getName();
        List filterValues = filterSectionDto.getFilterValues();
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(filterValues, 10));
        Iterator it = filterValues.iterator();
        while (it.hasNext()) {
            arrayList.add(lqeggnwhkg.iobyxmoadg((FilterValueDto) it.next()));
        }
        return new FilterSection(code, name, arrayList);
    }
}
