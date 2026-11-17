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
public final class eablkybsjg extends dm.iobyxmoadg implements gm.wkgbmnqykc, gm.gxszxtbevo, Serializable {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public static final eablkybsjg f20082cqumvgiudr = wypolnanlu(-999999999, 1, 1);

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    public static final eablkybsjg f20083esjtqupxsv = wypolnanlu(999999999, 12, 31);

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    public static final gm.btonecajqb f20084lereixgezr = new iobyxmoadg();
    private static final long serialVersionUID = 2942565459149668126L;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final short f20085iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final short f20086jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final int f20087yggfygwlhe;

    class iobyxmoadg implements gm.btonecajqb {
        iobyxmoadg() {
        }

        @Override // gm.btonecajqb
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public eablkybsjg iobyxmoadg(gm.eablkybsjg eablkybsjgVar) {
            return eablkybsjg.zynmafqrjb(eablkybsjgVar);
        }
    }

    static /* synthetic */ class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f20088iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        static final /* synthetic */ int[] f20089zoijcleaow;

        static {
            int[] iArr = new int[gm.zoijcleaow.values().length];
            f20089zoijcleaow = iArr;
            try {
                iArr[gm.zoijcleaow.DAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20089zoijcleaow[gm.zoijcleaow.WEEKS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20089zoijcleaow[gm.zoijcleaow.MONTHS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20089zoijcleaow[gm.zoijcleaow.YEARS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20089zoijcleaow[gm.zoijcleaow.DECADES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20089zoijcleaow[gm.zoijcleaow.CENTURIES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20089zoijcleaow[gm.zoijcleaow.MILLENNIA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f20089zoijcleaow[gm.zoijcleaow.ERAS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr2 = new int[gm.iobyxmoadg.values().length];
            f20088iobyxmoadg = iArr2;
            try {
                iArr2[gm.iobyxmoadg.f37840wypolnanlu.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f20088iobyxmoadg[gm.iobyxmoadg.f37835stevsuqkhv.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f20088iobyxmoadg[gm.iobyxmoadg.f37836tzroggbefp.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f20088iobyxmoadg[gm.iobyxmoadg.f37834sopmlzcsov.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f20088iobyxmoadg[gm.iobyxmoadg.f37820hkdspvbjdz.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f20088iobyxmoadg[gm.iobyxmoadg.f37814cllcsxoeiz.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f20088iobyxmoadg[gm.iobyxmoadg.f37817dsvhmnatus.ordinal()] = 7;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f20088iobyxmoadg[gm.iobyxmoadg.f37826kegysxyocb.ordinal()] = 8;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f20088iobyxmoadg[gm.iobyxmoadg.f37829mbcevpiqjq.ordinal()] = 9;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f20088iobyxmoadg[gm.iobyxmoadg.f37830ntlheqmsrt.ordinal()] = 10;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f20088iobyxmoadg[gm.iobyxmoadg.f37837ulzqkzuiru.ordinal()] = 11;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f20088iobyxmoadg[gm.iobyxmoadg.f37816crxdokpmqz.ordinal()] = 12;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f20088iobyxmoadg[gm.iobyxmoadg.f37824jlmebxxoox.ordinal()] = 13;
            } catch (NoSuchFieldError unused21) {
            }
        }
    }

    private eablkybsjg(int i13, int i14, int i15) {
        this.f20087yggfygwlhe = i13;
        this.f20086jyumaefscl = (short) i14;
        this.f20085iwizpuwonk = (short) i15;
    }

    private int istkbnxepw(gm.nufgyqmvbu nufgyqmvbuVar) {
        switch (zoijcleaow.f20088iobyxmoadg[((gm.iobyxmoadg) nufgyqmvbuVar).ordinal()]) {
            case 1:
                return this.f20085iwizpuwonk;
            case 2:
                return lmojexxdyd();
            case 3:
                return ((this.f20085iwizpuwonk - 1) / 7) + 1;
            case 4:
                int i13 = this.f20087yggfygwlhe;
                return i13 >= 1 ? i13 : 1 - i13;
            case 5:
                return yadqdtsiqt().kcexrzcfyt();
            case 6:
                return ((this.f20085iwizpuwonk - 1) % 7) + 1;
            case 7:
                return ((lmojexxdyd() - 1) % 7) + 1;
            case 8:
                throw new DateTimeException("Field too large for an int: " + nufgyqmvbuVar);
            case 9:
                return ((lmojexxdyd() - 1) / 7) + 1;
            case 10:
                return this.f20086jyumaefscl;
            case 11:
                throw new DateTimeException("Field too large for an int: " + nufgyqmvbuVar);
            case 12:
                return this.f20087yggfygwlhe;
            case 13:
                return this.f20087yggfygwlhe >= 1 ? 1 : 0;
            default:
                throw new UnsupportedTemporalTypeException("Unsupported field: " + nufgyqmvbuVar);
        }
    }

    static eablkybsjg jlmebxxoox(DataInput dataInput) {
        return wypolnanlu(dataInput.readInt(), dataInput.readByte(), dataInput.readByte());
    }

    public static eablkybsjg kegysxyocb(long j13) {
        long j14;
        gm.iobyxmoadg.f37826kegysxyocb.ojitshcjhn(j13);
        long j15 = 719468 + j13;
        if (j15 < 0) {
            long j16 = ((j13 + 719469) / 146097) - 1;
            j14 = j16 * 400;
            j15 += (-j16) * 146097;
        } else {
            j14 = 0;
        }
        long j17 = ((j15 * 400) + 591) / 146097;
        long j18 = j15 - ((((j17 * 365) + (j17 / 4)) - (j17 / 100)) + (j17 / 400));
        if (j18 < 0) {
            j17--;
            j18 = j15 - ((((365 * j17) + (j17 / 4)) - (j17 / 100)) + (j17 / 400));
        }
        int i13 = (int) j18;
        int i14 = ((i13 * 5) + 2) / 153;
        return new eablkybsjg(gm.iobyxmoadg.f37816crxdokpmqz.agtfadlqog(j17 + j14 + ((long) (i14 / 10))), ((i14 + 2) % 12) + 1, (i13 - (((i14 * 306) + 5) / 10)) + 1);
    }

    private static eablkybsjg pmvmpeiblj(int i13, nufgyqmvbu nufgyqmvbuVar, int i14) {
        if (i14 <= 28 || i14 <= nufgyqmvbuVar.jyumaefscl(dm.gxszxtbevo.f29133cqumvgiudr.draadjrbmk(i13))) {
            return new eablkybsjg(i13, nufgyqmvbuVar.zdlpuopuiu(), i14);
        }
        if (i14 == 29) {
            throw new DateTimeException("Invalid date 'February 29' as '" + i13 + "' is not a leap year");
        }
        throw new DateTimeException("Invalid date '" + nufgyqmvbuVar.name() + " " + i14 + "'");
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private static eablkybsjg ribwqtqdhb(int i13, int i14, int i15) {
        if (i14 == 2) {
            i15 = Math.min(i15, dm.gxszxtbevo.f29133cqumvgiudr.draadjrbmk((long) i13) ? 29 : 28);
        } else if (i14 == 4 || i14 == 6 || i14 == 9 || i14 == 11) {
            i15 = Math.min(i15, 30);
        }
        return wypolnanlu(i13, i14, i15);
    }

    public static eablkybsjg stevsuqkhv(int i13, nufgyqmvbu nufgyqmvbuVar, int i14) {
        gm.iobyxmoadg.f37816crxdokpmqz.ojitshcjhn(i13);
        fm.ppxfxbqfkf.dxjokdxxww(nufgyqmvbuVar, "month");
        gm.iobyxmoadg.f37840wypolnanlu.ojitshcjhn(i14);
        return pmvmpeiblj(i13, nufgyqmvbuVar, i14);
    }

    public static eablkybsjg tzroggbefp(int i13, int i14) {
        long j13 = i13;
        gm.iobyxmoadg.f37816crxdokpmqz.ojitshcjhn(j13);
        gm.iobyxmoadg.f37835stevsuqkhv.ojitshcjhn(i14);
        boolean zDraadjrbmk = dm.gxszxtbevo.f29133cqumvgiudr.draadjrbmk(j13);
        if (i14 != 366 || zDraadjrbmk) {
            nufgyqmvbu nufgyqmvbuVarPmvmpeiblj = nufgyqmvbu.pmvmpeiblj(((i14 - 1) / 31) + 1);
            if (i14 > (nufgyqmvbuVarPmvmpeiblj.vdvldrhtss(zDraadjrbmk) + nufgyqmvbuVarPmvmpeiblj.jyumaefscl(zDraadjrbmk)) - 1) {
                nufgyqmvbuVarPmvmpeiblj = nufgyqmvbuVarPmvmpeiblj.zynmafqrjb(1L);
            }
            return pmvmpeiblj(i13, nufgyqmvbuVarPmvmpeiblj, (i14 - nufgyqmvbuVarPmvmpeiblj.vdvldrhtss(zDraadjrbmk)) + 1);
        }
        throw new DateTimeException("Invalid date 'DayOfYear 366' as '" + i13 + "' is not a leap year");
    }

    private Object writeReplace() {
        return new wflxmlrfwp((byte) 3, this);
    }

    public static eablkybsjg wypolnanlu(int i13, int i14, int i15) {
        gm.iobyxmoadg.f37816crxdokpmqz.ojitshcjhn(i13);
        gm.iobyxmoadg.f37830ntlheqmsrt.ojitshcjhn(i14);
        gm.iobyxmoadg.f37840wypolnanlu.ojitshcjhn(i15);
        return pmvmpeiblj(i13, nufgyqmvbu.pmvmpeiblj(i14), i15);
    }

    private long ylkuphrtab() {
        return (((long) this.f20087yggfygwlhe) * 12) + ((long) (this.f20086jyumaefscl - 1));
    }

    public static eablkybsjg zynmafqrjb(gm.eablkybsjg eablkybsjgVar) {
        eablkybsjg eablkybsjgVar2 = (eablkybsjg) eablkybsjgVar.btonecajqb(gm.dxjokdxxww.zoijcleaow());
        if (eablkybsjgVar2 != null) {
            return eablkybsjgVar2;
        }
        throw new DateTimeException("Unable to obtain LocalDate from TemporalAccessor: " + eablkybsjgVar + ", type " + eablkybsjgVar.getClass().getName());
    }

    @Override // gm.eablkybsjg
    public long agtfadlqog(gm.nufgyqmvbu nufgyqmvbuVar) {
        if (!(nufgyqmvbuVar instanceof gm.iobyxmoadg)) {
            return nufgyqmvbuVar.wkgbmnqykc(this);
        }
        if (nufgyqmvbuVar == gm.iobyxmoadg.f37826kegysxyocb) {
            return cqumvgiudr();
        }
        return nufgyqmvbuVar == gm.iobyxmoadg.f37837ulzqkzuiru ? ylkuphrtab() : istkbnxepw(nufgyqmvbuVar);
    }

    @Override // dm.iobyxmoadg, fm.zoijcleaow, gm.eablkybsjg
    public Object btonecajqb(gm.btonecajqb btonecajqbVar) {
        return btonecajqbVar == gm.dxjokdxxww.zoijcleaow() ? this : super.btonecajqb(btonecajqbVar);
    }

    @Override // dm.iobyxmoadg
    /* JADX INFO: renamed from: cdpycssgdh, reason: merged with bridge method [inline-methods] */
    public dm.gxszxtbevo kcexrzcfyt() {
        return dm.gxszxtbevo.f29133cqumvgiudr;
    }

    @Override // dm.iobyxmoadg
    /* JADX INFO: renamed from: cllcsxoeiz, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public eablkybsjg zdlpuopuiu(long j13, gm.gtknphoqwx gtknphoqwxVar) {
        return j13 == Long.MIN_VALUE ? jyumaefscl(Long.MAX_VALUE, gtknphoqwxVar).jyumaefscl(1L, gtknphoqwxVar) : jyumaefscl(-j13, gtknphoqwxVar);
    }

    @Override // dm.iobyxmoadg
    public long cqumvgiudr() {
        long j13 = this.f20087yggfygwlhe;
        long j14 = this.f20086jyumaefscl;
        long j15 = 365 * j13;
        long j16 = (j13 >= 0 ? j15 + (((3 + j13) / 4) - ((99 + j13) / 100)) + ((j13 + 399) / 400) : j15 - (((j13 / (-4)) - (j13 / (-100))) + (j13 / (-400)))) + (((367 * j14) - 362) / 12) + ((long) (this.f20085iwizpuwonk - 1));
        if (j14 > 2) {
            j16 = !hcddaimhww() ? j16 - 2 : j16 - 1;
        }
        return j16 - 719528;
    }

    public eablkybsjg crxdokpmqz(long j13) {
        return j13 == 0 ? this : ribwqtqdhb(gm.iobyxmoadg.f37816crxdokpmqz.agtfadlqog(((long) this.f20087yggfygwlhe) + j13), this.f20086jyumaefscl, this.f20085iwizpuwonk);
    }

    public eablkybsjg dsvhmnatus(long j13) {
        return j13 == Long.MIN_VALUE ? crxdokpmqz(Long.MAX_VALUE).crxdokpmqz(1L) : crxdokpmqz(-j13);
    }

    @Override // dm.iobyxmoadg, gm.gxszxtbevo
    public gm.wkgbmnqykc dxjokdxxww(gm.wkgbmnqykc wkgbmnqykcVar) {
        return super.dxjokdxxww(wkgbmnqykcVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eablkybsjg) && lereixgezr((eablkybsjg) obj) == 0;
    }

    public int hashCode() {
        int i13 = this.f20087yggfygwlhe;
        return (((i13 << 11) + (this.f20086jyumaefscl << 6)) + this.f20085iwizpuwonk) ^ (i13 & (-2048));
    }

    public boolean hcddaimhww() {
        return dm.gxszxtbevo.f29133cqumvgiudr.draadjrbmk(this.f20087yggfygwlhe);
    }

    public int hkdspvbjdz() {
        return hcddaimhww() ? 366 : 365;
    }

    public eablkybsjg ikoacuggdj(int i13) {
        return this.f20085iwizpuwonk == i13 ? this : wypolnanlu(this.f20087yggfygwlhe, this.f20086jyumaefscl, i13);
    }

    @Override // dm.iobyxmoadg, gm.eablkybsjg
    public boolean iobyxmoadg(gm.nufgyqmvbu nufgyqmvbuVar) {
        return super.iobyxmoadg(nufgyqmvbuVar);
    }

    @Override // gm.wkgbmnqykc
    /* JADX INFO: renamed from: jhduphickx, reason: merged with bridge method [inline-methods] */
    public eablkybsjg rgvfuqvkyq(gm.nufgyqmvbu nufgyqmvbuVar, long j13) {
        if (!(nufgyqmvbuVar instanceof gm.iobyxmoadg)) {
            return (eablkybsjg) nufgyqmvbuVar.btonecajqb(this, j13);
        }
        gm.iobyxmoadg iobyxmoadgVar = (gm.iobyxmoadg) nufgyqmvbuVar;
        iobyxmoadgVar.ojitshcjhn(j13);
        switch (zoijcleaow.f20088iobyxmoadg[iobyxmoadgVar.ordinal()]) {
            case 1:
                return ikoacuggdj((int) j13);
            case 2:
                return okpsazkaxt((int) j13);
            case 3:
                return sopmlzcsov(j13 - agtfadlqog(gm.iobyxmoadg.f37836tzroggbefp));
            case 4:
                if (this.f20087yggfygwlhe < 1) {
                    j13 = 1 - j13;
                }
                return xrmfcynszj((int) j13);
            case 5:
                return ntlheqmsrt(j13 - ((long) yadqdtsiqt().kcexrzcfyt()));
            case 6:
                return ntlheqmsrt(j13 - agtfadlqog(gm.iobyxmoadg.f37814cllcsxoeiz));
            case 7:
                return ntlheqmsrt(j13 - agtfadlqog(gm.iobyxmoadg.f37817dsvhmnatus));
            case 8:
                return kegysxyocb(j13);
            case 9:
                return sopmlzcsov(j13 - agtfadlqog(gm.iobyxmoadg.f37829mbcevpiqjq));
            case 10:
                return jztzpxfvev((int) j13);
            case 11:
                return ulzqkzuiru(j13 - agtfadlqog(gm.iobyxmoadg.f37837ulzqkzuiru));
            case 12:
                return xrmfcynszj((int) j13);
            case 13:
                return agtfadlqog(gm.iobyxmoadg.f37824jlmebxxoox) == j13 ? this : xrmfcynszj(1 - this.f20087yggfygwlhe);
            default:
                throw new UnsupportedTemporalTypeException("Unsupported field: " + nufgyqmvbuVar);
        }
    }

    public int jpowsppfya() {
        short s13 = this.f20086jyumaefscl;
        if (s13 != 2) {
            return (s13 == 4 || s13 == 6 || s13 == 9 || s13 == 11) ? 30 : 31;
        }
        return hcddaimhww() ? 29 : 28;
    }

    public eablkybsjg jztzpxfvev(int i13) {
        if (this.f20086jyumaefscl == i13) {
            return this;
        }
        gm.iobyxmoadg.f37830ntlheqmsrt.ojitshcjhn(i13);
        return ribwqtqdhb(this.f20087yggfygwlhe, i13, this.f20085iwizpuwonk);
    }

    int lereixgezr(eablkybsjg eablkybsjgVar) {
        int i13 = this.f20087yggfygwlhe - eablkybsjgVar.f20087yggfygwlhe;
        if (i13 != 0) {
            return i13;
        }
        int i14 = this.f20086jyumaefscl - eablkybsjgVar.f20086jyumaefscl;
        return i14 == 0 ? this.f20085iwizpuwonk - eablkybsjgVar.f20085iwizpuwonk : i14;
    }

    public int lmojexxdyd() {
        return (wwaezpbzkn().vdvldrhtss(hcddaimhww()) + this.f20085iwizpuwonk) - 1;
    }

    @Override // fm.zoijcleaow, gm.eablkybsjg
    public gm.draadjrbmk lqeggnwhkg(gm.nufgyqmvbu nufgyqmvbuVar) {
        if (!(nufgyqmvbuVar instanceof gm.iobyxmoadg)) {
            return nufgyqmvbuVar.lqeggnwhkg(this);
        }
        gm.iobyxmoadg iobyxmoadgVar = (gm.iobyxmoadg) nufgyqmvbuVar;
        if (!iobyxmoadgVar.iobyxmoadg()) {
            throw new UnsupportedTemporalTypeException("Unsupported field: " + nufgyqmvbuVar);
        }
        int i13 = zoijcleaow.f20088iobyxmoadg[iobyxmoadgVar.ordinal()];
        if (i13 == 1) {
            return gm.draadjrbmk.ojitshcjhn(1L, jpowsppfya());
        }
        if (i13 == 2) {
            return gm.draadjrbmk.ojitshcjhn(1L, hkdspvbjdz());
        }
        if (i13 == 3) {
            return gm.draadjrbmk.ojitshcjhn(1L, (wwaezpbzkn() != nufgyqmvbu.FEBRUARY || hcddaimhww()) ? 5L : 4L);
        }
        if (i13 != 4) {
            return nufgyqmvbuVar.dxjokdxxww();
        }
        return gm.draadjrbmk.ojitshcjhn(1L, pkzmftpjix() <= 0 ? 1000000000L : 999999999L);
    }

    @Override // gm.wkgbmnqykc
    /* JADX INFO: renamed from: mbcevpiqjq, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public eablkybsjg wkgbmnqykc(long j13, gm.gtknphoqwx gtknphoqwxVar) {
        if (!(gtknphoqwxVar instanceof gm.zoijcleaow)) {
            return (eablkybsjg) gtknphoqwxVar.wkgbmnqykc(this, j13);
        }
        switch (zoijcleaow.f20089zoijcleaow[((gm.zoijcleaow) gtknphoqwxVar).ordinal()]) {
            case 1:
                return ntlheqmsrt(j13);
            case 2:
                return sopmlzcsov(j13);
            case 3:
                return ulzqkzuiru(j13);
            case 4:
                return crxdokpmqz(j13);
            case 5:
                return crxdokpmqz(fm.ppxfxbqfkf.gtknphoqwx(j13, 10));
            case 6:
                return crxdokpmqz(fm.ppxfxbqfkf.gtknphoqwx(j13, 100));
            case 7:
                return crxdokpmqz(fm.ppxfxbqfkf.gtknphoqwx(j13, 1000));
            case 8:
                gm.iobyxmoadg iobyxmoadgVar = gm.iobyxmoadg.f37824jlmebxxoox;
                return rgvfuqvkyq(iobyxmoadgVar, fm.ppxfxbqfkf.btonecajqb(agtfadlqog(iobyxmoadgVar), j13));
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + gtknphoqwxVar);
        }
    }

    void metgxyhuhe(DataOutput dataOutput) {
        dataOutput.writeInt(this.f20087yggfygwlhe);
        dataOutput.writeByte(this.f20086jyumaefscl);
        dataOutput.writeByte(this.f20085iwizpuwonk);
    }

    public eablkybsjg ntlheqmsrt(long j13) {
        return j13 == 0 ? this : kegysxyocb(fm.ppxfxbqfkf.btonecajqb(cqumvgiudr(), j13));
    }

    @Override // fm.zoijcleaow, gm.eablkybsjg
    public int ojitshcjhn(gm.nufgyqmvbu nufgyqmvbuVar) {
        return nufgyqmvbuVar instanceof gm.iobyxmoadg ? istkbnxepw(nufgyqmvbuVar) : super.ojitshcjhn(nufgyqmvbuVar);
    }

    public eablkybsjg okpsazkaxt(int i13) {
        return lmojexxdyd() == i13 ? this : tzroggbefp(this.f20087yggfygwlhe, i13);
    }

    public int pkzmftpjix() {
        return this.f20087yggfygwlhe;
    }

    public eablkybsjg sopmlzcsov(long j13) {
        return ntlheqmsrt(fm.ppxfxbqfkf.gtknphoqwx(j13, 7));
    }

    public String toString() {
        int i13 = this.f20087yggfygwlhe;
        short s13 = this.f20086jyumaefscl;
        short s14 = this.f20085iwizpuwonk;
        int iAbs = Math.abs(i13);
        StringBuilder sb3 = new StringBuilder(10);
        if (iAbs >= 1000) {
            if (i13 > 9999) {
                sb3.append('+');
            }
            sb3.append(i13);
        } else if (i13 < 0) {
            sb3.append(i13 - 10000);
            sb3.deleteCharAt(1);
        } else {
            sb3.append(i13 + AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND);
            sb3.deleteCharAt(0);
        }
        sb3.append(s13 < 10 ? "-0" : "-");
        sb3.append((int) s13);
        sb3.append(s14 < 10 ? "-0" : "-");
        sb3.append((int) s14);
        return sb3.toString();
    }

    public eablkybsjg ulzqkzuiru(long j13) {
        if (j13 == 0) {
            return this;
        }
        long j14 = (((long) this.f20087yggfygwlhe) * 12) + ((long) (this.f20086jyumaefscl - 1)) + j13;
        return ribwqtqdhb(gm.iobyxmoadg.f37816crxdokpmqz.agtfadlqog(fm.ppxfxbqfkf.eablkybsjg(j14, 12L)), fm.ppxfxbqfkf.lqeggnwhkg(j14, 12) + 1, this.f20085iwizpuwonk);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: vdvldrhtss, reason: merged with bridge method [inline-methods] */
    public int compareTo(dm.iobyxmoadg iobyxmoadgVar) {
        return iobyxmoadgVar instanceof eablkybsjg ? lereixgezr((eablkybsjg) iobyxmoadgVar) : super.compareTo(iobyxmoadgVar);
    }

    @Override // gm.wkgbmnqykc
    /* JADX INFO: renamed from: vipkmwdibw, reason: merged with bridge method [inline-methods] */
    public eablkybsjg draadjrbmk(gm.gxszxtbevo gxszxtbevoVar) {
        return gxszxtbevoVar instanceof eablkybsjg ? (eablkybsjg) gxszxtbevoVar : (eablkybsjg) gxszxtbevoVar.dxjokdxxww(this);
    }

    public nufgyqmvbu wwaezpbzkn() {
        return nufgyqmvbu.pmvmpeiblj(this.f20086jyumaefscl);
    }

    public eablkybsjg xrmfcynszj(int i13) {
        if (this.f20087yggfygwlhe == i13) {
            return this;
        }
        gm.iobyxmoadg.f37816crxdokpmqz.ojitshcjhn(i13);
        return ribwqtqdhb(i13, this.f20086jyumaefscl, this.f20085iwizpuwonk);
    }

    public cm.zoijcleaow yadqdtsiqt() {
        return cm.zoijcleaow.zdlpuopuiu(fm.ppxfxbqfkf.lqeggnwhkg(cqumvgiudr() + 3, 7) + 1);
    }
}
