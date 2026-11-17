package i02;

import hg.jyumaefscl;
import j02.eablkybsjg;
import j02.gxszxtbevo;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements rgvfuqvkyq {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final d60.iobyxmoadg f41625zdlpuopuiu;

    public iobyxmoadg(d60.iobyxmoadg resourcesManager) {
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        this.f41625zdlpuopuiu = resourcesManager;
    }

    @Override // tg.rgvfuqvkyq
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return iobyxmoadg((c10.wkgbmnqykc) obj, ((Number) obj2).intValue());
    }

    public List iobyxmoadg(c10.wkgbmnqykc wkgbmnqykcVar, int i13) {
        Object objPrevious;
        if (wkgbmnqykcVar == null) {
            return jyumaefscl.wflxmlrfwp();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new eablkybsjg(this.f41625zdlpuopuiu.getString(e02.ppxfxbqfkf.rate_order_title), i13, this.f41625zdlpuopuiu.getString(e02.ppxfxbqfkf.rate_order_negative_subtitle), true));
        for (c10.ppxfxbqfkf ppxfxbqfkfVar : wkgbmnqykcVar.iobyxmoadg()) {
            if (!ppxfxbqfkfVar.ppxfxbqfkf()) {
                arrayList.add(new gxszxtbevo(ppxfxbqfkfVar.iobyxmoadg(), false, ppxfxbqfkfVar.zoijcleaow()));
            }
        }
        List listIobyxmoadg = wkgbmnqykcVar.iobyxmoadg();
        ListIterator listIterator = listIobyxmoadg.listIterator(listIobyxmoadg.size());
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
