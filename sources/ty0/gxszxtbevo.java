package ty0;

import gg.wwaezpbzkn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.myspar.proloyalty.core.domain.models.catalog.CatalogSection;

/* JADX INFO: loaded from: classes5.dex */
public final class gxszxtbevo implements l01.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final yw0.ppxfxbqfkf f111944iobyxmoadg;

    public gxszxtbevo(yw0.ppxfxbqfkf catalogDao) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(catalogDao, "catalogDao");
        this.f111944iobyxmoadg = catalogDao;
    }

    @Override // l01.zoijcleaow
    public Object iobyxmoadg(List list, lg.gxszxtbevo gxszxtbevoVar) {
        if (list == null || list.isEmpty()) {
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(gx0.ppxfxbqfkf.iobyxmoadg((CatalogSection) it.next()));
        }
        Object objZoijcleaow = this.f111944iobyxmoadg.zoijcleaow(arrayList, gxszxtbevoVar);
        return objZoijcleaow == mg.zoijcleaow.gxszxtbevo() ? objZoijcleaow : wwaezpbzkn.f37140iobyxmoadg;
    }
}
