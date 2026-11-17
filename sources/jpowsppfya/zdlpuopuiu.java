package jpowsppfya;

import android.graphics.Bitmap;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import lereixgezr.sopmlzcsov;

/* JADX INFO: loaded from: classes.dex */
public class zdlpuopuiu {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    protected Surface f52051dxjokdxxww;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    protected EGLConfig f52056lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    protected Thread f52058ppxfxbqfkf;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    protected final AtomicBoolean f52055iobyxmoadg = new AtomicBoolean(false);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    protected final Map f52061zoijcleaow = new HashMap();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    protected EGLDisplay f52060wkgbmnqykc = EGL14.EGL_NO_DISPLAY;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    protected EGLContext f52052eablkybsjg = EGL14.EGL_NO_CONTEXT;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    protected int[] f52054gxszxtbevo = cllcsxoeiz.wkgbmnqykc.f20035iobyxmoadg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    protected EGLSurface f52057nufgyqmvbu = EGL14.EGL_NO_SURFACE;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    protected Map f52049btonecajqb = Collections.emptyMap();

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    protected cllcsxoeiz.wkgbmnqykc.gxszxtbevo f52053gtknphoqwx = null;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    protected cllcsxoeiz.wkgbmnqykc.eablkybsjg f52050draadjrbmk = cllcsxoeiz.wkgbmnqykc.eablkybsjg.UNKNOWN;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private int f52059wflxmlrfwp = -1;

    private void draadjrbmk() {
        Iterator it = this.f52049btonecajqb.values().iterator();
        while (it.hasNext()) {
            ((cllcsxoeiz.wkgbmnqykc.gxszxtbevo) it.next()).zoijcleaow();
        }
        this.f52049btonecajqb = Collections.emptyMap();
        this.f52053gtknphoqwx = null;
        if (!Objects.equals(this.f52060wkgbmnqykc, EGL14.EGL_NO_DISPLAY)) {
            EGLDisplay eGLDisplay = this.f52060wkgbmnqykc;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            for (cllcsxoeiz.lqeggnwhkg lqeggnwhkgVar : this.f52061zoijcleaow.values()) {
                if (!Objects.equals(lqeggnwhkgVar.iobyxmoadg(), EGL14.EGL_NO_SURFACE) && !EGL14.eglDestroySurface(this.f52060wkgbmnqykc, lqeggnwhkgVar.iobyxmoadg())) {
                    cllcsxoeiz.wkgbmnqykc.eablkybsjg("eglDestroySurface");
                }
            }
            this.f52061zoijcleaow.clear();
            if (!Objects.equals(this.f52057nufgyqmvbu, EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f52060wkgbmnqykc, this.f52057nufgyqmvbu);
                this.f52057nufgyqmvbu = EGL14.EGL_NO_SURFACE;
            }
            if (!Objects.equals(this.f52052eablkybsjg, EGL14.EGL_NO_CONTEXT)) {
                EGL14.eglDestroyContext(this.f52060wkgbmnqykc, this.f52052eablkybsjg);
                this.f52052eablkybsjg = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f52060wkgbmnqykc);
            this.f52060wkgbmnqykc = EGL14.EGL_NO_DISPLAY;
        }
        this.f52056lqeggnwhkg = null;
        this.f52059wflxmlrfwp = -1;
        this.f52050draadjrbmk = cllcsxoeiz.wkgbmnqykc.eablkybsjg.UNKNOWN;
        this.f52051dxjokdxxww = null;
        this.f52058ppxfxbqfkf = null;
    }

    private u1.ppxfxbqfkf eablkybsjg(lereixgezr.iwizpuwonk iwizpuwonkVar) {
        cllcsxoeiz.wkgbmnqykc.dxjokdxxww(this.f52055iobyxmoadg, false);
        try {
            zoijcleaow(iwizpuwonkVar, null);
            wkgbmnqykc();
            dxjokdxxww(this.f52057nufgyqmvbu);
            String strGlGetString = GLES20.glGetString(7939);
            String strEglQueryString = EGL14.eglQueryString(this.f52060wkgbmnqykc, 12373);
            if (strGlGetString == null) {
                strGlGetString = "";
            }
            if (strEglQueryString == null) {
                strEglQueryString = "";
            }
            return new u1.ppxfxbqfkf(strGlGetString, strEglQueryString);
        } catch (IllegalStateException e13) {
            sopmlzcsov.wflxmlrfwp("OpenGlRenderer", "Failed to get GL or EGL extensions: " + e13.getMessage(), e13);
            return new u1.ppxfxbqfkf("", "");
        } finally {
            draadjrbmk();
        }
    }

    private void iobyxmoadg(int i13) {
        GLES20.glActiveTexture(33984);
        cllcsxoeiz.wkgbmnqykc.lqeggnwhkg("glActiveTexture");
        GLES20.glBindTexture(36197, i13);
        cllcsxoeiz.wkgbmnqykc.lqeggnwhkg("glBindTexture");
    }

    private void vdvldrhtss(ByteBuffer byteBuffer, Size size, float[] fArr) {
        u1.nufgyqmvbu.zoijcleaow(byteBuffer.capacity() == (size.getWidth() * size.getHeight()) * 4, "ByteBuffer capacity is not equal to width * height * 4.");
        u1.nufgyqmvbu.zoijcleaow(byteBuffer.isDirect(), "ByteBuffer is not direct.");
        int iYggfygwlhe = cllcsxoeiz.wkgbmnqykc.yggfygwlhe();
        GLES20.glActiveTexture(33985);
        cllcsxoeiz.wkgbmnqykc.lqeggnwhkg("glActiveTexture");
        GLES20.glBindTexture(3553, iYggfygwlhe);
        cllcsxoeiz.wkgbmnqykc.lqeggnwhkg("glBindTexture");
        GLES20.glTexImage2D(3553, 0, 6407, size.getWidth(), size.getHeight(), 0, 6407, 5121, null);
        cllcsxoeiz.wkgbmnqykc.lqeggnwhkg("glTexImage2D");
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        int iZdlpuopuiu = cllcsxoeiz.wkgbmnqykc.zdlpuopuiu();
        GLES20.glBindFramebuffer(36160, iZdlpuopuiu);
        cllcsxoeiz.wkgbmnqykc.lqeggnwhkg("glBindFramebuffer");
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, iYggfygwlhe, 0);
        cllcsxoeiz.wkgbmnqykc.lqeggnwhkg("glFramebufferTexture2D");
        GLES20.glActiveTexture(33984);
        cllcsxoeiz.wkgbmnqykc.lqeggnwhkg("glActiveTexture");
        GLES20.glBindTexture(36197, this.f52059wflxmlrfwp);
        cllcsxoeiz.wkgbmnqykc.lqeggnwhkg("glBindTexture");
        this.f52051dxjokdxxww = null;
        GLES20.glViewport(0, 0, size.getWidth(), size.getHeight());
        GLES20.glScissor(0, 0, size.getWidth(), size.getHeight());
        cllcsxoeiz.wkgbmnqykc.gxszxtbevo gxszxtbevoVar = (cllcsxoeiz.wkgbmnqykc.gxszxtbevo) u1.nufgyqmvbu.gxszxtbevo(this.f52053gtknphoqwx);
        if (gxszxtbevoVar instanceof cllcsxoeiz.wkgbmnqykc.lqeggnwhkg) {
            ((cllcsxoeiz.wkgbmnqykc.lqeggnwhkg) gxszxtbevoVar).nufgyqmvbu(fArr);
        }
        GLES20.glDrawArrays(5, 0, 4);
        cllcsxoeiz.wkgbmnqykc.lqeggnwhkg("glDrawArrays");
        GLES20.glReadPixels(0, 0, size.getWidth(), size.getHeight(), 6408, 5121, byteBuffer);
        cllcsxoeiz.wkgbmnqykc.lqeggnwhkg("glReadPixels");
        GLES20.glBindFramebuffer(36160, 0);
        cllcsxoeiz.wkgbmnqykc.kcexrzcfyt(iYggfygwlhe);
        cllcsxoeiz.wkgbmnqykc.oxmwwwfdhm(iZdlpuopuiu);
        iobyxmoadg(this.f52059wflxmlrfwp);
    }

    private void wkgbmnqykc() {
        EGLDisplay eGLDisplay = this.f52060wkgbmnqykc;
        EGLConfig eGLConfig = this.f52056lqeggnwhkg;
        Objects.requireNonNull(eGLConfig);
        this.f52057nufgyqmvbu = cllcsxoeiz.wkgbmnqykc.agtfadlqog(eGLDisplay, eGLConfig, 1, 1);
    }

    private void zoijcleaow(lereixgezr.iwizpuwonk iwizpuwonkVar, cllcsxoeiz.eablkybsjg.iobyxmoadg iobyxmoadgVar) {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.f52060wkgbmnqykc = eGLDisplayEglGetDisplay;
        if (Objects.equals(eGLDisplayEglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            throw new IllegalStateException("Unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(this.f52060wkgbmnqykc, iArr, 0, iArr, 1)) {
            this.f52060wkgbmnqykc = EGL14.EGL_NO_DISPLAY;
            throw new IllegalStateException("Unable to initialize EGL14");
        }
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.ppxfxbqfkf(iArr[0] + "." + iArr[1]);
        }
        int i13 = iwizpuwonkVar.wkgbmnqykc() ? 10 : 8;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig(this.f52060wkgbmnqykc, new int[]{12324, i13, 12323, i13, 12322, i13, 12321, iwizpuwonkVar.wkgbmnqykc() ? 2 : 8, 12325, 0, 12326, 0, 12352, iwizpuwonkVar.wkgbmnqykc() ? 64 : 4, 12610, iwizpuwonkVar.wkgbmnqykc() ? -1 : 1, 12339, 5, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            throw new IllegalStateException("Unable to find a suitable EGLConfig");
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.f52060wkgbmnqykc, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, iwizpuwonkVar.wkgbmnqykc() ? 3 : 2, 12344}, 0);
        cllcsxoeiz.wkgbmnqykc.gxszxtbevo("eglCreateContext");
        this.f52056lqeggnwhkg = eGLConfig;
        this.f52052eablkybsjg = eGLContextEglCreateContext;
        int[] iArr2 = new int[1];
        EGL14.eglQueryContext(this.f52060wkgbmnqykc, eGLContextEglCreateContext, 12440, iArr2, 0);
        Log.d("OpenGlRenderer", "EGLContext created, client version " + iArr2[0]);
    }

    public void agtfadlqog(long j13, float[] fArr, Surface surface) {
        cllcsxoeiz.wkgbmnqykc.dxjokdxxww(this.f52055iobyxmoadg, true);
        cllcsxoeiz.wkgbmnqykc.nufgyqmvbu(this.f52058ppxfxbqfkf);
        cllcsxoeiz.lqeggnwhkg lqeggnwhkgVarGxszxtbevo = gxszxtbevo(surface);
        if (lqeggnwhkgVarGxszxtbevo == cllcsxoeiz.wkgbmnqykc.f20030draadjrbmk) {
            lqeggnwhkgVarGxszxtbevo = ppxfxbqfkf(surface);
            if (lqeggnwhkgVarGxszxtbevo == null) {
                return;
            } else {
                this.f52061zoijcleaow.put(surface, lqeggnwhkgVarGxszxtbevo);
            }
        }
        if (surface != this.f52051dxjokdxxww) {
            dxjokdxxww(lqeggnwhkgVarGxszxtbevo.iobyxmoadg());
            this.f52051dxjokdxxww = surface;
            GLES20.glViewport(0, 0, lqeggnwhkgVarGxszxtbevo.ppxfxbqfkf(), lqeggnwhkgVarGxszxtbevo.zoijcleaow());
            GLES20.glScissor(0, 0, lqeggnwhkgVarGxszxtbevo.ppxfxbqfkf(), lqeggnwhkgVarGxszxtbevo.zoijcleaow());
        }
        cllcsxoeiz.wkgbmnqykc.gxszxtbevo gxszxtbevoVar = (cllcsxoeiz.wkgbmnqykc.gxszxtbevo) u1.nufgyqmvbu.gxszxtbevo(this.f52053gtknphoqwx);
        if (gxszxtbevoVar instanceof cllcsxoeiz.wkgbmnqykc.lqeggnwhkg) {
            ((cllcsxoeiz.wkgbmnqykc.lqeggnwhkg) gxszxtbevoVar).nufgyqmvbu(fArr);
        }
        GLES20.glDrawArrays(5, 0, 4);
        cllcsxoeiz.wkgbmnqykc.lqeggnwhkg("glDrawArrays");
        EGLExt.eglPresentationTimeANDROID(this.f52060wkgbmnqykc, lqeggnwhkgVarGxszxtbevo.iobyxmoadg(), j13);
        if (EGL14.eglSwapBuffers(this.f52060wkgbmnqykc, lqeggnwhkgVarGxszxtbevo.iobyxmoadg())) {
            return;
        }
        sopmlzcsov.draadjrbmk("OpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
        wflxmlrfwp(surface, false);
    }

    public void btonecajqb(Surface surface) {
        cllcsxoeiz.wkgbmnqykc.dxjokdxxww(this.f52055iobyxmoadg, true);
        cllcsxoeiz.wkgbmnqykc.nufgyqmvbu(this.f52058ppxfxbqfkf);
        if (this.f52061zoijcleaow.containsKey(surface)) {
            return;
        }
        this.f52061zoijcleaow.put(surface, cllcsxoeiz.wkgbmnqykc.f20030draadjrbmk);
    }

    protected void dxjokdxxww(EGLSurface eGLSurface) {
        u1.nufgyqmvbu.gxszxtbevo(this.f52060wkgbmnqykc);
        u1.nufgyqmvbu.gxszxtbevo(this.f52052eablkybsjg);
        if (!EGL14.eglMakeCurrent(this.f52060wkgbmnqykc, eGLSurface, eGLSurface, this.f52052eablkybsjg)) {
            throw new IllegalStateException("eglMakeCurrent failed");
        }
    }

    public void gtknphoqwx() {
        if (this.f52055iobyxmoadg.getAndSet(false)) {
            cllcsxoeiz.wkgbmnqykc.nufgyqmvbu(this.f52058ppxfxbqfkf);
            draadjrbmk();
        }
    }

    protected cllcsxoeiz.lqeggnwhkg gxszxtbevo(Surface surface) {
        u1.nufgyqmvbu.dxjokdxxww(this.f52061zoijcleaow.containsKey(surface), "The surface is not registered.");
        cllcsxoeiz.lqeggnwhkg lqeggnwhkgVar = (cllcsxoeiz.lqeggnwhkg) this.f52061zoijcleaow.get(surface);
        Objects.requireNonNull(lqeggnwhkgVar);
        return lqeggnwhkgVar;
    }

    protected void kcexrzcfyt(int i13) {
        cllcsxoeiz.wkgbmnqykc.gxszxtbevo gxszxtbevoVar = (cllcsxoeiz.wkgbmnqykc.gxszxtbevo) this.f52049btonecajqb.get(this.f52050draadjrbmk);
        if (gxszxtbevoVar == null) {
            throw new IllegalStateException("Unable to configure program for input format: " + this.f52050draadjrbmk);
        }
        if (this.f52053gtknphoqwx != gxszxtbevoVar) {
            this.f52053gtknphoqwx = gxszxtbevoVar;
            gxszxtbevoVar.gxszxtbevo();
            Log.d("OpenGlRenderer", "Using program for input format " + this.f52050draadjrbmk + ": " + this.f52053gtknphoqwx);
        }
        iobyxmoadg(i13);
    }

    public int lqeggnwhkg() {
        cllcsxoeiz.wkgbmnqykc.dxjokdxxww(this.f52055iobyxmoadg, true);
        cllcsxoeiz.wkgbmnqykc.nufgyqmvbu(this.f52058ppxfxbqfkf);
        return this.f52059wflxmlrfwp;
    }

    public cllcsxoeiz.eablkybsjg nufgyqmvbu(lereixgezr.iwizpuwonk iwizpuwonkVar, Map map) throws Throwable {
        cllcsxoeiz.wkgbmnqykc.dxjokdxxww(this.f52055iobyxmoadg, false);
        cllcsxoeiz.eablkybsjg.iobyxmoadg iobyxmoadgVarIobyxmoadg = cllcsxoeiz.eablkybsjg.iobyxmoadg();
        try {
            if (iwizpuwonkVar.wkgbmnqykc()) {
                u1.ppxfxbqfkf ppxfxbqfkfVarEablkybsjg = eablkybsjg(iwizpuwonkVar);
                String str = (String) u1.nufgyqmvbu.gxszxtbevo((String) ppxfxbqfkfVarEablkybsjg.f112467iobyxmoadg);
                String str2 = (String) u1.nufgyqmvbu.gxszxtbevo((String) ppxfxbqfkfVarEablkybsjg.f112468zoijcleaow);
                if (!str.contains("GL_EXT_YUV_target")) {
                    sopmlzcsov.draadjrbmk("OpenGlRenderer", "Device does not support GL_EXT_YUV_target. Fallback to SDR.");
                    iwizpuwonkVar = lereixgezr.iwizpuwonk.f62292wkgbmnqykc;
                }
                this.f52054gxszxtbevo = cllcsxoeiz.wkgbmnqykc.gtknphoqwx(str2, iwizpuwonkVar);
                iobyxmoadgVarIobyxmoadg.wkgbmnqykc(str);
                iobyxmoadgVarIobyxmoadg.zoijcleaow(str2);
            }
            zoijcleaow(iwizpuwonkVar, iobyxmoadgVarIobyxmoadg);
            wkgbmnqykc();
            dxjokdxxww(this.f52057nufgyqmvbu);
            iobyxmoadgVarIobyxmoadg.eablkybsjg(cllcsxoeiz.wkgbmnqykc.iwizpuwonk());
            this.f52049btonecajqb = cllcsxoeiz.wkgbmnqykc.ojitshcjhn(iwizpuwonkVar, map);
            int iRgvfuqvkyq = cllcsxoeiz.wkgbmnqykc.rgvfuqvkyq();
            this.f52059wflxmlrfwp = iRgvfuqvkyq;
            kcexrzcfyt(iRgvfuqvkyq);
            this.f52058ppxfxbqfkf = Thread.currentThread();
            this.f52055iobyxmoadg.set(true);
            return iobyxmoadgVarIobyxmoadg.iobyxmoadg();
        } catch (IllegalArgumentException e13) {
            e = e13;
            draadjrbmk();
            throw e;
        } catch (IllegalStateException e14) {
            e = e14;
            draadjrbmk();
            throw e;
        }
    }

    public void ojitshcjhn(cllcsxoeiz.wkgbmnqykc.eablkybsjg eablkybsjgVar) {
        cllcsxoeiz.wkgbmnqykc.dxjokdxxww(this.f52055iobyxmoadg, true);
        cllcsxoeiz.wkgbmnqykc.nufgyqmvbu(this.f52058ppxfxbqfkf);
        if (this.f52050draadjrbmk != eablkybsjgVar) {
            this.f52050draadjrbmk = eablkybsjgVar;
            kcexrzcfyt(this.f52059wflxmlrfwp);
        }
    }

    public void oxmwwwfdhm(Surface surface) {
        cllcsxoeiz.wkgbmnqykc.dxjokdxxww(this.f52055iobyxmoadg, true);
        cllcsxoeiz.wkgbmnqykc.nufgyqmvbu(this.f52058ppxfxbqfkf);
        wflxmlrfwp(surface, true);
    }

    protected cllcsxoeiz.lqeggnwhkg ppxfxbqfkf(Surface surface) {
        try {
            EGLDisplay eGLDisplay = this.f52060wkgbmnqykc;
            EGLConfig eGLConfig = this.f52056lqeggnwhkg;
            Objects.requireNonNull(eGLConfig);
            EGLSurface eGLSurfaceVdvldrhtss = cllcsxoeiz.wkgbmnqykc.vdvldrhtss(eGLDisplay, eGLConfig, surface, this.f52054gxszxtbevo);
            Size sizeCqumvgiudr = cllcsxoeiz.wkgbmnqykc.cqumvgiudr(this.f52060wkgbmnqykc, eGLSurfaceVdvldrhtss);
            return cllcsxoeiz.lqeggnwhkg.wkgbmnqykc(eGLSurfaceVdvldrhtss, sizeCqumvgiudr.getWidth(), sizeCqumvgiudr.getHeight());
        } catch (IllegalArgumentException | IllegalStateException e13) {
            sopmlzcsov.wflxmlrfwp("OpenGlRenderer", "Failed to create EGL surface: " + e13.getMessage(), e13);
            return null;
        }
    }

    public Bitmap rgvfuqvkyq(Size size, float[] fArr) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(size.getWidth() * size.getHeight() * 4);
        vdvldrhtss(byteBufferAllocateDirect, size, fArr);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), Bitmap.Config.ARGB_8888);
        byteBufferAllocateDirect.rewind();
        ImageProcessingUtil.btonecajqb(bitmapCreateBitmap, byteBufferAllocateDirect, size.getWidth() * 4);
        return bitmapCreateBitmap;
    }

    protected void wflxmlrfwp(Surface surface, boolean z13) {
        if (this.f52051dxjokdxxww == surface) {
            this.f52051dxjokdxxww = null;
            dxjokdxxww(this.f52057nufgyqmvbu);
        }
        cllcsxoeiz.lqeggnwhkg lqeggnwhkgVar = z13 ? (cllcsxoeiz.lqeggnwhkg) this.f52061zoijcleaow.remove(surface) : (cllcsxoeiz.lqeggnwhkg) this.f52061zoijcleaow.put(surface, cllcsxoeiz.wkgbmnqykc.f20030draadjrbmk);
        if (lqeggnwhkgVar == null || lqeggnwhkgVar == cllcsxoeiz.wkgbmnqykc.f20030draadjrbmk) {
            return;
        }
        try {
            EGL14.eglDestroySurface(this.f52060wkgbmnqykc, lqeggnwhkgVar.iobyxmoadg());
        } catch (RuntimeException e13) {
            sopmlzcsov.wflxmlrfwp("OpenGlRenderer", "Failed to destroy EGL surface: " + e13.getMessage(), e13);
        }
    }
}
