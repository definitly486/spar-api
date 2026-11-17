package i;

/* JADX INFO: loaded from: classes.dex */
public abstract class wkgbmnqykc {
    public static final float[] agtfadlqog(float[] fArr, float[] fArr2) {
        if (fArr.length < 9 || fArr2.length < 3) {
            return fArr2;
        }
        float f13 = fArr2[0];
        float f14 = fArr2[1];
        float f15 = fArr2[2];
        fArr2[0] = (fArr[0] * f13) + (fArr[3] * f14) + (fArr[6] * f15);
        fArr2[1] = (fArr[1] * f13) + (fArr[4] * f14) + (fArr[7] * f15);
        fArr2[2] = (fArr[2] * f13) + (fArr[5] * f14) + (fArr[8] * f15);
        return fArr2;
    }

    private static final draadjrbmk btonecajqb(ppxfxbqfkf ppxfxbqfkfVar, ppxfxbqfkf ppxfxbqfkfVar2, int i13) {
        draadjrbmk draadjrbmkVar;
        if (ppxfxbqfkfVar == ppxfxbqfkfVar2) {
            return draadjrbmk.f41476lqeggnwhkg.ppxfxbqfkf(ppxfxbqfkfVar);
        }
        long jEablkybsjg = ppxfxbqfkfVar.eablkybsjg();
        zoijcleaow.iobyxmoadg iobyxmoadgVar = zoijcleaow.f41585iobyxmoadg;
        kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar = null;
        if (zoijcleaow.eablkybsjg(jEablkybsjg, iobyxmoadgVar.zoijcleaow()) && zoijcleaow.eablkybsjg(ppxfxbqfkfVar2.eablkybsjg(), iobyxmoadgVar.zoijcleaow())) {
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(ppxfxbqfkfVar, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(ppxfxbqfkfVar2, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            draadjrbmkVar = new draadjrbmk.zoijcleaow((iozdgvuglv) ppxfxbqfkfVar, (iozdgvuglv) ppxfxbqfkfVar2, i13, gtknphoqwxVar);
        } else {
            draadjrbmkVar = new draadjrbmk(ppxfxbqfkfVar, ppxfxbqfkfVar2, i13, gtknphoqwxVar);
        }
        return draadjrbmkVar;
    }

    public static final float[] draadjrbmk(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length < 9 || fArr2.length < 9) {
            return fArr3;
        }
        float f13 = fArr[0] * fArr2[0];
        float f14 = fArr[3];
        float f15 = fArr2[1];
        float f16 = fArr[6];
        float f17 = fArr2[2];
        fArr3[0] = f13 + (f14 * f15) + (f16 * f17);
        float f18 = fArr[1];
        float f19 = fArr2[0];
        float f23 = fArr[4];
        float f24 = fArr[7];
        fArr3[1] = (f18 * f19) + (f15 * f23) + (f24 * f17);
        float f25 = fArr[2] * f19;
        float f26 = fArr[5];
        float f27 = f25 + (fArr2[1] * f26);
        float f28 = fArr[8];
        fArr3[2] = f27 + (f17 * f28);
        float f29 = fArr[0];
        float f33 = fArr2[3] * f29;
        float f34 = fArr2[4];
        float f35 = f33 + (f14 * f34);
        float f36 = fArr2[5];
        fArr3[3] = f35 + (f16 * f36);
        float f37 = fArr[1];
        float f38 = fArr2[3];
        fArr3[4] = (f37 * f38) + (f23 * f34) + (f24 * f36);
        float f39 = fArr[2];
        fArr3[5] = (f38 * f39) + (f26 * fArr2[4]) + (f36 * f28);
        float f43 = f29 * fArr2[6];
        float f44 = fArr[3];
        float f45 = fArr2[7];
        float f46 = f43 + (f44 * f45);
        float f47 = fArr2[8];
        fArr3[6] = f46 + (f16 * f47);
        float f48 = fArr2[6];
        fArr3[7] = (f37 * f48) + (fArr[4] * f45) + (f24 * f47);
        fArr3[8] = (f39 * f48) + (fArr[5] * fArr2[7]) + (f28 * f47);
        return fArr3;
    }

    public static /* synthetic */ draadjrbmk dxjokdxxww(ppxfxbqfkf ppxfxbqfkfVar, ppxfxbqfkf ppxfxbqfkfVar2, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            ppxfxbqfkfVar2 = gtknphoqwx.f41496iobyxmoadg.lmojexxdyd();
        }
        if ((i14 & 2) != 0) {
            i13 = oxmwwwfdhm.f41564iobyxmoadg.zoijcleaow();
        }
        return nufgyqmvbu(ppxfxbqfkfVar, ppxfxbqfkfVar2, i13);
    }

    public static final float[] eablkybsjg(float[] fArr, float[] fArr2, float[] fArr3) {
        float[] fArrAgtfadlqog = agtfadlqog(fArr, fArr2);
        float[] fArrAgtfadlqog2 = agtfadlqog(fArr, fArr3);
        return draadjrbmk(gtknphoqwx(fArr), wflxmlrfwp(new float[]{fArrAgtfadlqog2[0] / fArrAgtfadlqog[0], fArrAgtfadlqog2[1] / fArrAgtfadlqog[1], fArrAgtfadlqog2[2] / fArrAgtfadlqog[2]}, fArr));
    }

    public static final float[] gtknphoqwx(float[] fArr) {
        float f13 = fArr[0];
        float f14 = fArr[3];
        float f15 = fArr[6];
        float f16 = fArr[1];
        float f17 = fArr[4];
        float f18 = fArr[7];
        float f19 = fArr[2];
        float f23 = fArr[5];
        float f24 = fArr[8];
        float f25 = (f17 * f24) - (f18 * f23);
        float f26 = (f18 * f19) - (f16 * f24);
        float f27 = (f16 * f23) - (f17 * f19);
        float f28 = (f13 * f25) + (f14 * f26) + (f15 * f27);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f25 / f28;
        fArr2[1] = f26 / f28;
        fArr2[2] = f27 / f28;
        fArr2[3] = ((f15 * f23) - (f14 * f24)) / f28;
        fArr2[4] = ((f24 * f13) - (f15 * f19)) / f28;
        fArr2[5] = ((f19 * f14) - (f23 * f13)) / f28;
        fArr2[6] = ((f14 * f18) - (f15 * f17)) / f28;
        fArr2[7] = ((f15 * f16) - (f18 * f13)) / f28;
        fArr2[8] = ((f13 * f17) - (f14 * f16)) / f28;
        return fArr2;
    }

    public static final boolean gxszxtbevo(ylkuphrtab ylkuphrtabVar, ylkuphrtab ylkuphrtabVar2) {
        if (ylkuphrtabVar == ylkuphrtabVar2) {
            return true;
        }
        return Math.abs(ylkuphrtabVar.iobyxmoadg() - ylkuphrtabVar2.iobyxmoadg()) < 0.001f && Math.abs(ylkuphrtabVar.zoijcleaow() - ylkuphrtabVar2.zoijcleaow()) < 0.001f;
    }

    public static final double iobyxmoadg(double d13, double d14, double d15, double d16, double d17, double d18) {
        return Math.copySign(ojitshcjhn(d13 < 0.0d ? -d13 : d13, d14, d15, d16, d17, d18), d13);
    }

    public static final boolean lqeggnwhkg(float[] fArr, float[] fArr2) {
        if (fArr == fArr2) {
            return true;
        }
        int length = fArr.length;
        for (int i13 = 0; i13 < length; i13++) {
            if (Float.compare(fArr[i13], fArr2[i13]) != 0 && Math.abs(fArr[i13] - fArr2[i13]) > 0.001f) {
                return false;
            }
        }
        return true;
    }

    public static final draadjrbmk nufgyqmvbu(ppxfxbqfkf ppxfxbqfkfVar, ppxfxbqfkf ppxfxbqfkfVar2, int i13) {
        int iZoijcleaow = ppxfxbqfkfVar.zoijcleaow();
        int iZoijcleaow2 = ppxfxbqfkfVar2.zoijcleaow();
        if ((iZoijcleaow | iZoijcleaow2) < 0) {
            return btonecajqb(ppxfxbqfkfVar, ppxfxbqfkfVar2, i13);
        }
        androidx.collection.iozdgvuglv iozdgvuglvVarIobyxmoadg = wflxmlrfwp.iobyxmoadg();
        int i14 = iZoijcleaow | (iZoijcleaow2 << 6) | (i13 << 12);
        Object objZoijcleaow = iozdgvuglvVarIobyxmoadg.zoijcleaow(i14);
        if (objZoijcleaow == null) {
            objZoijcleaow = btonecajqb(ppxfxbqfkfVar, ppxfxbqfkfVar2, i13);
            iozdgvuglvVarIobyxmoadg.oxmwwwfdhm(i14, objZoijcleaow);
        }
        return (draadjrbmk) objZoijcleaow;
    }

    public static final double ojitshcjhn(double d13, double d14, double d15, double d16, double d17, double d18) {
        return d13 >= d17 * d16 ? (Math.pow(d13, 1.0d / d18) - d15) / d14 : d13 / d16;
    }

    public static final double oxmwwwfdhm(double d13, double d14, double d15, double d16, double d17, double d18, double d19, double d23) {
        return d13 >= d17 ? Math.pow((d14 * d13) + d15, d23) + d18 : (d16 * d13) + d19;
    }

    public static final ppxfxbqfkf ppxfxbqfkf(ppxfxbqfkf ppxfxbqfkfVar, ylkuphrtab ylkuphrtabVar, iobyxmoadg iobyxmoadgVar) {
        if (!zoijcleaow.eablkybsjg(ppxfxbqfkfVar.eablkybsjg(), zoijcleaow.f41585iobyxmoadg.zoijcleaow())) {
            return ppxfxbqfkfVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(ppxfxbqfkfVar, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        iozdgvuglv iozdgvuglvVar = (iozdgvuglv) ppxfxbqfkfVar;
        if (gxszxtbevo(iozdgvuglvVar.iozdgvuglv(), ylkuphrtabVar)) {
            return ppxfxbqfkfVar;
        }
        return new iozdgvuglv(iozdgvuglvVar, draadjrbmk(eablkybsjg(iobyxmoadgVar.zoijcleaow(), iozdgvuglvVar.iozdgvuglv().ppxfxbqfkf(), ylkuphrtabVar.ppxfxbqfkf()), iozdgvuglvVar.yadqdtsiqt()), ylkuphrtabVar);
    }

    public static final double rgvfuqvkyq(double d13, double d14, double d15, double d16, double d17, double d18, double d19, double d23) {
        return d13 >= d17 * d16 ? (Math.pow(d13 - d18, 1.0d / d23) - d15) / d14 : (d13 - d19) / d16;
    }

    public static final double vdvldrhtss(double d13, double d14, double d15, double d16, double d17, double d18) {
        return d13 >= d17 ? Math.pow((d14 * d13) + d15, d18) : d13 * d16;
    }

    public static final float[] wflxmlrfwp(float[] fArr, float[] fArr2) {
        float f13 = fArr[0];
        float f14 = fArr2[0] * f13;
        float f15 = fArr[1];
        float f16 = fArr2[1] * f15;
        float f17 = fArr[2];
        return new float[]{f14, f16, fArr2[2] * f17, fArr2[3] * f13, fArr2[4] * f15, fArr2[5] * f17, f13 * fArr2[6], f15 * fArr2[7], f17 * fArr2[8]};
    }

    public static /* synthetic */ ppxfxbqfkf wkgbmnqykc(ppxfxbqfkf ppxfxbqfkfVar, ylkuphrtab ylkuphrtabVar, iobyxmoadg iobyxmoadgVar, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            iobyxmoadgVar = iobyxmoadg.f41519zoijcleaow.iobyxmoadg();
        }
        return ppxfxbqfkf(ppxfxbqfkfVar, ylkuphrtabVar, iobyxmoadgVar);
    }

    public static final double zoijcleaow(double d13, double d14, double d15, double d16, double d17, double d18) {
        return Math.copySign(vdvldrhtss(d13 < 0.0d ? -d13 : d13, d14, d15, d16, d17, d18), d13);
    }
}
