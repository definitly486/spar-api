package ly;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import lz.RecommendationFeedsDto;
import ru.myspar.core.domain.models.catalog.ProductRecommendationsBlock;
import tg.rgvfuqvkyq;
import tz.ProductDto;
import tz.ProductsReferencesDto;

/* JADX INFO: loaded from: classes4.dex */
public final class eablkybsjg implements rgvfuqvkyq {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final wkgbmnqykc f64366zdlpuopuiu;

    public eablkybsjg(wkgbmnqykc productDtoToDomainMapper) {
        zdlpuopuiu.btonecajqb(productDtoToDomainMapper, "productDtoToDomainMapper");
        this.f64366zdlpuopuiu = productDtoToDomainMapper;
    }

    @Override // tg.rgvfuqvkyq
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public ProductRecommendationsBlock invoke(RecommendationFeedsDto dto, ProductsReferencesDto productsReferencesDto) {
        zdlpuopuiu.btonecajqb(dto, "dto");
        String title = dto.getTitle();
        if (title == null) {
            title = "";
        }
        List products = dto.getProducts();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(products, 10));
        Iterator it = products.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f64366zdlpuopuiu.ppxfxbqfkf((ProductDto) it.next(), productsReferencesDto, null));
        }
        return new ProductRecommendationsBlock(title, arrayList);
    }
}
