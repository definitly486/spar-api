package cq0;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.catalog.impl.search.models.SearchCategoryUiModel;
import ru.myspar.proloyalty.core.domain.models.product.SearchCategoryModel;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow implements draadjrbmk {
    private final SearchCategoryUiModel zoijcleaow(SearchCategoryModel searchCategoryModel) {
        String id2 = searchCategoryModel.getId();
        if (id2 == null) {
            id2 = "";
        }
        String image = searchCategoryModel.getImage();
        if (image == null) {
            image = "";
        }
        String title = searchCategoryModel.getTitle();
        if (title == null) {
            title = "";
        }
        String subtitle = searchCategoryModel.getSubtitle();
        return new SearchCategoryUiModel(id2, image, title, subtitle != null ? subtitle : "");
    }

    @Override // tg.draadjrbmk
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public List invoke(List items) {
        zdlpuopuiu.btonecajqb(items, "items");
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(items, 10));
        Iterator it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(zoijcleaow((SearchCategoryModel) it.next()));
        }
        return arrayList;
    }
}
