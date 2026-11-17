package zdlpuopuiu;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class pmvmpeiblj {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f129745ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final iobyxmoadg f129747zoijcleaow;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Map f129744iobyxmoadg = new HashMap();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private tzroggbefp f129746wkgbmnqykc = null;

    public interface iobyxmoadg {
        CameraCharacteristics iobyxmoadg();

        Set ppxfxbqfkf();

        Object zoijcleaow(CameraCharacteristics.Key key);
    }

    private pmvmpeiblj(CameraCharacteristics cameraCharacteristics, String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f129747zoijcleaow = new cqumvgiudr(cameraCharacteristics);
        } else {
            this.f129747zoijcleaow = new esjtqupxsv(cameraCharacteristics);
        }
        this.f129745ppxfxbqfkf = str;
    }

    public static pmvmpeiblj lqeggnwhkg(CameraCharacteristics cameraCharacteristics, String str) {
        return new pmvmpeiblj(cameraCharacteristics, str);
    }

    private boolean wkgbmnqykc(CameraCharacteristics.Key key) {
        return key.equals(CameraCharacteristics.SENSOR_ORIENTATION);
    }

    public boolean eablkybsjg() {
        int[] iArr;
        if (Build.VERSION.SDK_INT >= 34 && (iArr = (int[]) this.f129747zoijcleaow.zoijcleaow(CameraCharacteristics.CONTROL_AVAILABLE_SETTINGS_OVERRIDES)) != null) {
            for (int i13 : iArr) {
                if (i13 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public CameraCharacteristics gxszxtbevo() {
        return this.f129747zoijcleaow.iobyxmoadg();
    }

    public Object iobyxmoadg(CameraCharacteristics.Key key) {
        if (wkgbmnqykc(key)) {
            return this.f129747zoijcleaow.zoijcleaow(key);
        }
        synchronized (this) {
            try {
                Object obj = this.f129744iobyxmoadg.get(key);
                if (obj != null) {
                    return obj;
                }
                Object objZoijcleaow = this.f129747zoijcleaow.zoijcleaow(key);
                if (objZoijcleaow != null) {
                    this.f129744iobyxmoadg.put(key, objZoijcleaow);
                }
                return objZoijcleaow;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public tzroggbefp ppxfxbqfkf() {
        if (this.f129746wkgbmnqykc == null) {
            try {
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) iobyxmoadg(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                if (streamConfigurationMap == null) {
                    throw new IllegalArgumentException("StreamConfigurationMap is null!");
                }
                this.f129746wkgbmnqykc = tzroggbefp.eablkybsjg(streamConfigurationMap, new iwizpuwonk.wflxmlrfwp(this.f129745ppxfxbqfkf));
            } catch (AssertionError | NullPointerException e13) {
                throw new IllegalArgumentException(e13.getMessage());
            }
        }
        return this.f129746wkgbmnqykc;
    }

    public Set zoijcleaow() {
        return this.f129747zoijcleaow.ppxfxbqfkf();
    }
}
