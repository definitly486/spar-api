package dm;

import cm.lqeggnwhkg;
import cm.rgvfuqvkyq;
import cm.vdvldrhtss;
import gm.btonecajqb;
import gm.dxjokdxxww;
import gm.nufgyqmvbu;
import java.util.Comparator;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wkgbmnqykc extends fm.iobyxmoadg implements gm.wkgbmnqykc, Comparable {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private static Comparator f29135zdlpuopuiu = new iobyxmoadg();

    class iobyxmoadg implements Comparator {
        iobyxmoadg() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public int compare(wkgbmnqykc wkgbmnqykcVar, wkgbmnqykc wkgbmnqykcVar2) {
            int iZoijcleaow = fm.ppxfxbqfkf.zoijcleaow(wkgbmnqykcVar.cqumvgiudr(), wkgbmnqykcVar2.cqumvgiudr());
            return iZoijcleaow == 0 ? fm.ppxfxbqfkf.zoijcleaow(wkgbmnqykcVar.zynmafqrjb().dsvhmnatus(), wkgbmnqykcVar2.zynmafqrjb().dsvhmnatus()) : iZoijcleaow;
        }
    }

    static /* synthetic */ class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f29136iobyxmoadg;

        static {
            int[] iArr = new int[gm.iobyxmoadg.values().length];
            f29136iobyxmoadg = iArr;
            try {
                iArr[gm.iobyxmoadg.f37833ribwqtqdhb.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29136iobyxmoadg[gm.iobyxmoadg.f37838vipkmwdibw.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // fm.zoijcleaow, gm.eablkybsjg
    public Object btonecajqb(btonecajqb btonecajqbVar) {
        if (btonecajqbVar == dxjokdxxww.lqeggnwhkg() || btonecajqbVar == dxjokdxxww.gxszxtbevo()) {
            return jyumaefscl();
        }
        if (btonecajqbVar == dxjokdxxww.iobyxmoadg()) {
            return lereixgezr().kcexrzcfyt();
        }
        if (btonecajqbVar == dxjokdxxww.eablkybsjg()) {
            return gm.zoijcleaow.NANOS;
        }
        if (btonecajqbVar == dxjokdxxww.wkgbmnqykc()) {
            return zdlpuopuiu();
        }
        if (btonecajqbVar == dxjokdxxww.zoijcleaow()) {
            return cm.eablkybsjg.kegysxyocb(lereixgezr().cqumvgiudr());
        }
        return btonecajqbVar == dxjokdxxww.ppxfxbqfkf() ? zynmafqrjb() : super.btonecajqb(btonecajqbVar);
    }

    public long cqumvgiudr() {
        return ((lereixgezr().cqumvgiudr() * 86400) + ((long) zynmafqrjb().wypolnanlu())) - ((long) zdlpuopuiu().lmojexxdyd());
    }

    public abstract rgvfuqvkyq jyumaefscl();

    public String kcexrzcfyt(em.iobyxmoadg iobyxmoadgVar) {
        fm.ppxfxbqfkf.dxjokdxxww(iobyxmoadgVar, "formatter");
        return iobyxmoadgVar.iobyxmoadg(this);
    }

    public abstract dm.iobyxmoadg lereixgezr();

    @Override // fm.zoijcleaow, gm.eablkybsjg
    public int ojitshcjhn(nufgyqmvbu nufgyqmvbuVar) {
        if (!(nufgyqmvbuVar instanceof gm.iobyxmoadg)) {
            return super.ojitshcjhn(nufgyqmvbuVar);
        }
        int i13 = zoijcleaow.f29136iobyxmoadg[((gm.iobyxmoadg) nufgyqmvbuVar).ordinal()];
        if (i13 != 1) {
            return i13 != 2 ? pmvmpeiblj().ojitshcjhn(nufgyqmvbuVar) : zdlpuopuiu().lmojexxdyd();
        }
        throw new UnsupportedTemporalTypeException("Field too large for an int: " + nufgyqmvbuVar);
    }

    public abstract dm.zoijcleaow pmvmpeiblj();

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: vdvldrhtss, reason: merged with bridge method [inline-methods] */
    public int compareTo(wkgbmnqykc wkgbmnqykcVar) {
        int iZoijcleaow = fm.ppxfxbqfkf.zoijcleaow(cqumvgiudr(), wkgbmnqykcVar.cqumvgiudr());
        if (iZoijcleaow != 0) {
            return iZoijcleaow;
        }
        int iPmvmpeiblj = zynmafqrjb().pmvmpeiblj() - wkgbmnqykcVar.zynmafqrjb().pmvmpeiblj();
        if (iPmvmpeiblj != 0) {
            return iPmvmpeiblj;
        }
        int iCompareTo = pmvmpeiblj().compareTo(wkgbmnqykcVar.pmvmpeiblj());
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = jyumaefscl().kcexrzcfyt().compareTo(wkgbmnqykcVar.jyumaefscl().kcexrzcfyt());
        return iCompareTo2 == 0 ? lereixgezr().kcexrzcfyt().compareTo(wkgbmnqykcVar.lereixgezr().kcexrzcfyt()) : iCompareTo2;
    }

    public abstract vdvldrhtss zdlpuopuiu();

    public abstract lqeggnwhkg zynmafqrjb();
}
