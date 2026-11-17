package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.stats.WakeLock;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
abstract class jztzpxfvev {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static WakeLock f24443ppxfxbqfkf;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    static final long f24442iobyxmoadg = TimeUnit.MINUTES.toMillis(1);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final Object f24444zoijcleaow = new Object();

    static void gxszxtbevo(Context context, uwvvkdfqfp uwvvkdfqfpVar, final Intent intent) {
        synchronized (f24444zoijcleaow) {
            try {
                zoijcleaow(context);
                boolean zWkgbmnqykc = wkgbmnqykc(intent);
                lqeggnwhkg(intent, true);
                if (!zWkgbmnqykc) {
                    f24443ppxfxbqfkf.acquire(f24442iobyxmoadg);
                }
                uwvvkdfqfpVar.ppxfxbqfkf(intent).addOnCompleteListener(new OnCompleteListener() { // from class: com.google.firebase.messaging.okpsazkaxt
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        jztzpxfvev.ppxfxbqfkf(intent);
                    }
                });
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static void lqeggnwhkg(Intent intent, boolean z13) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z13);
    }

    static ComponentName nufgyqmvbu(Context context, Intent intent) {
        synchronized (f24444zoijcleaow) {
            try {
                zoijcleaow(context);
                boolean zWkgbmnqykc = wkgbmnqykc(intent);
                lqeggnwhkg(intent, true);
                ComponentName componentNameStartService = context.startService(intent);
                if (componentNameStartService == null) {
                    return null;
                }
                if (!zWkgbmnqykc) {
                    f24443ppxfxbqfkf.acquire(f24442iobyxmoadg);
                }
                return componentNameStartService;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void ppxfxbqfkf(Intent intent) {
        synchronized (f24444zoijcleaow) {
            try {
                if (f24443ppxfxbqfkf != null && wkgbmnqykc(intent)) {
                    lqeggnwhkg(intent, false);
                    f24443ppxfxbqfkf.release();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static boolean wkgbmnqykc(Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    private static void zoijcleaow(Context context) {
        if (f24443ppxfxbqfkf == null) {
            WakeLock wakeLock = new WakeLock(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            f24443ppxfxbqfkf = wakeLock;
            wakeLock.setReferenceCounted(true);
        }
    }
}
