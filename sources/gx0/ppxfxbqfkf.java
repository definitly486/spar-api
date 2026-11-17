package gx0;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.catalog.CatalogSection;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ppxfxbqfkf {
    public static final ax0.iobyxmoadg iobyxmoadg(CatalogSection catalogSection) {
        zdlpuopuiu.btonecajqb(catalogSection, "<this>");
        String id2 = catalogSection.getId();
        String parentId = catalogSection.getParentId();
        String name = catalogSection.getName();
        String pic = catalogSection.getPic();
        String icon = catalogSection.getIcon();
        String image = catalogSection.getImage();
        String appImage = catalogSection.getAppImage();
        String iconPng = catalogSection.getIconPng();
        boolean ageCheckedNeeded = catalogSection.getAgeCheckedNeeded();
        boolean showOnMain = catalogSection.getShowOnMain();
        int sortMain = catalogSection.getSortMain();
        mz0.ppxfxbqfkf sortType = catalogSection.getSortType();
        return new ax0.iobyxmoadg(id2, parentId, name, pic, icon, image, appImage, iconPng, ageCheckedNeeded, showOnMain, sortMain, sortType != null ? sortType.lqeggnwhkg() : null);
    }
}
