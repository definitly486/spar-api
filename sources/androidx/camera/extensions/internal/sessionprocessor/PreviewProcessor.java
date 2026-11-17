package androidx.camera.extensions.internal.sessionprocessor;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import androidx.camera.extensions.impl.PreviewImageProcessorImpl;
import androidx.camera.extensions.impl.ProcessResultImpl;
import java.util.List;
import lereixgezr.sopmlzcsov;

/* JADX INFO: loaded from: classes.dex */
class PreviewProcessor {
    private static final String TAG = "PreviewProcessor";
    private final PreviewImageProcessorImpl mPreviewImageProcessor;
    private final btonecajqb mCaptureResultImageMatcher = new btonecajqb();
    private final Object mLock = new Object();
    private boolean mIsClosed = false;
    private boolean mIsPaused = false;

    interface OnCaptureResultCallback {
        void onCaptureResult(long j13, List<Pair<CaptureResult.Key, Object>> list);
    }

    PreviewProcessor(PreviewImageProcessorImpl previewImageProcessorImpl, Surface surface, Size size) {
        this.mPreviewImageProcessor = previewImageProcessorImpl;
        previewImageProcessorImpl.onResolutionUpdate(size);
        previewImageProcessorImpl.onOutputSurface(surface, 1);
        previewImageProcessorImpl.onImageFormatUpdate(35);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$start$0(final OnCaptureResultCallback onCaptureResultCallback, draadjrbmk draadjrbmkVar, TotalCaptureResult totalCaptureResult, int i13) {
        synchronized (this.mLock) {
            try {
                if (this.mIsClosed || this.mIsPaused) {
                    draadjrbmkVar.zoijcleaow();
                    sopmlzcsov.iobyxmoadg(TAG, "Ignore image in closed or paused state");
                    return;
                }
                try {
                    androidx.camera.extensions.internal.gtknphoqwx gtknphoqwxVar = androidx.camera.extensions.internal.gtknphoqwx.f3995iwizpuwonk;
                    if (androidx.camera.extensions.internal.eablkybsjg.wkgbmnqykc(gtknphoqwxVar) && androidx.camera.extensions.internal.gxszxtbevo.lqeggnwhkg(gtknphoqwxVar)) {
                        this.mPreviewImageProcessor.process(draadjrbmkVar.get(), totalCaptureResult, new ProcessResultImpl() { // from class: androidx.camera.extensions.internal.sessionprocessor.PreviewProcessor.1
                            public void onCaptureCompleted(long j13, List<Pair<CaptureResult.Key, Object>> list) {
                                onCaptureResultCallback.onCaptureResult(j13, list);
                            }

                            public void onCaptureProcessProgressed(int i14) {
                            }
                        }, yadqdtsiqt.iobyxmoadg.ppxfxbqfkf());
                    } else {
                        this.mPreviewImageProcessor.process(draadjrbmkVar.get(), totalCaptureResult);
                    }
                    draadjrbmkVar.zoijcleaow();
                } catch (Throwable th2) {
                    draadjrbmkVar.zoijcleaow();
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    void close() {
        synchronized (this.mLock) {
            this.mIsClosed = true;
            this.mCaptureResultImageMatcher.wkgbmnqykc();
            this.mCaptureResultImageMatcher.eablkybsjg();
        }
    }

    void notifyCaptureResult(TotalCaptureResult totalCaptureResult) {
        this.mCaptureResultImageMatcher.zoijcleaow(totalCaptureResult);
    }

    void notifyImage(draadjrbmk draadjrbmkVar) {
        this.mCaptureResultImageMatcher.lqeggnwhkg(draadjrbmkVar);
    }

    void pause() {
        synchronized (this.mLock) {
            this.mIsPaused = true;
        }
    }

    void resume() {
        synchronized (this.mLock) {
            this.mIsPaused = false;
        }
    }

    void start(final OnCaptureResultCallback onCaptureResultCallback) {
        this.mCaptureResultImageMatcher.draadjrbmk(new btonecajqb.iobyxmoadg() { // from class: androidx.camera.extensions.internal.sessionprocessor.agtfadlqog
            @Override // androidx.camera.extensions.internal.sessionprocessor.btonecajqb.iobyxmoadg
            public final void iobyxmoadg(draadjrbmk draadjrbmkVar, TotalCaptureResult totalCaptureResult, int i13) {
                this.f4031iobyxmoadg.lambda$start$0(onCaptureResultCallback, draadjrbmkVar, totalCaptureResult, i13);
            }
        });
    }
}
