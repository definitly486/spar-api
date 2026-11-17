package o40;

import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import java.io.IOException;
import kotlin.jvm.internal.zdlpuopuiu;
import lk.cdpycssgdh;
import lk.gxszxtbevo;
import pj.agtfadlqog;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg implements gxszxtbevo, draadjrbmk {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final agtfadlqog f72000yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final lk.eablkybsjg f72001zdlpuopuiu;

    public iobyxmoadg(lk.eablkybsjg call, agtfadlqog continuation) {
        zdlpuopuiu.btonecajqb(call, "call");
        zdlpuopuiu.btonecajqb(continuation, "continuation");
        this.f72001zdlpuopuiu = call;
        this.f72000yggfygwlhe = continuation;
    }

    @Override // lk.gxszxtbevo
    public void gxszxtbevo(lk.eablkybsjg call, IOException e13) {
        zdlpuopuiu.btonecajqb(call, "call");
        zdlpuopuiu.btonecajqb(e13, "e");
        if (call.btonecajqb()) {
            return;
        }
        agtfadlqog agtfadlqogVar = this.f72000yggfygwlhe;
        kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
        agtfadlqogVar.resumeWith(kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(e13)));
    }

    @Override // tg.draadjrbmk
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        iobyxmoadg((Throwable) obj);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public void iobyxmoadg(Throwable th2) {
        try {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
            this.f72001zdlpuopuiu.cancel();
            kcexrzcfyt.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg);
        } catch (Throwable th3) {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
            kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th3));
        }
    }

    @Override // lk.gxszxtbevo
    public void ppxfxbqfkf(lk.eablkybsjg call, cdpycssgdh response) {
        zdlpuopuiu.btonecajqb(call, "call");
        zdlpuopuiu.btonecajqb(response, "response");
        this.f72000yggfygwlhe.resumeWith(kcexrzcfyt.wkgbmnqykc(response));
    }
}
