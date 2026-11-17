package ms0;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.proloyalty.common.view.hint.model.HintUiModel;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zoijcleaow {
    public static final void iobyxmoadg(HintUiModel hint, HintDialogAnalyticsInfo analyticsInfo, Object listenerOwner) {
        zdlpuopuiu.btonecajqb(hint, "hint");
        zdlpuopuiu.btonecajqb(analyticsInfo, "analyticsInfo");
        zdlpuopuiu.btonecajqb(listenerOwner, "listenerOwner");
        iobyxmoadg iobyxmoadgVar = listenerOwner instanceof iobyxmoadg ? (iobyxmoadg) listenerOwner : null;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.ppxfxbqfkf(hint, analyticsInfo);
        }
    }
}
