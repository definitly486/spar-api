package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import g6.btonecajqb;
import g6.yggfygwlhe;
import h6.dsvhmnatus;
import h6.gxszxtbevo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import l6.eablkybsjg;
import l6.lqeggnwhkg;
import p6.lereixgezr;
import p6.wflxmlrfwp;
import pj.auzgnhcxok;

/* JADX INFO: loaded from: classes2.dex */
public class iobyxmoadg implements eablkybsjg, gxszxtbevo {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    static final String f13952cdpycssgdh = yggfygwlhe.dxjokdxxww("SystemFgDispatcher");

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    wflxmlrfwp f13953cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    final Map f13954esjtqupxsv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private zoijcleaow f13955istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    final Object f13956iwizpuwonk = new Object();

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final r6.zoijcleaow f13957jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    final Map f13958lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    final Map f13959pmvmpeiblj;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private dsvhmnatus f13960yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private Context f13961zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    final l6.gxszxtbevo f13962zynmafqrjb;

    /* JADX INFO: renamed from: androidx.work.impl.foreground.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    class RunnableC0207iobyxmoadg implements Runnable {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ String f13964zdlpuopuiu;

        RunnableC0207iobyxmoadg(String str) {
            this.f13964zdlpuopuiu = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            p6.yggfygwlhe yggfygwlheVarLqeggnwhkg = iobyxmoadg.this.f13960yggfygwlhe.oxmwwwfdhm().lqeggnwhkg(this.f13964zdlpuopuiu);
            if (yggfygwlheVarLqeggnwhkg == null || !yggfygwlheVarLqeggnwhkg.draadjrbmk()) {
                return;
            }
            synchronized (iobyxmoadg.this.f13956iwizpuwonk) {
                iobyxmoadg.this.f13958lereixgezr.put(lereixgezr.iobyxmoadg(yggfygwlheVarLqeggnwhkg), yggfygwlheVarLqeggnwhkg);
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                iobyxmoadg.this.f13959pmvmpeiblj.put(lereixgezr.iobyxmoadg(yggfygwlheVarLqeggnwhkg), lqeggnwhkg.wkgbmnqykc(iobyxmoadgVar.f13962zynmafqrjb, yggfygwlheVarLqeggnwhkg, iobyxmoadgVar.f13957jyumaefscl.zoijcleaow(), iobyxmoadg.this));
            }
        }
    }

    interface zoijcleaow {
        void iobyxmoadg(int i13, Notification notification);

        void ppxfxbqfkf(int i13, int i14, Notification notification);

        void stop();

        void wkgbmnqykc(int i13);
    }

    iobyxmoadg(Context context) {
        this.f13961zdlpuopuiu = context;
        dsvhmnatus dsvhmnatusVarRgvfuqvkyq = dsvhmnatus.rgvfuqvkyq(context);
        this.f13960yggfygwlhe = dsvhmnatusVarRgvfuqvkyq;
        this.f13957jyumaefscl = dsvhmnatusVarRgvfuqvkyq.jyumaefscl();
        this.f13953cqumvgiudr = null;
        this.f13954esjtqupxsv = new LinkedHashMap();
        this.f13959pmvmpeiblj = new HashMap();
        this.f13958lereixgezr = new HashMap();
        this.f13962zynmafqrjb = new l6.gxszxtbevo(this.f13960yggfygwlhe.zdlpuopuiu());
        this.f13960yggfygwlhe.oxmwwwfdhm().eablkybsjg(this);
    }

    private void btonecajqb(Intent intent) {
        yggfygwlhe.eablkybsjg().gxszxtbevo(f13952cdpycssgdh, "Started foreground service " + intent);
        this.f13957jyumaefscl.wkgbmnqykc(new RunnableC0207iobyxmoadg(intent.getStringExtra("KEY_WORKSPEC_ID")));
    }

    private void dxjokdxxww(Intent intent) {
        if (this.f13955istkbnxepw == null) {
            throw new IllegalStateException("handleNotify was called on the destroyed dispatcher");
        }
        int iIobyxmoadg = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        wflxmlrfwp wflxmlrfwpVar = new wflxmlrfwp(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        yggfygwlhe.eablkybsjg().iobyxmoadg(f13952cdpycssgdh, "Notifying with (id:" + intExtra + ", workSpecId: " + stringExtra + ", notificationType :" + intExtra2 + ")");
        if (notification == null) {
            throw new IllegalArgumentException("Notification passed in the intent was null.");
        }
        btonecajqb btonecajqbVar = new btonecajqb(intExtra, notification, intExtra2);
        this.f13954esjtqupxsv.put(wflxmlrfwpVar, btonecajqbVar);
        btonecajqb btonecajqbVar2 = (btonecajqb) this.f13954esjtqupxsv.get(this.f13953cqumvgiudr);
        if (btonecajqbVar2 == null) {
            this.f13953cqumvgiudr = wflxmlrfwpVar;
        } else {
            this.f13955istkbnxepw.iobyxmoadg(intExtra, notification);
            if (Build.VERSION.SDK_INT >= 29) {
                Iterator it = this.f13954esjtqupxsv.entrySet().iterator();
                while (it.hasNext()) {
                    iIobyxmoadg |= ((btonecajqb) ((Map.Entry) it.next()).getValue()).iobyxmoadg();
                }
                btonecajqbVar = new btonecajqb(btonecajqbVar2.ppxfxbqfkf(), btonecajqbVar2.zoijcleaow(), iIobyxmoadg);
            } else {
                btonecajqbVar = btonecajqbVar2;
            }
        }
        this.f13955istkbnxepw.ppxfxbqfkf(btonecajqbVar.ppxfxbqfkf(), btonecajqbVar.iobyxmoadg(), btonecajqbVar.zoijcleaow());
    }

    public static Intent eablkybsjg(Context context, wflxmlrfwp wflxmlrfwpVar, btonecajqb btonecajqbVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", btonecajqbVar.ppxfxbqfkf());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", btonecajqbVar.iobyxmoadg());
        intent.putExtra("KEY_NOTIFICATION", btonecajqbVar.zoijcleaow());
        intent.putExtra("KEY_WORKSPEC_ID", wflxmlrfwpVar.zoijcleaow());
        intent.putExtra("KEY_GENERATION", wflxmlrfwpVar.iobyxmoadg());
        return intent;
    }

    public static Intent gxszxtbevo(Context context, wflxmlrfwp wflxmlrfwpVar, btonecajqb btonecajqbVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", wflxmlrfwpVar.zoijcleaow());
        intent.putExtra("KEY_GENERATION", wflxmlrfwpVar.iobyxmoadg());
        intent.putExtra("KEY_NOTIFICATION_ID", btonecajqbVar.ppxfxbqfkf());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", btonecajqbVar.iobyxmoadg());
        intent.putExtra("KEY_NOTIFICATION", btonecajqbVar.zoijcleaow());
        return intent;
    }

    public static Intent lqeggnwhkg(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    private void nufgyqmvbu(Intent intent) {
        yggfygwlhe.eablkybsjg().gxszxtbevo(f13952cdpycssgdh, "Stopping foreground work for " + intent);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return;
        }
        this.f13960yggfygwlhe.gtknphoqwx(UUID.fromString(stringExtra));
    }

    void agtfadlqog(int i13, int i14) {
        yggfygwlhe.eablkybsjg().gxszxtbevo(f13952cdpycssgdh, "Foreground service timed out, FGS type: " + i14);
        for (Map.Entry entry : this.f13954esjtqupxsv.entrySet()) {
            if (((btonecajqb) entry.getValue()).iobyxmoadg() == i14) {
                this.f13960yggfygwlhe.zynmafqrjb((wflxmlrfwp) entry.getKey(), -128);
            }
        }
        zoijcleaow zoijcleaowVar = this.f13955istkbnxepw;
        if (zoijcleaowVar != null) {
            zoijcleaowVar.stop();
        }
    }

    void draadjrbmk() {
        this.f13955istkbnxepw = null;
        synchronized (this.f13956iwizpuwonk) {
            try {
                Iterator it = this.f13959pmvmpeiblj.values().iterator();
                while (it.hasNext()) {
                    ((auzgnhcxok) it.next()).nufgyqmvbu(null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f13960yggfygwlhe.oxmwwwfdhm().rgvfuqvkyq(this);
    }

    void gtknphoqwx(Intent intent) {
        yggfygwlhe.eablkybsjg().gxszxtbevo(f13952cdpycssgdh, "Stopping foreground service");
        zoijcleaow zoijcleaowVar = this.f13955istkbnxepw;
        if (zoijcleaowVar != null) {
            zoijcleaowVar.stop();
        }
    }

    void ojitshcjhn(zoijcleaow zoijcleaowVar) {
        if (this.f13955istkbnxepw != null) {
            yggfygwlhe.eablkybsjg().ppxfxbqfkf(f13952cdpycssgdh, "A callback already exists.");
        } else {
            this.f13955istkbnxepw = zoijcleaowVar;
        }
    }

    void wflxmlrfwp(Intent intent) {
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            btonecajqb(intent);
            dxjokdxxww(intent);
        } else if ("ACTION_NOTIFY".equals(action)) {
            dxjokdxxww(intent);
        } else if ("ACTION_CANCEL_WORK".equals(action)) {
            nufgyqmvbu(intent);
        } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
            gtknphoqwx(intent);
        }
    }

    @Override // l6.eablkybsjg
    public void wkgbmnqykc(p6.yggfygwlhe yggfygwlheVar, l6.zoijcleaow zoijcleaowVar) {
        if (zoijcleaowVar instanceof l6.zoijcleaow.C1248zoijcleaow) {
            String str = yggfygwlheVar.f75796iobyxmoadg;
            yggfygwlhe.eablkybsjg().iobyxmoadg(f13952cdpycssgdh, "Constraints unmet for WorkSpec " + str);
            this.f13960yggfygwlhe.zynmafqrjb(lereixgezr.iobyxmoadg(yggfygwlheVar), ((l6.zoijcleaow.C1248zoijcleaow) zoijcleaowVar).iobyxmoadg());
        }
    }

    @Override // h6.gxszxtbevo
    public void zoijcleaow(wflxmlrfwp wflxmlrfwpVar, boolean z13) {
        Map.Entry entry;
        synchronized (this.f13956iwizpuwonk) {
            try {
                auzgnhcxok auzgnhcxokVar = ((p6.yggfygwlhe) this.f13958lereixgezr.remove(wflxmlrfwpVar)) != null ? (auzgnhcxok) this.f13959pmvmpeiblj.remove(wflxmlrfwpVar) : null;
                if (auzgnhcxokVar != null) {
                    auzgnhcxokVar.nufgyqmvbu(null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        btonecajqb btonecajqbVar = (btonecajqb) this.f13954esjtqupxsv.remove(wflxmlrfwpVar);
        if (wflxmlrfwpVar.equals(this.f13953cqumvgiudr)) {
            if (this.f13954esjtqupxsv.size() > 0) {
                Iterator it = this.f13954esjtqupxsv.entrySet().iterator();
                Object next = it.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.f13953cqumvgiudr = (wflxmlrfwp) entry.getKey();
                if (this.f13955istkbnxepw != null) {
                    btonecajqb btonecajqbVar2 = (btonecajqb) entry.getValue();
                    this.f13955istkbnxepw.ppxfxbqfkf(btonecajqbVar2.ppxfxbqfkf(), btonecajqbVar2.iobyxmoadg(), btonecajqbVar2.zoijcleaow());
                    this.f13955istkbnxepw.wkgbmnqykc(btonecajqbVar2.ppxfxbqfkf());
                }
            } else {
                this.f13953cqumvgiudr = null;
            }
        }
        zoijcleaow zoijcleaowVar = this.f13955istkbnxepw;
        if (btonecajqbVar == null || zoijcleaowVar == null) {
            return;
        }
        yggfygwlhe.eablkybsjg().iobyxmoadg(f13952cdpycssgdh, "Removing Notification (id: " + btonecajqbVar.ppxfxbqfkf() + ", workSpecId: " + wflxmlrfwpVar + ", notificationType: " + btonecajqbVar.iobyxmoadg());
        zoijcleaowVar.wkgbmnqykc(btonecajqbVar.ppxfxbqfkf());
    }
}
