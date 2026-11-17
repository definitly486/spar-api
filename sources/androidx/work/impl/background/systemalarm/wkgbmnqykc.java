package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.os.PowerManager;
import g6.yggfygwlhe;
import h6.esjtqupxsv;
import java.util.concurrent.Executor;
import l6.gxszxtbevo;
import l6.lqeggnwhkg;
import n6.agtfadlqog;
import p6.wflxmlrfwp;
import pj.auzgnhcxok;
import pj.pkzmftpjix;
import q6.cllcsxoeiz;
import q6.lmojexxdyd;

/* JADX INFO: loaded from: classes2.dex */
public class wkgbmnqykc implements l6.eablkybsjg, cllcsxoeiz.iobyxmoadg {

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private static final String f13919wwaezpbzkn = yggfygwlhe.dxjokdxxww("DelayMetCommandHandler");

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private boolean f13920cdpycssgdh;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final gxszxtbevo f13921cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final Object f13922esjtqupxsv;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private final pkzmftpjix f13923iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private PowerManager.WakeLock f13924istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final eablkybsjg f13925iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final wflxmlrfwp f13926jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private int f13927lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private volatile auzgnhcxok f13928lmojexxdyd;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final Executor f13929pmvmpeiblj;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private final esjtqupxsv f13930yadqdtsiqt;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final int f13931yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Context f13932zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final Executor f13933zynmafqrjb;

    wkgbmnqykc(Context context, int i13, eablkybsjg eablkybsjgVar, esjtqupxsv esjtqupxsvVar) {
        this.f13932zdlpuopuiu = context;
        this.f13931yggfygwlhe = i13;
        this.f13925iwizpuwonk = eablkybsjgVar;
        this.f13926jyumaefscl = esjtqupxsvVar.iobyxmoadg();
        this.f13930yadqdtsiqt = esjtqupxsvVar;
        agtfadlqog agtfadlqogVarZdlpuopuiu = eablkybsjgVar.lqeggnwhkg().zdlpuopuiu();
        this.f13929pmvmpeiblj = eablkybsjgVar.gxszxtbevo().ppxfxbqfkf();
        this.f13933zynmafqrjb = eablkybsjgVar.gxszxtbevo().iobyxmoadg();
        this.f13923iozdgvuglv = eablkybsjgVar.gxszxtbevo().zoijcleaow();
        this.f13921cqumvgiudr = new gxszxtbevo(agtfadlqogVarZdlpuopuiu);
        this.f13920cdpycssgdh = false;
        this.f13927lereixgezr = 0;
        this.f13922esjtqupxsv = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dxjokdxxww() {
        String strZoijcleaow = this.f13926jyumaefscl.zoijcleaow();
        if (this.f13927lereixgezr >= 2) {
            yggfygwlhe.eablkybsjg().iobyxmoadg(f13919wwaezpbzkn, "Already stopped work for " + strZoijcleaow);
            return;
        }
        this.f13927lereixgezr = 2;
        yggfygwlhe yggfygwlheVarEablkybsjg = yggfygwlhe.eablkybsjg();
        String str = f13919wwaezpbzkn;
        yggfygwlheVarEablkybsjg.iobyxmoadg(str, "Stopping work for WorkSpec " + strZoijcleaow);
        this.f13933zynmafqrjb.execute(new eablkybsjg.zoijcleaow(this.f13925iwizpuwonk, zoijcleaow.gxszxtbevo(this.f13932zdlpuopuiu, this.f13926jyumaefscl), this.f13931yggfygwlhe));
        if (!this.f13925iwizpuwonk.eablkybsjg().gtknphoqwx(this.f13926jyumaefscl.zoijcleaow())) {
            yggfygwlhe.eablkybsjg().iobyxmoadg(str, "Processor does not have WorkSpec " + strZoijcleaow + ". No need to reschedule");
            return;
        }
        yggfygwlhe.eablkybsjg().iobyxmoadg(str, "WorkSpec " + strZoijcleaow + " needs to be rescheduled");
        this.f13933zynmafqrjb.execute(new eablkybsjg.zoijcleaow(this.f13925iwizpuwonk, zoijcleaow.eablkybsjg(this.f13932zdlpuopuiu, this.f13926jyumaefscl), this.f13931yggfygwlhe));
    }

    private void eablkybsjg() {
        synchronized (this.f13922esjtqupxsv) {
            try {
                if (this.f13928lmojexxdyd != null) {
                    this.f13928lmojexxdyd.nufgyqmvbu(null);
                }
                this.f13925iwizpuwonk.nufgyqmvbu().zoijcleaow(this.f13926jyumaefscl);
                PowerManager.WakeLock wakeLock = this.f13924istkbnxepw;
                if (wakeLock != null && wakeLock.isHeld()) {
                    yggfygwlhe.eablkybsjg().iobyxmoadg(f13919wwaezpbzkn, "Releasing wakelock " + this.f13924istkbnxepw + "for WorkSpec " + this.f13926jyumaefscl);
                    this.f13924istkbnxepw.release();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void nufgyqmvbu() {
        if (this.f13927lereixgezr != 0) {
            yggfygwlhe.eablkybsjg().iobyxmoadg(f13919wwaezpbzkn, "Already started work for " + this.f13926jyumaefscl);
            return;
        }
        this.f13927lereixgezr = 1;
        yggfygwlhe.eablkybsjg().iobyxmoadg(f13919wwaezpbzkn, "onAllConstraintsMet for " + this.f13926jyumaefscl);
        if (this.f13925iwizpuwonk.eablkybsjg().oxmwwwfdhm(this.f13930yadqdtsiqt)) {
            this.f13925iwizpuwonk.nufgyqmvbu().iobyxmoadg(this.f13926jyumaefscl, 600000L, this);
        } else {
            eablkybsjg();
        }
    }

    void gxszxtbevo() {
        String strZoijcleaow = this.f13926jyumaefscl.zoijcleaow();
        this.f13924istkbnxepw = lmojexxdyd.zoijcleaow(this.f13932zdlpuopuiu, strZoijcleaow + " (" + this.f13931yggfygwlhe + ")");
        yggfygwlhe yggfygwlheVarEablkybsjg = yggfygwlhe.eablkybsjg();
        String str = f13919wwaezpbzkn;
        yggfygwlheVarEablkybsjg.iobyxmoadg(str, "Acquiring wakelock " + this.f13924istkbnxepw + "for WorkSpec " + strZoijcleaow);
        this.f13924istkbnxepw.acquire();
        p6.yggfygwlhe yggfygwlheVarDxjokdxxww = this.f13925iwizpuwonk.lqeggnwhkg().yggfygwlhe().ulzqkzuiru().dxjokdxxww(strZoijcleaow);
        if (yggfygwlheVarDxjokdxxww == null) {
            this.f13929pmvmpeiblj.execute(new j6.iobyxmoadg(this));
            return;
        }
        boolean zDraadjrbmk = yggfygwlheVarDxjokdxxww.draadjrbmk();
        this.f13920cdpycssgdh = zDraadjrbmk;
        if (zDraadjrbmk) {
            this.f13928lmojexxdyd = lqeggnwhkg.wkgbmnqykc(this.f13921cqumvgiudr, yggfygwlheVarDxjokdxxww, this.f13923iozdgvuglv, this);
            return;
        }
        yggfygwlhe.eablkybsjg().iobyxmoadg(str, "No constraints for " + strZoijcleaow);
        this.f13929pmvmpeiblj.execute(new j6.zoijcleaow(this));
    }

    @Override // q6.cllcsxoeiz.iobyxmoadg
    public void iobyxmoadg(wflxmlrfwp wflxmlrfwpVar) {
        yggfygwlhe.eablkybsjg().iobyxmoadg(f13919wwaezpbzkn, "Exceeded time limits on execution for " + wflxmlrfwpVar);
        this.f13929pmvmpeiblj.execute(new j6.iobyxmoadg(this));
    }

    void lqeggnwhkg(boolean z13) {
        yggfygwlhe.eablkybsjg().iobyxmoadg(f13919wwaezpbzkn, "onExecuted " + this.f13926jyumaefscl + ", " + z13);
        eablkybsjg();
        if (z13) {
            this.f13933zynmafqrjb.execute(new eablkybsjg.zoijcleaow(this.f13925iwizpuwonk, zoijcleaow.eablkybsjg(this.f13932zdlpuopuiu, this.f13926jyumaefscl), this.f13931yggfygwlhe));
        }
        if (this.f13920cdpycssgdh) {
            this.f13933zynmafqrjb.execute(new eablkybsjg.zoijcleaow(this.f13925iwizpuwonk, zoijcleaow.iobyxmoadg(this.f13932zdlpuopuiu), this.f13931yggfygwlhe));
        }
    }

    @Override // l6.eablkybsjg
    public void wkgbmnqykc(p6.yggfygwlhe yggfygwlheVar, l6.zoijcleaow zoijcleaowVar) {
        if (zoijcleaowVar instanceof l6.zoijcleaow.iobyxmoadg) {
            this.f13929pmvmpeiblj.execute(new j6.zoijcleaow(this));
        } else {
            this.f13929pmvmpeiblj.execute(new j6.iobyxmoadg(this));
        }
    }
}
