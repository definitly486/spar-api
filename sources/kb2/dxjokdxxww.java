package kb2;

import java.util.Iterator;
import java.util.List;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
public abstract class dxjokdxxww {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void zoijcleaow(List list, draadjrbmk draadjrbmkVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            draadjrbmkVar.invoke(it.next());
            it.remove();
        }
    }
}
