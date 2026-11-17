package sh1;

import gx0.wkgbmnqykc;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ly0.ProductDto;
import ly0.ProductsReferencesDto;
import ph1.zoijcleaow;
import tg.draadjrbmk;
import th1.GetProductsResponse;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements draadjrbmk {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final wkgbmnqykc f106704zdlpuopuiu;

    public iobyxmoadg(wkgbmnqykc productDtoMapper) {
        zdlpuopuiu.btonecajqb(productDtoMapper, "productDtoMapper");
        this.f106704zdlpuopuiu = productDtoMapper;
    }

    @Override // tg.draadjrbmk
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public zoijcleaow invoke(GetProductsResponse response) {
        List listWflxmlrfwp;
        List hints;
        zdlpuopuiu.btonecajqb(response, "response");
        List<ProductDto> productList = response.getProductList();
        List listWflxmlrfwp2 = null;
        if (productList != null) {
            ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(productList, 10));
            for (ProductDto productDto : productList) {
                wkgbmnqykc wkgbmnqykcVar = this.f106704zdlpuopuiu;
                ProductsReferencesDto references = response.getReferences();
                if (references == null || (hints = references.getHints()) == null) {
                    listWflxmlrfwp = null;
                } else {
                    List hint = productDto.getHint();
                    if (hint == null) {
                        hint = jyumaefscl.wflxmlrfwp();
                    }
                    listWflxmlrfwp = yo0.iobyxmoadg.eablkybsjg(hints, hint);
                }
                if (listWflxmlrfwp == null) {
                    listWflxmlrfwp = jyumaefscl.wflxmlrfwp();
                }
                arrayList.add(wkgbmnqykcVar.zoijcleaow(productDto, listWflxmlrfwp, null));
            }
            listWflxmlrfwp2 = arrayList;
        }
        if (listWflxmlrfwp2 == null) {
            listWflxmlrfwp2 = jyumaefscl.wflxmlrfwp();
        }
        return new zoijcleaow(response.getTitle(), response.getImageBannerUrl(), response.getIsChangeProductCountEnabled(), listWflxmlrfwp2);
    }
}
