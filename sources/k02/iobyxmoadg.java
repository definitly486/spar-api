package k02;

import ru.myspar.core.base.api.bottomsheet.BaseBottomSheetDialogFragment;
import ru.myspar.rate.rate_product.api.model.RateProductArgs;

/* JADX INFO: loaded from: classes6.dex */
public interface iobyxmoadg {
    static /* synthetic */ BaseBottomSheetDialogFragment zoijcleaow(iobyxmoadg iobyxmoadgVar, RateProductArgs rateProductArgs, tg.iobyxmoadg iobyxmoadgVar2, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rateDialog");
        }
        if ((i13 & 2) != 0) {
            iobyxmoadgVar2 = null;
        }
        return iobyxmoadgVar.iobyxmoadg(rateProductArgs, iobyxmoadgVar2);
    }

    BaseBottomSheetDialogFragment iobyxmoadg(RateProductArgs rateProductArgs, tg.iobyxmoadg iobyxmoadgVar);
}
