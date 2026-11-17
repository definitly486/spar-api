package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Executor f24731iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private Task f24732ppxfxbqfkf = null;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final yggfygwlhe f24733zoijcleaow;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final Map f24730wkgbmnqykc = new HashMap();

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final Executor f24729eablkybsjg = new l5.zoijcleaow();

    private static class zoijcleaow implements OnSuccessListener, OnFailureListener, OnCanceledListener {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final CountDownLatch f24734iobyxmoadg;

        private zoijcleaow() {
            this.f24734iobyxmoadg = new CountDownLatch(1);
        }

        public boolean iobyxmoadg(long j13, TimeUnit timeUnit) {
            return this.f24734iobyxmoadg.await(j13, timeUnit);
        }

        @Override // com.google.android.gms.tasks.OnCanceledListener
        public void onCanceled() {
            this.f24734iobyxmoadg.countDown();
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public void onFailure(Exception exc) {
            this.f24734iobyxmoadg.countDown();
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        public void onSuccess(Object obj) {
            this.f24734iobyxmoadg.countDown();
        }
    }

    private gxszxtbevo(Executor executor, yggfygwlhe yggfygwlheVar) {
        this.f24731iobyxmoadg = executor;
        this.f24733zoijcleaow = yggfygwlheVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task btonecajqb(boolean z13, lqeggnwhkg lqeggnwhkgVar, Void r13) {
        if (z13) {
            wflxmlrfwp(lqeggnwhkgVar);
        }
        return Tasks.forResult(lqeggnwhkgVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void dxjokdxxww(lqeggnwhkg lqeggnwhkgVar) {
        return this.f24733zoijcleaow.eablkybsjg(lqeggnwhkgVar);
    }

    public static synchronized gxszxtbevo nufgyqmvbu(Executor executor, yggfygwlhe yggfygwlheVar) {
        String strZoijcleaow;
        Map map;
        try {
            strZoijcleaow = yggfygwlheVar.zoijcleaow();
            map = f24730wkgbmnqykc;
            if (!map.containsKey(strZoijcleaow)) {
                map.put(strZoijcleaow, new gxszxtbevo(executor, yggfygwlheVar));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (gxszxtbevo) map.get(strZoijcleaow);
    }

    private static Object ppxfxbqfkf(Task task, long j13, TimeUnit timeUnit) throws ExecutionException, TimeoutException {
        zoijcleaow zoijcleaowVar = new zoijcleaow();
        Executor executor = f24729eablkybsjg;
        task.addOnSuccessListener(executor, zoijcleaowVar);
        task.addOnFailureListener(executor, zoijcleaowVar);
        task.addOnCanceledListener(executor, zoijcleaowVar);
        if (!zoijcleaowVar.iobyxmoadg(j13, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        }
        if (task.isSuccessful()) {
            return task.getResult();
        }
        throw new ExecutionException(task.getException());
    }

    private synchronized void wflxmlrfwp(lqeggnwhkg lqeggnwhkgVar) {
        this.f24732ppxfxbqfkf = Tasks.forResult(lqeggnwhkgVar);
    }

    public Task draadjrbmk(final lqeggnwhkg lqeggnwhkgVar, final boolean z13) {
        return Tasks.call(this.f24731iobyxmoadg, new Callable() { // from class: com.google.firebase.remoteconfig.internal.wkgbmnqykc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f24819iobyxmoadg.dxjokdxxww(lqeggnwhkgVar);
            }
        }).onSuccessTask(this.f24731iobyxmoadg, new SuccessContinuation() { // from class: com.google.firebase.remoteconfig.internal.eablkybsjg
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return this.f24724iobyxmoadg.btonecajqb(z13, lqeggnwhkgVar, (Void) obj);
            }
        });
    }

    public synchronized Task eablkybsjg() {
        try {
            Task task = this.f24732ppxfxbqfkf;
            if (task == null || (task.isComplete() && !this.f24732ppxfxbqfkf.isSuccessful())) {
                Executor executor = this.f24731iobyxmoadg;
                final yggfygwlhe yggfygwlheVar = this.f24733zoijcleaow;
                Objects.requireNonNull(yggfygwlheVar);
                this.f24732ppxfxbqfkf = Tasks.call(executor, new Callable() { // from class: com.google.firebase.remoteconfig.internal.ppxfxbqfkf
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return yggfygwlheVar.wkgbmnqykc();
                    }
                });
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f24732ppxfxbqfkf;
    }

    public Task gtknphoqwx(lqeggnwhkg lqeggnwhkgVar) {
        return draadjrbmk(lqeggnwhkgVar, true);
    }

    public lqeggnwhkg gxszxtbevo() {
        return lqeggnwhkg(5L);
    }

    lqeggnwhkg lqeggnwhkg(long j13) {
        synchronized (this) {
            try {
                Task task = this.f24732ppxfxbqfkf;
                if (task != null && task.isSuccessful()) {
                    return (lqeggnwhkg) this.f24732ppxfxbqfkf.getResult();
                }
                try {
                    return (lqeggnwhkg) ppxfxbqfkf(eablkybsjg(), j13, TimeUnit.SECONDS);
                } catch (InterruptedException | ExecutionException | TimeoutException e13) {
                    Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", e13);
                    return null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void wkgbmnqykc() {
        synchronized (this) {
            this.f24732ppxfxbqfkf = Tasks.forResult(null);
        }
        this.f24733zoijcleaow.iobyxmoadg();
    }
}
