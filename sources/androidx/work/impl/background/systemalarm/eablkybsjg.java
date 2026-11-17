package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import g6.yggfygwlhe;
import h6.dsvhmnatus;
import h6.gxszxtbevo;
import h6.hcddaimhww;
import h6.hkdspvbjdz;
import h6.lereixgezr;
import h6.zdlpuopuiu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import p6.wflxmlrfwp;
import q6.cllcsxoeiz;
import q6.lmojexxdyd;

/* JADX INFO: loaded from: classes2.dex */
public class eablkybsjg implements gxszxtbevo {

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    static final String f13895yadqdtsiqt = yggfygwlhe.dxjokdxxww("SystemAlarmDispatcher");

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private final hcddaimhww f13896cdpycssgdh;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final dsvhmnatus f13897cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    final androidx.work.impl.background.systemalarm.zoijcleaow f13898esjtqupxsv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private lereixgezr f13899istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final zdlpuopuiu f13900iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final cllcsxoeiz f13901jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    final List f13902lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    Intent f13903pmvmpeiblj;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    final r6.zoijcleaow f13904yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    final Context f13905zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private ppxfxbqfkf f13906zynmafqrjb;

    class iobyxmoadg implements Runnable {
        iobyxmoadg() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Executor executorIobyxmoadg;
            wkgbmnqykc wkgbmnqykcVar;
            synchronized (eablkybsjg.this.f13902lereixgezr) {
                eablkybsjg eablkybsjgVar = eablkybsjg.this;
                eablkybsjgVar.f13903pmvmpeiblj = (Intent) eablkybsjgVar.f13902lereixgezr.get(0);
            }
            Intent intent = eablkybsjg.this.f13903pmvmpeiblj;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = eablkybsjg.this.f13903pmvmpeiblj.getIntExtra("KEY_START_ID", 0);
                yggfygwlhe yggfygwlheVarEablkybsjg = yggfygwlhe.eablkybsjg();
                String str = eablkybsjg.f13895yadqdtsiqt;
                yggfygwlheVarEablkybsjg.iobyxmoadg(str, "Processing command " + eablkybsjg.this.f13903pmvmpeiblj + ", " + intExtra);
                PowerManager.WakeLock wakeLockZoijcleaow = lmojexxdyd.zoijcleaow(eablkybsjg.this.f13905zdlpuopuiu, action + " (" + intExtra + ")");
                try {
                    yggfygwlhe.eablkybsjg().iobyxmoadg(str, "Acquiring operation wake lock (" + action + ") " + wakeLockZoijcleaow);
                    wakeLockZoijcleaow.acquire();
                    eablkybsjg eablkybsjgVar2 = eablkybsjg.this;
                    eablkybsjgVar2.f13898esjtqupxsv.ojitshcjhn(eablkybsjgVar2.f13903pmvmpeiblj, intExtra, eablkybsjgVar2);
                    yggfygwlhe.eablkybsjg().iobyxmoadg(str, "Releasing operation wake lock (" + action + ") " + wakeLockZoijcleaow);
                    wakeLockZoijcleaow.release();
                    executorIobyxmoadg = eablkybsjg.this.f13904yggfygwlhe.iobyxmoadg();
                    wkgbmnqykcVar = new wkgbmnqykc(eablkybsjg.this);
                } catch (Throwable th2) {
                    try {
                        yggfygwlhe yggfygwlheVarEablkybsjg2 = yggfygwlhe.eablkybsjg();
                        String str2 = eablkybsjg.f13895yadqdtsiqt;
                        yggfygwlheVarEablkybsjg2.wkgbmnqykc(str2, "Unexpected error in onHandleIntent", th2);
                        yggfygwlhe.eablkybsjg().iobyxmoadg(str2, "Releasing operation wake lock (" + action + ") " + wakeLockZoijcleaow);
                        wakeLockZoijcleaow.release();
                        executorIobyxmoadg = eablkybsjg.this.f13904yggfygwlhe.iobyxmoadg();
                        wkgbmnqykcVar = new wkgbmnqykc(eablkybsjg.this);
                    } catch (Throwable th3) {
                        yggfygwlhe.eablkybsjg().iobyxmoadg(eablkybsjg.f13895yadqdtsiqt, "Releasing operation wake lock (" + action + ") " + wakeLockZoijcleaow);
                        wakeLockZoijcleaow.release();
                        eablkybsjg.this.f13904yggfygwlhe.iobyxmoadg().execute(new wkgbmnqykc(eablkybsjg.this));
                        throw th3;
                    }
                }
                executorIobyxmoadg.execute(wkgbmnqykcVar);
            }
        }
    }

    interface ppxfxbqfkf {
        void zoijcleaow();
    }

    static class wkgbmnqykc implements Runnable {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final eablkybsjg f13908zdlpuopuiu;

        wkgbmnqykc(eablkybsjg eablkybsjgVar) {
            this.f13908zdlpuopuiu = eablkybsjgVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f13908zdlpuopuiu.wkgbmnqykc();
        }
    }

    static class zoijcleaow implements Runnable {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private final int f13909jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final Intent f13910yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final eablkybsjg f13911zdlpuopuiu;

        zoijcleaow(eablkybsjg eablkybsjgVar, Intent intent, int i13) {
            this.f13911zdlpuopuiu = eablkybsjgVar;
            this.f13910yggfygwlhe = intent;
            this.f13909jyumaefscl = i13;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f13911zdlpuopuiu.iobyxmoadg(this.f13910yggfygwlhe, this.f13909jyumaefscl);
        }
    }

    eablkybsjg(Context context) {
        this(context, null, null, null);
    }

    private boolean btonecajqb(String str) {
        ppxfxbqfkf();
        synchronized (this.f13902lereixgezr) {
            try {
                Iterator it = this.f13902lereixgezr.iterator();
                while (it.hasNext()) {
                    if (str.equals(((Intent) it.next()).getAction())) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void draadjrbmk() {
        ppxfxbqfkf();
        PowerManager.WakeLock wakeLockZoijcleaow = lmojexxdyd.zoijcleaow(this.f13905zdlpuopuiu, "ProcessCommand");
        try {
            wakeLockZoijcleaow.acquire();
            this.f13897cqumvgiudr.jyumaefscl().wkgbmnqykc(new iobyxmoadg());
        } finally {
            wakeLockZoijcleaow.release();
        }
    }

    private void ppxfxbqfkf() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    hcddaimhww dxjokdxxww() {
        return this.f13896cdpycssgdh;
    }

    zdlpuopuiu eablkybsjg() {
        return this.f13900iwizpuwonk;
    }

    void gtknphoqwx() {
        yggfygwlhe.eablkybsjg().iobyxmoadg(f13895yadqdtsiqt, "Destroying SystemAlarmDispatcher");
        this.f13900iwizpuwonk.rgvfuqvkyq(this);
        this.f13906zynmafqrjb = null;
    }

    r6.zoijcleaow gxszxtbevo() {
        return this.f13904yggfygwlhe;
    }

    public boolean iobyxmoadg(Intent intent, int i13) {
        yggfygwlhe yggfygwlheVarEablkybsjg = yggfygwlhe.eablkybsjg();
        String str = f13895yadqdtsiqt;
        yggfygwlheVarEablkybsjg.iobyxmoadg(str, "Adding command " + intent + " (" + i13 + ")");
        ppxfxbqfkf();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            yggfygwlhe.eablkybsjg().gtknphoqwx(str, "Unknown command. Ignoring");
            return false;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && btonecajqb("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        }
        intent.putExtra("KEY_START_ID", i13);
        synchronized (this.f13902lereixgezr) {
            try {
                boolean zIsEmpty = this.f13902lereixgezr.isEmpty();
                this.f13902lereixgezr.add(intent);
                if (zIsEmpty) {
                    draadjrbmk();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }

    dsvhmnatus lqeggnwhkg() {
        return this.f13897cqumvgiudr;
    }

    cllcsxoeiz nufgyqmvbu() {
        return this.f13901jyumaefscl;
    }

    void wflxmlrfwp(ppxfxbqfkf ppxfxbqfkfVar) {
        if (this.f13906zynmafqrjb != null) {
            yggfygwlhe.eablkybsjg().ppxfxbqfkf(f13895yadqdtsiqt, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            this.f13906zynmafqrjb = ppxfxbqfkfVar;
        }
    }

    void wkgbmnqykc() {
        yggfygwlhe yggfygwlheVarEablkybsjg = yggfygwlhe.eablkybsjg();
        String str = f13895yadqdtsiqt;
        yggfygwlheVarEablkybsjg.iobyxmoadg(str, "Checking if commands are complete.");
        ppxfxbqfkf();
        synchronized (this.f13902lereixgezr) {
            try {
                if (this.f13903pmvmpeiblj != null) {
                    yggfygwlhe.eablkybsjg().iobyxmoadg(str, "Removing command " + this.f13903pmvmpeiblj);
                    if (!((Intent) this.f13902lereixgezr.remove(0)).equals(this.f13903pmvmpeiblj)) {
                        throw new IllegalStateException("Dequeue-d command is not the first.");
                    }
                    this.f13903pmvmpeiblj = null;
                }
                r6.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = this.f13904yggfygwlhe.ppxfxbqfkf();
                if (!this.f13898esjtqupxsv.agtfadlqog() && this.f13902lereixgezr.isEmpty() && !iobyxmoadgVarPpxfxbqfkf.zynmafqrjb()) {
                    yggfygwlhe.eablkybsjg().iobyxmoadg(str, "No more commands & intents.");
                    ppxfxbqfkf ppxfxbqfkfVar = this.f13906zynmafqrjb;
                    if (ppxfxbqfkfVar != null) {
                        ppxfxbqfkfVar.zoijcleaow();
                    }
                } else if (!this.f13902lereixgezr.isEmpty()) {
                    draadjrbmk();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // h6.gxszxtbevo
    public void zoijcleaow(wflxmlrfwp wflxmlrfwpVar, boolean z13) {
        this.f13904yggfygwlhe.iobyxmoadg().execute(new zoijcleaow(this, androidx.work.impl.background.systemalarm.zoijcleaow.wkgbmnqykc(this.f13905zdlpuopuiu, wflxmlrfwpVar, z13), 0));
    }

    eablkybsjg(Context context, zdlpuopuiu zdlpuopuiuVar, dsvhmnatus dsvhmnatusVar, hcddaimhww hcddaimhwwVar) {
        Context applicationContext = context.getApplicationContext();
        this.f13905zdlpuopuiu = applicationContext;
        this.f13899istkbnxepw = lereixgezr.iobyxmoadg();
        dsvhmnatusVar = dsvhmnatusVar == null ? dsvhmnatus.rgvfuqvkyq(context) : dsvhmnatusVar;
        this.f13897cqumvgiudr = dsvhmnatusVar;
        this.f13898esjtqupxsv = new androidx.work.impl.background.systemalarm.zoijcleaow(applicationContext, dsvhmnatusVar.agtfadlqog().iobyxmoadg(), this.f13899istkbnxepw);
        this.f13901jyumaefscl = new cllcsxoeiz(dsvhmnatusVar.agtfadlqog().gtknphoqwx());
        zdlpuopuiuVar = zdlpuopuiuVar == null ? dsvhmnatusVar.oxmwwwfdhm() : zdlpuopuiuVar;
        this.f13900iwizpuwonk = zdlpuopuiuVar;
        r6.zoijcleaow zoijcleaowVarJyumaefscl = dsvhmnatusVar.jyumaefscl();
        this.f13904yggfygwlhe = zoijcleaowVarJyumaefscl;
        this.f13896cdpycssgdh = hcddaimhwwVar == null ? new hkdspvbjdz(zdlpuopuiuVar, zoijcleaowVarJyumaefscl) : hcddaimhwwVar;
        zdlpuopuiuVar.eablkybsjg(this);
        this.f13902lereixgezr = new ArrayList();
        this.f13903pmvmpeiblj = null;
    }
}
