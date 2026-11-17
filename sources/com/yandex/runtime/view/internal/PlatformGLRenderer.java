package com.yandex.runtime.view.internal;

import android.graphics.Rect;
import android.opengl.GLSurfaceView;
import android.os.Process;
import com.yandex.runtime.NativeObject;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes3.dex */
public class PlatformGLRenderer implements GLSurfaceView.Renderer {
    private GLContextListener glContextListener;
    private boolean hasSurface;
    private boolean isContextLost;
    private NativeObject nativeObject;
    private Rect viewport;

    public interface GLContextListener {
        void onContextCreated();
    }

    public PlatformGLRenderer(RenderDelegate renderDelegate) {
        this(renderDelegate, null);
    }

    private static native NativeObject createNative(RenderDelegate renderDelegate);

    private native void renderImpl(boolean z13, int i13, int i14, int i15, int i16);

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        boolean z13 = this.isContextLost;
        Rect rect = this.viewport;
        renderImpl(z13, rect.left, rect.top, rect.width(), this.viewport.height());
        if (this.isContextLost) {
            this.isContextLost = false;
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i13, int i14) {
        this.viewport = new Rect(0, 0, i13, i14);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        Process.setThreadPriority(-8);
        if (this.hasSurface) {
            this.isContextLost = true;
        }
        this.hasSurface = true;
        GLContextListener gLContextListener = this.glContextListener;
        if (gLContextListener != null) {
            gLContextListener.onContextCreated();
            this.glContextListener = null;
        }
    }

    public PlatformGLRenderer(RenderDelegate renderDelegate, GLContextListener gLContextListener) {
        this.viewport = null;
        this.isContextLost = false;
        this.hasSurface = false;
        this.nativeObject = null;
        this.glContextListener = null;
        this.nativeObject = createNative(renderDelegate);
        this.glContextListener = gLContextListener;
    }
}
