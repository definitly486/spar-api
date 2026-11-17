package bz;

import android.content.Context;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: classes2.dex */
public class uwvvkdfqfp extends metgxyhuhe {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private Semaphore f17645eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final CameraManager f17646gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final oc2.iobyxmoadg f17647lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final CameraManager.AvailabilityCallback f17648nufgyqmvbu;

    class iobyxmoadg extends CameraManager.AvailabilityCallback {
        iobyxmoadg() {
        }

        private void iobyxmoadg(String str, boolean z13) {
            uwvvkdfqfp.this.f17647lqeggnwhkg.put(str, Boolean.valueOf(z13));
            uwvvkdfqfp.this.f17645eablkybsjg.release();
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAvailable(String str) {
            super.onCameraAvailable(str);
            iobyxmoadg(str, false);
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraUnavailable(String str) {
            super.onCameraUnavailable(str);
            iobyxmoadg(str, true);
        }
    }

    uwvvkdfqfp(Context context) {
        super(kc2.lqeggnwhkg.CameraUse);
        this.f17647lqeggnwhkg = new oc2.iobyxmoadg();
        this.f17648nufgyqmvbu = new iobyxmoadg();
        this.f17646gxszxtbevo = (CameraManager) context.getSystemService("camera");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bz.metgxyhuhe
    /* JADX INFO: renamed from: yadqdtsiqt, reason: merged with bridge method [inline-methods] */
    public Boolean lereixgezr() {
        Looper looper;
        try {
            this.f17645eablkybsjg = new Semaphore(1 - this.f17646gxszxtbevo.getCameraIdList().length, true);
            HandlerThread handlerThread = new HandlerThread("some");
            handlerThread.start();
            this.f17646gxszxtbevo.registerAvailabilityCallback(this.f17648nufgyqmvbu, new Handler(handlerThread.getLooper()));
            try {
                this.f17645eablkybsjg.acquire();
                this.f17646gxszxtbevo.unregisterAvailabilityCallback(this.f17648nufgyqmvbu);
                looper = handlerThread.getLooper();
            } catch (Throwable unused) {
                this.f17646gxszxtbevo.unregisterAvailabilityCallback(this.f17648nufgyqmvbu);
                looper = handlerThread.getLooper();
            }
            looper.quit();
        } catch (Throwable unused2) {
        }
        return Boolean.valueOf(this.f17647lqeggnwhkg.containsValue(Boolean.TRUE) && this.f17647lqeggnwhkg.containsValue(Boolean.FALSE));
    }
}
