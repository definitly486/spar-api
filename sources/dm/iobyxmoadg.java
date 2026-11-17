package dm;

import gm.btonecajqb;
import gm.dxjokdxxww;
import gm.gtknphoqwx;
import gm.nufgyqmvbu;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class iobyxmoadg extends fm.iobyxmoadg implements gm.wkgbmnqykc, gm.gxszxtbevo, Comparable {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private static final Comparator f29134zdlpuopuiu = new C0580iobyxmoadg();

    /* JADX INFO: renamed from: dm.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    class C0580iobyxmoadg implements Comparator {
        C0580iobyxmoadg() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public int compare(iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2) {
            return fm.ppxfxbqfkf.zoijcleaow(iobyxmoadgVar.cqumvgiudr(), iobyxmoadgVar2.cqumvgiudr());
        }
    }

    @Override // fm.zoijcleaow, gm.eablkybsjg
    public Object btonecajqb(btonecajqb btonecajqbVar) {
        if (btonecajqbVar == dxjokdxxww.iobyxmoadg()) {
            return kcexrzcfyt();
        }
        if (btonecajqbVar == dxjokdxxww.eablkybsjg()) {
            return gm.zoijcleaow.DAYS;
        }
        if (btonecajqbVar == dxjokdxxww.zoijcleaow()) {
            return cm.eablkybsjg.kegysxyocb(cqumvgiudr());
        }
        if (btonecajqbVar == dxjokdxxww.ppxfxbqfkf() || btonecajqbVar == dxjokdxxww.gxszxtbevo() || btonecajqbVar == dxjokdxxww.lqeggnwhkg() || btonecajqbVar == dxjokdxxww.wkgbmnqykc()) {
            return null;
        }
        return super.btonecajqb(btonecajqbVar);
    }

    public abstract long cqumvgiudr();

    public gm.wkgbmnqykc dxjokdxxww(gm.wkgbmnqykc wkgbmnqykcVar) {
        return wkgbmnqykcVar.rgvfuqvkyq(gm.iobyxmoadg.f37826kegysxyocb, cqumvgiudr());
    }

    @Override // gm.eablkybsjg
    public boolean iobyxmoadg(nufgyqmvbu nufgyqmvbuVar) {
        if (nufgyqmvbuVar instanceof gm.iobyxmoadg) {
            return nufgyqmvbuVar.iobyxmoadg();
        }
        return nufgyqmvbuVar != null && nufgyqmvbuVar.nufgyqmvbu(this);
    }

    /* JADX INFO: renamed from: jyumaefscl */
    public abstract iobyxmoadg wkgbmnqykc(long j13, gtknphoqwx gtknphoqwxVar);

    public abstract eablkybsjg kcexrzcfyt();

    /* JADX INFO: renamed from: vdvldrhtss */
    public int compareTo(iobyxmoadg iobyxmoadgVar) {
        int iZoijcleaow = fm.ppxfxbqfkf.zoijcleaow(cqumvgiudr(), iobyxmoadgVar.cqumvgiudr());
        return iZoijcleaow == 0 ? kcexrzcfyt().compareTo(iobyxmoadgVar.kcexrzcfyt()) : iZoijcleaow;
    }

    public abstract iobyxmoadg zdlpuopuiu(long j13, gtknphoqwx gtknphoqwxVar);
}
