package com.yandex.runtime;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
public final class NativeObject {
    private boolean canBeDeletedInBackground;
    private long nativeObject;

    private static final class Cleaner implements Runnable {
        private final long nativeObject;

        public Cleaner(long j13) {
            this.nativeObject = j13;
        }

        @Override // java.lang.Runnable
        public void run() {
            NativeObject.deleteNative(this.nativeObject);
        }
    }

    public NativeObject(long j13, boolean z13) {
        this.nativeObject = j13;
        this.canBeDeletedInBackground = z13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void deleteNative(long j13);

    public void finalize() throws Throwable {
        if (isEmpty()) {
            return;
        }
        if (this.canBeDeletedInBackground) {
            deleteNative(this.nativeObject);
        } else {
            new Handler(Looper.getMainLooper()).post(new Cleaner(this.nativeObject));
        }
        this.nativeObject = 0L;
    }

    public boolean isEmpty() {
        return this.nativeObject == 0;
    }

    public long release() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot release native object outside the UI thread");
        }
        long j13 = this.nativeObject;
        this.nativeObject = 0L;
        return j13;
    }

    public void reset() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot reset native object outside the UI thread");
        }
        deleteNative(this.nativeObject);
        this.nativeObject = 0L;
    }
}
