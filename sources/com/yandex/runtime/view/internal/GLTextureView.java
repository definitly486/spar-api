package com.yandex.runtime.view.internal;

import android.graphics.SurfaceTexture;
import android.opengl.GLSurfaceView;

/* JADX INFO: loaded from: classes3.dex */
public class GLTextureView implements RenderDelegate {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private EGLConfigChooserImpl eglConfigChooser;
    private GLContextFactory glContextFactory;
    private GLRenderThread renderThread;

    public GLTextureView(boolean z13) {
        EGLConfigChooserImpl eGLConfigChooserImpl = new EGLConfigChooserImpl();
        this.eglConfigChooser = eGLConfigChooserImpl;
        this.glContextFactory = new GLContextFactory(z13, eGLConfigChooserImpl);
    }

    private boolean isInitialized() {
        return this.renderThread != null;
    }

    protected void onPause() {
        if (isInitialized()) {
            this.renderThread.onPause();
        }
    }

    protected void onResume() {
        if (isInitialized()) {
            this.renderThread.onResume();
        }
    }

    protected void onSizeChanged(int i13, int i14) {
        if (isInitialized()) {
            this.renderThread.onSizeChanged(i13, i14);
        }
    }

    public void onTextureDestroyed() {
        if (isInitialized()) {
            this.renderThread.finish();
            try {
                this.renderThread.join();
            } catch (InterruptedException unused) {
            }
            this.renderThread = null;
        }
    }

    @Override // com.yandex.runtime.view.internal.RenderDelegate
    public void requestRender() {
        if (isInitialized()) {
            this.renderThread.requestRender();
        }
    }

    @Override // com.yandex.runtime.view.internal.RenderDelegate
    public void setForceRender(boolean z13) {
        if (isInitialized()) {
            this.renderThread.setForceRender(z13);
        }
    }

    protected void setRenderer(SurfaceTexture surfaceTexture, int i13, int i14, GLSurfaceView.Renderer renderer) {
        surfaceTexture.setDefaultBufferSize(i13, i14);
        GLRenderThread gLRenderThread = new GLRenderThread(surfaceTexture, this.eglConfigChooser, this.glContextFactory, renderer);
        this.renderThread = gLRenderThread;
        gLRenderThread.onSizeChanged(i13, i14);
        this.renderThread.start();
    }
}
