package zdlpuopuiu;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
class kegysxyocb implements cllcsxoeiz.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    final CameraManager f129722iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    final Object f129723zoijcleaow;

    static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final Map f129724iobyxmoadg = new HashMap();

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final Handler f129725zoijcleaow;

        iobyxmoadg(Handler handler) {
            this.f129725zoijcleaow = handler;
        }
    }

    kegysxyocb(Context context, Object obj) {
        this.f129722iobyxmoadg = (CameraManager) context.getSystemService("camera");
        this.f129723zoijcleaow = obj;
    }

    static kegysxyocb nufgyqmvbu(Context context, Handler handler) {
        return new kegysxyocb(context, new iobyxmoadg(handler));
    }

    @Override // zdlpuopuiu.cllcsxoeiz.zoijcleaow
    public String[] eablkybsjg() throws CameraAccessExceptionCompat {
        try {
            return this.f129722iobyxmoadg.getCameraIdList();
        } catch (CameraAccessException e13) {
            throw CameraAccessExceptionCompat.dxjokdxxww(e13);
        }
    }

    @Override // zdlpuopuiu.cllcsxoeiz.zoijcleaow
    public void gxszxtbevo(CameraManager.AvailabilityCallback availabilityCallback) {
        cllcsxoeiz.iobyxmoadg iobyxmoadgVar;
        if (availabilityCallback != null) {
            iobyxmoadg iobyxmoadgVar2 = (iobyxmoadg) this.f129723zoijcleaow;
            synchronized (iobyxmoadgVar2.f129724iobyxmoadg) {
                iobyxmoadgVar = (cllcsxoeiz.iobyxmoadg) iobyxmoadgVar2.f129724iobyxmoadg.remove(availabilityCallback);
            }
        } else {
            iobyxmoadgVar = null;
        }
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.lqeggnwhkg();
        }
        this.f129722iobyxmoadg.unregisterAvailabilityCallback(iobyxmoadgVar);
    }

    @Override // zdlpuopuiu.cllcsxoeiz.zoijcleaow
    public void iobyxmoadg(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        cllcsxoeiz.iobyxmoadg iobyxmoadgVar;
        if (executor == null) {
            throw new IllegalArgumentException("executor was null");
        }
        iobyxmoadg iobyxmoadgVar2 = (iobyxmoadg) this.f129723zoijcleaow;
        if (availabilityCallback != null) {
            synchronized (iobyxmoadgVar2.f129724iobyxmoadg) {
                try {
                    iobyxmoadgVar = (cllcsxoeiz.iobyxmoadg) iobyxmoadgVar2.f129724iobyxmoadg.get(availabilityCallback);
                    if (iobyxmoadgVar == null) {
                        iobyxmoadgVar = new cllcsxoeiz.iobyxmoadg(executor, availabilityCallback);
                        iobyxmoadgVar2.f129724iobyxmoadg.put(availabilityCallback, iobyxmoadgVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else {
            iobyxmoadgVar = null;
        }
        this.f129722iobyxmoadg.registerAvailabilityCallback(iobyxmoadgVar, iobyxmoadgVar2.f129725zoijcleaow);
    }

    @Override // zdlpuopuiu.cllcsxoeiz.zoijcleaow
    public Set ppxfxbqfkf() {
        return Collections.emptySet();
    }

    @Override // zdlpuopuiu.cllcsxoeiz.zoijcleaow
    public void wkgbmnqykc(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws CameraAccessExceptionCompat {
        u1.nufgyqmvbu.gxszxtbevo(executor);
        u1.nufgyqmvbu.gxszxtbevo(stateCallback);
        try {
            this.f129722iobyxmoadg.openCamera(str, new zynmafqrjb.zoijcleaow(executor, stateCallback), ((iobyxmoadg) this.f129723zoijcleaow).f129725zoijcleaow);
        } catch (CameraAccessException e13) {
            throw CameraAccessExceptionCompat.dxjokdxxww(e13);
        }
    }

    @Override // zdlpuopuiu.cllcsxoeiz.zoijcleaow
    public CameraCharacteristics zoijcleaow(String str) throws CameraAccessExceptionCompat {
        try {
            return this.f129722iobyxmoadg.getCameraCharacteristics(str);
        } catch (CameraAccessException e13) {
            throw CameraAccessExceptionCompat.dxjokdxxww(e13);
        }
    }
}
