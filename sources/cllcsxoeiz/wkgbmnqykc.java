package cllcsxoeiz;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import jpowsppfya.iwizpuwonk;
import lereixgezr.sopmlzcsov;
import u1.nufgyqmvbu;

/* JADX INFO: loaded from: classes.dex */
public abstract class wkgbmnqykc {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public static final float[] f20029btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    public static final cllcsxoeiz.lqeggnwhkg f20030draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public static final FloatBuffer f20031dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final iwizpuwonk f20032eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public static final FloatBuffer f20033gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final iwizpuwonk f20034gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final iwizpuwonk f20036lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public static final float[] f20037nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final String f20038ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final String f20039wkgbmnqykc;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final int[] f20035iobyxmoadg = {12344};

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final int[] f20040zoijcleaow = {12445, 13632, 12344};

    public enum eablkybsjg {
        UNKNOWN,
        DEFAULT,
        YUV
    }

    public static abstract class gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        protected int f20045iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        protected int f20048zoijcleaow = -1;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        protected int f20046ppxfxbqfkf = -1;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        protected int f20047wkgbmnqykc = -1;

        /* JADX WARN: Code duplicated, block: B:32:0x0078  */
        /* JADX WARN: Code duplicated, block: B:34:0x007d  */
        /* JADX WARN: Code duplicated, block: B:36:0x0082  */
        protected gxszxtbevo(String str, String str2) throws Throwable {
            int iEsjtqupxsv;
            int iEsjtqupxsv2;
            int iGlCreateProgram;
            try {
                iEsjtqupxsv = wkgbmnqykc.esjtqupxsv(35633, str);
                try {
                    iEsjtqupxsv2 = wkgbmnqykc.esjtqupxsv(35632, str2);
                    try {
                        iGlCreateProgram = GLES20.glCreateProgram();
                        try {
                            wkgbmnqykc.lqeggnwhkg("glCreateProgram");
                            GLES20.glAttachShader(iGlCreateProgram, iEsjtqupxsv);
                            wkgbmnqykc.lqeggnwhkg("glAttachShader");
                            GLES20.glAttachShader(iGlCreateProgram, iEsjtqupxsv2);
                            wkgbmnqykc.lqeggnwhkg("glAttachShader");
                            GLES20.glLinkProgram(iGlCreateProgram);
                            int[] iArr = new int[1];
                            GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
                            if (iArr[0] == 1) {
                                this.f20045iobyxmoadg = iGlCreateProgram;
                                ppxfxbqfkf();
                            } else {
                                throw new IllegalStateException("Could not link program: " + GLES20.glGetProgramInfoLog(iGlCreateProgram));
                            }
                        } catch (IllegalArgumentException e13) {
                            e = e13;
                            if (iEsjtqupxsv != -1) {
                                GLES20.glDeleteShader(iEsjtqupxsv);
                            }
                            if (iEsjtqupxsv2 != -1) {
                                GLES20.glDeleteShader(iEsjtqupxsv2);
                            }
                            if (iGlCreateProgram != -1) {
                                GLES20.glDeleteProgram(iGlCreateProgram);
                            }
                            throw e;
                        } catch (IllegalStateException e14) {
                            e = e14;
                            if (iEsjtqupxsv != -1) {
                                GLES20.glDeleteShader(iEsjtqupxsv);
                            }
                            if (iEsjtqupxsv2 != -1) {
                                GLES20.glDeleteShader(iEsjtqupxsv2);
                            }
                            if (iGlCreateProgram != -1) {
                                GLES20.glDeleteProgram(iGlCreateProgram);
                            }
                            throw e;
                        }
                    } catch (IllegalArgumentException | IllegalStateException e15) {
                        e = e15;
                        iGlCreateProgram = -1;
                    }
                } catch (IllegalArgumentException | IllegalStateException e16) {
                    e = e16;
                    iEsjtqupxsv2 = -1;
                    iGlCreateProgram = iEsjtqupxsv2;
                    if (iEsjtqupxsv != -1) {
                        GLES20.glDeleteShader(iEsjtqupxsv);
                    }
                    if (iEsjtqupxsv2 != -1) {
                        GLES20.glDeleteShader(iEsjtqupxsv2);
                    }
                    if (iGlCreateProgram != -1) {
                        GLES20.glDeleteProgram(iGlCreateProgram);
                    }
                    throw e;
                }
            } catch (IllegalArgumentException | IllegalStateException e17) {
                e = e17;
                iEsjtqupxsv = -1;
                iEsjtqupxsv2 = -1;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void ppxfxbqfkf() {
            int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.f20045iobyxmoadg, "aPosition");
            this.f20047wkgbmnqykc = iGlGetAttribLocation;
            wkgbmnqykc.btonecajqb(iGlGetAttribLocation, "aPosition");
            int iGlGetUniformLocation = GLES20.glGetUniformLocation(this.f20045iobyxmoadg, "uTransMatrix");
            this.f20048zoijcleaow = iGlGetUniformLocation;
            wkgbmnqykc.btonecajqb(iGlGetUniformLocation, "uTransMatrix");
            int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(this.f20045iobyxmoadg, "uAlphaScale");
            this.f20046ppxfxbqfkf = iGlGetUniformLocation2;
            wkgbmnqykc.btonecajqb(iGlGetUniformLocation2, "uAlphaScale");
        }

        public void eablkybsjg(float[] fArr) {
            GLES20.glUniformMatrix4fv(this.f20048zoijcleaow, 1, false, fArr, 0);
            wkgbmnqykc.lqeggnwhkg("glUniformMatrix4fv");
        }

        public void gxszxtbevo() {
            GLES20.glUseProgram(this.f20045iobyxmoadg);
            wkgbmnqykc.lqeggnwhkg("glUseProgram");
            GLES20.glEnableVertexAttribArray(this.f20047wkgbmnqykc);
            wkgbmnqykc.lqeggnwhkg("glEnableVertexAttribArray");
            GLES20.glVertexAttribPointer(this.f20047wkgbmnqykc, 2, 5126, false, 0, (Buffer) wkgbmnqykc.f20031dxjokdxxww);
            wkgbmnqykc.lqeggnwhkg("glVertexAttribPointer");
            eablkybsjg(wkgbmnqykc.draadjrbmk());
            wkgbmnqykc(1.0f);
        }

        public void wkgbmnqykc(float f13) {
            GLES20.glUniform1f(this.f20046ppxfxbqfkf, f13);
            wkgbmnqykc.lqeggnwhkg("glUniform1f");
        }

        public void zoijcleaow() {
            GLES20.glDeleteProgram(this.f20045iobyxmoadg);
        }
    }

    class iobyxmoadg implements iwizpuwonk {
        iobyxmoadg() {
        }

        @Override // jpowsppfya.iwizpuwonk
        public String iobyxmoadg(String str, String str2) {
            return String.format(Locale.US, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 %s;\nuniform samplerExternalOES %s;\nuniform float uAlphaScale;\nvoid main() {\n    vec4 src = texture2D(%s, %s);\n    gl_FragColor = vec4(src.rgb, src.a * uAlphaScale);\n}\n", str2, str, str, str2);
        }
    }

    public static class lqeggnwhkg extends gxszxtbevo {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private int f20049eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private int f20050gxszxtbevo;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private int f20051lqeggnwhkg;

        public lqeggnwhkg(lereixgezr.iwizpuwonk iwizpuwonkVar, eablkybsjg eablkybsjgVar) {
            this(iwizpuwonkVar, lqeggnwhkg(iwizpuwonkVar, eablkybsjgVar));
        }

        private static iwizpuwonk lqeggnwhkg(lereixgezr.iwizpuwonk iwizpuwonkVar, eablkybsjg eablkybsjgVar) {
            if (!iwizpuwonkVar.wkgbmnqykc()) {
                return wkgbmnqykc.f20032eablkybsjg;
            }
            nufgyqmvbu.zoijcleaow(eablkybsjgVar != eablkybsjg.UNKNOWN, "No default sampler shader available for" + eablkybsjgVar);
            return eablkybsjgVar == eablkybsjg.YUV ? wkgbmnqykc.f20036lqeggnwhkg : wkgbmnqykc.f20034gxszxtbevo;
        }

        private void ppxfxbqfkf() {
            ppxfxbqfkf();
            int iGlGetUniformLocation = GLES20.glGetUniformLocation(this.f20045iobyxmoadg, "sTexture");
            this.f20049eablkybsjg = iGlGetUniformLocation;
            wkgbmnqykc.btonecajqb(iGlGetUniformLocation, "sTexture");
            int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.f20045iobyxmoadg, "aTextureCoord");
            this.f20051lqeggnwhkg = iGlGetAttribLocation;
            wkgbmnqykc.btonecajqb(iGlGetAttribLocation, "aTextureCoord");
            int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(this.f20045iobyxmoadg, "uTexMatrix");
            this.f20050gxszxtbevo = iGlGetUniformLocation2;
            wkgbmnqykc.btonecajqb(iGlGetUniformLocation2, "uTexMatrix");
        }

        @Override // cllcsxoeiz.wkgbmnqykc.gxszxtbevo
        public void gxszxtbevo() {
            super.gxszxtbevo();
            GLES20.glUniform1i(this.f20049eablkybsjg, 0);
            GLES20.glEnableVertexAttribArray(this.f20051lqeggnwhkg);
            wkgbmnqykc.lqeggnwhkg("glEnableVertexAttribArray");
            GLES20.glVertexAttribPointer(this.f20051lqeggnwhkg, 2, 5126, false, 0, (Buffer) wkgbmnqykc.f20033gtknphoqwx);
            wkgbmnqykc.lqeggnwhkg("glVertexAttribPointer");
        }

        public void nufgyqmvbu(float[] fArr) {
            GLES20.glUniformMatrix4fv(this.f20050gxszxtbevo, 1, false, fArr, 0);
            wkgbmnqykc.lqeggnwhkg("glUniformMatrix4fv");
        }

        public lqeggnwhkg(lereixgezr.iwizpuwonk iwizpuwonkVar, iwizpuwonk iwizpuwonkVar2) {
            super(iwizpuwonkVar.wkgbmnqykc() ? wkgbmnqykc.f20039wkgbmnqykc : wkgbmnqykc.f20038ppxfxbqfkf, wkgbmnqykc.jyumaefscl(iwizpuwonkVar2));
            this.f20049eablkybsjg = -1;
            this.f20050gxszxtbevo = -1;
            this.f20051lqeggnwhkg = -1;
            ppxfxbqfkf();
        }
    }

    class ppxfxbqfkf implements iwizpuwonk {
        ppxfxbqfkf() {
        }

        @Override // jpowsppfya.iwizpuwonk
        public String iobyxmoadg(String str, String str2) {
            return String.format(Locale.US, "#version 300 es\n#extension GL_EXT_YUV_target : require\nprecision mediump float;\nuniform __samplerExternal2DY2YEXT %s;\nuniform float uAlphaScale;\nin vec2 %s;\nout vec4 outColor;\n\nvec3 yuvToRgb(vec3 yuv) {\n  const vec3 yuvOffset = vec3(0.0625, 0.5, 0.5);\n  const mat3 yuvToRgbColorMat = mat3(\n    1.1689f, 1.1689f, 1.1689f,\n    0.0000f, -0.1881f, 2.1502f,\n    1.6853f, -0.6530f, 0.0000f\n  );\n  return clamp(yuvToRgbColorMat * (yuv - yuvOffset), 0.0, 1.0);\n}\n\nvoid main() {\n  vec3 srcYuv = texture(%s, %s).xyz;\n  vec3 srcRgb = yuvToRgb(srcYuv);\n  outColor = vec4(srcRgb, uAlphaScale);\n}", str, str2, str, str2);
        }
    }

    /* JADX INFO: renamed from: cllcsxoeiz.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static class C0373wkgbmnqykc extends gxszxtbevo {
        public C0373wkgbmnqykc() {
            super("uniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n}\n", "precision mediump float;\nuniform float uAlphaScale;\nvoid main() {\n    gl_FragColor = vec4(0.0, 0.0, 0.0, uAlphaScale);\n}\n");
        }
    }

    class zoijcleaow implements iwizpuwonk {
        zoijcleaow() {
        }

        @Override // jpowsppfya.iwizpuwonk
        public String iobyxmoadg(String str, String str2) {
            return String.format(Locale.US, "#version 300 es\n#extension GL_OES_EGL_image_external_essl3 : require\nprecision mediump float;\nuniform samplerExternalOES %s;\nuniform float uAlphaScale;\nin vec2 %s;\nout vec4 outColor;\n\nvoid main() {\n  vec4 src = texture(%s, %s);\n  outColor = vec4(src.rgb, src.a * uAlphaScale);\n}", str, str2, str, str2);
        }
    }

    static {
        Locale locale = Locale.US;
        f20038ppxfxbqfkf = String.format(locale, "uniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 %s;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n    %s = (uTexMatrix * aTextureCoord).xy;\n}\n", "vTextureCoord", "vTextureCoord");
        f20039wkgbmnqykc = String.format(locale, "#version 300 es\nin vec4 aPosition;\nin vec4 aTextureCoord;\nuniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nout vec2 %s;\nvoid main() {\n  gl_Position = uTransMatrix * aPosition;\n  %s = (uTexMatrix * aTextureCoord).xy;\n}\n", "vTextureCoord", "vTextureCoord");
        f20032eablkybsjg = new iobyxmoadg();
        f20034gxszxtbevo = new zoijcleaow();
        f20036lqeggnwhkg = new ppxfxbqfkf();
        float[] fArr = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        f20037nufgyqmvbu = fArr;
        f20031dxjokdxxww = wflxmlrfwp(fArr);
        float[] fArr2 = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
        f20029btonecajqb = fArr2;
        f20033gtknphoqwx = wflxmlrfwp(fArr2);
        f20030draadjrbmk = cllcsxoeiz.lqeggnwhkg.wkgbmnqykc(EGL14.EGL_NO_SURFACE, 0, 0);
    }

    public static EGLSurface agtfadlqog(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i13, int i14) {
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, new int[]{12375, i13, 12374, i14, 12344}, 0);
        gxszxtbevo("eglCreatePbufferSurface");
        if (eGLSurfaceEglCreatePbufferSurface != null) {
            return eGLSurfaceEglCreatePbufferSurface;
        }
        throw new IllegalStateException("surface was null");
    }

    public static void btonecajqb(int i13, String str) {
        if (i13 >= 0) {
            return;
        }
        throw new IllegalStateException("Unable to locate '" + str + "' in program");
    }

    public static Size cqumvgiudr(EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
        return new Size(lereixgezr(eGLDisplay, eGLSurface, 12375), lereixgezr(eGLDisplay, eGLSurface, 12374));
    }

    public static float[] draadjrbmk() {
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        return fArr;
    }

    public static void dxjokdxxww(AtomicBoolean atomicBoolean, boolean z13) {
        nufgyqmvbu.dxjokdxxww(z13 == atomicBoolean.get(), z13 ? "OpenGlRenderer is not initialized" : "OpenGlRenderer is already initialized");
    }

    public static void eablkybsjg(String str) {
        try {
            gxszxtbevo(str);
        } catch (IllegalStateException e13) {
            sopmlzcsov.wkgbmnqykc("GLUtils", e13.toString(), e13);
        }
    }

    public static int esjtqupxsv(int i13, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i13);
        lqeggnwhkg("glCreateShader type=" + i13);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        sopmlzcsov.draadjrbmk("GLUtils", "Could not compile shader: " + str);
        GLES20.glDeleteShader(iGlCreateShader);
        throw new IllegalStateException("Could not compile shader type " + i13 + StringUtils.PROCESS_POSTFIX_DELIMITER + GLES20.glGetShaderInfoLog(iGlCreateShader));
    }

    public static int[] gtknphoqwx(String str, lereixgezr.iwizpuwonk iwizpuwonkVar) {
        int[] iArr = f20035iobyxmoadg;
        if (iwizpuwonkVar.zoijcleaow() != 3) {
            return iArr;
        }
        if (str.contains("EGL_EXT_gl_colorspace_bt2020_hlg")) {
            return f20040zoijcleaow;
        }
        sopmlzcsov.draadjrbmk("GLUtils", "Dynamic range uses HLG encoding, but device does not support EGL_EXT_gl_colorspace_bt2020_hlg.Fallback to default colorspace.");
        return iArr;
    }

    public static void gxszxtbevo(String str) {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            return;
        }
        throw new IllegalStateException(str + ": EGL error: 0x" + Integer.toHexString(iEglGetError));
    }

    public static String iwizpuwonk() {
        Matcher matcher = Pattern.compile("OpenGL ES ([0-9]+)\\.([0-9]+).*").matcher(GLES20.glGetString(7938));
        if (!matcher.find()) {
            return "0.0";
        }
        return ((String) nufgyqmvbu.gxszxtbevo(matcher.group(1))) + "." + ((String) nufgyqmvbu.gxszxtbevo(matcher.group(2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String jyumaefscl(iwizpuwonk iwizpuwonkVar) {
        try {
            String strIobyxmoadg = iwizpuwonkVar.iobyxmoadg("sTexture", "vTextureCoord");
            if (strIobyxmoadg != null && strIobyxmoadg.contains("vTextureCoord") && strIobyxmoadg.contains("sTexture")) {
                return strIobyxmoadg;
            }
            throw new IllegalArgumentException("Invalid fragment shader");
        } catch (Throwable th2) {
            if (th2 instanceof IllegalArgumentException) {
                throw th2;
            }
            throw new IllegalArgumentException("Unable retrieve fragment shader source", th2);
        }
    }

    public static void kcexrzcfyt(int i13) {
        GLES20.glDeleteTextures(1, new int[]{i13}, 0);
        lqeggnwhkg("glDeleteTextures");
    }

    public static int lereixgezr(EGLDisplay eGLDisplay, EGLSurface eGLSurface, int i13) {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(eGLDisplay, eGLSurface, i13, iArr, 0);
        return iArr[0];
    }

    public static void lqeggnwhkg(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        throw new IllegalStateException(str + ": GL error 0x" + Integer.toHexString(iGlGetError));
    }

    public static void nufgyqmvbu(Thread thread) {
        nufgyqmvbu.dxjokdxxww(thread == Thread.currentThread(), "Method call must be called on the GL thread.");
    }

    public static Map ojitshcjhn(lereixgezr.iwizpuwonk iwizpuwonkVar, Map map) {
        Object lqeggnwhkgVar;
        eablkybsjg eablkybsjgVar;
        HashMap map2 = new HashMap();
        eablkybsjg[] eablkybsjgVarArrValues = eablkybsjg.values();
        int length = eablkybsjgVarArrValues.length;
        for (int i13 = 0; i13 < length; i13++) {
            eablkybsjg eablkybsjgVar2 = eablkybsjgVarArrValues[i13];
            iwizpuwonk iwizpuwonkVar2 = (iwizpuwonk) map.get(eablkybsjgVar2);
            if (iwizpuwonkVar2 != null) {
                lqeggnwhkgVar = new lqeggnwhkg(iwizpuwonkVar, iwizpuwonkVar2);
            } else if (eablkybsjgVar2 == eablkybsjg.YUV || eablkybsjgVar2 == (eablkybsjgVar = eablkybsjg.DEFAULT)) {
                lqeggnwhkgVar = new lqeggnwhkg(iwizpuwonkVar, eablkybsjgVar2);
            } else {
                nufgyqmvbu.dxjokdxxww(eablkybsjgVar2 == eablkybsjg.UNKNOWN, "Unhandled input format: " + eablkybsjgVar2);
                if (iwizpuwonkVar.wkgbmnqykc()) {
                    lqeggnwhkgVar = new C0373wkgbmnqykc();
                } else {
                    iwizpuwonk iwizpuwonkVar3 = (iwizpuwonk) map.get(eablkybsjgVar);
                    lqeggnwhkgVar = iwizpuwonkVar3 != null ? new lqeggnwhkg(iwizpuwonkVar, iwizpuwonkVar3) : new lqeggnwhkg(iwizpuwonkVar, eablkybsjgVar);
                }
            }
            Log.d("GLUtils", "Shader program for input format " + eablkybsjgVar2 + " created: " + lqeggnwhkgVar);
            map2.put(eablkybsjgVar2, lqeggnwhkgVar);
        }
        return map2;
    }

    public static void oxmwwwfdhm(int i13) {
        GLES20.glDeleteFramebuffers(1, new int[]{i13}, 0);
        lqeggnwhkg("glDeleteFramebuffers");
    }

    public static int rgvfuqvkyq() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        lqeggnwhkg("glGenTextures");
        int i13 = iArr[0];
        GLES20.glBindTexture(36197, i13);
        lqeggnwhkg("glBindTexture " + i13);
        GLES20.glTexParameteri(36197, 10241, 9728);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        lqeggnwhkg("glTexParameter");
        return i13;
    }

    public static EGLSurface vdvldrhtss(EGLDisplay eGLDisplay, EGLConfig eGLConfig, Surface surface, int[] iArr) {
        EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, eGLConfig, surface, iArr, 0);
        gxszxtbevo("eglCreateWindowSurface");
        if (eGLSurfaceEglCreateWindowSurface != null) {
            return eGLSurfaceEglCreateWindowSurface;
        }
        throw new IllegalStateException("surface was null");
    }

    public static FloatBuffer wflxmlrfwp(float[] fArr) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(fArr);
        floatBufferAsFloatBuffer.position(0);
        return floatBufferAsFloatBuffer;
    }

    public static int yggfygwlhe() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        lqeggnwhkg("glGenTextures");
        return iArr[0];
    }

    public static int zdlpuopuiu() {
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        lqeggnwhkg("glGenFramebuffers");
        return iArr[0];
    }
}
