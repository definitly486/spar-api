package com.google.firebase.messaging;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
class jhduphickx {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private static final long f24426dxjokdxxww = TimeUnit.HOURS.toSeconds(8);

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final ScheduledExecutorService f24428gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f24429iobyxmoadg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final ribwqtqdhb f24431nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final istkbnxepw f24432ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final FirebaseMessaging f24433wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final wwaezpbzkn f24434zoijcleaow;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Map f24427eablkybsjg = new androidx.collection.iobyxmoadg();

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private boolean f24430lqeggnwhkg = false;

    private jhduphickx(FirebaseMessaging firebaseMessaging, wwaezpbzkn wwaezpbzknVar, ribwqtqdhb ribwqtqdhbVar, istkbnxepw istkbnxepwVar, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f24433wkgbmnqykc = firebaseMessaging;
        this.f24434zoijcleaow = wwaezpbzknVar;
        this.f24431nufgyqmvbu = ribwqtqdhbVar;
        this.f24432ppxfxbqfkf = istkbnxepwVar;
        this.f24429iobyxmoadg = context;
        this.f24428gxszxtbevo = scheduledExecutorService;
    }

    private void agtfadlqog() {
        if (nufgyqmvbu()) {
            return;
        }
        vdvldrhtss(0L);
    }

    private void btonecajqb(jlmebxxoox jlmebxxooxVar) {
        synchronized (this.f24427eablkybsjg) {
            try {
                String strEablkybsjg = jlmebxxooxVar.eablkybsjg();
                if (this.f24427eablkybsjg.containsKey(strEablkybsjg)) {
                    ArrayDeque arrayDeque = (ArrayDeque) this.f24427eablkybsjg.get(strEablkybsjg);
                    TaskCompletionSource taskCompletionSource = (TaskCompletionSource) arrayDeque.poll();
                    if (taskCompletionSource != null) {
                        taskCompletionSource.setResult(null);
                    }
                    if (arrayDeque.isEmpty()) {
                        this.f24427eablkybsjg.remove(strEablkybsjg);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ jhduphickx dxjokdxxww(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, wwaezpbzkn wwaezpbzknVar, istkbnxepw istkbnxepwVar) {
        return new jhduphickx(firebaseMessaging, wwaezpbzknVar, ribwqtqdhb.iobyxmoadg(context, scheduledExecutorService), istkbnxepwVar, context, scheduledExecutorService);
    }

    static Task eablkybsjg(final FirebaseMessaging firebaseMessaging, final wwaezpbzkn wwaezpbzknVar, final istkbnxepw istkbnxepwVar, final Context context, final ScheduledExecutorService scheduledExecutorService) {
        return Tasks.call(scheduledExecutorService, new Callable() { // from class: com.google.firebase.messaging.vipkmwdibw
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return jhduphickx.dxjokdxxww(context, scheduledExecutorService, firebaseMessaging, wwaezpbzknVar, istkbnxepwVar);
            }
        });
    }

    static boolean lqeggnwhkg() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    private void ppxfxbqfkf(String str) throws IOException {
        zoijcleaow(this.f24432ppxfxbqfkf.agtfadlqog(this.f24433wkgbmnqykc.draadjrbmk(), str));
    }

    private void wkgbmnqykc(String str) throws IOException {
        zoijcleaow(this.f24432ppxfxbqfkf.ojitshcjhn(this.f24433wkgbmnqykc.draadjrbmk(), str));
    }

    private static void zoijcleaow(Task task) throws IOException {
        try {
            Tasks.await(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e13) {
            e = e13;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e14) {
            Throwable cause = e14.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e14);
            }
            throw ((RuntimeException) cause);
        } catch (TimeoutException e15) {
            e = e15;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        }
    }

    void draadjrbmk(Runnable runnable, long j13) {
        this.f24428gxszxtbevo.schedule(runnable, j13, TimeUnit.SECONDS);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002c  */
    boolean gtknphoqwx(jlmebxxoox jlmebxxooxVar) throws IOException {
        byte b13;
        try {
            String strZoijcleaow = jlmebxxooxVar.zoijcleaow();
            int iHashCode = strZoijcleaow.hashCode();
            if (iHashCode != 83) {
                if (iHashCode == 85 && strZoijcleaow.equals("U")) {
                    b13 = 1;
                } else {
                    b13 = -1;
                }
            } else if (strZoijcleaow.equals("S")) {
                b13 = 0;
            } else {
                b13 = -1;
            }
            if (b13 == 0) {
                ppxfxbqfkf(jlmebxxooxVar.ppxfxbqfkf());
                if (lqeggnwhkg()) {
                    Log.d("FirebaseMessaging", "Subscribe to topic: " + jlmebxxooxVar.ppxfxbqfkf() + " succeeded.");
                }
            } else if (b13 == 1) {
                wkgbmnqykc(jlmebxxooxVar.ppxfxbqfkf());
                if (lqeggnwhkg()) {
                    Log.d("FirebaseMessaging", "Unsubscribe from topic: " + jlmebxxooxVar.ppxfxbqfkf() + " succeeded.");
                }
            } else if (lqeggnwhkg()) {
                Log.d("FirebaseMessaging", "Unknown topic operation" + jlmebxxooxVar + ".");
            }
            return true;
        } catch (IOException e13) {
            if (!"SERVICE_NOT_AVAILABLE".equals(e13.getMessage()) && !"INTERNAL_SERVER_ERROR".equals(e13.getMessage()) && !"TOO_MANY_SUBSCRIBERS".equals(e13.getMessage())) {
                if (e13.getMessage() != null) {
                    throw e13;
                }
                Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
                return false;
            }
            Log.e("FirebaseMessaging", "Topic operation failed: " + e13.getMessage() + ". Will retry Topic operation.");
            return false;
        }
    }

    boolean gxszxtbevo() {
        return this.f24431nufgyqmvbu.zoijcleaow() != null;
    }

    synchronized boolean nufgyqmvbu() {
        return this.f24430lqeggnwhkg;
    }

    void ojitshcjhn() {
        if (gxszxtbevo()) {
            agtfadlqog();
        }
    }

    boolean rgvfuqvkyq() {
        while (true) {
            synchronized (this) {
                try {
                    jlmebxxoox jlmebxxooxVarZoijcleaow = this.f24431nufgyqmvbu.zoijcleaow();
                    if (jlmebxxooxVarZoijcleaow == null) {
                        if (lqeggnwhkg()) {
                            Log.d("FirebaseMessaging", "topic sync succeeded");
                        }
                        return true;
                    }
                    if (!gtknphoqwx(jlmebxxooxVarZoijcleaow)) {
                        return false;
                    }
                    this.f24431nufgyqmvbu.wkgbmnqykc(jlmebxxooxVarZoijcleaow);
                    btonecajqb(jlmebxxooxVarZoijcleaow);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    void vdvldrhtss(long j13) {
        draadjrbmk(new ikoacuggdj(this, this.f24429iobyxmoadg, this.f24434zoijcleaow, Math.min(Math.max(30L, 2 * j13), f24426dxjokdxxww)), j13);
        wflxmlrfwp(true);
    }

    synchronized void wflxmlrfwp(boolean z13) {
        this.f24430lqeggnwhkg = z13;
    }
}
