package lx1;

import android.content.Context;
import m9.wkgbmnqykc;
import ru.myspar.core.base.mvi.bottomsheet.BaseComposeMviBottomSheetDialogFragment;
import ru.myspar.core.base.mvi.bottomsheet.BaseMviBottomSheetDialogFragment;
import ru.myspar.purchases.api.model.PurchaseListAddProductDialogArgs;
import ru.myspar.purchases.api.model.PurchaseListSharedWithYouDialogArgs;
import ru.myspar.purchases.api.model.PurchaseListsArgs;
import ru.myspar.purchases.api.model.PurchasesHistoryArgs;

/* JADX INFO: loaded from: classes6.dex */
public interface iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final C1340iobyxmoadg f64361iobyxmoadg = C1340iobyxmoadg.f64362iobyxmoadg;

    /* JADX INFO: renamed from: lx1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C1340iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ C1340iobyxmoadg f64362iobyxmoadg = new C1340iobyxmoadg();

        private C1340iobyxmoadg() {
        }
    }

    static /* synthetic */ wkgbmnqykc gxszxtbevo(iobyxmoadg iobyxmoadgVar, PurchaseListsArgs purchaseListsArgs, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listScreen");
        }
        if ((i13 & 1) != 0) {
            purchaseListsArgs = new PurchaseListsArgs(null, 1, null);
        }
        return iobyxmoadgVar.lqeggnwhkg(purchaseListsArgs);
    }

    static /* synthetic */ wkgbmnqykc ppxfxbqfkf(iobyxmoadg iobyxmoadgVar, PurchasesHistoryArgs purchasesHistoryArgs, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: historyScreen");
        }
        if ((i13 & 1) != 0) {
            purchasesHistoryArgs = new PurchasesHistoryArgs(null, 1, null);
        }
        return iobyxmoadgVar.dxjokdxxww(purchasesHistoryArgs);
    }

    static /* synthetic */ wkgbmnqykc wkgbmnqykc(iobyxmoadg iobyxmoadgVar, String str, String str2, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listDetailsScreen");
        }
        if ((i13 & 2) != 0) {
            str2 = "";
        }
        return iobyxmoadgVar.zoijcleaow(str, str2);
    }

    wkgbmnqykc dxjokdxxww(PurchasesHistoryArgs purchasesHistoryArgs);

    BaseMviBottomSheetDialogFragment eablkybsjg(PurchaseListSharedWithYouDialogArgs purchaseListSharedWithYouDialogArgs);

    dt.iobyxmoadg iobyxmoadg(Context context, tg.iobyxmoadg iobyxmoadgVar);

    wkgbmnqykc lqeggnwhkg(PurchaseListsArgs purchaseListsArgs);

    BaseComposeMviBottomSheetDialogFragment nufgyqmvbu(PurchaseListAddProductDialogArgs purchaseListAddProductDialogArgs, tg.iobyxmoadg iobyxmoadgVar);

    wkgbmnqykc zoijcleaow(String str, String str2);
}
