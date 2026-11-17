package jz1;

import ez1.SharedPurchaseListDetailsDto;
import ez1.SharedPurchaseProductDto;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.purchases_list.api.models.SharedPurchaseListDetails;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ppxfxbqfkf {
    public static final SharedPurchaseListDetails iobyxmoadg(SharedPurchaseListDetailsDto sharedPurchaseListDetailsDto) {
        zdlpuopuiu.btonecajqb(sharedPurchaseListDetailsDto, "<this>");
        List productsBuy = sharedPurchaseListDetailsDto.getProductsBuy();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(productsBuy, 10));
        Iterator it = productsBuy.iterator();
        while (it.hasNext()) {
            arrayList.add(((SharedPurchaseProductDto) it.next()).getArticle());
        }
        List productsBought = sharedPurchaseListDetailsDto.getProductsBought();
        ArrayList arrayList2 = new ArrayList(jyumaefscl.cqumvgiudr(productsBought, 10));
        Iterator it2 = productsBought.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((SharedPurchaseProductDto) it2.next()).getArticle());
        }
        List listIxidwrxhsl = jyumaefscl.ixidwrxhsl(arrayList, arrayList2);
        return new SharedPurchaseListDetails(sharedPurchaseListDetailsDto.getId(), sharedPurchaseListDetailsDto.getName(), listIxidwrxhsl.size(), listIxidwrxhsl);
    }
}
