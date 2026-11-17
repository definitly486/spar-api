package cm;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;

/* JADX INFO: loaded from: classes3.dex */
public final class wkgbmnqykc extends fm.zoijcleaow implements gm.wkgbmnqykc, gm.gxszxtbevo, Comparable, Serializable {
    private static final long serialVersionUID = -665713676816604388L;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final int f20165yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final long f20166zdlpuopuiu;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public static final wkgbmnqykc f20164jyumaefscl = new wkgbmnqykc(0, 0);

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public static final wkgbmnqykc f20163iwizpuwonk = istkbnxepw(-31557014167219200L, 0);

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public static final wkgbmnqykc f20161cqumvgiudr = istkbnxepw(31556889864403199L, 999999999);

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    public static final gm.btonecajqb f20162esjtqupxsv = new iobyxmoadg();

    class iobyxmoadg implements gm.btonecajqb {
        iobyxmoadg() {
        }

        @Override // gm.btonecajqb
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public wkgbmnqykc iobyxmoadg(gm.eablkybsjg eablkybsjgVar) {
            return wkgbmnqykc.zdlpuopuiu(eablkybsjgVar);
        }
    }

    static /* synthetic */ class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f20167iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        static final /* synthetic */ int[] f20168zoijcleaow;

        static {
            int[] iArr = new int[gm.zoijcleaow.values().length];
            f20168zoijcleaow = iArr;
            try {
                iArr[gm.zoijcleaow.NANOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20168zoijcleaow[gm.zoijcleaow.MICROS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20168zoijcleaow[gm.zoijcleaow.MILLIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20168zoijcleaow[gm.zoijcleaow.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20168zoijcleaow[gm.zoijcleaow.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20168zoijcleaow[gm.zoijcleaow.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20168zoijcleaow[gm.zoijcleaow.HALF_DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f20168zoijcleaow[gm.zoijcleaow.DAYS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr2 = new int[gm.iobyxmoadg.values().length];
            f20167iobyxmoadg = iArr2;
            try {
                iArr2[gm.iobyxmoadg.f37815cqumvgiudr.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f20167iobyxmoadg[gm.iobyxmoadg.f37827lereixgezr.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f20167iobyxmoadg[gm.iobyxmoadg.f37843zynmafqrjb.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f20167iobyxmoadg[gm.iobyxmoadg.f37833ribwqtqdhb.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private wkgbmnqykc(long j13, int i13) {
        this.f20166zdlpuopuiu = j13;
        this.f20165yggfygwlhe = i13;
    }

    private wkgbmnqykc cdpycssgdh(long j13, long j14) {
        if ((j13 | j14) == 0) {
            return this;
        }
        return istkbnxepw(fm.ppxfxbqfkf.btonecajqb(fm.ppxfxbqfkf.btonecajqb(this.f20166zdlpuopuiu, j13), j14 / 1000000000), ((long) this.f20165yggfygwlhe) + (j14 % 1000000000));
    }

    public static wkgbmnqykc istkbnxepw(long j13, long j14) {
        return kcexrzcfyt(fm.ppxfxbqfkf.btonecajqb(j13, fm.ppxfxbqfkf.eablkybsjg(j14, 1000000000L)), fm.ppxfxbqfkf.lqeggnwhkg(j14, 1000000000));
    }

    private static wkgbmnqykc kcexrzcfyt(long j13, int i13) {
        if ((((long) i13) | j13) == 0) {
            return f20164jyumaefscl;
        }
        if (j13 < -31557014167219200L || j13 > 31556889864403199L) {
            throw new DateTimeException("Instant exceeds minimum or maximum instant");
        }
        return new wkgbmnqykc(j13, i13);
    }

    static wkgbmnqykc pkzmftpjix(DataInput dataInput) {
        return istkbnxepw(dataInput.readLong(), dataInput.readInt());
    }

    public static wkgbmnqykc pmvmpeiblj(long j13) {
        return kcexrzcfyt(fm.ppxfxbqfkf.eablkybsjg(j13, 1000L), fm.ppxfxbqfkf.lqeggnwhkg(j13, 1000) * 1000000);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new wflxmlrfwp((byte) 2, this);
    }

    public static wkgbmnqykc zdlpuopuiu(gm.eablkybsjg eablkybsjgVar) {
        try {
            return istkbnxepw(eablkybsjgVar.agtfadlqog(gm.iobyxmoadg.f37833ribwqtqdhb), eablkybsjgVar.ojitshcjhn(gm.iobyxmoadg.f37815cqumvgiudr));
        } catch (DateTimeException e13) {
            throw new DateTimeException("Unable to obtain Instant from TemporalAccessor: " + eablkybsjgVar + ", type " + eablkybsjgVar.getClass().getName(), e13);
        }
    }

    public static wkgbmnqykc zynmafqrjb(long j13) {
        return kcexrzcfyt(j13, 0);
    }

    @Override // gm.eablkybsjg
    public long agtfadlqog(gm.nufgyqmvbu nufgyqmvbuVar) {
        int i13;
        if (!(nufgyqmvbuVar instanceof gm.iobyxmoadg)) {
            return nufgyqmvbuVar.wkgbmnqykc(this);
        }
        int i14 = zoijcleaow.f20167iobyxmoadg[((gm.iobyxmoadg) nufgyqmvbuVar).ordinal()];
        if (i14 == 1) {
            i13 = this.f20165yggfygwlhe;
        } else if (i14 == 2) {
            i13 = this.f20165yggfygwlhe / 1000;
        } else {
            if (i14 != 3) {
                if (i14 == 4) {
                    return this.f20166zdlpuopuiu;
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: " + nufgyqmvbuVar);
            }
            i13 = this.f20165yggfygwlhe / 1000000;
        }
        return i13;
    }

    @Override // fm.zoijcleaow, gm.eablkybsjg
    public Object btonecajqb(gm.btonecajqb btonecajqbVar) {
        if (btonecajqbVar == gm.dxjokdxxww.eablkybsjg()) {
            return gm.zoijcleaow.NANOS;
        }
        if (btonecajqbVar == gm.dxjokdxxww.zoijcleaow() || btonecajqbVar == gm.dxjokdxxww.ppxfxbqfkf() || btonecajqbVar == gm.dxjokdxxww.iobyxmoadg() || btonecajqbVar == gm.dxjokdxxww.lqeggnwhkg() || btonecajqbVar == gm.dxjokdxxww.gxszxtbevo() || btonecajqbVar == gm.dxjokdxxww.wkgbmnqykc()) {
            return null;
        }
        return btonecajqbVar.iobyxmoadg(this);
    }

    public int cqumvgiudr() {
        return this.f20165yggfygwlhe;
    }

    @Override // gm.gxszxtbevo
    public gm.wkgbmnqykc dxjokdxxww(gm.wkgbmnqykc wkgbmnqykcVar) {
        return wkgbmnqykcVar.rgvfuqvkyq(gm.iobyxmoadg.f37833ribwqtqdhb, this.f20166zdlpuopuiu).rgvfuqvkyq(gm.iobyxmoadg.f37815cqumvgiudr, this.f20165yggfygwlhe);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkgbmnqykc)) {
            return false;
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
        return this.f20166zdlpuopuiu == wkgbmnqykcVar.f20166zdlpuopuiu && this.f20165yggfygwlhe == wkgbmnqykcVar.f20165yggfygwlhe;
    }

    public int hashCode() {
        long j13 = this.f20166zdlpuopuiu;
        return ((int) (j13 ^ (j13 >>> 32))) + (this.f20165yggfygwlhe * 51);
    }

    @Override // gm.wkgbmnqykc
    /* JADX INFO: renamed from: hcddaimhww, reason: merged with bridge method [inline-methods] */
    public wkgbmnqykc draadjrbmk(gm.gxszxtbevo gxszxtbevoVar) {
        return (wkgbmnqykc) gxszxtbevoVar.dxjokdxxww(this);
    }

    void hkdspvbjdz(DataOutput dataOutput) {
        dataOutput.writeLong(this.f20166zdlpuopuiu);
        dataOutput.writeInt(this.f20165yggfygwlhe);
    }

    @Override // gm.eablkybsjg
    public boolean iobyxmoadg(gm.nufgyqmvbu nufgyqmvbuVar) {
        if (nufgyqmvbuVar instanceof gm.iobyxmoadg) {
            return nufgyqmvbuVar == gm.iobyxmoadg.f37833ribwqtqdhb || nufgyqmvbuVar == gm.iobyxmoadg.f37815cqumvgiudr || nufgyqmvbuVar == gm.iobyxmoadg.f37827lereixgezr || nufgyqmvbuVar == gm.iobyxmoadg.f37843zynmafqrjb;
        }
        return nufgyqmvbuVar != null && nufgyqmvbuVar.nufgyqmvbu(this);
    }

    @Override // gm.wkgbmnqykc
    /* JADX INFO: renamed from: jpowsppfya, reason: merged with bridge method [inline-methods] */
    public wkgbmnqykc rgvfuqvkyq(gm.nufgyqmvbu nufgyqmvbuVar, long j13) {
        if (!(nufgyqmvbuVar instanceof gm.iobyxmoadg)) {
            return (wkgbmnqykc) nufgyqmvbuVar.btonecajqb(this, j13);
        }
        gm.iobyxmoadg iobyxmoadgVar = (gm.iobyxmoadg) nufgyqmvbuVar;
        iobyxmoadgVar.ojitshcjhn(j13);
        int i13 = zoijcleaow.f20167iobyxmoadg[iobyxmoadgVar.ordinal()];
        if (i13 == 1) {
            return j13 != ((long) this.f20165yggfygwlhe) ? kcexrzcfyt(this.f20166zdlpuopuiu, (int) j13) : this;
        }
        if (i13 == 2) {
            int i14 = ((int) j13) * 1000;
            return i14 != this.f20165yggfygwlhe ? kcexrzcfyt(this.f20166zdlpuopuiu, i14) : this;
        }
        if (i13 == 3) {
            int i15 = ((int) j13) * 1000000;
            return i15 != this.f20165yggfygwlhe ? kcexrzcfyt(this.f20166zdlpuopuiu, i15) : this;
        }
        if (i13 == 4) {
            return j13 != this.f20166zdlpuopuiu ? kcexrzcfyt(j13, this.f20165yggfygwlhe) : this;
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: " + nufgyqmvbuVar);
    }

    public long jyumaefscl() {
        return this.f20166zdlpuopuiu;
    }

    @Override // gm.wkgbmnqykc
    /* JADX INFO: renamed from: lereixgezr, reason: merged with bridge method [inline-methods] */
    public wkgbmnqykc nufgyqmvbu(long j13, gm.gtknphoqwx gtknphoqwxVar) {
        return j13 == Long.MIN_VALUE ? wkgbmnqykc(Long.MAX_VALUE, gtknphoqwxVar).wkgbmnqykc(1L, gtknphoqwxVar) : wkgbmnqykc(-j13, gtknphoqwxVar);
    }

    public wkgbmnqykc lmojexxdyd(long j13) {
        return cdpycssgdh(j13 / 1000, (j13 % 1000) * 1000000);
    }

    @Override // fm.zoijcleaow, gm.eablkybsjg
    public gm.draadjrbmk lqeggnwhkg(gm.nufgyqmvbu nufgyqmvbuVar) {
        return super.lqeggnwhkg(nufgyqmvbuVar);
    }

    @Override // fm.zoijcleaow, gm.eablkybsjg
    public int ojitshcjhn(gm.nufgyqmvbu nufgyqmvbuVar) {
        if (!(nufgyqmvbuVar instanceof gm.iobyxmoadg)) {
            return lqeggnwhkg(nufgyqmvbuVar).iobyxmoadg(nufgyqmvbuVar.wkgbmnqykc(this), nufgyqmvbuVar);
        }
        int i13 = zoijcleaow.f20167iobyxmoadg[((gm.iobyxmoadg) nufgyqmvbuVar).ordinal()];
        if (i13 == 1) {
            return this.f20165yggfygwlhe;
        }
        if (i13 == 2) {
            return this.f20165yggfygwlhe / 1000;
        }
        if (i13 == 3) {
            return this.f20165yggfygwlhe / 1000000;
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: " + nufgyqmvbuVar);
    }

    public String toString() {
        return em.iobyxmoadg.f31464zdlpuopuiu.iobyxmoadg(this);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: vdvldrhtss, reason: merged with bridge method [inline-methods] */
    public int compareTo(wkgbmnqykc wkgbmnqykcVar) {
        int iZoijcleaow = fm.ppxfxbqfkf.zoijcleaow(this.f20166zdlpuopuiu, wkgbmnqykcVar.f20166zdlpuopuiu);
        return iZoijcleaow != 0 ? iZoijcleaow : this.f20165yggfygwlhe - wkgbmnqykcVar.f20165yggfygwlhe;
    }

    public wkgbmnqykc wwaezpbzkn(long j13) {
        return cdpycssgdh(0L, j13);
    }

    @Override // gm.wkgbmnqykc
    /* JADX INFO: renamed from: yadqdtsiqt, reason: merged with bridge method [inline-methods] */
    public wkgbmnqykc wkgbmnqykc(long j13, gm.gtknphoqwx gtknphoqwxVar) {
        if (!(gtknphoqwxVar instanceof gm.zoijcleaow)) {
            return (wkgbmnqykc) gtknphoqwxVar.wkgbmnqykc(this, j13);
        }
        switch (zoijcleaow.f20168zoijcleaow[((gm.zoijcleaow) gtknphoqwxVar).ordinal()]) {
            case 1:
                return wwaezpbzkn(j13);
            case 2:
                return cdpycssgdh(j13 / 1000000, (j13 % 1000000) * 1000);
            case 3:
                return lmojexxdyd(j13);
            case 4:
                return ylkuphrtab(j13);
            case 5:
                return ylkuphrtab(fm.ppxfxbqfkf.gtknphoqwx(j13, 60));
            case 6:
                return ylkuphrtab(fm.ppxfxbqfkf.gtknphoqwx(j13, 3600));
            case 7:
                return ylkuphrtab(fm.ppxfxbqfkf.gtknphoqwx(j13, 43200));
            case 8:
                return ylkuphrtab(fm.ppxfxbqfkf.gtknphoqwx(j13, 86400));
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + gtknphoqwxVar);
        }
    }

    public wkgbmnqykc ylkuphrtab(long j13) {
        return cdpycssgdh(j13, 0L);
    }
}
