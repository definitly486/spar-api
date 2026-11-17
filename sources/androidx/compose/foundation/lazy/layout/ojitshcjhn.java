package androidx.compose.foundation.lazy.layout;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class ojitshcjhn {
    public static final List iobyxmoadg(zynmafqrjb zynmafqrjbVar, sopmlzcsov sopmlzcsovVar, btonecajqb btonecajqbVar) {
        if (!btonecajqbVar.wkgbmnqykc() && sopmlzcsovVar.isEmpty()) {
            return hg.jyumaefscl.wflxmlrfwp();
        }
        ArrayList arrayList = new ArrayList();
        zg.btonecajqb btonecajqbVar2 = btonecajqbVar.wkgbmnqykc() ? new zg.btonecajqb(btonecajqbVar.ppxfxbqfkf(), Math.min(btonecajqbVar.zoijcleaow(), zynmafqrjbVar.iobyxmoadg() - 1)) : zg.btonecajqb.f129919cqumvgiudr.iobyxmoadg();
        int size = sopmlzcsovVar.size();
        for (int i13 = 0; i13 < size; i13++) {
            sopmlzcsov.iobyxmoadg iobyxmoadgVar = (sopmlzcsov.iobyxmoadg) sopmlzcsovVar.get(i13);
            int iIobyxmoadg = istkbnxepw.iobyxmoadg(zynmafqrjbVar, iobyxmoadgVar.getKey(), iobyxmoadgVar.getIndex());
            int iWkgbmnqykc = btonecajqbVar2.wkgbmnqykc();
            if ((iIobyxmoadg > btonecajqbVar2.eablkybsjg() || iWkgbmnqykc > iIobyxmoadg) && iIobyxmoadg >= 0 && iIobyxmoadg < zynmafqrjbVar.iobyxmoadg()) {
                arrayList.add(Integer.valueOf(iIobyxmoadg));
            }
        }
        int iWkgbmnqykc2 = btonecajqbVar2.wkgbmnqykc();
        int iEablkybsjg = btonecajqbVar2.eablkybsjg();
        if (iWkgbmnqykc2 <= iEablkybsjg) {
            while (true) {
                arrayList.add(Integer.valueOf(iWkgbmnqykc2));
                if (iWkgbmnqykc2 == iEablkybsjg) {
                    break;
                }
                iWkgbmnqykc2++;
            }
        }
        return arrayList;
    }
}
