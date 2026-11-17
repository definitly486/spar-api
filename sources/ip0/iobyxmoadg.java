package ip0;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k21.ojitshcjhn;
import kotlin.jvm.internal.zdlpuopuiu;
import m91.gxszxtbevo;
import m91.wkgbmnqykc;
import m91.zoijcleaow;
import ru.myspar.proloyalty.core.domain.models.catalog.CatalogBanner;
import ru.myspar.proloyalty.core.domain.models.catalog.CatalogSection;
import ru.myspar.proloyalty.core.domain.models.catalog.CatalogWithSubCatalogs;

/* JADX INFO: loaded from: classes5.dex */
public abstract class iobyxmoadg {
    public static final ap0.iobyxmoadg iobyxmoadg(CatalogSection catalogSection, n91.iobyxmoadg colorsMapper) {
        zdlpuopuiu.btonecajqb(catalogSection, "<this>");
        zdlpuopuiu.btonecajqb(colorsMapper, "colorsMapper");
        return new ap0.iobyxmoadg(catalogSection.getId(), catalogSection.getName(), catalogSection.getImage(), catalogSection.getAgeCheckedNeeded(), false, catalogSection.getAdv(), colorsMapper.iobyxmoadg(catalogSection.getColorsModel()), 16, null);
    }

    public static final wkgbmnqykc ppxfxbqfkf(List list) {
        zdlpuopuiu.btonecajqb(list, "<this>");
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CatalogBanner catalogBanner = (CatalogBanner) it.next();
            String id2 = catalogBanner.getId();
            String image = catalogBanner.getImage();
            ojitshcjhn navigationLink = catalogBanner.getNavigationLink();
            String reference = catalogBanner.getReference();
            if (reference == null) {
                reference = "";
            }
            arrayList.add(new gxszxtbevo(id2, null, image, 0, null, "", null, null, null, catalogBanner.getTitle(), null, null, false, null, null, navigationLink, reference, false, null, catalogBanner.getAdv(), catalogBanner.getOnboardingId(), zoijcleaow.C1377zoijcleaow.f66634zoijcleaow, 135170, null));
        }
        return new wkgbmnqykc(null, arrayList);
    }

    public static final ap0.zoijcleaow zoijcleaow(CatalogWithSubCatalogs catalogWithSubCatalogs, n91.iobyxmoadg colorsMapper) {
        zdlpuopuiu.btonecajqb(catalogWithSubCatalogs, "<this>");
        zdlpuopuiu.btonecajqb(colorsMapper, "colorsMapper");
        CatalogSection rootCatalogSection = catalogWithSubCatalogs.getRootCatalogSection();
        ap0.iobyxmoadg iobyxmoadgVarIobyxmoadg = rootCatalogSection != null ? iobyxmoadg(rootCatalogSection, colorsMapper) : null;
        List childCatalogSections = catalogWithSubCatalogs.getChildCatalogSections();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(childCatalogSections, 10));
        Iterator it = childCatalogSections.iterator();
        while (it.hasNext()) {
            arrayList.add(iobyxmoadg((CatalogSection) it.next(), colorsMapper));
        }
        return new ap0.zoijcleaow(iobyxmoadgVarIobyxmoadg, arrayList);
    }
}
