package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraAccessException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class CameraAccessExceptionCompat extends Exception {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final CameraAccessException f3619yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final int f3620zdlpuopuiu;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    static final Set f3618jyumaefscl = Collections.unmodifiableSet(new HashSet(Arrays.asList(4, 5, 1, 2, 3)));

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    static final Set f3617iwizpuwonk = Collections.unmodifiableSet(new HashSet(Arrays.asList(10001, 10002)));

    public CameraAccessExceptionCompat(int i13, String str, Throwable th2) {
        super(iobyxmoadg(i13, str), th2);
        this.f3620zdlpuopuiu = i13;
        this.f3619yggfygwlhe = f3618jyumaefscl.contains(Integer.valueOf(i13)) ? new CameraAccessException(i13, str, th2) : null;
    }

    public static CameraAccessExceptionCompat dxjokdxxww(CameraAccessException cameraAccessException) {
        if (cameraAccessException != null) {
            return new CameraAccessExceptionCompat(cameraAccessException);
        }
        throw new NullPointerException("cameraAccessException should not be null");
    }

    private static String iobyxmoadg(int i13, String str) {
        return String.format("%s (%d): %s", lqeggnwhkg(i13), Integer.valueOf(i13), str);
    }

    private static String lqeggnwhkg(int i13) {
        if (i13 == 1) {
            return "CAMERA_DISABLED";
        }
        if (i13 == 2) {
            return "CAMERA_DISCONNECTED";
        }
        if (i13 == 3) {
            return "CAMERA_ERROR";
        }
        if (i13 == 4) {
            return "CAMERA_IN_USE";
        }
        if (i13 == 5) {
            return "MAX_CAMERAS_IN_USE";
        }
        if (i13 == 1000) {
            return "CAMERA_DEPRECATED_HAL";
        }
        if (i13 != 10001) {
            return i13 != 10002 ? "<UNKNOWN ERROR>" : "CAMERA_CHARACTERISTICS_CREATION_ERROR";
        }
        return "CAMERA_UNAVAILABLE_DO_NOT_DISTURB";
    }

    private static String wkgbmnqykc(int i13) {
        if (i13 == 1) {
            return "The camera is disabled due to a device policy, and cannot be opened.";
        }
        if (i13 == 2) {
            return "The camera device is removable and has been disconnected from the Android device, or the camera service has shut down the connection due to a higher-priority access request for the camera device.";
        }
        if (i13 == 3) {
            return "The camera device is currently in the error state; no further calls to it will succeed.";
        }
        if (i13 == 4) {
            return "The camera device is in use already";
        }
        if (i13 == 5) {
            return "The system-wide limit for number of open cameras has been reached, and more camera devices cannot be opened until previous instances are closed.";
        }
        if (i13 == 10001) {
            return "Some API 28 devices cannot access the camera when the device is in \"Do Not Disturb\" mode. The camera will not be accessible until \"Do Not Disturb\" mode is disabled.";
        }
        if (i13 != 10002) {
            return null;
        }
        return "Failed to create CameraCharacteristics.";
    }

    public final int nufgyqmvbu() {
        return this.f3620zdlpuopuiu;
    }

    public CameraAccessExceptionCompat(int i13, Throwable th2) {
        super(wkgbmnqykc(i13), th2);
        this.f3620zdlpuopuiu = i13;
        this.f3619yggfygwlhe = f3618jyumaefscl.contains(Integer.valueOf(i13)) ? new CameraAccessException(i13, null, th2) : null;
    }

    private CameraAccessExceptionCompat(CameraAccessException cameraAccessException) {
        super(cameraAccessException.getMessage(), cameraAccessException.getCause());
        this.f3620zdlpuopuiu = cameraAccessException.getReason();
        this.f3619yggfygwlhe = cameraAccessException;
    }
}
