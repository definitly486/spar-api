package sr1;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class eablkybsjg {
    private static final cc1.eablkybsjg ppxfxbqfkf(zoijcleaow zoijcleaowVar) {
        return new cc1.eablkybsjg(zoijcleaowVar.zoijcleaow(), zoijcleaowVar.zoijcleaow(), null, zoijcleaowVar.iobyxmoadg(), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final cc1.iobyxmoadg zoijcleaow(wkgbmnqykc wkgbmnqykcVar) {
        List listLqeggnwhkg = wkgbmnqykcVar.lqeggnwhkg();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(listLqeggnwhkg, 10));
        Iterator it = listLqeggnwhkg.iterator();
        while (it.hasNext()) {
            arrayList.add(ppxfxbqfkf((zoijcleaow) it.next()));
        }
        return new cc1.iobyxmoadg("", arrayList, false);
    }
}
