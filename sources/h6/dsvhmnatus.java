package h6;

import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public class dsvhmnatus extends g6.cllcsxoeiz {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private BroadcastReceiver.PendingResult f39535btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final pj.cllcsxoeiz f39536draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private boolean f39537dxjokdxxww = false;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private r6.zoijcleaow f39538eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final n6.agtfadlqog f39539gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private List f39540gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private zdlpuopuiu f39541lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private q6.istkbnxepw f39542nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private androidx.work.iobyxmoadg f39543ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private WorkDatabase f39544wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private Context f39545zoijcleaow;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private static final String f39534wflxmlrfwp = g6.yggfygwlhe.dxjokdxxww("WorkManagerImpl");

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private static dsvhmnatus f39531agtfadlqog = null;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private static dsvhmnatus f39532ojitshcjhn = null;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private static final Object f39533rgvfuqvkyq = new Object();

    class iobyxmoadg implements ojitshcjhn.iobyxmoadg {
        iobyxmoadg() {
        }

        @Override // ojitshcjhn.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public g6.hkdspvbjdz apply(List list) {
            if (list == null || list.size() <= 0) {
                return null;
            }
            return ((p6.yggfygwlhe.ppxfxbqfkf) list.get(0)).eablkybsjg();
        }
    }

    static class zoijcleaow {
        static boolean iobyxmoadg(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    public dsvhmnatus(Context context, androidx.work.iobyxmoadg iobyxmoadgVar, r6.zoijcleaow zoijcleaowVar, WorkDatabase workDatabase, List list, zdlpuopuiu zdlpuopuiuVar, n6.agtfadlqog agtfadlqogVar) {
        Context applicationContext = context.getApplicationContext();
        if (zoijcleaow.iobyxmoadg(applicationContext)) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        g6.yggfygwlhe.nufgyqmvbu(new g6.yggfygwlhe.iobyxmoadg(iobyxmoadgVar.btonecajqb()));
        this.f39545zoijcleaow = applicationContext;
        this.f39538eablkybsjg = zoijcleaowVar;
        this.f39544wkgbmnqykc = workDatabase;
        this.f39541lqeggnwhkg = zdlpuopuiuVar;
        this.f39539gtknphoqwx = agtfadlqogVar;
        this.f39543ppxfxbqfkf = iobyxmoadgVar;
        this.f39540gxszxtbevo = list;
        pj.cllcsxoeiz cllcsxoeizVarGxszxtbevo = androidx.work.impl.btonecajqb.gxszxtbevo(zoijcleaowVar);
        this.f39536draadjrbmk = cllcsxoeizVarGxszxtbevo;
        this.f39542nufgyqmvbu = new q6.istkbnxepw(this.f39544wkgbmnqykc);
        androidx.work.impl.iobyxmoadg.lqeggnwhkg(list, this.f39541lqeggnwhkg, zoijcleaowVar.ppxfxbqfkf(), this.f39544wkgbmnqykc, iobyxmoadgVar);
        this.f39538eablkybsjg.wkgbmnqykc(new ForceStopRunnable(applicationContext, this));
        cdpycssgdh.ppxfxbqfkf(cllcsxoeizVarGxszxtbevo, this.f39545zoijcleaow, iobyxmoadgVar, workDatabase);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ gg.wwaezpbzkn cqumvgiudr() {
        k6.gtknphoqwx.zoijcleaow(wflxmlrfwp());
        yggfygwlhe().ulzqkzuiru().agtfadlqog();
        androidx.work.impl.iobyxmoadg.nufgyqmvbu(agtfadlqog(), yggfygwlhe(), kcexrzcfyt());
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public static void iwizpuwonk(Context context, androidx.work.iobyxmoadg iobyxmoadgVar) {
        synchronized (f39533rgvfuqvkyq) {
            try {
                dsvhmnatus dsvhmnatusVar = f39531agtfadlqog;
                if (dsvhmnatusVar != null && f39532ojitshcjhn != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (dsvhmnatusVar == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (f39532ojitshcjhn == null) {
                        f39532ojitshcjhn = androidx.work.impl.btonecajqb.ppxfxbqfkf(applicationContext, iobyxmoadgVar);
                    }
                    f39531agtfadlqog = f39532ojitshcjhn;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static dsvhmnatus ojitshcjhn() {
        synchronized (f39533rgvfuqvkyq) {
            try {
                dsvhmnatus dsvhmnatusVar = f39531agtfadlqog;
                if (dsvhmnatusVar != null) {
                    return dsvhmnatusVar;
                }
                return f39532ojitshcjhn;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static dsvhmnatus rgvfuqvkyq(Context context) {
        dsvhmnatus dsvhmnatusVarOjitshcjhn;
        synchronized (f39533rgvfuqvkyq) {
            try {
                dsvhmnatusVarOjitshcjhn = ojitshcjhn();
                if (dsvhmnatusVarOjitshcjhn == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (!(applicationContext instanceof androidx.work.iobyxmoadg.ppxfxbqfkf)) {
                        throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                    }
                    iwizpuwonk(applicationContext, ((androidx.work.iobyxmoadg.ppxfxbqfkf) applicationContext).iobyxmoadg());
                    dsvhmnatusVarOjitshcjhn = rgvfuqvkyq(applicationContext);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dsvhmnatusVarOjitshcjhn;
    }

    public androidx.work.iobyxmoadg agtfadlqog() {
        return this.f39543ppxfxbqfkf;
    }

    public iozdgvuglv draadjrbmk(String str, g6.nufgyqmvbu nufgyqmvbuVar, g6.yadqdtsiqt yadqdtsiqtVar) {
        return new iozdgvuglv(this, str, nufgyqmvbuVar == g6.nufgyqmvbu.KEEP ? g6.dxjokdxxww.KEEP : g6.dxjokdxxww.REPLACE, Collections.singletonList(yadqdtsiqtVar));
    }

    @Override // g6.cllcsxoeiz
    public androidx.lifecycle.cqumvgiudr dxjokdxxww(UUID uuid) {
        return q6.rgvfuqvkyq.iobyxmoadg(this.f39544wkgbmnqykc.ulzqkzuiru().esjtqupxsv(Collections.singletonList(uuid.toString())), new iobyxmoadg(), this.f39538eablkybsjg);
    }

    @Override // g6.cllcsxoeiz
    public g6.esjtqupxsv eablkybsjg(String str, g6.nufgyqmvbu nufgyqmvbuVar, g6.yadqdtsiqt yadqdtsiqtVar) {
        return nufgyqmvbuVar == g6.nufgyqmvbu.UPDATE ? kegysxyocb.ppxfxbqfkf(this, str, yadqdtsiqtVar) : draadjrbmk(str, nufgyqmvbuVar, yadqdtsiqtVar).zoijcleaow();
    }

    public void esjtqupxsv() {
        synchronized (f39533rgvfuqvkyq) {
            try {
                this.f39537dxjokdxxww = true;
                BroadcastReceiver.PendingResult pendingResult = this.f39535btonecajqb;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f39535btonecajqb = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public g6.esjtqupxsv gtknphoqwx(UUID uuid) {
        return q6.wkgbmnqykc.eablkybsjg(uuid, this);
    }

    @Override // g6.cllcsxoeiz
    public g6.esjtqupxsv iobyxmoadg(String str) {
        return q6.wkgbmnqykc.dxjokdxxww(str, this);
    }

    public r6.zoijcleaow jyumaefscl() {
        return this.f39538eablkybsjg;
    }

    public List kcexrzcfyt() {
        return this.f39540gxszxtbevo;
    }

    public void lereixgezr() {
        g6.hcddaimhww.iobyxmoadg(agtfadlqog().agtfadlqog(), "ReschedulingWork", new tg.iobyxmoadg() { // from class: h6.cllcsxoeiz
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return this.f39525zdlpuopuiu.cqumvgiudr();
            }
        });
    }

    @Override // g6.cllcsxoeiz
    public g6.esjtqupxsv lqeggnwhkg(String str, g6.dxjokdxxww dxjokdxxwwVar, List list) {
        return new iozdgvuglv(this, str, dxjokdxxwwVar, list).zoijcleaow();
    }

    public zdlpuopuiu oxmwwwfdhm() {
        return this.f39541lqeggnwhkg;
    }

    public void pmvmpeiblj(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (f39533rgvfuqvkyq) {
            try {
                BroadcastReceiver.PendingResult pendingResult2 = this.f39535btonecajqb;
                if (pendingResult2 != null) {
                    pendingResult2.finish();
                }
                this.f39535btonecajqb = pendingResult;
                if (this.f39537dxjokdxxww) {
                    pendingResult.finish();
                    this.f39535btonecajqb = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public q6.istkbnxepw vdvldrhtss() {
        return this.f39542nufgyqmvbu;
    }

    public Context wflxmlrfwp() {
        return this.f39545zoijcleaow;
    }

    @Override // g6.cllcsxoeiz
    public g6.esjtqupxsv wkgbmnqykc(List list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new iozdgvuglv(this, list).zoijcleaow();
    }

    public WorkDatabase yggfygwlhe() {
        return this.f39544wkgbmnqykc;
    }

    public n6.agtfadlqog zdlpuopuiu() {
        return this.f39539gtknphoqwx;
    }

    @Override // g6.cllcsxoeiz
    public g6.esjtqupxsv zoijcleaow(String str) {
        return q6.wkgbmnqykc.gxszxtbevo(str, this);
    }

    public void zynmafqrjb(p6.wflxmlrfwp wflxmlrfwpVar, int i13) {
        this.f39538eablkybsjg.wkgbmnqykc(new q6.iozdgvuglv(this.f39541lqeggnwhkg, new esjtqupxsv(wflxmlrfwpVar), true, i13));
    }
}
