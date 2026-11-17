package z52;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class eablkybsjg {
    private static final he0.lqeggnwhkg ppxfxbqfkf(zoijcleaow zoijcleaowVar) {
        return new he0.lqeggnwhkg(zoijcleaowVar.zoijcleaow(), zoijcleaowVar.zoijcleaow(), null, zoijcleaowVar.iobyxmoadg(), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final he0.iobyxmoadg zoijcleaow(wkgbmnqykc wkgbmnqykcVar) {
        List listLqeggnwhkg = wkgbmnqykcVar.lqeggnwhkg();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(listLqeggnwhkg, 10));
        Iterator it = listLqeggnwhkg.iterator();
        while (it.hasNext()) {
            arrayList.add(ppxfxbqfkf((zoijcleaow) it.next()));
        }
        return new he0.iobyxmoadg("", arrayList, false);
    }
}
