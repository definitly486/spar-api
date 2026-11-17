package v1;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes.dex */
class ribwqtqdhb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final float[] f115184iobyxmoadg = new float[20];

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final long[] f115187zoijcleaow = new long[20];

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private float f115185ppxfxbqfkf = 0.0f;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private int f115186wkgbmnqykc = 0;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private int f115183eablkybsjg = 0;

    ribwqtqdhb() {
    }

    private float eablkybsjg() {
        long[] jArr;
        long j13;
        int i13 = this.f115186wkgbmnqykc;
        if (i13 < 2) {
            return 0.0f;
        }
        int i14 = this.f115183eablkybsjg;
        int i15 = ((i14 + 20) - (i13 - 1)) % 20;
        long j14 = this.f115187zoijcleaow[i14];
        while (true) {
            jArr = this.f115187zoijcleaow;
            j13 = jArr[i15];
            if (j14 - j13 <= 100) {
                break;
            }
            this.f115186wkgbmnqykc--;
            i15 = (i15 + 1) % 20;
        }
        int i16 = this.f115186wkgbmnqykc;
        if (i16 < 2) {
            return 0.0f;
        }
        if (i16 == 2) {
            int i17 = (i15 + 1) % 20;
            long j15 = jArr[i17];
            if (j13 == j15) {
                return 0.0f;
            }
            return this.f115184iobyxmoadg[i17] / (j15 - j13);
        }
        float fAbs = 0.0f;
        int i18 = 0;
        for (int i19 = 0; i19 < this.f115186wkgbmnqykc - 1; i19++) {
            int i23 = i19 + i15;
            long[] jArr2 = this.f115187zoijcleaow;
            long j16 = jArr2[i23 % 20];
            int i24 = (i23 + 1) % 20;
            if (jArr2[i24] != j16) {
                i18++;
                float fGxszxtbevo = gxszxtbevo(fAbs);
                float f13 = this.f115184iobyxmoadg[i24] / (this.f115187zoijcleaow[i24] - j16);
                fAbs += (f13 - fGxszxtbevo) * Math.abs(f13);
                if (i18 == 1) {
                    fAbs *= 0.5f;
                }
            }
        }
        return gxszxtbevo(fAbs);
    }

    private static float gxszxtbevo(float f13) {
        return (f13 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f13) * 2.0f));
    }

    private void zoijcleaow() {
        this.f115186wkgbmnqykc = 0;
        this.f115185ppxfxbqfkf = 0.0f;
    }

    void iobyxmoadg(MotionEvent motionEvent) {
        long eventTime = motionEvent.getEventTime();
        if (this.f115186wkgbmnqykc != 0 && eventTime - this.f115187zoijcleaow[this.f115183eablkybsjg] > 40) {
            zoijcleaow();
        }
        int i13 = (this.f115183eablkybsjg + 1) % 20;
        this.f115183eablkybsjg = i13;
        int i14 = this.f115186wkgbmnqykc;
        if (i14 != 20) {
            this.f115186wkgbmnqykc = i14 + 1;
        }
        this.f115184iobyxmoadg[i13] = motionEvent.getAxisValue(26);
        this.f115187zoijcleaow[this.f115183eablkybsjg] = eventTime;
    }

    void ppxfxbqfkf(int i13, float f13) {
        float fEablkybsjg = eablkybsjg() * i13;
        this.f115185ppxfxbqfkf = fEablkybsjg;
        if (fEablkybsjg < (-Math.abs(f13))) {
            this.f115185ppxfxbqfkf = -Math.abs(f13);
        } else if (this.f115185ppxfxbqfkf > Math.abs(f13)) {
            this.f115185ppxfxbqfkf = Math.abs(f13);
        }
    }

    float wkgbmnqykc(int i13) {
        if (i13 != 26) {
            return 0.0f;
        }
        return this.f115185ppxfxbqfkf;
    }
}
