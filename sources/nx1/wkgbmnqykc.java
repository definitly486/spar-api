package nx1;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.base.mvi.bottomsheet.BaseComposeMviBottomSheetDialogFragment;
import ru.myspar.core.base.mvi.bottomsheet.BaseMviBottomSheetDialogFragment;
import ru.myspar.purchases.api.model.PurchaseListAddProductDialogArgs;
import ru.myspar.purchases.api.model.PurchaseListSharedWithYouDialogArgs;
import ru.myspar.purchases.api.model.PurchaseListsArgs;
import ru.myspar.purchases.api.model.PurchasesHistoryArgs;
import ru.myspar.purchases.api.model.PurchasesListDetailsArgs;
import ru.myspar.purchases.impl.history.presentation.PurchasesHistoryFragment;
import ru.myspar.purchases.impl.list_add_product.presentation.PurchaseListAddProductDialogFragment;
import ru.myspar.purchases.impl.list_details.presentation.PurchasesListDetailsFragment;
import ru.myspar.purchases.impl.list_shared_with_you.presentation.PurchaseListSharedWithYouDialogFragment;
import ru.myspar.purchases.impl.lists.presentation.PurchaseListsFragment;

/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc implements lx1.iobyxmoadg {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Fragment agtfadlqog(String str, String str2, jyumaefscl it) {
        zdlpuopuiu.btonecajqb(it, "it");
        return PurchasesListDetailsFragment.INSTANCE.iobyxmoadg(new PurchasesListDetailsArgs(str, str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Fragment ojitshcjhn(PurchaseListsArgs purchaseListsArgs, jyumaefscl it) {
        zdlpuopuiu.btonecajqb(it, "it");
        return PurchaseListsFragment.INSTANCE.iobyxmoadg(purchaseListsArgs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Fragment wflxmlrfwp(PurchasesHistoryArgs purchasesHistoryArgs, jyumaefscl it) {
        zdlpuopuiu.btonecajqb(it, "it");
        return PurchasesHistoryFragment.INSTANCE.iobyxmoadg(purchasesHistoryArgs);
    }

    @Override // lx1.iobyxmoadg
    public m9.wkgbmnqykc dxjokdxxww(final PurchasesHistoryArgs args) {
        zdlpuopuiu.btonecajqb(args, "args");
        return m9.wkgbmnqykc.iobyxmoadg.zoijcleaow(m9.wkgbmnqykc.f66572zoijcleaow, "PURCHASE_HISTORY_SCREEN_KEY", false, new m9.ppxfxbqfkf() { // from class: nx1.iobyxmoadg
            @Override // m9.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj) {
                return wkgbmnqykc.wflxmlrfwp(args, (jyumaefscl) obj);
            }
        }, 2, null);
    }

    @Override // lx1.iobyxmoadg
    public BaseMviBottomSheetDialogFragment eablkybsjg(PurchaseListSharedWithYouDialogArgs args) {
        zdlpuopuiu.btonecajqb(args, "args");
        return PurchaseListSharedWithYouDialogFragment.INSTANCE.iobyxmoadg(args);
    }

    @Override // lx1.iobyxmoadg
    public dt.iobyxmoadg iobyxmoadg(Context context, tg.iobyxmoadg confirmClickListener) {
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(confirmClickListener, "confirmClickListener");
        return new ox1.wkgbmnqykc(context, confirmClickListener);
    }

    @Override // lx1.iobyxmoadg
    public m9.wkgbmnqykc lqeggnwhkg(final PurchaseListsArgs args) {
        zdlpuopuiu.btonecajqb(args, "args");
        return m9.wkgbmnqykc.iobyxmoadg.zoijcleaow(m9.wkgbmnqykc.f66572zoijcleaow, "PURCHASE_LIST_SCREEN_KEY", false, new m9.ppxfxbqfkf() { // from class: nx1.ppxfxbqfkf
            @Override // m9.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj) {
                return wkgbmnqykc.ojitshcjhn(args, (jyumaefscl) obj);
            }
        }, 2, null);
    }

    @Override // lx1.iobyxmoadg
    public BaseComposeMviBottomSheetDialogFragment nufgyqmvbu(PurchaseListAddProductDialogArgs args, tg.iobyxmoadg action) {
        zdlpuopuiu.btonecajqb(args, "args");
        zdlpuopuiu.btonecajqb(action, "action");
        return PurchaseListAddProductDialogFragment.INSTANCE.iobyxmoadg(args).oipsdeybqn(action);
    }

    @Override // lx1.iobyxmoadg
    public m9.wkgbmnqykc zoijcleaow(final String listId, final String listName) {
        zdlpuopuiu.btonecajqb(listId, "listId");
        zdlpuopuiu.btonecajqb(listName, "listName");
        return m9.wkgbmnqykc.iobyxmoadg.zoijcleaow(m9.wkgbmnqykc.f66572zoijcleaow, "PURCHASE_LIST_DETAILS_SCREEN_KEY", false, new m9.ppxfxbqfkf() { // from class: nx1.zoijcleaow
            @Override // m9.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj) {
                return wkgbmnqykc.agtfadlqog(listId, listName, (jyumaefscl) obj);
            }
        }, 2, null);
    }
}
