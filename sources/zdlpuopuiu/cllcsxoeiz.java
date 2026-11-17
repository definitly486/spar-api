package zdlpuopuiu;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Handler;
import android.util.ArrayMap;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class cllcsxoeiz {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final zoijcleaow f129689iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Map f129690zoijcleaow = new ArrayMap(4);

    static final class iobyxmoadg extends CameraManager.AvailabilityCallback {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Executor f129691iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final Object f129692ppxfxbqfkf = new Object();

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private boolean f129693wkgbmnqykc = false;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final CameraManager.AvailabilityCallback f129694zoijcleaow;

        iobyxmoadg(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
            this.f129691iobyxmoadg = executor;
            this.f129694zoijcleaow = availabilityCallback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void eablkybsjg(String str) {
            this.f129694zoijcleaow.onCameraAvailable(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void gxszxtbevo(String str) {
            this.f129694zoijcleaow.onCameraUnavailable(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void wkgbmnqykc() {
            gxszxtbevo.iobyxmoadg(this.f129694zoijcleaow);
        }

        void lqeggnwhkg() {
            synchronized (this.f129692ppxfxbqfkf) {
                this.f129693wkgbmnqykc = true;
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAccessPrioritiesChanged() {
            synchronized (this.f129692ppxfxbqfkf) {
                try {
                    if (!this.f129693wkgbmnqykc) {
                        this.f129691iobyxmoadg.execute(new Runnable() { // from class: zdlpuopuiu.jpowsppfya
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f129719zdlpuopuiu.wkgbmnqykc();
                            }
                        });
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAvailable(final String str) {
            synchronized (this.f129692ppxfxbqfkf) {
                try {
                    if (!this.f129693wkgbmnqykc) {
                        this.f129691iobyxmoadg.execute(new Runnable() { // from class: zdlpuopuiu.hcddaimhww
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f129709zdlpuopuiu.eablkybsjg(str);
                            }
                        });
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraUnavailable(final String str) {
            synchronized (this.f129692ppxfxbqfkf) {
                try {
                    if (!this.f129693wkgbmnqykc) {
                        this.f129691iobyxmoadg.execute(new Runnable() { // from class: zdlpuopuiu.hkdspvbjdz
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f129711zdlpuopuiu.gxszxtbevo(str);
                            }
                        });
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public interface zoijcleaow {
        static zoijcleaow lqeggnwhkg(Context context, Handler handler) {
            int i13 = Build.VERSION.SDK_INT;
            if (i13 >= 30) {
                return new stevsuqkhv(context);
            }
            if (i13 >= 29) {
                return new wypolnanlu(context);
            }
            return i13 >= 28 ? dsvhmnatus.dxjokdxxww(context) : kegysxyocb.nufgyqmvbu(context, handler);
        }

        String[] eablkybsjg();

        void gxszxtbevo(CameraManager.AvailabilityCallback availabilityCallback);

        void iobyxmoadg(Executor executor, CameraManager.AvailabilityCallback availabilityCallback);

        Set ppxfxbqfkf();

        void wkgbmnqykc(String str, Executor executor, CameraDevice.StateCallback stateCallback);

        CameraCharacteristics zoijcleaow(String str);
    }

    private cllcsxoeiz(zoijcleaow zoijcleaowVar) {
        this.f129689iobyxmoadg = zoijcleaowVar;
    }

    public static cllcsxoeiz iobyxmoadg(Context context) {
        return zoijcleaow(context, cdpycssgdh.draadjrbmk.iobyxmoadg());
    }

    public static cllcsxoeiz zoijcleaow(Context context, Handler handler) {
        return new cllcsxoeiz(zoijcleaow.lqeggnwhkg(context, handler));
    }

    public Set eablkybsjg() {
        return this.f129689iobyxmoadg.ppxfxbqfkf();
    }

    public void gxszxtbevo(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        this.f129689iobyxmoadg.wkgbmnqykc(str, executor, stateCallback);
    }

    public void lqeggnwhkg(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        this.f129689iobyxmoadg.iobyxmoadg(executor, availabilityCallback);
    }

    public void nufgyqmvbu(CameraManager.AvailabilityCallback availabilityCallback) {
        this.f129689iobyxmoadg.gxszxtbevo(availabilityCallback);
    }

    public pmvmpeiblj ppxfxbqfkf(String str) {
        pmvmpeiblj pmvmpeibljVarLqeggnwhkg;
        synchronized (this.f129690zoijcleaow) {
            pmvmpeibljVarLqeggnwhkg = (pmvmpeiblj) this.f129690zoijcleaow.get(str);
            if (pmvmpeibljVarLqeggnwhkg == null) {
                try {
                    pmvmpeibljVarLqeggnwhkg = pmvmpeiblj.lqeggnwhkg(this.f129689iobyxmoadg.zoijcleaow(str), str);
                    this.f129690zoijcleaow.put(str, pmvmpeibljVarLqeggnwhkg);
                } catch (AssertionError e13) {
                    throw new CameraAccessExceptionCompat(10002, e13.getMessage(), e13);
                }
            }
        }
        return pmvmpeibljVarLqeggnwhkg;
    }

    public String[] wkgbmnqykc() {
        return this.f129689iobyxmoadg.eablkybsjg();
    }
}
