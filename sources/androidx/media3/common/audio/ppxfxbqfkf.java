package androidx.media3.common.audio;

import java.nio.ShortBuffer;
import java.util.Arrays;
import kotlin.KotlinVersion;
import modern.payments.ecomAndroid.util.networkErrorHandler.impl.OkHttpErrorHandlerImpl;

/* JADX INFO: loaded from: classes.dex */
final class ppxfxbqfkf {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private short[] f9662agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private short[] f9663btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private short[] f9664draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final short[] f9665dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final float f9666eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private int f9667gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final int f9668gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f9669iobyxmoadg;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private double f9670iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private int f9671jyumaefscl;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private int f9672kcexrzcfyt;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final int f9673lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final int f9674nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private int f9675ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private int f9676oxmwwwfdhm;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final float f9677ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private int f9678rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private int f9679vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private int f9680wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final float f9681wkgbmnqykc;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private int f9682yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private int f9683zdlpuopuiu;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f9684zoijcleaow;

    public ppxfxbqfkf(int i13, int i14, float f13, float f14, int i15) {
        this.f9669iobyxmoadg = i13;
        this.f9684zoijcleaow = i14;
        this.f9677ppxfxbqfkf = f13;
        this.f9681wkgbmnqykc = f14;
        this.f9666eablkybsjg = i13 / i15;
        this.f9668gxszxtbevo = i13 / OkHttpErrorHandlerImpl.HTTP_BAD_REQUEST;
        int i16 = i13 / 65;
        this.f9673lqeggnwhkg = i16;
        int i17 = i16 * 2;
        this.f9674nufgyqmvbu = i17;
        this.f9665dxjokdxxww = new short[i17];
        this.f9663btonecajqb = new short[i17 * i14];
        this.f9664draadjrbmk = new short[i17 * i14];
        this.f9662agtfadlqog = new short[i17 * i14];
    }

    private short agtfadlqog(short[] sArr, int i13, long j13, long j14) {
        short s13 = sArr[i13];
        short s14 = sArr[i13 + this.f9684zoijcleaow];
        long j15 = ((long) this.f9679vdvldrhtss) * j13;
        int i14 = this.f9678rgvfuqvkyq;
        long j16 = ((long) i14) * j14;
        long j17 = ((long) (i14 + 1)) * j14;
        long j18 = j17 - j15;
        long j19 = j17 - j16;
        return (short) (((((long) s13) * j18) + ((j19 - j18) * ((long) s14))) / j19);
    }

    private void eablkybsjg(short[] sArr, int i13, int i14) {
        int i15 = this.f9674nufgyqmvbu / i14;
        int i16 = this.f9684zoijcleaow;
        int i17 = i14 * i16;
        int i18 = i13 * i16;
        for (int i19 = 0; i19 < i15; i19++) {
            int i23 = 0;
            for (int i24 = 0; i24 < i17; i24++) {
                i23 += sArr[(i19 * i17) + i18 + i24];
            }
            this.f9665dxjokdxxww[i19] = (short) (i23 / i17);
        }
    }

    private short[] gxszxtbevo(short[] sArr, int i13, int i14) {
        int length = sArr.length;
        int i15 = this.f9684zoijcleaow;
        int i16 = length / i15;
        return i13 + i14 <= i16 ? sArr : Arrays.copyOf(sArr, (((i16 * 3) / 2) + i14) * i15);
    }

    private void iobyxmoadg(float f13, int i13) {
        int i14;
        int i15;
        if (this.f9680wflxmlrfwp == i13) {
            return;
        }
        int i16 = this.f9669iobyxmoadg;
        long j13 = (long) (i16 / f13);
        long j14 = i16;
        while (j13 != 0 && j14 != 0 && j13 % 2 == 0 && j14 % 2 == 0) {
            j13 /= 2;
            j14 /= 2;
        }
        ojitshcjhn(i13);
        int i17 = 0;
        while (true) {
            int i18 = this.f9675ojitshcjhn;
            if (i17 >= i18 - 1) {
                yggfygwlhe(i18 - 1);
                return;
            }
            while (true) {
                i14 = this.f9678rgvfuqvkyq;
                long j15 = ((long) (i14 + 1)) * j13;
                i15 = this.f9679vdvldrhtss;
                if (j15 <= ((long) i15) * j14) {
                    break;
                }
                this.f9664draadjrbmk = gxszxtbevo(this.f9664draadjrbmk, this.f9680wflxmlrfwp, 1);
                int i19 = 0;
                while (true) {
                    int i23 = this.f9684zoijcleaow;
                    if (i19 < i23) {
                        this.f9664draadjrbmk[(this.f9680wflxmlrfwp * i23) + i19] = agtfadlqog(this.f9662agtfadlqog, (i23 * i17) + i19, j14, j13);
                        i19++;
                    }
                }
                this.f9679vdvldrhtss++;
                this.f9680wflxmlrfwp++;
            }
            int i24 = i14 + 1;
            this.f9678rgvfuqvkyq = i24;
            if (i24 == j14) {
                this.f9678rgvfuqvkyq = 0;
                y2.iobyxmoadg.lqeggnwhkg(((long) i15) == j13);
                this.f9679vdvldrhtss = 0;
            }
            i17++;
        }
    }

    private int iwizpuwonk(short[] sArr, int i13, double d13, int i14) {
        int iRound;
        if (d13 >= 2.0d) {
            double d14 = (((double) i14) / (d13 - 1.0d)) + this.f9670iwizpuwonk;
            iRound = (int) Math.round(d14);
            this.f9670iwizpuwonk = d14 - ((double) iRound);
        } else {
            double d15 = ((((double) i14) * (2.0d - d13)) / (d13 - 1.0d)) + this.f9670iwizpuwonk;
            int iRound2 = (int) Math.round(d15);
            this.f9676oxmwwwfdhm = iRound2;
            this.f9670iwizpuwonk = d15 - ((double) iRound2);
            iRound = i14;
        }
        short[] sArrGxszxtbevo = gxszxtbevo(this.f9664draadjrbmk, this.f9680wflxmlrfwp, iRound);
        this.f9664draadjrbmk = sArrGxszxtbevo;
        rgvfuqvkyq(iRound, this.f9684zoijcleaow, sArrGxszxtbevo, this.f9680wflxmlrfwp, sArr, i13, sArr, i13 + i14);
        this.f9680wflxmlrfwp += iRound;
        return iRound;
    }

    private void jyumaefscl(int i13) {
        int i14 = this.f9667gtknphoqwx - i13;
        short[] sArr = this.f9663btonecajqb;
        int i15 = this.f9684zoijcleaow;
        System.arraycopy(sArr, i13 * i15, sArr, 0, i15 * i14);
        this.f9667gtknphoqwx = i14;
    }

    private int lqeggnwhkg(short[] sArr, int i13) {
        int iNufgyqmvbu;
        int i14 = this.f9669iobyxmoadg;
        int i15 = i14 > 4000 ? i14 / 4000 : 1;
        if (this.f9684zoijcleaow == 1 && i15 == 1) {
            iNufgyqmvbu = nufgyqmvbu(sArr, i13, this.f9668gxszxtbevo, this.f9673lqeggnwhkg);
        } else {
            eablkybsjg(sArr, i13, i15);
            int iNufgyqmvbu2 = nufgyqmvbu(this.f9665dxjokdxxww, 0, this.f9668gxszxtbevo / i15, this.f9673lqeggnwhkg / i15);
            if (i15 != 1) {
                int i16 = iNufgyqmvbu2 * i15;
                int i17 = i15 * 4;
                int i18 = i16 - i17;
                int i19 = i16 + i17;
                int i23 = this.f9668gxszxtbevo;
                if (i18 < i23) {
                    i18 = i23;
                }
                int i24 = this.f9673lqeggnwhkg;
                if (i19 > i24) {
                    i19 = i24;
                }
                if (this.f9684zoijcleaow == 1) {
                    iNufgyqmvbu = nufgyqmvbu(sArr, i13, i18, i19);
                } else {
                    eablkybsjg(sArr, i13, 1);
                    iNufgyqmvbu = nufgyqmvbu(this.f9665dxjokdxxww, 0, i18, i19);
                }
            } else {
                iNufgyqmvbu = iNufgyqmvbu2;
            }
        }
        int i25 = vdvldrhtss(this.f9682yggfygwlhe, this.f9671jyumaefscl) ? this.f9672kcexrzcfyt : iNufgyqmvbu;
        this.f9683zdlpuopuiu = this.f9682yggfygwlhe;
        this.f9672kcexrzcfyt = iNufgyqmvbu;
        return i25;
    }

    private int nufgyqmvbu(short[] sArr, int i13, int i14, int i15) {
        int i16 = i13 * this.f9684zoijcleaow;
        int i17 = KotlinVersion.MAX_COMPONENT_VALUE;
        int i18 = 1;
        int i19 = 0;
        int i23 = 0;
        while (i14 <= i15) {
            int iAbs = 0;
            for (int i24 = 0; i24 < i14; i24++) {
                iAbs += Math.abs(sArr[i16 + i24] - sArr[(i16 + i14) + i24]);
            }
            if (iAbs * i19 < i18 * i14) {
                i19 = i14;
                i18 = iAbs;
            }
            if (iAbs * i17 > i23 * i14) {
                i17 = i14;
                i23 = iAbs;
            }
            i14++;
        }
        this.f9682yggfygwlhe = i18 / i19;
        this.f9671jyumaefscl = i23 / i17;
        return i19;
    }

    private void ojitshcjhn(int i13) {
        int i14 = this.f9680wflxmlrfwp - i13;
        short[] sArrGxszxtbevo = gxszxtbevo(this.f9662agtfadlqog, this.f9675ojitshcjhn, i14);
        this.f9662agtfadlqog = sArrGxszxtbevo;
        short[] sArr = this.f9664draadjrbmk;
        int i15 = this.f9684zoijcleaow;
        System.arraycopy(sArr, i13 * i15, sArrGxszxtbevo, this.f9675ojitshcjhn * i15, i15 * i14);
        this.f9680wflxmlrfwp = i13;
        this.f9675ojitshcjhn += i14;
    }

    private void oxmwwwfdhm() {
        int i13 = this.f9680wflxmlrfwp;
        float f13 = this.f9677ppxfxbqfkf;
        float f14 = this.f9681wkgbmnqykc;
        double d13 = f13 / f14;
        float f15 = this.f9666eablkybsjg * f14;
        if (d13 > 1.0000100135803223d || d13 < 0.9999899864196777d) {
            zoijcleaow(d13);
        } else {
            wkgbmnqykc(this.f9663btonecajqb, 0, this.f9667gtknphoqwx);
            this.f9667gtknphoqwx = 0;
        }
        if (f15 != 1.0f) {
            iobyxmoadg(f15, i13);
        }
    }

    private int ppxfxbqfkf(int i13) {
        int iMin = Math.min(this.f9674nufgyqmvbu, this.f9676oxmwwwfdhm);
        wkgbmnqykc(this.f9663btonecajqb, i13, iMin);
        this.f9676oxmwwwfdhm -= iMin;
        return iMin;
    }

    private static void rgvfuqvkyq(int i13, int i14, short[] sArr, int i15, short[] sArr2, int i16, short[] sArr3, int i17) {
        for (int i18 = 0; i18 < i14; i18++) {
            int i19 = (i15 * i14) + i18;
            int i23 = (i17 * i14) + i18;
            int i24 = (i16 * i14) + i18;
            for (int i25 = 0; i25 < i13; i25++) {
                sArr[i19] = (short) (((sArr2[i24] * (i13 - i25)) + (sArr3[i23] * i25)) / i13);
                i19 += i14;
                i24 += i14;
                i23 += i14;
            }
        }
    }

    private boolean vdvldrhtss(int i13, int i14) {
        return i13 != 0 && this.f9672kcexrzcfyt != 0 && i14 <= i13 * 3 && i13 * 2 > this.f9683zdlpuopuiu * 3;
    }

    private int wflxmlrfwp(short[] sArr, int i13, double d13, int i14) {
        int iRound;
        if (d13 < 0.5d) {
            double d14 = ((((double) i14) * d13) / (1.0d - d13)) + this.f9670iwizpuwonk;
            iRound = (int) Math.round(d14);
            this.f9670iwizpuwonk = d14 - ((double) iRound);
        } else {
            double d15 = ((((double) i14) * ((2.0d * d13) - 1.0d)) / (1.0d - d13)) + this.f9670iwizpuwonk;
            int iRound2 = (int) Math.round(d15);
            this.f9676oxmwwwfdhm = iRound2;
            this.f9670iwizpuwonk = d15 - ((double) iRound2);
            iRound = i14;
        }
        int i15 = i14 + iRound;
        short[] sArrGxszxtbevo = gxszxtbevo(this.f9664draadjrbmk, this.f9680wflxmlrfwp, i15);
        this.f9664draadjrbmk = sArrGxszxtbevo;
        int i16 = this.f9684zoijcleaow;
        System.arraycopy(sArr, i13 * i16, sArrGxszxtbevo, this.f9680wflxmlrfwp * i16, i16 * i14);
        rgvfuqvkyq(iRound, this.f9684zoijcleaow, this.f9664draadjrbmk, this.f9680wflxmlrfwp + i14, sArr, i13 + i14, sArr, i13);
        this.f9680wflxmlrfwp += i15;
        return iRound;
    }

    private void wkgbmnqykc(short[] sArr, int i13, int i14) {
        short[] sArrGxszxtbevo = gxszxtbevo(this.f9664draadjrbmk, this.f9680wflxmlrfwp, i14);
        this.f9664draadjrbmk = sArrGxszxtbevo;
        int i15 = this.f9684zoijcleaow;
        System.arraycopy(sArr, i13 * i15, sArrGxszxtbevo, this.f9680wflxmlrfwp * i15, i15 * i14);
        this.f9680wflxmlrfwp += i14;
    }

    private void yggfygwlhe(int i13) {
        if (i13 == 0) {
            return;
        }
        short[] sArr = this.f9662agtfadlqog;
        int i14 = this.f9684zoijcleaow;
        System.arraycopy(sArr, i13 * i14, sArr, 0, (this.f9675ojitshcjhn - i13) * i14);
        this.f9675ojitshcjhn -= i13;
    }

    private void zoijcleaow(double d13) {
        int iWflxmlrfwp;
        int i13 = this.f9667gtknphoqwx;
        if (i13 < this.f9674nufgyqmvbu) {
            return;
        }
        int iIwizpuwonk = 0;
        do {
            if (this.f9676oxmwwwfdhm > 0) {
                iWflxmlrfwp = ppxfxbqfkf(iIwizpuwonk);
            } else {
                int iLqeggnwhkg = lqeggnwhkg(this.f9663btonecajqb, iIwizpuwonk);
                if (d13 > 1.0d) {
                    iIwizpuwonk += iLqeggnwhkg + iwizpuwonk(this.f9663btonecajqb, iIwizpuwonk, d13, iLqeggnwhkg);
                } else {
                    iWflxmlrfwp = wflxmlrfwp(this.f9663btonecajqb, iIwizpuwonk, d13, iLqeggnwhkg);
                }
            }
            iIwizpuwonk += iWflxmlrfwp;
        } while (this.f9674nufgyqmvbu + iIwizpuwonk <= i13);
        jyumaefscl(iIwizpuwonk);
    }

    public void btonecajqb(ShortBuffer shortBuffer) {
        y2.iobyxmoadg.lqeggnwhkg(this.f9680wflxmlrfwp >= 0);
        int iMin = Math.min(shortBuffer.remaining() / this.f9684zoijcleaow, this.f9680wflxmlrfwp);
        shortBuffer.put(this.f9664draadjrbmk, 0, this.f9684zoijcleaow * iMin);
        int i13 = this.f9680wflxmlrfwp - iMin;
        this.f9680wflxmlrfwp = i13;
        short[] sArr = this.f9664draadjrbmk;
        int i14 = this.f9684zoijcleaow;
        System.arraycopy(sArr, iMin * i14, sArr, 0, i13 * i14);
    }

    public int draadjrbmk() {
        return this.f9667gtknphoqwx * this.f9684zoijcleaow * 2;
    }

    public void dxjokdxxww() {
        this.f9667gtknphoqwx = 0;
        this.f9680wflxmlrfwp = 0;
        this.f9675ojitshcjhn = 0;
        this.f9678rgvfuqvkyq = 0;
        this.f9679vdvldrhtss = 0;
        this.f9676oxmwwwfdhm = 0;
        this.f9672kcexrzcfyt = 0;
        this.f9683zdlpuopuiu = 0;
        this.f9682yggfygwlhe = 0;
        this.f9671jyumaefscl = 0;
        this.f9670iwizpuwonk = 0.0d;
    }

    public int gtknphoqwx() {
        y2.iobyxmoadg.lqeggnwhkg(this.f9680wflxmlrfwp >= 0);
        return this.f9680wflxmlrfwp * this.f9684zoijcleaow * 2;
    }

    public void kcexrzcfyt() {
        int i13;
        int i14 = this.f9667gtknphoqwx;
        float f13 = this.f9677ppxfxbqfkf;
        float f14 = this.f9681wkgbmnqykc;
        double d13 = f13 / f14;
        double d14 = this.f9666eablkybsjg * f14;
        int i15 = this.f9676oxmwwwfdhm;
        int i16 = this.f9680wflxmlrfwp + ((int) ((((((((double) (i14 - i15)) / d13) + ((double) i15)) + this.f9670iwizpuwonk) + ((double) this.f9675ojitshcjhn)) / d14) + 0.5d));
        this.f9670iwizpuwonk = 0.0d;
        this.f9663btonecajqb = gxszxtbevo(this.f9663btonecajqb, i14, (this.f9674nufgyqmvbu * 2) + i14);
        int i17 = 0;
        while (true) {
            i13 = this.f9674nufgyqmvbu;
            int i18 = this.f9684zoijcleaow;
            if (i17 >= i13 * 2 * i18) {
                break;
            }
            this.f9663btonecajqb[(i18 * i14) + i17] = 0;
            i17++;
        }
        this.f9667gtknphoqwx += i13 * 2;
        oxmwwwfdhm();
        if (this.f9680wflxmlrfwp > i16) {
            this.f9680wflxmlrfwp = Math.max(i16, 0);
        }
        this.f9667gtknphoqwx = 0;
        this.f9676oxmwwwfdhm = 0;
        this.f9675ojitshcjhn = 0;
    }

    public void zdlpuopuiu(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        int i13 = this.f9684zoijcleaow;
        int i14 = iRemaining / i13;
        short[] sArrGxszxtbevo = gxszxtbevo(this.f9663btonecajqb, this.f9667gtknphoqwx, i14);
        this.f9663btonecajqb = sArrGxszxtbevo;
        shortBuffer.get(sArrGxszxtbevo, this.f9667gtknphoqwx * this.f9684zoijcleaow, ((i13 * i14) * 2) / 2);
        this.f9667gtknphoqwx += i14;
        oxmwwwfdhm();
    }
}
