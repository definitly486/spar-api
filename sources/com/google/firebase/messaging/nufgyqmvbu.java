package com.google.firebase.messaging;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public abstract class nufgyqmvbu extends Service {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private int f24460iwizpuwonk;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private Binder f24462yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    final ExecutorService f24463zdlpuopuiu = agtfadlqog.wkgbmnqykc();

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final Object f24461jyumaefscl = new Object();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private int f24459cqumvgiudr = 0;

    class iobyxmoadg implements metgxyhuhe.iobyxmoadg {
        iobyxmoadg() {
        }

        @Override // com.google.firebase.messaging.metgxyhuhe.iobyxmoadg
        public Task iobyxmoadg(Intent intent) {
            return nufgyqmvbu.this.btonecajqb(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task btonecajqb(final Intent intent) {
        if (lqeggnwhkg(intent)) {
            return Tasks.forResult(null);
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f24463zdlpuopuiu.execute(new Runnable() { // from class: com.google.firebase.messaging.lqeggnwhkg
            @Override // java.lang.Runnable
            public final void run() {
                this.f24451zdlpuopuiu.dxjokdxxww(intent, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void dxjokdxxww(Intent intent, TaskCompletionSource taskCompletionSource) {
        try {
            gxszxtbevo(intent);
        } finally {
            taskCompletionSource.setResult(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void nufgyqmvbu(Intent intent, Task task) {
        wkgbmnqykc(intent);
    }

    private void wkgbmnqykc(Intent intent) {
        if (intent != null) {
            jztzpxfvev.ppxfxbqfkf(intent);
        }
        synchronized (this.f24461jyumaefscl) {
            try {
                int i13 = this.f24459cqumvgiudr - 1;
                this.f24459cqumvgiudr = i13;
                if (i13 == 0) {
                    gtknphoqwx(this.f24460iwizpuwonk);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected abstract Intent eablkybsjg(Intent intent);

    boolean gtknphoqwx(int i13) {
        return stopSelfResult(i13);
    }

    public abstract void gxszxtbevo(Intent intent);

    public boolean lqeggnwhkg(Intent intent) {
        return false;
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "Service received bind request");
            }
            if (this.f24462yggfygwlhe == null) {
                this.f24462yggfygwlhe = new metgxyhuhe(new iobyxmoadg());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f24462yggfygwlhe;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f24463zdlpuopuiu.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i13, int i14) {
        synchronized (this.f24461jyumaefscl) {
            this.f24460iwizpuwonk = i14;
            this.f24459cqumvgiudr++;
        }
        Intent intentEablkybsjg = eablkybsjg(intent);
        if (intentEablkybsjg == null) {
            wkgbmnqykc(intent);
            return 2;
        }
        Task taskBtonecajqb = btonecajqb(intentEablkybsjg);
        if (taskBtonecajqb.isComplete()) {
            wkgbmnqykc(intent);
            return 2;
        }
        taskBtonecajqb.addOnCompleteListener(new l5.zoijcleaow(), new OnCompleteListener() { // from class: com.google.firebase.messaging.gxszxtbevo
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f24381iobyxmoadg.nufgyqmvbu(intent, task);
            }
        });
        return 3;
    }
}
