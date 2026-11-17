package r1;

import android.graphics.Typeface;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final gtknphoqwx.ppxfxbqfkf f81452iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Executor f81453zoijcleaow;

    /* JADX INFO: renamed from: r1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    class RunnableC1817iobyxmoadg implements Runnable {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ Typeface f81455yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx.ppxfxbqfkf f81456zdlpuopuiu;

        RunnableC1817iobyxmoadg(gtknphoqwx.ppxfxbqfkf ppxfxbqfkfVar, Typeface typeface) {
            this.f81456zdlpuopuiu = ppxfxbqfkfVar;
            this.f81455yggfygwlhe = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f81456zdlpuopuiu.zoijcleaow(this.f81455yggfygwlhe);
        }
    }

    class zoijcleaow implements Runnable {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ int f81458yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx.ppxfxbqfkf f81459zdlpuopuiu;

        zoijcleaow(gtknphoqwx.ppxfxbqfkf ppxfxbqfkfVar, int i13) {
            this.f81459zdlpuopuiu = ppxfxbqfkfVar;
            this.f81458yggfygwlhe = i13;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f81459zdlpuopuiu.iobyxmoadg(this.f81458yggfygwlhe);
        }
    }

    iobyxmoadg(gtknphoqwx.ppxfxbqfkf ppxfxbqfkfVar, Executor executor) {
        this.f81452iobyxmoadg = ppxfxbqfkfVar;
        this.f81453zoijcleaow = executor;
    }

    private void iobyxmoadg(int i13) {
        this.f81453zoijcleaow.execute(new zoijcleaow(this.f81452iobyxmoadg, i13));
    }

    private void ppxfxbqfkf(Typeface typeface) {
        this.f81453zoijcleaow.execute(new RunnableC1817iobyxmoadg(this.f81452iobyxmoadg, typeface));
    }

    void zoijcleaow(dxjokdxxww.eablkybsjg eablkybsjgVar) {
        if (eablkybsjgVar.iobyxmoadg()) {
            ppxfxbqfkf(eablkybsjgVar.f81427iobyxmoadg);
        } else {
            iobyxmoadg(eablkybsjgVar.f81428zoijcleaow);
        }
    }
}
