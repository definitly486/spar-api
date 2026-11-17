package py1;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.purchases.impl.lists.presentation.model.PurchaseListUiModel;
import ru.myspar.purchases_list.api.models.PurchaseList;

/* JADX INFO: loaded from: classes6.dex */
public abstract class iobyxmoadg {
    public static final PurchaseListUiModel iobyxmoadg(PurchaseList purchaseList) {
        zdlpuopuiu.btonecajqb(purchaseList, "<this>");
        return new PurchaseListUiModel(purchaseList.getId(), purchaseList.getName(), purchaseList.getProducts().size(), false, 8, null);
    }
}
