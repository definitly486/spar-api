package t6;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class c1 implements yadqdtsiqt {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f109792iobyxmoadg;

    c1(Context context) {
        this.f109792iobyxmoadg = context;
    }

    @Override // t6.yadqdtsiqt
    public ArrayList iobyxmoadg() {
        ArrayList arrayList = new ArrayList();
        Iterator it = g1.iobyxmoadg(this.f109792iobyxmoadg).iobyxmoadg().iterator();
        while (it.hasNext()) {
            for (wflxmlrfwp wflxmlrfwpVar : g1.ppxfxbqfkf(this.f109792iobyxmoadg, ((Integer) it.next()).intValue()).iobyxmoadg()) {
                if (!arrayList.contains(wflxmlrfwpVar) && wflxmlrfwpVar.ppxfxbqfkf() != dsvhmnatus.None) {
                    arrayList.add(wflxmlrfwpVar);
                }
            }
        }
        return arrayList;
    }
}
