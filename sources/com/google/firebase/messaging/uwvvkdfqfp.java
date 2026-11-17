package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
class uwvvkdfqfp implements ServiceConnection {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private metgxyhuhe f24492cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private boolean f24493esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final Queue f24494iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final ScheduledExecutorService f24495jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final Intent f24496yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Context f24497zdlpuopuiu;

    static class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final Intent f24498iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final TaskCompletionSource f24499zoijcleaow = new TaskCompletionSource();

        iobyxmoadg(Intent intent) {
            this.f24498iobyxmoadg = intent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void gxszxtbevo() {
            Log.w("FirebaseMessaging", "Service took too long to process intent: " + this.f24498iobyxmoadg.getAction() + " finishing.");
            wkgbmnqykc();
        }

        Task eablkybsjg() {
            return this.f24499zoijcleaow.getTask();
        }

        void ppxfxbqfkf(ScheduledExecutorService scheduledExecutorService) {
            final ScheduledFuture<?> scheduledFutureSchedule = scheduledExecutorService.schedule(new Runnable() { // from class: com.google.firebase.messaging.rlfsiqarku
                @Override // java.lang.Runnable
                public final void run() {
                    this.f24478zdlpuopuiu.gxszxtbevo();
                }
            }, 20L, TimeUnit.SECONDS);
            eablkybsjg().addOnCompleteListener(scheduledExecutorService, new OnCompleteListener() { // from class: com.google.firebase.messaging.czzsidtyhn
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    scheduledFutureSchedule.cancel(false);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void wkgbmnqykc() {
            this.f24499zoijcleaow.trySetResult(null);
        }
    }

    uwvvkdfqfp(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new NamedThreadFactory("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    private void iobyxmoadg() {
        while (!this.f24494iwizpuwonk.isEmpty()) {
            ((iobyxmoadg) this.f24494iwizpuwonk.poll()).wkgbmnqykc();
        }
    }

    private void wkgbmnqykc() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("binder is dead. start connection? ");
            sb3.append(!this.f24493esjtqupxsv);
            Log.d("FirebaseMessaging", sb3.toString());
        }
        if (this.f24493esjtqupxsv) {
            return;
        }
        this.f24493esjtqupxsv = true;
        try {
            if (ConnectionTracker.getInstance().bindService(this.f24497zdlpuopuiu, this.f24496yggfygwlhe, this, 65)) {
                return;
            } else {
                Log.e("FirebaseMessaging", "binding to the service failed");
            }
        } catch (SecurityException e13) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e13);
        }
        this.f24493esjtqupxsv = false;
        iobyxmoadg();
    }

    private synchronized void zoijcleaow() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.f24494iwizpuwonk.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                metgxyhuhe metgxyhuheVar = this.f24492cqumvgiudr;
                if (metgxyhuheVar == null || !metgxyhuheVar.isBinderAlive()) {
                    wkgbmnqykc();
                    return;
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.f24492cqumvgiudr.ppxfxbqfkf((iobyxmoadg) this.f24494iwizpuwonk.poll());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.f24493esjtqupxsv = false;
            if (iBinder instanceof metgxyhuhe) {
                this.f24492cqumvgiudr = (metgxyhuhe) iBinder;
                zoijcleaow();
                return;
            }
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            iobyxmoadg();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        zoijcleaow();
    }

    synchronized Task ppxfxbqfkf(Intent intent) {
        iobyxmoadg iobyxmoadgVar;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            iobyxmoadgVar = new iobyxmoadg(intent);
            iobyxmoadgVar.ppxfxbqfkf(this.f24495jyumaefscl);
            this.f24494iwizpuwonk.add(iobyxmoadgVar);
            zoijcleaow();
        } catch (Throwable th2) {
            throw th2;
        }
        return iobyxmoadgVar.eablkybsjg();
    }

    uwvvkdfqfp(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f24494iwizpuwonk = new ArrayDeque();
        this.f24493esjtqupxsv = false;
        Context applicationContext = context.getApplicationContext();
        this.f24497zdlpuopuiu = applicationContext;
        this.f24496yggfygwlhe = new Intent(str).setPackage(applicationContext.getPackageName());
        this.f24495jyumaefscl = scheduledExecutorService;
    }
}
