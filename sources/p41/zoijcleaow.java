package p41;

import gg.wwaezpbzkn;
import java.util.Iterator;
import jztzpxfvev.ikoacuggdj;
import yfnezrywwk.agtfadlqog;
import yfnezrywwk.mbcevpiqjq;
import zg.gtknphoqwx;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zoijcleaow {
    private static final int iobyxmoadg(mbcevpiqjq mbcevpiqjqVar, int i13) {
        Object next;
        Iterator it = mbcevpiqjqVar.cdpycssgdh().nufgyqmvbu().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((agtfadlqog) next).getIndex() != i13);
        agtfadlqog agtfadlqogVar = (agtfadlqog) next;
        if (agtfadlqogVar == null) {
            return 0;
        }
        return gtknphoqwx.gxszxtbevo((agtfadlqogVar.iobyxmoadg() + agtfadlqogVar.getSize()) - mbcevpiqjqVar.cdpycssgdh().ppxfxbqfkf(), 0);
    }

    public static final Object ppxfxbqfkf(mbcevpiqjq mbcevpiqjqVar, int i13, int i14, lg.gxszxtbevo gxszxtbevoVar) {
        if (zoijcleaow(mbcevpiqjqVar, i13)) {
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        int iIobyxmoadg = iobyxmoadg(mbcevpiqjqVar, i13);
        if (iIobyxmoadg > 0) {
            Object objZoijcleaow = ikoacuggdj.zoijcleaow(mbcevpiqjqVar, iIobyxmoadg + i14, null, gxszxtbevoVar, 2, null);
            return objZoijcleaow == mg.zoijcleaow.gxszxtbevo() ? objZoijcleaow : wwaezpbzkn.f37140iobyxmoadg;
        }
        Object objOxmwwwfdhm = mbcevpiqjq.oxmwwwfdhm(mbcevpiqjqVar, i13, 0, gxszxtbevoVar, 2, null);
        return objOxmwwwfdhm == mg.zoijcleaow.gxszxtbevo() ? objOxmwwwfdhm : wwaezpbzkn.f37140iobyxmoadg;
    }

    private static final boolean zoijcleaow(mbcevpiqjq mbcevpiqjqVar, int i13) {
        Object next;
        Iterator it = mbcevpiqjqVar.cdpycssgdh().nufgyqmvbu().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((agtfadlqog) next).getIndex() != i13);
        agtfadlqog agtfadlqogVar = (agtfadlqog) next;
        if (agtfadlqogVar == null) {
            return false;
        }
        return agtfadlqogVar.iobyxmoadg() >= mbcevpiqjqVar.cdpycssgdh().eablkybsjg() && agtfadlqogVar.iobyxmoadg() + agtfadlqogVar.getSize() <= mbcevpiqjqVar.cdpycssgdh().ppxfxbqfkf();
    }
}
