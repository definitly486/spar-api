package com.facebook.shimmer;

import android.content.res.TypedArray;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes2.dex */
public class iobyxmoadg {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    long f21785yggfygwlhe;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    final float[] f21774iobyxmoadg = new float[4];

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    final int[] f21787zoijcleaow = new int[4];

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    final RectF f21780ppxfxbqfkf = new RectF();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    int f21784wkgbmnqykc = 0;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    int f21771eablkybsjg = -1;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    int f21773gxszxtbevo = 1291845631;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    int f21776lqeggnwhkg = 0;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    int f21777nufgyqmvbu = 0;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    int f21770dxjokdxxww = 0;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    float f21768btonecajqb = 1.0f;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    float f21772gtknphoqwx = 1.0f;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    float f21769draadjrbmk = 0.0f;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    float f21783wflxmlrfwp = 0.5f;

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    float f21767agtfadlqog = 20.0f;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    boolean f21778ojitshcjhn = true;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    boolean f21781rgvfuqvkyq = true;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    boolean f21782vdvldrhtss = true;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    int f21779oxmwwwfdhm = -1;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    int f21775kcexrzcfyt = 1;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    long f21786zdlpuopuiu = 1000;

    /* JADX INFO: renamed from: com.facebook.shimmer.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static class C0393iobyxmoadg extends zoijcleaow {
        public C0393iobyxmoadg() {
            this.f21788iobyxmoadg.f21782vdvldrhtss = true;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.shimmer.iobyxmoadg.zoijcleaow
        /* JADX INFO: renamed from: jyumaefscl, reason: merged with bridge method [inline-methods] */
        public C0393iobyxmoadg wkgbmnqykc() {
            return this;
        }
    }

    public static class ppxfxbqfkf extends zoijcleaow {
        public ppxfxbqfkf() {
            this.f21788iobyxmoadg.f21782vdvldrhtss = false;
        }

        public ppxfxbqfkf cqumvgiudr(int i13) {
            iobyxmoadg iobyxmoadgVar = this.f21788iobyxmoadg;
            iobyxmoadgVar.f21773gxszxtbevo = (i13 & 16777215) | (iobyxmoadgVar.f21773gxszxtbevo & (-16777216));
            return wkgbmnqykc();
        }

        public ppxfxbqfkf esjtqupxsv(int i13) {
            this.f21788iobyxmoadg.f21771eablkybsjg = i13;
            return wkgbmnqykc();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.shimmer.iobyxmoadg.zoijcleaow
        /* JADX INFO: renamed from: iwizpuwonk, reason: merged with bridge method [inline-methods] */
        public ppxfxbqfkf wkgbmnqykc() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.facebook.shimmer.iobyxmoadg.zoijcleaow
        /* JADX INFO: renamed from: jyumaefscl, reason: merged with bridge method [inline-methods] */
        public ppxfxbqfkf ppxfxbqfkf(TypedArray typedArray) {
            super.ppxfxbqfkf(typedArray);
            if (typedArray.hasValue(j9.iobyxmoadg.ShimmerFrameLayout_shimmer_base_color)) {
                cqumvgiudr(typedArray.getColor(j9.iobyxmoadg.ShimmerFrameLayout_shimmer_base_color, this.f21788iobyxmoadg.f21773gxszxtbevo));
            }
            if (typedArray.hasValue(j9.iobyxmoadg.ShimmerFrameLayout_shimmer_highlight_color)) {
                esjtqupxsv(typedArray.getColor(j9.iobyxmoadg.ShimmerFrameLayout_shimmer_highlight_color, this.f21788iobyxmoadg.f21771eablkybsjg));
            }
            return wkgbmnqykc();
        }
    }

    public static abstract class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final iobyxmoadg f21788iobyxmoadg = new iobyxmoadg();

        private static float zoijcleaow(float f13, float f14, float f15) {
            return Math.min(f14, Math.max(f13, f15));
        }

        public zoijcleaow agtfadlqog(float f13) {
            int iZoijcleaow = (int) (zoijcleaow(0.0f, 1.0f, f13) * 255.0f);
            iobyxmoadg iobyxmoadgVar = this.f21788iobyxmoadg;
            iobyxmoadgVar.f21771eablkybsjg = (iZoijcleaow << 24) | (iobyxmoadgVar.f21771eablkybsjg & 16777215);
            return wkgbmnqykc();
        }

        public zoijcleaow btonecajqb(long j13) {
            if (j13 >= 0) {
                this.f21788iobyxmoadg.f21786zdlpuopuiu = j13;
                return wkgbmnqykc();
            }
            throw new IllegalArgumentException("Given a negative duration: " + j13);
        }

        public zoijcleaow draadjrbmk(int i13) {
            if (i13 >= 0) {
                this.f21788iobyxmoadg.f21777nufgyqmvbu = i13;
                return wkgbmnqykc();
            }
            throw new IllegalArgumentException("Given invalid width: " + i13);
        }

        public zoijcleaow dxjokdxxww(float f13) {
            if (f13 >= 0.0f) {
                this.f21788iobyxmoadg.f21783wflxmlrfwp = f13;
                return wkgbmnqykc();
            }
            throw new IllegalArgumentException("Given invalid dropoff value: " + f13);
        }

        public zoijcleaow eablkybsjg(boolean z13) {
            this.f21788iobyxmoadg.f21781rgvfuqvkyq = z13;
            return wkgbmnqykc();
        }

        public zoijcleaow gtknphoqwx(int i13) {
            if (i13 >= 0) {
                this.f21788iobyxmoadg.f21770dxjokdxxww = i13;
                return wkgbmnqykc();
            }
            throw new IllegalArgumentException("Given invalid height: " + i13);
        }

        public zoijcleaow gxszxtbevo(float f13) {
            int iZoijcleaow = (int) (zoijcleaow(0.0f, 1.0f, f13) * 255.0f);
            iobyxmoadg iobyxmoadgVar = this.f21788iobyxmoadg;
            iobyxmoadgVar.f21773gxszxtbevo = (iZoijcleaow << 24) | (iobyxmoadgVar.f21773gxszxtbevo & 16777215);
            return wkgbmnqykc();
        }

        public iobyxmoadg iobyxmoadg() {
            this.f21788iobyxmoadg.zoijcleaow();
            this.f21788iobyxmoadg.ppxfxbqfkf();
            return this.f21788iobyxmoadg;
        }

        public zoijcleaow kcexrzcfyt(int i13) {
            this.f21788iobyxmoadg.f21776lqeggnwhkg = i13;
            return wkgbmnqykc();
        }

        public zoijcleaow lqeggnwhkg(boolean z13) {
            this.f21788iobyxmoadg.f21778ojitshcjhn = z13;
            return wkgbmnqykc();
        }

        public zoijcleaow nufgyqmvbu(int i13) {
            this.f21788iobyxmoadg.f21784wkgbmnqykc = i13;
            return wkgbmnqykc();
        }

        public zoijcleaow ojitshcjhn(float f13) {
            if (f13 >= 0.0f) {
                this.f21788iobyxmoadg.f21769draadjrbmk = f13;
                return wkgbmnqykc();
            }
            throw new IllegalArgumentException("Given invalid intensity value: " + f13);
        }

        public zoijcleaow oxmwwwfdhm(int i13) {
            this.f21788iobyxmoadg.f21775kcexrzcfyt = i13;
            return wkgbmnqykc();
        }

        zoijcleaow ppxfxbqfkf(TypedArray typedArray) {
            if (typedArray.hasValue(j9.iobyxmoadg.ShimmerFrameLayout_shimmer_clip_to_children)) {
                lqeggnwhkg(typedArray.getBoolean(j9.iobyxmoadg.ShimmerFrameLayout_shimmer_clip_to_children, this.f21788iobyxmoadg.f21778ojitshcjhn));
            }
            if (typedArray.hasValue(j9.iobyxmoadg.ShimmerFrameLayout_shimmer_auto_start)) {
                eablkybsjg(typedArray.getBoolean(j9.iobyxmoadg.ShimmerFrameLayout_shimmer_auto_start, this.f21788iobyxmoadg.f21781rgvfuqvkyq));
            }
            if (typedArray.hasValue(j9.iobyxmoadg.ShimmerFrameLayout_shimmer_base_alpha)) {
                gxszxtbevo(typedArray.getFloat(j9.iobyxmoadg.ShimmerFrameLayout_shimmer_base_alpha, 0.3f));
            }
            if (typedArray.hasValue(j9.iobyxmoadg.ShimmerFrameLayout_shimmer_highlight_alpha)) {
                agtfadlqog(typedArray.getFloat(j9.iobyxmoadg.ShimmerFrameLayout_shimmer_highlight_alpha, 1.0f));
            }
            if (typedArray.hasValue(j9.iobyxmoadg.ShimmerFrameLayout_shimmer_duration)) {
                btonecajqb(typedArray.getInt(j9.iobyxmoadg.ShimmerFrameLayout_shimmer_duration, (int) this.f21788iobyxmoadg.f21786zdlpuopuiu));
            }
            if (typedArray.hasValue(j9.iobyxmoadg.ShimmerFrameLayout_shimmer_repeat_count)) {
                rgvfuqvkyq(typedArray.getInt(j9.iobyxmoadg.ShimmerFrameLayout_shimmer_repeat_count, this.f21788iobyxmoadg.f21779oxmwwwfdhm));
            }
            if (typedArray.hasValue(j9.iobyxmoadg.ShimmerFrameLayout_shimmer_repeat_delay)) {
                vdvldrhtss(typedArray.getInt(j9.iobyxmoadg.ShimmerFrameLayout_shimmer_repeat_delay, (int) this.f21788iobyxmoadg.f21785yggfygwlhe));
            }
            if (typedArray.hasValue(j9.iobyxmoadg.ShimmerFrameLayout_shimmer_repeat_mode)) {
                oxmwwwfdhm(typedArray.getInt(j9.iobyxmoadg.ShimmerFrameLayout_shimmer_repeat_mode, this.f21788iobyxmoadg.f21775kcexrzcfyt));
            }
            if (typedArray.hasValue(j9.iobyxmoadg.ShimmerFrameLayout_shimmer_direction)) {
                int i13 = typedArray.getInt(j9.iobyxmoadg.ShimmerFrameLayout_shimmer_direction, this.f21788iobyxmoadg.f21784wkgbmnqykc);
                if (i13 == 1) {
                    nufgyqmvbu(1);
                } else if (i13 == 2) {
                    nufgyqmvbu(2);
                } else if (i13 != 3) {
                    nufgyqmvbu(0);
                } else {
                    nufgyqmvbu(3);
                }
            }
            if (typedArray.hasValue(j9.iobyxmoadg.ShimmerFrameLayout_shimmer_shape)) {
                if (typedArray.getInt(j9.iobyxmoadg.ShimmerFrameLayout_shimmer_shape, this.f21788iobyxmoadg.f21776lqeggnwhkg) != 1) {
                    kcexrzcfyt(0);
                } else {
                    kcexrzcfyt(1);
                }
            }
            if (typedArray.hasValue(j9.iobyxmoadg.ShimmerFrameLayout_shimmer_dropoff)) {
                dxjokdxxww(typedArray.getFloat(j9.iobyxmoadg.ShimmerFrameLayout_shimmer_dropoff, this.f21788iobyxmoadg.f21783wflxmlrfwp));
            }
            if (typedArray.hasValue(j9.iobyxmoadg.ShimmerFrameLayout_shimmer_fixed_width)) {
                draadjrbmk(typedArray.getDimensionPixelSize(j9.iobyxmoadg.ShimmerFrameLayout_shimmer_fixed_width, this.f21788iobyxmoadg.f21777nufgyqmvbu));
            }
            if (typedArray.hasValue(j9.iobyxmoadg.ShimmerFrameLayout_shimmer_fixed_height)) {
                gtknphoqwx(typedArray.getDimensionPixelSize(j9.iobyxmoadg.ShimmerFrameLayout_shimmer_fixed_height, this.f21788iobyxmoadg.f21770dxjokdxxww));
            }
            if (typedArray.hasValue(j9.iobyxmoadg.ShimmerFrameLayout_shimmer_intensity)) {
                ojitshcjhn(typedArray.getFloat(j9.iobyxmoadg.ShimmerFrameLayout_shimmer_intensity, this.f21788iobyxmoadg.f21769draadjrbmk));
            }
            if (typedArray.hasValue(j9.iobyxmoadg.ShimmerFrameLayout_shimmer_width_ratio)) {
                yggfygwlhe(typedArray.getFloat(j9.iobyxmoadg.ShimmerFrameLayout_shimmer_width_ratio, this.f21788iobyxmoadg.f21768btonecajqb));
            }
            if (typedArray.hasValue(j9.iobyxmoadg.ShimmerFrameLayout_shimmer_height_ratio)) {
                wflxmlrfwp(typedArray.getFloat(j9.iobyxmoadg.ShimmerFrameLayout_shimmer_height_ratio, this.f21788iobyxmoadg.f21772gtknphoqwx));
            }
            if (typedArray.hasValue(j9.iobyxmoadg.ShimmerFrameLayout_shimmer_tilt)) {
                zdlpuopuiu(typedArray.getFloat(j9.iobyxmoadg.ShimmerFrameLayout_shimmer_tilt, this.f21788iobyxmoadg.f21767agtfadlqog));
            }
            return wkgbmnqykc();
        }

        public zoijcleaow rgvfuqvkyq(int i13) {
            this.f21788iobyxmoadg.f21779oxmwwwfdhm = i13;
            return wkgbmnqykc();
        }

        public zoijcleaow vdvldrhtss(long j13) {
            if (j13 >= 0) {
                this.f21788iobyxmoadg.f21785yggfygwlhe = j13;
                return wkgbmnqykc();
            }
            throw new IllegalArgumentException("Given a negative repeat delay: " + j13);
        }

        public zoijcleaow wflxmlrfwp(float f13) {
            if (f13 >= 0.0f) {
                this.f21788iobyxmoadg.f21772gtknphoqwx = f13;
                return wkgbmnqykc();
            }
            throw new IllegalArgumentException("Given invalid height ratio: " + f13);
        }

        protected abstract zoijcleaow wkgbmnqykc();

        public zoijcleaow yggfygwlhe(float f13) {
            if (f13 >= 0.0f) {
                this.f21788iobyxmoadg.f21768btonecajqb = f13;
                return wkgbmnqykc();
            }
            throw new IllegalArgumentException("Given invalid width ratio: " + f13);
        }

        public zoijcleaow zdlpuopuiu(float f13) {
            this.f21788iobyxmoadg.f21767agtfadlqog = f13;
            return wkgbmnqykc();
        }
    }

    iobyxmoadg() {
    }

    int iobyxmoadg(int i13) {
        int i14 = this.f21770dxjokdxxww;
        return i14 > 0 ? i14 : Math.round(this.f21772gtknphoqwx * i13);
    }

    void ppxfxbqfkf() {
        if (this.f21776lqeggnwhkg != 1) {
            this.f21774iobyxmoadg[0] = Math.max(((1.0f - this.f21769draadjrbmk) - this.f21783wflxmlrfwp) / 2.0f, 0.0f);
            this.f21774iobyxmoadg[1] = Math.max(((1.0f - this.f21769draadjrbmk) - 0.001f) / 2.0f, 0.0f);
            this.f21774iobyxmoadg[2] = Math.min(((this.f21769draadjrbmk + 1.0f) + 0.001f) / 2.0f, 1.0f);
            this.f21774iobyxmoadg[3] = Math.min(((this.f21769draadjrbmk + 1.0f) + this.f21783wflxmlrfwp) / 2.0f, 1.0f);
            return;
        }
        float[] fArr = this.f21774iobyxmoadg;
        fArr[0] = 0.0f;
        fArr[1] = Math.min(this.f21769draadjrbmk, 1.0f);
        this.f21774iobyxmoadg[2] = Math.min(this.f21769draadjrbmk + this.f21783wflxmlrfwp, 1.0f);
        this.f21774iobyxmoadg[3] = 1.0f;
    }

    int wkgbmnqykc(int i13) {
        int i14 = this.f21777nufgyqmvbu;
        return i14 > 0 ? i14 : Math.round(this.f21768btonecajqb * i13);
    }

    void zoijcleaow() {
        if (this.f21776lqeggnwhkg != 1) {
            int[] iArr = this.f21787zoijcleaow;
            int i13 = this.f21773gxszxtbevo;
            iArr[0] = i13;
            int i14 = this.f21771eablkybsjg;
            iArr[1] = i14;
            iArr[2] = i14;
            iArr[3] = i13;
            return;
        }
        int[] iArr2 = this.f21787zoijcleaow;
        int i15 = this.f21771eablkybsjg;
        iArr2[0] = i15;
        iArr2[1] = i15;
        int i16 = this.f21773gxszxtbevo;
        iArr2[2] = i16;
        iArr2[3] = i16;
    }
}
