package com.yandex.mapkit.mapview;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.MotionEvent;
import com.yandex.mapkit.MapKitFactory;
import com.yandex.mapkit.map.MapWindow;
import com.yandex.mapkit.map.internal.MapWindowBinding;
import com.yandex.runtime.view.PlatformGLSurfaceTextureView;

/* JADX INFO: loaded from: classes3.dex */
public class MapTexture {
    private MapWindowBinding mapWindow;
    private PlatformGLSurfaceTextureView platformGLView;

    public MapTexture(Context context) {
        this(context, false);
    }

    public MapWindow getMapWindow() {
        return this.mapWindow;
    }

    public void onStart() {
        this.platformGLView.start();
        this.platformGLView.resume();
    }

    public void onStop() {
        this.platformGLView.pause();
        this.platformGLView.stop();
    }

    public void onTextureSizeChanged(int i13, int i14) {
        this.platformGLView.onSizeChanged(i13, i14);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.platformGLView.onTouchEvent(motionEvent);
    }

    public void removeTexture() {
        this.platformGLView.onTextureDestroyed();
    }

    public void setNoninteractive(boolean z13) {
        this.platformGLView.setNoninteractive(z13);
    }

    public void setTexture(SurfaceTexture surfaceTexture, int i13, int i14) {
        this.platformGLView.setTexture(surfaceTexture, i13, i14);
    }

    public MapTexture(Context context, int i13, int i14) {
        this(context, i13, i14, false);
    }

    public MapTexture(Context context, int i13, int i14, boolean z13) {
        MapKitFactory.initialize(context);
        this.platformGLView = new PlatformGLSurfaceTextureView(context, i13, i14, z13);
        this.mapWindow = (MapWindowBinding) MapKitFactory.getInstance().createMapWindow(this.platformGLView);
    }

    public MapTexture(Context context, boolean z13) {
        MapKitFactory.initialize(context);
        this.platformGLView = new PlatformGLSurfaceTextureView(context, z13);
        this.mapWindow = (MapWindowBinding) MapKitFactory.getInstance().createMapWindow(this.platformGLView);
    }
}
