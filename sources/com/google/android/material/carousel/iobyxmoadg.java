package com.google.android.material.carousel;

/* JADX INFO: loaded from: classes2.dex */
final class iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    float f22389eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    float f22390gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    final int f22391iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    final int f22392lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    final float f22393nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    int f22394ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    int f22395wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    float f22396zoijcleaow;

    iobyxmoadg(int i13, float f13, float f14, float f15, int i14, float f16, int i15, float f17, int i16, float f18) {
        this.f22391iobyxmoadg = i13;
        this.f22396zoijcleaow = o1.iobyxmoadg.iobyxmoadg(f13, f14, f15);
        this.f22394ppxfxbqfkf = i14;
        this.f22389eablkybsjg = f16;
        this.f22395wkgbmnqykc = i15;
        this.f22390gxszxtbevo = f17;
        this.f22392lqeggnwhkg = i16;
        wkgbmnqykc(f18, f14, f15, f17);
        this.f22393nufgyqmvbu = zoijcleaow(f17);
    }

    private float gxszxtbevo() {
        return (this.f22390gxszxtbevo * this.f22392lqeggnwhkg) + (this.f22389eablkybsjg * this.f22395wkgbmnqykc) + (this.f22396zoijcleaow * this.f22394ppxfxbqfkf);
    }

    private float iobyxmoadg(float f13, int i13, float f14, int i14, int i15) {
        if (i13 <= 0) {
            f14 = 0.0f;
        }
        float f15 = i14 / 2.0f;
        return (f13 - ((i13 + f15) * f14)) / (i15 + f15);
    }

    private boolean lqeggnwhkg() {
        int i13 = this.f22392lqeggnwhkg;
        if (i13 <= 0 || this.f22394ppxfxbqfkf <= 0 || this.f22395wkgbmnqykc <= 0) {
            return i13 <= 0 || this.f22394ppxfxbqfkf <= 0 || this.f22390gxszxtbevo > this.f22396zoijcleaow;
        }
        float f13 = this.f22390gxszxtbevo;
        float f14 = this.f22389eablkybsjg;
        return f13 > f14 && f14 > this.f22396zoijcleaow;
    }

    static iobyxmoadg ppxfxbqfkf(float f13, float f14, float f15, float f16, int[] iArr, float f17, int[] iArr2, float f18, int[] iArr3) {
        iobyxmoadg iobyxmoadgVar = null;
        int i13 = 1;
        for (int i14 : iArr3) {
            int length = iArr2.length;
            int i15 = 0;
            while (i15 < length) {
                int i16 = iArr2[i15];
                int length2 = iArr.length;
                int i17 = 0;
                while (i17 < length2) {
                    int i18 = i17;
                    int i19 = length2;
                    int i23 = i15;
                    int i24 = length;
                    iobyxmoadg iobyxmoadgVar2 = new iobyxmoadg(i13, f14, f15, f16, iArr[i17], f17, i16, f18, i14, f13);
                    if (iobyxmoadgVar == null || iobyxmoadgVar2.f22393nufgyqmvbu < iobyxmoadgVar.f22393nufgyqmvbu) {
                        if (iobyxmoadgVar2.f22393nufgyqmvbu == 0.0f) {
                            return iobyxmoadgVar2;
                        }
                        iobyxmoadgVar = iobyxmoadgVar2;
                    }
                    i13++;
                    i17 = i18 + 1;
                    length2 = i19;
                    i15 = i23;
                    length = i24;
                }
                i15++;
            }
        }
        return iobyxmoadgVar;
    }

    private void wkgbmnqykc(float f13, float f14, float f15, float f16) {
        float fGxszxtbevo = f13 - gxszxtbevo();
        int i13 = this.f22394ppxfxbqfkf;
        if (i13 > 0 && fGxszxtbevo > 0.0f) {
            float f17 = this.f22396zoijcleaow;
            this.f22396zoijcleaow = f17 + Math.min(fGxszxtbevo / i13, f15 - f17);
        } else if (i13 > 0 && fGxszxtbevo < 0.0f) {
            float f18 = this.f22396zoijcleaow;
            this.f22396zoijcleaow = f18 + Math.max(fGxszxtbevo / i13, f14 - f18);
        }
        int i14 = this.f22394ppxfxbqfkf;
        float f19 = i14 > 0 ? this.f22396zoijcleaow : 0.0f;
        this.f22396zoijcleaow = f19;
        float fIobyxmoadg = iobyxmoadg(f13, i14, f19, this.f22395wkgbmnqykc, this.f22392lqeggnwhkg);
        this.f22390gxszxtbevo = fIobyxmoadg;
        float f23 = (this.f22396zoijcleaow + fIobyxmoadg) / 2.0f;
        this.f22389eablkybsjg = f23;
        int i15 = this.f22395wkgbmnqykc;
        if (i15 <= 0 || fIobyxmoadg == f16) {
            return;
        }
        float f24 = (f16 - fIobyxmoadg) * this.f22392lqeggnwhkg;
        float fMin = Math.min(Math.abs(f24), f23 * 0.1f * i15);
        if (f24 > 0.0f) {
            this.f22389eablkybsjg -= fMin / this.f22395wkgbmnqykc;
            this.f22390gxszxtbevo += fMin / this.f22392lqeggnwhkg;
        } else {
            this.f22389eablkybsjg += fMin / this.f22395wkgbmnqykc;
            this.f22390gxszxtbevo -= fMin / this.f22392lqeggnwhkg;
        }
    }

    private float zoijcleaow(float f13) {
        if (lqeggnwhkg()) {
            return Math.abs(f13 - this.f22390gxszxtbevo) * this.f22391iobyxmoadg;
        }
        return Float.MAX_VALUE;
    }

    int eablkybsjg() {
        return this.f22394ppxfxbqfkf + this.f22395wkgbmnqykc + this.f22392lqeggnwhkg;
    }

    public String toString() {
        return "Arrangement [priority=" + this.f22391iobyxmoadg + ", smallCount=" + this.f22394ppxfxbqfkf + ", smallSize=" + this.f22396zoijcleaow + ", mediumCount=" + this.f22395wkgbmnqykc + ", mediumSize=" + this.f22389eablkybsjg + ", largeCount=" + this.f22392lqeggnwhkg + ", largeSize=" + this.f22390gxszxtbevo + ", cost=" + this.f22393nufgyqmvbu + "]";
    }
}
