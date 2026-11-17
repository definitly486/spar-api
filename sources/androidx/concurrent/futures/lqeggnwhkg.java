package androidx.concurrent.futures;

import gg.kcexrzcfyt;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.agtfadlqog;

/* JADX INFO: loaded from: classes.dex */
final class lqeggnwhkg implements Runnable {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final agtfadlqog f7515yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final com.google.common.util.concurrent.wkgbmnqykc f7516zdlpuopuiu;

    public lqeggnwhkg(com.google.common.util.concurrent.wkgbmnqykc futureToObserve, agtfadlqog continuation) {
        zdlpuopuiu.gtknphoqwx(futureToObserve, "futureToObserve");
        zdlpuopuiu.gtknphoqwx(continuation, "continuation");
        this.f7516zdlpuopuiu = futureToObserve;
        this.f7515yggfygwlhe = continuation;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f7516zdlpuopuiu.isCancelled()) {
            agtfadlqog.iobyxmoadg.iobyxmoadg(this.f7515yggfygwlhe, null, 1, null);
            return;
        }
        try {
            agtfadlqog agtfadlqogVar = this.f7515yggfygwlhe;
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
            agtfadlqogVar.resumeWith(kcexrzcfyt.wkgbmnqykc(iobyxmoadg.btonecajqb(this.f7516zdlpuopuiu)));
        } catch (ExecutionException e13) {
            agtfadlqog agtfadlqogVar2 = this.f7515yggfygwlhe;
            Throwable thPpxfxbqfkf = eablkybsjg.ppxfxbqfkf(e13);
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
            agtfadlqogVar2.resumeWith(kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(thPpxfxbqfkf)));
        }
    }
}
