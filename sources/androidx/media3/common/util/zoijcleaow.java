package androidx.media3.common.util;

import android.opengl.GLES20;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Map f9836eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f9837iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final C0160zoijcleaow[] f9838ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Map f9839wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final iobyxmoadg[] f9840zoijcleaow;

    private static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final String f9841iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f9842zoijcleaow;

        private iobyxmoadg(String str, int i13) {
            this.f9841iobyxmoadg = str;
            this.f9842zoijcleaow = i13;
        }

        public static iobyxmoadg iobyxmoadg(int i13, int i14) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i13, 35722, iArr, 0);
            int i15 = iArr[0];
            byte[] bArr = new byte[i15];
            GLES20.glGetActiveAttrib(i13, i14, i15, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            String str = new String(bArr, 0, zoijcleaow.nufgyqmvbu(bArr));
            return new iobyxmoadg(str, zoijcleaow.gxszxtbevo(i13, str));
        }
    }

    /* JADX INFO: renamed from: androidx.media3.common.util.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    private static final class C0160zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final String f9845iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final int f9846ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f9848zoijcleaow;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final float[] f9847wkgbmnqykc = new float[16];

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final int[] f9843eablkybsjg = new int[4];

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private int f9844gxszxtbevo = 9729;

        private C0160zoijcleaow(String str, int i13, int i14) {
            this.f9845iobyxmoadg = str;
            this.f9848zoijcleaow = i13;
            this.f9846ppxfxbqfkf = i14;
        }

        public static C0160zoijcleaow iobyxmoadg(int i13, int i14) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i13, 35719, iArr, 0);
            int[] iArr2 = new int[1];
            int i15 = iArr[0];
            byte[] bArr = new byte[i15];
            GLES20.glGetActiveUniform(i13, i14, i15, new int[1], 0, new int[1], 0, iArr2, 0, bArr, 0);
            String str = new String(bArr, 0, zoijcleaow.nufgyqmvbu(bArr));
            return new C0160zoijcleaow(str, zoijcleaow.dxjokdxxww(i13, str), iArr2[0]);
        }
    }

    public zoijcleaow(String str, String str2) throws GlUtil.GlException {
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.f9837iobyxmoadg = iGlCreateProgram;
        GlUtil.zoijcleaow();
        wkgbmnqykc(iGlCreateProgram, 35633, str);
        wkgbmnqykc(iGlCreateProgram, 35632, str2);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        GlUtil.ppxfxbqfkf(iArr[0] == 1, "Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(iGlCreateProgram));
        GLES20.glUseProgram(iGlCreateProgram);
        this.f9839wkgbmnqykc = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35721, iArr2, 0);
        this.f9840zoijcleaow = new iobyxmoadg[iArr2[0]];
        for (int i13 = 0; i13 < iArr2[0]; i13++) {
            iobyxmoadg iobyxmoadgVarIobyxmoadg = iobyxmoadg.iobyxmoadg(this.f9837iobyxmoadg, i13);
            this.f9840zoijcleaow[i13] = iobyxmoadgVarIobyxmoadg;
            this.f9839wkgbmnqykc.put(iobyxmoadgVarIobyxmoadg.f9841iobyxmoadg, iobyxmoadgVarIobyxmoadg);
        }
        this.f9836eablkybsjg = new HashMap();
        int[] iArr3 = new int[1];
        GLES20.glGetProgramiv(this.f9837iobyxmoadg, 35718, iArr3, 0);
        this.f9838ppxfxbqfkf = new C0160zoijcleaow[iArr3[0]];
        for (int i14 = 0; i14 < iArr3[0]; i14++) {
            C0160zoijcleaow c0160zoijcleaowIobyxmoadg = C0160zoijcleaow.iobyxmoadg(this.f9837iobyxmoadg, i14);
            this.f9838ppxfxbqfkf[i14] = c0160zoijcleaowIobyxmoadg;
            this.f9836eablkybsjg.put(c0160zoijcleaowIobyxmoadg.f9845iobyxmoadg, c0160zoijcleaowIobyxmoadg);
        }
        GlUtil.zoijcleaow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int dxjokdxxww(int i13, String str) {
        return GLES20.glGetUniformLocation(i13, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int gxszxtbevo(int i13, String str) {
        return GLES20.glGetAttribLocation(i13, str);
    }

    private int lqeggnwhkg(String str) {
        return gxszxtbevo(this.f9837iobyxmoadg, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int nufgyqmvbu(byte[] bArr) {
        for (int i13 = 0; i13 < bArr.length; i13++) {
            if (bArr[i13] == 0) {
                return i13;
            }
        }
        return bArr.length;
    }

    private static void wkgbmnqykc(int i13, int i14, String str) throws GlUtil.GlException {
        int iGlCreateShader = GLES20.glCreateShader(i14);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        GlUtil.ppxfxbqfkf(iArr[0] == 1, GLES20.glGetShaderInfoLog(iGlCreateShader) + ", source: \n" + str);
        GLES20.glAttachShader(i13, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        GlUtil.zoijcleaow();
    }

    public int btonecajqb(String str) {
        return dxjokdxxww(this.f9837iobyxmoadg, str);
    }

    public int eablkybsjg(String str) throws GlUtil.GlException {
        int iLqeggnwhkg = lqeggnwhkg(str);
        GLES20.glEnableVertexAttribArray(iLqeggnwhkg);
        GlUtil.zoijcleaow();
        return iLqeggnwhkg;
    }
}
