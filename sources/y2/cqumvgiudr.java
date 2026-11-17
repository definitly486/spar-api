package y2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class cqumvgiudr {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static cqumvgiudr f123530gxszxtbevo;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private boolean f123531eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Executor f123532iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Object f123533ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private int f123534wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final CopyOnWriteArrayList f123535zoijcleaow;

    /* JADX INFO: Access modifiers changed from: private */
    final class eablkybsjg extends BroadcastReceiver {
        private eablkybsjg() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void zoijcleaow(Context context) {
            cqumvgiudr.this.dxjokdxxww(context);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(final Context context, Intent intent) {
            cqumvgiudr.this.f123532iobyxmoadg.execute(new Runnable() { // from class: y2.istkbnxepw
                @Override // java.lang.Runnable
                public final void run() {
                    this.f123558zdlpuopuiu.zoijcleaow(context);
                }
            });
        }
    }

    public interface ppxfxbqfkf {
        void iobyxmoadg(int i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final WeakReference f123537iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final Executor f123539zoijcleaow;

        public wkgbmnqykc(ppxfxbqfkf ppxfxbqfkfVar, Executor executor) {
            this.f123537iobyxmoadg = new WeakReference(ppxfxbqfkfVar);
            this.f123539zoijcleaow = executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void wkgbmnqykc() {
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) this.f123537iobyxmoadg.get();
            if (ppxfxbqfkfVar != null) {
                ppxfxbqfkfVar.iobyxmoadg(cqumvgiudr.this.lqeggnwhkg());
            }
        }

        public boolean ppxfxbqfkf() {
            return this.f123537iobyxmoadg.get() == null;
        }

        public void zoijcleaow() {
            this.f123539zoijcleaow.execute(new Runnable() { // from class: y2.zynmafqrjb
                @Override // java.lang.Runnable
                public final void run() {
                    this.f123639zdlpuopuiu.wkgbmnqykc();
                }
            });
        }
    }

    private static final class zoijcleaow {

        private static final class iobyxmoadg extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final cqumvgiudr f123540iobyxmoadg;

            public iobyxmoadg(cqumvgiudr cqumvgiudrVar) {
                this.f123540iobyxmoadg = cqumvgiudrVar;
            }

            public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
                int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
                this.f123540iobyxmoadg.agtfadlqog(overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5 ? 10 : 5);
            }
        }

        public static void iobyxmoadg(Context context, cqumvgiudr cqumvgiudrVar) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) y2.iobyxmoadg.eablkybsjg((TelephonyManager) context.getSystemService("phone"));
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(cqumvgiudrVar);
                telephonyManager.registerTelephonyCallback(cqumvgiudrVar.f123532iobyxmoadg, iobyxmoadgVar);
                telephonyManager.unregisterTelephonyCallback(iobyxmoadgVar);
            } catch (RuntimeException unused) {
                cqumvgiudrVar.agtfadlqog(5);
            }
        }
    }

    private cqumvgiudr(final Context context) {
        Executor executorIobyxmoadg = y2.ppxfxbqfkf.iobyxmoadg();
        this.f123532iobyxmoadg = executorIobyxmoadg;
        this.f123535zoijcleaow = new CopyOnWriteArrayList();
        this.f123533ppxfxbqfkf = new Object();
        this.f123534wkgbmnqykc = 0;
        executorIobyxmoadg.execute(new Runnable() { // from class: y2.iwizpuwonk
            @Override // java.lang.Runnable
            public final void run() {
                this.f123560zdlpuopuiu.gtknphoqwx(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void agtfadlqog(int i13) {
        wflxmlrfwp();
        synchronized (this.f123533ppxfxbqfkf) {
            try {
                if (this.f123531eablkybsjg && this.f123534wkgbmnqykc == i13) {
                    return;
                }
                this.f123531eablkybsjg = true;
                this.f123534wkgbmnqykc = i13;
                Iterator it = this.f123535zoijcleaow.iterator();
                while (it.hasNext()) {
                    ((wkgbmnqykc) it.next()).zoijcleaow();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: btonecajqb, reason: merged with bridge method [inline-methods] */
    public void gtknphoqwx(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new eablkybsjg(), intentFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dxjokdxxww(Context context) {
        int iNufgyqmvbu = nufgyqmvbu(context);
        if (stevsuqkhv.f123602iobyxmoadg < 31 || iNufgyqmvbu != 5) {
            agtfadlqog(iNufgyqmvbu);
        } else {
            zoijcleaow.iobyxmoadg(context, this);
        }
    }

    public static synchronized cqumvgiudr eablkybsjg(Context context) {
        try {
            if (f123530gxszxtbevo == null) {
                f123530gxszxtbevo = new cqumvgiudr(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f123530gxszxtbevo;
    }

    private static int gxszxtbevo(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
                return 3;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 17:
                return 4;
            case 13:
                return 5;
            case 16:
            case 19:
            default:
                return 6;
            case 18:
                return 2;
            case 20:
                return stevsuqkhv.f123602iobyxmoadg >= 29 ? 9 : 0;
        }
    }

    private static int nufgyqmvbu(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i13 = 0;
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            i13 = 1;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type == 1) {
                        return 2;
                    }
                    if (type != 4 && type != 5) {
                        if (type != 6) {
                            return type != 9 ? 8 : 7;
                        }
                        return 5;
                    }
                }
                return gxszxtbevo(activeNetworkInfo);
            }
        } catch (SecurityException unused) {
        }
        return i13;
    }

    private void wflxmlrfwp() {
        for (wkgbmnqykc wkgbmnqykcVar : this.f123535zoijcleaow) {
            if (wkgbmnqykcVar.ppxfxbqfkf()) {
                this.f123535zoijcleaow.remove(wkgbmnqykcVar);
            }
        }
    }

    public void draadjrbmk(ppxfxbqfkf ppxfxbqfkfVar, Executor executor) {
        boolean z13;
        wflxmlrfwp();
        wkgbmnqykc wkgbmnqykcVar = new wkgbmnqykc(ppxfxbqfkfVar, executor);
        synchronized (this.f123533ppxfxbqfkf) {
            this.f123535zoijcleaow.add(wkgbmnqykcVar);
            z13 = this.f123531eablkybsjg;
        }
        if (z13) {
            wkgbmnqykcVar.zoijcleaow();
        }
    }

    public int lqeggnwhkg() {
        int i13;
        synchronized (this.f123533ppxfxbqfkf) {
            i13 = this.f123534wkgbmnqykc;
        }
        return i13;
    }
}
