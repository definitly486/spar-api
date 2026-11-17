package androidx.camera.extensions.internal.sessionprocessor;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Pair;
import android.util.Size;
import androidx.camera.extensions.impl.CaptureProcessorImpl;
import androidx.camera.extensions.impl.CaptureStageImpl;
import androidx.camera.extensions.impl.ImageCaptureExtenderImpl;
import androidx.camera.extensions.impl.PreviewExtenderImpl;
import androidx.camera.extensions.impl.RequestUpdateProcessorImpl;
import androidx.lifecycle.cqumvgiudr;
import istkbnxepw.jlmebxxoox;
import istkbnxepw.opjhrmiecq;
import istkbnxepw.ribwqtqdhb;
import istkbnxepw.xrmfcynszj;
import istkbnxepw.yfnezrywwk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import lereixgezr.sopmlzcsov;

/* JADX INFO: loaded from: classes.dex */
public class BasicExtenderSessionProcessor extends oxmwwwfdhm {
    private static final long INVALID_TIMESTAMP = -1;
    private static final int PREVIEW_PROCESS_MAX_IMAGES = 2;
    private static final String TAG = "BasicSessionProcessor";
    static AtomicInteger sLastOutputConfigId = new AtomicInteger(0);
    private volatile androidx.camera.extensions.internal.sessionprocessor.gxszxtbevo mAnalysisOutputConfig;
    private volatile androidx.camera.extensions.internal.sessionprocessor.gxszxtbevo mCaptureOutputConfig;
    private volatile jlmebxxoox mCaptureOutputSurface;
    private final Context mContext;
    private final ImageCaptureExtenderImpl mImageCaptureExtenderImpl;
    volatile boolean mIsCapturing;
    private final AtomicInteger mNextCaptureSequenceId;
    private kegysxyocb.gxszxtbevo mOnEnableDisableSessionDurationCheck;
    private final Map<CaptureRequest.Key<?>, Object> mParameters;
    private jlmebxxoox mPostviewOutputSurface;
    private final PreviewExtenderImpl mPreviewExtenderImpl;
    private volatile androidx.camera.extensions.internal.sessionprocessor.gxszxtbevo mPreviewOutputConfig;
    private volatile jlmebxxoox mPreviewOutputSurface;
    volatile PreviewProcessor mPreviewProcessor;
    private final Map<Integer, Long> mRequestCompletedTimestampMap;
    private volatile xrmfcynszj mRequestProcessor;
    volatile RequestUpdateProcessorImpl mRequestUpdateProcessor;
    volatile StillCaptureProcessor mStillCaptureProcessor;
    private final androidx.camera.extensions.internal.btonecajqb mVendorExtender;
    private final boolean mWillReceiveOnCaptureCompleted;

    class eablkybsjg implements gtknphoqwx {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        boolean f4008iobyxmoadg = true;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final /* synthetic */ int f4009ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ yfnezrywwk.iobyxmoadg f4011zoijcleaow;

        eablkybsjg(yfnezrywwk.iobyxmoadg iobyxmoadgVar, int i13) {
            this.f4011zoijcleaow = iobyxmoadgVar;
            this.f4009ppxfxbqfkf = i13;
        }

        @Override // androidx.camera.extensions.internal.sessionprocessor.gtknphoqwx
        public void onNextImageAvailable(int i13, long j13, draadjrbmk draadjrbmkVar, String str) {
            sopmlzcsov.iobyxmoadg(BasicExtenderSessionProcessor.TAG, "onNextImageAvailable  outputStreamId=" + i13);
            if (BasicExtenderSessionProcessor.this.mStillCaptureProcessor != null) {
                BasicExtenderSessionProcessor.this.mStillCaptureProcessor.notifyImage(draadjrbmkVar);
            } else {
                draadjrbmkVar.zoijcleaow();
            }
            if (this.f4008iobyxmoadg) {
                this.f4011zoijcleaow.eablkybsjg(this.f4009ppxfxbqfkf);
                this.f4008iobyxmoadg = false;
            }
        }
    }

    class gxszxtbevo implements StillCaptureProcessor.OnCaptureResultCallback {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ int f4012iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final /* synthetic */ opjhrmiecq f4013ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ yfnezrywwk.iobyxmoadg f4015zoijcleaow;

        gxszxtbevo(int i13, yfnezrywwk.iobyxmoadg iobyxmoadgVar, opjhrmiecq opjhrmiecqVar) {
            this.f4012iobyxmoadg = i13;
            this.f4015zoijcleaow = iobyxmoadgVar;
            this.f4013ppxfxbqfkf = opjhrmiecqVar;
        }

        @Override // androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor.OnCaptureResultCallback
        public void onCaptureCompleted(long j13, List list) {
            if (BasicExtenderSessionProcessor.this.mWillReceiveOnCaptureCompleted) {
                this.f4015zoijcleaow.wkgbmnqykc(j13, this.f4012iobyxmoadg, new wflxmlrfwp(j13, this.f4013ppxfxbqfkf, BasicExtenderSessionProcessor.this.getCaptureResultKeyMapFromList(list)));
                this.f4015zoijcleaow.iobyxmoadg(this.f4012iobyxmoadg);
            }
        }

        @Override // androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor.OnCaptureResultCallback
        public void onCaptureProcessProgressed(int i13) {
            this.f4015zoijcleaow.onCaptureProcessProgressed(i13);
        }

        @Override // androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor.OnCaptureResultCallback
        public void onError(Exception exc) {
            this.f4015zoijcleaow.zoijcleaow(this.f4012iobyxmoadg);
            BasicExtenderSessionProcessor.this.mIsCapturing = false;
        }

        @Override // androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor.OnCaptureResultCallback
        public void onProcessCompleted() {
            if (!BasicExtenderSessionProcessor.this.mWillReceiveOnCaptureCompleted) {
                long requestCompletedTimestamp = BasicExtenderSessionProcessor.this.getRequestCompletedTimestamp(this.f4012iobyxmoadg);
                if (requestCompletedTimestamp == -1) {
                    sopmlzcsov.ppxfxbqfkf(BasicExtenderSessionProcessor.TAG, "Cannot get timestamp for the capture result");
                    this.f4015zoijcleaow.zoijcleaow(this.f4012iobyxmoadg);
                    this.f4015zoijcleaow.onCaptureSequenceAborted(this.f4012iobyxmoadg);
                    BasicExtenderSessionProcessor.this.mIsCapturing = false;
                    return;
                }
                this.f4015zoijcleaow.wkgbmnqykc(requestCompletedTimestamp, this.f4012iobyxmoadg, new wflxmlrfwp(requestCompletedTimestamp, this.f4013ppxfxbqfkf, Collections.emptyMap()));
                this.f4015zoijcleaow.iobyxmoadg(this.f4012iobyxmoadg);
            }
            BasicExtenderSessionProcessor.this.mIsCapturing = false;
        }
    }

    class iobyxmoadg implements gtknphoqwx {
        iobyxmoadg() {
        }

        @Override // androidx.camera.extensions.internal.sessionprocessor.gtknphoqwx
        public void onNextImageAvailable(int i13, long j13, draadjrbmk draadjrbmkVar, String str) {
            if (BasicExtenderSessionProcessor.this.mPreviewProcessor != null) {
                BasicExtenderSessionProcessor.this.mPreviewProcessor.notifyImage(draadjrbmkVar);
            } else {
                draadjrbmkVar.zoijcleaow();
            }
        }
    }

    class lqeggnwhkg implements xrmfcynszj.iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ yfnezrywwk.iobyxmoadg f4017iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final /* synthetic */ opjhrmiecq f4018ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ int f4020zoijcleaow;

        lqeggnwhkg(yfnezrywwk.iobyxmoadg iobyxmoadgVar, int i13, opjhrmiecq opjhrmiecqVar) {
            this.f4017iobyxmoadg = iobyxmoadgVar;
            this.f4020zoijcleaow = i13;
            this.f4018ppxfxbqfkf = opjhrmiecqVar;
        }

        @Override // istkbnxepw.xrmfcynszj.iobyxmoadg
        public void onCaptureCompleted(xrmfcynszj.zoijcleaow zoijcleaowVar, istkbnxepw.ojitshcjhn ojitshcjhnVar) {
            this.f4017iobyxmoadg.wkgbmnqykc(ojitshcjhnVar.getTimestamp(), this.f4020zoijcleaow, new androidx.camera.extensions.internal.wkgbmnqykc(this.f4018ppxfxbqfkf, ojitshcjhnVar.wkgbmnqykc()));
            this.f4017iobyxmoadg.iobyxmoadg(this.f4020zoijcleaow);
        }

        @Override // istkbnxepw.xrmfcynszj.iobyxmoadg
        public void onCaptureFailed(xrmfcynszj.zoijcleaow zoijcleaowVar, istkbnxepw.btonecajqb btonecajqbVar) {
            this.f4017iobyxmoadg.zoijcleaow(this.f4020zoijcleaow);
        }
    }

    class ppxfxbqfkf implements xrmfcynszj.iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ yfnezrywwk.iobyxmoadg f4021iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ int f4023zoijcleaow;

        ppxfxbqfkf(yfnezrywwk.iobyxmoadg iobyxmoadgVar, int i13) {
            this.f4021iobyxmoadg = iobyxmoadgVar;
            this.f4023zoijcleaow = i13;
        }

        @Override // istkbnxepw.xrmfcynszj.iobyxmoadg
        public void onCaptureCompleted(xrmfcynszj.zoijcleaow zoijcleaowVar, istkbnxepw.ojitshcjhn ojitshcjhnVar) {
            Long l13;
            CaptureResult captureResultWkgbmnqykc = ojitshcjhnVar.wkgbmnqykc();
            u1.nufgyqmvbu.zoijcleaow(captureResultWkgbmnqykc instanceof TotalCaptureResult, "Cannot get TotalCaptureResult from the cameraCaptureResult ");
            TotalCaptureResult totalCaptureResult = (TotalCaptureResult) captureResultWkgbmnqykc;
            if (BasicExtenderSessionProcessor.this.mPreviewProcessor != null) {
                BasicExtenderSessionProcessor.this.mPreviewProcessor.notifyCaptureResult(totalCaptureResult);
            } else {
                androidx.camera.extensions.internal.gtknphoqwx gtknphoqwxVar = androidx.camera.extensions.internal.gtknphoqwx.f3995iwizpuwonk;
                if (androidx.camera.extensions.internal.eablkybsjg.wkgbmnqykc(gtknphoqwxVar) && androidx.camera.extensions.internal.gxszxtbevo.lqeggnwhkg(gtknphoqwxVar) && (l13 = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP)) != null) {
                    this.f4021iobyxmoadg.wkgbmnqykc(l13.longValue(), this.f4023zoijcleaow, new androidx.camera.extensions.internal.wkgbmnqykc(totalCaptureResult));
                }
            }
            if (BasicExtenderSessionProcessor.this.mRequestUpdateProcessor != null && BasicExtenderSessionProcessor.this.mRequestUpdateProcessor.process(totalCaptureResult) != null) {
                BasicExtenderSessionProcessor.this.updateRepeating(this.f4023zoijcleaow, this.f4021iobyxmoadg);
            }
            this.f4021iobyxmoadg.iobyxmoadg(this.f4023zoijcleaow);
        }
    }

    class wkgbmnqykc implements xrmfcynszj.iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        final /* synthetic */ opjhrmiecq f4024eablkybsjg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final /* synthetic */ yfnezrywwk.iobyxmoadg f4027ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        final /* synthetic */ int f4028wkgbmnqykc;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        boolean f4026iobyxmoadg = false;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        boolean f4029zoijcleaow = false;

        wkgbmnqykc(yfnezrywwk.iobyxmoadg iobyxmoadgVar, int i13, opjhrmiecq opjhrmiecqVar) {
            this.f4027ppxfxbqfkf = iobyxmoadgVar;
            this.f4028wkgbmnqykc = i13;
            this.f4024eablkybsjg = opjhrmiecqVar;
        }

        @Override // istkbnxepw.xrmfcynszj.iobyxmoadg
        public void onCaptureCompleted(xrmfcynszj.zoijcleaow zoijcleaowVar, istkbnxepw.ojitshcjhn ojitshcjhnVar) {
            CaptureResult captureResultWkgbmnqykc = ojitshcjhnVar.wkgbmnqykc();
            u1.nufgyqmvbu.zoijcleaow(captureResultWkgbmnqykc instanceof TotalCaptureResult, "Cannot get capture TotalCaptureResult from the cameraCaptureResult ");
            TotalCaptureResult totalCaptureResult = (TotalCaptureResult) captureResultWkgbmnqykc;
            ojitshcjhn.iobyxmoadg iobyxmoadgVar = (ojitshcjhn.iobyxmoadg) zoijcleaowVar;
            if (BasicExtenderSessionProcessor.this.mStillCaptureProcessor != null) {
                synchronized (BasicExtenderSessionProcessor.this.mLock) {
                    try {
                        if (!BasicExtenderSessionProcessor.this.mRequestCompletedTimestampMap.containsKey(Integer.valueOf(this.f4028wkgbmnqykc))) {
                            BasicExtenderSessionProcessor.this.mRequestCompletedTimestampMap.put(Integer.valueOf(this.f4028wkgbmnqykc), Long.valueOf(ojitshcjhnVar.getTimestamp()));
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                BasicExtenderSessionProcessor.this.mStillCaptureProcessor.notifyCaptureResult(totalCaptureResult, iobyxmoadgVar.iobyxmoadg());
                return;
            }
            BasicExtenderSessionProcessor.this.mIsCapturing = false;
            if (BasicExtenderSessionProcessor.this.mRequestProcessor == null) {
                this.f4027ppxfxbqfkf.onCaptureSequenceAborted(this.f4028wkgbmnqykc);
                return;
            }
            this.f4027ppxfxbqfkf.eablkybsjg(this.f4028wkgbmnqykc);
            this.f4027ppxfxbqfkf.wkgbmnqykc(ojitshcjhnVar.getTimestamp(), this.f4028wkgbmnqykc, new androidx.camera.extensions.internal.wkgbmnqykc(this.f4024eablkybsjg, ojitshcjhnVar.wkgbmnqykc()));
            this.f4027ppxfxbqfkf.iobyxmoadg(this.f4028wkgbmnqykc);
        }

        @Override // istkbnxepw.xrmfcynszj.iobyxmoadg
        public void onCaptureFailed(xrmfcynszj.zoijcleaow zoijcleaowVar, istkbnxepw.btonecajqb btonecajqbVar) {
            if (this.f4026iobyxmoadg) {
                return;
            }
            this.f4026iobyxmoadg = true;
            this.f4027ppxfxbqfkf.zoijcleaow(this.f4028wkgbmnqykc);
            this.f4027ppxfxbqfkf.onCaptureSequenceAborted(this.f4028wkgbmnqykc);
            BasicExtenderSessionProcessor.this.mIsCapturing = false;
        }

        @Override // istkbnxepw.xrmfcynszj.iobyxmoadg
        public void onCaptureSequenceAborted(int i13) {
            this.f4027ppxfxbqfkf.onCaptureSequenceAborted(this.f4028wkgbmnqykc);
            BasicExtenderSessionProcessor.this.mIsCapturing = false;
        }

        @Override // istkbnxepw.xrmfcynszj.iobyxmoadg
        public void onCaptureStarted(xrmfcynszj.zoijcleaow zoijcleaowVar, long j13, long j14) {
            if (this.f4029zoijcleaow) {
                return;
            }
            this.f4029zoijcleaow = true;
            this.f4027ppxfxbqfkf.ppxfxbqfkf(this.f4028wkgbmnqykc, j14);
        }
    }

    class zoijcleaow implements xrmfcynszj.iobyxmoadg {
        zoijcleaow() {
        }
    }

    public BasicExtenderSessionProcessor(PreviewExtenderImpl previewExtenderImpl, ImageCaptureExtenderImpl imageCaptureExtenderImpl, List<CaptureRequest.Key> list, androidx.camera.extensions.internal.btonecajqb btonecajqbVar, Context context) {
        super(list);
        this.mStillCaptureProcessor = null;
        this.mPreviewProcessor = null;
        this.mRequestUpdateProcessor = null;
        this.mAnalysisOutputConfig = null;
        this.mIsCapturing = false;
        this.mNextCaptureSequenceId = new AtomicInteger(0);
        this.mParameters = new LinkedHashMap();
        this.mRequestCompletedTimestampMap = new HashMap();
        this.mOnEnableDisableSessionDurationCheck = new kegysxyocb.gxszxtbevo();
        this.mPreviewExtenderImpl = previewExtenderImpl;
        this.mImageCaptureExtenderImpl = imageCaptureExtenderImpl;
        this.mContext = context;
        this.mVendorExtender = btonecajqbVar;
        this.mWillReceiveOnCaptureCompleted = btonecajqbVar.willReceiveOnCaptureCompleted();
    }

    private void applyParameters(ojitshcjhn ojitshcjhnVar) {
        synchronized (this.mLock) {
            try {
                for (CaptureRequest.Key<?> key : this.mParameters.keySet()) {
                    Object obj = this.mParameters.get(key);
                    if (obj != null) {
                        ojitshcjhnVar.wkgbmnqykc(key, obj);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void applyPreviewStagesParameters(ojitshcjhn ojitshcjhnVar) {
        CaptureStageImpl captureStage = this.mPreviewExtenderImpl.getCaptureStage();
        if (captureStage != null) {
            for (Pair pair : captureStage.getParameters()) {
                ojitshcjhnVar.wkgbmnqykc((CaptureRequest.Key) pair.first, pair.second);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getRequestCompletedTimestamp(int i13) {
        synchronized (this.mLock) {
            try {
                Long l13 = this.mRequestCompletedTimestampMap.get(Integer.valueOf(i13));
                if (l13 == null) {
                    return -1L;
                }
                this.mRequestCompletedTimestampMap.remove(Integer.valueOf(i13));
                return l13.longValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startRepeating$0(yfnezrywwk.iobyxmoadg iobyxmoadgVar, int i13, opjhrmiecq opjhrmiecqVar, long j13, List list) {
        iobyxmoadgVar.wkgbmnqykc(j13, i13, new wflxmlrfwp(j13, opjhrmiecqVar, getCaptureResultKeyMapFromList(list)));
    }

    private void submitRequestByCaptureStages(xrmfcynszj xrmfcynszjVar, List<CaptureStageImpl> list) {
        ArrayList arrayList = new ArrayList();
        for (CaptureStageImpl captureStageImpl : list) {
            ojitshcjhn ojitshcjhnVar = new ojitshcjhn();
            ojitshcjhnVar.iobyxmoadg(this.mPreviewOutputConfig.getId());
            if (this.mAnalysisOutputConfig != null) {
                ojitshcjhnVar.iobyxmoadg(this.mAnalysisOutputConfig.getId());
            }
            for (Pair pair : captureStageImpl.getParameters()) {
                ojitshcjhnVar.wkgbmnqykc((CaptureRequest.Key) pair.first, pair.second);
            }
            ojitshcjhnVar.eablkybsjg(1);
            arrayList.add(ojitshcjhnVar.zoijcleaow());
        }
        xrmfcynszjVar.eablkybsjg(arrayList, new zoijcleaow());
    }

    public void abortCapture(int i13) {
        this.mRequestProcessor.zoijcleaow();
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.oxmwwwfdhm
    protected void deInitSessionInternal() {
        if (this.mPreviewProcessor != null) {
            this.mPreviewProcessor.close();
            this.mPreviewProcessor = null;
        }
        if (this.mStillCaptureProcessor != null) {
            this.mStillCaptureProcessor.close();
            this.mStillCaptureProcessor = null;
        }
        sopmlzcsov.iobyxmoadg(TAG, "preview onDeInit");
        this.mPreviewExtenderImpl.onDeInit();
        sopmlzcsov.iobyxmoadg(TAG, "capture onDeInit");
        this.mImageCaptureExtenderImpl.onDeInit();
    }

    Map<CaptureResult.Key, Object> getCaptureResultKeyMapFromList(List<Pair<CaptureResult.Key, Object>> list) {
        HashMap map = new HashMap();
        for (Pair<CaptureResult.Key, Object> pair : list) {
            map.put((CaptureResult.Key) pair.first, pair.second);
        }
        return map;
    }

    @Override // androidx.camera.extensions.zoijcleaow
    public /* bridge */ /* synthetic */ cqumvgiudr getCurrentExtensionMode() {
        return super.getCurrentExtensionMode();
    }

    @Override // androidx.camera.extensions.zoijcleaow
    public /* bridge */ /* synthetic */ cqumvgiudr getExtensionStrength() {
        return super.getExtensionStrength();
    }

    public Pair<Long, Long> getRealtimeCaptureLatency() {
        androidx.camera.extensions.internal.gtknphoqwx gtknphoqwxVar = androidx.camera.extensions.internal.gtknphoqwx.f3993cqumvgiudr;
        if (androidx.camera.extensions.internal.eablkybsjg.wkgbmnqykc(gtknphoqwxVar) && androidx.camera.extensions.internal.gxszxtbevo.lqeggnwhkg(gtknphoqwxVar)) {
            return this.mImageCaptureExtenderImpl.getRealtimeCaptureLatency();
        }
        return null;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.oxmwwwfdhm, istkbnxepw.yfnezrywwk
    public /* bridge */ /* synthetic */ Set getSupportedCameraOperations() {
        return super.getSupportedCameraOperations();
    }

    @Override // istkbnxepw.yfnezrywwk
    public Map<Integer, List<Size>> getSupportedPostviewSize(Size size) {
        return this.mVendorExtender.getSupportedPostviewResolutions(size);
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.oxmwwwfdhm
    protected nufgyqmvbu initSessionInternal(String str, Map<String, CameraCharacteristics> map, ribwqtqdhb ribwqtqdhbVar) {
        sopmlzcsov.iobyxmoadg(TAG, "PreviewExtenderImpl.onInit");
        this.mPreviewExtenderImpl.onInit(str, map.get(str), this.mContext);
        sopmlzcsov.iobyxmoadg(TAG, "ImageCaptureExtenderImpl.onInit");
        this.mImageCaptureExtenderImpl.onInit(str, map.get(str), this.mContext);
        this.mPreviewOutputSurface = ribwqtqdhbVar.eablkybsjg();
        this.mCaptureOutputSurface = ribwqtqdhbVar.ppxfxbqfkf();
        this.mPostviewOutputSurface = ribwqtqdhbVar.wkgbmnqykc();
        PreviewExtenderImpl.ProcessorType processorType = this.mPreviewExtenderImpl.getProcessorType();
        sopmlzcsov.iobyxmoadg(TAG, "preview processorType=" + processorType);
        if (processorType == PreviewExtenderImpl.ProcessorType.PROCESSOR_TYPE_IMAGE_PROCESSOR) {
            this.mPreviewOutputConfig = ImageReaderOutputConfig.create(sLastOutputConfigId.getAndIncrement(), this.mPreviewOutputSurface.ppxfxbqfkf(), 35, 2);
            this.mPreviewProcessor = new PreviewProcessor(this.mPreviewExtenderImpl.getProcessor(), this.mPreviewOutputSurface.wkgbmnqykc(), this.mPreviewOutputSurface.ppxfxbqfkf());
        } else if (processorType == PreviewExtenderImpl.ProcessorType.PROCESSOR_TYPE_REQUEST_UPDATE_ONLY) {
            this.mPreviewOutputConfig = SurfaceOutputConfig.create(sLastOutputConfigId.getAndIncrement(), this.mPreviewOutputSurface.wkgbmnqykc());
            this.mRequestUpdateProcessor = this.mPreviewExtenderImpl.getProcessor();
        } else {
            this.mPreviewOutputConfig = SurfaceOutputConfig.create(sLastOutputConfigId.getAndIncrement(), this.mPreviewOutputSurface.wkgbmnqykc());
        }
        CaptureProcessorImpl captureProcessor = this.mImageCaptureExtenderImpl.getCaptureProcessor();
        sopmlzcsov.iobyxmoadg(TAG, "CaptureProcessor=" + captureProcessor);
        if (captureProcessor != null) {
            this.mCaptureOutputConfig = ImageReaderOutputConfig.create(sLastOutputConfigId.getAndIncrement(), this.mCaptureOutputSurface.ppxfxbqfkf(), 35, this.mImageCaptureExtenderImpl.getMaxCaptureStage());
            this.mStillCaptureProcessor = new StillCaptureProcessor(captureProcessor, this.mCaptureOutputSurface.wkgbmnqykc(), this.mCaptureOutputSurface.ppxfxbqfkf(), this.mPostviewOutputSurface, !this.mWillReceiveOnCaptureCompleted);
        } else {
            this.mCaptureOutputConfig = SurfaceOutputConfig.create(sLastOutputConfigId.getAndIncrement(), this.mCaptureOutputSurface.wkgbmnqykc());
        }
        if (ribwqtqdhbVar.zoijcleaow() != null) {
            this.mAnalysisOutputConfig = SurfaceOutputConfig.create(sLastOutputConfigId.getAndIncrement(), ribwqtqdhbVar.zoijcleaow().wkgbmnqykc());
        }
        dxjokdxxww dxjokdxxwwVarWkgbmnqykc = new dxjokdxxww().iobyxmoadg(this.mPreviewOutputConfig).iobyxmoadg(this.mCaptureOutputConfig).wkgbmnqykc(1);
        androidx.camera.extensions.internal.gtknphoqwx gtknphoqwxVar = androidx.camera.extensions.internal.gtknphoqwx.f3993cqumvgiudr;
        if (androidx.camera.extensions.internal.eablkybsjg.wkgbmnqykc(gtknphoqwxVar) && androidx.camera.extensions.internal.gxszxtbevo.lqeggnwhkg(gtknphoqwxVar)) {
            int iOnSessionType = this.mPreviewExtenderImpl.onSessionType();
            u1.nufgyqmvbu.zoijcleaow(iOnSessionType == this.mImageCaptureExtenderImpl.onSessionType(), "Needs same session type in both PreviewExtenderImpl and ImageCaptureExtenderImpl");
            if (iOnSessionType == -1) {
                iOnSessionType = 0;
            }
            dxjokdxxwwVarWkgbmnqykc.eablkybsjg(iOnSessionType);
        }
        if (this.mAnalysisOutputConfig != null) {
            dxjokdxxwwVarWkgbmnqykc.iobyxmoadg(this.mAnalysisOutputConfig);
        }
        CaptureStageImpl captureStageImplOnPresetSession = this.mPreviewExtenderImpl.onPresetSession();
        sopmlzcsov.iobyxmoadg(TAG, "preview onPresetSession:" + captureStageImplOnPresetSession);
        CaptureStageImpl captureStageImplOnPresetSession2 = this.mImageCaptureExtenderImpl.onPresetSession();
        sopmlzcsov.iobyxmoadg(TAG, "capture onPresetSession:" + captureStageImplOnPresetSession2);
        if (captureStageImplOnPresetSession != null && captureStageImplOnPresetSession.getParameters() != null) {
            for (Pair pair : captureStageImplOnPresetSession.getParameters()) {
                dxjokdxxwwVarWkgbmnqykc.zoijcleaow((CaptureRequest.Key) pair.first, pair.second);
            }
        }
        if (captureStageImplOnPresetSession2 != null && captureStageImplOnPresetSession2.getParameters() != null) {
            for (Pair pair2 : captureStageImplOnPresetSession2.getParameters()) {
                dxjokdxxwwVarWkgbmnqykc.zoijcleaow((CaptureRequest.Key) pair2.first, pair2.second);
            }
        }
        return dxjokdxxwwVarWkgbmnqykc.ppxfxbqfkf();
    }

    @Override // androidx.camera.extensions.zoijcleaow
    public /* bridge */ /* synthetic */ boolean isCurrentExtensionModeAvailable() {
        return super.isCurrentExtensionModeAvailable();
    }

    @Override // androidx.camera.extensions.zoijcleaow
    public /* bridge */ /* synthetic */ boolean isExtensionStrengthAvailable() {
        return super.isExtensionStrengthAvailable();
    }

    @Override // istkbnxepw.yfnezrywwk
    public void onCaptureSessionEnd() {
        this.mOnEnableDisableSessionDurationCheck.zoijcleaow();
        if (this.mPreviewProcessor != null) {
            this.mPreviewProcessor.pause();
        }
        ArrayList arrayList = new ArrayList();
        CaptureStageImpl captureStageImplOnDisableSession = this.mPreviewExtenderImpl.onDisableSession();
        sopmlzcsov.iobyxmoadg(TAG, "preview onDisableSession: " + captureStageImplOnDisableSession);
        if (captureStageImplOnDisableSession != null) {
            arrayList.add(captureStageImplOnDisableSession);
        }
        CaptureStageImpl captureStageImplOnDisableSession2 = this.mImageCaptureExtenderImpl.onDisableSession();
        sopmlzcsov.iobyxmoadg(TAG, "capture onDisableSession:" + captureStageImplOnDisableSession2);
        if (captureStageImplOnDisableSession2 != null) {
            arrayList.add(captureStageImplOnDisableSession2);
        }
        if (!arrayList.isEmpty()) {
            submitRequestByCaptureStages(this.mRequestProcessor, arrayList);
        }
        this.mRequestProcessor = null;
        this.mIsCapturing = false;
    }

    @Override // istkbnxepw.yfnezrywwk
    public void onCaptureSessionStart(xrmfcynszj xrmfcynszjVar) {
        this.mRequestProcessor = xrmfcynszjVar;
        ArrayList arrayList = new ArrayList();
        CaptureStageImpl captureStageImplOnEnableSession = this.mPreviewExtenderImpl.onEnableSession();
        sopmlzcsov.iobyxmoadg(TAG, "preview onEnableSession: " + captureStageImplOnEnableSession);
        if (captureStageImplOnEnableSession != null) {
            arrayList.add(captureStageImplOnEnableSession);
        }
        CaptureStageImpl captureStageImplOnEnableSession2 = this.mImageCaptureExtenderImpl.onEnableSession();
        sopmlzcsov.iobyxmoadg(TAG, "capture onEnableSession:" + captureStageImplOnEnableSession2);
        if (captureStageImplOnEnableSession2 != null) {
            arrayList.add(captureStageImplOnEnableSession2);
        }
        this.mOnEnableDisableSessionDurationCheck.ppxfxbqfkf();
        if (!arrayList.isEmpty()) {
            submitRequestByCaptureStages(xrmfcynszjVar, arrayList);
        }
        if (this.mPreviewProcessor != null) {
            this.mPreviewProcessor.resume();
            setImageProcessor(this.mPreviewOutputConfig.getId(), new iobyxmoadg());
        }
    }

    @Override // androidx.camera.extensions.iobyxmoadg
    public /* bridge */ /* synthetic */ void setExtensionStrength(int i13) {
        super.setExtensionStrength(i13);
    }

    @Override // istkbnxepw.yfnezrywwk
    public void setParameters(androidx.camera.core.impl.btonecajqb btonecajqbVar) {
        synchronized (this.mLock) {
            try {
                HashMap map = new HashMap();
                androidx.camera.extensions.internal.nufgyqmvbu nufgyqmvbuVarZoijcleaow = androidx.camera.extensions.internal.nufgyqmvbu.zoijcleaow.ppxfxbqfkf(btonecajqbVar).zoijcleaow();
                for (androidx.camera.core.impl.btonecajqb.iobyxmoadg iobyxmoadgVar : nufgyqmvbuVarZoijcleaow.eablkybsjg()) {
                    map.put((CaptureRequest.Key) iobyxmoadgVar.wkgbmnqykc(), nufgyqmvbuVarZoijcleaow.iobyxmoadg(iobyxmoadgVar));
                }
                this.mParameters.clear();
                this.mParameters.putAll(map);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // istkbnxepw.yfnezrywwk
    public int startCapture(boolean z13, opjhrmiecq opjhrmiecqVar, yfnezrywwk.iobyxmoadg iobyxmoadgVar) {
        sopmlzcsov.iobyxmoadg(TAG, "startCapture postviewEnabled = " + z13 + " mWillReceiveOnCaptureCompleted = " + this.mWillReceiveOnCaptureCompleted);
        int andIncrement = this.mNextCaptureSequenceId.getAndIncrement();
        if (this.mRequestProcessor == null || this.mIsCapturing) {
            sopmlzcsov.iobyxmoadg(TAG, "startCapture failed");
            iobyxmoadgVar.zoijcleaow(andIncrement);
            iobyxmoadgVar.onCaptureSequenceAborted(andIncrement);
            return andIncrement;
        }
        this.mIsCapturing = true;
        ArrayList arrayList = new ArrayList();
        List<CaptureStageImpl> captureStages = this.mImageCaptureExtenderImpl.getCaptureStages();
        ArrayList arrayList2 = new ArrayList();
        for (CaptureStageImpl captureStageImpl : captureStages) {
            ojitshcjhn ojitshcjhnVar = new ojitshcjhn();
            ojitshcjhnVar.iobyxmoadg(this.mCaptureOutputConfig.getId());
            ojitshcjhnVar.eablkybsjg(2);
            ojitshcjhnVar.ppxfxbqfkf(captureStageImpl.getId());
            arrayList2.add(Integer.valueOf(captureStageImpl.getId()));
            applyParameters(ojitshcjhnVar);
            applyPreviewStagesParameters(ojitshcjhnVar);
            for (Pair pair : captureStageImpl.getParameters()) {
                ojitshcjhnVar.wkgbmnqykc((CaptureRequest.Key) pair.first, pair.second);
            }
            arrayList.add(ojitshcjhnVar.zoijcleaow());
        }
        sopmlzcsov.iobyxmoadg(TAG, "Wait for capture stage id: " + arrayList2);
        wkgbmnqykc wkgbmnqykcVar = new wkgbmnqykc(iobyxmoadgVar, andIncrement, opjhrmiecqVar);
        sopmlzcsov.iobyxmoadg(TAG, "startCapture");
        if (this.mStillCaptureProcessor != null) {
            setImageProcessor(this.mCaptureOutputConfig.getId(), new eablkybsjg(iobyxmoadgVar, andIncrement));
            this.mStillCaptureProcessor.startCapture(z13, arrayList2, new gxszxtbevo(andIncrement, iobyxmoadgVar, opjhrmiecqVar));
        }
        this.mRequestProcessor.eablkybsjg(arrayList, wkgbmnqykcVar);
        return andIncrement;
    }

    @Override // istkbnxepw.yfnezrywwk
    public int startRepeating(final opjhrmiecq opjhrmiecqVar, final yfnezrywwk.iobyxmoadg iobyxmoadgVar) {
        final int andIncrement = this.mNextCaptureSequenceId.getAndIncrement();
        if (this.mRequestProcessor == null) {
            iobyxmoadgVar.zoijcleaow(andIncrement);
            iobyxmoadgVar.onCaptureSequenceAborted(andIncrement);
        } else {
            if (this.mPreviewProcessor != null) {
                this.mPreviewProcessor.start(new PreviewProcessor.OnCaptureResultCallback() { // from class: androidx.camera.extensions.internal.sessionprocessor.eablkybsjg
                    @Override // androidx.camera.extensions.internal.sessionprocessor.PreviewProcessor.OnCaptureResultCallback
                    public final void onCaptureResult(long j13, List list) {
                        this.f4046iobyxmoadg.lambda$startRepeating$0(iobyxmoadgVar, andIncrement, opjhrmiecqVar, j13, list);
                    }
                });
            }
            updateRepeating(andIncrement, iobyxmoadgVar);
        }
        return andIncrement;
    }

    @Override // istkbnxepw.yfnezrywwk
    public int startTrigger(androidx.camera.core.impl.btonecajqb btonecajqbVar, opjhrmiecq opjhrmiecqVar, yfnezrywwk.iobyxmoadg iobyxmoadgVar) {
        sopmlzcsov.iobyxmoadg(TAG, "startTrigger");
        int andIncrement = this.mNextCaptureSequenceId.getAndIncrement();
        ojitshcjhn ojitshcjhnVar = new ojitshcjhn();
        ojitshcjhnVar.iobyxmoadg(this.mPreviewOutputConfig.getId());
        if (this.mAnalysisOutputConfig != null) {
            ojitshcjhnVar.iobyxmoadg(this.mAnalysisOutputConfig.getId());
        }
        ojitshcjhnVar.eablkybsjg(1);
        applyParameters(ojitshcjhnVar);
        applyPreviewStagesParameters(ojitshcjhnVar);
        androidx.camera.extensions.internal.nufgyqmvbu nufgyqmvbuVarZoijcleaow = androidx.camera.extensions.internal.nufgyqmvbu.zoijcleaow.ppxfxbqfkf(btonecajqbVar).zoijcleaow();
        for (androidx.camera.core.impl.btonecajqb.iobyxmoadg iobyxmoadgVar2 : nufgyqmvbuVarZoijcleaow.eablkybsjg()) {
            ojitshcjhnVar.wkgbmnqykc((CaptureRequest.Key) iobyxmoadgVar2.wkgbmnqykc(), nufgyqmvbuVarZoijcleaow.iobyxmoadg(iobyxmoadgVar2));
        }
        this.mRequestProcessor.ppxfxbqfkf(ojitshcjhnVar.zoijcleaow(), new lqeggnwhkg(iobyxmoadgVar, andIncrement, opjhrmiecqVar));
        return andIncrement;
    }

    @Override // istkbnxepw.yfnezrywwk
    public void stopRepeating() {
        this.mRequestProcessor.stopRepeating();
    }

    void updateRepeating(int i13, yfnezrywwk.iobyxmoadg iobyxmoadgVar) {
        if (this.mRequestProcessor == null) {
            sopmlzcsov.iobyxmoadg(TAG, "mRequestProcessor is null, ignore repeating request");
            return;
        }
        ojitshcjhn ojitshcjhnVar = new ojitshcjhn();
        ojitshcjhnVar.iobyxmoadg(this.mPreviewOutputConfig.getId());
        if (this.mAnalysisOutputConfig != null) {
            ojitshcjhnVar.iobyxmoadg(this.mAnalysisOutputConfig.getId());
        }
        ojitshcjhnVar.eablkybsjg(1);
        applyParameters(ojitshcjhnVar);
        applyPreviewStagesParameters(ojitshcjhnVar);
        ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(iobyxmoadgVar, i13);
        sopmlzcsov.iobyxmoadg(TAG, "requestProcessor setRepeating");
        this.mRequestProcessor.wkgbmnqykc(ojitshcjhnVar.zoijcleaow(), ppxfxbqfkfVar);
    }
}
