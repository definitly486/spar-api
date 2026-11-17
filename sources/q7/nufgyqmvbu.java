package q7;

/* JADX INFO: loaded from: classes2.dex */
public enum nufgyqmvbu {
    NORMAL,
    MULTIPLY,
    SCREEN,
    OVERLAY,
    DARKEN,
    LIGHTEN,
    COLOR_DODGE,
    COLOR_BURN,
    HARD_LIGHT,
    SOFT_LIGHT,
    DIFFERENCE,
    EXCLUSION,
    HUE,
    SATURATION,
    COLOR,
    LUMINOSITY,
    ADD,
    HARD_MIX;

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f78133iobyxmoadg;

        static {
            int[] iArr = new int[nufgyqmvbu.values().length];
            f78133iobyxmoadg = iArr;
            try {
                iArr[nufgyqmvbu.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f78133iobyxmoadg[nufgyqmvbu.SCREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f78133iobyxmoadg[nufgyqmvbu.OVERLAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f78133iobyxmoadg[nufgyqmvbu.DARKEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f78133iobyxmoadg[nufgyqmvbu.LIGHTEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f78133iobyxmoadg[nufgyqmvbu.ADD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f78133iobyxmoadg[nufgyqmvbu.MULTIPLY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f78133iobyxmoadg[nufgyqmvbu.COLOR_DODGE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f78133iobyxmoadg[nufgyqmvbu.COLOR_BURN.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f78133iobyxmoadg[nufgyqmvbu.HARD_LIGHT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f78133iobyxmoadg[nufgyqmvbu.SOFT_LIGHT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f78133iobyxmoadg[nufgyqmvbu.DIFFERENCE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f78133iobyxmoadg[nufgyqmvbu.EXCLUSION.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f78133iobyxmoadg[nufgyqmvbu.HUE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f78133iobyxmoadg[nufgyqmvbu.SATURATION.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f78133iobyxmoadg[nufgyqmvbu.COLOR.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f78133iobyxmoadg[nufgyqmvbu.LUMINOSITY.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f78133iobyxmoadg[nufgyqmvbu.HARD_MIX.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    public j1.iobyxmoadg wkgbmnqykc() {
        int i13 = iobyxmoadg.f78133iobyxmoadg[ordinal()];
        if (i13 == 2) {
            return j1.iobyxmoadg.SCREEN;
        }
        if (i13 == 3) {
            return j1.iobyxmoadg.OVERLAY;
        }
        if (i13 == 4) {
            return j1.iobyxmoadg.DARKEN;
        }
        if (i13 == 5) {
            return j1.iobyxmoadg.LIGHTEN;
        }
        if (i13 != 6) {
            return null;
        }
        return j1.iobyxmoadg.PLUS;
    }
}
