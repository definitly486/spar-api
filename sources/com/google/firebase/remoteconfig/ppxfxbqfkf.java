package com.google.firebase.remoteconfig;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.gxszxtbevo;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import com.google.firebase.remoteconfig.internal.cqumvgiudr;
import com.google.firebase.remoteconfig.internal.ojitshcjhn;
import com.google.firebase.remoteconfig.internal.rgvfuqvkyq;
import com.google.firebase.remoteconfig.internal.vdvldrhtss;
import com.google.firebase.remoteconfig.internal.wflxmlrfwp;
import com.google.firebase.remoteconfig.internal.yggfygwlhe;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import mbcevpiqjq.wkgbmnqykc;
import uc.eablkybsjg;

/* JADX INFO: loaded from: classes2.dex */
public class ppxfxbqfkf implements rd.iobyxmoadg {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private Map f24871dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final eablkybsjg f24872eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final qb.zoijcleaow f24873gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Map f24874iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final tc.zoijcleaow f24875lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final String f24876nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ScheduledExecutorService f24877ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final gxszxtbevo f24878wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Context f24879zoijcleaow;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private static final Clock f24868btonecajqb = DefaultClock.getInstance();

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private static final Random f24870gtknphoqwx = new Random();

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private static final Map f24869draadjrbmk = new HashMap();

    private static class iobyxmoadg implements BackgroundDetector.BackgroundStateChangeListener {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private static final AtomicReference f24880iobyxmoadg = new AtomicReference();

        private iobyxmoadg() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void zoijcleaow(Context context) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference = f24880iobyxmoadg;
            if (atomicReference.get() == null) {
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg();
                if (wkgbmnqykc.iobyxmoadg(atomicReference, null, iobyxmoadgVar)) {
                    BackgroundDetector.initialize(application);
                    BackgroundDetector.getInstance().addListener(iobyxmoadgVar);
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
        public void onBackgroundStateChanged(boolean z13) {
            ppxfxbqfkf.oxmwwwfdhm(z13);
        }
    }

    ppxfxbqfkf(Context context, ScheduledExecutorService scheduledExecutorService, gxszxtbevo gxszxtbevoVar, eablkybsjg eablkybsjgVar, qb.zoijcleaow zoijcleaowVar, tc.zoijcleaow zoijcleaowVar2) {
        this(context, scheduledExecutorService, gxszxtbevoVar, eablkybsjgVar, zoijcleaowVar, zoijcleaowVar2, true);
    }

    private qd.eablkybsjg agtfadlqog(com.google.firebase.remoteconfig.internal.gxszxtbevo gxszxtbevoVar, com.google.firebase.remoteconfig.internal.gxszxtbevo gxszxtbevoVar2) {
        return new qd.eablkybsjg(gxszxtbevoVar, qd.iobyxmoadg.iobyxmoadg(gxszxtbevoVar, gxszxtbevoVar2), this.f24877ppxfxbqfkf);
    }

    private ojitshcjhn btonecajqb(com.google.firebase.remoteconfig.internal.gxszxtbevo gxszxtbevoVar, com.google.firebase.remoteconfig.internal.gxszxtbevo gxszxtbevoVar2) {
        return new ojitshcjhn(this.f24877ppxfxbqfkf, gxszxtbevoVar, gxszxtbevoVar2);
    }

    private static cqumvgiudr draadjrbmk(gxszxtbevo gxszxtbevoVar, String str, tc.zoijcleaow zoijcleaowVar) {
        if (rgvfuqvkyq(gxszxtbevoVar) && str.equals("firebase")) {
            return new cqumvgiudr(zoijcleaowVar);
        }
        return null;
    }

    static rgvfuqvkyq gtknphoqwx(Context context, String str, String str2) {
        return new rgvfuqvkyq(context.getSharedPreferences(String.format("%s_%s_%s_%s", "frc", str, str2, "settings"), 0));
    }

    private com.google.firebase.remoteconfig.internal.gxszxtbevo gxszxtbevo(String str, String str2) {
        return com.google.firebase.remoteconfig.internal.gxszxtbevo.nufgyqmvbu(this.f24877ppxfxbqfkf, yggfygwlhe.ppxfxbqfkf(this.f24879zoijcleaow, String.format("%s_%s_%s_%s.json", "frc", this.f24876nufgyqmvbu, str, str2)));
    }

    private static boolean ojitshcjhn(gxszxtbevo gxszxtbevoVar, String str) {
        return str.equals("firebase") && rgvfuqvkyq(gxszxtbevoVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void oxmwwwfdhm(boolean z13) {
        Iterator it = f24869draadjrbmk.values().iterator();
        while (it.hasNext()) {
            ((com.google.firebase.remoteconfig.iobyxmoadg) it.next()).cqumvgiudr(z13);
        }
    }

    private static boolean rgvfuqvkyq(gxszxtbevo gxszxtbevoVar) {
        return gxszxtbevoVar.wflxmlrfwp().equals("[DEFAULT]");
    }

    private static /* synthetic */ sb.iobyxmoadg vdvldrhtss() {
        return null;
    }

    public static /* synthetic */ sb.iobyxmoadg zoijcleaow() {
        vdvldrhtss();
        return null;
    }

    ConfigFetchHttpClient dxjokdxxww(String str, String str2, rgvfuqvkyq rgvfuqvkyqVar) {
        return new ConfigFetchHttpClient(this.f24879zoijcleaow, this.f24878wkgbmnqykc.agtfadlqog().ppxfxbqfkf(), str, str2, rgvfuqvkyqVar.zoijcleaow(), rgvfuqvkyqVar.zoijcleaow());
    }

    public synchronized com.google.firebase.remoteconfig.iobyxmoadg eablkybsjg(String str) {
        com.google.firebase.remoteconfig.internal.gxszxtbevo gxszxtbevoVarGxszxtbevo;
        com.google.firebase.remoteconfig.internal.gxszxtbevo gxszxtbevoVarGxszxtbevo2;
        com.google.firebase.remoteconfig.internal.gxszxtbevo gxszxtbevoVarGxszxtbevo3;
        rgvfuqvkyq rgvfuqvkyqVarGtknphoqwx;
        ojitshcjhn ojitshcjhnVarBtonecajqb;
        try {
            gxszxtbevoVarGxszxtbevo = gxszxtbevo(str, "fetch");
            gxszxtbevoVarGxszxtbevo2 = gxszxtbevo(str, "activate");
            gxszxtbevoVarGxszxtbevo3 = gxszxtbevo(str, "defaults");
            rgvfuqvkyqVarGtknphoqwx = gtknphoqwx(this.f24879zoijcleaow, this.f24876nufgyqmvbu, str);
            ojitshcjhnVarBtonecajqb = btonecajqb(gxszxtbevoVarGxszxtbevo2, gxszxtbevoVarGxszxtbevo3);
            final cqumvgiudr cqumvgiudrVarDraadjrbmk = draadjrbmk(this.f24878wkgbmnqykc, str, this.f24875lqeggnwhkg);
            if (cqumvgiudrVarDraadjrbmk != null) {
                ojitshcjhnVarBtonecajqb.zoijcleaow(new BiConsumer() { // from class: pd.wflxmlrfwp
                    @Override // com.google.android.gms.common.util.BiConsumer
                    public final void accept(Object obj, Object obj2) {
                        cqumvgiudrVarDraadjrbmk.iobyxmoadg((String) obj, (com.google.firebase.remoteconfig.internal.lqeggnwhkg) obj2);
                    }
                });
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return wkgbmnqykc(this.f24878wkgbmnqykc, str, this.f24872eablkybsjg, this.f24873gxszxtbevo, this.f24877ppxfxbqfkf, gxszxtbevoVarGxszxtbevo, gxszxtbevoVarGxszxtbevo2, gxszxtbevoVarGxszxtbevo3, nufgyqmvbu(str, gxszxtbevoVarGxszxtbevo, rgvfuqvkyqVarGtknphoqwx), ojitshcjhnVarBtonecajqb, rgvfuqvkyqVarGtknphoqwx, agtfadlqog(gxszxtbevoVarGxszxtbevo2, gxszxtbevoVarGxszxtbevo3));
    }

    @Override // rd.iobyxmoadg
    public void iobyxmoadg(String str, sd.gxszxtbevo gxszxtbevoVar) {
        eablkybsjg(str).agtfadlqog().nufgyqmvbu(gxszxtbevoVar);
    }

    com.google.firebase.remoteconfig.iobyxmoadg lqeggnwhkg() {
        return eablkybsjg("firebase");
    }

    synchronized wflxmlrfwp nufgyqmvbu(String str, com.google.firebase.remoteconfig.internal.gxszxtbevo gxszxtbevoVar, rgvfuqvkyq rgvfuqvkyqVar) {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return new wflxmlrfwp(this.f24872eablkybsjg, rgvfuqvkyq(this.f24878wkgbmnqykc) ? this.f24875lqeggnwhkg : new tc.zoijcleaow() { // from class: pd.agtfadlqog
            @Override // tc.zoijcleaow
            public final Object get() {
                com.google.firebase.remoteconfig.ppxfxbqfkf.zoijcleaow();
                return null;
            }
        }, this.f24877ppxfxbqfkf, f24868btonecajqb, f24870gtknphoqwx, gxszxtbevoVar, dxjokdxxww(this.f24878wkgbmnqykc.agtfadlqog().zoijcleaow(), str, rgvfuqvkyqVar), rgvfuqvkyqVar, this.f24871dxjokdxxww);
    }

    synchronized vdvldrhtss wflxmlrfwp(gxszxtbevo gxszxtbevoVar, eablkybsjg eablkybsjgVar, wflxmlrfwp wflxmlrfwpVar, com.google.firebase.remoteconfig.internal.gxszxtbevo gxszxtbevoVar2, Context context, String str, rgvfuqvkyq rgvfuqvkyqVar) {
        return new vdvldrhtss(gxszxtbevoVar, eablkybsjgVar, wflxmlrfwpVar, gxszxtbevoVar2, context, str, rgvfuqvkyqVar, this.f24877ppxfxbqfkf);
    }

    synchronized com.google.firebase.remoteconfig.iobyxmoadg wkgbmnqykc(gxszxtbevo gxszxtbevoVar, String str, eablkybsjg eablkybsjgVar, qb.zoijcleaow zoijcleaowVar, Executor executor, com.google.firebase.remoteconfig.internal.gxszxtbevo gxszxtbevoVar2, com.google.firebase.remoteconfig.internal.gxszxtbevo gxszxtbevoVar3, com.google.firebase.remoteconfig.internal.gxszxtbevo gxszxtbevoVar4, wflxmlrfwp wflxmlrfwpVar, ojitshcjhn ojitshcjhnVar, rgvfuqvkyq rgvfuqvkyqVar, qd.eablkybsjg eablkybsjgVar2) {
        try {
            if (!this.f24874iobyxmoadg.containsKey(str)) {
                com.google.firebase.remoteconfig.iobyxmoadg iobyxmoadgVar = new com.google.firebase.remoteconfig.iobyxmoadg(this.f24879zoijcleaow, gxszxtbevoVar, eablkybsjgVar, ojitshcjhn(gxszxtbevoVar, str) ? zoijcleaowVar : null, executor, gxszxtbevoVar2, gxszxtbevoVar3, gxszxtbevoVar4, wflxmlrfwpVar, ojitshcjhnVar, rgvfuqvkyqVar, wflxmlrfwp(gxszxtbevoVar, eablkybsjgVar, wflxmlrfwpVar, gxszxtbevoVar3, this.f24879zoijcleaow, str, rgvfuqvkyqVar), eablkybsjgVar2);
                iobyxmoadgVar.esjtqupxsv();
                this.f24874iobyxmoadg.put(str, iobyxmoadgVar);
                f24869draadjrbmk.put(str, iobyxmoadgVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (com.google.firebase.remoteconfig.iobyxmoadg) this.f24874iobyxmoadg.get(str);
    }

    protected ppxfxbqfkf(Context context, ScheduledExecutorService scheduledExecutorService, gxszxtbevo gxszxtbevoVar, eablkybsjg eablkybsjgVar, qb.zoijcleaow zoijcleaowVar, tc.zoijcleaow zoijcleaowVar2, boolean z13) {
        this.f24874iobyxmoadg = new HashMap();
        this.f24871dxjokdxxww = new HashMap();
        this.f24879zoijcleaow = context;
        this.f24877ppxfxbqfkf = scheduledExecutorService;
        this.f24878wkgbmnqykc = gxszxtbevoVar;
        this.f24872eablkybsjg = eablkybsjgVar;
        this.f24873gxszxtbevo = zoijcleaowVar;
        this.f24875lqeggnwhkg = zoijcleaowVar2;
        this.f24876nufgyqmvbu = gxszxtbevoVar.agtfadlqog().ppxfxbqfkf();
        iobyxmoadg.zoijcleaow(context);
        if (z13) {
            Tasks.call(scheduledExecutorService, new Callable() { // from class: com.google.firebase.remoteconfig.zoijcleaow
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f24881iobyxmoadg.lqeggnwhkg();
                }
            });
        }
    }
}
