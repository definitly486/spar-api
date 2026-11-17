package androidx.media3.common.util;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public final class iobyxmoadg implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private static final int[] f9829lereixgezr = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private EGLSurface f9830cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private SurfaceTexture f9831esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private EGLContext f9832iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private EGLDisplay f9833jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final int[] f9834yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Handler f9835zdlpuopuiu;

    /* JADX INFO: renamed from: androidx.media3.common.util.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public interface InterfaceC0159iobyxmoadg {
    }

    public iobyxmoadg(Handler handler) {
        this(handler, null);
    }

    private static void eablkybsjg(int[] iArr) throws GlUtil.GlException {
        GLES20.glGenTextures(1, iArr, 0);
        GlUtil.zoijcleaow();
    }

    private static EGLDisplay gxszxtbevo() throws GlUtil.GlException {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        GlUtil.ppxfxbqfkf(eGLDisplayEglGetDisplay != null, "eglGetDisplay failed");
        int[] iArr = new int[2];
        GlUtil.ppxfxbqfkf(EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1), "eglInitialize failed");
        return eGLDisplayEglGetDisplay;
    }

    private static EGLConfig iobyxmoadg(EGLDisplay eGLDisplay) throws GlUtil.GlException {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, f9829lereixgezr, 0, eGLConfigArr, 0, 1, iArr, 0);
        GlUtil.ppxfxbqfkf(zEglChooseConfig && iArr[0] > 0 && eGLConfigArr[0] != null, stevsuqkhv.iozdgvuglv("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
        return eGLConfigArr[0];
    }

    private static EGLSurface ppxfxbqfkf(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i13) throws GlUtil.GlException {
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        if (i13 == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i13 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            GlUtil.ppxfxbqfkf(eGLSurfaceEglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
        }
        GlUtil.ppxfxbqfkf(EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContext), "eglMakeCurrent failed");
        return eGLSurfaceEglCreatePbufferSurface;
    }

    private void wkgbmnqykc() {
    }

    private static EGLContext zoijcleaow(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i13) throws GlUtil.GlException {
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, i13 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        GlUtil.ppxfxbqfkf(eGLContextEglCreateContext != null, "eglCreateContext failed");
        return eGLContextEglCreateContext;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void dxjokdxxww() {
        this.f9835zdlpuopuiu.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f9831esjtqupxsv;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f9834yggfygwlhe, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.f9833jyumaefscl;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f9833jyumaefscl;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f9830cqumvgiudr;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f9833jyumaefscl, this.f9830cqumvgiudr);
            }
            EGLContext eGLContext = this.f9832iwizpuwonk;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f9833jyumaefscl, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = this.f9833jyumaefscl;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f9833jyumaefscl);
            }
            this.f9833jyumaefscl = null;
            this.f9832iwizpuwonk = null;
            this.f9830cqumvgiudr = null;
            this.f9831esjtqupxsv = null;
        }
    }

    public SurfaceTexture lqeggnwhkg() {
        return (SurfaceTexture) y2.iobyxmoadg.eablkybsjg(this.f9831esjtqupxsv);
    }

    public void nufgyqmvbu(int i13) throws GlUtil.GlException {
        EGLDisplay eGLDisplayGxszxtbevo = gxszxtbevo();
        this.f9833jyumaefscl = eGLDisplayGxszxtbevo;
        EGLConfig eGLConfigIobyxmoadg = iobyxmoadg(eGLDisplayGxszxtbevo);
        EGLContext eGLContextZoijcleaow = zoijcleaow(this.f9833jyumaefscl, eGLConfigIobyxmoadg, i13);
        this.f9832iwizpuwonk = eGLContextZoijcleaow;
        this.f9830cqumvgiudr = ppxfxbqfkf(this.f9833jyumaefscl, eGLConfigIobyxmoadg, eGLContextZoijcleaow, i13);
        eablkybsjg(this.f9834yggfygwlhe);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f9834yggfygwlhe[0]);
        this.f9831esjtqupxsv = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f9835zdlpuopuiu.post(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        wkgbmnqykc();
        SurfaceTexture surfaceTexture = this.f9831esjtqupxsv;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }

    public iobyxmoadg(Handler handler, InterfaceC0159iobyxmoadg interfaceC0159iobyxmoadg) {
        this.f9835zdlpuopuiu = handler;
        this.f9834yggfygwlhe = new int[1];
    }
}
