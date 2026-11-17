package i;

import h.bfopjjpdmp;

/* JADX INFO: loaded from: classes.dex */
public final class vdvldrhtss extends ppxfxbqfkf {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private static final float[] f41574dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final iobyxmoadg f41575eablkybsjg = new iobyxmoadg(null);

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final float[] f41576gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final float[] f41577lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private static final float[] f41578nufgyqmvbu;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    static {
        float[] fArrZoijcleaow = i.iobyxmoadg.f41519zoijcleaow.iobyxmoadg().zoijcleaow();
        ojitshcjhn ojitshcjhnVar = ojitshcjhn.f41557iobyxmoadg;
        float[] fArrDraadjrbmk = wkgbmnqykc.draadjrbmk(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, wkgbmnqykc.eablkybsjg(fArrZoijcleaow, ojitshcjhnVar.zoijcleaow().ppxfxbqfkf(), ojitshcjhnVar.eablkybsjg().ppxfxbqfkf()));
        f41576gxszxtbevo = fArrDraadjrbmk;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f41577lqeggnwhkg = fArr;
        f41578nufgyqmvbu = wkgbmnqykc.gtknphoqwx(fArrDraadjrbmk);
        f41574dxjokdxxww = wkgbmnqykc.gtknphoqwx(fArr);
    }

    public vdvldrhtss(String str, int i13) {
        super(str, zoijcleaow.f41585iobyxmoadg.iobyxmoadg(), i13, null);
    }

    @Override // i.ppxfxbqfkf
    public long btonecajqb(float f13, float f14, float f15, float f16, ppxfxbqfkf ppxfxbqfkfVar) {
        float[] fArr = f41576gxszxtbevo;
        float f17 = (fArr[0] * f13) + (fArr[3] * f14) + (fArr[6] * f15);
        float f18 = (fArr[1] * f13) + (fArr[4] * f14) + (fArr[7] * f15);
        float f19 = (fArr[2] * f13) + (fArr[5] * f14) + (fArr[8] * f15);
        float fIobyxmoadg = y0.wkgbmnqykc.iobyxmoadg(f17);
        float fIobyxmoadg2 = y0.wkgbmnqykc.iobyxmoadg(f18);
        float fIobyxmoadg3 = y0.wkgbmnqykc.iobyxmoadg(f19);
        float[] fArr2 = f41577lqeggnwhkg;
        return bfopjjpdmp.iobyxmoadg((fArr2[0] * fIobyxmoadg) + (fArr2[3] * fIobyxmoadg2) + (fArr2[6] * fIobyxmoadg3), (fArr2[1] * fIobyxmoadg) + (fArr2[4] * fIobyxmoadg2) + (fArr2[7] * fIobyxmoadg3), (fArr2[2] * fIobyxmoadg) + (fArr2[5] * fIobyxmoadg2) + (fArr2[8] * fIobyxmoadg3), f16, ppxfxbqfkfVar);
    }

    @Override // i.ppxfxbqfkf
    public float dxjokdxxww(float f13, float f14, float f15) {
        if (f13 < 0.0f) {
            f13 = 0.0f;
        }
        if (f13 > 1.0f) {
            f13 = 1.0f;
        }
        if (f14 < -0.5f) {
            f14 = -0.5f;
        }
        if (f14 > 0.5f) {
            f14 = 0.5f;
        }
        if (f15 < -0.5f) {
            f15 = -0.5f;
        }
        float f16 = f15 <= 0.5f ? f15 : 0.5f;
        float[] fArr = f41574dxjokdxxww;
        float f17 = (fArr[0] * f13) + (fArr[3] * f14) + (fArr[6] * f16);
        float f18 = (fArr[1] * f13) + (fArr[4] * f14) + (fArr[7] * f16);
        float f19 = (fArr[2] * f13) + (fArr[5] * f14) + (fArr[8] * f16);
        float f23 = f17 * f17 * f17;
        float f24 = f18 * f18 * f18;
        float[] fArr2 = f41578nufgyqmvbu;
        return (fArr2[2] * f23) + (fArr2[5] * f24) + (fArr2[8] * f19 * f19 * f19);
    }

    @Override // i.ppxfxbqfkf
    public long nufgyqmvbu(float f13, float f14, float f15) {
        if (f13 < 0.0f) {
            f13 = 0.0f;
        }
        if (f13 > 1.0f) {
            f13 = 1.0f;
        }
        if (f14 < -0.5f) {
            f14 = -0.5f;
        }
        if (f14 > 0.5f) {
            f14 = 0.5f;
        }
        if (f15 < -0.5f) {
            f15 = -0.5f;
        }
        float f16 = f15 <= 0.5f ? f15 : 0.5f;
        float[] fArr = f41574dxjokdxxww;
        float f17 = (fArr[0] * f13) + (fArr[3] * f14) + (fArr[6] * f16);
        float f18 = (fArr[1] * f13) + (fArr[4] * f14) + (fArr[7] * f16);
        float f19 = (fArr[2] * f13) + (fArr[5] * f14) + (fArr[8] * f16);
        float f23 = f17 * f17 * f17;
        float f24 = f18 * f18 * f18;
        float f25 = f19 * f19 * f19;
        float[] fArr2 = f41578nufgyqmvbu;
        return (((long) Float.floatToRawIntBits(((fArr2[0] * f23) + (fArr2[3] * f24)) + (fArr2[6] * f25))) << 32) | (((long) Float.floatToRawIntBits((fArr2[1] * f23) + (fArr2[4] * f24) + (fArr2[7] * f25))) & 4294967295L);
    }

    @Override // i.ppxfxbqfkf
    public float ppxfxbqfkf(int i13) {
        return i13 == 0 ? 1.0f : 0.5f;
    }

    @Override // i.ppxfxbqfkf
    public float wkgbmnqykc(int i13) {
        return i13 == 0 ? 0.0f : -0.5f;
    }
}
