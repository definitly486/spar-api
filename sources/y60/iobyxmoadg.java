package y60;

import gg.vdvldrhtss;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.zdlpuopuiu;
import qs.eablkybsjg;
import ru.myspar.delivery.impl.interval.domain.models.IntervalDay;
import ru.myspar.delivery.impl.interval.domain.models.IntervalInfo;
import ru.myspar.delivery.impl.interval.domain.models.SelectedInterval;
import ru.myspar.delivery.impl.interval.domain.store.State;
import tg.draadjrbmk;
import w60.gxszxtbevo;
import z60.ppxfxbqfkf;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg implements draadjrbmk {
    private final ppxfxbqfkf ppxfxbqfkf(IntervalInfo intervalInfo, String str, SelectedInterval selectedInterval) {
        String str2 = str + intervalInfo.getValue();
        String value = intervalInfo.getValue();
        String deliveryPrice = intervalInfo.getDeliveryPrice();
        boolean z13 = false;
        if (selectedInterval != null && zdlpuopuiu.eablkybsjg(selectedInterval.getDate(), str) && zdlpuopuiu.eablkybsjg(selectedInterval.getIntervalValue(), intervalInfo.getValue())) {
            z13 = true;
        }
        return new ppxfxbqfkf(str2, str, value, deliveryPrice, z13);
    }

    private final List zoijcleaow(Map map, SelectedInterval selectedInterval) {
        ArrayList arrayList = new ArrayList();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            IntervalDay intervalDay = (IntervalDay) ((Map.Entry) it.next()).getValue();
            arrayList.add(new z60.iobyxmoadg.C3278iobyxmoadg(intervalDay.getTitle()));
            List intervals = intervalDay.getIntervals();
            ArrayList arrayList2 = new ArrayList(jyumaefscl.cqumvgiudr(intervals, 10));
            Iterator it2 = intervals.iterator();
            while (it2.hasNext()) {
                arrayList2.add(ppxfxbqfkf((IntervalInfo) it2.next(), intervalDay.getDate(), selectedInterval));
            }
            List listOjitshcjhn = eablkybsjg.ojitshcjhn(arrayList2);
            ArrayList arrayList3 = new ArrayList(jyumaefscl.cqumvgiudr(listOjitshcjhn, 10));
            Iterator it3 = listOjitshcjhn.iterator();
            while (it3.hasNext()) {
                arrayList3.add(new z60.iobyxmoadg.zoijcleaow((vdvldrhtss) it3.next()));
            }
            arrayList.addAll(arrayList3);
        }
        return arrayList;
    }

    @Override // tg.draadjrbmk
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public gxszxtbevo invoke(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return new gxszxtbevo(state.getIsLoading(), state.getConfirmProgress(), zoijcleaow(state.getIntervals(), state.getSelectedInterval()), state.getSelectedInterval() != null);
    }
}
