package cm;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;

/* JADX INFO: loaded from: classes3.dex */
public final class dxjokdxxww extends fm.zoijcleaow implements gm.eablkybsjg, gm.gxszxtbevo, Comparable, Serializable {
    private static final long serialVersionUID = -939150713474957432L;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final int f20079yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final int f20080zdlpuopuiu;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public static final gm.btonecajqb f20078jyumaefscl = new iobyxmoadg();

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private static final em.iobyxmoadg f20077iwizpuwonk = new em.zoijcleaow().gxszxtbevo("--").ojitshcjhn(gm.iobyxmoadg.f37830ntlheqmsrt, 2).eablkybsjg('-').ojitshcjhn(gm.iobyxmoadg.f37840wypolnanlu, 2).cdpycssgdh();

    class iobyxmoadg implements gm.btonecajqb {
        iobyxmoadg() {
        }

        @Override // gm.btonecajqb
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public dxjokdxxww iobyxmoadg(gm.eablkybsjg eablkybsjgVar) {
            return dxjokdxxww.kcexrzcfyt(eablkybsjgVar);
        }
    }

    static /* synthetic */ class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f20081iobyxmoadg;

        static {
            int[] iArr = new int[gm.iobyxmoadg.values().length];
            f20081iobyxmoadg = iArr;
            try {
                iArr[gm.iobyxmoadg.f37840wypolnanlu.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20081iobyxmoadg[gm.iobyxmoadg.f37830ntlheqmsrt.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private dxjokdxxww(int i13, int i14) {
        this.f20080zdlpuopuiu = i13;
        this.f20079yggfygwlhe = i14;
    }

    public static dxjokdxxww cqumvgiudr(nufgyqmvbu nufgyqmvbuVar, int i13) {
        fm.ppxfxbqfkf.dxjokdxxww(nufgyqmvbuVar, "month");
        gm.iobyxmoadg.f37840wypolnanlu.ojitshcjhn(i13);
        if (i13 <= nufgyqmvbuVar.cqumvgiudr()) {
            return new dxjokdxxww(nufgyqmvbuVar.zdlpuopuiu(), i13);
        }
        throw new DateTimeException("Illegal value for DayOfMonth field, value " + i13 + " is not valid for month " + nufgyqmvbuVar.name());
    }

    public static dxjokdxxww jyumaefscl(int i13, int i14) {
        return cqumvgiudr(nufgyqmvbu.pmvmpeiblj(i13), i14);
    }

    public static dxjokdxxww kcexrzcfyt(gm.eablkybsjg eablkybsjgVar) {
        if (eablkybsjgVar instanceof dxjokdxxww) {
            return (dxjokdxxww) eablkybsjgVar;
        }
        try {
            if (!dm.gxszxtbevo.f29133cqumvgiudr.equals(dm.eablkybsjg.lqeggnwhkg(eablkybsjgVar))) {
                eablkybsjgVar = eablkybsjg.zynmafqrjb(eablkybsjgVar);
            }
            return jyumaefscl(eablkybsjgVar.ojitshcjhn(gm.iobyxmoadg.f37830ntlheqmsrt), eablkybsjgVar.ojitshcjhn(gm.iobyxmoadg.f37840wypolnanlu));
        } catch (DateTimeException unused) {
            throw new DateTimeException("Unable to obtain MonthDay from TemporalAccessor: " + eablkybsjgVar + ", type " + eablkybsjgVar.getClass().getName());
        }
    }

    static dxjokdxxww lereixgezr(DataInput dataInput) {
        return jyumaefscl(dataInput.readByte(), dataInput.readByte());
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new wflxmlrfwp((byte) 64, this);
    }

    @Override // gm.eablkybsjg
    public long agtfadlqog(gm.nufgyqmvbu nufgyqmvbuVar) {
        int i13;
        if (!(nufgyqmvbuVar instanceof gm.iobyxmoadg)) {
            return nufgyqmvbuVar.wkgbmnqykc(this);
        }
        int i14 = zoijcleaow.f20081iobyxmoadg[((gm.iobyxmoadg) nufgyqmvbuVar).ordinal()];
        if (i14 == 1) {
            i13 = this.f20079yggfygwlhe;
        } else {
            if (i14 != 2) {
                throw new UnsupportedTemporalTypeException("Unsupported field: " + nufgyqmvbuVar);
            }
            i13 = this.f20080zdlpuopuiu;
        }
        return i13;
    }

    @Override // fm.zoijcleaow, gm.eablkybsjg
    public Object btonecajqb(gm.btonecajqb btonecajqbVar) {
        return btonecajqbVar == gm.dxjokdxxww.iobyxmoadg() ? dm.gxszxtbevo.f29133cqumvgiudr : super.btonecajqb(btonecajqbVar);
    }

    @Override // gm.gxszxtbevo
    public gm.wkgbmnqykc dxjokdxxww(gm.wkgbmnqykc wkgbmnqykcVar) {
        if (!dm.eablkybsjg.lqeggnwhkg(wkgbmnqykcVar).equals(dm.gxszxtbevo.f29133cqumvgiudr)) {
            throw new DateTimeException("Adjustment only supported on ISO date-time");
        }
        gm.wkgbmnqykc wkgbmnqykcVarRgvfuqvkyq = wkgbmnqykcVar.rgvfuqvkyq(gm.iobyxmoadg.f37830ntlheqmsrt, this.f20080zdlpuopuiu);
        gm.iobyxmoadg iobyxmoadgVar = gm.iobyxmoadg.f37840wypolnanlu;
        return wkgbmnqykcVarRgvfuqvkyq.rgvfuqvkyq(iobyxmoadgVar, Math.min(wkgbmnqykcVarRgvfuqvkyq.lqeggnwhkg(iobyxmoadgVar).lqeggnwhkg(), this.f20079yggfygwlhe));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxjokdxxww)) {
            return false;
        }
        dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) obj;
        return this.f20080zdlpuopuiu == dxjokdxxwwVar.f20080zdlpuopuiu && this.f20079yggfygwlhe == dxjokdxxwwVar.f20079yggfygwlhe;
    }

    public int hashCode() {
        return (this.f20080zdlpuopuiu << 6) + this.f20079yggfygwlhe;
    }

    @Override // gm.eablkybsjg
    public boolean iobyxmoadg(gm.nufgyqmvbu nufgyqmvbuVar) {
        if (nufgyqmvbuVar instanceof gm.iobyxmoadg) {
            return nufgyqmvbuVar == gm.iobyxmoadg.f37830ntlheqmsrt || nufgyqmvbuVar == gm.iobyxmoadg.f37840wypolnanlu;
        }
        return nufgyqmvbuVar != null && nufgyqmvbuVar.nufgyqmvbu(this);
    }

    @Override // fm.zoijcleaow, gm.eablkybsjg
    public gm.draadjrbmk lqeggnwhkg(gm.nufgyqmvbu nufgyqmvbuVar) {
        if (nufgyqmvbuVar == gm.iobyxmoadg.f37830ntlheqmsrt) {
            return nufgyqmvbuVar.dxjokdxxww();
        }
        return nufgyqmvbuVar == gm.iobyxmoadg.f37840wypolnanlu ? gm.draadjrbmk.rgvfuqvkyq(1L, zdlpuopuiu().lereixgezr(), zdlpuopuiu().cqumvgiudr()) : super.lqeggnwhkg(nufgyqmvbuVar);
    }

    @Override // fm.zoijcleaow, gm.eablkybsjg
    public int ojitshcjhn(gm.nufgyqmvbu nufgyqmvbuVar) {
        return lqeggnwhkg(nufgyqmvbuVar).iobyxmoadg(agtfadlqog(nufgyqmvbuVar), nufgyqmvbuVar);
    }

    void pmvmpeiblj(DataOutput dataOutput) {
        dataOutput.writeByte(this.f20080zdlpuopuiu);
        dataOutput.writeByte(this.f20079yggfygwlhe);
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder(10);
        sb3.append("--");
        sb3.append(this.f20080zdlpuopuiu < 10 ? CommonUrlParts.Values.FALSE_INTEGER : "");
        sb3.append(this.f20080zdlpuopuiu);
        sb3.append(this.f20079yggfygwlhe < 10 ? "-0" : "-");
        sb3.append(this.f20079yggfygwlhe);
        return sb3.toString();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: vdvldrhtss, reason: merged with bridge method [inline-methods] */
    public int compareTo(dxjokdxxww dxjokdxxwwVar) {
        int i13 = this.f20080zdlpuopuiu - dxjokdxxwwVar.f20080zdlpuopuiu;
        return i13 == 0 ? this.f20079yggfygwlhe - dxjokdxxwwVar.f20079yggfygwlhe : i13;
    }

    public nufgyqmvbu zdlpuopuiu() {
        return nufgyqmvbu.pmvmpeiblj(this.f20080zdlpuopuiu);
    }
}
