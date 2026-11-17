package li;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class iwizpuwonk {
    public static final jh.zoijcleaow iobyxmoadg(Collection descriptors) {
        Integer numWkgbmnqykc;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptors, "descriptors");
        descriptors.isEmpty();
        Iterator it = descriptors.iterator();
        jh.zoijcleaow zoijcleaowVar = null;
        while (it.hasNext()) {
            jh.zoijcleaow zoijcleaowVar2 = (jh.zoijcleaow) it.next();
            if (zoijcleaowVar == null || ((numWkgbmnqykc = jh.zdlpuopuiu.wkgbmnqykc(zoijcleaowVar.getVisibility(), zoijcleaowVar2.getVisibility())) != null && numWkgbmnqykc.intValue() < 0)) {
                zoijcleaowVar = zoijcleaowVar2;
            }
        }
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(zoijcleaowVar);
        return zoijcleaowVar;
    }
}
