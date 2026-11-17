package zl1;

import am1.eablkybsjg;
import am1.gxszxtbevo;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow implements rgvfuqvkyq {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final q41.iobyxmoadg f130387zdlpuopuiu;

    public zoijcleaow(q41.iobyxmoadg resourcesManager) {
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        this.f130387zdlpuopuiu = resourcesManager;
    }

    @Override // tg.rgvfuqvkyq
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return iobyxmoadg((sz0.ppxfxbqfkf) obj, ((Number) obj2).intValue());
    }

    public List iobyxmoadg(sz0.ppxfxbqfkf ppxfxbqfkfVar, int i13) {
        Object objPrevious;
        if (ppxfxbqfkfVar == null) {
            return jyumaefscl.wflxmlrfwp();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new eablkybsjg(this.f130387zdlpuopuiu.getString(vl1.ppxfxbqfkf.proloyalty_rate_order_title), i13, this.f130387zdlpuopuiu.getString(vl1.ppxfxbqfkf.proloyalty_rate_order_positive_subtitle), true));
        for (sz0.zoijcleaow zoijcleaowVar : ppxfxbqfkfVar.zoijcleaow()) {
            if (!zoijcleaowVar.ppxfxbqfkf()) {
                arrayList.add(new gxszxtbevo(zoijcleaowVar.iobyxmoadg(), false, zoijcleaowVar.zoijcleaow()));
            }
        }
        List listZoijcleaow = ppxfxbqfkfVar.zoijcleaow();
        ListIterator listIterator = listZoijcleaow.listIterator(listZoijcleaow.size());
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
