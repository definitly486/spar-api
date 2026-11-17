package dm;

import cm.lqeggnwhkg;
import cm.vdvldrhtss;
import gm.btonecajqb;
import gm.dxjokdxxww;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zoijcleaow extends fm.iobyxmoadg implements gm.wkgbmnqykc, gm.gxszxtbevo, Comparable {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private static final Comparator f29137zdlpuopuiu = new iobyxmoadg();

    class iobyxmoadg implements Comparator {
        iobyxmoadg() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public int compare(zoijcleaow zoijcleaowVar, zoijcleaow zoijcleaowVar2) {
            int iZoijcleaow = fm.ppxfxbqfkf.zoijcleaow(zoijcleaowVar.zynmafqrjb().cqumvgiudr(), zoijcleaowVar2.zynmafqrjb().cqumvgiudr());
            return iZoijcleaow == 0 ? fm.ppxfxbqfkf.zoijcleaow(zoijcleaowVar.istkbnxepw().dsvhmnatus(), zoijcleaowVar2.istkbnxepw().dsvhmnatus()) : iZoijcleaow;
        }
    }

    @Override // fm.zoijcleaow, gm.eablkybsjg
    public Object btonecajqb(btonecajqb btonecajqbVar) {
        if (btonecajqbVar == dxjokdxxww.iobyxmoadg()) {
            return zdlpuopuiu();
        }
        if (btonecajqbVar == dxjokdxxww.eablkybsjg()) {
            return gm.zoijcleaow.NANOS;
        }
        if (btonecajqbVar == dxjokdxxww.zoijcleaow()) {
            return cm.eablkybsjg.kegysxyocb(zynmafqrjb().cqumvgiudr());
        }
        if (btonecajqbVar == dxjokdxxww.ppxfxbqfkf()) {
            return istkbnxepw();
        }
        if (btonecajqbVar == dxjokdxxww.gxszxtbevo() || btonecajqbVar == dxjokdxxww.lqeggnwhkg() || btonecajqbVar == dxjokdxxww.wkgbmnqykc()) {
            return null;
        }
        return super.btonecajqb(btonecajqbVar);
    }

    public boolean cqumvgiudr(zoijcleaow zoijcleaowVar) {
        long jCqumvgiudr = zynmafqrjb().cqumvgiudr();
        long jCqumvgiudr2 = zoijcleaowVar.zynmafqrjb().cqumvgiudr();
        return jCqumvgiudr < jCqumvgiudr2 || (jCqumvgiudr == jCqumvgiudr2 && istkbnxepw().dsvhmnatus() < zoijcleaowVar.istkbnxepw().dsvhmnatus());
    }

    public gm.wkgbmnqykc dxjokdxxww(gm.wkgbmnqykc wkgbmnqykcVar) {
        return wkgbmnqykcVar.rgvfuqvkyq(gm.iobyxmoadg.f37826kegysxyocb, zynmafqrjb().cqumvgiudr()).rgvfuqvkyq(gm.iobyxmoadg.f37818esjtqupxsv, istkbnxepw().dsvhmnatus());
    }

    public abstract lqeggnwhkg istkbnxepw();

    public boolean jyumaefscl(zoijcleaow zoijcleaowVar) {
        long jCqumvgiudr = zynmafqrjb().cqumvgiudr();
        long jCqumvgiudr2 = zoijcleaowVar.zynmafqrjb().cqumvgiudr();
        return jCqumvgiudr > jCqumvgiudr2 || (jCqumvgiudr == jCqumvgiudr2 && istkbnxepw().dsvhmnatus() > zoijcleaowVar.istkbnxepw().dsvhmnatus());
    }

    public String kcexrzcfyt(em.iobyxmoadg iobyxmoadgVar) {
        fm.ppxfxbqfkf.dxjokdxxww(iobyxmoadgVar, "formatter");
        return iobyxmoadgVar.iobyxmoadg(this);
    }

    public long lereixgezr(vdvldrhtss vdvldrhtssVar) {
        fm.ppxfxbqfkf.dxjokdxxww(vdvldrhtssVar, "offset");
        return ((zynmafqrjb().cqumvgiudr() * 86400) + ((long) istkbnxepw().wypolnanlu())) - ((long) vdvldrhtssVar.lmojexxdyd());
    }

    public cm.wkgbmnqykc pmvmpeiblj(vdvldrhtss vdvldrhtssVar) {
        return cm.wkgbmnqykc.istkbnxepw(lereixgezr(vdvldrhtssVar), istkbnxepw().pmvmpeiblj());
    }

    /* JADX INFO: renamed from: vdvldrhtss */
    public int compareTo(zoijcleaow zoijcleaowVar) {
        int iCompareTo = zynmafqrjb().compareTo(zoijcleaowVar.zynmafqrjb());
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = istkbnxepw().compareTo(zoijcleaowVar.istkbnxepw());
        return iCompareTo2 == 0 ? zdlpuopuiu().compareTo(zoijcleaowVar.zdlpuopuiu()) : iCompareTo2;
    }

    public eablkybsjg zdlpuopuiu() {
        return zynmafqrjb().kcexrzcfyt();
    }

    public abstract dm.iobyxmoadg zynmafqrjb();
}
