package androidx.camera.extensions.internal.sessionprocessor;

import android.annotation.SuppressLint;
import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.media.Image;
import android.os.Build;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import androidx.camera.extensions.impl.advanced.Camera2OutputConfigImpl;
import androidx.camera.extensions.impl.advanced.Camera2SessionConfigImpl;
import androidx.camera.extensions.impl.advanced.ImageProcessorImpl;
import androidx.camera.extensions.impl.advanced.ImageReferenceImpl;
import androidx.camera.extensions.impl.advanced.OutputSurfaceConfigurationImpl;
import androidx.camera.extensions.impl.advanced.OutputSurfaceImpl;
import androidx.camera.extensions.impl.advanced.RequestProcessorImpl;
import androidx.camera.extensions.impl.advanced.SessionProcessorImpl;
import androidx.lifecycle.cqumvgiudr;
import androidx.lifecycle.pmvmpeiblj;
import istkbnxepw.jlmebxxoox;
import istkbnxepw.opjhrmiecq;
import istkbnxepw.ribwqtqdhb;
import istkbnxepw.xrmfcynszj;
import istkbnxepw.yfnezrywwk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import lereixgezr.sopmlzcsov;

/* JADX INFO: loaded from: classes.dex */
public class AdvancedSessionProcessor extends oxmwwwfdhm {
    private static final String TAG = "AdvancedSessionProcessor";
    private final Context mContext;
    private final pmvmpeiblj mCurrentExtensionTypeLiveData;
    private final ExtensionMetadataMonitor mExtensionMetadataMonitor;
    private final pmvmpeiblj mExtensionStrengthLiveData;
    private final SessionProcessorImpl mImpl;
    private boolean mIsPostviewConfigured;
    private final int mMode;
    private SessionProcessorImplCaptureCallbackAdapter mRepeatingCaptureCallbackAdapter;
    private final androidx.camera.extensions.internal.btonecajqb mVendorExtender;
    private final boolean mWillReceiveOnCaptureCompleted;
    private HashMap<CaptureRequest.Key<?>, Object> mWorkingCaptureConfigMap;

    private static class CallbackAdapter implements xrmfcynszj.iobyxmoadg {
        private final RequestProcessorImpl.Callback mCallback;

        CallbackAdapter(RequestProcessorImpl.Callback callback) {
            this.mCallback = callback;
        }

        private RequestProcessorImpl.Request getImplRequest(xrmfcynszj.zoijcleaow zoijcleaowVar) {
            u1.nufgyqmvbu.iobyxmoadg(zoijcleaowVar instanceof RequestAdapter);
            return ((RequestAdapter) zoijcleaowVar).getImplRequest();
        }

        @Override // istkbnxepw.xrmfcynszj.iobyxmoadg
        public void onCaptureBufferLost(xrmfcynszj.zoijcleaow zoijcleaowVar, long j13, int i13) {
            this.mCallback.onCaptureBufferLost(getImplRequest(zoijcleaowVar), j13, i13);
        }

        @Override // istkbnxepw.xrmfcynszj.iobyxmoadg
        public void onCaptureCompleted(xrmfcynszj.zoijcleaow zoijcleaowVar, istkbnxepw.ojitshcjhn ojitshcjhnVar) {
            CaptureResult captureResultWkgbmnqykc = ojitshcjhnVar.wkgbmnqykc();
            u1.nufgyqmvbu.zoijcleaow(captureResultWkgbmnqykc instanceof TotalCaptureResult, "CaptureResult in cameraCaptureResult is not a TotalCaptureResult");
            this.mCallback.onCaptureCompleted(getImplRequest(zoijcleaowVar), (TotalCaptureResult) captureResultWkgbmnqykc);
        }

        @Override // istkbnxepw.xrmfcynszj.iobyxmoadg
        public void onCaptureFailed(xrmfcynszj.zoijcleaow zoijcleaowVar, istkbnxepw.btonecajqb btonecajqbVar) {
            Object objIobyxmoadg = btonecajqbVar.iobyxmoadg();
            u1.nufgyqmvbu.zoijcleaow(objIobyxmoadg instanceof CaptureFailure, "CameraCaptureFailure does not contain CaptureFailure.");
            this.mCallback.onCaptureFailed(getImplRequest(zoijcleaowVar), (CaptureFailure) objIobyxmoadg);
        }

        @Override // istkbnxepw.xrmfcynszj.iobyxmoadg
        public void onCaptureProgressed(xrmfcynszj.zoijcleaow zoijcleaowVar, istkbnxepw.ojitshcjhn ojitshcjhnVar) {
            CaptureResult captureResultWkgbmnqykc = ojitshcjhnVar.wkgbmnqykc();
            u1.nufgyqmvbu.zoijcleaow(captureResultWkgbmnqykc != null, "Cannot get CaptureResult from the cameraCaptureResult ");
            this.mCallback.onCaptureProgressed(getImplRequest(zoijcleaowVar), captureResultWkgbmnqykc);
        }

        @Override // istkbnxepw.xrmfcynszj.iobyxmoadg
        public void onCaptureSequenceAborted(int i13) {
            this.mCallback.onCaptureSequenceAborted(i13);
        }

        @Override // istkbnxepw.xrmfcynszj.iobyxmoadg
        public void onCaptureSequenceCompleted(int i13, long j13) {
            this.mCallback.onCaptureSequenceCompleted(i13, j13);
        }

        @Override // istkbnxepw.xrmfcynszj.iobyxmoadg
        public void onCaptureStarted(xrmfcynszj.zoijcleaow zoijcleaowVar, long j13, long j14) {
            this.mCallback.onCaptureStarted(getImplRequest(zoijcleaowVar), j13, j14);
        }
    }

    private static class ExtensionMetadataMonitor {
        private final pmvmpeiblj mCurrentExtensionTypeLiveData;
        private final pmvmpeiblj mExtensionStrengthLiveData;

        ExtensionMetadataMonitor(pmvmpeiblj pmvmpeibljVar, pmvmpeiblj pmvmpeibljVar2) {
            this.mCurrentExtensionTypeLiveData = pmvmpeibljVar;
            this.mExtensionStrengthLiveData = pmvmpeibljVar2;
        }

        private int convertExtensionMode(int i13) {
            if (i13 == 0) {
                return 5;
            }
            if (i13 == 1) {
                return 4;
            }
            if (i13 == 2) {
                return 1;
            }
            if (i13 != 3) {
                return i13 != 4 ? 0 : 3;
            }
            return 2;
        }

        void checkExtensionMetadata(Map<CaptureResult.Key, Object> map) {
            Object obj;
            Object obj2;
            if (Build.VERSION.SDK_INT >= 34) {
                if (this.mCurrentExtensionTypeLiveData != null && (obj2 = map.get(CaptureResult.EXTENSION_CURRENT_TYPE)) != null) {
                    Integer num = (Integer) obj2;
                    if (!Objects.equals(this.mCurrentExtensionTypeLiveData.gxszxtbevo(), Integer.valueOf(convertExtensionMode(num.intValue())))) {
                        this.mCurrentExtensionTypeLiveData.wflxmlrfwp(Integer.valueOf(convertExtensionMode(num.intValue())));
                    }
                }
                if (this.mExtensionStrengthLiveData == null || (obj = map.get(CaptureResult.EXTENSION_STRENGTH)) == null || Objects.equals(this.mExtensionStrengthLiveData.gxszxtbevo(), obj)) {
                    return;
                }
                this.mExtensionStrengthLiveData.wflxmlrfwp((Integer) obj);
            }
        }
    }

    private static class ImageProcessorAdapter implements gtknphoqwx {
        private final ImageProcessorImpl mImpl;

        ImageProcessorAdapter(ImageProcessorImpl imageProcessorImpl) {
            this.mImpl = imageProcessorImpl;
        }

        @Override // androidx.camera.extensions.internal.sessionprocessor.gtknphoqwx
        public void onNextImageAvailable(int i13, long j13, draadjrbmk draadjrbmkVar, String str) {
            this.mImpl.onNextImageAvailable(i13, j13, new ImageReferenceImplAdapter(draadjrbmkVar), str);
        }
    }

    private static class ImageReferenceImplAdapter implements ImageReferenceImpl {
        private final draadjrbmk mImageReference;

        ImageReferenceImplAdapter(draadjrbmk draadjrbmkVar) {
            this.mImageReference = draadjrbmkVar;
        }

        public boolean decrement() {
            return this.mImageReference.zoijcleaow();
        }

        public Image get() {
            return this.mImageReference.get();
        }

        public boolean increment() {
            return this.mImageReference.iobyxmoadg();
        }
    }

    private static class OutputSurfaceConfigurationImplAdapter implements OutputSurfaceConfigurationImpl {
        private final OutputSurfaceImpl mAnalysisOutputSurface;
        private final OutputSurfaceImpl mCaptureOutputSurface;
        private final OutputSurfaceImpl mPostviewOutputSurface;
        private final OutputSurfaceImpl mPreviewOutputSurface;

        OutputSurfaceConfigurationImplAdapter(ribwqtqdhb ribwqtqdhbVar) {
            this.mPreviewOutputSurface = new OutputSurfaceImplAdapter(ribwqtqdhbVar.eablkybsjg());
            this.mCaptureOutputSurface = new OutputSurfaceImplAdapter(ribwqtqdhbVar.ppxfxbqfkf());
            this.mAnalysisOutputSurface = ribwqtqdhbVar.zoijcleaow() != null ? new OutputSurfaceImplAdapter(ribwqtqdhbVar.zoijcleaow()) : null;
            this.mPostviewOutputSurface = ribwqtqdhbVar.wkgbmnqykc() != null ? new OutputSurfaceImplAdapter(ribwqtqdhbVar.wkgbmnqykc()) : null;
        }

        public OutputSurfaceImpl getImageAnalysisOutputSurface() {
            return this.mAnalysisOutputSurface;
        }

        public OutputSurfaceImpl getImageCaptureOutputSurface() {
            return this.mCaptureOutputSurface;
        }

        public OutputSurfaceImpl getPostviewOutputSurface() {
            return this.mPostviewOutputSurface;
        }

        public OutputSurfaceImpl getPreviewOutputSurface() {
            return this.mPreviewOutputSurface;
        }
    }

    private static class OutputSurfaceImplAdapter implements OutputSurfaceImpl {
        private final jlmebxxoox mOutputSurface;

        OutputSurfaceImplAdapter(jlmebxxoox jlmebxxooxVar) {
            this.mOutputSurface = jlmebxxooxVar;
        }

        public int getImageFormat() {
            return this.mOutputSurface.zoijcleaow();
        }

        public Size getSize() {
            return this.mOutputSurface.ppxfxbqfkf();
        }

        public Surface getSurface() {
            return this.mOutputSurface.wkgbmnqykc();
        }
    }

    private static class RequestAdapter implements xrmfcynszj.zoijcleaow {
        private final RequestProcessorImpl.Request mImplRequest;
        private final androidx.camera.core.impl.btonecajqb mParameters;
        private final List<Integer> mTargetOutputConfigIds;
        private final int mTemplateId;

        RequestAdapter(RequestProcessorImpl.Request request) {
            this.mImplRequest = request;
            ArrayList arrayList = new ArrayList();
            Iterator it = request.getTargetOutputConfigIds().iterator();
            while (it.hasNext()) {
                arrayList.add((Integer) it.next());
            }
            this.mTargetOutputConfigIds = arrayList;
            androidx.camera.extensions.internal.nufgyqmvbu.zoijcleaow zoijcleaowVar = new androidx.camera.extensions.internal.nufgyqmvbu.zoijcleaow();
            for (CaptureRequest.Key key : request.getParameters().keySet()) {
                zoijcleaowVar.eablkybsjg(key, request.getParameters().get(key));
            }
            this.mParameters = zoijcleaowVar.zoijcleaow();
            this.mTemplateId = request.getTemplateId().intValue();
        }

        public RequestProcessorImpl.Request getImplRequest() {
            return this.mImplRequest;
        }

        @Override // istkbnxepw.xrmfcynszj.zoijcleaow
        public androidx.camera.core.impl.btonecajqb getParameters() {
            return this.mParameters;
        }

        @Override // istkbnxepw.xrmfcynszj.zoijcleaow
        public List<Integer> getTargetOutputConfigIds() {
            return this.mTargetOutputConfigIds;
        }

        @Override // istkbnxepw.xrmfcynszj.zoijcleaow
        public int getTemplateId() {
            return this.mTemplateId;
        }
    }

    private class RequestProcessorImplAdapter implements RequestProcessorImpl {
        private final xrmfcynszj mRequestProcessor;

        RequestProcessorImplAdapter(xrmfcynszj xrmfcynszjVar) {
            this.mRequestProcessor = xrmfcynszjVar;
        }

        public void abortCaptures() {
            this.mRequestProcessor.zoijcleaow();
        }

        public void setImageProcessor(int i13, ImageProcessorImpl imageProcessorImpl) {
            AdvancedSessionProcessor.this.setImageProcessor(i13, new ImageProcessorAdapter(imageProcessorImpl));
        }

        public int setRepeating(RequestProcessorImpl.Request request, RequestProcessorImpl.Callback callback) {
            return this.mRequestProcessor.wkgbmnqykc(new RequestAdapter(request), new CallbackAdapter(callback));
        }

        public void stopRepeating() {
            this.mRequestProcessor.stopRepeating();
        }

        public int submit(RequestProcessorImpl.Request request, RequestProcessorImpl.Callback callback) {
            return this.mRequestProcessor.ppxfxbqfkf(new RequestAdapter(request), new CallbackAdapter(callback));
        }

        public int submit(List<RequestProcessorImpl.Request> list, RequestProcessorImpl.Callback callback) {
            ArrayList arrayList = new ArrayList();
            Iterator<RequestProcessorImpl.Request> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new RequestAdapter(it.next()));
            }
            return this.mRequestProcessor.eablkybsjg(arrayList, new CallbackAdapter(callback));
        }
    }

    private static class SessionProcessorImplCaptureCallbackAdapter implements SessionProcessorImpl.CaptureCallback {
        private final yfnezrywwk.iobyxmoadg mCaptureCallback;
        private final ExtensionMetadataMonitor mExtensionMetadataMonitor;
        private long mOnCaptureStartedTimestamp;
        private final opjhrmiecq mTagBundle;
        private boolean mWillReceiveOnCaptureCompleted;

        SessionProcessorImplCaptureCallbackAdapter(yfnezrywwk.iobyxmoadg iobyxmoadgVar, opjhrmiecq opjhrmiecqVar, boolean z13) {
            this(iobyxmoadgVar, opjhrmiecqVar, null, z13);
        }

        public void onCaptureCompleted(long j13, int i13, Map<CaptureResult.Key, Object> map) {
            ExtensionMetadataMonitor extensionMetadataMonitor = this.mExtensionMetadataMonitor;
            if (extensionMetadataMonitor != null) {
                extensionMetadataMonitor.checkExtensionMetadata(map);
            }
            if (this.mWillReceiveOnCaptureCompleted) {
                this.mCaptureCallback.wkgbmnqykc(j13, i13, new wflxmlrfwp(j13, this.mTagBundle, map));
                this.mCaptureCallback.iobyxmoadg(i13);
            }
        }

        public void onCaptureFailed(int i13) {
            this.mCaptureCallback.zoijcleaow(i13);
        }

        public void onCaptureProcessProgressed(int i13) {
            this.mCaptureCallback.onCaptureProcessProgressed(i13);
        }

        public void onCaptureProcessStarted(int i13) {
            this.mCaptureCallback.eablkybsjg(i13);
        }

        public void onCaptureSequenceAborted(int i13) {
            this.mCaptureCallback.onCaptureSequenceAborted(i13);
        }

        public void onCaptureSequenceCompleted(int i13) {
            if (this.mWillReceiveOnCaptureCompleted) {
                return;
            }
            yfnezrywwk.iobyxmoadg iobyxmoadgVar = this.mCaptureCallback;
            long j13 = this.mOnCaptureStartedTimestamp;
            iobyxmoadgVar.wkgbmnqykc(j13, i13, new wflxmlrfwp(j13, this.mTagBundle, Collections.emptyMap()));
            this.mCaptureCallback.iobyxmoadg(i13);
        }

        public void onCaptureStarted(int i13, long j13) {
            this.mOnCaptureStartedTimestamp = j13;
            this.mCaptureCallback.ppxfxbqfkf(i13, j13);
        }

        SessionProcessorImplCaptureCallbackAdapter(yfnezrywwk.iobyxmoadg iobyxmoadgVar, opjhrmiecq opjhrmiecqVar, ExtensionMetadataMonitor extensionMetadataMonitor, boolean z13) {
            this.mOnCaptureStartedTimestamp = -1L;
            this.mCaptureCallback = iobyxmoadgVar;
            this.mTagBundle = opjhrmiecqVar;
            this.mExtensionMetadataMonitor = extensionMetadataMonitor;
            this.mWillReceiveOnCaptureCompleted = z13;
        }
    }

    public AdvancedSessionProcessor(SessionProcessorImpl sessionProcessorImpl, List<CaptureRequest.Key> list, androidx.camera.extensions.internal.btonecajqb btonecajqbVar, Context context) {
        this(sessionProcessorImpl, list, btonecajqbVar, context, 0);
    }

    private static HashMap<CaptureRequest.Key<?>, Object> convertConfigToMap(androidx.camera.core.impl.btonecajqb btonecajqbVar) {
        HashMap<CaptureRequest.Key<?>, Object> map = new HashMap<>();
        androidx.camera.extensions.internal.nufgyqmvbu nufgyqmvbuVarZoijcleaow = androidx.camera.extensions.internal.nufgyqmvbu.zoijcleaow.ppxfxbqfkf(btonecajqbVar).zoijcleaow();
        for (androidx.camera.core.impl.btonecajqb.iobyxmoadg iobyxmoadgVar : nufgyqmvbuVarZoijcleaow.eablkybsjg()) {
            map.put((CaptureRequest.Key) iobyxmoadgVar.wkgbmnqykc(), nufgyqmvbuVarZoijcleaow.iobyxmoadg(iobyxmoadgVar));
        }
        return map;
    }

    private nufgyqmvbu convertToCamera2SessionConfig(Camera2SessionConfigImpl camera2SessionConfigImpl) {
        dxjokdxxww dxjokdxxwwVar = new dxjokdxxww();
        Iterator it = camera2SessionConfigImpl.getOutputConfigs().iterator();
        while (it.hasNext()) {
            dxjokdxxwwVar.iobyxmoadg(lqeggnwhkg.iobyxmoadg((Camera2OutputConfigImpl) it.next()));
        }
        for (CaptureRequest.Key key : camera2SessionConfigImpl.getSessionParameters().keySet()) {
            dxjokdxxwwVar.zoijcleaow(key, camera2SessionConfigImpl.getSessionParameters().get(key));
        }
        dxjokdxxwwVar.wkgbmnqykc(camera2SessionConfigImpl.getSessionTemplateId());
        androidx.camera.extensions.internal.gtknphoqwx gtknphoqwxVar = androidx.camera.extensions.internal.gtknphoqwx.f3993cqumvgiudr;
        if (androidx.camera.extensions.internal.eablkybsjg.wkgbmnqykc(gtknphoqwxVar) && androidx.camera.extensions.internal.gxszxtbevo.lqeggnwhkg(gtknphoqwxVar)) {
            try {
                int sessionType = camera2SessionConfigImpl.getSessionType();
                if (sessionType == -1) {
                    sessionType = 0;
                }
                dxjokdxxwwVar.eablkybsjg(sessionType);
            } catch (NoSuchMethodError unused) {
                dxjokdxxwwVar.eablkybsjg(0);
            }
        }
        return dxjokdxxwwVar.ppxfxbqfkf();
    }

    public void abortCapture(int i13) {
        this.mImpl.abortCapture(i13);
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.oxmwwwfdhm
    protected void deInitSessionInternal() {
        synchronized (this.mLock) {
            this.mWorkingCaptureConfigMap = new HashMap<>();
            this.mRepeatingCaptureCallbackAdapter = null;
        }
        this.mImpl.deInitSession();
    }

    @Override // androidx.camera.extensions.zoijcleaow
    public cqumvgiudr getCurrentExtensionMode() {
        return this.mCurrentExtensionTypeLiveData;
    }

    @Override // androidx.camera.extensions.zoijcleaow
    @SuppressLint({"KotlinPropertyAccess"})
    public cqumvgiudr getExtensionStrength() {
        return this.mExtensionStrengthLiveData;
    }

    public Pair<Long, Long> getRealtimeCaptureLatency() {
        androidx.camera.extensions.internal.gtknphoqwx gtknphoqwxVar = androidx.camera.extensions.internal.gtknphoqwx.f3993cqumvgiudr;
        if (androidx.camera.extensions.internal.eablkybsjg.wkgbmnqykc(gtknphoqwxVar) && androidx.camera.extensions.internal.gxszxtbevo.lqeggnwhkg(gtknphoqwxVar)) {
            return this.mImpl.getRealtimeCaptureLatency();
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
        androidx.camera.extensions.internal.gtknphoqwx gtknphoqwxVar = androidx.camera.extensions.internal.gtknphoqwx.f3993cqumvgiudr;
        Camera2SessionConfigImpl camera2SessionConfigImplInitSession = (androidx.camera.extensions.internal.eablkybsjg.wkgbmnqykc(gtknphoqwxVar) && androidx.camera.extensions.internal.gxszxtbevo.lqeggnwhkg(gtknphoqwxVar)) ? this.mImpl.initSession(str, map, this.mContext, new OutputSurfaceConfigurationImplAdapter(ribwqtqdhbVar)) : null;
        if (camera2SessionConfigImplInitSession == null) {
            camera2SessionConfigImplInitSession = this.mImpl.initSession(str, map, this.mContext, new OutputSurfaceImplAdapter(ribwqtqdhbVar.eablkybsjg()), new OutputSurfaceImplAdapter(ribwqtqdhbVar.ppxfxbqfkf()), ribwqtqdhbVar.zoijcleaow() != null ? new OutputSurfaceImplAdapter(ribwqtqdhbVar.zoijcleaow()) : null);
        }
        this.mIsPostviewConfigured = ribwqtqdhbVar.wkgbmnqykc() != null;
        pmvmpeiblj pmvmpeibljVar = this.mCurrentExtensionTypeLiveData;
        if (pmvmpeibljVar != null) {
            pmvmpeibljVar.wflxmlrfwp(Integer.valueOf(this.mMode));
        }
        pmvmpeiblj pmvmpeibljVar2 = this.mExtensionStrengthLiveData;
        if (pmvmpeibljVar2 != null) {
            pmvmpeibljVar2.wflxmlrfwp(100);
        }
        return convertToCamera2SessionConfig(camera2SessionConfigImplInitSession);
    }

    @Override // androidx.camera.extensions.zoijcleaow
    public boolean isCurrentExtensionModeAvailable() {
        return this.mVendorExtender.isCurrentExtensionModeAvailable();
    }

    @Override // androidx.camera.extensions.zoijcleaow
    public boolean isExtensionStrengthAvailable() {
        return this.mVendorExtender.isExtensionStrengthAvailable();
    }

    @Override // istkbnxepw.yfnezrywwk
    public void onCaptureSessionEnd() {
        this.mImpl.onCaptureSessionEnd();
    }

    @Override // istkbnxepw.yfnezrywwk
    public void onCaptureSessionStart(xrmfcynszj xrmfcynszjVar) {
        this.mImpl.onCaptureSessionStart(new RequestProcessorImplAdapter(xrmfcynszjVar));
    }

    @Override // androidx.camera.extensions.iobyxmoadg
    public void setExtensionStrength(int i13) {
        SessionProcessorImplCaptureCallbackAdapter sessionProcessorImplCaptureCallbackAdapter;
        HashMap map;
        if (!isExtensionStrengthAvailable() || Build.VERSION.SDK_INT < 34) {
            return;
        }
        synchronized (this.mLock) {
            this.mExtensionStrength = i13;
            this.mWorkingCaptureConfigMap.put(CaptureRequest.EXTENSION_STRENGTH, Integer.valueOf(this.mExtensionStrength));
            sessionProcessorImplCaptureCallbackAdapter = this.mRepeatingCaptureCallbackAdapter;
            map = (HashMap) this.mWorkingCaptureConfigMap.clone();
        }
        this.mImpl.setParameters(map);
        if (sessionProcessorImplCaptureCallbackAdapter != null) {
            this.mImpl.startRepeating(sessionProcessorImplCaptureCallbackAdapter);
        }
    }

    @Override // istkbnxepw.yfnezrywwk
    public void setParameters(androidx.camera.core.impl.btonecajqb btonecajqbVar) {
        HashMap<CaptureRequest.Key<?>, Object> mapConvertConfigToMap;
        synchronized (this.mLock) {
            try {
                mapConvertConfigToMap = convertConfigToMap(btonecajqbVar);
                if (this.mExtensionStrength != -1 && Build.VERSION.SDK_INT >= 34) {
                    mapConvertConfigToMap.put(CaptureRequest.EXTENSION_STRENGTH, Integer.valueOf(this.mExtensionStrength));
                }
                this.mWorkingCaptureConfigMap = mapConvertConfigToMap;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.mImpl.setParameters(mapConvertConfigToMap);
    }

    @Override // istkbnxepw.yfnezrywwk
    public int startCapture(boolean z13, opjhrmiecq opjhrmiecqVar, yfnezrywwk.iobyxmoadg iobyxmoadgVar) {
        sopmlzcsov.iobyxmoadg(TAG, "startCapture postviewEnabled = " + z13 + " mWillReceiveOnCaptureCompleted = " + this.mWillReceiveOnCaptureCompleted);
        SessionProcessorImplCaptureCallbackAdapter sessionProcessorImplCaptureCallbackAdapter = new SessionProcessorImplCaptureCallbackAdapter(iobyxmoadgVar, opjhrmiecqVar, this.mWillReceiveOnCaptureCompleted);
        androidx.camera.extensions.internal.gtknphoqwx gtknphoqwxVar = androidx.camera.extensions.internal.gtknphoqwx.f3993cqumvgiudr;
        return (androidx.camera.extensions.internal.eablkybsjg.wkgbmnqykc(gtknphoqwxVar) && androidx.camera.extensions.internal.gxszxtbevo.lqeggnwhkg(gtknphoqwxVar) && this.mIsPostviewConfigured && z13 && this.mVendorExtender.isPostviewAvailable()) ? this.mImpl.startCaptureWithPostview(sessionProcessorImplCaptureCallbackAdapter) : this.mImpl.startCapture(sessionProcessorImplCaptureCallbackAdapter);
    }

    @Override // istkbnxepw.yfnezrywwk
    public int startRepeating(opjhrmiecq opjhrmiecqVar, yfnezrywwk.iobyxmoadg iobyxmoadgVar) {
        SessionProcessorImplCaptureCallbackAdapter sessionProcessorImplCaptureCallbackAdapter;
        synchronized (this.mLock) {
            sessionProcessorImplCaptureCallbackAdapter = new SessionProcessorImplCaptureCallbackAdapter(iobyxmoadgVar, opjhrmiecqVar, this.mExtensionMetadataMonitor, this.mWillReceiveOnCaptureCompleted);
            this.mRepeatingCaptureCallbackAdapter = sessionProcessorImplCaptureCallbackAdapter;
        }
        return this.mImpl.startRepeating(sessionProcessorImplCaptureCallbackAdapter);
    }

    @Override // istkbnxepw.yfnezrywwk
    public int startTrigger(androidx.camera.core.impl.btonecajqb btonecajqbVar, opjhrmiecq opjhrmiecqVar, yfnezrywwk.iobyxmoadg iobyxmoadgVar) {
        HashMap<CaptureRequest.Key<?>, Object> mapConvertConfigToMap = convertConfigToMap(btonecajqbVar);
        androidx.camera.extensions.internal.gtknphoqwx gtknphoqwxVar = androidx.camera.extensions.internal.gtknphoqwx.f3995iwizpuwonk;
        if (androidx.camera.extensions.internal.eablkybsjg.wkgbmnqykc(gtknphoqwxVar) && androidx.camera.extensions.internal.gxszxtbevo.lqeggnwhkg(gtknphoqwxVar)) {
            return this.mImpl.startTrigger(mapConvertConfigToMap, new SessionProcessorImplCaptureCallbackAdapter(iobyxmoadgVar, opjhrmiecqVar, this.mWillReceiveOnCaptureCompleted));
        }
        return -1;
    }

    @Override // istkbnxepw.yfnezrywwk
    public void stopRepeating() {
        this.mImpl.stopRepeating();
        synchronized (this.mLock) {
            this.mRepeatingCaptureCallbackAdapter = null;
        }
    }

    public AdvancedSessionProcessor(SessionProcessorImpl sessionProcessorImpl, List<CaptureRequest.Key> list, androidx.camera.extensions.internal.btonecajqb btonecajqbVar, Context context, int i13) {
        super(list);
        this.mIsPostviewConfigured = false;
        this.mWorkingCaptureConfigMap = new HashMap<>();
        this.mRepeatingCaptureCallbackAdapter = null;
        this.mImpl = sessionProcessorImpl;
        this.mVendorExtender = btonecajqbVar;
        this.mContext = context;
        this.mWillReceiveOnCaptureCompleted = btonecajqbVar.willReceiveOnCaptureCompleted();
        this.mMode = i13;
        pmvmpeiblj pmvmpeibljVar = isCurrentExtensionModeAvailable() ? new pmvmpeiblj(Integer.valueOf(i13)) : null;
        this.mCurrentExtensionTypeLiveData = pmvmpeibljVar;
        pmvmpeiblj pmvmpeibljVar2 = isExtensionStrengthAvailable() ? new pmvmpeiblj(100) : null;
        this.mExtensionStrengthLiveData = pmvmpeibljVar2;
        if (pmvmpeibljVar == null && pmvmpeibljVar2 == null) {
            this.mExtensionMetadataMonitor = null;
        } else {
            this.mExtensionMetadataMonitor = new ExtensionMetadataMonitor(pmvmpeibljVar, pmvmpeibljVar2);
        }
    }
}
