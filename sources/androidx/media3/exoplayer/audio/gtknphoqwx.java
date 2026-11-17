package androidx.media3.exoplayer.audio;

import java.math.RoundingMode;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public class gtknphoqwx implements DefaultAudioSink.eablkybsjg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    protected final int f10207eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    protected final int f10208gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final int f10209lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final int f10210nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    protected final int f10211ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    protected final int f10212wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    protected final int f10213zoijcleaow;

    public static class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private int f10216iobyxmoadg = 250000;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private int f10220zoijcleaow = 750000;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private int f10218ppxfxbqfkf = 4;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private int f10219wkgbmnqykc = 250000;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private int f10214eablkybsjg = 50000000;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private int f10215gxszxtbevo = 2;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private int f10217lqeggnwhkg = 4;

        public gtknphoqwx nufgyqmvbu() {
            return new gtknphoqwx(this);
        }
    }

    protected gtknphoqwx(iobyxmoadg iobyxmoadgVar) {
        this.f10213zoijcleaow = iobyxmoadgVar.f10216iobyxmoadg;
        this.f10211ppxfxbqfkf = iobyxmoadgVar.f10220zoijcleaow;
        this.f10212wkgbmnqykc = iobyxmoadgVar.f10218ppxfxbqfkf;
        this.f10207eablkybsjg = iobyxmoadgVar.f10219wkgbmnqykc;
        this.f10208gxszxtbevo = iobyxmoadgVar.f10214eablkybsjg;
        this.f10209lqeggnwhkg = iobyxmoadgVar.f10215gxszxtbevo;
        this.f10210nufgyqmvbu = iobyxmoadgVar.f10217lqeggnwhkg;
    }

    protected static int wkgbmnqykc(int i13) {
        if (i13 == 20) {
            return 63750;
        }
        if (i13 == 30) {
            return 2250000;
        }
        switch (i13) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            default:
                switch (i13) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        throw new IllegalArgumentException();
                }
        }
    }

    protected static int zoijcleaow(int i13, int i14, int i15) {
        return com.google.common.primitives.gxszxtbevo.wkgbmnqykc(((((long) i13) * ((long) i14)) * ((long) i15)) / 1000000);
    }

    protected int eablkybsjg(int i13) {
        return com.google.common.primitives.gxszxtbevo.wkgbmnqykc((((long) this.f10208gxszxtbevo) * ((long) wkgbmnqykc(i13))) / 1000000);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0013  */
    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    protected int gxszxtbevo(int i13, int i14) {
        int i15;
        int iWkgbmnqykc;
        int i16 = this.f10207eablkybsjg;
        if (i13 != 5) {
            if (i13 == 8) {
                i15 = this.f10210nufgyqmvbu;
            }
            if (i14 != -1) {
                iWkgbmnqykc = za.ppxfxbqfkf.zoijcleaow(i14, 8, RoundingMode.CEILING);
            } else {
                iWkgbmnqykc = wkgbmnqykc(i13);
            }
            return com.google.common.primitives.gxszxtbevo.wkgbmnqykc((((long) i16) * ((long) iWkgbmnqykc)) / 1000000);
        }
        i15 = this.f10209lqeggnwhkg;
        i16 *= i15;
        if (i14 != -1) {
            iWkgbmnqykc = za.ppxfxbqfkf.zoijcleaow(i14, 8, RoundingMode.CEILING);
        } else {
            iWkgbmnqykc = wkgbmnqykc(i13);
        }
        return com.google.common.primitives.gxszxtbevo.wkgbmnqykc((((long) i16) * ((long) iWkgbmnqykc)) / 1000000);
    }

    @Override // androidx.media3.exoplayer.audio.DefaultAudioSink.eablkybsjg
    public int iobyxmoadg(int i13, int i14, int i15, int i16, int i17, int i18, double d13) {
        return (((Math.max(i13, (int) (((double) ppxfxbqfkf(i13, i14, i15, i16, i17, i18)) * d13)) + i16) - 1) / i16) * i16;
    }

    protected int lqeggnwhkg(int i13, int i14, int i15) {
        return stevsuqkhv.ojitshcjhn(i13 * this.f10212wkgbmnqykc, zoijcleaow(this.f10213zoijcleaow, i14, i15), zoijcleaow(this.f10211ppxfxbqfkf, i14, i15));
    }

    protected int ppxfxbqfkf(int i13, int i14, int i15, int i16, int i17, int i18) {
        if (i15 == 0) {
            return lqeggnwhkg(i13, i17, i16);
        }
        if (i15 == 1) {
            return eablkybsjg(i14);
        }
        if (i15 == 2) {
            return gxszxtbevo(i14, i18);
        }
        throw new IllegalArgumentException();
    }
}
