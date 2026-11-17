package xf1;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.orders.api.model.OrdersArgs;
import ru.myspar.proloyalty.orders.api.model.SpecificOrderArgs;
import ru.myspar.proloyalty.orders.impl.screens.orders.presentation.OrdersFragment;
import ru.myspar.proloyalty.orders.impl.screens.specific.presentation.SpecificOrderFragment;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf implements wf1.iobyxmoadg {
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

    @Override // wf1.iobyxmoadg
    public m9.wkgbmnqykc iobyxmoadg(final SpecificOrderArgs args) {
        zdlpuopuiu.btonecajqb(args, "args");
        return m9.wkgbmnqykc.iobyxmoadg.zoijcleaow(m9.wkgbmnqykc.f66572zoijcleaow, null, false, new m9.ppxfxbqfkf() { // from class: xf1.zoijcleaow
            @Override // m9.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj) {
                return ppxfxbqfkf.gxszxtbevo(args, (jyumaefscl) obj);
            }
        }, 3, null);
    }

    @Override // wf1.iobyxmoadg
    public m9.wkgbmnqykc zoijcleaow(final OrdersArgs ordersArgs) {
        zdlpuopuiu.btonecajqb(ordersArgs, "ordersArgs");
        return m9.wkgbmnqykc.iobyxmoadg.zoijcleaow(m9.wkgbmnqykc.f66572zoijcleaow, null, false, new m9.ppxfxbqfkf() { // from class: xf1.iobyxmoadg
            @Override // m9.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj) {
                return ppxfxbqfkf.eablkybsjg(ordersArgs, (jyumaefscl) obj);
            }
        }, 3, null);
    }
}
