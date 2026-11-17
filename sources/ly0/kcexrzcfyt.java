package ly0;

import ru.myspar.proloyalty.core.domain.models.product.SearchCategoryModel;

/* JADX INFO: loaded from: classes5.dex */
public abstract class kcexrzcfyt {
    public static final SearchCategoryModel iobyxmoadg(SearchCategoryDto searchCategoryDto) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(searchCategoryDto, "<this>");
        String id2 = searchCategoryDto.getId();
        if (id2 == null) {
            id2 = "";
        }
        String image = searchCategoryDto.getImage();
        if (image == null) {
            image = "";
        }
        String title = searchCategoryDto.getTitle();
        if (title == null) {
            title = "";
        }
        String subtitle = searchCategoryDto.getSubtitle();
        return new SearchCategoryModel(id2, image, title, subtitle != null ? subtitle : "");
    }
}
