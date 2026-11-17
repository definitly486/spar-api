package rg0;

import java.util.Iterator;
import kotlin.jvm.internal.zdlpuopuiu;
import sg0.OrderStatusDto;

/* JADX INFO: loaded from: classes4.dex */
public abstract class dxjokdxxww {
    public static final xg0.lqeggnwhkg iobyxmoadg(String serverTypeValue) {
        Object next;
        zdlpuopuiu.btonecajqb(serverTypeValue, "serverTypeValue");
        Iterator<E> it = xg0.lqeggnwhkg.wkgbmnqykc().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!zdlpuopuiu.eablkybsjg(((xg0.lqeggnwhkg) next).lqeggnwhkg(), serverTypeValue));
        xg0.lqeggnwhkg lqeggnwhkgVar = (xg0.lqeggnwhkg) next;
        return lqeggnwhkgVar == null ? xg0.lqeggnwhkg.IN_TIME : lqeggnwhkgVar;
    }

    public static final xg0.gxszxtbevo zoijcleaow(OrderStatusDto orderStatusDto) {
        zdlpuopuiu.btonecajqb(orderStatusDto, "<this>");
        return new xg0.gxszxtbevo(orderStatusDto.getId(), iobyxmoadg(orderStatusDto.getType()), orderStatusDto.getMessage(), orderStatusDto.getEmoji());
    }
}
