package q60;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import r60.GetIntervalsResponse;
import ru.myspar.delivery.impl.interval.domain.models.IntervalDay;
import ru.myspar.delivery.impl.interval.domain.models.IntervalInfo;

/* JADX INFO: loaded from: classes4.dex */
public abstract class iobyxmoadg {
    public static final IntervalDay iobyxmoadg(GetIntervalsResponse.DayDto dayDto) {
        zdlpuopuiu.btonecajqb(dayDto, "<this>");
        String title = dayDto.getTitle();
        String date = dayDto.getDate();
        List intervalsInfo = dayDto.getIntervalsInfo();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(intervalsInfo, 10));
        Iterator it = intervalsInfo.iterator();
        while (it.hasNext()) {
            arrayList.add(zoijcleaow((GetIntervalsResponse.IntervalInfoDto) it.next()));
        }
        return new IntervalDay(title, date, arrayList);
    }

    private static final IntervalInfo zoijcleaow(GetIntervalsResponse.IntervalInfoDto intervalInfoDto) {
        return new IntervalInfo(intervalInfoDto.getValue(), intervalInfoDto.getDeliveryPrice(), intervalInfoDto.getIsSelected(), intervalInfoDto.getIsFastDelivery());
    }
}
