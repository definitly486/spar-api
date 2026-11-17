package he0;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class nufgyqmvbu {
    public static final iobyxmoadg iobyxmoadg(nb0.wkgbmnqykc wkgbmnqykcVar) {
        zdlpuopuiu.btonecajqb(wkgbmnqykcVar, "<this>");
        String strEablkybsjg = wkgbmnqykcVar.eablkybsjg();
        if (strEablkybsjg == null) {
            strEablkybsjg = "";
        }
        String str = strEablkybsjg;
        List listWkgbmnqykc = wkgbmnqykcVar.wkgbmnqykc();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(listWkgbmnqykc, 10));
        Iterator it = listWkgbmnqykc.iterator();
        while (it.hasNext()) {
            arrayList.add(zoijcleaow((nb0.eablkybsjg) it.next()));
        }
        return new iobyxmoadg(str, arrayList, false, 4, null);
    }

    public static final lqeggnwhkg zoijcleaow(nb0.eablkybsjg eablkybsjgVar) {
        zdlpuopuiu.btonecajqb(eablkybsjgVar, "<this>");
        String id2 = eablkybsjgVar.getId();
        String strNufgyqmvbu = eablkybsjgVar.nufgyqmvbu();
        if (strNufgyqmvbu == null) {
            strNufgyqmvbu = "";
        }
        return new lqeggnwhkg(id2, strNufgyqmvbu, null, eablkybsjgVar.iobyxmoadg(), 4, null);
    }
}
