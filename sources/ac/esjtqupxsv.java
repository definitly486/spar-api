package ac;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public class esjtqupxsv {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final agtfadlqog f1339agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final pkzmftpjix f1340btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    public final zb.zoijcleaow f1341draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private vdvldrhtss f1342dxjokdxxww;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final gc.lqeggnwhkg f1344gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private lereixgezr f1345gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f1346iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private lereixgezr f1347lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private boolean f1348nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final xb.iobyxmoadg f1349ojitshcjhn;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final yadqdtsiqt f1350ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private final xb.draadjrbmk f1351rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private final bc.gxszxtbevo f1352vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final yb.iobyxmoadg f1353wflxmlrfwp;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final com.google.firebase.gxszxtbevo f1355zoijcleaow;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final long f1343eablkybsjg = System.currentTimeMillis();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final dsvhmnatus f1354wkgbmnqykc = new dsvhmnatus();

    public esjtqupxsv(com.google.firebase.gxszxtbevo gxszxtbevoVar, pkzmftpjix pkzmftpjixVar, xb.iobyxmoadg iobyxmoadgVar, yadqdtsiqt yadqdtsiqtVar, zb.zoijcleaow zoijcleaowVar, yb.iobyxmoadg iobyxmoadgVar2, gc.lqeggnwhkg lqeggnwhkgVar, agtfadlqog agtfadlqogVar, xb.draadjrbmk draadjrbmkVar, bc.gxszxtbevo gxszxtbevoVar2) {
        this.f1355zoijcleaow = gxszxtbevoVar;
        this.f1350ppxfxbqfkf = yadqdtsiqtVar;
        this.f1346iobyxmoadg = gxszxtbevoVar.gtknphoqwx();
        this.f1340btonecajqb = pkzmftpjixVar;
        this.f1349ojitshcjhn = iobyxmoadgVar;
        this.f1341draadjrbmk = zoijcleaowVar;
        this.f1353wflxmlrfwp = iobyxmoadgVar2;
        this.f1344gtknphoqwx = lqeggnwhkgVar;
        this.f1339agtfadlqog = agtfadlqogVar;
        this.f1351rgvfuqvkyq = draadjrbmkVar;
        this.f1352vdvldrhtss = gxszxtbevoVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean agtfadlqog() {
        return Boolean.valueOf(this.f1342dxjokdxxww.oxmwwwfdhm());
    }

    public static String draadjrbmk() {
        return "19.2.1";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: dxjokdxxww, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void rgvfuqvkyq(ic.btonecajqb btonecajqbVar) {
        bc.gxszxtbevo.ppxfxbqfkf();
        jyumaefscl();
        try {
            try {
                this.f1341draadjrbmk.iobyxmoadg(new zb.iobyxmoadg() { // from class: ac.cqumvgiudr
                });
                this.f1342dxjokdxxww.tzroggbefp();
                if (!btonecajqbVar.zoijcleaow().f42385zoijcleaow.f42386iobyxmoadg) {
                    xb.lqeggnwhkg.gxszxtbevo().zoijcleaow("Collection of crash reports disabled in Crashlytics settings.");
                    throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
                }
                if (!this.f1342dxjokdxxww.esjtqupxsv(btonecajqbVar)) {
                    xb.lqeggnwhkg.gxszxtbevo().gtknphoqwx("Previous sessions could not be finalized.");
                }
                this.f1342dxjokdxxww.sopmlzcsov(btonecajqbVar.iobyxmoadg());
                yggfygwlhe();
            } catch (Exception e13) {
                xb.lqeggnwhkg.gxszxtbevo().eablkybsjg("Crashlytics encountered a problem during asynchronous initialization.", e13);
            }
        } catch (Throwable th2) {
            yggfygwlhe();
            throw th2;
        }
    }

    private void gtknphoqwx(final ic.btonecajqb btonecajqbVar) {
        Future<?> futureSubmit = this.f1352vdvldrhtss.f15695iobyxmoadg.ppxfxbqfkf().submit(new Runnable() { // from class: ac.iwizpuwonk
            @Override // java.lang.Runnable
            public final void run() {
                this.f1371zdlpuopuiu.rgvfuqvkyq(btonecajqbVar);
            }
        });
        xb.lqeggnwhkg.gxszxtbevo().zoijcleaow("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            futureSubmit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e13) {
            xb.lqeggnwhkg.gxszxtbevo().eablkybsjg("Crashlytics was interrupted during initialization.", e13);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e14) {
            xb.lqeggnwhkg.gxszxtbevo().eablkybsjg("Crashlytics encountered a problem during initialization.", e14);
        } catch (TimeoutException e15) {
            xb.lqeggnwhkg.gxszxtbevo().eablkybsjg("Crashlytics timed out during initialization.", e15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void kcexrzcfyt(String str) {
        this.f1342dxjokdxxww.ulzqkzuiru(str);
    }

    private void lqeggnwhkg() {
        try {
            this.f1348nufgyqmvbu = Boolean.TRUE.equals((Boolean) this.f1352vdvldrhtss.f15695iobyxmoadg.ppxfxbqfkf().submit(new Callable() { // from class: ac.jyumaefscl
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f1374iobyxmoadg.agtfadlqog();
                }
            }).get(3L, TimeUnit.SECONDS));
        } catch (Exception unused) {
            this.f1348nufgyqmvbu = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void oxmwwwfdhm(String str, String str2) {
        this.f1342dxjokdxxww.mbcevpiqjq(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void vdvldrhtss(Throwable th2) {
        this.f1342dxjokdxxww.ribwqtqdhb(Thread.currentThread(), th2);
    }

    static boolean wflxmlrfwp(String str, boolean z13) {
        if (!z13) {
            xb.lqeggnwhkg.gxszxtbevo().dxjokdxxww("Configured not to require a build ID.");
            return true;
        }
        if (!TextUtils.isEmpty(str)) {
            return true;
        }
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", ".     |  | ");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".   \\ |  | /");
        Log.e("FirebaseCrashlytics", ".    \\    /");
        Log.e("FirebaseCrashlytics", ".     \\  /");
        Log.e("FirebaseCrashlytics", ".      \\/");
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", ".      /\\");
        Log.e("FirebaseCrashlytics", ".     /  \\");
        Log.e("FirebaseCrashlytics", ".    /    \\");
        Log.e("FirebaseCrashlytics", ".   / |  | \\");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".");
        return false;
    }

    public Task btonecajqb(final ic.btonecajqb btonecajqbVar) {
        return this.f1352vdvldrhtss.f15695iobyxmoadg.gxszxtbevo(new Runnable() { // from class: ac.oxmwwwfdhm
            @Override // java.lang.Runnable
            public final void run() {
                this.f1396zdlpuopuiu.ojitshcjhn(btonecajqbVar);
            }
        });
    }

    public void cqumvgiudr(final String str, final String str2) {
        this.f1352vdvldrhtss.f15695iobyxmoadg.gxszxtbevo(new Runnable() { // from class: ac.yggfygwlhe
            @Override // java.lang.Runnable
            public final void run() {
                this.f1480zdlpuopuiu.oxmwwwfdhm(str, str2);
            }
        });
    }

    public void esjtqupxsv(final String str) {
        this.f1352vdvldrhtss.f15695iobyxmoadg.gxszxtbevo(new Runnable() { // from class: ac.zdlpuopuiu
            @Override // java.lang.Runnable
            public final void run() {
                this.f1484zdlpuopuiu.kcexrzcfyt(str);
            }
        });
    }

    public boolean iwizpuwonk(zoijcleaow zoijcleaowVar, ic.btonecajqb btonecajqbVar) {
        if (!wflxmlrfwp(zoijcleaowVar.f1492zoijcleaow, btonecajqb.dxjokdxxww(this.f1346iobyxmoadg, "com.crashlytics.RequireBuildId", true))) {
            throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
        }
        String strPpxfxbqfkf = new dxjokdxxww().ppxfxbqfkf();
        try {
            this.f1347lqeggnwhkg = new lereixgezr("crash_marker", this.f1344gtknphoqwx);
            this.f1345gxszxtbevo = new lereixgezr("initialization_marker", this.f1344gtknphoqwx);
            cc.ojitshcjhn ojitshcjhnVar = new cc.ojitshcjhn(strPpxfxbqfkf, this.f1344gtknphoqwx, this.f1352vdvldrhtss);
            cc.eablkybsjg eablkybsjgVar = new cc.eablkybsjg(this.f1344gtknphoqwx);
            jc.iobyxmoadg iobyxmoadgVar = new jc.iobyxmoadg(UserVerificationMethods.USER_VERIFY_ALL, new jc.ppxfxbqfkf(10));
            this.f1351rgvfuqvkyq.ppxfxbqfkf(ojitshcjhnVar);
            this.f1342dxjokdxxww = new vdvldrhtss(this.f1346iobyxmoadg, this.f1340btonecajqb, this.f1350ppxfxbqfkf, this.f1344gtknphoqwx, this.f1347lqeggnwhkg, zoijcleaowVar, ojitshcjhnVar, eablkybsjgVar, ribwqtqdhb.dxjokdxxww(this.f1346iobyxmoadg, this.f1340btonecajqb, this.f1344gtknphoqwx, zoijcleaowVar, eablkybsjgVar, ojitshcjhnVar, iobyxmoadgVar, btonecajqbVar, this.f1354wkgbmnqykc, this.f1339agtfadlqog, this.f1352vdvldrhtss), this.f1349ojitshcjhn, this.f1353wflxmlrfwp, this.f1339agtfadlqog, this.f1352vdvldrhtss);
            boolean zNufgyqmvbu = nufgyqmvbu();
            lqeggnwhkg();
            this.f1342dxjokdxxww.iwizpuwonk(strPpxfxbqfkf, Thread.getDefaultUncaughtExceptionHandler(), btonecajqbVar);
            if (!zNufgyqmvbu || !btonecajqb.wkgbmnqykc(this.f1346iobyxmoadg)) {
                xb.lqeggnwhkg.gxszxtbevo().zoijcleaow("Successfully configured exception handler.");
                return true;
            }
            xb.lqeggnwhkg.gxszxtbevo().zoijcleaow("Crashlytics did not finish previous background initialization. Initializing synchronously.");
            gtknphoqwx(btonecajqbVar);
            return false;
        } catch (Exception e13) {
            xb.lqeggnwhkg.gxszxtbevo().eablkybsjg("Crashlytics was not started due to an exception during initialization", e13);
            this.f1342dxjokdxxww = null;
            return false;
        }
    }

    void jyumaefscl() {
        bc.gxszxtbevo.ppxfxbqfkf();
        this.f1345gxszxtbevo.iobyxmoadg();
        xb.lqeggnwhkg.gxszxtbevo().dxjokdxxww("Initialization marker file was created.");
    }

    boolean nufgyqmvbu() {
        return this.f1345gxszxtbevo.ppxfxbqfkf();
    }

    void yggfygwlhe() {
        bc.gxszxtbevo.ppxfxbqfkf();
        try {
            if (this.f1345gxszxtbevo.wkgbmnqykc()) {
                return;
            }
            xb.lqeggnwhkg.gxszxtbevo().gtknphoqwx("Initialization marker file was not properly removed.");
        } catch (Exception e13) {
            xb.lqeggnwhkg.gxszxtbevo().eablkybsjg("Problem encountered deleting Crashlytics initialization marker.", e13);
        }
    }

    public void zdlpuopuiu(final Throwable th2) {
        this.f1352vdvldrhtss.f15695iobyxmoadg.gxszxtbevo(new Runnable() { // from class: ac.kcexrzcfyt
            @Override // java.lang.Runnable
            public final void run() {
                this.f1376zdlpuopuiu.vdvldrhtss(th2);
            }
        });
    }
}
