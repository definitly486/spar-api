package cm;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;

/* JADX INFO: loaded from: classes3.dex */
public final class ojitshcjhn extends fm.zoijcleaow implements gm.wkgbmnqykc, gm.gxszxtbevo, Comparable, Serializable {
    private static final long serialVersionUID = 4183400860270640070L;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final int f20137yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final int f20138zdlpuopuiu;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public static final gm.btonecajqb f20136jyumaefscl = new iobyxmoadg();

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private static final em.iobyxmoadg f20135iwizpuwonk = new em.zoijcleaow().rgvfuqvkyq(gm.iobyxmoadg.f37816crxdokpmqz, 4, 10, em.lqeggnwhkg.EXCEEDS_PAD).eablkybsjg('-').ojitshcjhn(gm.iobyxmoadg.f37830ntlheqmsrt, 2).cdpycssgdh();

    class iobyxmoadg implements gm.btonecajqb {
        iobyxmoadg() {
        }

        @Override // gm.btonecajqb
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public ojitshcjhn iobyxmoadg(gm.eablkybsjg eablkybsjgVar) {
            return ojitshcjhn.kcexrzcfyt(eablkybsjgVar);
        }
    }

    static /* synthetic */ class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f20139iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        static final /* synthetic */ int[] f20140zoijcleaow;

        static {
            int[] iArr = new int[gm.zoijcleaow.values().length];
            f20140zoijcleaow = iArr;
            try {
                iArr[gm.zoijcleaow.MONTHS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20140zoijcleaow[gm.zoijcleaow.YEARS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20140zoijcleaow[gm.zoijcleaow.DECADES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20140zoijcleaow[gm.zoijcleaow.CENTURIES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20140zoijcleaow[gm.zoijcleaow.MILLENNIA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20140zoijcleaow[gm.zoijcleaow.ERAS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[gm.iobyxmoadg.values().length];
            f20139iobyxmoadg = iArr2;
            try {
                iArr2[gm.iobyxmoadg.f37830ntlheqmsrt.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f20139iobyxmoadg[gm.iobyxmoadg.f37837ulzqkzuiru.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f20139iobyxmoadg[gm.iobyxmoadg.f37834sopmlzcsov.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f20139iobyxmoadg[gm.iobyxmoadg.f37816crxdokpmqz.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f20139iobyxmoadg[gm.iobyxmoadg.f37824jlmebxxoox.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    private ojitshcjhn(int i13, int i14) {
        this.f20138zdlpuopuiu = i13;
        this.f20137yggfygwlhe = i14;
    }

    static ojitshcjhn cdpycssgdh(DataInput dataInput) {
        return lereixgezr(dataInput.readInt(), dataInput.readByte());
    }

    public static ojitshcjhn kcexrzcfyt(gm.eablkybsjg eablkybsjgVar) {
        if (eablkybsjgVar instanceof ojitshcjhn) {
            return (ojitshcjhn) eablkybsjgVar;
        }
        try {
            if (!dm.gxszxtbevo.f29133cqumvgiudr.equals(dm.eablkybsjg.lqeggnwhkg(eablkybsjgVar))) {
                eablkybsjgVar = eablkybsjg.zynmafqrjb(eablkybsjgVar);
            }
            return lereixgezr(eablkybsjgVar.ojitshcjhn(gm.iobyxmoadg.f37816crxdokpmqz), eablkybsjgVar.ojitshcjhn(gm.iobyxmoadg.f37830ntlheqmsrt));
        } catch (DateTimeException unused) {
            throw new DateTimeException("Unable to obtain YearMonth from TemporalAccessor: " + eablkybsjgVar + ", type " + eablkybsjgVar.getClass().getName());
        }
    }

    public static ojitshcjhn lereixgezr(int i13, int i14) {
        gm.iobyxmoadg.f37816crxdokpmqz.ojitshcjhn(i13);
        gm.iobyxmoadg.f37830ntlheqmsrt.ojitshcjhn(i14);
        return new ojitshcjhn(i13, i14);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new wflxmlrfwp((byte) 68, this);
    }

    private ojitshcjhn yadqdtsiqt(int i13, int i14) {
        return (this.f20138zdlpuopuiu == i13 && this.f20137yggfygwlhe == i14) ? this : new ojitshcjhn(i13, i14);
    }

    private long zdlpuopuiu() {
        return (((long) this.f20138zdlpuopuiu) * 12) + ((long) (this.f20137yggfygwlhe - 1));
    }

    @Override // gm.eablkybsjg
    public long agtfadlqog(gm.nufgyqmvbu nufgyqmvbuVar) {
        int i13;
        if (!(nufgyqmvbuVar instanceof gm.iobyxmoadg)) {
            return nufgyqmvbuVar.wkgbmnqykc(this);
        }
        int i14 = zoijcleaow.f20139iobyxmoadg[((gm.iobyxmoadg) nufgyqmvbuVar).ordinal()];
        if (i14 == 1) {
            i13 = this.f20137yggfygwlhe;
        } else {
            if (i14 == 2) {
                return zdlpuopuiu();
            }
            if (i14 == 3) {
                int i15 = this.f20138zdlpuopuiu;
                if (i15 < 1) {
                    i15 = 1 - i15;
                }
                return i15;
            }
            if (i14 != 4) {
                if (i14 == 5) {
                    return this.f20138zdlpuopuiu < 1 ? 0 : 1;
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: " + nufgyqmvbuVar);
            }
            i13 = this.f20138zdlpuopuiu;
        }
        return i13;
    }

    @Override // fm.zoijcleaow, gm.eablkybsjg
    public Object btonecajqb(gm.btonecajqb btonecajqbVar) {
        if (btonecajqbVar == gm.dxjokdxxww.iobyxmoadg()) {
            return dm.gxszxtbevo.f29133cqumvgiudr;
        }
        if (btonecajqbVar == gm.dxjokdxxww.eablkybsjg()) {
            return gm.zoijcleaow.MONTHS;
        }
        if (btonecajqbVar == gm.dxjokdxxww.zoijcleaow() || btonecajqbVar == gm.dxjokdxxww.ppxfxbqfkf() || btonecajqbVar == gm.dxjokdxxww.gxszxtbevo() || btonecajqbVar == gm.dxjokdxxww.lqeggnwhkg() || btonecajqbVar == gm.dxjokdxxww.wkgbmnqykc()) {
            return null;
        }
        return super.btonecajqb(btonecajqbVar);
    }

    @Override // gm.wkgbmnqykc
    /* JADX INFO: renamed from: cqumvgiudr, reason: merged with bridge method [inline-methods] */
    public ojitshcjhn zdlpuopuiu(long j13, gm.gtknphoqwx gtknphoqwxVar) {
        return j13 == Long.MIN_VALUE ? wkgbmnqykc(Long.MAX_VALUE, gtknphoqwxVar).wkgbmnqykc(1L, gtknphoqwxVar) : wkgbmnqykc(-j13, gtknphoqwxVar);
    }

    @Override // gm.gxszxtbevo
    public gm.wkgbmnqykc dxjokdxxww(gm.wkgbmnqykc wkgbmnqykcVar) {
        if (dm.eablkybsjg.lqeggnwhkg(wkgbmnqykcVar).equals(dm.gxszxtbevo.f29133cqumvgiudr)) {
            return wkgbmnqykcVar.rgvfuqvkyq(gm.iobyxmoadg.f37837ulzqkzuiru, zdlpuopuiu());
        }
        throw new DateTimeException("Adjustment only supported on ISO date-time");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ojitshcjhn)) {
            return false;
        }
        ojitshcjhn ojitshcjhnVar = (ojitshcjhn) obj;
        return this.f20138zdlpuopuiu == ojitshcjhnVar.f20138zdlpuopuiu && this.f20137yggfygwlhe == ojitshcjhnVar.f20137yggfygwlhe;
    }

    public int hashCode() {
        return this.f20138zdlpuopuiu ^ (this.f20137yggfygwlhe << 27);
    }

    void hcddaimhww(DataOutput dataOutput) {
        dataOutput.writeInt(this.f20138zdlpuopuiu);
        dataOutput.writeByte(this.f20137yggfygwlhe);
    }

    @Override // gm.eablkybsjg
    public boolean iobyxmoadg(gm.nufgyqmvbu nufgyqmvbuVar) {
        if (nufgyqmvbuVar instanceof gm.iobyxmoadg) {
            return nufgyqmvbuVar == gm.iobyxmoadg.f37816crxdokpmqz || nufgyqmvbuVar == gm.iobyxmoadg.f37830ntlheqmsrt || nufgyqmvbuVar == gm.iobyxmoadg.f37837ulzqkzuiru || nufgyqmvbuVar == gm.iobyxmoadg.f37834sopmlzcsov || nufgyqmvbuVar == gm.iobyxmoadg.f37824jlmebxxoox;
        }
        return nufgyqmvbuVar != null && nufgyqmvbuVar.nufgyqmvbu(this);
    }

    public ojitshcjhn istkbnxepw(long j13) {
        return j13 == 0 ? this : yadqdtsiqt(gm.iobyxmoadg.f37816crxdokpmqz.agtfadlqog(((long) this.f20138zdlpuopuiu) + j13), this.f20137yggfygwlhe);
    }

    public int jyumaefscl() {
        return this.f20138zdlpuopuiu;
    }

    @Override // gm.wkgbmnqykc
    /* JADX INFO: renamed from: lmojexxdyd, reason: merged with bridge method [inline-methods] */
    public ojitshcjhn draadjrbmk(gm.gxszxtbevo gxszxtbevoVar) {
        return (ojitshcjhn) gxszxtbevoVar.dxjokdxxww(this);
    }

    @Override // fm.zoijcleaow, gm.eablkybsjg
    public gm.draadjrbmk lqeggnwhkg(gm.nufgyqmvbu nufgyqmvbuVar) {
        if (nufgyqmvbuVar == gm.iobyxmoadg.f37834sopmlzcsov) {
            return gm.draadjrbmk.ojitshcjhn(1L, jyumaefscl() <= 0 ? 1000000000L : 999999999L);
        }
        return super.lqeggnwhkg(nufgyqmvbuVar);
    }

    @Override // fm.zoijcleaow, gm.eablkybsjg
    public int ojitshcjhn(gm.nufgyqmvbu nufgyqmvbuVar) {
        return lqeggnwhkg(nufgyqmvbuVar).iobyxmoadg(agtfadlqog(nufgyqmvbuVar), nufgyqmvbuVar);
    }

    public ojitshcjhn pkzmftpjix(int i13) {
        gm.iobyxmoadg.f37816crxdokpmqz.ojitshcjhn(i13);
        return yadqdtsiqt(i13, this.f20137yggfygwlhe);
    }

    @Override // gm.wkgbmnqykc
    /* JADX INFO: renamed from: pmvmpeiblj, reason: merged with bridge method [inline-methods] */
    public ojitshcjhn wkgbmnqykc(long j13, gm.gtknphoqwx gtknphoqwxVar) {
        if (!(gtknphoqwxVar instanceof gm.zoijcleaow)) {
            return (ojitshcjhn) gtknphoqwxVar.wkgbmnqykc(this, j13);
        }
        switch (zoijcleaow.f20140zoijcleaow[((gm.zoijcleaow) gtknphoqwxVar).ordinal()]) {
            case 1:
                return zynmafqrjb(j13);
            case 2:
                return istkbnxepw(j13);
            case 3:
                return istkbnxepw(fm.ppxfxbqfkf.gtknphoqwx(j13, 10));
            case 4:
                return istkbnxepw(fm.ppxfxbqfkf.gtknphoqwx(j13, 100));
            case 5:
                return istkbnxepw(fm.ppxfxbqfkf.gtknphoqwx(j13, 1000));
            case 6:
                gm.iobyxmoadg iobyxmoadgVar = gm.iobyxmoadg.f37824jlmebxxoox;
                return rgvfuqvkyq(iobyxmoadgVar, fm.ppxfxbqfkf.btonecajqb(agtfadlqog(iobyxmoadgVar), j13));
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + gtknphoqwxVar);
        }
    }

    public String toString() {
        int iAbs = Math.abs(this.f20138zdlpuopuiu);
        StringBuilder sb3 = new StringBuilder(9);
        if (iAbs < 1000) {
            int i13 = this.f20138zdlpuopuiu;
            if (i13 < 0) {
                sb3.append(i13 - 10000);
                sb3.deleteCharAt(1);
            } else {
                sb3.append(i13 + AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND);
                sb3.deleteCharAt(0);
            }
        } else {
            sb3.append(this.f20138zdlpuopuiu);
        }
        sb3.append(this.f20137yggfygwlhe < 10 ? "-0" : "-");
        sb3.append(this.f20137yggfygwlhe);
        return sb3.toString();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: vdvldrhtss, reason: merged with bridge method [inline-methods] */
    public int compareTo(ojitshcjhn ojitshcjhnVar) {
        int i13 = this.f20138zdlpuopuiu - ojitshcjhnVar.f20138zdlpuopuiu;
        return i13 == 0 ? this.f20137yggfygwlhe - ojitshcjhnVar.f20137yggfygwlhe : i13;
    }

    @Override // gm.wkgbmnqykc
    /* JADX INFO: renamed from: wwaezpbzkn, reason: merged with bridge method [inline-methods] */
    public ojitshcjhn rgvfuqvkyq(gm.nufgyqmvbu nufgyqmvbuVar, long j13) {
        if (!(nufgyqmvbuVar instanceof gm.iobyxmoadg)) {
            return (ojitshcjhn) nufgyqmvbuVar.btonecajqb(this, j13);
        }
        gm.iobyxmoadg iobyxmoadgVar = (gm.iobyxmoadg) nufgyqmvbuVar;
        iobyxmoadgVar.ojitshcjhn(j13);
        int i13 = zoijcleaow.f20139iobyxmoadg[iobyxmoadgVar.ordinal()];
        if (i13 == 1) {
            return ylkuphrtab((int) j13);
        }
        if (i13 == 2) {
            return zynmafqrjb(j13 - agtfadlqog(gm.iobyxmoadg.f37837ulzqkzuiru));
        }
        if (i13 == 3) {
            if (this.f20138zdlpuopuiu < 1) {
                j13 = 1 - j13;
            }
            return pkzmftpjix((int) j13);
        }
        if (i13 == 4) {
            return pkzmftpjix((int) j13);
        }
        if (i13 == 5) {
            return agtfadlqog(gm.iobyxmoadg.f37824jlmebxxoox) == j13 ? this : pkzmftpjix(1 - this.f20138zdlpuopuiu);
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: " + nufgyqmvbuVar);
    }

    public ojitshcjhn ylkuphrtab(int i13) {
        gm.iobyxmoadg.f37830ntlheqmsrt.ojitshcjhn(i13);
        return yadqdtsiqt(this.f20138zdlpuopuiu, i13);
    }

    public ojitshcjhn zynmafqrjb(long j13) {
        if (j13 == 0) {
            return this;
        }
        long j14 = (((long) this.f20138zdlpuopuiu) * 12) + ((long) (this.f20137yggfygwlhe - 1)) + j13;
        return yadqdtsiqt(gm.iobyxmoadg.f37816crxdokpmqz.agtfadlqog(fm.ppxfxbqfkf.eablkybsjg(j14, 12L)), fm.ppxfxbqfkf.lqeggnwhkg(j14, 12) + 1);
    }
}
