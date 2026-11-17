package gx0;

import dy0.CatalogSectionDto;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.catalog.CatalogSection;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zoijcleaow {
    public static final CatalogSection iobyxmoadg(CatalogSectionDto catalogSectionDto, List list) {
        zdlpuopuiu.btonecajqb(catalogSectionDto, "<this>");
        String id2 = catalogSectionDto.getId();
        String parentId = catalogSectionDto.getParentId();
        String name = catalogSectionDto.getName();
        String titleImage = catalogSectionDto.getTitleImage();
        String pic = catalogSectionDto.getPic();
        if (pic == null) {
            pic = "";
        }
        String icon = catalogSectionDto.getIcon();
        if (icon == null) {
            icon = "";
        }
        String image = catalogSectionDto.getImage();
        if (image == null) {
            image = "";
        }
        String appImage = catalogSectionDto.getAppImage();
        if (appImage == null) {
            appImage = "";
        }
        String iconPng = catalogSectionDto.getIconPng();
        boolean ageCheckedNeeded = catalogSectionDto.getAgeCheckedNeeded();
        boolean showOnMain = catalogSectionDto.getShowOnMain();
        int sortMain = catalogSectionDto.getSortMain();
        String adv = catalogSectionDto.getAdv();
        if (adv == null) {
            adv = "";
        }
        return new CatalogSection(id2, parentId, name, titleImage, pic, icon, image, appImage, iconPng, ageCheckedNeeded, showOnMain, sortMain, adv, jx0.zoijcleaow.zoijcleaow(catalogSectionDto.getColorType(), list), mz0.wkgbmnqykc.zoijcleaow(mz0.ppxfxbqfkf.f68192yggfygwlhe, catalogSectionDto.getSortType()));
    }
}
