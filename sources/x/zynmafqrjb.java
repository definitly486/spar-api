package x;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface zynmafqrjb {
    default int btonecajqb(wflxmlrfwp wflxmlrfwpVar, List list, int i13) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            arrayList.add(new nufgyqmvbu((draadjrbmk) list.get(i14), agtfadlqog.Min, ojitshcjhn.Height));
        }
        return lqeggnwhkg(new androidx.compose.ui.layout.lqeggnwhkg(wflxmlrfwpVar, wflxmlrfwpVar.getLayoutDirection()), arrayList, w0.ppxfxbqfkf.zoijcleaow(0, i13, 0, 0, 13, null)).getHeight();
    }

    default int gxszxtbevo(wflxmlrfwp wflxmlrfwpVar, List list, int i13) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            arrayList.add(new nufgyqmvbu((draadjrbmk) list.get(i14), agtfadlqog.Max, ojitshcjhn.Height));
        }
        return lqeggnwhkg(new androidx.compose.ui.layout.lqeggnwhkg(wflxmlrfwpVar, wflxmlrfwpVar.getLayoutDirection()), arrayList, w0.ppxfxbqfkf.zoijcleaow(0, i13, 0, 0, 13, null)).getHeight();
    }

    default int iobyxmoadg(wflxmlrfwp wflxmlrfwpVar, List list, int i13) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            arrayList.add(new nufgyqmvbu((draadjrbmk) list.get(i14), agtfadlqog.Min, ojitshcjhn.Width));
        }
        return lqeggnwhkg(new androidx.compose.ui.layout.lqeggnwhkg(wflxmlrfwpVar, wflxmlrfwpVar.getLayoutDirection()), arrayList, w0.ppxfxbqfkf.zoijcleaow(0, 0, 0, i13, 7, null)).getWidth();
    }

    istkbnxepw lqeggnwhkg(androidx.compose.ui.layout.draadjrbmk draadjrbmkVar, List list, long j13);

    default int zoijcleaow(wflxmlrfwp wflxmlrfwpVar, List list, int i13) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            arrayList.add(new nufgyqmvbu((draadjrbmk) list.get(i14), agtfadlqog.Max, ojitshcjhn.Width));
        }
        return lqeggnwhkg(new androidx.compose.ui.layout.lqeggnwhkg(wflxmlrfwpVar, wflxmlrfwpVar.getLayoutDirection()), arrayList, w0.ppxfxbqfkf.zoijcleaow(0, 0, 0, i13, 7, null)).getWidth();
    }
}
