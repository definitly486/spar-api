package bn1;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.base.mvi.bottomsheet.BaseMviBottomSheetDialogFragment;
import ru.myspar.proloyalty.sbp_recurring.api.model.SbpSelectBankAppDialogArgs;
import ru.myspar.proloyalty.sbp_recurring.impl.presentation.SbpSelectBankAppDialogFragment;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc implements zm1.iobyxmoadg {
    @Override // zm1.iobyxmoadg
    public BaseMviBottomSheetDialogFragment iobyxmoadg(SbpSelectBankAppDialogArgs args, draadjrbmk onSelectBank) {
        zdlpuopuiu.btonecajqb(args, "args");
        zdlpuopuiu.btonecajqb(onSelectBank, "onSelectBank");
        return SbpSelectBankAppDialogFragment.INSTANCE.iobyxmoadg(args).bfopjjpdmp(onSelectBank);
    }
}
