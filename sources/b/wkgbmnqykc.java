package b;

import android.util.SparseArray;
import android.view.ViewStructure;
import android.view.autofill.AutofillValue;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class wkgbmnqykc {
    public static final void iobyxmoadg(iobyxmoadg iobyxmoadgVar, SparseArray sparseArray) {
        if (iobyxmoadgVar.zoijcleaow().iobyxmoadg().isEmpty()) {
            return;
        }
        int size = sparseArray.size();
        for (int i13 = 0; i13 < size; i13++) {
            int iKeyAt = sparseArray.keyAt(i13);
            AutofillValue autofillValue = (AutofillValue) sparseArray.get(iKeyAt);
            nufgyqmvbu nufgyqmvbuVar = nufgyqmvbu.f14835iobyxmoadg;
            if (nufgyqmvbuVar.eablkybsjg(autofillValue)) {
                iobyxmoadgVar.zoijcleaow().zoijcleaow(iKeyAt, nufgyqmvbuVar.zynmafqrjb(autofillValue).toString());
            } else {
                if (nufgyqmvbuVar.ppxfxbqfkf(autofillValue)) {
                    throw new gg.rgvfuqvkyq("An operation is not implemented: b/138604541: Add onFill() callback for date");
                }
                if (nufgyqmvbuVar.wkgbmnqykc(autofillValue)) {
                    throw new gg.rgvfuqvkyq("An operation is not implemented: b/138604541: Add onFill() callback for list");
                }
                if (nufgyqmvbuVar.gxszxtbevo(autofillValue)) {
                    throw new gg.rgvfuqvkyq("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                }
            }
        }
    }

    public static final void zoijcleaow(iobyxmoadg iobyxmoadgVar, ViewStructure viewStructure) {
        if (iobyxmoadgVar.zoijcleaow().iobyxmoadg().isEmpty()) {
            return;
        }
        nufgyqmvbu nufgyqmvbuVar = nufgyqmvbu.f14835iobyxmoadg;
        int iIobyxmoadg = nufgyqmvbuVar.iobyxmoadg(viewStructure, iobyxmoadgVar.zoijcleaow().iobyxmoadg().size());
        Iterator it = iobyxmoadgVar.zoijcleaow().iobyxmoadg().entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            int iIntValue = ((Number) entry.getKey()).intValue();
            androidx.appcompat.app.yggfygwlhe.iobyxmoadg(entry.getValue());
            ViewStructure viewStructureLqeggnwhkg = nufgyqmvbuVar.lqeggnwhkg(viewStructure, iIobyxmoadg);
            nufgyqmvbuVar.dxjokdxxww(viewStructureLqeggnwhkg, iobyxmoadgVar.ppxfxbqfkf(), iIntValue);
            nufgyqmvbuVar.jyumaefscl(viewStructureLqeggnwhkg, iIntValue, iobyxmoadgVar.wkgbmnqykc().getContext().getPackageName(), null, null);
            nufgyqmvbuVar.btonecajqb(viewStructureLqeggnwhkg, vdvldrhtss.zoijcleaow(rgvfuqvkyq.f14875iobyxmoadg.iobyxmoadg()));
            throw null;
        }
    }
}
