package tp1;

import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.ppxfxbqfkf;
import dd.nufgyqmvbu;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.jvm.internal.zdlpuopuiu;
import sp1.zoijcleaow;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConcurrentMap f111177iobyxmoadg = new ConcurrentHashMap();

    private final void wkgbmnqykc(Trace trace, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            trace.putAttribute((String) entry.getKey(), (String) entry.getValue());
        }
    }

    @Override // sp1.zoijcleaow
    public void iobyxmoadg(sp1.iobyxmoadg event) {
        zdlpuopuiu.btonecajqb(event, "event");
        if (this.f111177iobyxmoadg.containsKey(event.zoijcleaow())) {
            Trace trace = (Trace) this.f111177iobyxmoadg.get(event.zoijcleaow());
            if (trace != null) {
                trace.stop();
            }
            this.f111177iobyxmoadg.remove(event.zoijcleaow());
        }
    }

    @Override // sp1.zoijcleaow
    public void ppxfxbqfkf(sp1.iobyxmoadg event) {
        Trace trace;
        zdlpuopuiu.btonecajqb(event, "event");
        if (this.f111177iobyxmoadg.containsKey(event.zoijcleaow()) && (trace = (Trace) this.f111177iobyxmoadg.get(event.zoijcleaow())) != null) {
            wkgbmnqykc(trace, event.iobyxmoadg());
        }
    }

    @Override // sp1.zoijcleaow
    public void zoijcleaow(sp1.iobyxmoadg event) {
        zdlpuopuiu.btonecajqb(event, "event");
        if (this.f111177iobyxmoadg.containsKey(event.zoijcleaow())) {
            return;
        }
        Trace traceEablkybsjg = nufgyqmvbu.iobyxmoadg(ppxfxbqfkf.f24690iobyxmoadg).eablkybsjg(event.ppxfxbqfkf());
        zdlpuopuiu.dxjokdxxww(traceEablkybsjg, "newTrace(...)");
        wkgbmnqykc(traceEablkybsjg, event.iobyxmoadg());
        this.f111177iobyxmoadg.put(event.zoijcleaow(), traceEablkybsjg);
        traceEablkybsjg.start();
    }
}
