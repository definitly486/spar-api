package com.google.firebase.perf.application;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.oxmwwwfdhm;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.util.Timer;
import hd.gxszxtbevo;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import ld.gtknphoqwx;
import md.btonecajqb;
import md.lqeggnwhkg;
import nd.wflxmlrfwp;

/* JADX INFO: loaded from: classes2.dex */
public class iobyxmoadg implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private static final gd.iobyxmoadg f24526hcddaimhww = gd.iobyxmoadg.eablkybsjg();

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private static volatile iobyxmoadg f24527jpowsppfya;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private final md.iobyxmoadg f24528cdpycssgdh;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final Map f24529cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final Set f24530esjtqupxsv;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private Timer f24531iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final com.google.firebase.perf.config.iobyxmoadg f24532istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final WeakHashMap f24533iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final WeakHashMap f24534jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private Set f24535lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private Timer f24536lmojexxdyd;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private boolean f24537pkzmftpjix;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final AtomicInteger f24538pmvmpeiblj;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private nd.wkgbmnqykc f24539wwaezpbzkn;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private final boolean f24540yadqdtsiqt;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final WeakHashMap f24541yggfygwlhe;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private boolean f24542ylkuphrtab;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final WeakHashMap f24543zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final gtknphoqwx f24544zynmafqrjb;

    /* JADX INFO: renamed from: com.google.firebase.perf.application.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public interface InterfaceC0419iobyxmoadg {
        void iobyxmoadg();
    }

    public interface zoijcleaow {
        void onUpdateAppState(nd.wkgbmnqykc wkgbmnqykcVar);
    }

    iobyxmoadg(gtknphoqwx gtknphoqwxVar, md.iobyxmoadg iobyxmoadgVar) {
        this(gtknphoqwxVar, iobyxmoadgVar, com.google.firebase.perf.config.iobyxmoadg.lqeggnwhkg(), lqeggnwhkg());
    }

    private void agtfadlqog(String str, Timer timer, Timer timer2) {
        if (this.f24532istkbnxepw.hcddaimhww()) {
            wflxmlrfwp.zoijcleaow zoijcleaowVarGtknphoqwx = wflxmlrfwp.jpowsppfya().kcexrzcfyt(str).vdvldrhtss(timer.lqeggnwhkg()).oxmwwwfdhm(timer.gxszxtbevo(timer2)).gtknphoqwx(SessionManager.getInstance().perfSession().zoijcleaow());
            int andSet = this.f24538pmvmpeiblj.getAndSet(0);
            synchronized (this.f24529cqumvgiudr) {
                try {
                    zoijcleaowVarGtknphoqwx.wflxmlrfwp(this.f24529cqumvgiudr);
                    if (andSet != 0) {
                        zoijcleaowVarGtknphoqwx.ojitshcjhn(md.zoijcleaow.TRACE_STARTED_NOT_STOPPED.toString(), andSet);
                    }
                    this.f24529cqumvgiudr.clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f24544zynmafqrjb.istkbnxepw((wflxmlrfwp) zoijcleaowVarGtknphoqwx.build(), nd.wkgbmnqykc.FOREGROUND_BACKGROUND);
        }
    }

    private void draadjrbmk() {
        synchronized (this.f24535lereixgezr) {
            try {
                for (InterfaceC0419iobyxmoadg interfaceC0419iobyxmoadg : this.f24535lereixgezr) {
                    if (interfaceC0419iobyxmoadg != null) {
                        interfaceC0419iobyxmoadg.iobyxmoadg();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static boolean lqeggnwhkg() {
        return wkgbmnqykc.iobyxmoadg();
    }

    private void ojitshcjhn(Activity activity) {
        if (nufgyqmvbu() && this.f24532istkbnxepw.hcddaimhww()) {
            wkgbmnqykc wkgbmnqykcVar = new wkgbmnqykc(activity);
            this.f24541yggfygwlhe.put(activity, wkgbmnqykcVar);
            if (activity instanceof oxmwwwfdhm) {
                ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(this.f24528cdpycssgdh, this.f24544zynmafqrjb, this, wkgbmnqykcVar);
                this.f24534jyumaefscl.put(activity, ppxfxbqfkfVar);
                ((oxmwwwfdhm) activity).getSupportFragmentManager().B(ppxfxbqfkfVar, true);
            }
        }
    }

    public static String ppxfxbqfkf(Activity activity) {
        return "_st_" + activity.getClass().getSimpleName();
    }

    private void vdvldrhtss(nd.wkgbmnqykc wkgbmnqykcVar) {
        this.f24539wwaezpbzkn = wkgbmnqykcVar;
        synchronized (this.f24530esjtqupxsv) {
            try {
                Iterator it = this.f24530esjtqupxsv.iterator();
                while (it.hasNext()) {
                    zoijcleaow zoijcleaowVar = (zoijcleaow) ((WeakReference) it.next()).get();
                    if (zoijcleaowVar != null) {
                        zoijcleaowVar.onUpdateAppState(this.f24539wwaezpbzkn);
                    } else {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void wflxmlrfwp(Activity activity) {
        Trace trace = (Trace) this.f24533iwizpuwonk.get(activity);
        if (trace == null) {
            return;
        }
        this.f24533iwizpuwonk.remove(activity);
        lqeggnwhkg lqeggnwhkgVarEablkybsjg = ((wkgbmnqykc) this.f24541yggfygwlhe.get(activity)).eablkybsjg();
        if (!lqeggnwhkgVarEablkybsjg.wkgbmnqykc()) {
            f24526hcddaimhww.gtknphoqwx("Failed to record frame data for %s.", activity.getClass().getSimpleName());
        } else {
            btonecajqb.iobyxmoadg(trace, (gxszxtbevo.iobyxmoadg) lqeggnwhkgVarEablkybsjg.ppxfxbqfkf());
            trace.stop();
        }
    }

    public static iobyxmoadg zoijcleaow() {
        if (f24527jpowsppfya == null) {
            synchronized (iobyxmoadg.class) {
                try {
                    if (f24527jpowsppfya == null) {
                        f24527jpowsppfya = new iobyxmoadg(gtknphoqwx.gtknphoqwx(), new md.iobyxmoadg());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f24527jpowsppfya;
    }

    public void btonecajqb(InterfaceC0419iobyxmoadg interfaceC0419iobyxmoadg) {
        synchronized (this.f24535lereixgezr) {
            this.f24535lereixgezr.add(interfaceC0419iobyxmoadg);
        }
    }

    public synchronized void dxjokdxxww(Context context) {
        if (this.f24542ylkuphrtab) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
            this.f24542ylkuphrtab = true;
        }
    }

    public void eablkybsjg(int i13) {
        this.f24538pmvmpeiblj.addAndGet(i13);
    }

    public void gtknphoqwx(WeakReference weakReference) {
        synchronized (this.f24530esjtqupxsv) {
            this.f24530esjtqupxsv.add(weakReference);
        }
    }

    public boolean gxszxtbevo() {
        return this.f24537pkzmftpjix;
    }

    public nd.wkgbmnqykc iobyxmoadg() {
        return this.f24539wwaezpbzkn;
    }

    protected boolean nufgyqmvbu() {
        return this.f24540yadqdtsiqt;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        ojitshcjhn(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        this.f24541yggfygwlhe.remove(activity);
        if (this.f24534jyumaefscl.containsKey(activity)) {
            ((oxmwwwfdhm) activity).getSupportFragmentManager().Y((FragmentManager.wflxmlrfwp) this.f24534jyumaefscl.remove(activity));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityResumed(Activity activity) {
        try {
            if (this.f24543zdlpuopuiu.isEmpty()) {
                this.f24531iozdgvuglv = this.f24528cdpycssgdh.iobyxmoadg();
                this.f24543zdlpuopuiu.put(activity, Boolean.TRUE);
                if (this.f24537pkzmftpjix) {
                    vdvldrhtss(nd.wkgbmnqykc.FOREGROUND);
                    draadjrbmk();
                    this.f24537pkzmftpjix = false;
                } else {
                    agtfadlqog(md.ppxfxbqfkf.BACKGROUND_TRACE_NAME.toString(), this.f24536lmojexxdyd, this.f24531iozdgvuglv);
                    vdvldrhtss(nd.wkgbmnqykc.FOREGROUND);
                }
            } else {
                this.f24543zdlpuopuiu.put(activity, Boolean.TRUE);
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
        try {
            if (nufgyqmvbu() && this.f24532istkbnxepw.hcddaimhww()) {
                if (!this.f24541yggfygwlhe.containsKey(activity)) {
                    ojitshcjhn(activity);
                }
                ((wkgbmnqykc) this.f24541yggfygwlhe.get(activity)).ppxfxbqfkf();
                Trace trace = new Trace(ppxfxbqfkf(activity), this.f24544zynmafqrjb, this.f24528cdpycssgdh, this);
                trace.start();
                this.f24533iwizpuwonk.put(activity, trace);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStopped(Activity activity) {
        try {
            if (nufgyqmvbu()) {
                wflxmlrfwp(activity);
            }
            if (this.f24543zdlpuopuiu.containsKey(activity)) {
                this.f24543zdlpuopuiu.remove(activity);
                if (this.f24543zdlpuopuiu.isEmpty()) {
                    this.f24536lmojexxdyd = this.f24528cdpycssgdh.iobyxmoadg();
                    agtfadlqog(md.ppxfxbqfkf.FOREGROUND_TRACE_NAME.toString(), this.f24531iozdgvuglv, this.f24536lmojexxdyd);
                    vdvldrhtss(nd.wkgbmnqykc.BACKGROUND);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void rgvfuqvkyq(WeakReference weakReference) {
        synchronized (this.f24530esjtqupxsv) {
            this.f24530esjtqupxsv.remove(weakReference);
        }
    }

    public void wkgbmnqykc(String str, long j13) {
        synchronized (this.f24529cqumvgiudr) {
            try {
                Long l13 = (Long) this.f24529cqumvgiudr.get(str);
                if (l13 == null) {
                    this.f24529cqumvgiudr.put(str, Long.valueOf(j13));
                } else {
                    this.f24529cqumvgiudr.put(str, Long.valueOf(l13.longValue() + j13));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    iobyxmoadg(gtknphoqwx gtknphoqwxVar, md.iobyxmoadg iobyxmoadgVar, com.google.firebase.perf.config.iobyxmoadg iobyxmoadgVar2, boolean z13) {
        this.f24543zdlpuopuiu = new WeakHashMap();
        this.f24541yggfygwlhe = new WeakHashMap();
        this.f24534jyumaefscl = new WeakHashMap();
        this.f24533iwizpuwonk = new WeakHashMap();
        this.f24529cqumvgiudr = new HashMap();
        this.f24530esjtqupxsv = new HashSet();
        this.f24535lereixgezr = new HashSet();
        this.f24538pmvmpeiblj = new AtomicInteger(0);
        this.f24539wwaezpbzkn = nd.wkgbmnqykc.BACKGROUND;
        this.f24542ylkuphrtab = false;
        this.f24537pkzmftpjix = true;
        this.f24544zynmafqrjb = gtknphoqwxVar;
        this.f24528cdpycssgdh = iobyxmoadgVar;
        this.f24532istkbnxepw = iobyxmoadgVar2;
        this.f24540yadqdtsiqt = z13;
    }
}
