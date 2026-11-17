package t6;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.TelephonyManager;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
final class b1 {

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private static final Set f109772gtknphoqwx = jyumaefscl.iobyxmoadg(ppxfxbqfkf.READ_PHONE_STATE, ppxfxbqfkf.ACCESS_COARSE_LOCATION);

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private Handler f109773btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private HandlerThread f109774dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private boolean f109775eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private ServiceState f109776gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final TelephonyManager f109777iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private long f109778lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private CountDownLatch f109779nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private PhoneStateListener f109780ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private oipsdeybqn f109781wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Context f109782zoijcleaow;

    class iobyxmoadg extends PhoneStateListener {
        iobyxmoadg() {
        }

        @Override // android.telephony.PhoneStateListener
        public void onServiceStateChanged(ServiceState serviceState) {
            b1.this.gtknphoqwx(serviceState);
        }
    }

    b1(Context context, TelephonyManager telephonyManager) {
        this.f109782zoijcleaow = context;
        this.f109777iobyxmoadg = telephonyManager;
    }

    private ServiceState btonecajqb() {
        if (this.f109776gxszxtbevo == null || this.f109778lqeggnwhkg + 1000 >= System.currentTimeMillis()) {
            return null;
        }
        return this.f109776gxszxtbevo;
    }

    private synchronized void dxjokdxxww() {
        try {
            this.f109775eablkybsjg = true;
            HandlerThread handlerThread = new HandlerThread("PhoneStateListener");
            this.f109774dxjokdxxww = handlerThread;
            handlerThread.start();
            Handler handler = new Handler(this.f109774dxjokdxxww.getLooper());
            this.f109773btonecajqb = handler;
            if (Build.VERSION.SDK_INT >= 31) {
                this.f109781wkgbmnqykc = oipsdeybqn.iobyxmoadg(this.f109777iobyxmoadg, new h3.iozdgvuglv(handler), new oipsdeybqn.iobyxmoadg() { // from class: t6.z0
                    @Override // t6.oipsdeybqn.iobyxmoadg
                    public final void iobyxmoadg(ServiceState serviceState) {
                        this.f109913iobyxmoadg.gtknphoqwx(serviceState);
                    }
                });
            } else {
                handler.post(new Runnable() { // from class: t6.a1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f109769zdlpuopuiu.eablkybsjg();
                    }
                });
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void eablkybsjg() {
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg();
        this.f109780ppxfxbqfkf = iobyxmoadgVar;
        this.f109777iobyxmoadg.listen(iobyxmoadgVar, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gtknphoqwx(ServiceState serviceState) {
        this.f109776gxszxtbevo = serviceState;
        this.f109778lqeggnwhkg = System.currentTimeMillis();
        lqeggnwhkg();
        CountDownLatch countDownLatch = this.f109779nufgyqmvbu;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    private ServiceState gxszxtbevo() {
        ServiceState serviceStateBtonecajqb = btonecajqb();
        if (serviceStateBtonecajqb != null || this.f109777iobyxmoadg.getSimState() == 1) {
            return serviceStateBtonecajqb;
        }
        this.f109779nufgyqmvbu = new CountDownLatch(1);
        dxjokdxxww();
        try {
            this.f109779nufgyqmvbu.await(1000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
        }
        lqeggnwhkg();
        return this.f109776gxszxtbevo;
    }

    private synchronized void lqeggnwhkg() {
        try {
            if (this.f109775eablkybsjg) {
                this.f109775eablkybsjg = false;
                if (Build.VERSION.SDK_INT >= 31) {
                    oipsdeybqn.zoijcleaow(this.f109777iobyxmoadg, this.f109781wkgbmnqykc);
                    this.f109781wkgbmnqykc = null;
                } else {
                    this.f109773btonecajqb.post(new Runnable() { // from class: t6.y0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f109910zdlpuopuiu.nufgyqmvbu();
                        }
                    });
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void nufgyqmvbu() {
        PhoneStateListener phoneStateListener = this.f109780ppxfxbqfkf;
        if (phoneStateListener != null) {
            this.f109777iobyxmoadg.listen(phoneStateListener, 0);
            this.f109780ppxfxbqfkf = null;
        }
        this.f109774dxjokdxxww.quitSafely();
    }

    private static boolean wflxmlrfwp(Context context) {
        Iterator it = f109772gtknphoqwx.iterator();
        while (it.hasNext()) {
            if (!skhdrjzrfn.iobyxmoadg(context, ((ppxfxbqfkf) it.next()).iobyxmoadg())) {
                return false;
            }
        }
        return true;
    }

    public ServiceState wkgbmnqykc() {
        if (!wflxmlrfwp(this.f109782zoijcleaow)) {
            return gxszxtbevo();
        }
        try {
            return this.f109777iobyxmoadg.getServiceState();
        } catch (SecurityException unused) {
            return gxszxtbevo();
        }
    }
}
