package androidx.compose.ui.platform;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {
    public static final String eablkybsjg(int i13) {
        g0.nufgyqmvbu.iobyxmoadg iobyxmoadgVar = g0.nufgyqmvbu.f35737zoijcleaow;
        if (g0.nufgyqmvbu.wflxmlrfwp(i13, iobyxmoadgVar.iobyxmoadg())) {
            return "android.widget.Button";
        }
        if (g0.nufgyqmvbu.wflxmlrfwp(i13, iobyxmoadgVar.ppxfxbqfkf())) {
            return "android.widget.CheckBox";
        }
        if (g0.nufgyqmvbu.wflxmlrfwp(i13, iobyxmoadgVar.gxszxtbevo())) {
            return "android.widget.RadioButton";
        }
        if (g0.nufgyqmvbu.wflxmlrfwp(i13, iobyxmoadgVar.eablkybsjg())) {
            return "android.widget.ImageView";
        }
        if (g0.nufgyqmvbu.wflxmlrfwp(i13, iobyxmoadgVar.wkgbmnqykc())) {
            return "android.widget.Spinner";
        }
        if (g0.nufgyqmvbu.wflxmlrfwp(i13, iobyxmoadgVar.dxjokdxxww())) {
            return "android.widget.NumberPicker";
        }
        return null;
    }

    public static final i iobyxmoadg(List list, int i13) {
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            if (((i) list.get(i14)).wkgbmnqykc() == i13) {
                return (i) list.get(i14);
            }
        }
        return null;
    }

    public static final j0.f ppxfxbqfkf(g0.wflxmlrfwp wflxmlrfwpVar) {
        tg.draadjrbmk draadjrbmkVar;
        ArrayList arrayList = new ArrayList();
        g0.iobyxmoadg iobyxmoadgVar = (g0.iobyxmoadg) g0.agtfadlqog.iobyxmoadg(wflxmlrfwpVar, g0.draadjrbmk.f35622iobyxmoadg.dxjokdxxww());
        if (iobyxmoadgVar == null || (draadjrbmkVar = (tg.draadjrbmk) iobyxmoadgVar.iobyxmoadg()) == null || !((Boolean) draadjrbmkVar.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (j0.f) arrayList.get(0);
    }

    public static final View wkgbmnqykc(sopmlzcsov sopmlzcsovVar, int i13) {
        Object next;
        Iterator<T> it = sopmlzcsovVar.getLayoutNodeToHolder().entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((z.pkzmftpjix) ((Map.Entry) next).getKey()).zynmafqrjb() != i13);
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (androidx.compose.ui.viewinterop.zoijcleaow) entry.getValue();
        }
        return null;
    }

    public static final Float zoijcleaow(g0.wflxmlrfwp wflxmlrfwpVar) {
        tg.draadjrbmk draadjrbmkVar;
        ArrayList arrayList = new ArrayList();
        g0.iobyxmoadg iobyxmoadgVar = (g0.iobyxmoadg) g0.agtfadlqog.iobyxmoadg(wflxmlrfwpVar, g0.draadjrbmk.f35622iobyxmoadg.nufgyqmvbu());
        if (iobyxmoadgVar == null || (draadjrbmkVar = (tg.draadjrbmk) iobyxmoadgVar.iobyxmoadg()) == null || !((Boolean) draadjrbmkVar.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (Float) arrayList.get(0);
    }
}
