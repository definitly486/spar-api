package kcexrzcfyt;

import android.hardware.camera2.CaptureResult;
import java.nio.BufferUnderflowException;

/* JADX INFO: loaded from: classes.dex */
public class nufgyqmvbu implements istkbnxepw.ojitshcjhn {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final istkbnxepw.opjhrmiecq f54890iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final CaptureResult f54891zoijcleaow;

    public nufgyqmvbu(istkbnxepw.opjhrmiecq opjhrmiecqVar, CaptureResult captureResult) {
        this.f54890iobyxmoadg = opjhrmiecqVar;
        this.f54891zoijcleaow = captureResult;
    }

    @Override // istkbnxepw.ojitshcjhn
    public istkbnxepw.draadjrbmk eablkybsjg() {
        Integer num = (Integer) this.f54891zoijcleaow.get(CaptureResult.CONTROL_AF_STATE);
        if (num == null) {
            return istkbnxepw.draadjrbmk.UNKNOWN;
        }
        switch (num.intValue()) {
            case 0:
                return istkbnxepw.draadjrbmk.INACTIVE;
            case 1:
            case 3:
                return istkbnxepw.draadjrbmk.SCANNING;
            case 2:
                return istkbnxepw.draadjrbmk.PASSIVE_FOCUSED;
            case 4:
                return istkbnxepw.draadjrbmk.LOCKED_FOCUSED;
            case 5:
                return istkbnxepw.draadjrbmk.LOCKED_NOT_FOCUSED;
            case 6:
                return istkbnxepw.draadjrbmk.PASSIVE_NOT_FOCUSED;
            default:
                lereixgezr.sopmlzcsov.ppxfxbqfkf("C2CameraCaptureResult", "Undefined af state: " + num);
                return istkbnxepw.draadjrbmk.UNKNOWN;
        }
    }

    @Override // istkbnxepw.ojitshcjhn
    public long getTimestamp() {
        Long l13 = (Long) this.f54891zoijcleaow.get(CaptureResult.SENSOR_TIMESTAMP);
        if (l13 == null) {
            return -1L;
        }
        return l13.longValue();
    }

    @Override // istkbnxepw.ojitshcjhn
    public istkbnxepw.wflxmlrfwp gxszxtbevo() {
        Integer num = (Integer) this.f54891zoijcleaow.get(CaptureResult.CONTROL_AWB_STATE);
        if (num == null) {
            return istkbnxepw.wflxmlrfwp.UNKNOWN;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return istkbnxepw.wflxmlrfwp.INACTIVE;
        }
        if (iIntValue == 1) {
            return istkbnxepw.wflxmlrfwp.METERING;
        }
        if (iIntValue == 2) {
            return istkbnxepw.wflxmlrfwp.CONVERGED;
        }
        if (iIntValue == 3) {
            return istkbnxepw.wflxmlrfwp.LOCKED;
        }
        lereixgezr.sopmlzcsov.ppxfxbqfkf("C2CameraCaptureResult", "Undefined awb state: " + num);
        return istkbnxepw.wflxmlrfwp.UNKNOWN;
    }

    @Override // istkbnxepw.ojitshcjhn
    public istkbnxepw.opjhrmiecq iobyxmoadg() {
        return this.f54890iobyxmoadg;
    }

    @Override // istkbnxepw.ojitshcjhn
    public istkbnxepw.gtknphoqwx lqeggnwhkg() {
        Integer num = (Integer) this.f54891zoijcleaow.get(CaptureResult.CONTROL_AE_STATE);
        if (num == null) {
            return istkbnxepw.gtknphoqwx.UNKNOWN;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return istkbnxepw.gtknphoqwx.INACTIVE;
        }
        if (iIntValue != 1) {
            if (iIntValue == 2) {
                return istkbnxepw.gtknphoqwx.CONVERGED;
            }
            if (iIntValue == 3) {
                return istkbnxepw.gtknphoqwx.LOCKED;
            }
            if (iIntValue == 4) {
                return istkbnxepw.gtknphoqwx.FLASH_REQUIRED;
            }
            if (iIntValue != 5) {
                lereixgezr.sopmlzcsov.ppxfxbqfkf("C2CameraCaptureResult", "Undefined ae state: " + num);
                return istkbnxepw.gtknphoqwx.UNKNOWN;
            }
        }
        return istkbnxepw.gtknphoqwx.SEARCHING;
    }

    @Override // istkbnxepw.ojitshcjhn
    public istkbnxepw.agtfadlqog ppxfxbqfkf() {
        Integer num = (Integer) this.f54891zoijcleaow.get(CaptureResult.FLASH_STATE);
        if (num == null) {
            return istkbnxepw.agtfadlqog.UNKNOWN;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0 || iIntValue == 1) {
            return istkbnxepw.agtfadlqog.NONE;
        }
        if (iIntValue == 2) {
            return istkbnxepw.agtfadlqog.READY;
        }
        if (iIntValue == 3 || iIntValue == 4) {
            return istkbnxepw.agtfadlqog.FIRED;
        }
        lereixgezr.sopmlzcsov.ppxfxbqfkf("C2CameraCaptureResult", "Undefined flash state: " + num);
        return istkbnxepw.agtfadlqog.UNKNOWN;
    }

    @Override // istkbnxepw.ojitshcjhn
    public CaptureResult wkgbmnqykc() {
        return this.f54891zoijcleaow;
    }

    @Override // istkbnxepw.ojitshcjhn
    public void zoijcleaow(cdpycssgdh.nufgyqmvbu.zoijcleaow zoijcleaowVar) {
        super.zoijcleaow(zoijcleaowVar);
        try {
            Integer num = (Integer) this.f54891zoijcleaow.get(CaptureResult.JPEG_ORIENTATION);
            if (num != null) {
                zoijcleaowVar.wflxmlrfwp(num.intValue());
            }
        } catch (BufferUnderflowException unused) {
            lereixgezr.sopmlzcsov.draadjrbmk("C2CameraCaptureResult", "Failed to get JPEG orientation.");
        }
        Long l13 = (Long) this.f54891zoijcleaow.get(CaptureResult.SENSOR_EXPOSURE_TIME);
        if (l13 != null) {
            zoijcleaowVar.gxszxtbevo(l13.longValue());
        }
        Float f13 = (Float) this.f54891zoijcleaow.get(CaptureResult.LENS_APERTURE);
        if (f13 != null) {
            zoijcleaowVar.draadjrbmk(f13.floatValue());
        }
        Integer numValueOf = (Integer) this.f54891zoijcleaow.get(CaptureResult.SENSOR_SENSITIVITY);
        if (numValueOf != null) {
            Integer num2 = (Integer) this.f54891zoijcleaow.get(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST);
            if (num2 != null) {
                numValueOf = Integer.valueOf(numValueOf.intValue() * ((int) (num2.intValue() / 100.0f)));
            }
            zoijcleaowVar.gtknphoqwx(numValueOf.intValue());
        }
        Float f14 = (Float) this.f54891zoijcleaow.get(CaptureResult.LENS_FOCAL_LENGTH);
        if (f14 != null) {
            zoijcleaowVar.nufgyqmvbu(f14.floatValue());
        }
        Integer num3 = (Integer) this.f54891zoijcleaow.get(CaptureResult.CONTROL_AWB_MODE);
        if (num3 != null) {
            cdpycssgdh.nufgyqmvbu.ppxfxbqfkf ppxfxbqfkfVar = cdpycssgdh.nufgyqmvbu.ppxfxbqfkf.AUTO;
            if (num3.intValue() == 0) {
                ppxfxbqfkfVar = cdpycssgdh.nufgyqmvbu.ppxfxbqfkf.MANUAL;
            }
            zoijcleaowVar.agtfadlqog(ppxfxbqfkfVar);
        }
    }

    public nufgyqmvbu(CaptureResult captureResult) {
        this(istkbnxepw.opjhrmiecq.zoijcleaow(), captureResult);
    }
}
