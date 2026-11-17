package u60;

import hg.jyumaefscl;
import hg.tzroggbefp;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.delivery.impl.interval.domain.models.IntervalDay;
import ru.myspar.delivery.impl.interval.domain.models.IntervalInfo;
import ru.myspar.delivery.impl.interval.domain.models.SelectedInterval;
import ru.myspar.delivery.impl.interval.domain.store.State;
import zg.gtknphoqwx;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow implements a8.ppxfxbqfkf {
    private final State ppxfxbqfkf(State state, String str, String str2) {
        return State.ppxfxbqfkf(state, null, false, false, null, new SelectedInterval(str, str2), 15, null);
    }

    private final State wkgbmnqykc(State state, List list) {
        Object next;
        LinkedHashMap linkedHashMap = new LinkedHashMap(gtknphoqwx.gxszxtbevo(tzroggbefp.eablkybsjg(jyumaefscl.cqumvgiudr(list, 10)), 16));
        SelectedInterval selectedInterval = null;
        for (Object obj : list) {
            IntervalDay intervalDay = (IntervalDay) obj;
            Iterator it = intervalDay.getIntervals().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((IntervalInfo) next).getIsSelected());
            IntervalInfo intervalInfo = (IntervalInfo) next;
            if (intervalInfo != null) {
                selectedInterval = new SelectedInterval(intervalDay.getDate(), intervalInfo.getValue());
            }
            linkedHashMap.put(intervalDay.getDate(), obj);
        }
        return State.ppxfxbqfkf(state, null, false, false, linkedHashMap, selectedInterval, 5, null);
    }

    @Override // a8.ppxfxbqfkf
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public State iobyxmoadg(State state, gxszxtbevo msg) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        zdlpuopuiu.btonecajqb(msg, "msg");
        if (msg instanceof gxszxtbevo.wkgbmnqykc) {
            return State.ppxfxbqfkf(state, null, ((gxszxtbevo.wkgbmnqykc) msg).iobyxmoadg(), false, null, null, 29, null);
        }
        if (msg instanceof gxszxtbevo.zoijcleaow) {
            return State.ppxfxbqfkf(state, null, false, ((gxszxtbevo.zoijcleaow) msg).iobyxmoadg(), null, null, 27, null);
        }
        if (msg instanceof gxszxtbevo.ppxfxbqfkf) {
            return wkgbmnqykc(state, ((gxszxtbevo.ppxfxbqfkf) msg).iobyxmoadg());
        }
        if (!(msg instanceof gxszxtbevo.iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        gxszxtbevo.iobyxmoadg iobyxmoadgVar = (gxszxtbevo.iobyxmoadg) msg;
        return ppxfxbqfkf(state, iobyxmoadgVar.iobyxmoadg(), iobyxmoadgVar.zoijcleaow());
    }
}
