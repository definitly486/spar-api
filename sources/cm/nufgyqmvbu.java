package cm;

import org.threeten.bp.DateTimeException;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;

/* JADX INFO: loaded from: classes3.dex */
public enum nufgyqmvbu implements gm.eablkybsjg, gm.gxszxtbevo {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;


    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    public static final gm.btonecajqb f20122iozdgvuglv = new gm.btonecajqb() { // from class: cm.nufgyqmvbu.iobyxmoadg
        @Override // gm.btonecajqb
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public nufgyqmvbu iobyxmoadg(gm.eablkybsjg eablkybsjgVar) {
            return nufgyqmvbu.kcexrzcfyt(eablkybsjgVar);
        }
    };

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private static final nufgyqmvbu[] f20127lmojexxdyd = values();

    static /* synthetic */ class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f20134iobyxmoadg;

        static {
            int[] iArr = new int[nufgyqmvbu.values().length];
            f20134iobyxmoadg = iArr;
            try {
                iArr[nufgyqmvbu.FEBRUARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20134iobyxmoadg[nufgyqmvbu.APRIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20134iobyxmoadg[nufgyqmvbu.JUNE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20134iobyxmoadg[nufgyqmvbu.SEPTEMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20134iobyxmoadg[nufgyqmvbu.NOVEMBER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20134iobyxmoadg[nufgyqmvbu.JANUARY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20134iobyxmoadg[nufgyqmvbu.MARCH.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f20134iobyxmoadg[nufgyqmvbu.MAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f20134iobyxmoadg[nufgyqmvbu.JULY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f20134iobyxmoadg[nufgyqmvbu.AUGUST.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f20134iobyxmoadg[nufgyqmvbu.OCTOBER.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f20134iobyxmoadg[nufgyqmvbu.DECEMBER.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public static nufgyqmvbu kcexrzcfyt(gm.eablkybsjg eablkybsjgVar) {
        if (eablkybsjgVar instanceof nufgyqmvbu) {
            return (nufgyqmvbu) eablkybsjgVar;
        }
        try {
            if (!dm.gxszxtbevo.f29133cqumvgiudr.equals(dm.eablkybsjg.lqeggnwhkg(eablkybsjgVar))) {
                eablkybsjgVar = eablkybsjg.zynmafqrjb(eablkybsjgVar);
            }
            return pmvmpeiblj(eablkybsjgVar.ojitshcjhn(gm.iobyxmoadg.f37830ntlheqmsrt));
        } catch (DateTimeException e13) {
            throw new DateTimeException("Unable to obtain Month from TemporalAccessor: " + eablkybsjgVar + ", type " + eablkybsjgVar.getClass().getName(), e13);
        }
    }

    public static nufgyqmvbu pmvmpeiblj(int i13) {
        if (i13 >= 1 && i13 <= 12) {
            return f20127lmojexxdyd[i13 - 1];
        }
        throw new DateTimeException("Invalid value for MonthOfYear: " + i13);
    }

    @Override // gm.eablkybsjg
    public long agtfadlqog(gm.nufgyqmvbu nufgyqmvbuVar) {
        if (nufgyqmvbuVar == gm.iobyxmoadg.f37830ntlheqmsrt) {
            return zdlpuopuiu();
        }
        if (!(nufgyqmvbuVar instanceof gm.iobyxmoadg)) {
            return nufgyqmvbuVar.wkgbmnqykc(this);
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: " + nufgyqmvbuVar);
    }

    @Override // gm.eablkybsjg
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
        return btonecajqbVar.iobyxmoadg(this);
    }

    public int cqumvgiudr() {
        int i13 = zoijcleaow.f20134iobyxmoadg[ordinal()];
        if (i13 != 1) {
            return (i13 == 2 || i13 == 3 || i13 == 4 || i13 == 5) ? 30 : 31;
        }
        return 29;
    }

    @Override // gm.gxszxtbevo
    public gm.wkgbmnqykc dxjokdxxww(gm.wkgbmnqykc wkgbmnqykcVar) {
        if (dm.eablkybsjg.lqeggnwhkg(wkgbmnqykcVar).equals(dm.gxszxtbevo.f29133cqumvgiudr)) {
            return wkgbmnqykcVar.rgvfuqvkyq(gm.iobyxmoadg.f37830ntlheqmsrt, zdlpuopuiu());
        }
        throw new DateTimeException("Adjustment only supported on ISO date-time");
    }

    @Override // gm.eablkybsjg
    public boolean iobyxmoadg(gm.nufgyqmvbu nufgyqmvbuVar) {
        if (nufgyqmvbuVar instanceof gm.iobyxmoadg) {
            return nufgyqmvbuVar == gm.iobyxmoadg.f37830ntlheqmsrt;
        }
        return nufgyqmvbuVar != null && nufgyqmvbuVar.nufgyqmvbu(this);
    }

    public int jyumaefscl(boolean z13) {
        int i13 = zoijcleaow.f20134iobyxmoadg[ordinal()];
        if (i13 != 1) {
            return (i13 == 2 || i13 == 3 || i13 == 4 || i13 == 5) ? 30 : 31;
        }
        return z13 ? 29 : 28;
    }

    public int lereixgezr() {
        int i13 = zoijcleaow.f20134iobyxmoadg[ordinal()];
        if (i13 != 1) {
            return (i13 == 2 || i13 == 3 || i13 == 4 || i13 == 5) ? 30 : 31;
        }
        return 28;
    }

    @Override // gm.eablkybsjg
    public gm.draadjrbmk lqeggnwhkg(gm.nufgyqmvbu nufgyqmvbuVar) {
        if (nufgyqmvbuVar == gm.iobyxmoadg.f37830ntlheqmsrt) {
            return nufgyqmvbuVar.dxjokdxxww();
        }
        if (!(nufgyqmvbuVar instanceof gm.iobyxmoadg)) {
            return nufgyqmvbuVar.lqeggnwhkg(this);
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: " + nufgyqmvbuVar);
    }

    @Override // gm.eablkybsjg
    public int ojitshcjhn(gm.nufgyqmvbu nufgyqmvbuVar) {
        return nufgyqmvbuVar == gm.iobyxmoadg.f37830ntlheqmsrt ? zdlpuopuiu() : lqeggnwhkg(nufgyqmvbuVar).iobyxmoadg(agtfadlqog(nufgyqmvbuVar), nufgyqmvbuVar);
    }

    public int vdvldrhtss(boolean z13) {
        switch (zoijcleaow.f20134iobyxmoadg[ordinal()]) {
            case 1:
                return 32;
            case 2:
                return (z13 ? 1 : 0) + 91;
            case 3:
                return (z13 ? 1 : 0) + 152;
            case 4:
                return (z13 ? 1 : 0) + 244;
            case 5:
                return (z13 ? 1 : 0) + 305;
            case 6:
                return 1;
            case 7:
                return (z13 ? 1 : 0) + 60;
            case 8:
                return (z13 ? 1 : 0) + 121;
            case 9:
                return (z13 ? 1 : 0) + 182;
            case 10:
                return (z13 ? 1 : 0) + 213;
            case 11:
                return (z13 ? 1 : 0) + 274;
            default:
                return (z13 ? 1 : 0) + 335;
        }
    }

    public int zdlpuopuiu() {
        return ordinal() + 1;
    }

    public nufgyqmvbu zynmafqrjb(long j13) {
        return f20127lmojexxdyd[(ordinal() + (((int) (j13 % 12)) + 12)) % 12];
    }
}
