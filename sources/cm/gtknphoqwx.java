package cm;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import org.threeten.bp.DateTimeException;

/* JADX INFO: loaded from: classes3.dex */
public final class gtknphoqwx extends fm.zoijcleaow implements gm.wkgbmnqykc, gm.gxszxtbevo, Comparable, Serializable {
    private static final long serialVersionUID = 7264499704384272492L;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final vdvldrhtss f20093yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final lqeggnwhkg f20094zdlpuopuiu;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public static final gtknphoqwx f20092jyumaefscl = lqeggnwhkg.f20107cqumvgiudr.vdvldrhtss(vdvldrhtss.f20153istkbnxepw);

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public static final gtknphoqwx f20091iwizpuwonk = lqeggnwhkg.f20108esjtqupxsv.vdvldrhtss(vdvldrhtss.f20156zynmafqrjb);

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public static final gm.btonecajqb f20090cqumvgiudr = new iobyxmoadg();

    class iobyxmoadg implements gm.btonecajqb {
        iobyxmoadg() {
        }

        @Override // gm.btonecajqb
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public gtknphoqwx iobyxmoadg(gm.eablkybsjg eablkybsjgVar) {
            return gtknphoqwx.kcexrzcfyt(eablkybsjgVar);
        }
    }

    private gtknphoqwx(lqeggnwhkg lqeggnwhkgVar, vdvldrhtss vdvldrhtssVar) {
        this.f20094zdlpuopuiu = (lqeggnwhkg) fm.ppxfxbqfkf.dxjokdxxww(lqeggnwhkgVar, "time");
        this.f20093yggfygwlhe = (vdvldrhtss) fm.ppxfxbqfkf.dxjokdxxww(vdvldrhtssVar, "offset");
    }

    public static gtknphoqwx cqumvgiudr(lqeggnwhkg lqeggnwhkgVar, vdvldrhtss vdvldrhtssVar) {
        return new gtknphoqwx(lqeggnwhkgVar, vdvldrhtssVar);
    }

    private gtknphoqwx istkbnxepw(lqeggnwhkg lqeggnwhkgVar, vdvldrhtss vdvldrhtssVar) {
        return (this.f20094zdlpuopuiu == lqeggnwhkgVar && this.f20093yggfygwlhe.equals(vdvldrhtssVar)) ? this : new gtknphoqwx(lqeggnwhkgVar, vdvldrhtssVar);
    }

    public static gtknphoqwx kcexrzcfyt(gm.eablkybsjg eablkybsjgVar) {
        if (eablkybsjgVar instanceof gtknphoqwx) {
            return (gtknphoqwx) eablkybsjgVar;
        }
        try {
            return new gtknphoqwx(lqeggnwhkg.jyumaefscl(eablkybsjgVar), vdvldrhtss.yadqdtsiqt(eablkybsjgVar));
        } catch (DateTimeException unused) {
            throw new DateTimeException("Unable to obtain OffsetTime from TemporalAccessor: " + eablkybsjgVar + ", type " + eablkybsjgVar.getClass().getName());
        }
    }

    static gtknphoqwx pmvmpeiblj(DataInput dataInput) {
        return cqumvgiudr(lqeggnwhkg.cllcsxoeiz(dataInput), vdvldrhtss.jpowsppfya(dataInput));
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new wflxmlrfwp((byte) 66, this);
    }

    private long zynmafqrjb() {
        return this.f20094zdlpuopuiu.dsvhmnatus() - (((long) this.f20093yggfygwlhe.lmojexxdyd()) * 1000000000);
    }

    @Override // gm.eablkybsjg
    public long agtfadlqog(gm.nufgyqmvbu nufgyqmvbuVar) {
        if (nufgyqmvbuVar instanceof gm.iobyxmoadg) {
            return nufgyqmvbuVar == gm.iobyxmoadg.f37838vipkmwdibw ? zdlpuopuiu().lmojexxdyd() : this.f20094zdlpuopuiu.agtfadlqog(nufgyqmvbuVar);
        }
        return nufgyqmvbuVar.wkgbmnqykc(this);
    }

    @Override // fm.zoijcleaow, gm.eablkybsjg
    public Object btonecajqb(gm.btonecajqb btonecajqbVar) {
        if (btonecajqbVar == gm.dxjokdxxww.eablkybsjg()) {
            return gm.zoijcleaow.NANOS;
        }
        if (btonecajqbVar == gm.dxjokdxxww.wkgbmnqykc() || btonecajqbVar == gm.dxjokdxxww.gxszxtbevo()) {
            return zdlpuopuiu();
        }
        if (btonecajqbVar == gm.dxjokdxxww.ppxfxbqfkf()) {
            return this.f20094zdlpuopuiu;
        }
        if (btonecajqbVar == gm.dxjokdxxww.iobyxmoadg() || btonecajqbVar == gm.dxjokdxxww.zoijcleaow() || btonecajqbVar == gm.dxjokdxxww.lqeggnwhkg()) {
            return null;
        }
        return super.btonecajqb(btonecajqbVar);
    }

    @Override // gm.wkgbmnqykc
    /* JADX INFO: renamed from: cdpycssgdh, reason: merged with bridge method [inline-methods] */
    public gtknphoqwx draadjrbmk(gm.gxszxtbevo gxszxtbevoVar) {
        if (gxszxtbevoVar instanceof lqeggnwhkg) {
            return istkbnxepw((lqeggnwhkg) gxszxtbevoVar, this.f20093yggfygwlhe);
        }
        if (gxszxtbevoVar instanceof vdvldrhtss) {
            return istkbnxepw(this.f20094zdlpuopuiu, (vdvldrhtss) gxszxtbevoVar);
        }
        return gxszxtbevoVar instanceof gtknphoqwx ? (gtknphoqwx) gxszxtbevoVar : (gtknphoqwx) gxszxtbevoVar.dxjokdxxww(this);
    }

    @Override // gm.gxszxtbevo
    public gm.wkgbmnqykc dxjokdxxww(gm.wkgbmnqykc wkgbmnqykcVar) {
        return wkgbmnqykcVar.rgvfuqvkyq(gm.iobyxmoadg.f37818esjtqupxsv, this.f20094zdlpuopuiu.dsvhmnatus()).rgvfuqvkyq(gm.iobyxmoadg.f37838vipkmwdibw, zdlpuopuiu().lmojexxdyd());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gtknphoqwx)) {
            return false;
        }
        gtknphoqwx gtknphoqwxVar = (gtknphoqwx) obj;
        return this.f20094zdlpuopuiu.equals(gtknphoqwxVar.f20094zdlpuopuiu) && this.f20093yggfygwlhe.equals(gtknphoqwxVar.f20093yggfygwlhe);
    }

    public int hashCode() {
        return this.f20094zdlpuopuiu.hashCode() ^ this.f20093yggfygwlhe.hashCode();
    }

    @Override // gm.eablkybsjg
    public boolean iobyxmoadg(gm.nufgyqmvbu nufgyqmvbuVar) {
        if (nufgyqmvbuVar instanceof gm.iobyxmoadg) {
            return nufgyqmvbuVar.draadjrbmk() || nufgyqmvbuVar == gm.iobyxmoadg.f37838vipkmwdibw;
        }
        return nufgyqmvbuVar != null && nufgyqmvbuVar.nufgyqmvbu(this);
    }

    @Override // gm.wkgbmnqykc
    /* JADX INFO: renamed from: jyumaefscl, reason: merged with bridge method [inline-methods] */
    public gtknphoqwx zdlpuopuiu(long j13, gm.gtknphoqwx gtknphoqwxVar) {
        return j13 == Long.MIN_VALUE ? wkgbmnqykc(Long.MAX_VALUE, gtknphoqwxVar).wkgbmnqykc(1L, gtknphoqwxVar) : wkgbmnqykc(-j13, gtknphoqwxVar);
    }

    @Override // gm.wkgbmnqykc
    /* JADX INFO: renamed from: lereixgezr, reason: merged with bridge method [inline-methods] */
    public gtknphoqwx wkgbmnqykc(long j13, gm.gtknphoqwx gtknphoqwxVar) {
        return gtknphoqwxVar instanceof gm.zoijcleaow ? istkbnxepw(this.f20094zdlpuopuiu.wkgbmnqykc(j13, gtknphoqwxVar), this.f20093yggfygwlhe) : (gtknphoqwx) gtknphoqwxVar.wkgbmnqykc(this, j13);
    }

    void lmojexxdyd(DataOutput dataOutput) {
        this.f20094zdlpuopuiu.sopmlzcsov(dataOutput);
        this.f20093yggfygwlhe.dsvhmnatus(dataOutput);
    }

    @Override // fm.zoijcleaow, gm.eablkybsjg
    public gm.draadjrbmk lqeggnwhkg(gm.nufgyqmvbu nufgyqmvbuVar) {
        if (nufgyqmvbuVar instanceof gm.iobyxmoadg) {
            return nufgyqmvbuVar == gm.iobyxmoadg.f37838vipkmwdibw ? nufgyqmvbuVar.dxjokdxxww() : this.f20094zdlpuopuiu.lqeggnwhkg(nufgyqmvbuVar);
        }
        return nufgyqmvbuVar.lqeggnwhkg(this);
    }

    @Override // fm.zoijcleaow, gm.eablkybsjg
    public int ojitshcjhn(gm.nufgyqmvbu nufgyqmvbuVar) {
        return super.ojitshcjhn(nufgyqmvbuVar);
    }

    public String toString() {
        return this.f20094zdlpuopuiu.toString() + this.f20093yggfygwlhe.toString();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: vdvldrhtss, reason: merged with bridge method [inline-methods] */
    public int compareTo(gtknphoqwx gtknphoqwxVar) {
        int iZoijcleaow;
        return (this.f20093yggfygwlhe.equals(gtknphoqwxVar.f20093yggfygwlhe) || (iZoijcleaow = fm.ppxfxbqfkf.zoijcleaow(zynmafqrjb(), gtknphoqwxVar.zynmafqrjb())) == 0) ? this.f20094zdlpuopuiu.compareTo(gtknphoqwxVar.f20094zdlpuopuiu) : iZoijcleaow;
    }

    @Override // gm.wkgbmnqykc
    /* JADX INFO: renamed from: yadqdtsiqt, reason: merged with bridge method [inline-methods] */
    public gtknphoqwx rgvfuqvkyq(gm.nufgyqmvbu nufgyqmvbuVar, long j13) {
        if (nufgyqmvbuVar instanceof gm.iobyxmoadg) {
            return nufgyqmvbuVar == gm.iobyxmoadg.f37838vipkmwdibw ? istkbnxepw(this.f20094zdlpuopuiu, vdvldrhtss.pkzmftpjix(((gm.iobyxmoadg) nufgyqmvbuVar).agtfadlqog(j13))) : istkbnxepw(this.f20094zdlpuopuiu.rgvfuqvkyq(nufgyqmvbuVar, j13), this.f20093yggfygwlhe);
        }
        return (gtknphoqwx) nufgyqmvbuVar.btonecajqb(this, j13);
    }

    public vdvldrhtss zdlpuopuiu() {
        return this.f20093yggfygwlhe;
    }
}
