package cm;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;
import org.threeten.bp.DateTimeException;

/* JADX INFO: loaded from: classes3.dex */
public final class gxszxtbevo extends dm.zoijcleaow implements gm.wkgbmnqykc, gm.gxszxtbevo, Serializable {
    private static final long serialVersionUID = 6207766400415563566L;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final lqeggnwhkg f20098jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final eablkybsjg f20099yggfygwlhe;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public static final gxszxtbevo f20097iwizpuwonk = wypolnanlu(eablkybsjg.f20082cqumvgiudr, lqeggnwhkg.f20107cqumvgiudr);

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public static final gxszxtbevo f20095cqumvgiudr = wypolnanlu(eablkybsjg.f20083esjtqupxsv, lqeggnwhkg.f20108esjtqupxsv);

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    public static final gm.btonecajqb f20096esjtqupxsv = new iobyxmoadg();

    class iobyxmoadg implements gm.btonecajqb {
        iobyxmoadg() {
        }

        @Override // gm.btonecajqb
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public gxszxtbevo iobyxmoadg(gm.eablkybsjg eablkybsjgVar) {
            return gxszxtbevo.wwaezpbzkn(eablkybsjgVar);
        }
    }

    static /* synthetic */ class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f20100iobyxmoadg;

        static {
            int[] iArr = new int[gm.zoijcleaow.values().length];
            f20100iobyxmoadg = iArr;
            try {
                iArr[gm.zoijcleaow.NANOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20100iobyxmoadg[gm.zoijcleaow.MICROS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20100iobyxmoadg[gm.zoijcleaow.MILLIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20100iobyxmoadg[gm.zoijcleaow.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20100iobyxmoadg[gm.zoijcleaow.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20100iobyxmoadg[gm.zoijcleaow.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20100iobyxmoadg[gm.zoijcleaow.HALF_DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private gxszxtbevo(eablkybsjg eablkybsjgVar, lqeggnwhkg lqeggnwhkgVar) {
        this.f20099yggfygwlhe = eablkybsjgVar;
        this.f20098jyumaefscl = lqeggnwhkgVar;
    }

    public static gxszxtbevo cllcsxoeiz(cm.iobyxmoadg iobyxmoadgVar) {
        fm.ppxfxbqfkf.dxjokdxxww(iobyxmoadgVar, "clock");
        wkgbmnqykc wkgbmnqykcVarWkgbmnqykc = iobyxmoadgVar.wkgbmnqykc();
        return stevsuqkhv(wkgbmnqykcVarWkgbmnqykc.jyumaefscl(), wkgbmnqykcVarWkgbmnqykc.cqumvgiudr(), iobyxmoadgVar.iobyxmoadg().zdlpuopuiu().iobyxmoadg(wkgbmnqykcVarWkgbmnqykc));
    }

    private gxszxtbevo crxdokpmqz(eablkybsjg eablkybsjgVar, long j13, long j14, long j15, long j16, int i13) {
        if ((j13 | j14 | j15 | j16) == 0) {
            return vipkmwdibw(eablkybsjgVar, this.f20098jyumaefscl);
        }
        long j17 = i13;
        long jDsvhmnatus = this.f20098jyumaefscl.dsvhmnatus();
        long j18 = (((j16 % 86400000000000L) + ((j15 % 86400) * 1000000000) + ((j14 % 1440) * 60000000000L) + ((j13 % 24) * 3600000000000L)) * j17) + jDsvhmnatus;
        long jEablkybsjg = (((j16 / 86400000000000L) + (j15 / 86400) + (j14 / 1440) + (j13 / 24)) * j17) + fm.ppxfxbqfkf.eablkybsjg(j18, 86400000000000L);
        long jNufgyqmvbu = fm.ppxfxbqfkf.nufgyqmvbu(j18, 86400000000000L);
        return vipkmwdibw(eablkybsjgVar.ntlheqmsrt(jEablkybsjg), jNufgyqmvbu == jDsvhmnatus ? this.f20098jyumaefscl : lqeggnwhkg.yadqdtsiqt(jNufgyqmvbu));
    }

    public static gxszxtbevo dsvhmnatus(rgvfuqvkyq rgvfuqvkyqVar) {
        return cllcsxoeiz(cm.iobyxmoadg.lqeggnwhkg(rgvfuqvkyqVar));
    }

    public static gxszxtbevo hkdspvbjdz() {
        return cllcsxoeiz(cm.iobyxmoadg.nufgyqmvbu());
    }

    static gxszxtbevo jlmebxxoox(DataInput dataInput) {
        return wypolnanlu(eablkybsjg.jlmebxxoox(dataInput), lqeggnwhkg.cllcsxoeiz(dataInput));
    }

    private int lmojexxdyd(gxszxtbevo gxszxtbevoVar) {
        int iLereixgezr = this.f20099yggfygwlhe.lereixgezr(gxszxtbevoVar.zynmafqrjb());
        return iLereixgezr == 0 ? this.f20098jyumaefscl.compareTo(gxszxtbevoVar.istkbnxepw()) : iLereixgezr;
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static gxszxtbevo stevsuqkhv(long j13, int i13, vdvldrhtss vdvldrhtssVar) {
        fm.ppxfxbqfkf.dxjokdxxww(vdvldrhtssVar, "offset");
        long jLmojexxdyd = j13 + ((long) vdvldrhtssVar.lmojexxdyd());
        return new gxszxtbevo(eablkybsjg.kegysxyocb(fm.ppxfxbqfkf.eablkybsjg(jLmojexxdyd, 86400L)), lqeggnwhkg.wwaezpbzkn(fm.ppxfxbqfkf.lqeggnwhkg(jLmojexxdyd, 86400), i13));
    }

    private gxszxtbevo vipkmwdibw(eablkybsjg eablkybsjgVar, lqeggnwhkg lqeggnwhkgVar) {
        return (this.f20099yggfygwlhe == eablkybsjgVar && this.f20098jyumaefscl == lqeggnwhkgVar) ? this : new gxszxtbevo(eablkybsjgVar, lqeggnwhkgVar);
    }

    private Object writeReplace() {
        return new wflxmlrfwp((byte) 4, this);
    }

    public static gxszxtbevo wwaezpbzkn(gm.eablkybsjg eablkybsjgVar) {
        if (eablkybsjgVar instanceof gxszxtbevo) {
            return (gxszxtbevo) eablkybsjgVar;
        }
        if (eablkybsjgVar instanceof kcexrzcfyt) {
            return ((kcexrzcfyt) eablkybsjgVar).pmvmpeiblj();
        }
        try {
            return new gxszxtbevo(eablkybsjg.zynmafqrjb(eablkybsjgVar), lqeggnwhkg.jyumaefscl(eablkybsjgVar));
        } catch (DateTimeException unused) {
            throw new DateTimeException("Unable to obtain LocalDateTime from TemporalAccessor: " + eablkybsjgVar + ", type " + eablkybsjgVar.getClass().getName());
        }
    }

    public static gxszxtbevo wypolnanlu(eablkybsjg eablkybsjgVar, lqeggnwhkg lqeggnwhkgVar) {
        fm.ppxfxbqfkf.dxjokdxxww(eablkybsjgVar, ExternalMetricsManagerImpl.DATE);
        fm.ppxfxbqfkf.dxjokdxxww(lqeggnwhkgVar, "time");
        return new gxszxtbevo(eablkybsjgVar, lqeggnwhkgVar);
    }

    @Override // gm.eablkybsjg
    public long agtfadlqog(gm.nufgyqmvbu nufgyqmvbuVar) {
        if (nufgyqmvbuVar instanceof gm.iobyxmoadg) {
            return nufgyqmvbuVar.draadjrbmk() ? this.f20098jyumaefscl.agtfadlqog(nufgyqmvbuVar) : this.f20099yggfygwlhe.agtfadlqog(nufgyqmvbuVar);
        }
        return nufgyqmvbuVar.wkgbmnqykc(this);
    }

    @Override // dm.zoijcleaow, fm.zoijcleaow, gm.eablkybsjg
    public Object btonecajqb(gm.btonecajqb btonecajqbVar) {
        return btonecajqbVar == gm.dxjokdxxww.zoijcleaow() ? zynmafqrjb() : super.btonecajqb(btonecajqbVar);
    }

    public btonecajqb cdpycssgdh(vdvldrhtss vdvldrhtssVar) {
        return btonecajqb.pmvmpeiblj(this, vdvldrhtssVar);
    }

    @Override // dm.zoijcleaow
    public boolean cqumvgiudr(dm.zoijcleaow zoijcleaowVar) {
        if (zoijcleaowVar instanceof gxszxtbevo) {
            return lmojexxdyd((gxszxtbevo) zoijcleaowVar) < 0;
        }
        return super.cqumvgiudr(zoijcleaowVar);
    }

    @Override // dm.zoijcleaow, gm.gxszxtbevo
    public gm.wkgbmnqykc dxjokdxxww(gm.wkgbmnqykc wkgbmnqykcVar) {
        return super.dxjokdxxww(wkgbmnqykcVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxszxtbevo)) {
            return false;
        }
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
        return this.f20099yggfygwlhe.equals(gxszxtbevoVar.f20099yggfygwlhe) && this.f20098jyumaefscl.equals(gxszxtbevoVar.f20098jyumaefscl);
    }

    public int hashCode() {
        return this.f20099yggfygwlhe.hashCode() ^ this.f20098jyumaefscl.hashCode();
    }

    public int hcddaimhww() {
        return this.f20099yggfygwlhe.pkzmftpjix();
    }

    @Override // gm.wkgbmnqykc
    /* JADX INFO: renamed from: ikoacuggdj, reason: merged with bridge method [inline-methods] */
    public gxszxtbevo rgvfuqvkyq(gm.nufgyqmvbu nufgyqmvbuVar, long j13) {
        if (nufgyqmvbuVar instanceof gm.iobyxmoadg) {
            return nufgyqmvbuVar.draadjrbmk() ? vipkmwdibw(this.f20099yggfygwlhe, this.f20098jyumaefscl.rgvfuqvkyq(nufgyqmvbuVar, j13)) : vipkmwdibw(this.f20099yggfygwlhe.rgvfuqvkyq(nufgyqmvbuVar, j13), this.f20098jyumaefscl);
        }
        return (gxszxtbevo) nufgyqmvbuVar.btonecajqb(this, j13);
    }

    @Override // gm.eablkybsjg
    public boolean iobyxmoadg(gm.nufgyqmvbu nufgyqmvbuVar) {
        if (nufgyqmvbuVar instanceof gm.iobyxmoadg) {
            return nufgyqmvbuVar.iobyxmoadg() || nufgyqmvbuVar.draadjrbmk();
        }
        return nufgyqmvbuVar != null && nufgyqmvbuVar.nufgyqmvbu(this);
    }

    @Override // dm.zoijcleaow
    public lqeggnwhkg istkbnxepw() {
        return this.f20098jyumaefscl;
    }

    @Override // gm.wkgbmnqykc
    /* JADX INFO: renamed from: jhduphickx, reason: merged with bridge method [inline-methods] */
    public gxszxtbevo draadjrbmk(gm.gxszxtbevo gxszxtbevoVar) {
        if (gxszxtbevoVar instanceof eablkybsjg) {
            return vipkmwdibw((eablkybsjg) gxszxtbevoVar, this.f20098jyumaefscl);
        }
        if (gxszxtbevoVar instanceof lqeggnwhkg) {
            return vipkmwdibw(this.f20099yggfygwlhe, (lqeggnwhkg) gxszxtbevoVar);
        }
        return gxszxtbevoVar instanceof gxszxtbevo ? (gxszxtbevo) gxszxtbevoVar : (gxszxtbevo) gxszxtbevoVar.dxjokdxxww(this);
    }

    @Override // gm.wkgbmnqykc
    /* JADX INFO: renamed from: jpowsppfya, reason: merged with bridge method [inline-methods] */
    public gxszxtbevo zdlpuopuiu(long j13, gm.gtknphoqwx gtknphoqwxVar) {
        return j13 == Long.MIN_VALUE ? wkgbmnqykc(Long.MAX_VALUE, gtknphoqwxVar).wkgbmnqykc(1L, gtknphoqwxVar) : wkgbmnqykc(-j13, gtknphoqwxVar);
    }

    @Override // dm.zoijcleaow
    public boolean jyumaefscl(dm.zoijcleaow zoijcleaowVar) {
        if (zoijcleaowVar instanceof gxszxtbevo) {
            return lmojexxdyd((gxszxtbevo) zoijcleaowVar) > 0;
        }
        return super.jyumaefscl(zoijcleaowVar);
    }

    @Override // dm.zoijcleaow
    public String kcexrzcfyt(em.iobyxmoadg iobyxmoadgVar) {
        return super.kcexrzcfyt(iobyxmoadgVar);
    }

    @Override // gm.wkgbmnqykc
    /* JADX INFO: renamed from: kegysxyocb, reason: merged with bridge method [inline-methods] */
    public gxszxtbevo wkgbmnqykc(long j13, gm.gtknphoqwx gtknphoqwxVar) {
        if (!(gtknphoqwxVar instanceof gm.zoijcleaow)) {
            return (gxszxtbevo) gtknphoqwxVar.wkgbmnqykc(this, j13);
        }
        switch (zoijcleaow.f20100iobyxmoadg[((gm.zoijcleaow) gtknphoqwxVar).ordinal()]) {
            case 1:
                return ulzqkzuiru(j13);
            case 2:
                return tzroggbefp(j13 / 86400000000L).ulzqkzuiru((j13 % 86400000000L) * 1000);
            case 3:
                return tzroggbefp(j13 / 86400000).ulzqkzuiru((j13 % 86400000) * 1000000);
            case 4:
                return sopmlzcsov(j13);
            case 5:
                return ntlheqmsrt(j13);
            case 6:
                return mbcevpiqjq(j13);
            case 7:
                return tzroggbefp(j13 / 256).mbcevpiqjq((j13 % 256) * 12);
            default:
                return vipkmwdibw(this.f20099yggfygwlhe.jyumaefscl(j13, gtknphoqwxVar), this.f20098jyumaefscl);
        }
    }

    @Override // fm.zoijcleaow, gm.eablkybsjg
    public gm.draadjrbmk lqeggnwhkg(gm.nufgyqmvbu nufgyqmvbuVar) {
        if (nufgyqmvbuVar instanceof gm.iobyxmoadg) {
            return nufgyqmvbuVar.draadjrbmk() ? this.f20098jyumaefscl.lqeggnwhkg(nufgyqmvbuVar) : this.f20099yggfygwlhe.lqeggnwhkg(nufgyqmvbuVar);
        }
        return nufgyqmvbuVar.lqeggnwhkg(this);
    }

    public gxszxtbevo mbcevpiqjq(long j13) {
        return crxdokpmqz(this.f20099yggfygwlhe, j13, 0L, 0L, 0L, 1);
    }

    public gxszxtbevo ntlheqmsrt(long j13) {
        return crxdokpmqz(this.f20099yggfygwlhe, 0L, j13, 0L, 0L, 1);
    }

    @Override // fm.zoijcleaow, gm.eablkybsjg
    public int ojitshcjhn(gm.nufgyqmvbu nufgyqmvbuVar) {
        if (nufgyqmvbuVar instanceof gm.iobyxmoadg) {
            return nufgyqmvbuVar.draadjrbmk() ? this.f20098jyumaefscl.ojitshcjhn(nufgyqmvbuVar) : this.f20099yggfygwlhe.ojitshcjhn(nufgyqmvbuVar);
        }
        return super.ojitshcjhn(nufgyqmvbuVar);
    }

    void okpsazkaxt(DataOutput dataOutput) {
        this.f20099yggfygwlhe.metgxyhuhe(dataOutput);
        this.f20098jyumaefscl.sopmlzcsov(dataOutput);
    }

    public int pkzmftpjix() {
        return this.f20098jyumaefscl.zynmafqrjb();
    }

    @Override // dm.zoijcleaow
    /* JADX INFO: renamed from: ribwqtqdhb, reason: merged with bridge method [inline-methods] */
    public eablkybsjg zynmafqrjb() {
        return this.f20099yggfygwlhe;
    }

    public gxszxtbevo sopmlzcsov(long j13) {
        return crxdokpmqz(this.f20099yggfygwlhe, 0L, 0L, j13, 0L, 1);
    }

    public String toString() {
        return this.f20099yggfygwlhe.toString() + 'T' + this.f20098jyumaefscl.toString();
    }

    public gxszxtbevo tzroggbefp(long j13) {
        return vipkmwdibw(this.f20099yggfygwlhe.ntlheqmsrt(j13), this.f20098jyumaefscl);
    }

    public gxszxtbevo ulzqkzuiru(long j13) {
        return crxdokpmqz(this.f20099yggfygwlhe, 0L, 0L, 0L, j13, 1);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: vdvldrhtss, reason: merged with bridge method [inline-methods] */
    public int compareTo(dm.zoijcleaow zoijcleaowVar) {
        return zoijcleaowVar instanceof gxszxtbevo ? lmojexxdyd((gxszxtbevo) zoijcleaowVar) : super.compareTo(zoijcleaowVar);
    }

    public kcexrzcfyt yadqdtsiqt(rgvfuqvkyq rgvfuqvkyqVar) {
        return kcexrzcfyt.pkzmftpjix(this, rgvfuqvkyqVar);
    }

    public int ylkuphrtab() {
        return this.f20098jyumaefscl.pmvmpeiblj();
    }
}
