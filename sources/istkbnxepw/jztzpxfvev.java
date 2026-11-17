package istkbnxepw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class jztzpxfvev {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f49357iobyxmoadg;

    public jztzpxfvev(List list) {
        this.f49357iobyxmoadg = new ArrayList(list);
    }

    public static String wkgbmnqykc(jztzpxfvev jztzpxfvevVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = jztzpxfvevVar.f49357iobyxmoadg.iterator();
        while (it.hasNext()) {
            arrayList.add(((vipkmwdibw) it.next()).getClass().getSimpleName());
        }
        return String.join(" | ", arrayList);
    }

    public boolean iobyxmoadg(Class cls) {
        Iterator it = this.f49357iobyxmoadg.iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(((vipkmwdibw) it.next()).getClass())) {
                return true;
            }
        }
        return false;
    }

    public List ppxfxbqfkf(Class cls) {
        ArrayList arrayList = new ArrayList();
        for (vipkmwdibw vipkmwdibwVar : this.f49357iobyxmoadg) {
            if (cls.isAssignableFrom(vipkmwdibwVar.getClass())) {
                arrayList.add(vipkmwdibwVar);
            }
        }
        return arrayList;
    }

    public vipkmwdibw zoijcleaow(Class cls) {
        for (vipkmwdibw vipkmwdibwVar : this.f49357iobyxmoadg) {
            if (vipkmwdibwVar.getClass() == cls) {
                return vipkmwdibwVar;
            }
        }
        return null;
    }
}
