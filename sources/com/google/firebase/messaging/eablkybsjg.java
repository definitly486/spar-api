package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Tasks;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
class eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ExecutorService f24376iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ylkuphrtab f24377ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Context f24378zoijcleaow;

    public eablkybsjg(Context context, ylkuphrtab ylkuphrtabVar, ExecutorService executorService) {
        this.f24376iobyxmoadg = executorService;
        this.f24378zoijcleaow = context;
        this.f24377ppxfxbqfkf = ylkuphrtabVar;
    }

    private void eablkybsjg(androidx.core.app.wflxmlrfwp.eablkybsjg eablkybsjgVar, yadqdtsiqt yadqdtsiqtVar) {
        if (yadqdtsiqtVar == null) {
            return;
        }
        try {
            Bitmap bitmap = (Bitmap) Tasks.await(yadqdtsiqtVar.dxjokdxxww(), 5L, TimeUnit.SECONDS);
            eablkybsjgVar.agtfadlqog(bitmap);
            eablkybsjgVar.jyumaefscl(new androidx.core.app.wflxmlrfwp.zoijcleaow().btonecajqb(bitmap).nufgyqmvbu(null));
        } catch (InterruptedException unused) {
            Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
            yadqdtsiqtVar.close();
            Thread.currentThread().interrupt();
        } catch (ExecutionException e13) {
            Log.w("FirebaseMessaging", "Failed to download image: " + e13.getCause());
        } catch (TimeoutException unused2) {
            Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
            yadqdtsiqtVar.close();
        }
    }

    private void ppxfxbqfkf(ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) this.f24378zoijcleaow.getSystemService("notification")).notify(iobyxmoadgVar.f24473zoijcleaow, iobyxmoadgVar.f24472ppxfxbqfkf, iobyxmoadgVar.f24471iobyxmoadg.zoijcleaow());
    }

    private yadqdtsiqt wkgbmnqykc() {
        yadqdtsiqt yadqdtsiqtVarNufgyqmvbu = yadqdtsiqt.nufgyqmvbu(this.f24377ppxfxbqfkf.rgvfuqvkyq("gcm.n.image"));
        if (yadqdtsiqtVarNufgyqmvbu != null) {
            yadqdtsiqtVarNufgyqmvbu.draadjrbmk(this.f24376iobyxmoadg);
        }
        return yadqdtsiqtVarNufgyqmvbu;
    }

    private boolean zoijcleaow() {
        if (((KeyguardManager) this.f24378zoijcleaow.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!PlatformVersion.isAtLeastLollipop()) {
            SystemClock.sleep(10L);
        }
        int iMyPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f24378zoijcleaow.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == iMyPid) {
                return runningAppProcessInfo.importance == 100;
            }
        }
        return false;
    }

    boolean iobyxmoadg() {
        if (this.f24377ppxfxbqfkf.iobyxmoadg("gcm.n.noui")) {
            return true;
        }
        if (zoijcleaow()) {
            return false;
        }
        yadqdtsiqt yadqdtsiqtVarWkgbmnqykc = wkgbmnqykc();
        ppxfxbqfkf.iobyxmoadg iobyxmoadgVarEablkybsjg = ppxfxbqfkf.eablkybsjg(this.f24378zoijcleaow, this.f24377ppxfxbqfkf);
        eablkybsjg(iobyxmoadgVarEablkybsjg.f24471iobyxmoadg, yadqdtsiqtVarWkgbmnqykc);
        ppxfxbqfkf(iobyxmoadgVarEablkybsjg);
        return true;
    }
}
