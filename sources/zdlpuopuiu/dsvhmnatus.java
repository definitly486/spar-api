package zdlpuopuiu;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
class dsvhmnatus extends kegysxyocb {
    dsvhmnatus(Context context) {
        super(context, null);
    }

    private boolean btonecajqb(Throwable th2) {
        return Build.VERSION.SDK_INT == 28 && gtknphoqwx(th2);
    }

    private void draadjrbmk(Throwable th2) throws CameraAccessExceptionCompat {
        throw new CameraAccessExceptionCompat(10001, th2);
    }

    static dsvhmnatus dxjokdxxww(Context context) {
        return new dsvhmnatus(context);
    }

    private static boolean gtknphoqwx(Throwable th2) {
        StackTraceElement[] stackTrace;
        if (!th2.getClass().equals(RuntimeException.class) || (stackTrace = th2.getStackTrace()) == null || stackTrace.length < 0) {
            return false;
        }
        return "_enableShutterSound".equals(stackTrace[0].getMethodName());
    }

    @Override // zdlpuopuiu.kegysxyocb, zdlpuopuiu.cllcsxoeiz.zoijcleaow
    public void gxszxtbevo(CameraManager.AvailabilityCallback availabilityCallback) {
        this.f129722iobyxmoadg.unregisterAvailabilityCallback(availabilityCallback);
    }

    @Override // zdlpuopuiu.kegysxyocb, zdlpuopuiu.cllcsxoeiz.zoijcleaow
    public void iobyxmoadg(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        this.f129722iobyxmoadg.registerAvailabilityCallback(executor, availabilityCallback);
    }

    @Override // zdlpuopuiu.kegysxyocb, zdlpuopuiu.cllcsxoeiz.zoijcleaow
    public void wkgbmnqykc(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws CameraAccessExceptionCompat {
        try {
            this.f129722iobyxmoadg.openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e13) {
            throw CameraAccessExceptionCompat.dxjokdxxww(e13);
        } catch (IllegalArgumentException e14) {
        } catch (SecurityException e15) {
            throw e15;
        } catch (RuntimeException e16) {
            if (btonecajqb(e16)) {
                draadjrbmk(e16);
            }
            throw e16;
        }
    }

    @Override // zdlpuopuiu.kegysxyocb, zdlpuopuiu.cllcsxoeiz.zoijcleaow
    public CameraCharacteristics zoijcleaow(String str) throws CameraAccessExceptionCompat {
        try {
            return super.zoijcleaow(str);
        } catch (RuntimeException e13) {
            if (btonecajqb(e13)) {
                draadjrbmk(e13);
            }
            throw e13;
        }
    }
}
