package ly;

import kotlin.jvm.internal.zdlpuopuiu;
import lz.CatalogBannerDto;
import ru.myspar.core.domain.models.catalog.CatalogBanner;

/* JADX INFO: loaded from: classes4.dex */
public abstract class iobyxmoadg {
    public static final CatalogBanner iobyxmoadg(CatalogBannerDto catalogBannerDto) {
        zdlpuopuiu.btonecajqb(catalogBannerDto, "<this>");
        String id2 = catalogBannerDto.getId();
        String title = catalogBannerDto.getTitle();
        String image = catalogBannerDto.getImage();
        f40.zoijcleaow zoijcleaowVarIobyxmoadg = f40.zoijcleaow.f32832yggfygwlhe.iobyxmoadg(catalogBannerDto.getNavLink());
        String reference = catalogBannerDto.getReference();
        String adv = catalogBannerDto.getAdv();
        if (adv == null) {
            adv = "";
        }
        return new CatalogBanner(id2, title, image, zoijcleaowVarIobyxmoadg, reference, adv, catalogBannerDto.getOnboardingId());
    }
}
