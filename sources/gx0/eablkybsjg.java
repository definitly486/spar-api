package gx0;

import dy0.RecommendationFeedsDto;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ly0.ProductDto;
import ly0.ProductsReferencesDto;
import ru.myspar.proloyalty.core.domain.models.catalog.ProductRecommendationsBlock;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
public final class eablkybsjg implements rgvfuqvkyq {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final wkgbmnqykc f38646zdlpuopuiu;

    public eablkybsjg(wkgbmnqykc productDtoToDomainMapper) {
        zdlpuopuiu.btonecajqb(productDtoToDomainMapper, "productDtoToDomainMapper");
        this.f38646zdlpuopuiu = productDtoToDomainMapper;
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
            arrayList.add(this.f38646zdlpuopuiu.ppxfxbqfkf((ProductDto) it.next(), productsReferencesDto, null));
        }
        return new ProductRecommendationsBlock(title, arrayList);
    }
}
