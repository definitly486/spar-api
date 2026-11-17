package cm;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;

/* JADX INFO: loaded from: classes3.dex */
public final class lqeggnwhkg extends fm.zoijcleaow implements gm.wkgbmnqykc, gm.gxszxtbevo, Comparable, Serializable {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public static final lqeggnwhkg f20107cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    public static final lqeggnwhkg f20108esjtqupxsv;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    public static final lqeggnwhkg f20110lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    public static final lqeggnwhkg f20111pmvmpeiblj;
    private static final long serialVersionUID = 6414437269572265201L;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final int f20113iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final byte f20114jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final byte f20115yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final byte f20116zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    public static final gm.btonecajqb f20112zynmafqrjb = new iobyxmoadg();

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private static final lqeggnwhkg[] f20109istkbnxepw = new lqeggnwhkg[24];

    class iobyxmoadg implements gm.btonecajqb {
        iobyxmoadg() {
        }

        @Override // gm.btonecajqb
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public lqeggnwhkg iobyxmoadg(gm.eablkybsjg eablkybsjgVar) {
            return lqeggnwhkg.jyumaefscl(eablkybsjgVar);
        }
    }

    static /* synthetic */ class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f20117iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        static final /* synthetic */ int[] f20118zoijcleaow;

        static {
            int[] iArr = new int[gm.zoijcleaow.values().length];
            f20118zoijcleaow = iArr;
            try {
                iArr[gm.zoijcleaow.NANOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20118zoijcleaow[gm.zoijcleaow.MICROS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20118zoijcleaow[gm.zoijcleaow.MILLIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20118zoijcleaow[gm.zoijcleaow.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20118zoijcleaow[gm.zoijcleaow.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20118zoijcleaow[gm.zoijcleaow.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20118zoijcleaow[gm.zoijcleaow.HALF_DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[gm.iobyxmoadg.values().length];
            f20117iobyxmoadg = iArr2;
            try {
                iArr2[gm.iobyxmoadg.f37815cqumvgiudr.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f20117iobyxmoadg[gm.iobyxmoadg.f37818esjtqupxsv.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f20117iobyxmoadg[gm.iobyxmoadg.f37827lereixgezr.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f20117iobyxmoadg[gm.iobyxmoadg.f37832pmvmpeiblj.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f20117iobyxmoadg[gm.iobyxmoadg.f37843zynmafqrjb.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f20117iobyxmoadg[gm.iobyxmoadg.f37822istkbnxepw.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f20117iobyxmoadg[gm.iobyxmoadg.f37813cdpycssgdh.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f20117iobyxmoadg[gm.iobyxmoadg.f37841yadqdtsiqt.ordinal()] = 8;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f20117iobyxmoadg[gm.iobyxmoadg.f37821iozdgvuglv.ordinal()] = 9;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f20117iobyxmoadg[gm.iobyxmoadg.f37828lmojexxdyd.ordinal()] = 10;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f20117iobyxmoadg[gm.iobyxmoadg.f37839wwaezpbzkn.ordinal()] = 11;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f20117iobyxmoadg[gm.iobyxmoadg.f37842ylkuphrtab.ordinal()] = 12;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f20117iobyxmoadg[gm.iobyxmoadg.f37831pkzmftpjix.ordinal()] = 13;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f20117iobyxmoadg[gm.iobyxmoadg.f37819hcddaimhww.ordinal()] = 14;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f20117iobyxmoadg[gm.iobyxmoadg.f37825jpowsppfya.ordinal()] = 15;
            } catch (NoSuchFieldError unused22) {
            }
        }
    }

    static {
        int i13 = 0;
        while (true) {
            lqeggnwhkg[] lqeggnwhkgVarArr = f20109istkbnxepw;
            if (i13 >= lqeggnwhkgVarArr.length) {
                lqeggnwhkg lqeggnwhkgVar = lqeggnwhkgVarArr[0];
                f20110lereixgezr = lqeggnwhkgVar;
                f20111pmvmpeiblj = lqeggnwhkgVarArr[12];
                f20107cqumvgiudr = lqeggnwhkgVar;
                f20108esjtqupxsv = new lqeggnwhkg(23, 59, 59, 999999999);
                return;
            }
            lqeggnwhkgVarArr[i13] = new lqeggnwhkg(i13, 0, 0, 0);
            i13++;
        }
    }

    private lqeggnwhkg(int i13, int i14, int i15, int i16) {
        this.f20116zdlpuopuiu = (byte) i13;
        this.f20115yggfygwlhe = (byte) i14;
        this.f20114jyumaefscl = (byte) i15;
        this.f20113iwizpuwonk = i16;
    }

    public static lqeggnwhkg cdpycssgdh(int i13, int i14, int i15, int i16) {
        gm.iobyxmoadg.f37831pkzmftpjix.ojitshcjhn(i13);
        gm.iobyxmoadg.f37821iozdgvuglv.ojitshcjhn(i14);
        gm.iobyxmoadg.f37813cdpycssgdh.ojitshcjhn(i15);
        gm.iobyxmoadg.f37815cqumvgiudr.ojitshcjhn(i16);
        return zdlpuopuiu(i13, i14, i15, i16);
    }

    static lqeggnwhkg cllcsxoeiz(DataInput dataInput) throws IOException {
        int i13;
        int i14;
        int i15 = dataInput.readByte();
        int i16 = 0;
        if (i15 < 0) {
            i15 = ~i15;
            i13 = 0;
            i14 = 0;
        } else {
            byte b13 = dataInput.readByte();
            if (b13 < 0) {
                int i17 = ~b13;
                i14 = 0;
                i16 = i17;
                i13 = 0;
            } else {
                byte b14 = dataInput.readByte();
                if (b14 < 0) {
                    i13 = ~b14;
                } else {
                    i16 = dataInput.readInt();
                    i13 = b14;
                }
                i14 = i16;
                i16 = b13;
            }
        }
        return cdpycssgdh(i15, i16, i13, i14);
    }

    private int cqumvgiudr(gm.nufgyqmvbu nufgyqmvbuVar) {
        switch (zoijcleaow.f20117iobyxmoadg[((gm.iobyxmoadg) nufgyqmvbuVar).ordinal()]) {
            case 1:
                return this.f20113iwizpuwonk;
            case 2:
                throw new DateTimeException("Field too large for an int: " + nufgyqmvbuVar);
            case 3:
                return this.f20113iwizpuwonk / 1000;
            case 4:
                throw new DateTimeException("Field too large for an int: " + nufgyqmvbuVar);
            case 5:
                return this.f20113iwizpuwonk / 1000000;
            case 6:
                return (int) (dsvhmnatus() / 1000000);
            case 7:
                return this.f20114jyumaefscl;
            case 8:
                return wypolnanlu();
            case 9:
                return this.f20115yggfygwlhe;
            case 10:
                return (this.f20116zdlpuopuiu * 60) + this.f20115yggfygwlhe;
            case 11:
                return this.f20116zdlpuopuiu % 12;
            case 12:
                int i13 = this.f20116zdlpuopuiu % 12;
                if (i13 % 12 == 0) {
                    return 12;
                }
                return i13;
            case 13:
                return this.f20116zdlpuopuiu;
            case 14:
                byte b13 = this.f20116zdlpuopuiu;
                if (b13 == 0) {
                    return 24;
                }
                return b13;
            case 15:
                return this.f20116zdlpuopuiu / 12;
            default:
                throw new UnsupportedTemporalTypeException("Unsupported field: " + nufgyqmvbuVar);
        }
    }

    public static lqeggnwhkg jyumaefscl(gm.eablkybsjg eablkybsjgVar) {
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) eablkybsjgVar.btonecajqb(gm.dxjokdxxww.ppxfxbqfkf());
        if (lqeggnwhkgVar != null) {
            return lqeggnwhkgVar;
        }
        throw new DateTimeException("Unable to obtain LocalTime from TemporalAccessor: " + eablkybsjgVar + ", type " + eablkybsjgVar.getClass().getName());
    }

    public static lqeggnwhkg lmojexxdyd(long j13) {
        gm.iobyxmoadg.f37841yadqdtsiqt.ojitshcjhn(j13);
        int i13 = (int) (j13 / 3600);
        long j14 = j13 - ((long) (i13 * 3600));
        int i14 = (int) (j14 / 60);
        return zdlpuopuiu(i13, i14, (int) (j14 - ((long) (i14 * 60))), 0);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new wflxmlrfwp((byte) 5, this);
    }

    static lqeggnwhkg wwaezpbzkn(long j13, int i13) {
        gm.iobyxmoadg.f37841yadqdtsiqt.ojitshcjhn(j13);
        gm.iobyxmoadg.f37815cqumvgiudr.ojitshcjhn(i13);
        int i14 = (int) (j13 / 3600);
        long j14 = j13 - ((long) (i14 * 3600));
        int i15 = (int) (j14 / 60);
        return zdlpuopuiu(i14, i15, (int) (j14 - ((long) (i15 * 60))), i13);
    }

    public static lqeggnwhkg yadqdtsiqt(long j13) {
        gm.iobyxmoadg.f37818esjtqupxsv.ojitshcjhn(j13);
        int i13 = (int) (j13 / 3600000000000L);
        long j14 = j13 - (((long) i13) * 3600000000000L);
        int i14 = (int) (j14 / 60000000000L);
        long j15 = j14 - (((long) i14) * 60000000000L);
        int i15 = (int) (j15 / 1000000000);
        return zdlpuopuiu(i13, i14, i15, (int) (j15 - (((long) i15) * 1000000000)));
    }

    private static lqeggnwhkg zdlpuopuiu(int i13, int i14, int i15, int i16) {
        return ((i14 | i15) | i16) == 0 ? f20109istkbnxepw[i13] : new lqeggnwhkg(i13, i14, i15, i16);
    }

    @Override // gm.eablkybsjg
    public long agtfadlqog(gm.nufgyqmvbu nufgyqmvbuVar) {
        if (!(nufgyqmvbuVar instanceof gm.iobyxmoadg)) {
            return nufgyqmvbuVar.wkgbmnqykc(this);
        }
        if (nufgyqmvbuVar == gm.iobyxmoadg.f37818esjtqupxsv) {
            return dsvhmnatus();
        }
        return nufgyqmvbuVar == gm.iobyxmoadg.f37832pmvmpeiblj ? dsvhmnatus() / 1000 : cqumvgiudr(nufgyqmvbuVar);
    }

    @Override // fm.zoijcleaow, gm.eablkybsjg
    public Object btonecajqb(gm.btonecajqb btonecajqbVar) {
        if (btonecajqbVar == gm.dxjokdxxww.eablkybsjg()) {
            return gm.zoijcleaow.NANOS;
        }
        if (btonecajqbVar == gm.dxjokdxxww.ppxfxbqfkf()) {
            return this;
        }
        if (btonecajqbVar == gm.dxjokdxxww.iobyxmoadg() || btonecajqbVar == gm.dxjokdxxww.lqeggnwhkg() || btonecajqbVar == gm.dxjokdxxww.gxszxtbevo() || btonecajqbVar == gm.dxjokdxxww.wkgbmnqykc() || btonecajqbVar == gm.dxjokdxxww.zoijcleaow()) {
            return null;
        }
        return btonecajqbVar.iobyxmoadg(this);
    }

    public long dsvhmnatus() {
        return (((long) this.f20116zdlpuopuiu) * 3600000000000L) + (((long) this.f20115yggfygwlhe) * 60000000000L) + (((long) this.f20114jyumaefscl) * 1000000000) + ((long) this.f20113iwizpuwonk);
    }

    @Override // gm.gxszxtbevo
    public gm.wkgbmnqykc dxjokdxxww(gm.wkgbmnqykc wkgbmnqykcVar) {
        return wkgbmnqykcVar.rgvfuqvkyq(gm.iobyxmoadg.f37818esjtqupxsv, dsvhmnatus());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
        return this.f20116zdlpuopuiu == lqeggnwhkgVar.f20116zdlpuopuiu && this.f20115yggfygwlhe == lqeggnwhkgVar.f20115yggfygwlhe && this.f20114jyumaefscl == lqeggnwhkgVar.f20114jyumaefscl && this.f20113iwizpuwonk == lqeggnwhkgVar.f20113iwizpuwonk;
    }

    public int hashCode() {
        long jDsvhmnatus = dsvhmnatus();
        return (int) (jDsvhmnatus ^ (jDsvhmnatus >>> 32));
    }

    public lqeggnwhkg hcddaimhww(long j13) {
        if (j13 == 0) {
            return this;
        }
        int i13 = (this.f20116zdlpuopuiu * 60) + this.f20115yggfygwlhe;
        int i14 = ((((int) (j13 % 1440)) + i13) + 1440) % 1440;
        return i13 == i14 ? this : zdlpuopuiu(i14 / 60, i14 % 60, this.f20114jyumaefscl, this.f20113iwizpuwonk);
    }

    public lqeggnwhkg hkdspvbjdz(long j13) {
        if (j13 == 0) {
            return this;
        }
        int i13 = (this.f20116zdlpuopuiu * 3600) + (this.f20115yggfygwlhe * 60) + this.f20114jyumaefscl;
        int i14 = ((((int) (j13 % 86400)) + i13) + 86400) % 86400;
        return i13 == i14 ? this : zdlpuopuiu(i14 / 3600, (i14 / 60) % 60, i14 % 60, this.f20113iwizpuwonk);
    }

    @Override // gm.eablkybsjg
    public boolean iobyxmoadg(gm.nufgyqmvbu nufgyqmvbuVar) {
        if (nufgyqmvbuVar instanceof gm.iobyxmoadg) {
            return nufgyqmvbuVar.draadjrbmk();
        }
        return nufgyqmvbuVar != null && nufgyqmvbuVar.nufgyqmvbu(this);
    }

    @Override // gm.wkgbmnqykc
    /* JADX INFO: renamed from: istkbnxepw, reason: merged with bridge method [inline-methods] */
    public lqeggnwhkg zdlpuopuiu(long j13, gm.gtknphoqwx gtknphoqwxVar) {
        return j13 == Long.MIN_VALUE ? wkgbmnqykc(Long.MAX_VALUE, gtknphoqwxVar).wkgbmnqykc(1L, gtknphoqwxVar) : wkgbmnqykc(-j13, gtknphoqwxVar);
    }

    public lqeggnwhkg jpowsppfya(long j13) {
        if (j13 == 0) {
            return this;
        }
        long jDsvhmnatus = dsvhmnatus();
        long j14 = (((j13 % 86400000000000L) + jDsvhmnatus) + 86400000000000L) % 86400000000000L;
        return jDsvhmnatus == j14 ? this : zdlpuopuiu((int) (j14 / 3600000000000L), (int) ((j14 / 60000000000L) % 60), (int) ((j14 / 1000000000) % 60), (int) (j14 % 1000000000));
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: kcexrzcfyt, reason: merged with bridge method [inline-methods] */
    public int compareTo(lqeggnwhkg lqeggnwhkgVar) {
        int iIobyxmoadg = fm.ppxfxbqfkf.iobyxmoadg(this.f20116zdlpuopuiu, lqeggnwhkgVar.f20116zdlpuopuiu);
        if (iIobyxmoadg != 0) {
            return iIobyxmoadg;
        }
        int iIobyxmoadg2 = fm.ppxfxbqfkf.iobyxmoadg(this.f20115yggfygwlhe, lqeggnwhkgVar.f20115yggfygwlhe);
        if (iIobyxmoadg2 != 0) {
            return iIobyxmoadg2;
        }
        int iIobyxmoadg3 = fm.ppxfxbqfkf.iobyxmoadg(this.f20114jyumaefscl, lqeggnwhkgVar.f20114jyumaefscl);
        return iIobyxmoadg3 == 0 ? fm.ppxfxbqfkf.iobyxmoadg(this.f20113iwizpuwonk, lqeggnwhkgVar.f20113iwizpuwonk) : iIobyxmoadg3;
    }

    @Override // gm.wkgbmnqykc
    /* JADX INFO: renamed from: kegysxyocb, reason: merged with bridge method [inline-methods] */
    public lqeggnwhkg rgvfuqvkyq(gm.nufgyqmvbu nufgyqmvbuVar, long j13) {
        if (!(nufgyqmvbuVar instanceof gm.iobyxmoadg)) {
            return (lqeggnwhkg) nufgyqmvbuVar.btonecajqb(this, j13);
        }
        gm.iobyxmoadg iobyxmoadgVar = (gm.iobyxmoadg) nufgyqmvbuVar;
        iobyxmoadgVar.ojitshcjhn(j13);
        switch (zoijcleaow.f20117iobyxmoadg[iobyxmoadgVar.ordinal()]) {
            case 1:
                return ntlheqmsrt((int) j13);
            case 2:
                return yadqdtsiqt(j13);
            case 3:
                return ntlheqmsrt(((int) j13) * 1000);
            case 4:
                return yadqdtsiqt(j13 * 1000);
            case 5:
                return ntlheqmsrt(((int) j13) * 1000000);
            case 6:
                return yadqdtsiqt(j13 * 1000000);
            case 7:
                return ulzqkzuiru((int) j13);
            case 8:
                return hkdspvbjdz(j13 - ((long) wypolnanlu()));
            case 9:
                return mbcevpiqjq((int) j13);
            case 10:
                return hcddaimhww(j13 - ((long) ((this.f20116zdlpuopuiu * 60) + this.f20115yggfygwlhe)));
            case 11:
                return pkzmftpjix(j13 - ((long) (this.f20116zdlpuopuiu % 12)));
            case 12:
                if (j13 == 12) {
                    j13 = 0;
                }
                return pkzmftpjix(j13 - ((long) (this.f20116zdlpuopuiu % 12)));
            case 13:
                return tzroggbefp((int) j13);
            case 14:
                if (j13 == 24) {
                    j13 = 0;
                }
                return tzroggbefp((int) j13);
            case 15:
                return pkzmftpjix((j13 - ((long) (this.f20116zdlpuopuiu / 12))) * 12);
            default:
                throw new UnsupportedTemporalTypeException("Unsupported field: " + nufgyqmvbuVar);
        }
    }

    public int lereixgezr() {
        return this.f20116zdlpuopuiu;
    }

    @Override // fm.zoijcleaow, gm.eablkybsjg
    public gm.draadjrbmk lqeggnwhkg(gm.nufgyqmvbu nufgyqmvbuVar) {
        return super.lqeggnwhkg(nufgyqmvbuVar);
    }

    public lqeggnwhkg mbcevpiqjq(int i13) {
        if (this.f20115yggfygwlhe == i13) {
            return this;
        }
        gm.iobyxmoadg.f37821iozdgvuglv.ojitshcjhn(i13);
        return zdlpuopuiu(this.f20116zdlpuopuiu, i13, this.f20114jyumaefscl, this.f20113iwizpuwonk);
    }

    public lqeggnwhkg ntlheqmsrt(int i13) {
        if (this.f20113iwizpuwonk == i13) {
            return this;
        }
        gm.iobyxmoadg.f37815cqumvgiudr.ojitshcjhn(i13);
        return zdlpuopuiu(this.f20116zdlpuopuiu, this.f20115yggfygwlhe, this.f20114jyumaefscl, i13);
    }

    @Override // fm.zoijcleaow, gm.eablkybsjg
    public int ojitshcjhn(gm.nufgyqmvbu nufgyqmvbuVar) {
        return nufgyqmvbuVar instanceof gm.iobyxmoadg ? cqumvgiudr(nufgyqmvbuVar) : super.ojitshcjhn(nufgyqmvbuVar);
    }

    public lqeggnwhkg pkzmftpjix(long j13) {
        return j13 == 0 ? this : zdlpuopuiu(((((int) (j13 % 24)) + this.f20116zdlpuopuiu) + 24) % 24, this.f20115yggfygwlhe, this.f20114jyumaefscl, this.f20113iwizpuwonk);
    }

    public int pmvmpeiblj() {
        return this.f20113iwizpuwonk;
    }

    void sopmlzcsov(DataOutput dataOutput) {
        if (this.f20113iwizpuwonk != 0) {
            dataOutput.writeByte(this.f20116zdlpuopuiu);
            dataOutput.writeByte(this.f20115yggfygwlhe);
            dataOutput.writeByte(this.f20114jyumaefscl);
            dataOutput.writeInt(this.f20113iwizpuwonk);
            return;
        }
        if (this.f20114jyumaefscl != 0) {
            dataOutput.writeByte(this.f20116zdlpuopuiu);
            dataOutput.writeByte(this.f20115yggfygwlhe);
            dataOutput.writeByte(~this.f20114jyumaefscl);
        } else if (this.f20115yggfygwlhe == 0) {
            dataOutput.writeByte(~this.f20116zdlpuopuiu);
        } else {
            dataOutput.writeByte(this.f20116zdlpuopuiu);
            dataOutput.writeByte(~this.f20115yggfygwlhe);
        }
    }

    @Override // gm.wkgbmnqykc
    /* JADX INFO: renamed from: stevsuqkhv, reason: merged with bridge method [inline-methods] */
    public lqeggnwhkg draadjrbmk(gm.gxszxtbevo gxszxtbevoVar) {
        return gxszxtbevoVar instanceof lqeggnwhkg ? (lqeggnwhkg) gxszxtbevoVar : (lqeggnwhkg) gxszxtbevoVar.dxjokdxxww(this);
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder(18);
        byte b13 = this.f20116zdlpuopuiu;
        byte b14 = this.f20115yggfygwlhe;
        byte b15 = this.f20114jyumaefscl;
        int i13 = this.f20113iwizpuwonk;
        sb3.append(b13 < 10 ? CommonUrlParts.Values.FALSE_INTEGER : "");
        sb3.append((int) b13);
        String str = StringUtils.PROCESS_POSTFIX_DELIMITER;
        sb3.append(b14 < 10 ? ":0" : StringUtils.PROCESS_POSTFIX_DELIMITER);
        sb3.append((int) b14);
        if (b15 > 0 || i13 > 0) {
            if (b15 < 10) {
                str = ":0";
            }
            sb3.append(str);
            sb3.append((int) b15);
            if (i13 > 0) {
                sb3.append('.');
                if (i13 % 1000000 == 0) {
                    sb3.append(Integer.toString((i13 / 1000000) + 1000).substring(1));
                } else if (i13 % 1000 == 0) {
                    sb3.append(Integer.toString((i13 / 1000) + 1000000).substring(1));
                } else {
                    sb3.append(Integer.toString(i13 + 1000000000).substring(1));
                }
            }
        }
        return sb3.toString();
    }

    public lqeggnwhkg tzroggbefp(int i13) {
        if (this.f20116zdlpuopuiu == i13) {
            return this;
        }
        gm.iobyxmoadg.f37831pkzmftpjix.ojitshcjhn(i13);
        return zdlpuopuiu(i13, this.f20115yggfygwlhe, this.f20114jyumaefscl, this.f20113iwizpuwonk);
    }

    public lqeggnwhkg ulzqkzuiru(int i13) {
        if (this.f20114jyumaefscl == i13) {
            return this;
        }
        gm.iobyxmoadg.f37813cdpycssgdh.ojitshcjhn(i13);
        return zdlpuopuiu(this.f20116zdlpuopuiu, this.f20115yggfygwlhe, i13, this.f20113iwizpuwonk);
    }

    public gtknphoqwx vdvldrhtss(vdvldrhtss vdvldrhtssVar) {
        return gtknphoqwx.cqumvgiudr(this, vdvldrhtssVar);
    }

    public int wypolnanlu() {
        return (this.f20116zdlpuopuiu * 3600) + (this.f20115yggfygwlhe * 60) + this.f20114jyumaefscl;
    }

    @Override // gm.wkgbmnqykc
    /* JADX INFO: renamed from: ylkuphrtab, reason: merged with bridge method [inline-methods] */
    public lqeggnwhkg wkgbmnqykc(long j13, gm.gtknphoqwx gtknphoqwxVar) {
        if (!(gtknphoqwxVar instanceof gm.zoijcleaow)) {
            return (lqeggnwhkg) gtknphoqwxVar.wkgbmnqykc(this, j13);
        }
        switch (zoijcleaow.f20118zoijcleaow[((gm.zoijcleaow) gtknphoqwxVar).ordinal()]) {
            case 1:
                return jpowsppfya(j13);
            case 2:
                return jpowsppfya((j13 % 86400000000L) * 1000);
            case 3:
                return jpowsppfya((j13 % 86400000) * 1000000);
            case 4:
                return hkdspvbjdz(j13);
            case 5:
                return hcddaimhww(j13);
            case 6:
                return pkzmftpjix(j13);
            case 7:
                return pkzmftpjix((j13 % 2) * 12);
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + gtknphoqwxVar);
        }
    }

    public int zynmafqrjb() {
        return this.f20114jyumaefscl;
    }
}
