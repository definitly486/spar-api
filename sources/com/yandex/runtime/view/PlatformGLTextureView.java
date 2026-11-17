package com.yandex.runtime.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public class PlatformGLTextureView extends PlatformGLSurfaceTextureView implements TextureView.SurfaceTextureListener {
    private TextureViewImpl textureView;

    private class TextureViewImpl extends TextureView {
        TextureViewImpl(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            setSurfaceTextureListener(PlatformGLTextureView.this);
        }

        @Override // android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            if (PlatformGLTextureView.this.onTouchEvent(motionEvent)) {
                return true;
            }
            return super.dispatchTouchEvent(motionEvent);
        }

        @Override // android.view.TextureView, android.view.View
        public void onSizeChanged(int i13, int i14, int i15, int i16) {
            super.onSizeChanged(i13, i14, i15, i16);
            PlatformGLTextureView.this.onSizeChanged(i13, i14);
        }
    }

    public PlatformGLTextureView(Context context) {
        this(context, null, 0, false);
    }

    public Bitmap getBitmap() {
        return this.textureView.getBitmap();
    }

    @Override // com.yandex.runtime.view.PlatformGLSurfaceTextureView, com.yandex.runtime.view.PlatformView
    public View getView() {
        return this.textureView;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i13, int i14) {
        setTexture(surfaceTexture, i13, i14);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        onTextureDestroyed();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i13, int i14) {
        onSizeChanged(i13, i14);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public PlatformGLTextureView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, false);
    }

    public PlatformGLTextureView(Context context, boolean z13) {
        this(context, null, 0, z13);
    }

    public PlatformGLTextureView(Context context, AttributeSet attributeSet, int i13) {
        this(context, attributeSet, i13, false);
    }

    public PlatformGLTextureView(Context context, AttributeSet attributeSet, int i13, boolean z13) {
        super(context, z13);
        this.textureView = new TextureViewImpl(context, attributeSet);
    }
}
