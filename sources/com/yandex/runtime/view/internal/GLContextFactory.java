package com.yandex.runtime.view.internal;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import com.yandex.runtime.graphics.GLContextVersionBinding;
import com.yandex.runtime.logging.Logger;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* JADX INFO: loaded from: classes3.dex */
public class GLContextFactory implements GLSurfaceView.EGLContextFactory {
    private static final int EGL_CONTEXT_CLIENT_VERSION = 12440;
    private static final int EGL_CONTEXT_FLAGS_KHR = 12540;
    private static final int EGL_CONTEXT_OPENGL_DEBUG_BIT_KHR = 1;
    private final boolean debugEnabled;
    private final GLVersionProvider glVersionProvider;

    public GLContextFactory(boolean z13, GLVersionProvider gLVersionProvider) {
        this.debugEnabled = z13;
        this.glVersionProvider = gLVersionProvider;
    }

    private int[] attributes(int i13, boolean z13) {
        return z13 ? new int[]{EGL_CONTEXT_CLIENT_VERSION, i13, EGL_CONTEXT_FLAGS_KHR, 1, 12344} : new int[]{EGL_CONTEXT_CLIENT_VERSION, i13, 12344};
    }

    private EGLContext tryCreateContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, boolean z13) {
        Integer depthBits = this.glVersionProvider.getDepthBits();
        if (depthBits == null) {
            Logger.info("Creating OpenGl ES context version 3, no depth buffer");
        } else {
            Logger.info("Creating OpenGl ES context version 3, depth bits " + depthBits.toString());
        }
        return egl10.eglCreateContext(eGLDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, attributes(3, z13));
    }

    @Override // android.opengl.GLSurfaceView.EGLContextFactory
    public EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
        EGLContext eGLContextTryCreateContext;
        if (this.debugEnabled) {
            Logger.warn("Trying to create debug gl context");
            eGLContextTryCreateContext = tryCreateContext(egl10, eGLDisplay, eGLConfig, true);
            if (eGLContextTryCreateContext == null || eGLContextTryCreateContext == EGL10.EGL_NO_CONTEXT) {
                Logger.warn("Could not create debug gl context; Got EGL error " + egl10.eglGetError());
            }
        } else {
            eGLContextTryCreateContext = null;
        }
        if ((eGLContextTryCreateContext == null || eGLContextTryCreateContext == EGL10.EGL_NO_CONTEXT) && ((eGLContextTryCreateContext = tryCreateContext(egl10, eGLDisplay, eGLConfig, false)) == null || eGLContextTryCreateContext == EGL10.EGL_NO_CONTEXT)) {
            throw new RuntimeException("eglCreateContext() failed; Got EGL error " + egl10.eglGetError());
        }
        EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
        egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContextTryCreateContext);
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(33308, iArr, 0);
        int i13 = iArr[0];
        Integer depthBits = this.glVersionProvider.getDepthBits();
        Logger.info("Created OpenGl ES context version 3." + String.valueOf(i13));
        GLContextVersionBinding.setDepthBits(depthBits == null ? 24 : depthBits.intValue());
        return eGLContextTryCreateContext;
    }

    @Override // android.opengl.GLSurfaceView.EGLContextFactory
    public void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
        if (egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
            return;
        }
        throw new RuntimeException("eglDestroyContext() failed; Got EGL error " + egl10.eglGetError());
    }
}
