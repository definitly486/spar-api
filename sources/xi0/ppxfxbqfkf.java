package xi0;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.orders.api.model.OrdersArgs;
import ru.myspar.orders.api.model.SpecificOrderArgs;
import ru.myspar.orders.impl.screens.orders.presentation.OrdersFragment;
import ru.myspar.orders.impl.screens.specific.presentation.SpecificOrderFragment;

/* JADX INFO: loaded from: classes3.dex */
public final class ppxfxbqfkf implements wi0.iobyxmoadg {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Fragment eablkybsjg(OrdersArgs ordersArgs, jyumaefscl it) {
        zdlpuopuiu.btonecajqb(it, "it");
        return OrdersFragment.INSTANCE.iobyxmoadg(ordersArgs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Fragment gxszxtbevo(SpecificOrderArgs specificOrderArgs, jyumaefscl it) {
        zdlpuopuiu.btonecajqb(it, "it");
        return SpecificOrderFragment.INSTANCE.iobyxmoadg(specificOrderArgs);
    }

    @Override // wi0.iobyxmoadg
    public m9.wkgbmnqykc iobyxmoadg(final OrdersArgs ordersArgs) {
        zdlpuopuiu.btonecajqb(ordersArgs, "ordersArgs");
        return m9.wkgbmnqykc.iobyxmoadg.zoijcleaow(m9.wkgbmnqykc.f66572zoijcleaow, null, false, new m9.ppxfxbqfkf() { // from class: xi0.iobyxmoadg
            @Override // m9.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj) {
                return ppxfxbqfkf.eablkybsjg(ordersArgs, (jyumaefscl) obj);
            }
        }, 3, null);
    }

    @Override // wi0.iobyxmoadg
    public m9.wkgbmnqykc zoijcleaow(final SpecificOrderArgs args) {
        zdlpuopuiu.btonecajqb(args, "args");
        return m9.wkgbmnqykc.iobyxmoadg.zoijcleaow(m9.wkgbmnqykc.f66572zoijcleaow, null, false, new m9.ppxfxbqfkf() { // from class: xi0.zoijcleaow
            @Override // m9.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj) {
                return ppxfxbqfkf.gxszxtbevo(args, (jyumaefscl) obj);
            }
        }, 3, null);
    }
}
