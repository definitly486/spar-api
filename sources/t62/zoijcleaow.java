package t62;

import he0.lqeggnwhkg;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zoijcleaow {
    private static final lqeggnwhkg ppxfxbqfkf(iobyxmoadg iobyxmoadgVar) {
        return new lqeggnwhkg(iobyxmoadgVar.getItemId(), iobyxmoadgVar.wkgbmnqykc(), iobyxmoadgVar.iobyxmoadg(), "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final he0.iobyxmoadg zoijcleaow(wkgbmnqykc wkgbmnqykcVar) {
        List listLqeggnwhkg = wkgbmnqykcVar.lqeggnwhkg();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(listLqeggnwhkg, 10));
        Iterator it = listLqeggnwhkg.iterator();
        while (it.hasNext()) {
            arrayList.add(ppxfxbqfkf((iobyxmoadg) it.next()));
        }
        return new he0.iobyxmoadg("", arrayList, false, 4, null);
    }
}
