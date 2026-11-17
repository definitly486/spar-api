package ri1;

import android.content.Context;
import m9.wkgbmnqykc;
import ru.myspar.proloyalty.core.base.mvi.bottomsheet.BaseComposeMviBottomSheetDialogFragment;
import ru.myspar.proloyalty.core.base.mvi.bottomsheet.BaseMviBottomSheetDialogFragment;
import ru.myspar.proloyalty.purchases.api.model.PurchaseListAddProductDialogArgs;
import ru.myspar.proloyalty.purchases.api.model.PurchaseListSharedWithYouDialogArgs;
import ru.myspar.proloyalty.purchases.api.model.PurchaseListsArgs;
import ru.myspar.proloyalty.purchases.api.model.PurchasesHistoryArgs;

/* JADX INFO: loaded from: classes6.dex */
public interface iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final C1852iobyxmoadg f82704iobyxmoadg = C1852iobyxmoadg.f82705iobyxmoadg;

    /* JADX INFO: renamed from: ri1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C1852iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ C1852iobyxmoadg f82705iobyxmoadg = new C1852iobyxmoadg();

        private C1852iobyxmoadg() {
        }
    }

    static /* synthetic */ wkgbmnqykc eablkybsjg(iobyxmoadg iobyxmoadgVar, PurchasesHistoryArgs purchasesHistoryArgs, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: historyScreen");
        }
        if ((i13 & 1) != 0) {
            purchasesHistoryArgs = new PurchasesHistoryArgs(null, 1, null);
        }
        return iobyxmoadgVar.ppxfxbqfkf(purchasesHistoryArgs);
    }

    static /* synthetic */ wkgbmnqykc gxszxtbevo(iobyxmoadg iobyxmoadgVar, String str, String str2, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listDetailsScreen");
        }
        if ((i13 & 2) != 0) {
            str2 = "";
        }
        return iobyxmoadgVar.zoijcleaow(str, str2);
    }

    static /* synthetic */ wkgbmnqykc lqeggnwhkg(iobyxmoadg iobyxmoadgVar, PurchaseListsArgs purchaseListsArgs, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listScreen");
        }
        if ((i13 & 1) != 0) {
            purchaseListsArgs = new PurchaseListsArgs(null, 1, null);
        }
        return iobyxmoadgVar.wkgbmnqykc(purchaseListsArgs);
    }

    BaseComposeMviBottomSheetDialogFragment dxjokdxxww(PurchaseListAddProductDialogArgs purchaseListAddProductDialogArgs, tg.iobyxmoadg iobyxmoadgVar);

    xr0.iobyxmoadg iobyxmoadg(Context context, tg.iobyxmoadg iobyxmoadgVar);

    BaseMviBottomSheetDialogFragment nufgyqmvbu(PurchaseListSharedWithYouDialogArgs purchaseListSharedWithYouDialogArgs);

    wkgbmnqykc ppxfxbqfkf(PurchasesHistoryArgs purchasesHistoryArgs);

    wkgbmnqykc wkgbmnqykc(PurchaseListsArgs purchaseListsArgs);

    wkgbmnqykc zoijcleaow(String str, String str2);
}
