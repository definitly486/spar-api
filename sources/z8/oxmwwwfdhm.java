package z8;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class oxmwwwfdhm {

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static volatile oxmwwwfdhm f129284wkgbmnqykc;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ppxfxbqfkf f129285iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private boolean f129286ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    final Set f129287zoijcleaow = new HashSet();

    class iobyxmoadg implements g9.gxszxtbevo.zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ Context f129288iobyxmoadg;

        iobyxmoadg(Context context) {
            this.f129288iobyxmoadg = context;
        }

        @Override // g9.gxszxtbevo.zoijcleaow
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public ConnectivityManager get() {
            return (ConnectivityManager) this.f129288iobyxmoadg.getSystemService("connectivity");
        }
    }

    private interface ppxfxbqfkf {
        void iobyxmoadg();

        boolean zoijcleaow();
    }

    private static final class wkgbmnqykc implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        boolean f129290iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final g9.gxszxtbevo.zoijcleaow f129291ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final ConnectivityManager.NetworkCallback f129292wkgbmnqykc = new iobyxmoadg();

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final z8.zoijcleaow.iobyxmoadg f129293zoijcleaow;

        class iobyxmoadg extends ConnectivityManager.NetworkCallback {

            /* JADX INFO: renamed from: z8.oxmwwwfdhm$wkgbmnqykc$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            class RunnableC3285iobyxmoadg implements Runnable {

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                final /* synthetic */ boolean f129296zdlpuopuiu;

                RunnableC3285iobyxmoadg(boolean z13) {
                    this.f129296zdlpuopuiu = z13;
                }

                @Override // java.lang.Runnable
                public void run() {
                    iobyxmoadg.this.iobyxmoadg(this.f129296zdlpuopuiu);
                }
            }

            iobyxmoadg() {
            }

            private void zoijcleaow(boolean z13) {
                g9.draadjrbmk.yggfygwlhe(new RunnableC3285iobyxmoadg(z13));
            }

            void iobyxmoadg(boolean z13) {
                g9.draadjrbmk.iobyxmoadg();
                wkgbmnqykc wkgbmnqykcVar = wkgbmnqykc.this;
                boolean z14 = wkgbmnqykcVar.f129290iobyxmoadg;
                wkgbmnqykcVar.f129290iobyxmoadg = z13;
                if (z14 != z13) {
                    wkgbmnqykcVar.f129293zoijcleaow.iobyxmoadg(z13);
                }
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                zoijcleaow(true);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                zoijcleaow(false);
            }
        }

        wkgbmnqykc(g9.gxszxtbevo.zoijcleaow zoijcleaowVar, z8.zoijcleaow.iobyxmoadg iobyxmoadgVar) {
            this.f129291ppxfxbqfkf = zoijcleaowVar;
            this.f129293zoijcleaow = iobyxmoadgVar;
        }

        @Override // z8.oxmwwwfdhm.ppxfxbqfkf
        public void iobyxmoadg() {
            ((ConnectivityManager) this.f129291ppxfxbqfkf.get()).unregisterNetworkCallback(this.f129292wkgbmnqykc);
        }

        @Override // z8.oxmwwwfdhm.ppxfxbqfkf
        public boolean zoijcleaow() {
            this.f129290iobyxmoadg = ((ConnectivityManager) this.f129291ppxfxbqfkf.get()).getActiveNetwork() != null;
            try {
                ((ConnectivityManager) this.f129291ppxfxbqfkf.get()).registerDefaultNetworkCallback(this.f129292wkgbmnqykc);
                return true;
            } catch (RuntimeException e13) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register callback", e13);
                }
                return false;
            }
        }
    }

    class zoijcleaow implements z8.zoijcleaow.iobyxmoadg {
        zoijcleaow() {
        }

        @Override // z8.zoijcleaow.iobyxmoadg
        public void iobyxmoadg(boolean z13) {
            ArrayList arrayList;
            g9.draadjrbmk.iobyxmoadg();
            synchronized (oxmwwwfdhm.this) {
                arrayList = new ArrayList(oxmwwwfdhm.this.f129287zoijcleaow);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((z8.zoijcleaow.iobyxmoadg) it.next()).iobyxmoadg(z13);
            }
        }
    }

    private oxmwwwfdhm(Context context) {
        this.f129285iobyxmoadg = new wkgbmnqykc(g9.gxszxtbevo.iobyxmoadg(new iobyxmoadg(context)), new zoijcleaow());
    }

    static oxmwwwfdhm iobyxmoadg(Context context) {
        if (f129284wkgbmnqykc == null) {
            synchronized (oxmwwwfdhm.class) {
                try {
                    if (f129284wkgbmnqykc == null) {
                        f129284wkgbmnqykc = new oxmwwwfdhm(context.getApplicationContext());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f129284wkgbmnqykc;
    }

    private void ppxfxbqfkf() {
        if (this.f129286ppxfxbqfkf && this.f129287zoijcleaow.isEmpty()) {
            this.f129285iobyxmoadg.iobyxmoadg();
            this.f129286ppxfxbqfkf = false;
        }
    }

    private void zoijcleaow() {
        if (this.f129286ppxfxbqfkf || this.f129287zoijcleaow.isEmpty()) {
            return;
        }
        this.f129286ppxfxbqfkf = this.f129285iobyxmoadg.zoijcleaow();
    }

    synchronized void eablkybsjg(z8.zoijcleaow.iobyxmoadg iobyxmoadgVar) {
        this.f129287zoijcleaow.remove(iobyxmoadgVar);
        ppxfxbqfkf();
    }

    synchronized void wkgbmnqykc(z8.zoijcleaow.iobyxmoadg iobyxmoadgVar) {
        this.f129287zoijcleaow.add(iobyxmoadgVar);
        zoijcleaow();
    }
}
