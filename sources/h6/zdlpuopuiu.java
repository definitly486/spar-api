package h6;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes2.dex */
public class zdlpuopuiu implements o6.iobyxmoadg {

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private static final String f39664draadjrbmk = g6.yggfygwlhe.dxjokdxxww("Processor");

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private WorkDatabase f39667eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private androidx.work.iobyxmoadg f39673ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private r6.zoijcleaow f39674wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private Context f39675zoijcleaow;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private Map f39671lqeggnwhkg = new HashMap();

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private Map f39669gxszxtbevo = new HashMap();

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private Set f39666dxjokdxxww = new HashSet();

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final List f39665btonecajqb = new ArrayList();

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private PowerManager.WakeLock f39670iobyxmoadg = null;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final Object f39668gtknphoqwx = new Object();

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private Map f39672nufgyqmvbu = new HashMap();

    public zdlpuopuiu(Context context, androidx.work.iobyxmoadg iobyxmoadgVar, r6.zoijcleaow zoijcleaowVar, WorkDatabase workDatabase) {
        this.f39675zoijcleaow = context;
        this.f39673ppxfxbqfkf = iobyxmoadgVar;
        this.f39674wkgbmnqykc = zoijcleaowVar;
        this.f39667eablkybsjg = workDatabase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void agtfadlqog(com.google.common.util.concurrent.wkgbmnqykc wkgbmnqykcVar, ntlheqmsrt ntlheqmsrtVar) {
        boolean zBooleanValue;
        try {
            zBooleanValue = ((Boolean) wkgbmnqykcVar.get()).booleanValue();
        } catch (InterruptedException | ExecutionException unused) {
            zBooleanValue = true;
        }
        ojitshcjhn(ntlheqmsrtVar, zBooleanValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void draadjrbmk(p6.wflxmlrfwp wflxmlrfwpVar, boolean z13) {
        synchronized (this.f39668gtknphoqwx) {
            try {
                Iterator it = this.f39665btonecajqb.iterator();
                while (it.hasNext()) {
                    ((gxszxtbevo) it.next()).zoijcleaow(wflxmlrfwpVar, z13);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static boolean dxjokdxxww(String str, ntlheqmsrt ntlheqmsrtVar, int i13) {
        if (ntlheqmsrtVar == null) {
            g6.yggfygwlhe.eablkybsjg().iobyxmoadg(f39664draadjrbmk, "WorkerWrapper could not be found for " + str);
            return false;
        }
        ntlheqmsrtVar.ojitshcjhn(i13);
        g6.yggfygwlhe.eablkybsjg().iobyxmoadg(f39664draadjrbmk, "WorkerWrapper interrupted for " + str);
        return true;
    }

    private ntlheqmsrt gxszxtbevo(String str) {
        ntlheqmsrt ntlheqmsrtVar = (ntlheqmsrt) this.f39669gxszxtbevo.remove(str);
        boolean z13 = ntlheqmsrtVar != null;
        if (!z13) {
            ntlheqmsrtVar = (ntlheqmsrt) this.f39671lqeggnwhkg.remove(str);
        }
        this.f39672nufgyqmvbu.remove(str);
        if (z13) {
            yggfygwlhe();
        }
        return ntlheqmsrtVar;
    }

    private ntlheqmsrt nufgyqmvbu(String str) {
        ntlheqmsrt ntlheqmsrtVar = (ntlheqmsrt) this.f39669gxszxtbevo.get(str);
        return ntlheqmsrtVar == null ? (ntlheqmsrt) this.f39671lqeggnwhkg.get(str) : ntlheqmsrtVar;
    }

    private void ojitshcjhn(ntlheqmsrt ntlheqmsrtVar, boolean z13) {
        synchronized (this.f39668gtknphoqwx) {
            try {
                p6.wflxmlrfwp wflxmlrfwpVarDraadjrbmk = ntlheqmsrtVar.draadjrbmk();
                String strZoijcleaow = wflxmlrfwpVarDraadjrbmk.zoijcleaow();
                if (nufgyqmvbu(strZoijcleaow) == ntlheqmsrtVar) {
                    gxszxtbevo(strZoijcleaow);
                }
                g6.yggfygwlhe.eablkybsjg().iobyxmoadg(f39664draadjrbmk, getClass().getSimpleName() + " " + strZoijcleaow + " executed; reschedule = " + z13);
                Iterator it = this.f39665btonecajqb.iterator();
                while (it.hasNext()) {
                    ((gxszxtbevo) it.next()).zoijcleaow(wflxmlrfwpVarDraadjrbmk, z13);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void vdvldrhtss(final p6.wflxmlrfwp wflxmlrfwpVar, final boolean z13) {
        this.f39674wkgbmnqykc.iobyxmoadg().execute(new Runnable() { // from class: h6.kcexrzcfyt
            @Override // java.lang.Runnable
            public final void run() {
                this.f39575zdlpuopuiu.draadjrbmk(wflxmlrfwpVar, z13);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ p6.yggfygwlhe wflxmlrfwp(ArrayList arrayList, String str) {
        arrayList.addAll(this.f39667eablkybsjg.sopmlzcsov().iobyxmoadg(str));
        return this.f39667eablkybsjg.ulzqkzuiru().dxjokdxxww(str);
    }

    private void yggfygwlhe() {
        synchronized (this.f39668gtknphoqwx) {
            try {
                if (this.f39669gxszxtbevo.isEmpty()) {
                    try {
                        this.f39675zoijcleaow.startService(androidx.work.impl.foreground.iobyxmoadg.lqeggnwhkg(this.f39675zoijcleaow));
                    } catch (Throwable th2) {
                        g6.yggfygwlhe.eablkybsjg().wkgbmnqykc(f39664draadjrbmk, "Unable to stop foreground service", th2);
                    }
                    PowerManager.WakeLock wakeLock = this.f39670iobyxmoadg;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.f39670iobyxmoadg = null;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public boolean btonecajqb(String str) {
        boolean zContains;
        synchronized (this.f39668gtknphoqwx) {
            zContains = this.f39666dxjokdxxww.contains(str);
        }
        return zContains;
    }

    public void eablkybsjg(gxszxtbevo gxszxtbevoVar) {
        synchronized (this.f39668gtknphoqwx) {
            this.f39665btonecajqb.add(gxszxtbevoVar);
        }
    }

    public boolean gtknphoqwx(String str) {
        boolean z13;
        synchronized (this.f39668gtknphoqwx) {
            z13 = nufgyqmvbu(str) != null;
        }
        return z13;
    }

    @Override // o6.iobyxmoadg
    public void iobyxmoadg(String str, g6.btonecajqb btonecajqbVar) {
        synchronized (this.f39668gtknphoqwx) {
            try {
                g6.yggfygwlhe.eablkybsjg().gxszxtbevo(f39664draadjrbmk, "Moving WorkSpec (" + str + ") to the foreground");
                ntlheqmsrt ntlheqmsrtVar = (ntlheqmsrt) this.f39671lqeggnwhkg.remove(str);
                if (ntlheqmsrtVar != null) {
                    if (this.f39670iobyxmoadg == null) {
                        PowerManager.WakeLock wakeLockZoijcleaow = q6.lmojexxdyd.zoijcleaow(this.f39675zoijcleaow, "ProcessorForegroundLck");
                        this.f39670iobyxmoadg = wakeLockZoijcleaow;
                        wakeLockZoijcleaow.acquire();
                    }
                    this.f39669gxszxtbevo.put(str, ntlheqmsrtVar);
                    androidx.core.content.iobyxmoadg.startForegroundService(this.f39675zoijcleaow, androidx.work.impl.foreground.iobyxmoadg.gxszxtbevo(this.f39675zoijcleaow, ntlheqmsrtVar.draadjrbmk(), btonecajqbVar));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean iwizpuwonk(esjtqupxsv esjtqupxsvVar, int i13) {
        String strZoijcleaow = esjtqupxsvVar.iobyxmoadg().zoijcleaow();
        synchronized (this.f39668gtknphoqwx) {
            try {
                if (this.f39669gxszxtbevo.get(strZoijcleaow) == null) {
                    Set set = (Set) this.f39672nufgyqmvbu.get(strZoijcleaow);
                    if (set != null && set.contains(esjtqupxsvVar)) {
                        return dxjokdxxww(strZoijcleaow, gxszxtbevo(strZoijcleaow), i13);
                    }
                    return false;
                }
                g6.yggfygwlhe.eablkybsjg().iobyxmoadg(f39664draadjrbmk, "Ignored stopWork. WorkerWrapper " + strZoijcleaow + " is in foreground");
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean jyumaefscl(esjtqupxsv esjtqupxsvVar, int i13) {
        ntlheqmsrt ntlheqmsrtVarGxszxtbevo;
        String strZoijcleaow = esjtqupxsvVar.iobyxmoadg().zoijcleaow();
        synchronized (this.f39668gtknphoqwx) {
            ntlheqmsrtVarGxszxtbevo = gxszxtbevo(strZoijcleaow);
        }
        return dxjokdxxww(strZoijcleaow, ntlheqmsrtVarGxszxtbevo, i13);
    }

    public boolean kcexrzcfyt(esjtqupxsv esjtqupxsvVar, WorkerParameters.iobyxmoadg iobyxmoadgVar) {
        p6.wflxmlrfwp wflxmlrfwpVarIobyxmoadg = esjtqupxsvVar.iobyxmoadg();
        final String strZoijcleaow = wflxmlrfwpVarIobyxmoadg.zoijcleaow();
        final ArrayList arrayList = new ArrayList();
        p6.yggfygwlhe yggfygwlheVar = (p6.yggfygwlhe) this.f39667eablkybsjg.hkdspvbjdz(new Callable() { // from class: h6.vdvldrhtss
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f39654iobyxmoadg.wflxmlrfwp(arrayList, strZoijcleaow);
            }
        });
        if (yggfygwlheVar == null) {
            g6.yggfygwlhe.eablkybsjg().gtknphoqwx(f39664draadjrbmk, "Didn't find WorkSpec for id " + wflxmlrfwpVarIobyxmoadg);
            vdvldrhtss(wflxmlrfwpVarIobyxmoadg, false);
            return false;
        }
        synchronized (this.f39668gtknphoqwx) {
            try {
                if (gtknphoqwx(strZoijcleaow)) {
                    Set set = (Set) this.f39672nufgyqmvbu.get(strZoijcleaow);
                    if (((esjtqupxsv) set.iterator().next()).iobyxmoadg().iobyxmoadg() == wflxmlrfwpVarIobyxmoadg.iobyxmoadg()) {
                        set.add(esjtqupxsvVar);
                        g6.yggfygwlhe.eablkybsjg().iobyxmoadg(f39664draadjrbmk, "Work " + wflxmlrfwpVarIobyxmoadg + " is already enqueued for processing");
                    } else {
                        vdvldrhtss(wflxmlrfwpVarIobyxmoadg, false);
                    }
                    return false;
                }
                if (yggfygwlheVar.gxszxtbevo() != wflxmlrfwpVarIobyxmoadg.iobyxmoadg()) {
                    vdvldrhtss(wflxmlrfwpVarIobyxmoadg, false);
                    return false;
                }
                final ntlheqmsrt ntlheqmsrtVarIobyxmoadg = new ntlheqmsrt.iobyxmoadg(this.f39675zoijcleaow, this.f39673ppxfxbqfkf, this.f39674wkgbmnqykc, this, this.f39667eablkybsjg, yggfygwlheVar, arrayList).gtknphoqwx(iobyxmoadgVar).iobyxmoadg();
                final com.google.common.util.concurrent.wkgbmnqykc wkgbmnqykcVarVdvldrhtss = ntlheqmsrtVarIobyxmoadg.vdvldrhtss();
                wkgbmnqykcVarVdvldrhtss.iobyxmoadg(new Runnable() { // from class: h6.oxmwwwfdhm
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f39636zdlpuopuiu.agtfadlqog(wkgbmnqykcVarVdvldrhtss, ntlheqmsrtVarIobyxmoadg);
                    }
                }, this.f39674wkgbmnqykc.iobyxmoadg());
                this.f39671lqeggnwhkg.put(strZoijcleaow, ntlheqmsrtVarIobyxmoadg);
                HashSet hashSet = new HashSet();
                hashSet.add(esjtqupxsvVar);
                this.f39672nufgyqmvbu.put(strZoijcleaow, hashSet);
                g6.yggfygwlhe.eablkybsjg().iobyxmoadg(f39664draadjrbmk, getClass().getSimpleName() + ": processing " + wflxmlrfwpVarIobyxmoadg);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public p6.yggfygwlhe lqeggnwhkg(String str) {
        synchronized (this.f39668gtknphoqwx) {
            try {
                ntlheqmsrt ntlheqmsrtVarNufgyqmvbu = nufgyqmvbu(str);
                if (ntlheqmsrtVarNufgyqmvbu == null) {
                    return null;
                }
                return ntlheqmsrtVarNufgyqmvbu.wflxmlrfwp();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean oxmwwwfdhm(esjtqupxsv esjtqupxsvVar) {
        return kcexrzcfyt(esjtqupxsvVar, null);
    }

    public void rgvfuqvkyq(gxszxtbevo gxszxtbevoVar) {
        synchronized (this.f39668gtknphoqwx) {
            this.f39665btonecajqb.remove(gxszxtbevoVar);
        }
    }

    public boolean zdlpuopuiu(String str, int i13) {
        ntlheqmsrt ntlheqmsrtVarGxszxtbevo;
        synchronized (this.f39668gtknphoqwx) {
            g6.yggfygwlhe.eablkybsjg().iobyxmoadg(f39664draadjrbmk, "Processor cancelling " + str);
            this.f39666dxjokdxxww.add(str);
            ntlheqmsrtVarGxszxtbevo = gxszxtbevo(str);
        }
        return dxjokdxxww(str, ntlheqmsrtVarGxszxtbevo, i13);
    }
}
