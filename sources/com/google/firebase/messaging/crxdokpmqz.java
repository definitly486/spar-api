package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
class crxdokpmqz implements Runnable {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    ExecutorService f24366iwizpuwonk = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("firebase-iid-executor"));

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final FirebaseMessaging f24367jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final PowerManager.WakeLock f24368yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final long f24369zdlpuopuiu;

    static class iobyxmoadg extends BroadcastReceiver {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private crxdokpmqz f24370iobyxmoadg;

        public iobyxmoadg(crxdokpmqz crxdokpmqzVar) {
            this.f24370iobyxmoadg = crxdokpmqzVar;
        }

        public void iobyxmoadg() {
            if (crxdokpmqz.ppxfxbqfkf()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            this.f24370iobyxmoadg.zoijcleaow().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            crxdokpmqz crxdokpmqzVar = this.f24370iobyxmoadg;
            if (crxdokpmqzVar != null && crxdokpmqzVar.wkgbmnqykc()) {
                if (crxdokpmqz.ppxfxbqfkf()) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                this.f24370iobyxmoadg.f24367jyumaefscl.agtfadlqog(this.f24370iobyxmoadg, 0L);
                this.f24370iobyxmoadg.zoijcleaow().unregisterReceiver(this);
                this.f24370iobyxmoadg = null;
            }
        }
    }

    public crxdokpmqz(FirebaseMessaging firebaseMessaging, long j13) {
        this.f24367jyumaefscl = firebaseMessaging;
        this.f24369zdlpuopuiu = j13;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) zoijcleaow().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f24368yggfygwlhe = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    static boolean ppxfxbqfkf() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    boolean eablkybsjg() throws IOException {
        try {
            if (this.f24367jyumaefscl.draadjrbmk() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            }
            Log.d("FirebaseMessaging", "Token successfully retrieved");
            return true;
        } catch (IOException e13) {
            if (!istkbnxepw.dxjokdxxww(e13.getMessage())) {
                if (e13.getMessage() != null) {
                    throw e13;
                }
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            Log.w("FirebaseMessaging", "Token retrieval failed: " + e13.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (mbcevpiqjq.zoijcleaow().eablkybsjg(zoijcleaow())) {
            this.f24368yggfygwlhe.acquire();
        }
        try {
            this.f24367jyumaefscl.pkzmftpjix(true);
            if (!this.f24367jyumaefscl.lereixgezr()) {
                this.f24367jyumaefscl.pkzmftpjix(false);
            } else if (mbcevpiqjq.zoijcleaow().wkgbmnqykc(zoijcleaow()) && !wkgbmnqykc()) {
                new iobyxmoadg(this).iobyxmoadg();
            } else {
                if (eablkybsjg()) {
                    this.f24367jyumaefscl.pkzmftpjix(false);
                } else {
                    this.f24367jyumaefscl.cllcsxoeiz(this.f24369zdlpuopuiu);
                }
            }
        } catch (IOException e13) {
            Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e13.getMessage() + ". Won't retry the operation.");
            this.f24367jyumaefscl.pkzmftpjix(false);
        } finally {
            if (mbcevpiqjq.zoijcleaow().eablkybsjg(zoijcleaow())) {
                this.f24368yggfygwlhe.release();
            }
        }
    }

    boolean wkgbmnqykc() {
        ConnectivityManager connectivityManager = (ConnectivityManager) zoijcleaow().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    Context zoijcleaow() {
        return this.f24367jyumaefscl.ojitshcjhn();
    }
}
