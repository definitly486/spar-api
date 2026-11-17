package ja0;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.product.FavoriteFilterSection;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg implements draadjrbmk {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final d60.iobyxmoadg f50927zdlpuopuiu;

    public iobyxmoadg(d60.iobyxmoadg resourcesManager) {
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        this.f50927zdlpuopuiu = resourcesManager;
    }

    private final ka0.iobyxmoadg zoijcleaow(FavoriteFilterSection favoriteFilterSection) {
        return new ka0.iobyxmoadg(favoriteFilterSection.getId(), favoriteFilterSection.getName(), false, 4, null);
    }

    @Override // tg.draadjrbmk
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public List invoke(List models) {
        zdlpuopuiu.btonecajqb(models, "models");
        List listPpxfxbqfkf = jyumaefscl.ppxfxbqfkf();
        listPpxfxbqfkf.add(new ka0.iobyxmoadg("FAVORITE_ITEM_ALL_ID", this.f50927zdlpuopuiu.getString(s40.draadjrbmk.special_products_more), true));
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(models, 10));
        Iterator it = models.iterator();
        while (it.hasNext()) {
            arrayList.add(zoijcleaow((FavoriteFilterSection) it.next()));
        }
        listPpxfxbqfkf.addAll(arrayList);
        return jyumaefscl.iobyxmoadg(listPpxfxbqfkf);
    }
}
