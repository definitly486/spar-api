package androidx.camera.extensions.internal;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import androidx.camera.extensions.impl.advanced.AdvancedExtenderImpl;
import androidx.camera.extensions.impl.advanced.AutoAdvancedExtenderImpl;
import androidx.camera.extensions.impl.advanced.BeautyAdvancedExtenderImpl;
import androidx.camera.extensions.impl.advanced.BokehAdvancedExtenderImpl;
import androidx.camera.extensions.impl.advanced.HdrAdvancedExtenderImpl;
import androidx.camera.extensions.impl.advanced.NightAdvancedExtenderImpl;
import androidx.camera.extensions.internal.sessionprocessor.AdvancedSessionProcessor;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import istkbnxepw.jyumaefscl;
import istkbnxepw.yfnezrywwk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import lereixgezr.agtfadlqog;
import lereixgezr.sopmlzcsov;

/* JADX INFO: loaded from: classes.dex */
public class AdvancedVendorExtender implements btonecajqb {
    private static final String TAG = "AdvancedVendorExtender";
    private final AdvancedExtenderImpl mAdvancedExtenderImpl;
    private String mCameraId;
    private final kegysxyocb.eablkybsjg mExtensionDisabledValidator;
    private final int mMode;

    public AdvancedVendorExtender(int i13) {
        this.mExtensionDisabledValidator = new kegysxyocb.eablkybsjg();
        try {
            if (i13 == 1) {
                this.mAdvancedExtenderImpl = new BokehAdvancedExtenderImpl();
            } else if (i13 == 2) {
                this.mAdvancedExtenderImpl = new HdrAdvancedExtenderImpl();
            } else if (i13 == 3) {
                this.mAdvancedExtenderImpl = new NightAdvancedExtenderImpl();
            } else if (i13 == 4) {
                this.mAdvancedExtenderImpl = new BeautyAdvancedExtenderImpl();
            } else {
                if (i13 != 5) {
                    throw new IllegalArgumentException("Should not active ExtensionMode.NONE");
                }
                this.mAdvancedExtenderImpl = new AutoAdvancedExtenderImpl();
            }
            this.mMode = i13;
        } catch (NoClassDefFoundError unused) {
            throw new IllegalArgumentException("AdvancedExtenderImpl does not exist");
        }
    }

    private List<Pair<Integer, Size[]>> convertResolutionMapToList(Map<Integer, List<Size>> map) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : map.keySet()) {
            arrayList.add(new Pair(num, (Size[]) map.get(num).toArray(new Size[0])));
        }
        return Collections.unmodifiableList(arrayList);
    }

    private List<CaptureRequest.Key> getSupportedParameterKeys() {
        List<CaptureRequest.Key> listEmptyList = Collections.emptyList();
        if (gxszxtbevo.zoijcleaow().compareTo(gtknphoqwx.f3995iwizpuwonk) < 0) {
            return listEmptyList;
        }
        try {
            return Collections.unmodifiableList(this.mAdvancedExtenderImpl.getAvailableCaptureRequestKeys());
        } catch (Exception e13) {
            sopmlzcsov.wkgbmnqykc(TAG, "AdvancedExtenderImpl.getAvailableCaptureRequestKeys throws exceptions", e13);
            return listEmptyList;
        }
    }

    public yfnezrywwk createSessionProcessor(Context context) {
        u1.nufgyqmvbu.lqeggnwhkg(this.mCameraId, "VendorExtender#init() must be called first");
        return new AdvancedSessionProcessor(this.mAdvancedExtenderImpl.createSessionProcessor(), getSupportedParameterKeys(), this, context, this.mMode);
    }

    public Range<Long> getEstimatedCaptureLatencyRange(Size size) {
        u1.nufgyqmvbu.lqeggnwhkg(this.mCameraId, "VendorExtender#init() must be called first");
        try {
            return this.mAdvancedExtenderImpl.getEstimatedCaptureLatencyRange(this.mCameraId, size, UserVerificationMethods.USER_VERIFY_HANDPRINT);
        } catch (Throwable unused) {
            return null;
        }
    }

    public List<Pair<Integer, Size[]>> getSupportedCaptureOutputResolutions() {
        u1.nufgyqmvbu.lqeggnwhkg(this.mCameraId, "VendorExtender#init() must be called first");
        return convertResolutionMapToList(this.mAdvancedExtenderImpl.getSupportedCaptureOutputResolutions(this.mCameraId));
    }

    @Override // androidx.camera.extensions.internal.btonecajqb
    public List<CaptureResult.Key> getSupportedCaptureResultKeys() {
        List<CaptureResult.Key> listEmptyList = Collections.emptyList();
        if (gxszxtbevo.zoijcleaow().compareTo(gtknphoqwx.f3995iwizpuwonk) < 0) {
            return listEmptyList;
        }
        try {
            return Collections.unmodifiableList(this.mAdvancedExtenderImpl.getAvailableCaptureResultKeys());
        } catch (Exception e13) {
            sopmlzcsov.wkgbmnqykc(TAG, "AdvancedExtenderImpl.getAvailableCaptureResultKeys throws exceptions", e13);
            return listEmptyList;
        }
    }

    @Override // androidx.camera.extensions.internal.btonecajqb
    public Map<Integer, List<Size>> getSupportedPostviewResolutions(Size size) {
        gtknphoqwx gtknphoqwxVar = gtknphoqwx.f3993cqumvgiudr;
        return (eablkybsjg.wkgbmnqykc(gtknphoqwxVar) && gxszxtbevo.lqeggnwhkg(gtknphoqwxVar)) ? Collections.unmodifiableMap(this.mAdvancedExtenderImpl.getSupportedPostviewResolutions(size)) : Collections.emptyMap();
    }

    public List<Pair<Integer, Size[]>> getSupportedPreviewOutputResolutions() {
        u1.nufgyqmvbu.lqeggnwhkg(this.mCameraId, "VendorExtender#init() must be called first");
        return convertResolutionMapToList(this.mAdvancedExtenderImpl.getSupportedPreviewOutputResolutions(this.mCameraId));
    }

    public Size[] getSupportedYuvAnalysisResolutions() {
        u1.nufgyqmvbu.lqeggnwhkg(this.mCameraId, "VendorExtender#init() must be called first");
        return new Size[0];
    }

    public void init(agtfadlqog agtfadlqogVar) {
        jyumaefscl jyumaefsclVar = (jyumaefscl) agtfadlqogVar;
        this.mCameraId = jyumaefsclVar.zoijcleaow();
        this.mAdvancedExtenderImpl.init(this.mCameraId, lqeggnwhkg.iobyxmoadg(jyumaefsclVar));
    }

    public boolean isCaptureProcessProgressAvailable() {
        gtknphoqwx gtknphoqwxVar = gtknphoqwx.f3993cqumvgiudr;
        if (eablkybsjg.wkgbmnqykc(gtknphoqwxVar) && gxszxtbevo.lqeggnwhkg(gtknphoqwxVar)) {
            return this.mAdvancedExtenderImpl.isCaptureProcessProgressAvailable();
        }
        return false;
    }

    @Override // androidx.camera.extensions.internal.btonecajqb
    public boolean isCurrentExtensionModeAvailable() {
        gtknphoqwx gtknphoqwxVar = gtknphoqwx.f3993cqumvgiudr;
        if (eablkybsjg.wkgbmnqykc(gtknphoqwxVar) && gxszxtbevo.lqeggnwhkg(gtknphoqwxVar) && Build.VERSION.SDK_INT >= 34) {
            return getSupportedCaptureResultKeys().contains(CaptureResult.EXTENSION_CURRENT_TYPE);
        }
        return false;
    }

    public boolean isExtensionAvailable(String str, Map<String, CameraCharacteristics> map) {
        if (this.mExtensionDisabledValidator.iobyxmoadg()) {
            return false;
        }
        return this.mAdvancedExtenderImpl.isExtensionAvailable(str, map);
    }

    @Override // androidx.camera.extensions.internal.btonecajqb
    public boolean isExtensionStrengthAvailable() {
        gtknphoqwx gtknphoqwxVar = gtknphoqwx.f3993cqumvgiudr;
        if (eablkybsjg.wkgbmnqykc(gtknphoqwxVar) && gxszxtbevo.lqeggnwhkg(gtknphoqwxVar) && Build.VERSION.SDK_INT >= 34) {
            return getSupportedParameterKeys().contains(CaptureRequest.EXTENSION_STRENGTH);
        }
        return false;
    }

    @Override // androidx.camera.extensions.internal.btonecajqb
    public boolean isPostviewAvailable() {
        gtknphoqwx gtknphoqwxVar = gtknphoqwx.f3993cqumvgiudr;
        if (eablkybsjg.wkgbmnqykc(gtknphoqwxVar) && gxszxtbevo.lqeggnwhkg(gtknphoqwxVar)) {
            return this.mAdvancedExtenderImpl.isPostviewAvailable();
        }
        return false;
    }

    @Override // androidx.camera.extensions.internal.btonecajqb
    public /* bridge */ /* synthetic */ boolean willReceiveOnCaptureCompleted() {
        return super.willReceiveOnCaptureCompleted();
    }

    AdvancedVendorExtender(AdvancedExtenderImpl advancedExtenderImpl) {
        this.mExtensionDisabledValidator = new kegysxyocb.eablkybsjg();
        this.mAdvancedExtenderImpl = advancedExtenderImpl;
        this.mMode = 0;
    }
}
