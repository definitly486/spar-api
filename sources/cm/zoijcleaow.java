package cm;

import org.threeten.bp.DateTimeException;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;

/* JADX INFO: loaded from: classes3.dex */
public enum zoijcleaow implements gm.eablkybsjg, gm.gxszxtbevo {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;


    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    public static final gm.btonecajqb f20175pmvmpeiblj = new gm.btonecajqb() { // from class: cm.zoijcleaow.iobyxmoadg
        @Override // gm.btonecajqb
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public zoijcleaow iobyxmoadg(gm.eablkybsjg eablkybsjgVar) {
            return zoijcleaow.vdvldrhtss(eablkybsjgVar);
        }
    };

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private static final zoijcleaow[] f20178zynmafqrjb = values();

    public static zoijcleaow vdvldrhtss(gm.eablkybsjg eablkybsjgVar) {
        if (eablkybsjgVar instanceof zoijcleaow) {
            return (zoijcleaow) eablkybsjgVar;
        }
        try {
            return zdlpuopuiu(eablkybsjgVar.ojitshcjhn(gm.iobyxmoadg.f37820hkdspvbjdz));
        } catch (DateTimeException e13) {
            throw new DateTimeException("Unable to obtain DayOfWeek from TemporalAccessor: " + eablkybsjgVar + ", type " + eablkybsjgVar.getClass().getName(), e13);
        }
    }

    public static zoijcleaow zdlpuopuiu(int i13) {
        if (i13 >= 1 && i13 <= 7) {
            return f20178zynmafqrjb[i13 - 1];
        }
        throw new DateTimeException("Invalid value for DayOfWeek: " + i13);
    }

    @Override // gm.eablkybsjg
    public long agtfadlqog(gm.nufgyqmvbu nufgyqmvbuVar) {
        if (nufgyqmvbuVar == gm.iobyxmoadg.f37820hkdspvbjdz) {
            return kcexrzcfyt();
        }
        if (!(nufgyqmvbuVar instanceof gm.iobyxmoadg)) {
            return nufgyqmvbuVar.wkgbmnqykc(this);
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: " + nufgyqmvbuVar);
    }

    @Override // gm.eablkybsjg
    public Object btonecajqb(gm.btonecajqb btonecajqbVar) {
        if (btonecajqbVar == gm.dxjokdxxww.eablkybsjg()) {
            return gm.zoijcleaow.DAYS;
        }
        if (btonecajqbVar == gm.dxjokdxxww.zoijcleaow() || btonecajqbVar == gm.dxjokdxxww.ppxfxbqfkf() || btonecajqbVar == gm.dxjokdxxww.iobyxmoadg() || btonecajqbVar == gm.dxjokdxxww.gxszxtbevo() || btonecajqbVar == gm.dxjokdxxww.lqeggnwhkg() || btonecajqbVar == gm.dxjokdxxww.wkgbmnqykc()) {
            return null;
        }
        return btonecajqbVar.iobyxmoadg(this);
    }

    @Override // gm.gxszxtbevo
    public gm.wkgbmnqykc dxjokdxxww(gm.wkgbmnqykc wkgbmnqykcVar) {
        return wkgbmnqykcVar.rgvfuqvkyq(gm.iobyxmoadg.f37820hkdspvbjdz, kcexrzcfyt());
    }

    @Override // gm.eablkybsjg
    public boolean iobyxmoadg(gm.nufgyqmvbu nufgyqmvbuVar) {
        if (nufgyqmvbuVar instanceof gm.iobyxmoadg) {
            return nufgyqmvbuVar == gm.iobyxmoadg.f37820hkdspvbjdz;
        }
        return nufgyqmvbuVar != null && nufgyqmvbuVar.nufgyqmvbu(this);
    }

    public zoijcleaow jyumaefscl(long j13) {
        return f20178zynmafqrjb[(ordinal() + (((int) (j13 % 7)) + 7)) % 7];
    }

    public int kcexrzcfyt() {
        return ordinal() + 1;
    }

    @Override // gm.eablkybsjg
    public gm.draadjrbmk lqeggnwhkg(gm.nufgyqmvbu nufgyqmvbuVar) {
        if (nufgyqmvbuVar == gm.iobyxmoadg.f37820hkdspvbjdz) {
            return nufgyqmvbuVar.dxjokdxxww();
        }
        if (!(nufgyqmvbuVar instanceof gm.iobyxmoadg)) {
            return nufgyqmvbuVar.lqeggnwhkg(this);
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: " + nufgyqmvbuVar);
    }

    @Override // gm.eablkybsjg
    public int ojitshcjhn(gm.nufgyqmvbu nufgyqmvbuVar) {
        return nufgyqmvbuVar == gm.iobyxmoadg.f37820hkdspvbjdz ? kcexrzcfyt() : lqeggnwhkg(nufgyqmvbuVar).iobyxmoadg(agtfadlqog(nufgyqmvbuVar), nufgyqmvbuVar);
    }
}
