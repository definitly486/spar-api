package com.google.firebase.installations;

import android.text.TextUtils;
import androidx.appcompat.app.yggfygwlhe;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import ub.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public class ppxfxbqfkf implements uc.eablkybsjg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private String f24281btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final List f24282draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final Executor f24283dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final zdlpuopuiu f24284eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private Set f24285gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final uc.lqeggnwhkg f24286gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final com.google.firebase.gxszxtbevo f24287iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final Object f24288lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final ExecutorService f24289nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final vc.ppxfxbqfkf f24290ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final nufgyqmvbu f24291wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final wc.ppxfxbqfkf f24292zoijcleaow;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private static final Object f24280wflxmlrfwp = new Object();

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private static final ThreadFactory f24279agtfadlqog = new iobyxmoadg();

    class iobyxmoadg implements ThreadFactory {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final AtomicInteger f24293iobyxmoadg = new AtomicInteger(1);

        iobyxmoadg() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f24293iobyxmoadg.getAndIncrement())));
        }
    }

    static /* synthetic */ class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f24294iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        static final /* synthetic */ int[] f24295zoijcleaow;

        static {
            int[] iArr = new int[wc.gxszxtbevo.zoijcleaow.values().length];
            f24295zoijcleaow = iArr;
            try {
                iArr[wc.gxszxtbevo.zoijcleaow.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24295zoijcleaow[wc.gxszxtbevo.zoijcleaow.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24295zoijcleaow[wc.gxszxtbevo.zoijcleaow.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[wc.wkgbmnqykc.zoijcleaow.values().length];
            f24294iobyxmoadg = iArr2;
            try {
                iArr2[wc.wkgbmnqykc.zoijcleaow.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24294iobyxmoadg[wc.wkgbmnqykc.zoijcleaow.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    ppxfxbqfkf(final com.google.firebase.gxszxtbevo gxszxtbevoVar, tc.zoijcleaow zoijcleaowVar, ExecutorService executorService, Executor executor) {
        this(executorService, executor, gxszxtbevoVar, new wc.ppxfxbqfkf(gxszxtbevoVar.gtknphoqwx(), zoijcleaowVar), new vc.ppxfxbqfkf(gxszxtbevoVar), nufgyqmvbu.ppxfxbqfkf(), new zdlpuopuiu(new tc.zoijcleaow() { // from class: uc.iobyxmoadg
            @Override // tc.zoijcleaow
            public final Object get() {
                return com.google.firebase.installations.ppxfxbqfkf.esjtqupxsv(gxszxtbevoVar);
            }
        }), new uc.lqeggnwhkg());
    }

    private synchronized String agtfadlqog() {
        return this.f24281btonecajqb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: btonecajqb, reason: merged with bridge method [inline-methods] */
    public final void cqumvgiudr(final boolean z13) {
        vc.wkgbmnqykc wkgbmnqykcVarKcexrzcfyt = kcexrzcfyt();
        if (z13) {
            wkgbmnqykcVarKcexrzcfyt = wkgbmnqykcVarKcexrzcfyt.rgvfuqvkyq();
        }
        cdpycssgdh(wkgbmnqykcVarKcexrzcfyt);
        this.f24283dxjokdxxww.execute(new Runnable() { // from class: uc.wkgbmnqykc
            @Override // java.lang.Runnable
            public final void run() {
                this.f113253zdlpuopuiu.jyumaefscl(z13);
            }
        });
    }

    private void cdpycssgdh(vc.wkgbmnqykc wkgbmnqykcVar) {
        synchronized (this.f24288lqeggnwhkg) {
            try {
                Iterator it = this.f24282draadjrbmk.iterator();
                while (it.hasNext()) {
                    if (((lqeggnwhkg) it.next()).zoijcleaow(wkgbmnqykcVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: dxjokdxxww, reason: merged with bridge method [inline-methods] */
    public void jyumaefscl(boolean z13) {
        vc.wkgbmnqykc wkgbmnqykcVarZynmafqrjb;
        vc.wkgbmnqykc wkgbmnqykcVarOxmwwwfdhm = oxmwwwfdhm();
        try {
            if (wkgbmnqykcVarOxmwwwfdhm.dxjokdxxww() || wkgbmnqykcVarOxmwwwfdhm.draadjrbmk()) {
                wkgbmnqykcVarZynmafqrjb = zynmafqrjb(wkgbmnqykcVarOxmwwwfdhm);
            } else {
                if (!z13 && !this.f24291wkgbmnqykc.gxszxtbevo(wkgbmnqykcVarOxmwwwfdhm)) {
                    return;
                }
                wkgbmnqykcVarZynmafqrjb = gtknphoqwx(wkgbmnqykcVarOxmwwwfdhm);
            }
            yggfygwlhe(wkgbmnqykcVarZynmafqrjb);
            iozdgvuglv(wkgbmnqykcVarOxmwwwfdhm, wkgbmnqykcVarZynmafqrjb);
            if (wkgbmnqykcVarZynmafqrjb.gtknphoqwx()) {
                yadqdtsiqt(wkgbmnqykcVarZynmafqrjb.wkgbmnqykc());
            }
            if (wkgbmnqykcVarZynmafqrjb.dxjokdxxww()) {
                istkbnxepw(new FirebaseInstallationsException(FirebaseInstallationsException.iobyxmoadg.BAD_CONFIG));
            } else if (wkgbmnqykcVarZynmafqrjb.btonecajqb()) {
                istkbnxepw(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
            } else {
                cdpycssgdh(wkgbmnqykcVarZynmafqrjb);
            }
        } catch (FirebaseInstallationsException e13) {
            istkbnxepw(e13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ vc.zoijcleaow esjtqupxsv(com.google.firebase.gxszxtbevo gxszxtbevoVar) {
        return new vc.zoijcleaow(gxszxtbevoVar);
    }

    private vc.wkgbmnqykc gtknphoqwx(vc.wkgbmnqykc wkgbmnqykcVar) throws FirebaseInstallationsException {
        wc.gxszxtbevo gxszxtbevoVarEablkybsjg = this.f24292zoijcleaow.eablkybsjg(draadjrbmk(), wkgbmnqykcVar.wkgbmnqykc(), zdlpuopuiu(), wkgbmnqykcVar.gxszxtbevo());
        int i13 = zoijcleaow.f24295zoijcleaow[gxszxtbevoVarEablkybsjg.zoijcleaow().ordinal()];
        if (i13 == 1) {
            return wkgbmnqykcVar.ojitshcjhn(gxszxtbevoVarEablkybsjg.ppxfxbqfkf(), gxszxtbevoVarEablkybsjg.wkgbmnqykc(), this.f24291wkgbmnqykc.zoijcleaow());
        }
        if (i13 == 2) {
            return wkgbmnqykcVar.vdvldrhtss("BAD CONFIG");
        }
        if (i13 != 3) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.iobyxmoadg.UNAVAILABLE);
        }
        yadqdtsiqt(null);
        return wkgbmnqykcVar.oxmwwwfdhm();
    }

    private Task gxszxtbevo() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        nufgyqmvbu(new wkgbmnqykc(this.f24291wkgbmnqykc, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private synchronized void iozdgvuglv(vc.wkgbmnqykc wkgbmnqykcVar, vc.wkgbmnqykc wkgbmnqykcVar2) {
        if (this.f24285gtknphoqwx.size() != 0 && !TextUtils.equals(wkgbmnqykcVar.wkgbmnqykc(), wkgbmnqykcVar2.wkgbmnqykc())) {
            Iterator it = this.f24285gtknphoqwx.iterator();
            if (it.hasNext()) {
                yggfygwlhe.iobyxmoadg(it.next());
                wkgbmnqykcVar2.wkgbmnqykc();
                throw null;
            }
        }
    }

    private void istkbnxepw(Exception exc) {
        synchronized (this.f24288lqeggnwhkg) {
            try {
                Iterator it = this.f24282draadjrbmk.iterator();
                while (it.hasNext()) {
                    if (((lqeggnwhkg) it.next()).iobyxmoadg(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void iwizpuwonk() {
        cqumvgiudr(false);
    }

    private vc.wkgbmnqykc kcexrzcfyt() {
        vc.wkgbmnqykc wkgbmnqykcVarWkgbmnqykc;
        synchronized (f24280wflxmlrfwp) {
            try {
                com.google.firebase.installations.zoijcleaow zoijcleaowVarIobyxmoadg = com.google.firebase.installations.zoijcleaow.iobyxmoadg(this.f24287iobyxmoadg.gtknphoqwx(), "generatefid.lock");
                try {
                    wkgbmnqykcVarWkgbmnqykc = this.f24290ppxfxbqfkf.wkgbmnqykc();
                    if (wkgbmnqykcVarWkgbmnqykc.btonecajqb()) {
                        wkgbmnqykcVarWkgbmnqykc = this.f24290ppxfxbqfkf.zoijcleaow(wkgbmnqykcVarWkgbmnqykc.zdlpuopuiu(pmvmpeiblj(wkgbmnqykcVarWkgbmnqykc)));
                    }
                    if (zoijcleaowVarIobyxmoadg != null) {
                        zoijcleaowVarIobyxmoadg.zoijcleaow();
                    }
                } catch (Throwable th2) {
                    if (zoijcleaowVarIobyxmoadg != null) {
                        zoijcleaowVarIobyxmoadg.zoijcleaow();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return wkgbmnqykcVarWkgbmnqykc;
    }

    private void lereixgezr() {
        Preconditions.checkNotEmpty(wflxmlrfwp(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkNotEmpty(zdlpuopuiu(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkNotEmpty(draadjrbmk(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkArgument(nufgyqmvbu.nufgyqmvbu(wflxmlrfwp()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkArgument(nufgyqmvbu.lqeggnwhkg(draadjrbmk()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    private Task lqeggnwhkg() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        nufgyqmvbu(new eablkybsjg(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private void nufgyqmvbu(lqeggnwhkg lqeggnwhkgVar) {
        synchronized (this.f24288lqeggnwhkg) {
            this.f24282draadjrbmk.add(lqeggnwhkgVar);
        }
    }

    private vc.zoijcleaow ojitshcjhn() {
        return (vc.zoijcleaow) this.f24284eablkybsjg.get();
    }

    private vc.wkgbmnqykc oxmwwwfdhm() {
        vc.wkgbmnqykc wkgbmnqykcVarWkgbmnqykc;
        synchronized (f24280wflxmlrfwp) {
            try {
                com.google.firebase.installations.zoijcleaow zoijcleaowVarIobyxmoadg = com.google.firebase.installations.zoijcleaow.iobyxmoadg(this.f24287iobyxmoadg.gtknphoqwx(), "generatefid.lock");
                try {
                    wkgbmnqykcVarWkgbmnqykc = this.f24290ppxfxbqfkf.wkgbmnqykc();
                    if (zoijcleaowVarIobyxmoadg != null) {
                        zoijcleaowVarIobyxmoadg.zoijcleaow();
                    }
                } catch (Throwable th2) {
                    if (zoijcleaowVarIobyxmoadg != null) {
                        zoijcleaowVarIobyxmoadg.zoijcleaow();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return wkgbmnqykcVarWkgbmnqykc;
    }

    private String pmvmpeiblj(vc.wkgbmnqykc wkgbmnqykcVar) {
        if ((!this.f24287iobyxmoadg.wflxmlrfwp().equals("CHIME_ANDROID_SDK") && !this.f24287iobyxmoadg.yggfygwlhe()) || !wkgbmnqykcVar.wflxmlrfwp()) {
            return this.f24286gxszxtbevo.iobyxmoadg();
        }
        String strGxszxtbevo = ojitshcjhn().gxszxtbevo();
        return TextUtils.isEmpty(strGxszxtbevo) ? this.f24286gxszxtbevo.iobyxmoadg() : strGxszxtbevo;
    }

    public static ppxfxbqfkf rgvfuqvkyq() {
        return vdvldrhtss(com.google.firebase.gxszxtbevo.draadjrbmk());
    }

    public static ppxfxbqfkf vdvldrhtss(com.google.firebase.gxszxtbevo gxszxtbevoVar) {
        Preconditions.checkArgument(gxszxtbevoVar != null, "Null is not a valid value of FirebaseApp.");
        return (ppxfxbqfkf) gxszxtbevoVar.btonecajqb(uc.eablkybsjg.class);
    }

    private synchronized void yadqdtsiqt(String str) {
        this.f24281btonecajqb = str;
    }

    private void yggfygwlhe(vc.wkgbmnqykc wkgbmnqykcVar) {
        synchronized (f24280wflxmlrfwp) {
            try {
                com.google.firebase.installations.zoijcleaow zoijcleaowVarIobyxmoadg = com.google.firebase.installations.zoijcleaow.iobyxmoadg(this.f24287iobyxmoadg.gtknphoqwx(), "generatefid.lock");
                try {
                    this.f24290ppxfxbqfkf.zoijcleaow(wkgbmnqykcVar);
                    if (zoijcleaowVarIobyxmoadg != null) {
                        zoijcleaowVarIobyxmoadg.zoijcleaow();
                    }
                } catch (Throwable th2) {
                    if (zoijcleaowVarIobyxmoadg != null) {
                        zoijcleaowVarIobyxmoadg.zoijcleaow();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    private vc.wkgbmnqykc zynmafqrjb(vc.wkgbmnqykc wkgbmnqykcVar) throws FirebaseInstallationsException {
        wc.wkgbmnqykc wkgbmnqykcVarWkgbmnqykc = this.f24292zoijcleaow.wkgbmnqykc(draadjrbmk(), wkgbmnqykcVar.wkgbmnqykc(), zdlpuopuiu(), wflxmlrfwp(), (wkgbmnqykcVar.wkgbmnqykc() == null || wkgbmnqykcVar.wkgbmnqykc().length() != 11) ? null : ojitshcjhn().dxjokdxxww());
        int i13 = zoijcleaow.f24294iobyxmoadg[wkgbmnqykcVarWkgbmnqykc.eablkybsjg().ordinal()];
        if (i13 == 1) {
            return wkgbmnqykcVar.kcexrzcfyt(wkgbmnqykcVarWkgbmnqykc.ppxfxbqfkf(), wkgbmnqykcVarWkgbmnqykc.wkgbmnqykc(), this.f24291wkgbmnqykc.zoijcleaow(), wkgbmnqykcVarWkgbmnqykc.zoijcleaow().ppxfxbqfkf(), wkgbmnqykcVarWkgbmnqykc.zoijcleaow().wkgbmnqykc());
        }
        if (i13 == 2) {
            return wkgbmnqykcVar.vdvldrhtss("BAD CONFIG");
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.iobyxmoadg.UNAVAILABLE);
    }

    String draadjrbmk() {
        return this.f24287iobyxmoadg.agtfadlqog().zoijcleaow();
    }

    @Override // uc.eablkybsjg
    public Task getId() {
        lereixgezr();
        String strAgtfadlqog = agtfadlqog();
        if (strAgtfadlqog != null) {
            return Tasks.forResult(strAgtfadlqog);
        }
        Task taskLqeggnwhkg = lqeggnwhkg();
        this.f24289nufgyqmvbu.execute(new Runnable() { // from class: uc.zoijcleaow
            @Override // java.lang.Runnable
            public final void run() {
                this.f113254zdlpuopuiu.iwizpuwonk();
            }
        });
        return taskLqeggnwhkg;
    }

    @Override // uc.eablkybsjg
    public Task iobyxmoadg(final boolean z13) {
        lereixgezr();
        Task taskGxszxtbevo = gxszxtbevo();
        this.f24289nufgyqmvbu.execute(new Runnable() { // from class: uc.ppxfxbqfkf
            @Override // java.lang.Runnable
            public final void run() {
                this.f113251zdlpuopuiu.cqumvgiudr(z13);
            }
        });
        return taskGxszxtbevo;
    }

    String wflxmlrfwp() {
        return this.f24287iobyxmoadg.agtfadlqog().ppxfxbqfkf();
    }

    String zdlpuopuiu() {
        return this.f24287iobyxmoadg.agtfadlqog().eablkybsjg();
    }

    ppxfxbqfkf(ExecutorService executorService, Executor executor, com.google.firebase.gxszxtbevo gxszxtbevoVar, wc.ppxfxbqfkf ppxfxbqfkfVar, vc.ppxfxbqfkf ppxfxbqfkfVar2, nufgyqmvbu nufgyqmvbuVar, zdlpuopuiu zdlpuopuiuVar, uc.lqeggnwhkg lqeggnwhkgVar) {
        this.f24288lqeggnwhkg = new Object();
        this.f24285gtknphoqwx = new HashSet();
        this.f24282draadjrbmk = new ArrayList();
        this.f24287iobyxmoadg = gxszxtbevoVar;
        this.f24292zoijcleaow = ppxfxbqfkfVar;
        this.f24290ppxfxbqfkf = ppxfxbqfkfVar2;
        this.f24291wkgbmnqykc = nufgyqmvbuVar;
        this.f24284eablkybsjg = zdlpuopuiuVar;
        this.f24286gxszxtbevo = lqeggnwhkgVar;
        this.f24289nufgyqmvbu = executorService;
        this.f24283dxjokdxxww = executor;
    }
}
