package x32;

import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.ppxfxbqfkf;
import dd.nufgyqmvbu;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.jvm.internal.zdlpuopuiu;
import w32.zoijcleaow;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConcurrentMap f121134iobyxmoadg = new ConcurrentHashMap();

    private final void wkgbmnqykc(Trace trace, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            trace.putAttribute((String) entry.getKey(), (String) entry.getValue());
        }
    }

    @Override // w32.zoijcleaow
    public void iobyxmoadg(w32.iobyxmoadg event) {
        zdlpuopuiu.btonecajqb(event, "event");
        if (this.f121134iobyxmoadg.containsKey(event.zoijcleaow())) {
            Trace trace = (Trace) this.f121134iobyxmoadg.get(event.zoijcleaow());
            if (trace != null) {
                trace.stop();
            }
            this.f121134iobyxmoadg.remove(event.zoijcleaow());
        }
    }

    @Override // w32.zoijcleaow
    public void ppxfxbqfkf(w32.iobyxmoadg event) {
        Trace trace;
        zdlpuopuiu.btonecajqb(event, "event");
        if (this.f121134iobyxmoadg.containsKey(event.zoijcleaow()) && (trace = (Trace) this.f121134iobyxmoadg.get(event.zoijcleaow())) != null) {
            wkgbmnqykc(trace, event.iobyxmoadg());
        }
    }

    @Override // w32.zoijcleaow
    public void zoijcleaow(w32.iobyxmoadg event) {
        zdlpuopuiu.btonecajqb(event, "event");
        if (this.f121134iobyxmoadg.containsKey(event.zoijcleaow())) {
            return;
        }
        Trace traceEablkybsjg = nufgyqmvbu.iobyxmoadg(ppxfxbqfkf.f24690iobyxmoadg).eablkybsjg(event.ppxfxbqfkf());
        zdlpuopuiu.dxjokdxxww(traceEablkybsjg, "newTrace(...)");
        wkgbmnqykc(traceEablkybsjg, event.iobyxmoadg());
        this.f121134iobyxmoadg.put(event.zoijcleaow(), traceEablkybsjg);
        traceEablkybsjg.start();
    }
}
