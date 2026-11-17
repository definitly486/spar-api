package u;

import hg.agtfadlqog;
import java.util.List;
import t.pmvmpeiblj;
import t.vdvldrhtss;

/* JADX INFO: loaded from: classes.dex */
public abstract class eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static boolean f112392iobyxmoadg = true;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static boolean f112393zoijcleaow;

    public static final float[] btonecajqb(float[] fArr, float[] fArr2, int i13, int i14, float[] fArr3) {
        int i15 = i14;
        if (i15 < 1) {
            w.iobyxmoadg.iobyxmoadg("The degree must be at positive integer");
        }
        if (i13 == 0) {
            w.iobyxmoadg.iobyxmoadg("At least one point must be provided");
        }
        if (i15 >= i13) {
            i15 = i13 - 1;
        }
        int i16 = i15 + 1;
        float[][] fArr4 = new float[i16][];
        for (int i17 = 0; i17 < i16; i17++) {
            fArr4[i17] = new float[i13];
        }
        for (int i18 = 0; i18 < i13; i18++) {
            fArr4[0][i18] = 1.0f;
            for (int i19 = 1; i19 < i16; i19++) {
                fArr4[i19][i18] = fArr4[i19 - 1][i18] * fArr[i18];
            }
        }
        float[][] fArr5 = new float[i16][];
        for (int i23 = 0; i23 < i16; i23++) {
            fArr5[i23] = new float[i13];
        }
        float[][] fArr6 = new float[i16][];
        for (int i24 = 0; i24 < i16; i24++) {
            fArr6[i24] = new float[i16];
        }
        int i25 = 0;
        while (i25 < i16) {
            float[] fArr7 = fArr5[i25];
            agtfadlqog.gtknphoqwx(fArr4[i25], fArr7, 0, 0, i13);
            for (int i26 = 0; i26 < i25; i26++) {
                float[] fArr8 = fArr5[i26];
                float fNufgyqmvbu = nufgyqmvbu(fArr7, fArr8);
                for (int i27 = 0; i27 < i13; i27++) {
                    fArr7[i27] = fArr7[i27] - (fArr8[i27] * fNufgyqmvbu);
                }
            }
            float fSqrt = (float) Math.sqrt(nufgyqmvbu(fArr7, fArr7));
            if (fSqrt < 1.0E-6f) {
                fSqrt = 1.0E-6f;
            }
            float f13 = 1.0f / fSqrt;
            for (int i28 = 0; i28 < i13; i28++) {
                fArr7[i28] = fArr7[i28] * f13;
            }
            float[] fArr9 = fArr6[i25];
            int i29 = 0;
            while (i29 < i16) {
                fArr9[i29] = i29 < i25 ? 0.0f : nufgyqmvbu(fArr7, fArr4[i29]);
                i29++;
            }
            i25++;
        }
        for (int i33 = i15; -1 < i33; i33--) {
            float fNufgyqmvbu2 = nufgyqmvbu(fArr5[i33], fArr2);
            float[] fArr10 = fArr6[i33];
            int i34 = i33 + 1;
            if (i34 <= i15) {
                int i35 = i15;
                while (true) {
                    fNufgyqmvbu2 -= fArr10[i35] * fArr3[i35];
                    if (i35 != i34) {
                        i35--;
                    }
                }
            }
            fArr3[i33] = fNufgyqmvbu2 / fArr10[i33];
        }
        return fArr3;
    }

    public static final boolean dxjokdxxww() {
        return f112393zoijcleaow;
    }

    private static final void eablkybsjg(wkgbmnqykc wkgbmnqykcVar, pmvmpeiblj pmvmpeibljVar, long j13) {
        if (vdvldrhtss.zoijcleaow(pmvmpeibljVar)) {
            wkgbmnqykcVar.gxszxtbevo(pmvmpeibljVar.nufgyqmvbu());
            wkgbmnqykcVar.eablkybsjg();
        }
        long jGtknphoqwx = pmvmpeibljVar.gtknphoqwx();
        List listEablkybsjg = pmvmpeibljVar.eablkybsjg();
        int size = listEablkybsjg.size();
        int i13 = 0;
        while (i13 < size) {
            t.ppxfxbqfkf ppxfxbqfkfVar = (t.ppxfxbqfkf) listEablkybsjg.get(i13);
            long jRgvfuqvkyq = g.eablkybsjg.rgvfuqvkyq(ppxfxbqfkfVar.zoijcleaow(), jGtknphoqwx);
            long jZoijcleaow = ppxfxbqfkfVar.zoijcleaow();
            wkgbmnqykcVar.gxszxtbevo(g.eablkybsjg.vdvldrhtss(wkgbmnqykcVar.ppxfxbqfkf(), jRgvfuqvkyq));
            wkgbmnqykcVar.iobyxmoadg(ppxfxbqfkfVar.ppxfxbqfkf(), g.eablkybsjg.vdvldrhtss(wkgbmnqykcVar.ppxfxbqfkf(), j13));
            i13++;
            jGtknphoqwx = jZoijcleaow;
        }
        wkgbmnqykcVar.gxszxtbevo(g.eablkybsjg.vdvldrhtss(wkgbmnqykcVar.ppxfxbqfkf(), g.eablkybsjg.rgvfuqvkyq(pmvmpeibljVar.nufgyqmvbu(), jGtknphoqwx)));
        wkgbmnqykcVar.iobyxmoadg(pmvmpeibljVar.ojitshcjhn(), g.eablkybsjg.vdvldrhtss(wkgbmnqykcVar.ppxfxbqfkf(), j13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gtknphoqwx(iobyxmoadg[] iobyxmoadgVarArr, int i13, long j13, float f13) {
        iobyxmoadg iobyxmoadgVar = iobyxmoadgVarArr[i13];
        if (iobyxmoadgVar == null) {
            iobyxmoadgVarArr[i13] = new iobyxmoadg(j13, f13);
        } else {
            iobyxmoadgVar.wkgbmnqykc(j13);
            iobyxmoadgVar.ppxfxbqfkf(f13);
        }
    }

    private static final void gxszxtbevo(wkgbmnqykc wkgbmnqykcVar, pmvmpeiblj pmvmpeibljVar, long j13) {
        if (vdvldrhtss.zoijcleaow(pmvmpeibljVar)) {
            wkgbmnqykcVar.eablkybsjg();
        }
        if (!vdvldrhtss.wkgbmnqykc(pmvmpeibljVar)) {
            List listEablkybsjg = pmvmpeibljVar.eablkybsjg();
            int size = listEablkybsjg.size();
            for (int i13 = 0; i13 < size; i13++) {
                t.ppxfxbqfkf ppxfxbqfkfVar = (t.ppxfxbqfkf) listEablkybsjg.get(i13);
                wkgbmnqykcVar.iobyxmoadg(ppxfxbqfkfVar.ppxfxbqfkf(), g.eablkybsjg.vdvldrhtss(ppxfxbqfkfVar.iobyxmoadg(), j13));
            }
            wkgbmnqykcVar.iobyxmoadg(pmvmpeibljVar.ojitshcjhn(), g.eablkybsjg.vdvldrhtss(pmvmpeibljVar.lqeggnwhkg(), j13));
        }
        if (vdvldrhtss.wkgbmnqykc(pmvmpeibljVar) && pmvmpeibljVar.ojitshcjhn() - wkgbmnqykcVar.wkgbmnqykc() > 40) {
            wkgbmnqykcVar.eablkybsjg();
        }
        wkgbmnqykcVar.lqeggnwhkg(pmvmpeibljVar.ojitshcjhn());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float lqeggnwhkg(float[] fArr, float[] fArr2, int i13, boolean z13) {
        int i14 = i13 - 1;
        float f13 = fArr2[i14];
        float fSignum = 0.0f;
        int i15 = i14;
        while (i15 > 0) {
            int i16 = i15 - 1;
            float f14 = fArr2[i16];
            if (f13 != f14) {
                float f15 = (z13 ? -fArr[i16] : fArr[i15] - fArr[i16]) / (f13 - f14);
                fSignum += (f15 - (Math.signum(fSignum) * ((float) Math.sqrt(2 * Math.abs(fSignum))))) * Math.abs(f15);
                if (i15 == i14) {
                    fSignum *= 0.5f;
                }
            }
            i15--;
            f13 = f14;
        }
        return Math.signum(fSignum) * ((float) Math.sqrt(2 * Math.abs(fSignum)));
    }

    private static final float nufgyqmvbu(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f13 = 0.0f;
        for (int i13 = 0; i13 < length; i13++) {
            f13 += fArr[i13] * fArr2[i13];
        }
        return f13;
    }

    public static final void ppxfxbqfkf(wkgbmnqykc wkgbmnqykcVar, pmvmpeiblj pmvmpeibljVar) {
        wkgbmnqykc(wkgbmnqykcVar, pmvmpeibljVar, g.eablkybsjg.f35584zoijcleaow.ppxfxbqfkf());
    }

    public static final void wkgbmnqykc(wkgbmnqykc wkgbmnqykcVar, pmvmpeiblj pmvmpeibljVar, long j13) {
        if (f112392iobyxmoadg) {
            gxszxtbevo(wkgbmnqykcVar, pmvmpeibljVar, j13);
        } else {
            eablkybsjg(wkgbmnqykcVar, pmvmpeibljVar, j13);
        }
    }
}
