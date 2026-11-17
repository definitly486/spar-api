package nu1;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import m9.wkgbmnqykc;
import ru.myspar.proloyalty.core.base.api.bottomsheet.BaseBottomSheetDialogFragment;
import ru.myspar.proloyalty.subscription.api.model.SubscriptionDetailPayload;
import ru.myspar.proloyalty.subscription.api.model.SubscriptionSurveyDialogArgs;
import ru.myspar.proloyalty.subscription.impl.detail.presentation.SubscriptionDetailFragment;
import ru.myspar.proloyalty.subscription.impl.survey.SubscriptionSurveyBottomSheetDialogFragment;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf implements bu1.iobyxmoadg {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Fragment wkgbmnqykc(SubscriptionDetailPayload subscriptionDetailPayload, jyumaefscl it) {
        zdlpuopuiu.btonecajqb(it, "it");
        return SubscriptionDetailFragment.INSTANCE.iobyxmoadg(subscriptionDetailPayload);
    }

    @Override // bu1.iobyxmoadg
    public BaseBottomSheetDialogFragment iobyxmoadg(SubscriptionSurveyDialogArgs args) {
        zdlpuopuiu.btonecajqb(args, "args");
        return SubscriptionSurveyBottomSheetDialogFragment.INSTANCE.iobyxmoadg(args);
    }

    @Override // bu1.iobyxmoadg
    public wkgbmnqykc zoijcleaow(final SubscriptionDetailPayload payload) {
        zdlpuopuiu.btonecajqb(payload, "payload");
        return wkgbmnqykc.iobyxmoadg.zoijcleaow(wkgbmnqykc.f66572zoijcleaow, null, false, new m9.ppxfxbqfkf() { // from class: nu1.zoijcleaow
            @Override // m9.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj) {
                return ppxfxbqfkf.wkgbmnqykc(payload, (jyumaefscl) obj);
            }
        }, 3, null);
    }
}
