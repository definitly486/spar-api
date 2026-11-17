package cm;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Comparator;
import org.threeten.bp.DateTimeException;

/* JADX INFO: loaded from: classes3.dex */
public final class btonecajqb extends fm.iobyxmoadg implements gm.wkgbmnqykc, gm.gxszxtbevo, Comparable, Serializable {
    private static final long serialVersionUID = 2287754244819255394L;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final vdvldrhtss f20069yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final gxszxtbevo f20070zdlpuopuiu;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public static final btonecajqb f20068jyumaefscl = gxszxtbevo.f20097iwizpuwonk.cdpycssgdh(vdvldrhtss.f20153istkbnxepw);

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public static final btonecajqb f20067iwizpuwonk = gxszxtbevo.f20095cqumvgiudr.cdpycssgdh(vdvldrhtss.f20156zynmafqrjb);

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public static final gm.btonecajqb f20065cqumvgiudr = new iobyxmoadg();

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private static final Comparator f20066esjtqupxsv = new zoijcleaow();

    class iobyxmoadg implements gm.btonecajqb {
        iobyxmoadg() {
        }

        @Override // gm.btonecajqb
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public btonecajqb iobyxmoadg(gm.eablkybsjg eablkybsjgVar) {
            return btonecajqb.zdlpuopuiu(eablkybsjgVar);
        }
    }

    static /* synthetic */ class ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f20071iobyxmoadg;

        static {
            int[] iArr = new int[gm.iobyxmoadg.values().length];
            f20071iobyxmoadg = iArr;
            try {
                iArr[gm.iobyxmoadg.f37833ribwqtqdhb.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20071iobyxmoadg[gm.iobyxmoadg.f37838vipkmwdibw.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    class zoijcleaow implements Comparator {
        zoijcleaow() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public int compare(btonecajqb btonecajqbVar, btonecajqb btonecajqbVar2) {
            int iZoijcleaow = fm.ppxfxbqfkf.zoijcleaow(btonecajqbVar.yadqdtsiqt(), btonecajqbVar2.yadqdtsiqt());
            return iZoijcleaow == 0 ? fm.ppxfxbqfkf.zoijcleaow(btonecajqbVar.jyumaefscl(), btonecajqbVar2.jyumaefscl()) : iZoijcleaow;
        }
    }

    private btonecajqb(gxszxtbevo gxszxtbevoVar, vdvldrhtss vdvldrhtssVar) {
        this.f20070zdlpuopuiu = (gxszxtbevo) fm.ppxfxbqfkf.dxjokdxxww(gxszxtbevoVar, "dateTime");
        this.f20069yggfygwlhe = (vdvldrhtss) fm.ppxfxbqfkf.dxjokdxxww(vdvldrhtssVar, "offset");
    }

    static btonecajqb cdpycssgdh(DataInput dataInput) {
        return pmvmpeiblj(gxszxtbevo.jlmebxxoox(dataInput), vdvldrhtss.jpowsppfya(dataInput));
    }

    private btonecajqb pkzmftpjix(gxszxtbevo gxszxtbevoVar, vdvldrhtss vdvldrhtssVar) {
        return (this.f20070zdlpuopuiu == gxszxtbevoVar && this.f20069yggfygwlhe.equals(vdvldrhtssVar)) ? this : new btonecajqb(gxszxtbevoVar, vdvldrhtssVar);
    }

    public static btonecajqb pmvmpeiblj(gxszxtbevo gxszxtbevoVar, vdvldrhtss vdvldrhtssVar) {
        return new btonecajqb(gxszxtbevoVar, vdvldrhtssVar);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new wflxmlrfwp((byte) 69, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v7, types: [cm.btonecajqb] */
    public static btonecajqb zdlpuopuiu(gm.eablkybsjg eablkybsjgVar) {
        if (eablkybsjgVar instanceof btonecajqb) {
            return (btonecajqb) eablkybsjgVar;
        }
        try {
            vdvldrhtss vdvldrhtssVarYadqdtsiqt = vdvldrhtss.yadqdtsiqt(eablkybsjgVar);
            try {
                eablkybsjgVar = pmvmpeiblj(gxszxtbevo.wwaezpbzkn(eablkybsjgVar), vdvldrhtssVarYadqdtsiqt);
                return eablkybsjgVar;
            } catch (DateTimeException unused) {
                return zynmafqrjb(wkgbmnqykc.zdlpuopuiu(eablkybsjgVar), vdvldrhtssVarYadqdtsiqt);
            }
        } catch (DateTimeException unused2) {
            throw new DateTimeException("Unable to obtain OffsetDateTime from TemporalAccessor: " + eablkybsjgVar + ", type " + eablkybsjgVar.getClass().getName());
        }
    }

    public static btonecajqb zynmafqrjb(wkgbmnqykc wkgbmnqykcVar, rgvfuqvkyq rgvfuqvkyqVar) {
        fm.ppxfxbqfkf.dxjokdxxww(wkgbmnqykcVar, "instant");
        fm.ppxfxbqfkf.dxjokdxxww(rgvfuqvkyqVar, "zone");
        vdvldrhtss vdvldrhtssVarIobyxmoadg = rgvfuqvkyqVar.zdlpuopuiu().iobyxmoadg(wkgbmnqykcVar);
        return new btonecajqb(gxszxtbevo.stevsuqkhv(wkgbmnqykcVar.jyumaefscl(), wkgbmnqykcVar.cqumvgiudr(), vdvldrhtssVarIobyxmoadg), vdvldrhtssVarIobyxmoadg);
    }

    @Override // gm.eablkybsjg
    public long agtfadlqog(gm.nufgyqmvbu nufgyqmvbuVar) {
        if (!(nufgyqmvbuVar instanceof gm.iobyxmoadg)) {
            return nufgyqmvbuVar.wkgbmnqykc(this);
        }
        int i13 = ppxfxbqfkf.f20071iobyxmoadg[((gm.iobyxmoadg) nufgyqmvbuVar).ordinal()];
        if (i13 != 1) {
            return i13 != 2 ? this.f20070zdlpuopuiu.agtfadlqog(nufgyqmvbuVar) : cqumvgiudr().lmojexxdyd();
        }
        return yadqdtsiqt();
    }

    @Override // fm.zoijcleaow, gm.eablkybsjg
    public Object btonecajqb(gm.btonecajqb btonecajqbVar) {
        if (btonecajqbVar == gm.dxjokdxxww.iobyxmoadg()) {
            return dm.gxszxtbevo.f29133cqumvgiudr;
        }
        if (btonecajqbVar == gm.dxjokdxxww.eablkybsjg()) {
            return gm.zoijcleaow.NANOS;
        }
        if (btonecajqbVar == gm.dxjokdxxww.wkgbmnqykc() || btonecajqbVar == gm.dxjokdxxww.gxszxtbevo()) {
            return cqumvgiudr();
        }
        if (btonecajqbVar == gm.dxjokdxxww.zoijcleaow()) {
            return lmojexxdyd();
        }
        if (btonecajqbVar == gm.dxjokdxxww.ppxfxbqfkf()) {
            return ylkuphrtab();
        }
        if (btonecajqbVar == gm.dxjokdxxww.lqeggnwhkg()) {
            return null;
        }
        return super.btonecajqb(btonecajqbVar);
    }

    public vdvldrhtss cqumvgiudr() {
        return this.f20069yggfygwlhe;
    }

    @Override // gm.gxszxtbevo
    public gm.wkgbmnqykc dxjokdxxww(gm.wkgbmnqykc wkgbmnqykcVar) {
        return wkgbmnqykcVar.rgvfuqvkyq(gm.iobyxmoadg.f37826kegysxyocb, lmojexxdyd().cqumvgiudr()).rgvfuqvkyq(gm.iobyxmoadg.f37818esjtqupxsv, ylkuphrtab().dsvhmnatus()).rgvfuqvkyq(gm.iobyxmoadg.f37838vipkmwdibw, cqumvgiudr().lmojexxdyd());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof btonecajqb)) {
            return false;
        }
        btonecajqb btonecajqbVar = (btonecajqb) obj;
        return this.f20070zdlpuopuiu.equals(btonecajqbVar.f20070zdlpuopuiu) && this.f20069yggfygwlhe.equals(btonecajqbVar.f20069yggfygwlhe);
    }

    public int hashCode() {
        return this.f20070zdlpuopuiu.hashCode() ^ this.f20069yggfygwlhe.hashCode();
    }

    @Override // gm.wkgbmnqykc
    /* JADX INFO: renamed from: hcddaimhww, reason: merged with bridge method [inline-methods] */
    public btonecajqb draadjrbmk(gm.gxszxtbevo gxszxtbevoVar) {
        if ((gxszxtbevoVar instanceof eablkybsjg) || (gxszxtbevoVar instanceof lqeggnwhkg) || (gxszxtbevoVar instanceof gxszxtbevo)) {
            return pkzmftpjix(this.f20070zdlpuopuiu.draadjrbmk(gxszxtbevoVar), this.f20069yggfygwlhe);
        }
        if (gxszxtbevoVar instanceof wkgbmnqykc) {
            return zynmafqrjb((wkgbmnqykc) gxszxtbevoVar, this.f20069yggfygwlhe);
        }
        if (gxszxtbevoVar instanceof vdvldrhtss) {
            return pkzmftpjix(this.f20070zdlpuopuiu, (vdvldrhtss) gxszxtbevoVar);
        }
        return gxszxtbevoVar instanceof btonecajqb ? (btonecajqb) gxszxtbevoVar : (btonecajqb) gxszxtbevoVar.dxjokdxxww(this);
    }

    void hkdspvbjdz(DataOutput dataOutput) {
        this.f20070zdlpuopuiu.okpsazkaxt(dataOutput);
        this.f20069yggfygwlhe.dsvhmnatus(dataOutput);
    }

    @Override // gm.eablkybsjg
    public boolean iobyxmoadg(gm.nufgyqmvbu nufgyqmvbuVar) {
        return (nufgyqmvbuVar instanceof gm.iobyxmoadg) || (nufgyqmvbuVar != null && nufgyqmvbuVar.nufgyqmvbu(this));
    }

    @Override // gm.wkgbmnqykc
    /* JADX INFO: renamed from: istkbnxepw, reason: merged with bridge method [inline-methods] */
    public btonecajqb wkgbmnqykc(long j13, gm.gtknphoqwx gtknphoqwxVar) {
        return gtknphoqwxVar instanceof gm.zoijcleaow ? pkzmftpjix(this.f20070zdlpuopuiu.wkgbmnqykc(j13, gtknphoqwxVar), this.f20069yggfygwlhe) : (btonecajqb) gtknphoqwxVar.wkgbmnqykc(this, j13);
    }

    @Override // gm.wkgbmnqykc
    /* JADX INFO: renamed from: jpowsppfya, reason: merged with bridge method [inline-methods] */
    public btonecajqb rgvfuqvkyq(gm.nufgyqmvbu nufgyqmvbuVar, long j13) {
        if (!(nufgyqmvbuVar instanceof gm.iobyxmoadg)) {
            return (btonecajqb) nufgyqmvbuVar.btonecajqb(this, j13);
        }
        gm.iobyxmoadg iobyxmoadgVar = (gm.iobyxmoadg) nufgyqmvbuVar;
        int i13 = ppxfxbqfkf.f20071iobyxmoadg[iobyxmoadgVar.ordinal()];
        if (i13 != 1) {
            return i13 != 2 ? pkzmftpjix(this.f20070zdlpuopuiu.rgvfuqvkyq(nufgyqmvbuVar, j13), this.f20069yggfygwlhe) : pkzmftpjix(this.f20070zdlpuopuiu, vdvldrhtss.pkzmftpjix(iobyxmoadgVar.agtfadlqog(j13)));
        }
        return zynmafqrjb(wkgbmnqykc.istkbnxepw(j13, jyumaefscl()), this.f20069yggfygwlhe);
    }

    public int jyumaefscl() {
        return this.f20070zdlpuopuiu.ylkuphrtab();
    }

    public String kcexrzcfyt(em.iobyxmoadg iobyxmoadgVar) {
        fm.ppxfxbqfkf.dxjokdxxww(iobyxmoadgVar, "formatter");
        return iobyxmoadgVar.iobyxmoadg(this);
    }

    @Override // gm.wkgbmnqykc
    /* JADX INFO: renamed from: lereixgezr, reason: merged with bridge method [inline-methods] */
    public btonecajqb zdlpuopuiu(long j13, gm.gtknphoqwx gtknphoqwxVar) {
        return j13 == Long.MIN_VALUE ? wkgbmnqykc(Long.MAX_VALUE, gtknphoqwxVar).wkgbmnqykc(1L, gtknphoqwxVar) : wkgbmnqykc(-j13, gtknphoqwxVar);
    }

    public eablkybsjg lmojexxdyd() {
        return this.f20070zdlpuopuiu.zynmafqrjb();
    }

    @Override // fm.zoijcleaow, gm.eablkybsjg
    public gm.draadjrbmk lqeggnwhkg(gm.nufgyqmvbu nufgyqmvbuVar) {
        if (nufgyqmvbuVar instanceof gm.iobyxmoadg) {
            return (nufgyqmvbuVar == gm.iobyxmoadg.f37833ribwqtqdhb || nufgyqmvbuVar == gm.iobyxmoadg.f37838vipkmwdibw) ? nufgyqmvbuVar.dxjokdxxww() : this.f20070zdlpuopuiu.lqeggnwhkg(nufgyqmvbuVar);
        }
        return nufgyqmvbuVar.lqeggnwhkg(this);
    }

    @Override // fm.zoijcleaow, gm.eablkybsjg
    public int ojitshcjhn(gm.nufgyqmvbu nufgyqmvbuVar) {
        if (!(nufgyqmvbuVar instanceof gm.iobyxmoadg)) {
            return super.ojitshcjhn(nufgyqmvbuVar);
        }
        int i13 = ppxfxbqfkf.f20071iobyxmoadg[((gm.iobyxmoadg) nufgyqmvbuVar).ordinal()];
        if (i13 != 1) {
            return i13 != 2 ? this.f20070zdlpuopuiu.ojitshcjhn(nufgyqmvbuVar) : cqumvgiudr().lmojexxdyd();
        }
        throw new DateTimeException("Field too large for an int: " + nufgyqmvbuVar);
    }

    public String toString() {
        return this.f20070zdlpuopuiu.toString() + this.f20069yggfygwlhe.toString();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: vdvldrhtss, reason: merged with bridge method [inline-methods] */
    public int compareTo(btonecajqb btonecajqbVar) {
        if (cqumvgiudr().equals(btonecajqbVar.cqumvgiudr())) {
            return wwaezpbzkn().compareTo(btonecajqbVar.wwaezpbzkn());
        }
        int iZoijcleaow = fm.ppxfxbqfkf.zoijcleaow(yadqdtsiqt(), btonecajqbVar.yadqdtsiqt());
        if (iZoijcleaow != 0) {
            return iZoijcleaow;
        }
        int iPmvmpeiblj = ylkuphrtab().pmvmpeiblj() - btonecajqbVar.ylkuphrtab().pmvmpeiblj();
        return iPmvmpeiblj == 0 ? wwaezpbzkn().compareTo(btonecajqbVar.wwaezpbzkn()) : iPmvmpeiblj;
    }

    public gxszxtbevo wwaezpbzkn() {
        return this.f20070zdlpuopuiu;
    }

    public long yadqdtsiqt() {
        return this.f20070zdlpuopuiu.lereixgezr(this.f20069yggfygwlhe);
    }

    public lqeggnwhkg ylkuphrtab() {
        return this.f20070zdlpuopuiu.istkbnxepw();
    }
}
