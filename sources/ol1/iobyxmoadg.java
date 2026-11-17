package ol1;

import android.content.Context;
import kotlin.jvm.internal.zdlpuopuiu;
import pl1.dxjokdxxww;
import ru.myspar.proloyalty.core.base.api.bottomsheet.BaseBottomSheetDialogFragment;
import ru.myspar.proloyalty.rate.rate_bonus_product.api.model.RateProductResultDialogArgs;
import ru.myspar.proloyalty.rate.rate_bonus_product.api.model.ReviewWithBonusesDialogArgs;
import ru.myspar.proloyalty.rate.rate_bonus_product.impl.presentation.RateBonusProductDialogFragment;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements nl1.iobyxmoadg {
    @Override // nl1.iobyxmoadg
    public BaseBottomSheetDialogFragment iobyxmoadg(ReviewWithBonusesDialogArgs args, tg.iobyxmoadg iobyxmoadgVar) {
        zdlpuopuiu.btonecajqb(args, "args");
        return RateBonusProductDialogFragment.INSTANCE.iobyxmoadg(args, iobyxmoadgVar);
    }

    @Override // nl1.iobyxmoadg
    public xr0.iobyxmoadg zoijcleaow(Context context, RateProductResultDialogArgs args) {
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(args, "args");
        return new dxjokdxxww(context, args);
    }
}
