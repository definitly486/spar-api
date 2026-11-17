package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
class ikoacuggdj implements Runnable {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private static final Object f24386esjtqupxsv = new Object();

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private static Boolean f24387lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private static Boolean f24388pmvmpeiblj;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final long f24389cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final jhduphickx f24390iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final PowerManager.WakeLock f24391jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final wwaezpbzkn f24392yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Context f24393zdlpuopuiu;

    class iobyxmoadg extends BroadcastReceiver {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private ikoacuggdj f24394iobyxmoadg;

        public iobyxmoadg(ikoacuggdj ikoacuggdjVar) {
            this.f24394iobyxmoadg = ikoacuggdjVar;
        }

        public void iobyxmoadg() {
            if (ikoacuggdj.btonecajqb()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            ikoacuggdj.this.f24393zdlpuopuiu.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            try {
                ikoacuggdj ikoacuggdjVar = this.f24394iobyxmoadg;
                if (ikoacuggdjVar == null) {
                    return;
                }
                if (ikoacuggdjVar.dxjokdxxww()) {
                    if (ikoacuggdj.btonecajqb()) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    this.f24394iobyxmoadg.f24390iwizpuwonk.draadjrbmk(this.f24394iobyxmoadg, 0L);
                    context.unregisterReceiver(this);
                    this.f24394iobyxmoadg = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    ikoacuggdj(jhduphickx jhduphickxVar, Context context, wwaezpbzkn wwaezpbzknVar, long j13) {
        this.f24390iwizpuwonk = jhduphickxVar;
        this.f24393zdlpuopuiu = context;
        this.f24389cqumvgiudr = j13;
        this.f24392yggfygwlhe = wwaezpbzknVar;
        this.f24391jyumaefscl = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean btonecajqb() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean dxjokdxxww() {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f24393zdlpuopuiu.getSystemService("connectivity");
            activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        } catch (Throwable th2) {
            throw th2;
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    private static String eablkybsjg(String str) {
        return "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest";
    }

    private static boolean gxszxtbevo(Context context) {
        boolean zBooleanValue;
        synchronized (f24386esjtqupxsv) {
            try {
                Boolean bool = f24388pmvmpeiblj;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? lqeggnwhkg(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
                f24388pmvmpeiblj = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zBooleanValue;
    }

    private static boolean lqeggnwhkg(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z13 = context.checkCallingOrSelfPermission(str) == 0;
        if (!z13 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", eablkybsjg(str));
        }
        return z13;
    }

    private static boolean nufgyqmvbu(Context context) {
        boolean zBooleanValue;
        synchronized (f24386esjtqupxsv) {
            try {
                Boolean bool = f24387lereixgezr;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? lqeggnwhkg(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
                f24387lereixgezr = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zBooleanValue;
    }

    @Override // java.lang.Runnable
    public void run() {
        PowerManager.WakeLock wakeLock;
        if (nufgyqmvbu(this.f24393zdlpuopuiu)) {
            this.f24391jyumaefscl.acquire(wkgbmnqykc.f24510iobyxmoadg);
        }
        try {
            try {
                try {
                    this.f24390iwizpuwonk.wflxmlrfwp(true);
                    if (!this.f24392yggfygwlhe.lqeggnwhkg()) {
                        this.f24390iwizpuwonk.wflxmlrfwp(false);
                        if (nufgyqmvbu(this.f24393zdlpuopuiu)) {
                            try {
                                this.f24391jyumaefscl.release();
                                return;
                            } catch (RuntimeException unused) {
                                Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                                return;
                            }
                        }
                        return;
                    }
                    if (gxszxtbevo(this.f24393zdlpuopuiu) && !dxjokdxxww()) {
                        new iobyxmoadg(this).iobyxmoadg();
                        if (nufgyqmvbu(this.f24393zdlpuopuiu)) {
                            try {
                                this.f24391jyumaefscl.release();
                                return;
                            } catch (RuntimeException unused2) {
                                Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                                return;
                            }
                        }
                        return;
                    }
                    if (this.f24390iwizpuwonk.rgvfuqvkyq()) {
                        this.f24390iwizpuwonk.wflxmlrfwp(false);
                    } else {
                        this.f24390iwizpuwonk.vdvldrhtss(this.f24389cqumvgiudr);
                    }
                    if (nufgyqmvbu(this.f24393zdlpuopuiu)) {
                        wakeLock = this.f24391jyumaefscl;
                        wakeLock.release();
                    }
                } catch (Throwable th2) {
                    if (nufgyqmvbu(this.f24393zdlpuopuiu)) {
                        try {
                            this.f24391jyumaefscl.release();
                        } catch (RuntimeException unused3) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                    throw th2;
                }
            } catch (IOException e13) {
                Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e13.getMessage());
                this.f24390iwizpuwonk.wflxmlrfwp(false);
                if (!nufgyqmvbu(this.f24393zdlpuopuiu)) {
                } else {
                    wakeLock = this.f24391jyumaefscl;
                }
            }
        } catch (RuntimeException unused4) {
            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
        }
    }
}
