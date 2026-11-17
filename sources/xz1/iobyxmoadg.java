package xz1;

import android.content.Context;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.base.api.bottomsheet.BaseBottomSheetDialogFragment;
import ru.myspar.rate.rate_bonus_product.api.model.RateProductResultDialogArgs;
import ru.myspar.rate.rate_bonus_product.api.model.ReviewWithBonusesDialogArgs;
import ru.myspar.rate.rate_bonus_product.impl.presentation.RateBonusProductDialogFragment;
import yz1.dxjokdxxww;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements wz1.iobyxmoadg {
    @Override // wz1.iobyxmoadg
    public dt.iobyxmoadg iobyxmoadg(Context context, RateProductResultDialogArgs args) {
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(args, "args");
        return new dxjokdxxww(context, args);
    }

    @Override // wz1.iobyxmoadg
    public BaseBottomSheetDialogFragment zoijcleaow(ReviewWithBonusesDialogArgs args, tg.iobyxmoadg iobyxmoadgVar) {
        zdlpuopuiu.btonecajqb(args, "args");
        return RateBonusProductDialogFragment.INSTANCE.iobyxmoadg(args, iobyxmoadgVar);
    }
}
