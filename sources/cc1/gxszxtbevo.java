package cc1;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class gxszxtbevo {
    public static final iobyxmoadg iobyxmoadg(m91.wkgbmnqykc wkgbmnqykcVar) {
        zdlpuopuiu.btonecajqb(wkgbmnqykcVar, "<this>");
        String strWkgbmnqykc = wkgbmnqykcVar.wkgbmnqykc();
        if (strWkgbmnqykc == null) {
            strWkgbmnqykc = "";
        }
        String str = strWkgbmnqykc;
        List listPpxfxbqfkf = wkgbmnqykcVar.ppxfxbqfkf();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(listPpxfxbqfkf, 10));
        Iterator it = listPpxfxbqfkf.iterator();
        while (it.hasNext()) {
            arrayList.add(zoijcleaow((m91.gxszxtbevo) it.next()));
        }
        return new iobyxmoadg(str, arrayList, false, 4, null);
    }

    public static final eablkybsjg zoijcleaow(m91.gxszxtbevo gxszxtbevoVar) {
        zdlpuopuiu.btonecajqb(gxszxtbevoVar, "<this>");
        String id2 = gxszxtbevoVar.getId();
        String strDxjokdxxww = gxszxtbevoVar.dxjokdxxww();
        if (strDxjokdxxww == null) {
            strDxjokdxxww = "";
        }
        return new eablkybsjg(id2, strDxjokdxxww, null, gxszxtbevoVar.eablkybsjg(), 4, null);
    }
}
