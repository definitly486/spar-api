package jx0;

import hg.jyumaefscl;
import hg.tzroggbefp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.product.FilterSection;
import ru.myspar.proloyalty.core.domain.models.product.FilterValue;

/* JADX INFO: loaded from: classes5.dex */
public abstract class wkgbmnqykc {
    public static final gg.vdvldrhtss iobyxmoadg(FilterSection filterSection) {
        zdlpuopuiu.btonecajqb(filterSection, "<this>");
        List filterValues = filterSection.getFilterValues();
        ArrayList arrayList = new ArrayList();
        for (Object obj : filterValues) {
            if (((FilterValue) obj).getChecked()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(jyumaefscl.cqumvgiudr(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((FilterValue) it.next()).getValue());
        }
        return new gg.vdvldrhtss(filterSection.getCode(), arrayList2);
    }

    public static final Map zoijcleaow(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(iobyxmoadg((FilterSection) it.next()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!((Collection) ((gg.vdvldrhtss) obj).nufgyqmvbu()).isEmpty()) {
                arrayList2.add(obj);
            }
        }
        return tzroggbefp.kcexrzcfyt(arrayList2);
    }
}
