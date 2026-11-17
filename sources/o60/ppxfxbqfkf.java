package o60;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.delivery.api.model.DeliveryIntervalPayload;
import ru.myspar.delivery.api.model.DeliveryOptionsArgs;
import ru.myspar.delivery.impl.interval.presentation.DeliveryIntervalFragment;
import ru.myspar.delivery.impl.options.presentation.DeliveryOptionsFragment;

/* JADX INFO: loaded from: classes4.dex */
public final class ppxfxbqfkf implements n60.iobyxmoadg {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Fragment eablkybsjg(DeliveryIntervalPayload deliveryIntervalPayload, jyumaefscl it) {
        zdlpuopuiu.btonecajqb(it, "it");
        return DeliveryIntervalFragment.INSTANCE.iobyxmoadg(deliveryIntervalPayload);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Fragment gxszxtbevo(DeliveryOptionsArgs deliveryOptionsArgs, jyumaefscl it) {
        zdlpuopuiu.btonecajqb(it, "it");
        return DeliveryOptionsFragment.INSTANCE.iobyxmoadg(deliveryOptionsArgs);
    }

    @Override // n60.iobyxmoadg
    public m9.wkgbmnqykc iobyxmoadg(final DeliveryIntervalPayload args) {
        zdlpuopuiu.btonecajqb(args, "args");
        return m9.wkgbmnqykc.iobyxmoadg.zoijcleaow(m9.wkgbmnqykc.f66572zoijcleaow, "DELIVERY_INTERVAL_SCREEN_KEY", false, new m9.ppxfxbqfkf() { // from class: o60.iobyxmoadg
            @Override // m9.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj) {
                return ppxfxbqfkf.eablkybsjg(args, (jyumaefscl) obj);
            }
        }, 2, null);
    }

    @Override // n60.iobyxmoadg
    public m9.wkgbmnqykc zoijcleaow(final DeliveryOptionsArgs args) {
        zdlpuopuiu.btonecajqb(args, "args");
        return m9.wkgbmnqykc.iobyxmoadg.zoijcleaow(m9.wkgbmnqykc.f66572zoijcleaow, "DELIVERY_OPTIONS_SCREEN_KEY", false, new m9.ppxfxbqfkf() { // from class: o60.zoijcleaow
            @Override // m9.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj) {
                return ppxfxbqfkf.gxszxtbevo(args, (jyumaefscl) obj);
            }
        }, 2, null);
    }
}
