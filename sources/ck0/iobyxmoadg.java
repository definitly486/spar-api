package ck0;

import dk0.GetProductsResponse;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ly.wkgbmnqykc;
import tg.draadjrbmk;
import tz.ProductDto;
import tz.ProductsReferencesDto;
import zj0.zoijcleaow;

/* JADX INFO: loaded from: classes3.dex */
public final class iobyxmoadg implements draadjrbmk {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final wkgbmnqykc f19958zdlpuopuiu;

    public iobyxmoadg(wkgbmnqykc productDtoMapper) {
        zdlpuopuiu.btonecajqb(productDtoMapper, "productDtoMapper");
        this.f19958zdlpuopuiu = productDtoMapper;
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
                wkgbmnqykc wkgbmnqykcVar = this.f19958zdlpuopuiu;
                ProductsReferencesDto references = response.getReferences();
                if (references == null || (hints = references.getHints()) == null) {
                    listWflxmlrfwp = null;
                } else {
                    List hint = productDto.getHint();
                    if (hint == null) {
                        hint = jyumaefscl.wflxmlrfwp();
                    }
                    listWflxmlrfwp = mq.iobyxmoadg.eablkybsjg(hints, hint);
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
