package ld;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.perf.session.SessionManager;
import java.lang.ref.WeakReference;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import nd.wflxmlrfwp;

/* JADX INFO: loaded from: classes2.dex */
public class gtknphoqwx implements com.google.firebase.perf.application.iobyxmoadg.zoijcleaow {

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private static final gd.iobyxmoadg f62082hcddaimhww = gd.iobyxmoadg.eablkybsjg();

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private static final gtknphoqwx f62083jpowsppfya = new gtknphoqwx();

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private com.google.firebase.perf.config.iobyxmoadg f62084cdpycssgdh;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private dd.eablkybsjg f62085cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private uc.eablkybsjg f62086esjtqupxsv;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private com.google.firebase.perf.application.iobyxmoadg f62087iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private Context f62088istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private com.google.firebase.gxszxtbevo f62089iwizpuwonk;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private tc.zoijcleaow f62091lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private nd.ppxfxbqfkf.zoijcleaow f62092lmojexxdyd;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private zoijcleaow f62094pmvmpeiblj;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private String f62095wwaezpbzkn;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private wkgbmnqykc f62096yadqdtsiqt;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private String f62098ylkuphrtab;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Map f62099zdlpuopuiu;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final ConcurrentLinkedQueue f62097yggfygwlhe = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final AtomicBoolean f62090jyumaefscl = new AtomicBoolean(false);

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private boolean f62093pkzmftpjix = false;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private ExecutorService f62100zynmafqrjb = new ThreadPoolExecutor(0, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());

    private gtknphoqwx() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f62099zdlpuopuiu = concurrentHashMap;
        concurrentHashMap.put("KEY_AVAILABLE_TRACES_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", 50);
    }

    private static String agtfadlqog(nd.btonecajqb btonecajqbVar) {
        if (btonecajqbVar.wkgbmnqykc()) {
            return ojitshcjhn(btonecajqbVar.eablkybsjg());
        }
        if (btonecajqbVar.zoijcleaow()) {
            return wflxmlrfwp(btonecajqbVar.ppxfxbqfkf());
        }
        return btonecajqbVar.iobyxmoadg() ? draadjrbmk(btonecajqbVar.gxszxtbevo()) : "log";
    }

    private Map btonecajqb() {
        wwaezpbzkn();
        dd.eablkybsjg eablkybsjgVar = this.f62085cqumvgiudr;
        return eablkybsjgVar != null ? eablkybsjgVar.zoijcleaow() : Collections.emptyMap();
    }

    private nd.dxjokdxxww cdpycssgdh(nd.dxjokdxxww.zoijcleaow zoijcleaowVar, nd.wkgbmnqykc wkgbmnqykcVar) {
        lmojexxdyd();
        nd.ppxfxbqfkf.zoijcleaow zoijcleaowVarWflxmlrfwp = this.f62092lmojexxdyd.wflxmlrfwp(wkgbmnqykcVar);
        if (zoijcleaowVar.wkgbmnqykc() || zoijcleaowVar.zoijcleaow()) {
            zoijcleaowVarWflxmlrfwp = ((nd.ppxfxbqfkf.zoijcleaow) zoijcleaowVarWflxmlrfwp.mo5clone()).nufgyqmvbu(btonecajqb());
        }
        return (nd.dxjokdxxww) zoijcleaowVar.lqeggnwhkg(zoijcleaowVarWflxmlrfwp).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void cqumvgiudr(nd.nufgyqmvbu nufgyqmvbuVar, nd.wkgbmnqykc wkgbmnqykcVar) {
        iozdgvuglv(nd.dxjokdxxww.agtfadlqog().gtknphoqwx(nufgyqmvbuVar), wkgbmnqykcVar);
    }

    private static String draadjrbmk(nd.lqeggnwhkg lqeggnwhkgVar) {
        return String.format(Locale.ENGLISH, "gauges (hasMetadata: %b, cpuGaugeCount: %d, memoryGaugeCount: %d)", Boolean.valueOf(lqeggnwhkgVar.zdlpuopuiu()), Integer.valueOf(lqeggnwhkgVar.vdvldrhtss()), Integer.valueOf(lqeggnwhkgVar.rgvfuqvkyq()));
    }

    private String dxjokdxxww(wflxmlrfwp wflxmlrfwpVar) {
        String name = wflxmlrfwpVar.getName();
        return name.startsWith("_st_") ? gd.zoijcleaow.ppxfxbqfkf(this.f62098ylkuphrtab, this.f62095wwaezpbzkn, name) : gd.zoijcleaow.iobyxmoadg(this.f62098ylkuphrtab, this.f62095wwaezpbzkn, name);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void esjtqupxsv(nd.lqeggnwhkg lqeggnwhkgVar, nd.wkgbmnqykc wkgbmnqykcVar) {
        iozdgvuglv(nd.dxjokdxxww.agtfadlqog().nufgyqmvbu(lqeggnwhkgVar), wkgbmnqykcVar);
    }

    public static gtknphoqwx gtknphoqwx() {
        return f62083jpowsppfya;
    }

    private void iozdgvuglv(nd.dxjokdxxww.zoijcleaow zoijcleaowVar, nd.wkgbmnqykc wkgbmnqykcVar) {
        if (!yggfygwlhe()) {
            if (kcexrzcfyt(zoijcleaowVar)) {
                f62082hcddaimhww.zoijcleaow("Transport is not initialized yet, %s will be queued for to be dispatched later", agtfadlqog(zoijcleaowVar));
                this.f62097yggfygwlhe.add(new ppxfxbqfkf(zoijcleaowVar, wkgbmnqykcVar));
                return;
            }
            return;
        }
        nd.dxjokdxxww dxjokdxxwwVarCdpycssgdh = cdpycssgdh(zoijcleaowVar, wkgbmnqykcVar);
        if (zdlpuopuiu(dxjokdxxwwVarCdpycssgdh)) {
            lqeggnwhkg(dxjokdxxwwVarCdpycssgdh);
            SessionManager.getInstance().stopGaugeCollectionIfSessionRunningTooLong();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void iwizpuwonk(wflxmlrfwp wflxmlrfwpVar, nd.wkgbmnqykc wkgbmnqykcVar) {
        iozdgvuglv(nd.dxjokdxxww.agtfadlqog().draadjrbmk(wflxmlrfwpVar), wkgbmnqykcVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void jyumaefscl(ppxfxbqfkf ppxfxbqfkfVar) {
        iozdgvuglv(ppxfxbqfkfVar.f62110iobyxmoadg, ppxfxbqfkfVar.f62111zoijcleaow);
    }

    private boolean kcexrzcfyt(nd.btonecajqb btonecajqbVar) {
        Integer num = (Integer) this.f62099zdlpuopuiu.get("KEY_AVAILABLE_TRACES_FOR_CACHING");
        int iIntValue = num.intValue();
        Integer num2 = (Integer) this.f62099zdlpuopuiu.get("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING");
        int iIntValue2 = num2.intValue();
        Integer num3 = (Integer) this.f62099zdlpuopuiu.get("KEY_AVAILABLE_GAUGES_FOR_CACHING");
        int iIntValue3 = num3.intValue();
        if (btonecajqbVar.wkgbmnqykc() && iIntValue > 0) {
            this.f62099zdlpuopuiu.put("KEY_AVAILABLE_TRACES_FOR_CACHING", Integer.valueOf(iIntValue - 1));
            return true;
        }
        if (btonecajqbVar.zoijcleaow() && iIntValue2 > 0) {
            this.f62099zdlpuopuiu.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", Integer.valueOf(iIntValue2 - 1));
            return true;
        }
        if (!btonecajqbVar.iobyxmoadg() || iIntValue3 <= 0) {
            f62082hcddaimhww.zoijcleaow("%s is not allowed to cache. Cache exhausted the limit (availableTracesForCaching: %d, availableNetworkRequestsForCaching: %d, availableGaugesForCaching: %d).", agtfadlqog(btonecajqbVar), num, num2, num3);
            return false;
        }
        this.f62099zdlpuopuiu.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", Integer.valueOf(iIntValue3 - 1));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lereixgezr() {
        this.f62096yadqdtsiqt.iobyxmoadg(this.f62093pkzmftpjix);
    }

    private void lmojexxdyd() {
        String str;
        if (this.f62084cdpycssgdh.hcddaimhww()) {
            if (!this.f62092lmojexxdyd.lqeggnwhkg() || this.f62093pkzmftpjix) {
                try {
                    str = (String) Tasks.await(this.f62086esjtqupxsv.getId(), 60000L, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e13) {
                    f62082hcddaimhww.wkgbmnqykc("Task to retrieve Installation Id is interrupted: %s", e13.getMessage());
                    str = null;
                } catch (ExecutionException e14) {
                    f62082hcddaimhww.wkgbmnqykc("Unable to retrieve Installation Id: %s", e14.getMessage());
                    str = null;
                } catch (TimeoutException e15) {
                    f62082hcddaimhww.wkgbmnqykc("Task to retrieve Installation Id is timed out: %s", e15.getMessage());
                    str = null;
                }
                if (TextUtils.isEmpty(str)) {
                    f62082hcddaimhww.btonecajqb("Firebase Installation Id is empty, contact Firebase Support for debugging.");
                } else {
                    this.f62092lmojexxdyd.draadjrbmk(str);
                }
            }
        }
    }

    private void lqeggnwhkg(nd.dxjokdxxww dxjokdxxwwVar) {
        if (dxjokdxxwwVar.wkgbmnqykc()) {
            f62082hcddaimhww.lqeggnwhkg("Logging %s. In a minute, visit the Firebase console to view your data: %s", agtfadlqog(dxjokdxxwwVar), dxjokdxxww(dxjokdxxwwVar.eablkybsjg()));
        } else {
            f62082hcddaimhww.lqeggnwhkg("Logging %s", agtfadlqog(dxjokdxxwwVar));
        }
        this.f62094pmvmpeiblj.zoijcleaow(dxjokdxxwwVar);
    }

    private void nufgyqmvbu() {
        this.f62087iozdgvuglv.gtknphoqwx(new WeakReference(f62083jpowsppfya));
        nd.ppxfxbqfkf.zoijcleaow zoijcleaowVarYggfygwlhe = nd.ppxfxbqfkf.yggfygwlhe();
        this.f62092lmojexxdyd = zoijcleaowVarYggfygwlhe;
        zoijcleaowVarYggfygwlhe.agtfadlqog(this.f62089iwizpuwonk.agtfadlqog().ppxfxbqfkf()).gtknphoqwx(nd.iobyxmoadg.agtfadlqog().lqeggnwhkg(this.f62095wwaezpbzkn).nufgyqmvbu(dd.iobyxmoadg.f27851zoijcleaow).gtknphoqwx(rgvfuqvkyq(this.f62088istkbnxepw)));
        this.f62090jyumaefscl.set(true);
        while (!this.f62097yggfygwlhe.isEmpty()) {
            final ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) this.f62097yggfygwlhe.poll();
            if (ppxfxbqfkfVar != null) {
                this.f62100zynmafqrjb.execute(new Runnable() { // from class: ld.btonecajqb
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f62079zdlpuopuiu.jyumaefscl(ppxfxbqfkfVar);
                    }
                });
            }
        }
    }

    private static String ojitshcjhn(wflxmlrfwp wflxmlrfwpVar) {
        return String.format(Locale.ENGLISH, "trace metric: %s (duration: %sms)", wflxmlrfwpVar.getName(), new DecimalFormat("#.####").format(wflxmlrfwpVar.zynmafqrjb() / 1000.0d));
    }

    private static String rgvfuqvkyq(Context context) {
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            return str == null ? "" : str;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    private void vdvldrhtss(nd.dxjokdxxww dxjokdxxwwVar) {
        if (dxjokdxxwwVar.wkgbmnqykc()) {
            this.f62087iozdgvuglv.wkgbmnqykc(md.zoijcleaow.TRACE_EVENT_RATE_LIMITED.toString(), 1L);
        } else if (dxjokdxxwwVar.zoijcleaow()) {
            this.f62087iozdgvuglv.wkgbmnqykc(md.zoijcleaow.NETWORK_TRACE_EVENT_RATE_LIMITED.toString(), 1L);
        }
    }

    private static String wflxmlrfwp(nd.nufgyqmvbu nufgyqmvbuVar) {
        return String.format(Locale.ENGLISH, "network request trace: %s (responseCode: %s, responseTime: %sms)", nufgyqmvbuVar.ylkuphrtab(), nufgyqmvbuVar.jpowsppfya() ? String.valueOf(nufgyqmvbuVar.pmvmpeiblj()) : "UNKNOWN", new DecimalFormat("#.####").format((nufgyqmvbuVar.wypolnanlu() ? nufgyqmvbuVar.lmojexxdyd() : 0L) / 1000.0d));
    }

    private void wwaezpbzkn() {
        if (this.f62085cqumvgiudr == null && yggfygwlhe()) {
            this.f62085cqumvgiudr = dd.eablkybsjg.ppxfxbqfkf();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yadqdtsiqt() {
        Context contextGtknphoqwx = this.f62089iwizpuwonk.gtknphoqwx();
        this.f62088istkbnxepw = contextGtknphoqwx;
        this.f62095wwaezpbzkn = contextGtknphoqwx.getPackageName();
        this.f62084cdpycssgdh = com.google.firebase.perf.config.iobyxmoadg.lqeggnwhkg();
        this.f62096yadqdtsiqt = new wkgbmnqykc(this.f62088istkbnxepw, new md.dxjokdxxww(100L, 1L, TimeUnit.MINUTES), 500L);
        this.f62087iozdgvuglv = com.google.firebase.perf.application.iobyxmoadg.zoijcleaow();
        this.f62094pmvmpeiblj = new zoijcleaow(this.f62091lereixgezr, this.f62084cdpycssgdh.iobyxmoadg());
        nufgyqmvbu();
    }

    private boolean zdlpuopuiu(nd.dxjokdxxww dxjokdxxwwVar) {
        if (!this.f62084cdpycssgdh.hcddaimhww()) {
            f62082hcddaimhww.lqeggnwhkg("Performance collection is not enabled, dropping %s", agtfadlqog(dxjokdxxwwVar));
            return false;
        }
        if (!dxjokdxxwwVar.draadjrbmk().vdvldrhtss()) {
            f62082hcddaimhww.gtknphoqwx("App Instance ID is null or empty, dropping %s", agtfadlqog(dxjokdxxwwVar));
            return false;
        }
        if (!id.eablkybsjg.zoijcleaow(dxjokdxxwwVar, this.f62088istkbnxepw)) {
            f62082hcddaimhww.gtknphoqwx("Unable to process the PerfMetric (%s) due to missing or invalid values. See earlier log statements for additional information on the specific missing/invalid values.", agtfadlqog(dxjokdxxwwVar));
            return false;
        }
        if (!this.f62096yadqdtsiqt.nufgyqmvbu(dxjokdxxwwVar)) {
            vdvldrhtss(dxjokdxxwwVar);
            f62082hcddaimhww.lqeggnwhkg("Event dropped due to device sampling - %s", agtfadlqog(dxjokdxxwwVar));
            return false;
        }
        if (!this.f62096yadqdtsiqt.lqeggnwhkg(dxjokdxxwwVar)) {
            return true;
        }
        vdvldrhtss(dxjokdxxwwVar);
        f62082hcddaimhww.lqeggnwhkg("Rate limited (per device) - %s", agtfadlqog(dxjokdxxwwVar));
        return false;
    }

    public void istkbnxepw(final wflxmlrfwp wflxmlrfwpVar, final nd.wkgbmnqykc wkgbmnqykcVar) {
        this.f62100zynmafqrjb.execute(new Runnable() { // from class: ld.lqeggnwhkg
            @Override // java.lang.Runnable
            public final void run() {
                this.f62106zdlpuopuiu.iwizpuwonk(wflxmlrfwpVar, wkgbmnqykcVar);
            }
        });
    }

    @Override // com.google.firebase.perf.application.iobyxmoadg.zoijcleaow
    public void onUpdateAppState(nd.wkgbmnqykc wkgbmnqykcVar) {
        this.f62093pkzmftpjix = wkgbmnqykcVar == nd.wkgbmnqykc.FOREGROUND;
        if (yggfygwlhe()) {
            this.f62100zynmafqrjb.execute(new Runnable() { // from class: ld.eablkybsjg
                @Override // java.lang.Runnable
                public final void run() {
                    this.f62081zdlpuopuiu.lereixgezr();
                }
            });
        }
    }

    public void oxmwwwfdhm(com.google.firebase.gxszxtbevo gxszxtbevoVar, uc.eablkybsjg eablkybsjgVar, tc.zoijcleaow zoijcleaowVar) {
        this.f62089iwizpuwonk = gxszxtbevoVar;
        this.f62098ylkuphrtab = gxszxtbevoVar.agtfadlqog().eablkybsjg();
        this.f62086esjtqupxsv = eablkybsjgVar;
        this.f62091lereixgezr = zoijcleaowVar;
        this.f62100zynmafqrjb.execute(new Runnable() { // from class: ld.dxjokdxxww
            @Override // java.lang.Runnable
            public final void run() {
                this.f62080zdlpuopuiu.yadqdtsiqt();
            }
        });
    }

    public void pmvmpeiblj(final nd.lqeggnwhkg lqeggnwhkgVar, final nd.wkgbmnqykc wkgbmnqykcVar) {
        this.f62100zynmafqrjb.execute(new Runnable() { // from class: ld.gxszxtbevo
            @Override // java.lang.Runnable
            public final void run() {
                this.f62103zdlpuopuiu.esjtqupxsv(lqeggnwhkgVar, wkgbmnqykcVar);
            }
        });
    }

    public boolean yggfygwlhe() {
        return this.f62090jyumaefscl.get();
    }

    public void zynmafqrjb(final nd.nufgyqmvbu nufgyqmvbuVar, final nd.wkgbmnqykc wkgbmnqykcVar) {
        this.f62100zynmafqrjb.execute(new Runnable() { // from class: ld.nufgyqmvbu
            @Override // java.lang.Runnable
            public final void run() {
                this.f62109zdlpuopuiu.cqumvgiudr(nufgyqmvbuVar, wkgbmnqykcVar);
            }
        });
    }
}
