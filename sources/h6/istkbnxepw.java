package h6;

import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes2.dex */
final class istkbnxepw implements Runnable {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final pj.agtfadlqog f39564yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final com.google.common.util.concurrent.wkgbmnqykc f39565zdlpuopuiu;

    public istkbnxepw(com.google.common.util.concurrent.wkgbmnqykc futureToObserve, pj.agtfadlqog continuation) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(futureToObserve, "futureToObserve");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(continuation, "continuation");
        this.f39565zdlpuopuiu = futureToObserve;
        this.f39564yggfygwlhe = continuation;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f39565zdlpuopuiu.isCancelled()) {
            pj.agtfadlqog.iobyxmoadg.iobyxmoadg(this.f39564yggfygwlhe, null, 1, null);
            return;
        }
        try {
            pj.agtfadlqog agtfadlqogVar = this.f39564yggfygwlhe;
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
            agtfadlqogVar.resumeWith(gg.kcexrzcfyt.wkgbmnqykc(sopmlzcsov.eablkybsjg(this.f39565zdlpuopuiu)));
        } catch (ExecutionException e13) {
            pj.agtfadlqog agtfadlqogVar2 = this.f39564yggfygwlhe;
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
            agtfadlqogVar2.resumeWith(gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(sopmlzcsov.gxszxtbevo(e13))));
        }
    }
}
