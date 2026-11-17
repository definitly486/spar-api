package zl1;

import am1.gxszxtbevo;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf implements draadjrbmk {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final q41.iobyxmoadg f130384zdlpuopuiu;

    public ppxfxbqfkf(q41.iobyxmoadg resourcesManager) {
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        this.f130384zdlpuopuiu = resourcesManager;
    }

    @Override // tg.draadjrbmk
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public List invoke(sz0.ppxfxbqfkf ppxfxbqfkfVar) {
        Object objPrevious;
        if (ppxfxbqfkfVar == null) {
            return jyumaefscl.wflxmlrfwp();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new am1.iobyxmoadg(this.f130384zdlpuopuiu.getString(vl1.ppxfxbqfkf.proloyalty_cancel_order_title), this.f130384zdlpuopuiu.getString(vl1.ppxfxbqfkf.proloyalty_rate_order_cancel_subtitle)));
        for (sz0.zoijcleaow zoijcleaowVar : ppxfxbqfkfVar.ppxfxbqfkf()) {
            if (!zoijcleaowVar.ppxfxbqfkf()) {
                arrayList.add(new gxszxtbevo(zoijcleaowVar.iobyxmoadg(), false, zoijcleaowVar.zoijcleaow()));
            }
        }
        List listPpxfxbqfkf = ppxfxbqfkfVar.ppxfxbqfkf();
        ListIterator listIterator = listPpxfxbqfkf.listIterator(listPpxfxbqfkf.size());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (!((sz0.zoijcleaow) objPrevious).ppxfxbqfkf());
        sz0.zoijcleaow zoijcleaowVar2 = (sz0.zoijcleaow) objPrevious;
        if (zoijcleaowVar2 != null) {
            arrayList.add(new am1.zoijcleaow(zoijcleaowVar2.iobyxmoadg(), null, 2, null));
        }
        return arrayList;
    }
}
