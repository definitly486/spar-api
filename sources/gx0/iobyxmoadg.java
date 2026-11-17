package gx0;

import dy0.CatalogBannerDto;
import k21.ojitshcjhn;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.catalog.CatalogBanner;

/* JADX INFO: loaded from: classes5.dex */
public abstract class iobyxmoadg {
    public static final CatalogBanner iobyxmoadg(CatalogBannerDto catalogBannerDto) {
        zdlpuopuiu.btonecajqb(catalogBannerDto, "<this>");
        String id2 = catalogBannerDto.getId();
        String title = catalogBannerDto.getTitle();
        String image = catalogBannerDto.getImage();
        ojitshcjhn ojitshcjhnVarIobyxmoadg = ojitshcjhn.f53516yggfygwlhe.iobyxmoadg(catalogBannerDto.getNavLink());
        String reference = catalogBannerDto.getReference();
        String adv = catalogBannerDto.getAdv();
        if (adv == null) {
            adv = "";
        }
        return new CatalogBanner(id2, title, image, ojitshcjhnVarIobyxmoadg, reference, adv, catalogBannerDto.getOnboardingId());
    }
}
