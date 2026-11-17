package vl1;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.rate.rate_order.api.models.RateOrderPayload;
import ru.myspar.proloyalty.rate.rate_order.impl.presentation.rate.RateOrderFragment;
import ru.myspar.proloyalty.rate.rate_order.impl.presentation.success.RateOrderSuccessFragment;

/* JADX INFO: loaded from: classes6.dex */
public final class gxszxtbevo implements ul1.iobyxmoadg {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Fragment eablkybsjg(RateOrderPayload rateOrderPayload, jyumaefscl it) {
        zdlpuopuiu.btonecajqb(it, "it");
        return RateOrderFragment.INSTANCE.iobyxmoadg(rateOrderPayload);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Fragment gxszxtbevo(RateOrderPayload rateOrderPayload, jyumaefscl it) {
        zdlpuopuiu.btonecajqb(it, "it");
        return RateOrderSuccessFragment.INSTANCE.iobyxmoadg(rateOrderPayload);
    }

    @Override // ul1.iobyxmoadg
    public m9.wkgbmnqykc iobyxmoadg(final RateOrderPayload payload) {
        zdlpuopuiu.btonecajqb(payload, "payload");
        return m9.wkgbmnqykc.iobyxmoadg.zoijcleaow(m9.wkgbmnqykc.f66572zoijcleaow, null, false, new m9.ppxfxbqfkf() { // from class: vl1.wkgbmnqykc
            @Override // m9.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj) {
                return gxszxtbevo.gxszxtbevo(payload, (jyumaefscl) obj);
            }
        }, 3, null);
    }

    @Override // ul1.iobyxmoadg
    public m9.wkgbmnqykc zoijcleaow(final RateOrderPayload payload) {
        zdlpuopuiu.btonecajqb(payload, "payload");
        return m9.wkgbmnqykc.iobyxmoadg.zoijcleaow(m9.wkgbmnqykc.f66572zoijcleaow, null, false, new m9.ppxfxbqfkf() { // from class: vl1.eablkybsjg
            @Override // m9.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj) {
                return gxszxtbevo.eablkybsjg(payload, (jyumaefscl) obj);
            }
        }, 3, null);
    }
}
