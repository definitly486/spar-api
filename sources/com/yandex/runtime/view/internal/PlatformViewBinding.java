package com.yandex.runtime.view.internal;

import android.view.MotionEvent;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.internal.ArchiveWriter;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class PlatformViewBinding {
    private static final String LOG_TAG = "PlatformViewBinding";
    private NativeObject nativeObject;
    private boolean noninteractive = false;
    private ArchiveWriter touchEventWriter = new ArchiveWriter();

    public PlatformViewBinding(PlatformGLRenderer platformGLRenderer, int i13, int i14) {
        this.nativeObject = createGLNative(platformGLRenderer, i13, i14);
    }

    private static native NativeObject createGLNative(PlatformGLRenderer platformGLRenderer, int i13, int i14);

    private static native NativeObject createVulkanNative(PlatformVulkanRenderer platformVulkanRenderer, int i13, int i14);

    private native void onSerializedTouchEventNative(ByteBuffer byteBuffer, int i13);

    public void destroyNative() {
        this.nativeObject.reset();
    }

    public NativeObject getNative() {
        return this.nativeObject;
    }

    public native void onContextCreated();

    public native void onMemoryWarning();

    public native void onPause();

    public native void onResume();

    public native void onSizeChanged(int i13, int i14);

    public native void onStart(int i13, int i14);

    public native void onStop();

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.noninteractive || !TouchEvent.isTouchEvent(motionEvent) || this.nativeObject.isEmpty()) {
            return false;
        }
        TouchEvent.serialize(motionEvent, this.touchEventWriter);
        ByteBuffer byteBufferData = this.touchEventWriter.data();
        onSerializedTouchEventNative(byteBufferData, byteBufferData.position());
        byteBufferData.clear();
        return true;
    }

    public native void requestRenderNative();

    public void setNoninteractive(boolean z13) {
        this.noninteractive = z13;
    }

    public PlatformViewBinding(PlatformVulkanRenderer platformVulkanRenderer, int i13, int i14) {
        this.nativeObject = createVulkanNative(platformVulkanRenderer, i13, i14);
    }
}
