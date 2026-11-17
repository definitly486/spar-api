package vb2;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import zb2.Event;
import zb2.EventProperty;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow implements iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final wb2.iobyxmoadg f116464iobyxmoadg;

    public zoijcleaow(wb2.iobyxmoadg eventDataProvider) {
        zdlpuopuiu.btonecajqb(eventDataProvider, "eventDataProvider");
        this.f116464iobyxmoadg = eventDataProvider;
    }

    @Override // vb2.iobyxmoadg
    public Event iobyxmoadg(rb2.iobyxmoadg clickstreamEvent) {
        zdlpuopuiu.btonecajqb(clickstreamEvent, "clickstreamEvent");
        String strGxszxtbevo = clickstreamEvent.gxszxtbevo();
        String strNufgyqmvbu = clickstreamEvent.nufgyqmvbu();
        String strLqeggnwhkg = clickstreamEvent.lqeggnwhkg();
        String strDxjokdxxww = clickstreamEvent.dxjokdxxww();
        Set<Map.Entry> setEntrySet = clickstreamEvent.btonecajqb().entrySet();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(setEntrySet, 10));
        for (Map.Entry entry : setEntrySet) {
            arrayList.add(new EventProperty((String) entry.getKey(), (String) entry.getValue()));
        }
        Event event = new Event(strGxszxtbevo, strNufgyqmvbu, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, strLqeggnwhkg, strDxjokdxxww, arrayList, (String) null, 2300, (gtknphoqwx) null);
        this.f116464iobyxmoadg.iobyxmoadg(event);
        return event;
    }
}
