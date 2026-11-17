package androidx.camera.extensions.internal;

import android.hardware.camera2.CaptureResult;
import istkbnxepw.agtfadlqog;
import istkbnxepw.draadjrbmk;
import istkbnxepw.ojitshcjhn;
import istkbnxepw.opjhrmiecq;
import istkbnxepw.wflxmlrfwp;
import java.nio.BufferUnderflowException;
import lereixgezr.sopmlzcsov;

/* JADX INFO: loaded from: classes.dex */
public class wkgbmnqykc implements ojitshcjhn {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final opjhrmiecq f4094iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final CaptureResult f4095zoijcleaow;

    public wkgbmnqykc(opjhrmiecq opjhrmiecqVar, CaptureResult captureResult) {
        this.f4094iobyxmoadg = opjhrmiecqVar;
        this.f4095zoijcleaow = captureResult;
    }

    @Override // istkbnxepw.ojitshcjhn
    public draadjrbmk eablkybsjg() {
        Integer num = (Integer) this.f4095zoijcleaow.get(CaptureResult.CONTROL_AF_STATE);
        if (num == null) {
            return draadjrbmk.UNKNOWN;
        }
        switch (num.intValue()) {
            case 0:
                return draadjrbmk.INACTIVE;
            case 1:
            case 3:
                return draadjrbmk.SCANNING;
            case 2:
                return draadjrbmk.PASSIVE_FOCUSED;
            case 4:
                return draadjrbmk.LOCKED_FOCUSED;
            case 5:
                return draadjrbmk.LOCKED_NOT_FOCUSED;
            case 6:
                return draadjrbmk.PASSIVE_NOT_FOCUSED;
            default:
                sopmlzcsov.ppxfxbqfkf("C2CameraCaptureResult", "Undefined af state: " + num);
                return draadjrbmk.UNKNOWN;
        }
    }

    @Override // istkbnxepw.ojitshcjhn
    public long getTimestamp() {
        Long l13 = (Long) this.f4095zoijcleaow.get(CaptureResult.SENSOR_TIMESTAMP);
        if (l13 == null) {
            return -1L;
        }
        return l13.longValue();
    }

    @Override // istkbnxepw.ojitshcjhn
    public wflxmlrfwp gxszxtbevo() {
        Integer num = (Integer) this.f4095zoijcleaow.get(CaptureResult.CONTROL_AWB_STATE);
        if (num == null) {
            return wflxmlrfwp.UNKNOWN;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return wflxmlrfwp.INACTIVE;
        }
        if (iIntValue == 1) {
            return wflxmlrfwp.METERING;
        }
        if (iIntValue == 2) {
            return wflxmlrfwp.CONVERGED;
        }
        if (iIntValue == 3) {
            return wflxmlrfwp.LOCKED;
        }
        sopmlzcsov.ppxfxbqfkf("C2CameraCaptureResult", "Undefined awb state: " + num);
        return wflxmlrfwp.UNKNOWN;
    }

    @Override // istkbnxepw.ojitshcjhn
    public opjhrmiecq iobyxmoadg() {
        return this.f4094iobyxmoadg;
    }

    @Override // istkbnxepw.ojitshcjhn
    public istkbnxepw.gtknphoqwx lqeggnwhkg() {
        Integer num = (Integer) this.f4095zoijcleaow.get(CaptureResult.CONTROL_AE_STATE);
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
                sopmlzcsov.ppxfxbqfkf("C2CameraCaptureResult", "Undefined ae state: " + num);
                return istkbnxepw.gtknphoqwx.UNKNOWN;
            }
        }
        return istkbnxepw.gtknphoqwx.SEARCHING;
    }

    @Override // istkbnxepw.ojitshcjhn
    public agtfadlqog ppxfxbqfkf() {
        Integer num = (Integer) this.f4095zoijcleaow.get(CaptureResult.FLASH_STATE);
        if (num == null) {
            return agtfadlqog.UNKNOWN;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0 || iIntValue == 1) {
            return agtfadlqog.NONE;
        }
        if (iIntValue == 2) {
            return agtfadlqog.READY;
        }
        if (iIntValue == 3 || iIntValue == 4) {
            return agtfadlqog.FIRED;
        }
        sopmlzcsov.ppxfxbqfkf("C2CameraCaptureResult", "Undefined flash state: " + num);
        return agtfadlqog.UNKNOWN;
    }

    @Override // istkbnxepw.ojitshcjhn
    public CaptureResult wkgbmnqykc() {
        return this.f4095zoijcleaow;
    }

    @Override // istkbnxepw.ojitshcjhn
    public void zoijcleaow(cdpycssgdh.nufgyqmvbu.zoijcleaow zoijcleaowVar) {
        super.zoijcleaow(zoijcleaowVar);
        try {
            Integer num = (Integer) this.f4095zoijcleaow.get(CaptureResult.JPEG_ORIENTATION);
            if (num != null) {
                zoijcleaowVar.wflxmlrfwp(num.intValue());
            }
        } catch (BufferUnderflowException unused) {
            sopmlzcsov.draadjrbmk("C2CameraCaptureResult", "Failed to get JPEG orientation.");
        }
        Long l13 = (Long) this.f4095zoijcleaow.get(CaptureResult.SENSOR_EXPOSURE_TIME);
        if (l13 != null) {
            zoijcleaowVar.gxszxtbevo(l13.longValue());
        }
        Float f13 = (Float) this.f4095zoijcleaow.get(CaptureResult.LENS_APERTURE);
        if (f13 != null) {
            zoijcleaowVar.draadjrbmk(f13.floatValue());
        }
        Integer numValueOf = (Integer) this.f4095zoijcleaow.get(CaptureResult.SENSOR_SENSITIVITY);
        if (numValueOf != null) {
            Integer num2 = (Integer) this.f4095zoijcleaow.get(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST);
            if (num2 != null) {
                numValueOf = Integer.valueOf(numValueOf.intValue() * ((int) (num2.intValue() / 100.0f)));
            }
            zoijcleaowVar.gtknphoqwx(numValueOf.intValue());
        }
        Float f14 = (Float) this.f4095zoijcleaow.get(CaptureResult.LENS_FOCAL_LENGTH);
        if (f14 != null) {
            zoijcleaowVar.nufgyqmvbu(f14.floatValue());
        }
        Integer num3 = (Integer) this.f4095zoijcleaow.get(CaptureResult.CONTROL_AWB_MODE);
        if (num3 != null) {
            cdpycssgdh.nufgyqmvbu.ppxfxbqfkf ppxfxbqfkfVar = cdpycssgdh.nufgyqmvbu.ppxfxbqfkf.AUTO;
            if (num3.intValue() == 0) {
                ppxfxbqfkfVar = cdpycssgdh.nufgyqmvbu.ppxfxbqfkf.MANUAL;
            }
            zoijcleaowVar.agtfadlqog(ppxfxbqfkfVar);
        }
    }

    public wkgbmnqykc(CaptureResult captureResult) {
        this(opjhrmiecq.zoijcleaow(), captureResult);
    }
}
