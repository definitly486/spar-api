package c00;

import gg.wwaezpbzkn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.myspar.core.domain.models.catalog.CatalogSection;

/* JADX INFO: loaded from: classes4.dex */
public final class lqeggnwhkg implements x10.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final dy.ppxfxbqfkf f18076iobyxmoadg;

    public lqeggnwhkg(dy.ppxfxbqfkf catalogDao) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(catalogDao, "catalogDao");
        this.f18076iobyxmoadg = catalogDao;
    }

    @Override // x10.zoijcleaow
    public Object iobyxmoadg(List list, lg.gxszxtbevo gxszxtbevoVar) {
        if (list == null || list.isEmpty()) {
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(ly.ppxfxbqfkf.iobyxmoadg((CatalogSection) it.next()));
        }
        Object objPpxfxbqfkf = this.f18076iobyxmoadg.ppxfxbqfkf(arrayList, gxszxtbevoVar);
        return objPpxfxbqfkf == mg.zoijcleaow.gxszxtbevo() ? objPpxfxbqfkf : wwaezpbzkn.f37140iobyxmoadg;
    }
}
