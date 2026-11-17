package n81;

import b31.wflxmlrfwp;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.product.FavoriteFilterSection;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg implements draadjrbmk {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final q41.iobyxmoadg f69375zdlpuopuiu;

    public iobyxmoadg(q41.iobyxmoadg resourcesManager) {
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        this.f69375zdlpuopuiu = resourcesManager;
    }

    private final o81.iobyxmoadg zoijcleaow(FavoriteFilterSection favoriteFilterSection) {
        return new o81.iobyxmoadg(favoriteFilterSection.getId(), favoriteFilterSection.getName(), false, 4, null);
    }

    @Override // tg.draadjrbmk
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public List invoke(List models) {
        zdlpuopuiu.btonecajqb(models, "models");
        List listPpxfxbqfkf = jyumaefscl.ppxfxbqfkf();
        listPpxfxbqfkf.add(new o81.iobyxmoadg("FAVORITE_ITEM_ALL_ID", this.f69375zdlpuopuiu.getString(wflxmlrfwp.proloyalty_special_products_more), true));
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(models, 10));
        Iterator it = models.iterator();
        while (it.hasNext()) {
            arrayList.add(zoijcleaow((FavoriteFilterSection) it.next()));
        }
        listPpxfxbqfkf.addAll(arrayList);
        return jyumaefscl.iobyxmoadg(listPpxfxbqfkf);
    }
}
