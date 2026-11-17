package androidx.transition;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
class lereixgezr {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private long[] f13545iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private float[] f13547zoijcleaow = new float[20];

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private int f13546ppxfxbqfkf = 0;

    lereixgezr() {
        long[] jArr = new long[20];
        this.f13545iobyxmoadg = jArr;
        Arrays.fill(jArr, Long.MIN_VALUE);
    }

    private float ppxfxbqfkf(float f13) {
        return (float) (((double) Math.signum(f13)) * Math.sqrt(Math.abs(f13) * 2.0f));
    }

    public void iobyxmoadg(long j13, float f13) {
        int i13 = (this.f13546ppxfxbqfkf + 1) % 20;
        this.f13546ppxfxbqfkf = i13;
        this.f13545iobyxmoadg[i13] = j13;
        this.f13547zoijcleaow[i13] = f13;
    }

    float zoijcleaow() {
        float fPpxfxbqfkf;
        int i13 = this.f13546ppxfxbqfkf;
        if (i13 == 0 && this.f13545iobyxmoadg[i13] == Long.MIN_VALUE) {
            return 0.0f;
        }
        long j13 = this.f13545iobyxmoadg[i13];
        int i14 = 0;
        long j14 = j13;
        while (true) {
            long j15 = this.f13545iobyxmoadg[i13];
            if (j15 == Long.MIN_VALUE) {
                break;
            }
            float f13 = j13 - j15;
            float fAbs = Math.abs(j15 - j14);
            if (f13 > 100.0f || fAbs > 40.0f) {
                break;
            }
            if (i13 == 0) {
                i13 = 20;
            }
            i13--;
            i14++;
            if (i14 >= 20) {
                break;
            }
            j14 = j15;
        }
        if (i14 < 2) {
            return 0.0f;
        }
        if (i14 == 2) {
            int i15 = this.f13546ppxfxbqfkf;
            int i16 = i15 == 0 ? 19 : i15 - 1;
            long[] jArr = this.f13545iobyxmoadg;
            float f14 = jArr[i15] - jArr[i16];
            if (f14 == 0.0f) {
                return 0.0f;
            }
            float[] fArr = this.f13547zoijcleaow;
            fPpxfxbqfkf = (fArr[i15] - fArr[i16]) / f14;
        } else {
            int i17 = this.f13546ppxfxbqfkf;
            int i18 = ((i17 - i14) + 21) % 20;
            int i19 = (i17 + 21) % 20;
            long j16 = this.f13545iobyxmoadg[i18];
            float f15 = this.f13547zoijcleaow[i18];
            int i23 = i18 + 1;
            float fPpxfxbqfkf2 = 0.0f;
            for (int i24 = i23 % 20; i24 != i19; i24 = (i24 + 1) % 20) {
                long j17 = this.f13545iobyxmoadg[i24];
                float f16 = j17 - j16;
                if (f16 != 0.0f) {
                    float f17 = this.f13547zoijcleaow[i24];
                    float f18 = (f17 - f15) / f16;
                    fPpxfxbqfkf2 += (f18 - ppxfxbqfkf(fPpxfxbqfkf2)) * Math.abs(f18);
                    if (i24 == i23) {
                        fPpxfxbqfkf2 *= 0.5f;
                    }
                    f15 = f17;
                    j16 = j17;
                }
            }
            fPpxfxbqfkf = ppxfxbqfkf(fPpxfxbqfkf2);
        }
        return fPpxfxbqfkf * 1000.0f;
    }
}
