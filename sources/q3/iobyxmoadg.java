package q3;

import java.util.concurrent.Executor;
import y2.wflxmlrfwp;

/* JADX INFO: loaded from: classes.dex */
public interface iobyxmoadg extends Executor {

    /* JADX INFO: renamed from: q3.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    class C1738iobyxmoadg implements iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ wflxmlrfwp f77788yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Executor f77789zdlpuopuiu;

        C1738iobyxmoadg(Executor executor, wflxmlrfwp wflxmlrfwpVar) {
            this.f77789zdlpuopuiu = executor;
            this.f77788yggfygwlhe = wflxmlrfwpVar;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f77789zdlpuopuiu.execute(runnable);
        }

        @Override // q3.iobyxmoadg
        public void release() {
            this.f77788yggfygwlhe.accept(this.f77789zdlpuopuiu);
        }
    }

    static iobyxmoadg kcexrzcfyt(Executor executor, wflxmlrfwp wflxmlrfwpVar) {
        return new C1738iobyxmoadg(executor, wflxmlrfwpVar);
    }

    void release();
}
