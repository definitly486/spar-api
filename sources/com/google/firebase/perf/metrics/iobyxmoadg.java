package com.google.firebase.perf.metrics;

import com.google.firebase.perf.session.PerfSession;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import nd.gtknphoqwx;
import nd.wflxmlrfwp;

/* JADX INFO: loaded from: classes2.dex */
class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Trace f24637iobyxmoadg;

    iobyxmoadg(Trace trace) {
        this.f24637iobyxmoadg = trace;
    }

    wflxmlrfwp iobyxmoadg() {
        wflxmlrfwp.zoijcleaow zoijcleaowVarOxmwwwfdhm = wflxmlrfwp.jpowsppfya().kcexrzcfyt(this.f24637iobyxmoadg.getName()).vdvldrhtss(this.f24637iobyxmoadg.dxjokdxxww().lqeggnwhkg()).oxmwwwfdhm(this.f24637iobyxmoadg.dxjokdxxww().gxszxtbevo(this.f24637iobyxmoadg.lqeggnwhkg()));
        for (Counter counter : this.f24637iobyxmoadg.gxszxtbevo().values()) {
            zoijcleaowVarOxmwwwfdhm.ojitshcjhn(counter.getName(), counter.zoijcleaow());
        }
        List listBtonecajqb = this.f24637iobyxmoadg.btonecajqb();
        if (!listBtonecajqb.isEmpty()) {
            Iterator it = listBtonecajqb.iterator();
            while (it.hasNext()) {
                zoijcleaowVarOxmwwwfdhm.draadjrbmk(new iobyxmoadg((Trace) it.next()).iobyxmoadg());
            }
        }
        zoijcleaowVarOxmwwwfdhm.agtfadlqog(this.f24637iobyxmoadg.getAttributes());
        gtknphoqwx[] gtknphoqwxVarArrPpxfxbqfkf = PerfSession.ppxfxbqfkf(this.f24637iobyxmoadg.nufgyqmvbu());
        if (gtknphoqwxVarArrPpxfxbqfkf != null) {
            zoijcleaowVarOxmwwwfdhm.lqeggnwhkg(Arrays.asList(gtknphoqwxVarArrPpxfxbqfkf));
        }
        return (wflxmlrfwp) zoijcleaowVarOxmwwwfdhm.build();
    }
}
