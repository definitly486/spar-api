package h;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class hszhottldk {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final iobyxmoadg f38902zoijcleaow = new iobyxmoadg(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final float[] f38903iobyxmoadg;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    private /* synthetic */ hszhottldk(float[] fArr) {
        this.f38903iobyxmoadg = fArr;
    }

    public static final void agtfadlqog(float[] fArr, float f13, float f14, float f15) {
        if (fArr.length < 16) {
            return;
        }
        float f16 = (fArr[0] * f13) + (fArr[4] * f14) + (fArr[8] * f15) + fArr[12];
        float f17 = (fArr[1] * f13) + (fArr[5] * f14) + (fArr[9] * f15) + fArr[13];
        float f18 = (fArr[2] * f13) + (fArr[6] * f14) + (fArr[10] * f15) + fArr[14];
        float f19 = (fArr[3] * f13) + (fArr[7] * f14) + (fArr[11] * f15) + fArr[15];
        fArr[12] = f16;
        fArr[13] = f17;
        fArr[14] = f18;
        fArr[15] = f19;
    }

    public static final void btonecajqb(float[] fArr, float f13) {
        if (fArr.length < 16) {
            return;
        }
        double d13 = ((double) f13) * 0.017453292519943295d;
        float fSin = (float) Math.sin(d13);
        float fCos = (float) Math.cos(d13);
        float f14 = fArr[0];
        float f15 = fArr[4];
        float f16 = (fCos * f14) + (fSin * f15);
        float f17 = -fSin;
        float f18 = fArr[1];
        float f19 = fArr[5];
        float f23 = (fCos * f18) + (fSin * f19);
        float f24 = fArr[2];
        float f25 = fArr[6];
        float f26 = (fCos * f24) + (fSin * f25);
        float f27 = fArr[3];
        float f28 = fArr[7];
        fArr[0] = f16;
        fArr[1] = f23;
        fArr[2] = f26;
        fArr[3] = (fCos * f27) + (fSin * f28);
        fArr[4] = (f14 * f17) + (f15 * fCos);
        fArr[5] = (f18 * f17) + (f19 * fCos);
        fArr[6] = (f24 * f17) + (f25 * fCos);
        fArr[7] = (f17 * f27) + (fCos * f28);
    }

    public static final void draadjrbmk(float[] fArr, float[] fArr2) {
        if (fArr.length >= 16 && fArr2.length >= 16) {
            float f13 = fArr[0];
            float f14 = fArr2[0];
            float f15 = fArr[1];
            float f16 = fArr2[4];
            float f17 = fArr[2];
            float f18 = fArr2[8];
            float f19 = fArr[3];
            float f23 = fArr2[12];
            float f24 = (f13 * f14) + (f15 * f16) + (f17 * f18) + (f19 * f23);
            float f25 = fArr2[1];
            float f26 = fArr2[5];
            float f27 = fArr2[9];
            float f28 = fArr2[13];
            float f29 = (f13 * f25) + (f15 * f26) + (f17 * f27) + (f19 * f28);
            float f33 = fArr2[2];
            float f34 = fArr2[6];
            float f35 = fArr2[10];
            float f36 = fArr2[14];
            float f37 = (f13 * f33) + (f15 * f34) + (f17 * f35) + (f19 * f36);
            float f38 = fArr2[3];
            float f39 = fArr2[7];
            float f43 = fArr2[11];
            float f44 = fArr2[15];
            float f45 = (f13 * f38) + (f15 * f39) + (f17 * f43) + (f19 * f44);
            float f46 = fArr[4];
            float f47 = fArr[5];
            float f48 = fArr[6];
            float f49 = fArr[7];
            float f53 = (f46 * f14) + (f47 * f16) + (f48 * f18) + (f49 * f23);
            float f54 = (f46 * f25) + (f47 * f26) + (f48 * f27) + (f49 * f28);
            float f55 = (f46 * f33) + (f47 * f34) + (f48 * f35) + (f49 * f36);
            float f56 = (f46 * f38) + (f47 * f39) + (f48 * f43) + (f49 * f44);
            float f57 = fArr[8];
            float f58 = fArr[9];
            float f59 = fArr[10];
            float f63 = fArr[11];
            float f64 = (f57 * f14) + (f58 * f16) + (f59 * f18) + (f63 * f23);
            float f65 = (f57 * f25) + (f58 * f26) + (f59 * f27) + (f63 * f28);
            float f66 = (f57 * f33) + (f58 * f34) + (f59 * f35) + (f63 * f36);
            float f67 = (f57 * f38) + (f58 * f39) + (f59 * f43) + (f63 * f44);
            float f68 = fArr[12];
            float f69 = fArr[13];
            float f73 = (f14 * f68) + (f16 * f69);
            float f74 = fArr[14];
            float f75 = f73 + (f18 * f74);
            float f76 = fArr[15];
            fArr[0] = f24;
            fArr[1] = f29;
            fArr[2] = f37;
            fArr[3] = f45;
            fArr[4] = f53;
            fArr[5] = f54;
            fArr[6] = f55;
            fArr[7] = f56;
            fArr[8] = f64;
            fArr[9] = f65;
            fArr[10] = f66;
            fArr[11] = f67;
            fArr[12] = f75 + (f23 * f76);
            fArr[13] = (f25 * f68) + (f26 * f69) + (f27 * f74) + (f28 * f76);
            fArr[14] = (f33 * f68) + (f34 * f69) + (f35 * f74) + (f36 * f76);
            fArr[15] = (f68 * f38) + (f69 * f39) + (f74 * f43) + (f76 * f44);
        }
    }

    public static final void dxjokdxxww(float[] fArr, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f23, float f24, float f25, float f26) {
        double d13 = ((double) f18) * 0.017453292519943295d;
        float fSin = (float) Math.sin(d13);
        float fCos = (float) Math.cos(d13);
        float f27 = -fSin;
        float f28 = (f16 * fCos) - (f17 * fSin);
        float f29 = (f16 * fSin) + (f17 * fCos);
        double d14 = ((double) f19) * 0.017453292519943295d;
        float fSin2 = (float) Math.sin(d14);
        float fCos2 = (float) Math.cos(d14);
        float f33 = -fSin2;
        float f34 = fSin * fSin2;
        float f35 = fSin * fCos2;
        float f36 = fCos * fSin2;
        float f37 = fCos * fCos2;
        float f38 = (f15 * fCos2) + (f29 * fSin2);
        float f39 = ((-f15) * fSin2) + (f29 * fCos2);
        double d15 = ((double) f23) * 0.017453292519943295d;
        float fSin3 = (float) Math.sin(d15);
        float fCos3 = (float) Math.cos(d15);
        float f43 = -fSin3;
        float f44 = (f43 * fCos2) + (fCos3 * f34);
        float f45 = fSin3 * fCos;
        float f46 = fCos * fCos3;
        float f47 = (f43 * f33) + (fCos3 * f35);
        float f48 = ((fCos2 * fCos3) + (f34 * fSin3)) * f24;
        float f49 = f45 * f24;
        float f53 = ((fCos3 * f33) + (fSin3 * f35)) * f24;
        float f54 = f44 * f25;
        float f55 = f46 * f25;
        float f56 = f47 * f25;
        float f57 = f36 * f26;
        float f58 = f27 * f26;
        float f59 = f37 * f26;
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = f48;
        fArr[1] = f49;
        fArr[2] = f53;
        fArr[3] = 0.0f;
        fArr[4] = f54;
        fArr[5] = f55;
        fArr[6] = f56;
        fArr[7] = 0.0f;
        fArr[8] = f57;
        fArr[9] = f58;
        fArr[10] = f59;
        fArr[11] = 0.0f;
        float f63 = -f13;
        fArr[12] = ((f48 * f63) - (f54 * f14)) + f38 + f13;
        fArr[13] = ((f49 * f63) - (f55 * f14)) + f28 + f14;
        fArr[14] = ((f63 * f53) - (f14 * f56)) + f39;
        fArr[15] = 1.0f;
    }

    public static int eablkybsjg(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    public static final void gtknphoqwx(float[] fArr, float f13, float f14, float f15) {
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = fArr[0] * f13;
        fArr[1] = fArr[1] * f13;
        fArr[2] = fArr[2] * f13;
        fArr[3] = fArr[3] * f13;
        fArr[4] = fArr[4] * f14;
        fArr[5] = fArr[5] * f14;
        fArr[6] = fArr[6] * f14;
        fArr[7] = fArr[7] * f14;
        fArr[8] = fArr[8] * f15;
        fArr[9] = fArr[9] * f15;
        fArr[10] = fArr[10] * f15;
        fArr[11] = fArr[11] * f15;
    }

    public static final long gxszxtbevo(float[] fArr, long j13) {
        if (fArr.length < 16) {
            return j13;
        }
        float f13 = fArr[0];
        float f14 = fArr[1];
        float f15 = fArr[3];
        float f16 = fArr[4];
        float f17 = fArr[5];
        float f18 = fArr[7];
        float f19 = fArr[12];
        float f23 = fArr[13];
        float f24 = fArr[15];
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j13 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j13 & 4294967295L));
        float f25 = 1 / (((f15 * fIntBitsToFloat) + (f18 * fIntBitsToFloat2)) + f24);
        if ((Float.floatToRawIntBits(f25) & Integer.MAX_VALUE) >= 2139095040) {
            f25 = 0.0f;
        }
        return g.eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits((((f13 * fIntBitsToFloat) + (f16 * fIntBitsToFloat2)) + f19) * f25)) << 32) | (((long) Float.floatToRawIntBits(f25 * ((f14 * fIntBitsToFloat) + (f17 * fIntBitsToFloat2) + f23))) & 4294967295L));
    }

    public static final /* synthetic */ hszhottldk iobyxmoadg(float[] fArr) {
        return new hszhottldk(fArr);
    }

    public static final void lqeggnwhkg(float[] fArr, g.ppxfxbqfkf ppxfxbqfkfVar) {
        if (fArr.length < 16) {
            return;
        }
        float f13 = fArr[0];
        float f14 = fArr[1];
        float f15 = fArr[3];
        float f16 = fArr[4];
        float f17 = fArr[5];
        float f18 = fArr[7];
        float f19 = fArr[12];
        float f23 = fArr[13];
        float f24 = fArr[15];
        float fZoijcleaow = ppxfxbqfkfVar.zoijcleaow();
        float fWkgbmnqykc = ppxfxbqfkfVar.wkgbmnqykc();
        float fPpxfxbqfkf = ppxfxbqfkfVar.ppxfxbqfkf();
        float fIobyxmoadg = ppxfxbqfkfVar.iobyxmoadg();
        float f25 = f15 * fZoijcleaow;
        float f26 = f18 * fWkgbmnqykc;
        float f27 = 1.0f / ((f25 + f26) + f24);
        if ((Float.floatToRawIntBits(f27) & Integer.MAX_VALUE) >= 2139095040) {
            f27 = 0.0f;
        }
        float f28 = f13 * fZoijcleaow;
        float f29 = f16 * fWkgbmnqykc;
        float f33 = f27 * (f28 + f29 + f19);
        float f34 = fZoijcleaow * f14;
        float f35 = fWkgbmnqykc * f17;
        float f36 = f27 * (f34 + f35 + f23);
        float f37 = f18 * fIobyxmoadg;
        float f38 = 1.0f / ((f25 + f37) + f24);
        float f39 = (Float.floatToRawIntBits(f38) & Integer.MAX_VALUE) < 2139095040 ? f38 : 0.0f;
        float f43 = f16 * fIobyxmoadg;
        float f44 = (f28 + f43 + f19) * f39;
        float f45 = f17 * fIobyxmoadg;
        float f46 = f39 * (f34 + f45 + f23);
        float f47 = f15 * fPpxfxbqfkf;
        float f48 = 1.0f / ((f47 + f26) + f24);
        if ((Float.floatToRawIntBits(f48) & Integer.MAX_VALUE) >= 2139095040) {
            f48 = 0.0f;
        }
        float f49 = f13 * fPpxfxbqfkf;
        float f53 = f48 * (f49 + f29 + f19);
        float f54 = f14 * fPpxfxbqfkf;
        float f55 = f48 * (f35 + f54 + f23);
        float f56 = 1.0f / ((f47 + f37) + f24);
        float f57 = (Float.floatToRawIntBits(f56) & Integer.MAX_VALUE) < 2139095040 ? f56 : 0.0f;
        float f58 = (f49 + f43 + f19) * f57;
        float f59 = f57 * (f54 + f45 + f23);
        ppxfxbqfkfVar.dxjokdxxww(Math.min(f33, Math.min(f44, Math.min(f53, f58))));
        ppxfxbqfkfVar.gtknphoqwx(Math.min(f36, Math.min(f46, Math.min(f55, f59))));
        ppxfxbqfkfVar.btonecajqb(Math.max(f33, Math.max(f44, Math.max(f53, f58))));
        ppxfxbqfkfVar.nufgyqmvbu(Math.max(f36, Math.max(f46, Math.max(f55, f59))));
    }

    public static final void nufgyqmvbu(float[] fArr) {
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 1.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 1.0f;
    }

    public static /* synthetic */ void ojitshcjhn(float[] fArr, float f13, float f14, float f15, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            f13 = 0.0f;
        }
        if ((i13 & 2) != 0) {
            f14 = 0.0f;
        }
        if ((i13 & 4) != 0) {
            f15 = 0.0f;
        }
        agtfadlqog(fArr, f13, f14, f15);
    }

    public static /* synthetic */ float[] ppxfxbqfkf(float[] fArr, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        if ((i13 & 1) != 0) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        }
        return zoijcleaow(fArr);
    }

    public static String wflxmlrfwp(float[] fArr) {
        return mj.kcexrzcfyt.btonecajqb("\n            |" + fArr[0] + ' ' + fArr[1] + ' ' + fArr[2] + ' ' + fArr[3] + "|\n            |" + fArr[4] + ' ' + fArr[5] + ' ' + fArr[6] + ' ' + fArr[7] + "|\n            |" + fArr[8] + ' ' + fArr[9] + ' ' + fArr[10] + ' ' + fArr[11] + "|\n            |" + fArr[12] + ' ' + fArr[13] + ' ' + fArr[14] + ' ' + fArr[15] + "|\n        ");
    }

    public static boolean wkgbmnqykc(float[] fArr, Object obj) {
        return (obj instanceof hszhottldk) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(fArr, ((hszhottldk) obj).rgvfuqvkyq());
    }

    public static float[] zoijcleaow(float[] fArr) {
        return fArr;
    }

    public boolean equals(Object obj) {
        return wkgbmnqykc(this.f38903iobyxmoadg, obj);
    }

    public int hashCode() {
        return eablkybsjg(this.f38903iobyxmoadg);
    }

    public final /* synthetic */ float[] rgvfuqvkyq() {
        return this.f38903iobyxmoadg;
    }

    public String toString() {
        return wflxmlrfwp(this.f38903iobyxmoadg);
    }
}
