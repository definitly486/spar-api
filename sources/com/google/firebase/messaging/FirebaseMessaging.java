package com.google.firebase.messaging;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class FirebaseMessaging {

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    static ScheduledExecutorService f24309ojitshcjhn;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private static sopmlzcsov f24310wflxmlrfwp;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private boolean f24311btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final wwaezpbzkn f24312dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final iobyxmoadg f24313eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final Application.ActivityLifecycleCallbacks f24314gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final Executor f24315gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final com.google.firebase.gxszxtbevo f24316iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final Executor f24317lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final Task f24318nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final istkbnxepw f24319ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final tzroggbefp f24320wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Context f24321zoijcleaow;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private static final long f24308draadjrbmk = TimeUnit.HOURS.toSeconds(8);

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    static tc.zoijcleaow f24307agtfadlqog = new tc.zoijcleaow() { // from class: com.google.firebase.messaging.rgvfuqvkyq
        @Override // tc.zoijcleaow
        public final Object get() {
            return FirebaseMessaging.ylkuphrtab();
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final qc.wkgbmnqykc f24323iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private qc.zoijcleaow f24324ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private Boolean f24325wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private boolean f24326zoijcleaow;

        iobyxmoadg(qc.wkgbmnqykc wkgbmnqykcVar) {
            this.f24323iobyxmoadg = wkgbmnqykcVar;
        }

        private Boolean eablkybsjg() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context contextGtknphoqwx = FirebaseMessaging.this.f24316iobyxmoadg.gtknphoqwx();
            SharedPreferences sharedPreferences = contextGtknphoqwx.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = contextGtknphoqwx.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(contextGtknphoqwx.getPackageName(), UserVerificationMethods.USER_VERIFY_PATTERN)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void wkgbmnqykc(qc.iobyxmoadg iobyxmoadgVar) {
            if (ppxfxbqfkf()) {
                FirebaseMessaging.this.hkdspvbjdz();
            }
        }

        synchronized boolean ppxfxbqfkf() {
            Boolean bool;
            try {
                zoijcleaow();
                bool = this.f24325wkgbmnqykc;
            } catch (Throwable th2) {
                throw th2;
            }
            return bool != null ? bool.booleanValue() : FirebaseMessaging.this.f24316iobyxmoadg.zdlpuopuiu();
        }

        synchronized void zoijcleaow() {
            try {
                if (this.f24326zoijcleaow) {
                    return;
                }
                Boolean boolEablkybsjg = eablkybsjg();
                this.f24325wkgbmnqykc = boolEablkybsjg;
                if (boolEablkybsjg == null) {
                    qc.zoijcleaow zoijcleaowVar = new qc.zoijcleaow() { // from class: com.google.firebase.messaging.lereixgezr
                        @Override // qc.zoijcleaow
                        public final void iobyxmoadg(qc.iobyxmoadg iobyxmoadgVar) {
                            this.f24448iobyxmoadg.wkgbmnqykc(iobyxmoadgVar);
                        }
                    };
                    this.f24324ppxfxbqfkf = zoijcleaowVar;
                    this.f24323iobyxmoadg.iobyxmoadg(com.google.firebase.zoijcleaow.class, zoijcleaowVar);
                }
                this.f24326zoijcleaow = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    FirebaseMessaging(com.google.firebase.gxszxtbevo gxszxtbevoVar, sc.iobyxmoadg iobyxmoadgVar, tc.zoijcleaow zoijcleaowVar, tc.zoijcleaow zoijcleaowVar2, uc.eablkybsjg eablkybsjgVar, tc.zoijcleaow zoijcleaowVar3, qc.wkgbmnqykc wkgbmnqykcVar) {
        this(gxszxtbevoVar, iobyxmoadgVar, zoijcleaowVar, zoijcleaowVar2, eablkybsjgVar, zoijcleaowVar3, wkgbmnqykcVar, new wwaezpbzkn(gxszxtbevoVar.gtknphoqwx()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void cdpycssgdh(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(draadjrbmk());
        } catch (Exception e13) {
            taskCompletionSource.setException(e13);
        }
    }

    private void cqumvgiudr(String str) {
        if ("[DEFAULT]".equals(this.f24316iobyxmoadg.wflxmlrfwp())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Invoking onNewToken for app: " + this.f24316iobyxmoadg.wflxmlrfwp());
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new wflxmlrfwp(this.f24321zoijcleaow).gtknphoqwx(intent);
        }
    }

    @Keep
    static synchronized FirebaseMessaging getInstance(com.google.firebase.gxszxtbevo gxszxtbevoVar) {
        FirebaseMessaging firebaseMessaging;
        firebaseMessaging = (FirebaseMessaging) gxszxtbevoVar.btonecajqb(FirebaseMessaging.class);
        Preconditions.checkNotNull(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    private boolean hcddaimhww() {
        cllcsxoeiz.ppxfxbqfkf(this.f24321zoijcleaow);
        if (!cllcsxoeiz.wkgbmnqykc(this.f24321zoijcleaow)) {
            return false;
        }
        if (this.f24316iobyxmoadg.btonecajqb(sb.iobyxmoadg.class) != null) {
            return true;
        }
        return lmojexxdyd.iobyxmoadg() && f24307agtfadlqog != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hkdspvbjdz() {
        if (dsvhmnatus(zdlpuopuiu())) {
            jpowsppfya();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void iozdgvuglv() {
        if (esjtqupxsv()) {
            hkdspvbjdz();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void istkbnxepw(TaskCompletionSource taskCompletionSource) {
        try {
            Tasks.await(this.f24319ppxfxbqfkf.ppxfxbqfkf());
            vdvldrhtss(this.f24321zoijcleaow).wkgbmnqykc(oxmwwwfdhm(), wwaezpbzkn.ppxfxbqfkf(this.f24316iobyxmoadg));
            taskCompletionSource.setResult(null);
        } catch (Exception e13) {
            taskCompletionSource.setException(e13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: iwizpuwonk, reason: merged with bridge method [inline-methods] */
    public void wwaezpbzkn() {
        cllcsxoeiz.ppxfxbqfkf(this.f24321zoijcleaow);
        wypolnanlu.lqeggnwhkg(this.f24321zoijcleaow, this.f24319ppxfxbqfkf, hcddaimhww());
        if (hcddaimhww()) {
            jyumaefscl();
        }
    }

    private synchronized void jpowsppfya() {
        if (!this.f24311btonecajqb) {
            cllcsxoeiz(0L);
        }
    }

    private void jyumaefscl() {
        this.f24319ppxfxbqfkf.gxszxtbevo().addOnSuccessListener(this.f24315gxszxtbevo, new OnSuccessListener() { // from class: com.google.firebase.messaging.yggfygwlhe
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                this.f24520iobyxmoadg.yadqdtsiqt((CloudMessage) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lmojexxdyd(jhduphickx jhduphickxVar) {
        if (esjtqupxsv()) {
            jhduphickxVar.ojitshcjhn();
        }
    }

    private String oxmwwwfdhm() {
        return "[DEFAULT]".equals(this.f24316iobyxmoadg.wflxmlrfwp()) ? "" : this.f24316iobyxmoadg.ojitshcjhn();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task pmvmpeiblj(String str, sopmlzcsov.iobyxmoadg iobyxmoadgVar, String str2) {
        vdvldrhtss(this.f24321zoijcleaow).lqeggnwhkg(oxmwwwfdhm(), str, str2, this.f24312dxjokdxxww.iobyxmoadg());
        if (iobyxmoadgVar == null || !str2.equals(iobyxmoadgVar.f24481iobyxmoadg)) {
            cqumvgiudr(str2);
        }
        return Tasks.forResult(str2);
    }

    public static synchronized FirebaseMessaging rgvfuqvkyq() {
        return getInstance(com.google.firebase.gxszxtbevo.draadjrbmk());
    }

    private static synchronized sopmlzcsov vdvldrhtss(Context context) {
        try {
            if (f24310wflxmlrfwp == null) {
                f24310wflxmlrfwp = new sopmlzcsov(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f24310wflxmlrfwp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void yadqdtsiqt(CloudMessage cloudMessage) {
        if (cloudMessage != null) {
            lmojexxdyd.esjtqupxsv(cloudMessage.getIntent());
            jyumaefscl();
        }
    }

    public static o9.btonecajqb yggfygwlhe() {
        return (o9.btonecajqb) f24307agtfadlqog.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ o9.btonecajqb ylkuphrtab() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task zynmafqrjb(final String str, final sopmlzcsov.iobyxmoadg iobyxmoadgVar) {
        return this.f24319ppxfxbqfkf.lqeggnwhkg().onSuccessTask(this.f24317lqeggnwhkg, new SuccessContinuation() { // from class: com.google.firebase.messaging.iwizpuwonk
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return this.f24423iobyxmoadg.pmvmpeiblj(str, iobyxmoadgVar, (String) obj);
            }
        });
    }

    void agtfadlqog(Runnable runnable, long j13) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (f24309ojitshcjhn == null) {
                    f24309ojitshcjhn = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("TAG"));
                }
                f24309ojitshcjhn.schedule(runnable, j13, TimeUnit.SECONDS);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    synchronized void cllcsxoeiz(long j13) {
        agtfadlqog(new crxdokpmqz(this, Math.min(Math.max(30L, 2 * j13), f24308draadjrbmk)), j13);
        this.f24311btonecajqb = true;
    }

    String draadjrbmk() throws IOException {
        final sopmlzcsov.iobyxmoadg iobyxmoadgVarZdlpuopuiu = zdlpuopuiu();
        if (!dsvhmnatus(iobyxmoadgVarZdlpuopuiu)) {
            return iobyxmoadgVarZdlpuopuiu.f24481iobyxmoadg;
        }
        final String strPpxfxbqfkf = wwaezpbzkn.ppxfxbqfkf(this.f24316iobyxmoadg);
        try {
            return (String) Tasks.await(this.f24320wkgbmnqykc.zoijcleaow(strPpxfxbqfkf, new tzroggbefp.iobyxmoadg() { // from class: com.google.firebase.messaging.jyumaefscl
                @Override // com.google.firebase.messaging.tzroggbefp.iobyxmoadg
                public final Task start() {
                    return this.f24439iobyxmoadg.zynmafqrjb(strPpxfxbqfkf, iobyxmoadgVarZdlpuopuiu);
                }
            }));
        } catch (InterruptedException | ExecutionException e13) {
            throw new IOException(e13);
        }
    }

    boolean dsvhmnatus(sopmlzcsov.iobyxmoadg iobyxmoadgVar) {
        return iobyxmoadgVar == null || iobyxmoadgVar.zoijcleaow(this.f24312dxjokdxxww.iobyxmoadg());
    }

    public boolean esjtqupxsv() {
        return this.f24313eablkybsjg.ppxfxbqfkf();
    }

    public Task kcexrzcfyt() {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f24315gxszxtbevo.execute(new Runnable() { // from class: com.google.firebase.messaging.esjtqupxsv
            @Override // java.lang.Runnable
            public final void run() {
                this.f24380zdlpuopuiu.cdpycssgdh(taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    boolean lereixgezr() {
        return this.f24312dxjokdxxww.lqeggnwhkg();
    }

    Context ojitshcjhn() {
        return this.f24321zoijcleaow;
    }

    synchronized void pkzmftpjix(boolean z13) {
        this.f24311btonecajqb = z13;
    }

    public Task wflxmlrfwp() {
        if (zdlpuopuiu() == null) {
            return Tasks.forResult(null);
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        agtfadlqog.eablkybsjg().execute(new Runnable() { // from class: com.google.firebase.messaging.cqumvgiudr
            @Override // java.lang.Runnable
            public final void run() {
                this.f24365zdlpuopuiu.istkbnxepw(taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    sopmlzcsov.iobyxmoadg zdlpuopuiu() {
        return vdvldrhtss(this.f24321zoijcleaow).eablkybsjg(oxmwwwfdhm(), wwaezpbzkn.ppxfxbqfkf(this.f24316iobyxmoadg));
    }

    FirebaseMessaging(com.google.firebase.gxszxtbevo gxszxtbevoVar, sc.iobyxmoadg iobyxmoadgVar, tc.zoijcleaow zoijcleaowVar, tc.zoijcleaow zoijcleaowVar2, uc.eablkybsjg eablkybsjgVar, tc.zoijcleaow zoijcleaowVar3, qc.wkgbmnqykc wkgbmnqykcVar, wwaezpbzkn wwaezpbzknVar) {
        this(gxszxtbevoVar, iobyxmoadgVar, zoijcleaowVar3, wkgbmnqykcVar, wwaezpbzknVar, new istkbnxepw(gxszxtbevoVar, wwaezpbzknVar, zoijcleaowVar, zoijcleaowVar2, eablkybsjgVar), agtfadlqog.gxszxtbevo(), agtfadlqog.ppxfxbqfkf(), agtfadlqog.zoijcleaow());
    }

    FirebaseMessaging(com.google.firebase.gxszxtbevo gxszxtbevoVar, sc.iobyxmoadg iobyxmoadgVar, tc.zoijcleaow zoijcleaowVar, qc.wkgbmnqykc wkgbmnqykcVar, wwaezpbzkn wwaezpbzknVar, istkbnxepw istkbnxepwVar, Executor executor, Executor executor2, Executor executor3) {
        this.f24311btonecajqb = false;
        f24307agtfadlqog = zoijcleaowVar;
        this.f24316iobyxmoadg = gxszxtbevoVar;
        this.f24313eablkybsjg = new iobyxmoadg(wkgbmnqykcVar);
        Context contextGtknphoqwx = gxszxtbevoVar.gtknphoqwx();
        this.f24321zoijcleaow = contextGtknphoqwx;
        ojitshcjhn ojitshcjhnVar = new ojitshcjhn();
        this.f24314gtknphoqwx = ojitshcjhnVar;
        this.f24312dxjokdxxww = wwaezpbzknVar;
        this.f24319ppxfxbqfkf = istkbnxepwVar;
        this.f24320wkgbmnqykc = new tzroggbefp(executor);
        this.f24315gxszxtbevo = executor2;
        this.f24317lqeggnwhkg = executor3;
        Context contextGtknphoqwx2 = gxszxtbevoVar.gtknphoqwx();
        if (contextGtknphoqwx2 instanceof Application) {
            ((Application) contextGtknphoqwx2).registerActivityLifecycleCallbacks(ojitshcjhnVar);
        } else {
            Log.w("FirebaseMessaging", "Context " + contextGtknphoqwx2 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.iobyxmoadg(new sc.iobyxmoadg.InterfaceC2596iobyxmoadg() { // from class: com.google.firebase.messaging.vdvldrhtss
            });
        }
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.oxmwwwfdhm
            @Override // java.lang.Runnable
            public final void run() {
                this.f24467zdlpuopuiu.iozdgvuglv();
            }
        });
        Task taskEablkybsjg = jhduphickx.eablkybsjg(this, wwaezpbzknVar, istkbnxepwVar, contextGtknphoqwx, agtfadlqog.lqeggnwhkg());
        this.f24318nufgyqmvbu = taskEablkybsjg;
        taskEablkybsjg.addOnSuccessListener(executor2, new OnSuccessListener() { // from class: com.google.firebase.messaging.kcexrzcfyt
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                this.f24445iobyxmoadg.lmojexxdyd((jhduphickx) obj);
            }
        });
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.zdlpuopuiu
            @Override // java.lang.Runnable
            public final void run() {
                this.f24522zdlpuopuiu.wwaezpbzkn();
            }
        });
    }
}
