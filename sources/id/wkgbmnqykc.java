package id;

import java.util.Iterator;
import java.util.Map;
import nd.wflxmlrfwp;

/* JADX INFO: loaded from: classes2.dex */
final class wkgbmnqykc extends eablkybsjg {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final gd.iobyxmoadg f42411zoijcleaow = gd.iobyxmoadg.eablkybsjg();

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final wflxmlrfwp f42412iobyxmoadg;

    wkgbmnqykc(wflxmlrfwp wflxmlrfwpVar) {
        this.f42412iobyxmoadg = wflxmlrfwpVar;
    }

    private boolean agtfadlqog(wflxmlrfwp wflxmlrfwpVar) {
        Long l13 = (Long) wflxmlrfwpVar.esjtqupxsv().get(md.zoijcleaow.FRAMES_TOTAL.toString());
        return l13 != null && l13.compareTo((Long) 0L) > 0;
    }

    private boolean btonecajqb(wflxmlrfwp wflxmlrfwpVar) {
        if (wflxmlrfwpVar.cqumvgiudr() > 0) {
            return true;
        }
        Iterator it = wflxmlrfwpVar.iozdgvuglv().iterator();
        while (it.hasNext()) {
            if (((wflxmlrfwp) it.next()).cqumvgiudr() > 0) {
                return true;
            }
        }
        return false;
    }

    private boolean draadjrbmk(String str) {
        if (str == null) {
            return false;
        }
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            f42411zoijcleaow.btonecajqb("counterId is empty");
            return false;
        }
        if (strTrim.length() <= 100) {
            return true;
        }
        f42411zoijcleaow.btonecajqb("counterId exceeded max length 100");
        return false;
    }

    private boolean dxjokdxxww(wflxmlrfwp wflxmlrfwpVar, int i13) {
        if (wflxmlrfwpVar == null) {
            return false;
        }
        if (i13 > 1) {
            f42411zoijcleaow.btonecajqb("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        }
        for (Map.Entry entry : wflxmlrfwpVar.esjtqupxsv().entrySet()) {
            if (!draadjrbmk((String) entry.getKey())) {
                f42411zoijcleaow.btonecajqb("invalid CounterId:" + ((String) entry.getKey()));
                return false;
            }
            if (!wflxmlrfwp((Long) entry.getValue())) {
                f42411zoijcleaow.btonecajqb("invalid CounterValue:" + entry.getValue());
                return false;
            }
        }
        Iterator it = wflxmlrfwpVar.iozdgvuglv().iterator();
        while (it.hasNext()) {
            if (!dxjokdxxww((wflxmlrfwp) it.next(), i13 + 1)) {
                return false;
            }
        }
        return true;
    }

    private boolean gtknphoqwx(wflxmlrfwp wflxmlrfwpVar) {
        return wflxmlrfwpVar.getName().startsWith("_st_");
    }

    private boolean lqeggnwhkg(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            try {
                eablkybsjg.wkgbmnqykc((String) entry.getKey(), (String) entry.getValue());
            } catch (IllegalArgumentException e13) {
                f42411zoijcleaow.btonecajqb(e13.getLocalizedMessage());
                return false;
            }
        }
        return true;
    }

    private boolean nufgyqmvbu(wflxmlrfwp wflxmlrfwpVar) {
        return dxjokdxxww(wflxmlrfwpVar, 0);
    }

    private boolean ojitshcjhn(wflxmlrfwp wflxmlrfwpVar, int i13) {
        if (wflxmlrfwpVar == null) {
            f42411zoijcleaow.btonecajqb("TraceMetric is null");
            return false;
        }
        if (i13 > 1) {
            f42411zoijcleaow.btonecajqb("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        }
        if (!vdvldrhtss(wflxmlrfwpVar.getName())) {
            f42411zoijcleaow.btonecajqb("invalid TraceId:" + wflxmlrfwpVar.getName());
            return false;
        }
        if (!rgvfuqvkyq(wflxmlrfwpVar)) {
            f42411zoijcleaow.btonecajqb("invalid TraceDuration:" + wflxmlrfwpVar.zynmafqrjb());
            return false;
        }
        if (!wflxmlrfwpVar.lmojexxdyd()) {
            f42411zoijcleaow.btonecajqb("clientStartTimeUs is null.");
            return false;
        }
        if (!gtknphoqwx(wflxmlrfwpVar) || agtfadlqog(wflxmlrfwpVar)) {
            Iterator it = wflxmlrfwpVar.iozdgvuglv().iterator();
            while (it.hasNext()) {
                if (!ojitshcjhn((wflxmlrfwp) it.next(), i13 + 1)) {
                    return false;
                }
            }
            return lqeggnwhkg(wflxmlrfwpVar.lereixgezr());
        }
        f42411zoijcleaow.btonecajqb("non-positive totalFrames in screen trace " + wflxmlrfwpVar.getName());
        return false;
    }

    private boolean rgvfuqvkyq(wflxmlrfwp wflxmlrfwpVar) {
        return wflxmlrfwpVar != null && wflxmlrfwpVar.zynmafqrjb() > 0;
    }

    private boolean vdvldrhtss(String str) {
        if (str == null) {
            return false;
        }
        String strTrim = str.trim();
        return !strTrim.isEmpty() && strTrim.length() <= 100;
    }

    private boolean wflxmlrfwp(Long l13) {
        return l13 != null;
    }

    @Override // id.eablkybsjg
    public boolean ppxfxbqfkf() {
        if (!ojitshcjhn(this.f42412iobyxmoadg, 0)) {
            f42411zoijcleaow.btonecajqb("Invalid Trace:" + this.f42412iobyxmoadg.getName());
            return false;
        }
        if (!btonecajqb(this.f42412iobyxmoadg) || nufgyqmvbu(this.f42412iobyxmoadg)) {
            return true;
        }
        f42411zoijcleaow.btonecajqb("Invalid Counters for Trace:" + this.f42412iobyxmoadg.getName());
        return false;
    }
}
