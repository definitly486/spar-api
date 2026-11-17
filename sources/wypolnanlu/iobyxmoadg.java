package wypolnanlu;

import androidx.camera.core.impl.istkbnxepw;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import lereixgezr.iwizpuwonk;

/* JADX INFO: loaded from: classes.dex */
public abstract class iobyxmoadg {
    private static iwizpuwonk iobyxmoadg(List list) {
        if (list.isEmpty()) {
            return null;
        }
        iwizpuwonk iwizpuwonkVar = (iwizpuwonk) list.get(0);
        Integer numValueOf = Integer.valueOf(iwizpuwonkVar.zoijcleaow());
        Integer numValueOf2 = Integer.valueOf(iwizpuwonkVar.iobyxmoadg());
        for (int i13 = 1; i13 < list.size(); i13++) {
            iwizpuwonk iwizpuwonkVar2 = (iwizpuwonk) list.get(i13);
            numValueOf = ppxfxbqfkf(numValueOf, Integer.valueOf(iwizpuwonkVar2.zoijcleaow()));
            numValueOf2 = zoijcleaow(numValueOf2, Integer.valueOf(iwizpuwonkVar2.iobyxmoadg()));
            if (numValueOf == null || numValueOf2 == null) {
                return null;
            }
        }
        return new iwizpuwonk(numValueOf.intValue(), numValueOf2.intValue());
    }

    private static Integer ppxfxbqfkf(Integer num, Integer num2) {
        if (num.equals(0)) {
            return num2;
        }
        if (num2.equals(0)) {
            return num;
        }
        if (num.equals(2) && !num2.equals(1)) {
            return num2;
        }
        if ((!num2.equals(2) || num.equals(1)) && !num.equals(num2)) {
            return null;
        }
        return num;
    }

    public static iwizpuwonk wkgbmnqykc(Set set) {
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((istkbnxepw) it.next()).lmojexxdyd());
        }
        return iobyxmoadg(arrayList);
    }

    private static Integer zoijcleaow(Integer num, Integer num2) {
        if (num.equals(0)) {
            return num2;
        }
        if (num2.equals(0) || num.equals(num2)) {
            return num;
        }
        return null;
    }
}
