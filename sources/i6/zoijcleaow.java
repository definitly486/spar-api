package i6;

import android.content.Context;
import android.text.TextUtils;
import g6.hkdspvbjdz;
import g6.wwaezpbzkn;
import g6.yggfygwlhe;
import h6.esjtqupxsv;
import h6.gxszxtbevo;
import h6.hcddaimhww;
import h6.jyumaefscl;
import h6.lereixgezr;
import h6.zdlpuopuiu;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import l6.eablkybsjg;
import l6.lqeggnwhkg;
import n6.agtfadlqog;
import p6.wflxmlrfwp;
import pj.auzgnhcxok;
import q6.cdpycssgdh;

/* JADX INFO: loaded from: classes2.dex */
public class zoijcleaow implements jyumaefscl, eablkybsjg, gxszxtbevo {

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private static final String f41997wwaezpbzkn = yggfygwlhe.dxjokdxxww("GreedyScheduler");

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    Boolean f41998cdpycssgdh;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private final r6.zoijcleaow f42001iozdgvuglv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private boolean f42003iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private i6.iobyxmoadg f42004jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final zdlpuopuiu f42005lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private final wkgbmnqykc f42006lmojexxdyd;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final hcddaimhww f42007pmvmpeiblj;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private final l6.gxszxtbevo f42008yadqdtsiqt;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Context f42010zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final androidx.work.iobyxmoadg f42011zynmafqrjb;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final Map f42009yggfygwlhe = new HashMap();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final Object f41999cqumvgiudr = new Object();

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final lereixgezr f42000esjtqupxsv = lereixgezr.iobyxmoadg();

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final Map f42002istkbnxepw = new HashMap();

    /* JADX INFO: renamed from: i6.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    private static class C0986zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final int f42012iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final long f42013zoijcleaow;

        private C0986zoijcleaow(int i13, long j13) {
            this.f42012iobyxmoadg = i13;
            this.f42013zoijcleaow = j13;
        }
    }

    public zoijcleaow(Context context, androidx.work.iobyxmoadg iobyxmoadgVar, agtfadlqog agtfadlqogVar, zdlpuopuiu zdlpuopuiuVar, hcddaimhww hcddaimhwwVar, r6.zoijcleaow zoijcleaowVar) {
        this.f42010zdlpuopuiu = context;
        wwaezpbzkn wwaezpbzknVarGtknphoqwx = iobyxmoadgVar.gtknphoqwx();
        this.f42004jyumaefscl = new i6.iobyxmoadg(this, wwaezpbzknVarGtknphoqwx, iobyxmoadgVar.iobyxmoadg());
        this.f42006lmojexxdyd = new wkgbmnqykc(wwaezpbzknVarGtknphoqwx, hcddaimhwwVar);
        this.f42001iozdgvuglv = zoijcleaowVar;
        this.f42008yadqdtsiqt = new l6.gxszxtbevo(agtfadlqogVar);
        this.f42011zynmafqrjb = iobyxmoadgVar;
        this.f42005lereixgezr = zdlpuopuiuVar;
        this.f42007pmvmpeiblj = hcddaimhwwVar;
    }

    private long dxjokdxxww(p6.yggfygwlhe yggfygwlheVar) {
        long jMax;
        synchronized (this.f41999cqumvgiudr) {
            try {
                wflxmlrfwp wflxmlrfwpVarIobyxmoadg = p6.lereixgezr.iobyxmoadg(yggfygwlheVar);
                C0986zoijcleaow c0986zoijcleaow = (C0986zoijcleaow) this.f42002istkbnxepw.get(wflxmlrfwpVarIobyxmoadg);
                if (c0986zoijcleaow == null) {
                    c0986zoijcleaow = new C0986zoijcleaow(yggfygwlheVar.f75794gtknphoqwx, this.f42011zynmafqrjb.iobyxmoadg().currentTimeMillis());
                    this.f42002istkbnxepw.put(wflxmlrfwpVarIobyxmoadg, c0986zoijcleaow);
                }
                jMax = c0986zoijcleaow.f42013zoijcleaow + (((long) Math.max((yggfygwlheVar.f75794gtknphoqwx - c0986zoijcleaow.f42012iobyxmoadg) - 5, 0)) * 30000);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return jMax;
    }

    private void gxszxtbevo() {
        this.f41998cdpycssgdh = Boolean.valueOf(cdpycssgdh.zoijcleaow(this.f42010zdlpuopuiu, this.f42011zynmafqrjb));
    }

    private void lqeggnwhkg() {
        if (this.f42003iwizpuwonk) {
            return;
        }
        this.f42005lereixgezr.eablkybsjg(this);
        this.f42003iwizpuwonk = true;
    }

    private void nufgyqmvbu(wflxmlrfwp wflxmlrfwpVar) {
        auzgnhcxok auzgnhcxokVar;
        synchronized (this.f41999cqumvgiudr) {
            auzgnhcxokVar = (auzgnhcxok) this.f42009yggfygwlhe.remove(wflxmlrfwpVar);
        }
        if (auzgnhcxokVar != null) {
            yggfygwlhe.eablkybsjg().iobyxmoadg(f41997wwaezpbzkn, "Stopping tracking for " + wflxmlrfwpVar);
            auzgnhcxokVar.nufgyqmvbu(null);
        }
    }

    @Override // h6.jyumaefscl
    public boolean eablkybsjg() {
        return false;
    }

    @Override // h6.jyumaefscl
    public void iobyxmoadg(String str) {
        if (this.f41998cdpycssgdh == null) {
            gxszxtbevo();
        }
        if (!this.f41998cdpycssgdh.booleanValue()) {
            yggfygwlhe.eablkybsjg().gxszxtbevo(f41997wwaezpbzkn, "Ignoring schedule request in non-main process");
            return;
        }
        lqeggnwhkg();
        yggfygwlhe.eablkybsjg().iobyxmoadg(f41997wwaezpbzkn, "Cancelling work ID " + str);
        i6.iobyxmoadg iobyxmoadgVar = this.f42004jyumaefscl;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.zoijcleaow(str);
        }
        for (esjtqupxsv esjtqupxsvVar : this.f42000esjtqupxsv.remove(str)) {
            this.f42006lmojexxdyd.zoijcleaow(esjtqupxsvVar);
            this.f42007pmvmpeiblj.zoijcleaow(esjtqupxsvVar);
        }
    }

    @Override // h6.jyumaefscl
    public void ppxfxbqfkf(p6.yggfygwlhe... yggfygwlheVarArr) {
        if (this.f41998cdpycssgdh == null) {
            gxszxtbevo();
        }
        if (!this.f41998cdpycssgdh.booleanValue()) {
            yggfygwlhe.eablkybsjg().gxszxtbevo(f41997wwaezpbzkn, "Ignoring schedule request in a secondary process");
            return;
        }
        lqeggnwhkg();
        HashSet<p6.yggfygwlhe> hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (p6.yggfygwlhe yggfygwlheVar : yggfygwlheVarArr) {
            if (!this.f42000esjtqupxsv.zoijcleaow(p6.lereixgezr.iobyxmoadg(yggfygwlheVar))) {
                long jMax = Math.max(yggfygwlheVar.ppxfxbqfkf(), dxjokdxxww(yggfygwlheVar));
                long jCurrentTimeMillis = this.f42011zynmafqrjb.iobyxmoadg().currentTimeMillis();
                if (yggfygwlheVar.f75811zoijcleaow == hkdspvbjdz.ppxfxbqfkf.ENQUEUED) {
                    if (jCurrentTimeMillis < jMax) {
                        i6.iobyxmoadg iobyxmoadgVar = this.f42004jyumaefscl;
                        if (iobyxmoadgVar != null) {
                            iobyxmoadgVar.iobyxmoadg(yggfygwlheVar, jMax);
                        }
                    } else if (yggfygwlheVar.draadjrbmk()) {
                        g6.wkgbmnqykc wkgbmnqykcVar = yggfygwlheVar.f75789btonecajqb;
                        if (wkgbmnqykcVar.btonecajqb()) {
                            yggfygwlhe.eablkybsjg().iobyxmoadg(f41997wwaezpbzkn, "Ignoring " + yggfygwlheVar + ". Requires device idle.");
                        } else if (wkgbmnqykcVar.lqeggnwhkg()) {
                            yggfygwlhe.eablkybsjg().iobyxmoadg(f41997wwaezpbzkn, "Ignoring " + yggfygwlheVar + ". Requires ContentUri triggers.");
                        } else {
                            hashSet.add(yggfygwlheVar);
                            hashSet2.add(yggfygwlheVar.f75796iobyxmoadg);
                        }
                    } else if (!this.f42000esjtqupxsv.zoijcleaow(p6.lereixgezr.iobyxmoadg(yggfygwlheVar))) {
                        yggfygwlhe.eablkybsjg().iobyxmoadg(f41997wwaezpbzkn, "Starting work for " + yggfygwlheVar.f75796iobyxmoadg);
                        esjtqupxsv esjtqupxsvVarGxszxtbevo = this.f42000esjtqupxsv.gxszxtbevo(yggfygwlheVar);
                        this.f42006lmojexxdyd.ppxfxbqfkf(esjtqupxsvVarGxszxtbevo);
                        this.f42007pmvmpeiblj.wkgbmnqykc(esjtqupxsvVarGxszxtbevo);
                    }
                }
            }
        }
        synchronized (this.f41999cqumvgiudr) {
            try {
                if (!hashSet.isEmpty()) {
                    yggfygwlhe.eablkybsjg().iobyxmoadg(f41997wwaezpbzkn, "Starting tracking for " + TextUtils.join(StringUtils.COMMA, hashSet2));
                    for (p6.yggfygwlhe yggfygwlheVar2 : hashSet) {
                        wflxmlrfwp wflxmlrfwpVarIobyxmoadg = p6.lereixgezr.iobyxmoadg(yggfygwlheVar2);
                        if (!this.f42009yggfygwlhe.containsKey(wflxmlrfwpVarIobyxmoadg)) {
                            this.f42009yggfygwlhe.put(wflxmlrfwpVarIobyxmoadg, lqeggnwhkg.wkgbmnqykc(this.f42008yadqdtsiqt, yggfygwlheVar2, this.f42001iozdgvuglv.zoijcleaow(), this));
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // l6.eablkybsjg
    public void wkgbmnqykc(p6.yggfygwlhe yggfygwlheVar, l6.zoijcleaow zoijcleaowVar) {
        wflxmlrfwp wflxmlrfwpVarIobyxmoadg = p6.lereixgezr.iobyxmoadg(yggfygwlheVar);
        if (zoijcleaowVar instanceof l6.zoijcleaow.iobyxmoadg) {
            if (this.f42000esjtqupxsv.zoijcleaow(wflxmlrfwpVarIobyxmoadg)) {
                return;
            }
            yggfygwlhe.eablkybsjg().iobyxmoadg(f41997wwaezpbzkn, "Constraints met: Scheduling work ID " + wflxmlrfwpVarIobyxmoadg);
            esjtqupxsv esjtqupxsvVarWkgbmnqykc = this.f42000esjtqupxsv.wkgbmnqykc(wflxmlrfwpVarIobyxmoadg);
            this.f42006lmojexxdyd.ppxfxbqfkf(esjtqupxsvVarWkgbmnqykc);
            this.f42007pmvmpeiblj.wkgbmnqykc(esjtqupxsvVarWkgbmnqykc);
            return;
        }
        yggfygwlhe.eablkybsjg().iobyxmoadg(f41997wwaezpbzkn, "Constraints not met: Cancelling work ID " + wflxmlrfwpVarIobyxmoadg);
        esjtqupxsv esjtqupxsvVarEablkybsjg = this.f42000esjtqupxsv.eablkybsjg(wflxmlrfwpVarIobyxmoadg);
        if (esjtqupxsvVarEablkybsjg != null) {
            this.f42006lmojexxdyd.zoijcleaow(esjtqupxsvVarEablkybsjg);
            this.f42007pmvmpeiblj.eablkybsjg(esjtqupxsvVarEablkybsjg, ((l6.zoijcleaow.C1248zoijcleaow) zoijcleaowVar).iobyxmoadg());
        }
    }

    @Override // h6.gxszxtbevo
    public void zoijcleaow(wflxmlrfwp wflxmlrfwpVar, boolean z13) {
        esjtqupxsv esjtqupxsvVarEablkybsjg = this.f42000esjtqupxsv.eablkybsjg(wflxmlrfwpVar);
        if (esjtqupxsvVarEablkybsjg != null) {
            this.f42006lmojexxdyd.zoijcleaow(esjtqupxsvVarEablkybsjg);
        }
        nufgyqmvbu(wflxmlrfwpVar);
        if (z13) {
            return;
        }
        synchronized (this.f41999cqumvgiudr) {
            this.f42002istkbnxepw.remove(wflxmlrfwpVar);
        }
    }
}
