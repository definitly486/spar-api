package com.yandex.runtime.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class PlatformGLSurfaceViewBelowApi34Workaround extends PlatformGLSurfaceView {
    private final BufferedRunnable mBufferedRunnable;

    public static final class BufferedRunnable {
        private final List<StampedRunnable> mBuffer = new ArrayList();
        private long mGeneration = 0;

        private final class Commit implements Runnable {
            private final long mGeneration;

            Commit(long j13) {
                this.mGeneration = j13;
            }

            @Override // java.lang.Runnable
            public void run() {
                ArrayList arrayList = new ArrayList();
                synchronized (BufferedRunnable.this.mBuffer) {
                    try {
                        Iterator it = BufferedRunnable.this.mBuffer.iterator();
                        while (it.hasNext()) {
                            StampedRunnable stampedRunnable = (StampedRunnable) it.next();
                            if (stampedRunnable.stamp > this.mGeneration) {
                                break;
                            }
                            arrayList.add(stampedRunnable);
                            it.remove();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((Runnable) it2.next()).run();
                }
            }
        }

        private static final class StampedRunnable implements Runnable {
            private final Runnable mWrapped;
            public final long stamp;

            StampedRunnable(Runnable runnable, long j13) {
                this.mWrapped = runnable;
                this.stamp = j13;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.mWrapped.run();
            }
        }

        public Runnable add(Runnable runnable) {
            long j13;
            synchronized (this.mBuffer) {
                j13 = this.mGeneration + 1;
                this.mGeneration = j13;
                this.mBuffer.add(new StampedRunnable(runnable, j13));
            }
            return new Commit(j13);
        }
    }

    public PlatformGLSurfaceViewBelowApi34Workaround(Context context) {
        this(context, null, 0, false);
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceHolder.Callback2
    public void surfaceRedrawNeededAsync(SurfaceHolder surfaceHolder, Runnable runnable) {
        super.surfaceRedrawNeededAsync(surfaceHolder, this.mBufferedRunnable.add(runnable));
    }

    public PlatformGLSurfaceViewBelowApi34Workaround(Context context, boolean z13) {
        this(context, null, 0, z13);
    }

    public PlatformGLSurfaceViewBelowApi34Workaround(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, false);
    }

    public PlatformGLSurfaceViewBelowApi34Workaround(Context context, AttributeSet attributeSet, int i13) {
        this(context, attributeSet, i13, false);
    }

    public PlatformGLSurfaceViewBelowApi34Workaround(Context context, AttributeSet attributeSet, int i13, boolean z13) {
        super(context, attributeSet, i13, z13);
        this.mBufferedRunnable = new BufferedRunnable();
    }
}
