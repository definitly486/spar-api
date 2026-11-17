package i02;

import hg.jyumaefscl;
import j02.gxszxtbevo;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf implements draadjrbmk {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final d60.iobyxmoadg f41626zdlpuopuiu;

    public ppxfxbqfkf(d60.iobyxmoadg resourcesManager) {
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        this.f41626zdlpuopuiu = resourcesManager;
    }

    @Override // tg.draadjrbmk
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public List invoke(c10.wkgbmnqykc wkgbmnqykcVar) {
        Object objPrevious;
        if (wkgbmnqykcVar == null) {
            return jyumaefscl.wflxmlrfwp();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new j02.iobyxmoadg(this.f41626zdlpuopuiu.getString(e02.ppxfxbqfkf.cancel_order_title), this.f41626zdlpuopuiu.getString(e02.ppxfxbqfkf.rate_order_cancel_subtitle)));
        for (c10.ppxfxbqfkf ppxfxbqfkfVar : wkgbmnqykcVar.ppxfxbqfkf()) {
            if (!ppxfxbqfkfVar.ppxfxbqfkf()) {
                arrayList.add(new gxszxtbevo(ppxfxbqfkfVar.iobyxmoadg(), false, ppxfxbqfkfVar.zoijcleaow()));
            }
        }
        List listPpxfxbqfkf = wkgbmnqykcVar.ppxfxbqfkf();
        ListIterator listIterator = listPpxfxbqfkf.listIterator(listPpxfxbqfkf.size());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (!((c10.ppxfxbqfkf) objPrevious).ppxfxbqfkf());
        c10.ppxfxbqfkf ppxfxbqfkfVar2 = (c10.ppxfxbqfkf) objPrevious;
        if (ppxfxbqfkfVar2 != null) {
            arrayList.add(new j02.zoijcleaow(ppxfxbqfkfVar2.iobyxmoadg(), null, 2, null));
        }
        return arrayList;
    }
}
