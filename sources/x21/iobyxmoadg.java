package x21;

import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import java.io.IOException;
import kotlin.jvm.internal.zdlpuopuiu;
import lk.cdpycssgdh;
import lk.eablkybsjg;
import lk.gxszxtbevo;
import pj.agtfadlqog;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg implements gxszxtbevo, draadjrbmk {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final agtfadlqog f121044yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final eablkybsjg f121045zdlpuopuiu;

    public iobyxmoadg(eablkybsjg call, agtfadlqog continuation) {
        zdlpuopuiu.btonecajqb(call, "call");
        zdlpuopuiu.btonecajqb(continuation, "continuation");
        this.f121045zdlpuopuiu = call;
        this.f121044yggfygwlhe = continuation;
    }

    @Override // lk.gxszxtbevo
    public void gxszxtbevo(eablkybsjg call, IOException e13) {
        zdlpuopuiu.btonecajqb(call, "call");
        zdlpuopuiu.btonecajqb(e13, "e");
        if (call.btonecajqb()) {
            return;
        }
        agtfadlqog agtfadlqogVar = this.f121044yggfygwlhe;
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
            this.f121045zdlpuopuiu.cancel();
            kcexrzcfyt.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg);
        } catch (Throwable th3) {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
            kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th3));
        }
    }

    @Override // lk.gxszxtbevo
    public void ppxfxbqfkf(eablkybsjg call, cdpycssgdh response) {
        zdlpuopuiu.btonecajqb(call, "call");
        zdlpuopuiu.btonecajqb(response, "response");
        this.f121044yggfygwlhe.resumeWith(kcexrzcfyt.wkgbmnqykc(response));
    }
}
