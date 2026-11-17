package u82;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import m9.wkgbmnqykc;
import ru.myspar.subscription.api.model.SubscriptionDetailPayload;
import ru.myspar.subscription.impl.detail.presentation.SubscriptionDetailFragment;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf implements i82.iobyxmoadg {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Fragment ppxfxbqfkf(SubscriptionDetailPayload subscriptionDetailPayload, jyumaefscl it) {
        zdlpuopuiu.btonecajqb(it, "it");
        return SubscriptionDetailFragment.INSTANCE.iobyxmoadg(subscriptionDetailPayload);
    }

    @Override // i82.iobyxmoadg
    public wkgbmnqykc iobyxmoadg(final SubscriptionDetailPayload payload) {
        zdlpuopuiu.btonecajqb(payload, "payload");
        return wkgbmnqykc.iobyxmoadg.zoijcleaow(wkgbmnqykc.f66572zoijcleaow, null, false, new m9.ppxfxbqfkf() { // from class: u82.zoijcleaow
            @Override // m9.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj) {
                return ppxfxbqfkf.ppxfxbqfkf(payload, (jyumaefscl) obj);
            }
        }, 3, null);
    }
}
