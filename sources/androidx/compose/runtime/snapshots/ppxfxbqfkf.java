package androidx.compose.runtime.snapshots;

import androidx.collection.wypolnanlu;
import gg.wwaezpbzkn;
import java.util.Map;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes.dex */
public final class ppxfxbqfkf extends zoijcleaow {

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private final zoijcleaow f6018kcexrzcfyt;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private boolean f6019zdlpuopuiu;

    public ppxfxbqfkf(long j13, dxjokdxxww dxjokdxxwwVar, tg.draadjrbmk draadjrbmkVar, tg.draadjrbmk draadjrbmkVar2, zoijcleaow zoijcleaowVar) {
        super(j13, dxjokdxxwwVar, draadjrbmkVar, draadjrbmkVar2);
        this.f6018kcexrzcfyt = zoijcleaowVar;
        zoijcleaowVar.wflxmlrfwp(this);
    }

    private final void ntlheqmsrt() {
        if (this.f6019zdlpuopuiu) {
            return;
        }
        this.f6019zdlpuopuiu = true;
        this.f6018kcexrzcfyt.agtfadlqog(this);
    }

    @Override // androidx.compose.runtime.snapshots.zoijcleaow
    public nufgyqmvbu istkbnxepw() {
        if (this.f6018kcexrzcfyt.cdpycssgdh() || this.f6018kcexrzcfyt.eablkybsjg()) {
            return new nufgyqmvbu.iobyxmoadg(this);
        }
        wypolnanlu wypolnanluVarYadqdtsiqt = yadqdtsiqt();
        long jDxjokdxxww = dxjokdxxww();
        Map mapJlmebxxoox = wypolnanluVarYadqdtsiqt != null ? btonecajqb.jlmebxxoox(this.f6018kcexrzcfyt.dxjokdxxww(), this, this.f6018kcexrzcfyt.gxszxtbevo()) : null;
        synchronized (btonecajqb.dsvhmnatus()) {
            try {
                btonecajqb.oipsdeybqn(this);
                if (wypolnanluVarYadqdtsiqt == null || wypolnanluVarYadqdtsiqt.ppxfxbqfkf() == 0) {
                    zoijcleaow();
                    wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                } else {
                    nufgyqmvbu nufgyqmvbuVarPkzmftpjix = pkzmftpjix(this.f6018kcexrzcfyt.dxjokdxxww(), wypolnanluVarYadqdtsiqt, mapJlmebxxoox, this.f6018kcexrzcfyt.gxszxtbevo());
                    if (!zdlpuopuiu.eablkybsjg(nufgyqmvbuVarPkzmftpjix, nufgyqmvbu.zoijcleaow.f6017iobyxmoadg)) {
                        return nufgyqmvbuVarPkzmftpjix;
                    }
                    wypolnanlu wypolnanluVarYadqdtsiqt2 = this.f6018kcexrzcfyt.yadqdtsiqt();
                    if (wypolnanluVarYadqdtsiqt2 != null) {
                        wypolnanluVarYadqdtsiqt2.dxjokdxxww(wypolnanluVarYadqdtsiqt);
                    } else {
                        this.f6018kcexrzcfyt.stevsuqkhv(wypolnanluVarYadqdtsiqt);
                        stevsuqkhv(null);
                    }
                }
                if (zdlpuopuiu.wflxmlrfwp(this.f6018kcexrzcfyt.dxjokdxxww(), jDxjokdxxww) < 0) {
                    this.f6018kcexrzcfyt.zynmafqrjb();
                }
                zoijcleaow zoijcleaowVar = this.f6018kcexrzcfyt;
                zoijcleaowVar.yggfygwlhe(zoijcleaowVar.gxszxtbevo().dxjokdxxww(jDxjokdxxww).gxszxtbevo(iozdgvuglv()));
                this.f6018kcexrzcfyt.hcddaimhww(jDxjokdxxww);
                this.f6018kcexrzcfyt.hkdspvbjdz(esjtqupxsv());
                this.f6018kcexrzcfyt.jpowsppfya(iozdgvuglv());
                this.f6018kcexrzcfyt.cllcsxoeiz(lmojexxdyd());
                wwaezpbzkn wwaezpbzknVar2 = wwaezpbzkn.f37140iobyxmoadg;
                wypolnanlu(true);
                ntlheqmsrt();
                eslsurpljm.zoijcleaow.ppxfxbqfkf(this, wypolnanluVarYadqdtsiqt);
                return nufgyqmvbu.zoijcleaow.f6017iobyxmoadg;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.compose.runtime.snapshots.zoijcleaow, androidx.compose.runtime.snapshots.lqeggnwhkg
    public void wkgbmnqykc() {
        if (eablkybsjg()) {
            return;
        }
        super.wkgbmnqykc();
        ntlheqmsrt();
    }
}
