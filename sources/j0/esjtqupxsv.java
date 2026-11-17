package j0;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class esjtqupxsv {
    /* JADX INFO: Access modifiers changed from: private */
    public static final List zoijcleaow(List list, int i13, int i14) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            eablkybsjg.wkgbmnqykc wkgbmnqykcVar = (eablkybsjg.wkgbmnqykc) list.get(i15);
            if (lqeggnwhkg.btonecajqb(i13, i14, wkgbmnqykcVar.nufgyqmvbu(), wkgbmnqykcVar.gxszxtbevo())) {
                if (!(i13 <= wkgbmnqykcVar.nufgyqmvbu() && wkgbmnqykcVar.gxszxtbevo() <= i14)) {
                    q0.iobyxmoadg.iobyxmoadg("placeholder can not overlap with paragraph.");
                }
                arrayList.add(new eablkybsjg.wkgbmnqykc(wkgbmnqykcVar.lqeggnwhkg(), wkgbmnqykcVar.nufgyqmvbu() - i13, wkgbmnqykcVar.gxszxtbevo() - i13));
            }
        }
        return arrayList;
    }
}
