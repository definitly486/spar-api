package cm;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;

/* JADX INFO: loaded from: classes3.dex */
public final class agtfadlqog extends fm.zoijcleaow implements gm.wkgbmnqykc, gm.gxszxtbevo, Comparable, Serializable {
    private static final long serialVersionUID = -23038383694477807L;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final int f20062zdlpuopuiu;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public static final gm.btonecajqb f20061yggfygwlhe = new iobyxmoadg();

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private static final em.iobyxmoadg f20060jyumaefscl = new em.zoijcleaow().rgvfuqvkyq(gm.iobyxmoadg.f37816crxdokpmqz, 4, 10, em.lqeggnwhkg.EXCEEDS_PAD).cdpycssgdh();

    class iobyxmoadg implements gm.btonecajqb {
        iobyxmoadg() {
        }

        @Override // gm.btonecajqb
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public agtfadlqog iobyxmoadg(gm.eablkybsjg eablkybsjgVar) {
            return agtfadlqog.kcexrzcfyt(eablkybsjgVar);
        }
    }

    static /* synthetic */ class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f20063iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        static final /* synthetic */ int[] f20064zoijcleaow;

        static {
            int[] iArr = new int[gm.zoijcleaow.values().length];
            f20064zoijcleaow = iArr;
            try {
                iArr[gm.zoijcleaow.YEARS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20064zoijcleaow[gm.zoijcleaow.DECADES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20064zoijcleaow[gm.zoijcleaow.CENTURIES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20064zoijcleaow[gm.zoijcleaow.MILLENNIA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20064zoijcleaow[gm.zoijcleaow.ERAS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[gm.iobyxmoadg.values().length];
            f20063iobyxmoadg = iArr2;
            try {
                iArr2[gm.iobyxmoadg.f37834sopmlzcsov.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20063iobyxmoadg[gm.iobyxmoadg.f37816crxdokpmqz.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f20063iobyxmoadg[gm.iobyxmoadg.f37824jlmebxxoox.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private agtfadlqog(int i13) {
        this.f20062zdlpuopuiu = i13;
    }

    public static agtfadlqog cqumvgiudr(int i13) {
        gm.iobyxmoadg.f37816crxdokpmqz.ojitshcjhn(i13);
        return new agtfadlqog(i13);
    }

    public static agtfadlqog kcexrzcfyt(gm.eablkybsjg eablkybsjgVar) {
        if (eablkybsjgVar instanceof agtfadlqog) {
            return (agtfadlqog) eablkybsjgVar;
        }
        try {
            if (!dm.gxszxtbevo.f29133cqumvgiudr.equals(dm.eablkybsjg.lqeggnwhkg(eablkybsjgVar))) {
                eablkybsjgVar = eablkybsjg.zynmafqrjb(eablkybsjgVar);
            }
            return cqumvgiudr(eablkybsjgVar.ojitshcjhn(gm.iobyxmoadg.f37816crxdokpmqz));
        } catch (DateTimeException unused) {
            throw new DateTimeException("Unable to obtain Year from TemporalAccessor: " + eablkybsjgVar + ", type " + eablkybsjgVar.getClass().getName());
        }
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new wflxmlrfwp((byte) 67, this);
    }

    public static boolean zdlpuopuiu(long j13) {
        return (3 & j13) == 0 && (j13 % 100 != 0 || j13 % 400 == 0);
    }

    static agtfadlqog zynmafqrjb(DataInput dataInput) {
        return cqumvgiudr(dataInput.readInt());
    }

    @Override // gm.eablkybsjg
    public long agtfadlqog(gm.nufgyqmvbu nufgyqmvbuVar) {
        if (!(nufgyqmvbuVar instanceof gm.iobyxmoadg)) {
            return nufgyqmvbuVar.wkgbmnqykc(this);
        }
        int i13 = zoijcleaow.f20063iobyxmoadg[((gm.iobyxmoadg) nufgyqmvbuVar).ordinal()];
        if (i13 == 1) {
            int i14 = this.f20062zdlpuopuiu;
            if (i14 < 1) {
                i14 = 1 - i14;
            }
            return i14;
        }
        if (i13 == 2) {
            return this.f20062zdlpuopuiu;
        }
        if (i13 == 3) {
            return this.f20062zdlpuopuiu < 1 ? 0 : 1;
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: " + nufgyqmvbuVar);
    }

    @Override // fm.zoijcleaow, gm.eablkybsjg
    public Object btonecajqb(gm.btonecajqb btonecajqbVar) {
        if (btonecajqbVar == gm.dxjokdxxww.iobyxmoadg()) {
            return dm.gxszxtbevo.f29133cqumvgiudr;
        }
        if (btonecajqbVar == gm.dxjokdxxww.eablkybsjg()) {
            return gm.zoijcleaow.YEARS;
        }
        if (btonecajqbVar == gm.dxjokdxxww.zoijcleaow() || btonecajqbVar == gm.dxjokdxxww.ppxfxbqfkf() || btonecajqbVar == gm.dxjokdxxww.gxszxtbevo() || btonecajqbVar == gm.dxjokdxxww.lqeggnwhkg() || btonecajqbVar == gm.dxjokdxxww.wkgbmnqykc()) {
            return null;
        }
        return super.btonecajqb(btonecajqbVar);
    }

    @Override // gm.wkgbmnqykc
    /* JADX INFO: renamed from: cdpycssgdh, reason: merged with bridge method [inline-methods] */
    public agtfadlqog rgvfuqvkyq(gm.nufgyqmvbu nufgyqmvbuVar, long j13) {
        if (!(nufgyqmvbuVar instanceof gm.iobyxmoadg)) {
            return (agtfadlqog) nufgyqmvbuVar.btonecajqb(this, j13);
        }
        gm.iobyxmoadg iobyxmoadgVar = (gm.iobyxmoadg) nufgyqmvbuVar;
        iobyxmoadgVar.ojitshcjhn(j13);
        int i13 = zoijcleaow.f20063iobyxmoadg[iobyxmoadgVar.ordinal()];
        if (i13 == 1) {
            if (this.f20062zdlpuopuiu < 1) {
                j13 = 1 - j13;
            }
            return cqumvgiudr((int) j13);
        }
        if (i13 == 2) {
            return cqumvgiudr((int) j13);
        }
        if (i13 == 3) {
            return agtfadlqog(gm.iobyxmoadg.f37824jlmebxxoox) == j13 ? this : cqumvgiudr(1 - this.f20062zdlpuopuiu);
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: " + nufgyqmvbuVar);
    }

    @Override // gm.gxszxtbevo
    public gm.wkgbmnqykc dxjokdxxww(gm.wkgbmnqykc wkgbmnqykcVar) {
        if (dm.eablkybsjg.lqeggnwhkg(wkgbmnqykcVar).equals(dm.gxszxtbevo.f29133cqumvgiudr)) {
            return wkgbmnqykcVar.rgvfuqvkyq(gm.iobyxmoadg.f37816crxdokpmqz, this.f20062zdlpuopuiu);
        }
        throw new DateTimeException("Adjustment only supported on ISO date-time");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof agtfadlqog) && this.f20062zdlpuopuiu == ((agtfadlqog) obj).f20062zdlpuopuiu;
    }

    public int hashCode() {
        return this.f20062zdlpuopuiu;
    }

    @Override // gm.eablkybsjg
    public boolean iobyxmoadg(gm.nufgyqmvbu nufgyqmvbuVar) {
        if (nufgyqmvbuVar instanceof gm.iobyxmoadg) {
            return nufgyqmvbuVar == gm.iobyxmoadg.f37816crxdokpmqz || nufgyqmvbuVar == gm.iobyxmoadg.f37834sopmlzcsov || nufgyqmvbuVar == gm.iobyxmoadg.f37824jlmebxxoox;
        }
        return nufgyqmvbuVar != null && nufgyqmvbuVar.nufgyqmvbu(this);
    }

    @Override // gm.wkgbmnqykc
    /* JADX INFO: renamed from: istkbnxepw, reason: merged with bridge method [inline-methods] */
    public agtfadlqog draadjrbmk(gm.gxszxtbevo gxszxtbevoVar) {
        return (agtfadlqog) gxszxtbevoVar.dxjokdxxww(this);
    }

    @Override // gm.wkgbmnqykc
    /* JADX INFO: renamed from: jyumaefscl, reason: merged with bridge method [inline-methods] */
    public agtfadlqog zdlpuopuiu(long j13, gm.gtknphoqwx gtknphoqwxVar) {
        return j13 == Long.MIN_VALUE ? wkgbmnqykc(Long.MAX_VALUE, gtknphoqwxVar).wkgbmnqykc(1L, gtknphoqwxVar) : wkgbmnqykc(-j13, gtknphoqwxVar);
    }

    @Override // gm.wkgbmnqykc
    /* JADX INFO: renamed from: lereixgezr, reason: merged with bridge method [inline-methods] */
    public agtfadlqog wkgbmnqykc(long j13, gm.gtknphoqwx gtknphoqwxVar) {
        if (!(gtknphoqwxVar instanceof gm.zoijcleaow)) {
            return (agtfadlqog) gtknphoqwxVar.wkgbmnqykc(this, j13);
        }
        int i13 = zoijcleaow.f20064zoijcleaow[((gm.zoijcleaow) gtknphoqwxVar).ordinal()];
        if (i13 == 1) {
            return pmvmpeiblj(j13);
        }
        if (i13 == 2) {
            return pmvmpeiblj(fm.ppxfxbqfkf.gtknphoqwx(j13, 10));
        }
        if (i13 == 3) {
            return pmvmpeiblj(fm.ppxfxbqfkf.gtknphoqwx(j13, 100));
        }
        if (i13 == 4) {
            return pmvmpeiblj(fm.ppxfxbqfkf.gtknphoqwx(j13, 1000));
        }
        if (i13 == 5) {
            gm.iobyxmoadg iobyxmoadgVar = gm.iobyxmoadg.f37824jlmebxxoox;
            return rgvfuqvkyq(iobyxmoadgVar, fm.ppxfxbqfkf.btonecajqb(agtfadlqog(iobyxmoadgVar), j13));
        }
        throw new UnsupportedTemporalTypeException("Unsupported unit: " + gtknphoqwxVar);
    }

    @Override // fm.zoijcleaow, gm.eablkybsjg
    public gm.draadjrbmk lqeggnwhkg(gm.nufgyqmvbu nufgyqmvbuVar) {
        if (nufgyqmvbuVar == gm.iobyxmoadg.f37834sopmlzcsov) {
            return gm.draadjrbmk.ojitshcjhn(1L, this.f20062zdlpuopuiu <= 0 ? 1000000000L : 999999999L);
        }
        return super.lqeggnwhkg(nufgyqmvbuVar);
    }

    @Override // fm.zoijcleaow, gm.eablkybsjg
    public int ojitshcjhn(gm.nufgyqmvbu nufgyqmvbuVar) {
        return lqeggnwhkg(nufgyqmvbuVar).iobyxmoadg(agtfadlqog(nufgyqmvbuVar), nufgyqmvbuVar);
    }

    public agtfadlqog pmvmpeiblj(long j13) {
        return j13 == 0 ? this : cqumvgiudr(gm.iobyxmoadg.f37816crxdokpmqz.agtfadlqog(((long) this.f20062zdlpuopuiu) + j13));
    }

    public String toString() {
        return Integer.toString(this.f20062zdlpuopuiu);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: vdvldrhtss, reason: merged with bridge method [inline-methods] */
    public int compareTo(agtfadlqog agtfadlqogVar) {
        return this.f20062zdlpuopuiu - agtfadlqogVar.f20062zdlpuopuiu;
    }

    void yadqdtsiqt(DataOutput dataOutput) {
        dataOutput.writeInt(this.f20062zdlpuopuiu);
    }
}
