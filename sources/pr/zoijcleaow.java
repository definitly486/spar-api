package pr;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.product.SearchFeatureModel;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zoijcleaow {
    public static final iobyxmoadg iobyxmoadg(SearchFeatureModel searchFeatureModel) {
        zdlpuopuiu.btonecajqb(searchFeatureModel, "<this>");
        String id2 = searchFeatureModel.getId();
        String pic = searchFeatureModel.getPic();
        return new iobyxmoadg(id2, searchFeatureModel.getName(), pic, searchFeatureModel.getNavlink(), searchFeatureModel.getReference());
    }
}
