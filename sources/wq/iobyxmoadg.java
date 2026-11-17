package wq;

import f40.zoijcleaow;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import nb0.eablkybsjg;
import nb0.wkgbmnqykc;
import ru.myspar.core.domain.models.catalog.CatalogBanner;
import ru.myspar.core.domain.models.catalog.CatalogSection;
import ru.myspar.core.domain.models.catalog.CatalogWithSubCatalogs;

/* JADX INFO: loaded from: classes4.dex */
public abstract class iobyxmoadg {
    public static final wkgbmnqykc iobyxmoadg(List list) {
        zdlpuopuiu.btonecajqb(list, "<this>");
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CatalogBanner catalogBanner = (CatalogBanner) it.next();
            String id2 = catalogBanner.getId();
            String image = catalogBanner.getImage();
            zoijcleaow navigationLink = catalogBanner.getNavigationLink();
            String reference = catalogBanner.getReference();
            if (reference == null) {
                reference = "";
            }
            arrayList.add(new eablkybsjg(id2, null, image, 0, null, "", null, null, null, catalogBanner.getTitle(), null, null, false, null, null, navigationLink, reference, false, null, catalogBanner.getAdv(), catalogBanner.getOnboardingId(), nb0.zoijcleaow.C1496zoijcleaow.f69538ppxfxbqfkf, 135170, null));
        }
        return new wkgbmnqykc(null, arrayList);
    }

    public static final oq.zoijcleaow ppxfxbqfkf(CatalogWithSubCatalogs catalogWithSubCatalogs, ob0.iobyxmoadg colorsMapper) {
        zdlpuopuiu.btonecajqb(catalogWithSubCatalogs, "<this>");
        zdlpuopuiu.btonecajqb(colorsMapper, "colorsMapper");
        CatalogSection rootCatalogSection = catalogWithSubCatalogs.getRootCatalogSection();
        oq.iobyxmoadg iobyxmoadgVarZoijcleaow = rootCatalogSection != null ? zoijcleaow(rootCatalogSection, colorsMapper) : null;
        List childCatalogSections = catalogWithSubCatalogs.getChildCatalogSections();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(childCatalogSections, 10));
        Iterator it = childCatalogSections.iterator();
        while (it.hasNext()) {
            arrayList.add(zoijcleaow((CatalogSection) it.next(), colorsMapper));
        }
        return new oq.zoijcleaow(iobyxmoadgVarZoijcleaow, arrayList);
    }

    public static final oq.iobyxmoadg zoijcleaow(CatalogSection catalogSection, ob0.iobyxmoadg colorsMapper) {
        zdlpuopuiu.btonecajqb(catalogSection, "<this>");
        zdlpuopuiu.btonecajqb(colorsMapper, "colorsMapper");
        return new oq.iobyxmoadg(catalogSection.getId(), catalogSection.getName(), catalogSection.getImage(), catalogSection.getAgeCheckedNeeded(), false, catalogSection.getAdv(), colorsMapper.iobyxmoadg(catalogSection.getColorsModel()), 16, null);
    }
}
