package wd1;

import java.util.Iterator;
import kotlin.jvm.internal.zdlpuopuiu;
import xd1.OrderStatusDto;

/* JADX INFO: loaded from: classes5.dex */
public abstract class nufgyqmvbu {
    public static final ce1.wkgbmnqykc iobyxmoadg(String serverTypeValue) {
        Object next;
        zdlpuopuiu.btonecajqb(serverTypeValue, "serverTypeValue");
        Iterator<E> it = ce1.wkgbmnqykc.wkgbmnqykc().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!zdlpuopuiu.eablkybsjg(((ce1.wkgbmnqykc) next).lqeggnwhkg(), serverTypeValue));
        ce1.wkgbmnqykc wkgbmnqykcVar = (ce1.wkgbmnqykc) next;
        return wkgbmnqykcVar == null ? ce1.wkgbmnqykc.IN_TIME : wkgbmnqykcVar;
    }

    public static final ce1.ppxfxbqfkf zoijcleaow(OrderStatusDto orderStatusDto) {
        zdlpuopuiu.btonecajqb(orderStatusDto, "<this>");
        return new ce1.ppxfxbqfkf(orderStatusDto.getId(), iobyxmoadg(orderStatusDto.getType()), orderStatusDto.getMessage(), orderStatusDto.getEmoji());
    }
}
