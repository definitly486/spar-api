package com.google.firebase.perf.metrics;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Process;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.Keep;
import androidx.lifecycle.istkbnxepw;
import androidx.lifecycle.rgvfuqvkyq;
import androidx.lifecycle.yadqdtsiqt;
import com.google.firebase.agtfadlqog;
import com.google.firebase.gxszxtbevo;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.util.Timer;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import ld.gtknphoqwx;
import md.eablkybsjg;
import md.nufgyqmvbu;
import nd.wflxmlrfwp;
import nd.wkgbmnqykc;

/* JADX INFO: loaded from: classes2.dex */
public class AppStartTrace implements Application.ActivityLifecycleCallbacks, rgvfuqvkyq {

    /* JADX INFO: renamed from: mbcevpiqjq, reason: collision with root package name */
    private static volatile AppStartTrace f24591mbcevpiqjq;

    /* JADX INFO: renamed from: ntlheqmsrt, reason: collision with root package name */
    private static ExecutorService f24592ntlheqmsrt;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private final Timer f24594cdpycssgdh;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final wflxmlrfwp.zoijcleaow f24596cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private Context f24598esjtqupxsv;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private PerfSession f24600hkdspvbjdz;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final Timer f24602istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final com.google.firebase.perf.config.iobyxmoadg f24603iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final md.iobyxmoadg f24605jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private WeakReference f24606lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private WeakReference f24609pmvmpeiblj;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final gtknphoqwx f24614yggfygwlhe;

    /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name */
    private static final Timer f24590kegysxyocb = new md.iobyxmoadg().iobyxmoadg();

    /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name */
    private static final long f24593tzroggbefp = TimeUnit.MINUTES.toMicros(1);

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private boolean f24616zdlpuopuiu = false;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private boolean f24617zynmafqrjb = false;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private Timer f24613yadqdtsiqt = null;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private Timer f24601iozdgvuglv = null;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private Timer f24607lmojexxdyd = null;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private Timer f24611wwaezpbzkn = null;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private Timer f24615ylkuphrtab = null;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private Timer f24608pkzmftpjix = null;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private Timer f24599hcddaimhww = null;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private Timer f24604jpowsppfya = null;

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    private boolean f24595cllcsxoeiz = false;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    private int f24597dsvhmnatus = 0;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
    private final zoijcleaow f24612wypolnanlu = new zoijcleaow();

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name */
    private boolean f24610stevsuqkhv = false;

    public static class ppxfxbqfkf implements Runnable {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final AppStartTrace f24618zdlpuopuiu;

        public ppxfxbqfkf(AppStartTrace appStartTrace) {
            this.f24618zdlpuopuiu = appStartTrace;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f24618zdlpuopuiu.f24613yadqdtsiqt == null) {
                this.f24618zdlpuopuiu.f24595cllcsxoeiz = true;
            }
        }
    }

    private final class zoijcleaow implements ViewTreeObserver.OnDrawListener {
        private zoijcleaow() {
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            AppStartTrace.gtknphoqwx(AppStartTrace.this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    AppStartTrace(gtknphoqwx gtknphoqwxVar, md.iobyxmoadg iobyxmoadgVar, com.google.firebase.perf.config.iobyxmoadg iobyxmoadgVar2, ExecutorService executorService) {
        this.f24614yggfygwlhe = gtknphoqwxVar;
        this.f24605jyumaefscl = iobyxmoadgVar;
        this.f24603iwizpuwonk = iobyxmoadgVar2;
        f24592ntlheqmsrt = executorService;
        this.f24596cqumvgiudr = wflxmlrfwp.jpowsppfya().kcexrzcfyt("_experiment_app_start_ttid");
        this.f24602istkbnxepw = Timer.nufgyqmvbu(Process.getStartElapsedRealtime());
        agtfadlqog agtfadlqogVar = (agtfadlqog) gxszxtbevo.draadjrbmk().btonecajqb(agtfadlqog.class);
        this.f24594cdpycssgdh = agtfadlqogVar != null ? Timer.nufgyqmvbu(agtfadlqogVar.zoijcleaow()) : null;
    }

    static AppStartTrace agtfadlqog(gtknphoqwx gtknphoqwxVar, md.iobyxmoadg iobyxmoadgVar) {
        if (f24591mbcevpiqjq == null) {
            synchronized (AppStartTrace.class) {
                try {
                    if (f24591mbcevpiqjq == null) {
                        f24591mbcevpiqjq = new AppStartTrace(gtknphoqwxVar, iobyxmoadgVar, com.google.firebase.perf.config.iobyxmoadg.lqeggnwhkg(), new ThreadPoolExecutor(0, 1, f24593tzroggbefp + 10, TimeUnit.SECONDS, new LinkedBlockingQueue()));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f24591mbcevpiqjq;
    }

    private Timer draadjrbmk() {
        Timer timer = this.f24594cdpycssgdh;
        return timer != null ? timer : f24590kegysxyocb;
    }

    static /* synthetic */ int gtknphoqwx(AppStartTrace appStartTrace) {
        int i13 = appStartTrace.f24597dsvhmnatus;
        appStartTrace.f24597dsvhmnatus = i13 + 1;
        return i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jyumaefscl() {
        if (this.f24599hcddaimhww != null) {
            return;
        }
        this.f24599hcddaimhww = this.f24605jyumaefscl.iobyxmoadg();
        this.f24596cqumvgiudr.draadjrbmk((wflxmlrfwp) wflxmlrfwp.jpowsppfya().kcexrzcfyt("_experiment_preDrawFoQ").vdvldrhtss(ojitshcjhn().lqeggnwhkg()).oxmwwwfdhm(ojitshcjhn().gxszxtbevo(this.f24599hcddaimhww)).build());
        kcexrzcfyt(this.f24596cqumvgiudr);
    }

    private void kcexrzcfyt(final wflxmlrfwp.zoijcleaow zoijcleaowVar) {
        if (this.f24608pkzmftpjix == null || this.f24599hcddaimhww == null || this.f24604jpowsppfya == null) {
            return;
        }
        f24592ntlheqmsrt.execute(new Runnable() { // from class: hd.eablkybsjg
            @Override // java.lang.Runnable
            public final void run() {
                this.f40075zdlpuopuiu.vdvldrhtss(zoijcleaowVar);
            }
        });
        cqumvgiudr();
    }

    private Timer ojitshcjhn() {
        Timer timer = this.f24602istkbnxepw;
        return timer != null ? timer : draadjrbmk();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oxmwwwfdhm() {
        wflxmlrfwp.zoijcleaow zoijcleaowVarOxmwwwfdhm = wflxmlrfwp.jpowsppfya().kcexrzcfyt(md.ppxfxbqfkf.APP_START_TRACE_NAME.toString()).vdvldrhtss(draadjrbmk().lqeggnwhkg()).oxmwwwfdhm(draadjrbmk().gxszxtbevo(this.f24607lmojexxdyd));
        ArrayList arrayList = new ArrayList(3);
        arrayList.add((wflxmlrfwp) wflxmlrfwp.jpowsppfya().kcexrzcfyt(md.ppxfxbqfkf.ON_CREATE_TRACE_NAME.toString()).vdvldrhtss(draadjrbmk().lqeggnwhkg()).oxmwwwfdhm(draadjrbmk().gxszxtbevo(this.f24613yadqdtsiqt)).build());
        if (this.f24601iozdgvuglv != null) {
            wflxmlrfwp.zoijcleaow zoijcleaowVarJpowsppfya = wflxmlrfwp.jpowsppfya();
            zoijcleaowVarJpowsppfya.kcexrzcfyt(md.ppxfxbqfkf.ON_START_TRACE_NAME.toString()).vdvldrhtss(this.f24613yadqdtsiqt.lqeggnwhkg()).oxmwwwfdhm(this.f24613yadqdtsiqt.gxszxtbevo(this.f24601iozdgvuglv));
            arrayList.add((wflxmlrfwp) zoijcleaowVarJpowsppfya.build());
            wflxmlrfwp.zoijcleaow zoijcleaowVarJpowsppfya2 = wflxmlrfwp.jpowsppfya();
            zoijcleaowVarJpowsppfya2.kcexrzcfyt(md.ppxfxbqfkf.ON_RESUME_TRACE_NAME.toString()).vdvldrhtss(this.f24601iozdgvuglv.lqeggnwhkg()).oxmwwwfdhm(this.f24601iozdgvuglv.gxszxtbevo(this.f24607lmojexxdyd));
            arrayList.add((wflxmlrfwp) zoijcleaowVarJpowsppfya2.build());
        }
        zoijcleaowVarOxmwwwfdhm.nufgyqmvbu(arrayList).gtknphoqwx(this.f24600hkdspvbjdz.zoijcleaow());
        this.f24614yggfygwlhe.istkbnxepw((wflxmlrfwp) zoijcleaowVarOxmwwwfdhm.build(), wkgbmnqykc.FOREGROUND_BACKGROUND);
    }

    public static boolean rgvfuqvkyq(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return true;
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        String packageName = context.getPackageName();
        String str = packageName + StringUtils.PROCESS_POSTFIX_DELIMITER;
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.importance == 100 && (runningAppProcessInfo.processName.equals(packageName) || runningAppProcessInfo.processName.startsWith(str))) {
                return true;
            }
        }
        return false;
    }

    @Keep
    public static void setLauncherActivityOnCreateTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnResumeTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnStartTime(String str) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void vdvldrhtss(wflxmlrfwp.zoijcleaow zoijcleaowVar) {
        this.f24614yggfygwlhe.istkbnxepw((wflxmlrfwp) zoijcleaowVar.build(), wkgbmnqykc.FOREGROUND_BACKGROUND);
    }

    public static AppStartTrace wflxmlrfwp() {
        return f24591mbcevpiqjq != null ? f24591mbcevpiqjq : agtfadlqog(gtknphoqwx.gtknphoqwx(), new md.iobyxmoadg());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yggfygwlhe() {
        if (this.f24608pkzmftpjix != null) {
            return;
        }
        this.f24608pkzmftpjix = this.f24605jyumaefscl.iobyxmoadg();
        this.f24596cqumvgiudr.vdvldrhtss(ojitshcjhn().lqeggnwhkg()).oxmwwwfdhm(ojitshcjhn().gxszxtbevo(this.f24608pkzmftpjix));
        kcexrzcfyt(this.f24596cqumvgiudr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zdlpuopuiu() {
        if (this.f24604jpowsppfya != null) {
            return;
        }
        this.f24604jpowsppfya = this.f24605jyumaefscl.iobyxmoadg();
        this.f24596cqumvgiudr.draadjrbmk((wflxmlrfwp) wflxmlrfwp.jpowsppfya().kcexrzcfyt("_experiment_onDrawFoQ").vdvldrhtss(ojitshcjhn().lqeggnwhkg()).oxmwwwfdhm(ojitshcjhn().gxszxtbevo(this.f24604jpowsppfya)).build());
        if (this.f24602istkbnxepw != null) {
            this.f24596cqumvgiudr.draadjrbmk((wflxmlrfwp) wflxmlrfwp.jpowsppfya().kcexrzcfyt("_experiment_procStart_to_classLoad").vdvldrhtss(ojitshcjhn().lqeggnwhkg()).oxmwwwfdhm(ojitshcjhn().gxszxtbevo(draadjrbmk())).build());
        }
        this.f24596cqumvgiudr.rgvfuqvkyq("systemDeterminedForeground", this.f24610stevsuqkhv ? "true" : "false");
        this.f24596cqumvgiudr.ojitshcjhn("onDrawCount", this.f24597dsvhmnatus);
        this.f24596cqumvgiudr.gtknphoqwx(this.f24600hkdspvbjdz.zoijcleaow());
        kcexrzcfyt(this.f24596cqumvgiudr);
    }

    public synchronized void cqumvgiudr() {
        if (this.f24616zdlpuopuiu) {
            yadqdtsiqt.nufgyqmvbu().getLifecycle().wkgbmnqykc(this);
            ((Application) this.f24598esjtqupxsv).unregisterActivityLifecycleCallbacks(this);
            this.f24616zdlpuopuiu = false;
        }
    }

    public synchronized void iwizpuwonk(Context context) {
        try {
            if (this.f24616zdlpuopuiu) {
                return;
            }
            yadqdtsiqt.nufgyqmvbu().getLifecycle().iobyxmoadg(this);
            Context applicationContext = context.getApplicationContext();
            if (applicationContext instanceof Application) {
                ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
                this.f24610stevsuqkhv = this.f24610stevsuqkhv || rgvfuqvkyq(applicationContext);
                this.f24616zdlpuopuiu = true;
                this.f24598esjtqupxsv = applicationContext;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityCreated(Activity activity, Bundle bundle) {
        try {
            if (!this.f24595cllcsxoeiz && this.f24613yadqdtsiqt == null) {
                this.f24610stevsuqkhv = this.f24610stevsuqkhv || rgvfuqvkyq(this.f24598esjtqupxsv);
                this.f24606lereixgezr = new WeakReference(activity);
                this.f24613yadqdtsiqt = this.f24605jyumaefscl.iobyxmoadg();
                if (ojitshcjhn().gxszxtbevo(this.f24613yadqdtsiqt) > f24593tzroggbefp) {
                    this.f24617zynmafqrjb = true;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        if (this.f24595cllcsxoeiz || this.f24617zynmafqrjb || !this.f24603iwizpuwonk.nufgyqmvbu()) {
            return;
        }
        activity.findViewById(R.id.content).getViewTreeObserver().removeOnDrawListener(this.f24612wypolnanlu);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityResumed(Activity activity) {
        try {
            if (!this.f24595cllcsxoeiz && !this.f24617zynmafqrjb) {
                boolean zNufgyqmvbu = this.f24603iwizpuwonk.nufgyqmvbu();
                if (zNufgyqmvbu) {
                    View viewFindViewById = activity.findViewById(R.id.content);
                    viewFindViewById.getViewTreeObserver().addOnDrawListener(this.f24612wypolnanlu);
                    eablkybsjg.ppxfxbqfkf(viewFindViewById, new Runnable() { // from class: hd.iobyxmoadg
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f40079zdlpuopuiu.zdlpuopuiu();
                        }
                    });
                    nufgyqmvbu.iobyxmoadg(viewFindViewById, new Runnable() { // from class: hd.zoijcleaow
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f40091zdlpuopuiu.yggfygwlhe();
                        }
                    }, new Runnable() { // from class: hd.ppxfxbqfkf
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f40089zdlpuopuiu.jyumaefscl();
                        }
                    });
                }
                if (this.f24607lmojexxdyd != null) {
                    return;
                }
                this.f24609pmvmpeiblj = new WeakReference(activity);
                this.f24607lmojexxdyd = this.f24605jyumaefscl.iobyxmoadg();
                this.f24600hkdspvbjdz = SessionManager.getInstance().perfSession();
                gd.iobyxmoadg.eablkybsjg().iobyxmoadg("onResume(): " + activity.getClass().getName() + ": " + draadjrbmk().gxszxtbevo(this.f24607lmojexxdyd) + " microseconds");
                f24592ntlheqmsrt.execute(new Runnable() { // from class: hd.wkgbmnqykc
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f40090zdlpuopuiu.oxmwwwfdhm();
                    }
                });
                if (!zNufgyqmvbu) {
                    cqumvgiudr();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStarted(Activity activity) {
        if (!this.f24595cllcsxoeiz && this.f24601iozdgvuglv == null && !this.f24617zynmafqrjb) {
            this.f24601iozdgvuglv = this.f24605jyumaefscl.iobyxmoadg();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    @Keep
    @istkbnxepw(androidx.lifecycle.gtknphoqwx.iobyxmoadg.ON_STOP)
    public void onAppEnteredBackground() {
        if (this.f24595cllcsxoeiz || this.f24617zynmafqrjb || this.f24615ylkuphrtab != null) {
            return;
        }
        this.f24615ylkuphrtab = this.f24605jyumaefscl.iobyxmoadg();
        this.f24596cqumvgiudr.draadjrbmk((wflxmlrfwp) wflxmlrfwp.jpowsppfya().kcexrzcfyt("_experiment_firstBackgrounding").vdvldrhtss(ojitshcjhn().lqeggnwhkg()).oxmwwwfdhm(ojitshcjhn().gxszxtbevo(this.f24615ylkuphrtab)).build());
    }

    @Keep
    @istkbnxepw(androidx.lifecycle.gtknphoqwx.iobyxmoadg.ON_START)
    public void onAppEnteredForeground() {
        if (this.f24595cllcsxoeiz || this.f24617zynmafqrjb || this.f24611wwaezpbzkn != null) {
            return;
        }
        this.f24611wwaezpbzkn = this.f24605jyumaefscl.iobyxmoadg();
        this.f24596cqumvgiudr.draadjrbmk((wflxmlrfwp) wflxmlrfwp.jpowsppfya().kcexrzcfyt("_experiment_firstForegrounding").vdvldrhtss(ojitshcjhn().lqeggnwhkg()).oxmwwwfdhm(ojitshcjhn().gxszxtbevo(this.f24611wwaezpbzkn)).build());
    }
}
