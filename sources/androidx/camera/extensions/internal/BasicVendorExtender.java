package androidx.camera.extensions.internal;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import androidx.camera.extensions.impl.AutoImageCaptureExtenderImpl;
import androidx.camera.extensions.impl.AutoPreviewExtenderImpl;
import androidx.camera.extensions.impl.BeautyImageCaptureExtenderImpl;
import androidx.camera.extensions.impl.BeautyPreviewExtenderImpl;
import androidx.camera.extensions.impl.BokehImageCaptureExtenderImpl;
import androidx.camera.extensions.impl.BokehPreviewExtenderImpl;
import androidx.camera.extensions.impl.HdrImageCaptureExtenderImpl;
import androidx.camera.extensions.impl.HdrPreviewExtenderImpl;
import androidx.camera.extensions.impl.ImageCaptureExtenderImpl;
import androidx.camera.extensions.impl.NightImageCaptureExtenderImpl;
import androidx.camera.extensions.impl.NightPreviewExtenderImpl;
import androidx.camera.extensions.impl.PreviewExtenderImpl;
import androidx.camera.extensions.internal.sessionprocessor.BasicExtenderSessionProcessor;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import istkbnxepw.jyumaefscl;
import istkbnxepw.yfnezrywwk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lereixgezr.agtfadlqog;
import lereixgezr.sopmlzcsov;

/* JADX INFO: loaded from: classes.dex */
public class BasicVendorExtender implements btonecajqb {
    private static final String TAG = "BasicVendorExtender";
    static final List<CaptureRequest.Key> sBaseSupportedKeys;
    private CameraCharacteristics mCameraCharacteristics;
    private String mCameraId;
    private jyumaefscl mCameraInfo;
    private ImageCaptureExtenderImpl mImageCaptureExtenderImpl;
    private PreviewExtenderImpl mPreviewExtenderImpl;
    private final kegysxyocb.eablkybsjg mExtensionDisabledValidator = new kegysxyocb.eablkybsjg();
    private kegysxyocb.iobyxmoadg mAvailableKeysRetriever = new kegysxyocb.iobyxmoadg();

    static {
        ArrayList arrayList = new ArrayList(Arrays.asList(CaptureRequest.SCALER_CROP_REGION, CaptureRequest.CONTROL_AF_MODE, CaptureRequest.CONTROL_AF_TRIGGER, CaptureRequest.CONTROL_AF_REGIONS, CaptureRequest.CONTROL_AE_REGIONS, CaptureRequest.CONTROL_AWB_REGIONS, CaptureRequest.CONTROL_AE_MODE, CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, CaptureRequest.FLASH_MODE, CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION));
        sBaseSupportedKeys = arrayList;
        if (Build.VERSION.SDK_INT >= 30) {
            arrayList.add(CaptureRequest.CONTROL_ZOOM_RATIO);
        }
    }

    public BasicVendorExtender(int i13) {
        this.mPreviewExtenderImpl = null;
        this.mImageCaptureExtenderImpl = null;
        try {
            if (i13 == 1) {
                this.mPreviewExtenderImpl = new BokehPreviewExtenderImpl();
                this.mImageCaptureExtenderImpl = new BokehImageCaptureExtenderImpl();
                return;
            }
            if (i13 == 2) {
                this.mPreviewExtenderImpl = new HdrPreviewExtenderImpl();
                this.mImageCaptureExtenderImpl = new HdrImageCaptureExtenderImpl();
                return;
            }
            if (i13 == 3) {
                this.mPreviewExtenderImpl = new NightPreviewExtenderImpl();
                this.mImageCaptureExtenderImpl = new NightImageCaptureExtenderImpl();
            } else if (i13 == 4) {
                this.mPreviewExtenderImpl = new BeautyPreviewExtenderImpl();
                this.mImageCaptureExtenderImpl = new BeautyImageCaptureExtenderImpl();
            } else {
                if (i13 != 5) {
                    throw new IllegalArgumentException("Should not activate ExtensionMode.NONE");
                }
                this.mPreviewExtenderImpl = new AutoPreviewExtenderImpl();
                this.mImageCaptureExtenderImpl = new AutoImageCaptureExtenderImpl();
            }
        } catch (NoClassDefFoundError unused) {
            sopmlzcsov.ppxfxbqfkf(TAG, "OEM implementation for extension mode " + i13 + "does not exist!");
        }
    }

    private int getCaptureInputImageFormat() {
        ImageCaptureExtenderImpl imageCaptureExtenderImpl = this.mImageCaptureExtenderImpl;
        if (imageCaptureExtenderImpl == null || imageCaptureExtenderImpl.getCaptureProcessor() == null) {
            return UserVerificationMethods.USER_VERIFY_HANDPRINT;
        }
        return 35;
    }

    private Size[] getOutputSizes(int i13) {
        return ((StreamConfigurationMap) this.mCameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputSizes(i13);
    }

    private int getPreviewInputImageFormat() {
        PreviewExtenderImpl previewExtenderImpl = this.mPreviewExtenderImpl;
        return (previewExtenderImpl == null || previewExtenderImpl.getProcessorType() != PreviewExtenderImpl.ProcessorType.PROCESSOR_TYPE_IMAGE_PROCESSOR) ? 34 : 35;
    }

    private List<CaptureRequest.Key> getSupportedParameterKeys(Context context) {
        if (!gxszxtbevo.lqeggnwhkg(gtknphoqwx.f3995iwizpuwonk)) {
            return Collections.unmodifiableList(sBaseSupportedKeys);
        }
        try {
            List listIobyxmoadg = this.mAvailableKeysRetriever.iobyxmoadg(this.mImageCaptureExtenderImpl, this.mCameraId, this.mCameraCharacteristics, context);
            if (listIobyxmoadg != null) {
                return Collections.unmodifiableList(listIobyxmoadg);
            }
        } catch (Exception e13) {
            sopmlzcsov.wkgbmnqykc(TAG, "ImageCaptureExtenderImpl.getAvailableCaptureRequestKeys throws exceptions", e13);
        }
        return Collections.emptyList();
    }

    private List<Pair<Integer, Size[]>> getSupportedResolutionsOfFormat(List<Pair<Integer, Size[]>> list, int i13, int i14) {
        ArrayList arrayList = new ArrayList();
        for (Pair<Integer, Size[]> pair : list) {
            if (((Integer) pair.first).intValue() == i13) {
                arrayList.add(new Pair(Integer.valueOf(i13), (Size[]) pair.second));
                return arrayList;
            }
        }
        for (Pair<Integer, Size[]> pair2 : list) {
            if (((Integer) pair2.first).intValue() == i14) {
                arrayList.add(new Pair(Integer.valueOf(i13), (Size[]) pair2.second));
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        throw new IllegalArgumentException("Supported resolution should contain " + i13 + " format.");
    }

    public yfnezrywwk createSessionProcessor(Context context) {
        u1.nufgyqmvbu.lqeggnwhkg(this.mCameraInfo, "VendorExtender#init() must be called first");
        return new BasicExtenderSessionProcessor(this.mPreviewExtenderImpl, this.mImageCaptureExtenderImpl, getSupportedParameterKeys(context), this, context);
    }

    public Range<Long> getEstimatedCaptureLatencyRange(Size size) {
        u1.nufgyqmvbu.lqeggnwhkg(this.mCameraInfo, "VendorExtender#init() must be called first");
        if (this.mImageCaptureExtenderImpl == null || gxszxtbevo.zoijcleaow().compareTo(gtknphoqwx.f3996jyumaefscl) < 0) {
            return null;
        }
        try {
            return this.mImageCaptureExtenderImpl.getEstimatedCaptureLatencyRange(size);
        } catch (Throwable unused) {
            return null;
        }
    }

    public List<Pair<Integer, Size[]>> getSupportedCaptureOutputResolutions() {
        u1.nufgyqmvbu.lqeggnwhkg(this.mCameraInfo, "VendorExtender#init() must be called first");
        if (this.mImageCaptureExtenderImpl != null && gxszxtbevo.zoijcleaow().compareTo(gtknphoqwx.f3997yggfygwlhe) >= 0) {
            try {
                List<Pair<Integer, Size[]>> supportedResolutions = this.mImageCaptureExtenderImpl.getSupportedResolutions();
                if (supportedResolutions != null) {
                    return this.mImageCaptureExtenderImpl.getCaptureProcessor() != null ? getSupportedResolutionsOfFormat(supportedResolutions, 35, UserVerificationMethods.USER_VERIFY_HANDPRINT) : supportedResolutions;
                }
            } catch (NoSuchMethodError unused) {
            }
        }
        int captureInputImageFormat = getCaptureInputImageFormat();
        return Arrays.asList(new Pair(Integer.valueOf(captureInputImageFormat), getOutputSizes(captureInputImageFormat)));
    }

    @Override // androidx.camera.extensions.internal.btonecajqb
    public List<CaptureResult.Key> getSupportedCaptureResultKeys() {
        if (gxszxtbevo.lqeggnwhkg(gtknphoqwx.f3995iwizpuwonk)) {
            try {
                List availableCaptureResultKeys = this.mImageCaptureExtenderImpl.getAvailableCaptureResultKeys();
                if (availableCaptureResultKeys != null) {
                    return Collections.unmodifiableList(availableCaptureResultKeys);
                }
            } catch (Exception e13) {
                sopmlzcsov.wkgbmnqykc(TAG, "ImageCaptureExtenderImpl.getAvailableCaptureResultKeys throws exceptions", e13);
            }
        }
        return Collections.emptyList();
    }

    @Override // androidx.camera.extensions.internal.btonecajqb
    public Map<Integer, List<Size>> getSupportedPostviewResolutions(Size size) {
        gtknphoqwx gtknphoqwxVar = gtknphoqwx.f3993cqumvgiudr;
        if (!eablkybsjg.wkgbmnqykc(gtknphoqwxVar) || !gxszxtbevo.lqeggnwhkg(gtknphoqwxVar)) {
            return Collections.emptyMap();
        }
        List<Pair> supportedPostviewResolutions = this.mImageCaptureExtenderImpl.getSupportedPostviewResolutions(size);
        HashMap map = new HashMap();
        for (Pair pair : supportedPostviewResolutions) {
            Integer num = (Integer) pair.first;
            num.intValue();
            map.put(num, Arrays.asList((Size[]) pair.second));
        }
        return Collections.unmodifiableMap(map);
    }

    public List<Pair<Integer, Size[]>> getSupportedPreviewOutputResolutions() {
        u1.nufgyqmvbu.lqeggnwhkg(this.mCameraInfo, "VendorExtender#init() must be called first");
        if (this.mPreviewExtenderImpl != null && gxszxtbevo.zoijcleaow().compareTo(gtknphoqwx.f3997yggfygwlhe) >= 0) {
            try {
                List<Pair<Integer, Size[]>> supportedResolutions = this.mPreviewExtenderImpl.getSupportedResolutions();
                if (supportedResolutions != null) {
                    return getSupportedResolutionsOfFormat(supportedResolutions, 34, 35);
                }
            } catch (NoSuchMethodError unused) {
            }
        }
        return Arrays.asList(new Pair(34, getOutputSizes(getPreviewInputImageFormat())));
    }

    public Size[] getSupportedYuvAnalysisResolutions() {
        u1.nufgyqmvbu.lqeggnwhkg(this.mCameraInfo, "VendorExtender#init() must be called first");
        return new Size[0];
    }

    public void init(agtfadlqog agtfadlqogVar) {
        jyumaefscl jyumaefsclVar = (jyumaefscl) agtfadlqogVar;
        this.mCameraInfo = jyumaefsclVar;
        if (this.mPreviewExtenderImpl == null || this.mImageCaptureExtenderImpl == null) {
            return;
        }
        this.mCameraId = jyumaefsclVar.zoijcleaow();
        CameraCharacteristics cameraCharacteristics = (CameraCharacteristics) this.mCameraInfo.eablkybsjg();
        this.mCameraCharacteristics = cameraCharacteristics;
        this.mPreviewExtenderImpl.init(this.mCameraId, cameraCharacteristics);
        this.mImageCaptureExtenderImpl.init(this.mCameraId, this.mCameraCharacteristics);
        sopmlzcsov.iobyxmoadg(TAG, "PreviewExtender processorType= " + this.mPreviewExtenderImpl.getProcessorType());
        sopmlzcsov.iobyxmoadg(TAG, "ImageCaptureExtender processor= " + this.mImageCaptureExtenderImpl.getCaptureProcessor());
    }

    public boolean isCaptureProcessProgressAvailable() {
        gtknphoqwx gtknphoqwxVar = gtknphoqwx.f3993cqumvgiudr;
        if (eablkybsjg.wkgbmnqykc(gtknphoqwxVar) && gxszxtbevo.lqeggnwhkg(gtknphoqwxVar)) {
            return this.mImageCaptureExtenderImpl.isCaptureProcessProgressAvailable();
        }
        return false;
    }

    @Override // androidx.camera.extensions.internal.btonecajqb
    public /* bridge */ /* synthetic */ boolean isCurrentExtensionModeAvailable() {
        return super.isCurrentExtensionModeAvailable();
    }

    public boolean isExtensionAvailable(String str, Map<String, CameraCharacteristics> map) {
        if (this.mExtensionDisabledValidator.iobyxmoadg() || this.mPreviewExtenderImpl == null || this.mImageCaptureExtenderImpl == null) {
            return false;
        }
        CameraCharacteristics cameraCharacteristics = map.get(str);
        return this.mPreviewExtenderImpl.isExtensionAvailable(str, cameraCharacteristics) && this.mImageCaptureExtenderImpl.isExtensionAvailable(str, cameraCharacteristics);
    }

    @Override // androidx.camera.extensions.internal.btonecajqb
    public boolean isExtensionStrengthAvailable() {
        return false;
    }

    @Override // androidx.camera.extensions.internal.btonecajqb
    public boolean isPostviewAvailable() {
        gtknphoqwx gtknphoqwxVar = gtknphoqwx.f3993cqumvgiudr;
        if (eablkybsjg.wkgbmnqykc(gtknphoqwxVar) && gxszxtbevo.lqeggnwhkg(gtknphoqwxVar)) {
            return this.mImageCaptureExtenderImpl.isPostviewAvailable();
        }
        return false;
    }

    @Override // androidx.camera.extensions.internal.btonecajqb
    public /* bridge */ /* synthetic */ boolean willReceiveOnCaptureCompleted() {
        return super.willReceiveOnCaptureCompleted();
    }

    public BasicVendorExtender(ImageCaptureExtenderImpl imageCaptureExtenderImpl, PreviewExtenderImpl previewExtenderImpl) {
        this.mPreviewExtenderImpl = null;
        this.mImageCaptureExtenderImpl = null;
        this.mPreviewExtenderImpl = previewExtenderImpl;
        this.mImageCaptureExtenderImpl = imageCaptureExtenderImpl;
    }
}
