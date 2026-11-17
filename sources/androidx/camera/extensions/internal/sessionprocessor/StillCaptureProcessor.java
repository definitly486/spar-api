package androidx.camera.extensions.internal.sessionprocessor;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import androidx.camera.extensions.impl.CaptureProcessorImpl;
import androidx.camera.extensions.impl.ProcessResultImpl;
import istkbnxepw.jlmebxxoox;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import lereixgezr.sopmlzcsov;

/* JADX INFO: loaded from: classes.dex */
class StillCaptureProcessor {
    private static final String TAG = "StillCaptureProcessor";
    private static final long UNSPECIFIED_TIMESTAMP = -1;
    kegysxyocb.ppxfxbqfkf mCaptureOutputSurface;
    final CaptureProcessorImpl mCaptureProcessorImpl;
    private boolean mIsPostviewConfigured;
    final btonecajqb mCaptureResultImageMatcher = new btonecajqb();
    final Object mLock = new Object();
    HashMap<Integer, Pair<draadjrbmk, TotalCaptureResult>> mCaptureResults = new HashMap<>();
    OnCaptureResultCallback mOnCaptureResultCallback = null;
    TotalCaptureResult mSourceCaptureResult = null;
    boolean mIsClosed = false;
    long mTimeStampForOutputImage = -1;

    interface OnCaptureResultCallback {
        void onCaptureCompleted(long j13, List<Pair<CaptureResult.Key, Object>> list);

        void onCaptureProcessProgressed(int i13);

        void onError(Exception exc);

        void onProcessCompleted();
    }

    StillCaptureProcessor(CaptureProcessorImpl captureProcessorImpl, Surface surface, Size size, jlmebxxoox jlmebxxooxVar, boolean z13) {
        this.mCaptureProcessorImpl = captureProcessorImpl;
        kegysxyocb.ppxfxbqfkf ppxfxbqfkfVar = new kegysxyocb.ppxfxbqfkf(surface, size, z13);
        this.mCaptureOutputSurface = ppxfxbqfkfVar;
        captureProcessorImpl.onOutputSurface(ppxfxbqfkfVar.ppxfxbqfkf(), 35);
        captureProcessorImpl.onImageFormatUpdate(35);
        this.mIsPostviewConfigured = jlmebxxooxVar != null;
        if (jlmebxxooxVar != null) {
            androidx.camera.extensions.internal.gtknphoqwx gtknphoqwxVar = androidx.camera.extensions.internal.gtknphoqwx.f3993cqumvgiudr;
            if (androidx.camera.extensions.internal.eablkybsjg.wkgbmnqykc(gtknphoqwxVar) && androidx.camera.extensions.internal.gxszxtbevo.lqeggnwhkg(gtknphoqwxVar)) {
                u1.nufgyqmvbu.iobyxmoadg(jlmebxxooxVar.zoijcleaow() == 35);
                captureProcessorImpl.onResolutionUpdate(size, jlmebxxooxVar.ppxfxbqfkf());
                captureProcessorImpl.onPostviewOutputSurface(jlmebxxooxVar.wkgbmnqykc());
                return;
            }
        }
        captureProcessorImpl.onResolutionUpdate(size);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$process$1(boolean z13, HashMap map, final OnCaptureResultCallback onCaptureResultCallback) {
        synchronized (this.mLock) {
            try {
                try {
                    try {
                        if (this.mIsClosed) {
                            sopmlzcsov.iobyxmoadg(TAG, "Ignore process() in closed state.");
                            sopmlzcsov.iobyxmoadg(TAG, "CaptureProcessorImpl.process() finish");
                            OnCaptureResultCallback onCaptureResultCallback2 = this.mOnCaptureResultCallback;
                            if (onCaptureResultCallback2 != null) {
                                onCaptureResultCallback2.onProcessCompleted();
                                this.mOnCaptureResultCallback = null;
                            }
                            clearCaptureResults();
                            return;
                        }
                        sopmlzcsov.iobyxmoadg(TAG, "CaptureProcessorImpl.process() begin");
                        androidx.camera.extensions.internal.gtknphoqwx gtknphoqwxVar = androidx.camera.extensions.internal.gtknphoqwx.f3993cqumvgiudr;
                        if (androidx.camera.extensions.internal.gxszxtbevo.lqeggnwhkg(gtknphoqwxVar) && androidx.camera.extensions.internal.eablkybsjg.wkgbmnqykc(gtknphoqwxVar) && z13 && this.mIsPostviewConfigured) {
                            this.mCaptureProcessorImpl.processWithPostview(map, new ProcessResultImpl() { // from class: androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor.1
                                public void onCaptureCompleted(long j13, List<Pair<CaptureResult.Key, Object>> list) {
                                    onCaptureResultCallback.onCaptureCompleted(j13, list);
                                }

                                public void onCaptureProcessProgressed(int i13) {
                                    onCaptureResultCallback.onCaptureProcessProgressed(i13);
                                }
                            }, yadqdtsiqt.iobyxmoadg.iobyxmoadg());
                        } else {
                            androidx.camera.extensions.internal.gtknphoqwx gtknphoqwxVar2 = androidx.camera.extensions.internal.gtknphoqwx.f3995iwizpuwonk;
                            if (androidx.camera.extensions.internal.gxszxtbevo.lqeggnwhkg(gtknphoqwxVar2) && androidx.camera.extensions.internal.eablkybsjg.wkgbmnqykc(gtknphoqwxVar2)) {
                                this.mCaptureProcessorImpl.process(map, new ProcessResultImpl() { // from class: androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor.2
                                    public void onCaptureCompleted(long j13, List<Pair<CaptureResult.Key, Object>> list) {
                                        onCaptureResultCallback.onCaptureCompleted(j13, list);
                                    }

                                    public void onCaptureProcessProgressed(int i13) {
                                        onCaptureResultCallback.onCaptureProcessProgressed(i13);
                                    }
                                }, yadqdtsiqt.iobyxmoadg.iobyxmoadg());
                            } else {
                                this.mCaptureProcessorImpl.process(map);
                            }
                        }
                        sopmlzcsov.iobyxmoadg(TAG, "CaptureProcessorImpl.process() finish");
                        OnCaptureResultCallback onCaptureResultCallback3 = this.mOnCaptureResultCallback;
                        if (onCaptureResultCallback3 != null) {
                            onCaptureResultCallback3.onProcessCompleted();
                            this.mOnCaptureResultCallback = null;
                        }
                        clearCaptureResults();
                    } catch (Exception e13) {
                        sopmlzcsov.wkgbmnqykc(TAG, "mCaptureProcessorImpl.process exception ", e13);
                        this.mOnCaptureResultCallback = null;
                        if (onCaptureResultCallback != null) {
                            onCaptureResultCallback.onError(e13);
                        }
                        sopmlzcsov.iobyxmoadg(TAG, "CaptureProcessorImpl.process() finish");
                        OnCaptureResultCallback onCaptureResultCallback4 = this.mOnCaptureResultCallback;
                        if (onCaptureResultCallback4 != null) {
                            onCaptureResultCallback4.onProcessCompleted();
                            this.mOnCaptureResultCallback = null;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            } catch (Throwable th3) {
                sopmlzcsov.iobyxmoadg(TAG, "CaptureProcessorImpl.process() finish");
                OnCaptureResultCallback onCaptureResultCallback5 = this.mOnCaptureResultCallback;
                if (onCaptureResultCallback5 != null) {
                    onCaptureResultCallback5.onProcessCompleted();
                    this.mOnCaptureResultCallback = null;
                }
                clearCaptureResults();
                throw th3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startCapture$0(List list, OnCaptureResultCallback onCaptureResultCallback, boolean z13, draadjrbmk draadjrbmkVar, TotalCaptureResult totalCaptureResult, int i13) {
        synchronized (this.mLock) {
            try {
                if (this.mIsClosed) {
                    draadjrbmkVar.zoijcleaow();
                    sopmlzcsov.iobyxmoadg(TAG, "Ignore image in closed state");
                    return;
                }
                sopmlzcsov.iobyxmoadg(TAG, "onImageReferenceIncoming  captureStageId=" + i13);
                this.mCaptureResults.put(Integer.valueOf(i13), new Pair<>(draadjrbmkVar, totalCaptureResult));
                sopmlzcsov.iobyxmoadg(TAG, "mCaptureResult has capture stage Id: " + this.mCaptureResults.keySet());
                if (this.mCaptureResults.keySet().containsAll(list)) {
                    process(this.mCaptureResults, onCaptureResultCallback, z13);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void clearCaptureResults() {
        synchronized (this.mLock) {
            try {
                Iterator<Pair<draadjrbmk, TotalCaptureResult>> it = this.mCaptureResults.values().iterator();
                while (it.hasNext()) {
                    ((draadjrbmk) it.next().first).zoijcleaow();
                }
                this.mCaptureResults.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void close() {
        synchronized (this.mLock) {
            sopmlzcsov.iobyxmoadg(TAG, "Close the StillCaptureProcessor");
            this.mIsClosed = true;
            clearCaptureResults();
            this.mCaptureResultImageMatcher.eablkybsjg();
            this.mCaptureResultImageMatcher.wkgbmnqykc();
            this.mCaptureOutputSurface.zoijcleaow();
        }
    }

    void notifyCaptureResult(TotalCaptureResult totalCaptureResult, int i13) {
        Long l13;
        this.mCaptureResultImageMatcher.ppxfxbqfkf(totalCaptureResult, i13);
        if (this.mTimeStampForOutputImage == -1 && (l13 = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP)) != null) {
            long jLongValue = l13.longValue();
            this.mTimeStampForOutputImage = jLongValue;
            this.mCaptureOutputSurface.eablkybsjg(jLongValue);
        }
        synchronized (this.mLock) {
            try {
                if (this.mSourceCaptureResult == null) {
                    this.mSourceCaptureResult = totalCaptureResult;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void notifyImage(draadjrbmk draadjrbmkVar) {
        this.mCaptureResultImageMatcher.lqeggnwhkg(draadjrbmkVar);
    }

    void process(Map<Integer, Pair<draadjrbmk, TotalCaptureResult>> map, final OnCaptureResultCallback onCaptureResultCallback, final boolean z13) {
        final HashMap map2 = new HashMap();
        synchronized (this.mLock) {
            try {
                for (Integer num : map.keySet()) {
                    Pair<draadjrbmk, TotalCaptureResult> pair = map.get(num);
                    map2.put(num, new Pair(((draadjrbmk) pair.first).get(), (TotalCaptureResult) pair.second));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        yadqdtsiqt.iobyxmoadg.ppxfxbqfkf().execute(new Runnable() { // from class: androidx.camera.extensions.internal.sessionprocessor.kcexrzcfyt
            @Override // java.lang.Runnable
            public final void run() {
                this.f4053zdlpuopuiu.lambda$process$1(z13, map2, onCaptureResultCallback);
            }
        });
    }

    void startCapture(final boolean z13, final List<Integer> list, final OnCaptureResultCallback onCaptureResultCallback) {
        sopmlzcsov.iobyxmoadg(TAG, "Start the capture: enablePostview=" + z13);
        this.mTimeStampForOutputImage = -1L;
        synchronized (this.mLock) {
            u1.nufgyqmvbu.dxjokdxxww(!this.mIsClosed, "StillCaptureProcessor is closed. Can't invoke startCapture()");
            this.mOnCaptureResultCallback = onCaptureResultCallback;
            clearCaptureResults();
        }
        this.mCaptureResultImageMatcher.wkgbmnqykc();
        this.mCaptureResultImageMatcher.draadjrbmk(new btonecajqb.iobyxmoadg() { // from class: androidx.camera.extensions.internal.sessionprocessor.zdlpuopuiu
            @Override // androidx.camera.extensions.internal.sessionprocessor.btonecajqb.iobyxmoadg
            public final void iobyxmoadg(draadjrbmk draadjrbmkVar, TotalCaptureResult totalCaptureResult, int i13) {
                this.f4083iobyxmoadg.lambda$startCapture$0(list, onCaptureResultCallback, z13, draadjrbmkVar, totalCaptureResult, i13);
            }
        });
    }
}
