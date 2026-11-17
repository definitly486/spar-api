package d51;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.delivery.api.model.DeliveryIntervalPayload;
import ru.myspar.proloyalty.delivery.api.model.DeliveryOptionsArgs;
import ru.myspar.proloyalty.delivery.impl.interval.presentation.DeliveryIntervalFragment;
import ru.myspar.proloyalty.delivery.impl.options.presentation.DeliveryOptionsFragment;

/* JADX INFO: loaded from: classes5.dex */
public final class ppxfxbqfkf implements c51.iobyxmoadg {
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

    @Override // c51.iobyxmoadg
    public m9.wkgbmnqykc iobyxmoadg(final DeliveryOptionsArgs args) {
        zdlpuopuiu.btonecajqb(args, "args");
        return m9.wkgbmnqykc.iobyxmoadg.zoijcleaow(m9.wkgbmnqykc.f66572zoijcleaow, "DELIVERY_OPTIONS_SCREEN_KEY", false, new m9.ppxfxbqfkf() { // from class: d51.zoijcleaow
            @Override // m9.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj) {
                return ppxfxbqfkf.gxszxtbevo(args, (jyumaefscl) obj);
            }
        }, 2, null);
    }

    @Override // c51.iobyxmoadg
    public m9.wkgbmnqykc zoijcleaow(final DeliveryIntervalPayload args) {
        zdlpuopuiu.btonecajqb(args, "args");
        return m9.wkgbmnqykc.iobyxmoadg.zoijcleaow(m9.wkgbmnqykc.f66572zoijcleaow, "DELIVERY_INTERVAL_SCREEN_KEY", false, new m9.ppxfxbqfkf() { // from class: d51.iobyxmoadg
            @Override // m9.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj) {
                return ppxfxbqfkf.eablkybsjg(args, (jyumaefscl) obj);
            }
        }, 2, null);
    }
}
