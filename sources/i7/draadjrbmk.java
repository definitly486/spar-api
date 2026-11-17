package i7;

import gg.wwaezpbzkn;
import java.io.IOException;
import lk.cdpycssgdh;

/* JADX INFO: loaded from: classes2.dex */
final class draadjrbmk implements lk.gxszxtbevo, tg.draadjrbmk {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final pj.agtfadlqog f42054yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final lk.eablkybsjg f42055zdlpuopuiu;

    public draadjrbmk(lk.eablkybsjg eablkybsjgVar, pj.agtfadlqog agtfadlqogVar) {
        this.f42055zdlpuopuiu = eablkybsjgVar;
        this.f42054yggfygwlhe = agtfadlqogVar;
    }

    @Override // lk.gxszxtbevo
    public void gxszxtbevo(lk.eablkybsjg eablkybsjgVar, IOException iOException) {
        if (eablkybsjgVar.btonecajqb()) {
            return;
        }
        pj.agtfadlqog agtfadlqogVar = this.f42054yggfygwlhe;
        gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
        agtfadlqogVar.resumeWith(gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(iOException)));
    }

    @Override // tg.draadjrbmk
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        iobyxmoadg((Throwable) obj);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public void iobyxmoadg(Throwable th2) {
        try {
            this.f42055zdlpuopuiu.cancel();
        } catch (Throwable unused) {
        }
    }

    @Override // lk.gxszxtbevo
    public void ppxfxbqfkf(lk.eablkybsjg eablkybsjgVar, cdpycssgdh cdpycssgdhVar) {
        this.f42054yggfygwlhe.resumeWith(gg.kcexrzcfyt.wkgbmnqykc(cdpycssgdhVar));
    }
}
