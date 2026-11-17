package androidx.compose.foundation.lazy.layout;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class zfvoamnweg {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int ppxfxbqfkf(cllcsxoeiz cllcsxoeizVar) {
        long jWflxmlrfwp = cllcsxoeizVar.wflxmlrfwp(0);
        return cllcsxoeizVar.nufgyqmvbu() ? w0.agtfadlqog.btonecajqb(jWflxmlrfwp) : w0.agtfadlqog.dxjokdxxww(jWflxmlrfwp);
    }

    public static final List zoijcleaow(jrbgnlbqoe jrbgnlbqoeVar, int i13, int i14, List list, androidx.collection.wflxmlrfwp wflxmlrfwpVar, int i15, int i16, int i17, int i18, tg.draadjrbmk draadjrbmkVar) {
        if (jrbgnlbqoeVar == null || list.isEmpty() || wflxmlrfwpVar.f4401zoijcleaow == 0) {
            return hg.jyumaefscl.wflxmlrfwp();
        }
        androidx.collection.wflxmlrfwp wflxmlrfwpVarZoijcleaow = jrbgnlbqoeVar.zoijcleaow(i13, i14, wflxmlrfwpVar);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(list.size());
        int size = list.size();
        for (int i19 = 0; i19 < size; i19++) {
            Object obj = list.get(i19);
            if (wflxmlrfwpVar.ppxfxbqfkf(((cllcsxoeiz) obj).getIndex())) {
                arrayList2.add(obj);
            }
        }
        int[] iArr = wflxmlrfwpVarZoijcleaow.f4400iobyxmoadg;
        int i23 = wflxmlrfwpVarZoijcleaow.f4401zoijcleaow;
        for (int i24 = 0; i24 < i23; i24++) {
            int i25 = iArr[i24];
            Iterator it = list.iterator();
            int i26 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i26 = -1;
                    break;
                }
                if (((cllcsxoeiz) it.next()).getIndex() == i25) {
                    break;
                }
                i26++;
            }
            cllcsxoeiz cllcsxoeizVar = i26 == -1 ? (cllcsxoeiz) draadjrbmkVar.invoke(Integer.valueOf(i25)) : (cllcsxoeiz) list.remove(i26);
            int iIobyxmoadg = jrbgnlbqoeVar.iobyxmoadg(arrayList2, i25, cllcsxoeizVar.gtknphoqwx(), i26 == -1 ? Integer.MIN_VALUE : ppxfxbqfkf(cllcsxoeizVar), i15, i16, i17, i18);
            cllcsxoeizVar.wkgbmnqykc(true);
            cllcsxoeizVar.btonecajqb(iIobyxmoadg, 0, i17, i18);
            arrayList.add(cllcsxoeizVar);
        }
        return arrayList;
    }
}
