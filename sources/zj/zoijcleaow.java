package zj;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.nufgyqmvbu;
import lg.gxszxtbevo;
import pj.agtfadlqog;
import pj.rgvfuqvkyq;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zoijcleaow {

    static final class iobyxmoadg implements OnCompleteListener {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ agtfadlqog f130274iobyxmoadg;

        iobyxmoadg(agtfadlqog agtfadlqogVar) {
            this.f130274iobyxmoadg = agtfadlqogVar;
        }

        @Override // com.google.android.gms.tasks.OnCompleteListener
        public final void onComplete(Task task) {
            Exception exception = task.getException();
            if (exception != null) {
                agtfadlqog agtfadlqogVar = this.f130274iobyxmoadg;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
                agtfadlqogVar.resumeWith(kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(exception)));
            } else {
                if (task.isCanceled()) {
                    agtfadlqog.iobyxmoadg.iobyxmoadg(this.f130274iobyxmoadg, null, 1, null);
                    return;
                }
                agtfadlqog agtfadlqogVar2 = this.f130274iobyxmoadg;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                agtfadlqogVar2.resumeWith(kcexrzcfyt.wkgbmnqykc(task.getResult()));
            }
        }
    }

    /* JADX INFO: renamed from: zj.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    static final class C3323zoijcleaow implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ CancellationTokenSource f130275zdlpuopuiu;

        C3323zoijcleaow(CancellationTokenSource cancellationTokenSource) {
            this.f130275zdlpuopuiu = cancellationTokenSource;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((Throwable) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(Throwable th2) {
            this.f130275zdlpuopuiu.cancel();
        }
    }

    public static final Object iobyxmoadg(Task task, gxszxtbevo gxszxtbevoVar) {
        return zoijcleaow(task, null, gxszxtbevoVar);
    }

    private static final Object zoijcleaow(Task task, CancellationTokenSource cancellationTokenSource, gxszxtbevo gxszxtbevoVar) throws Exception {
        if (!task.isComplete()) {
            rgvfuqvkyq rgvfuqvkyqVar = new rgvfuqvkyq(mg.zoijcleaow.ppxfxbqfkf(gxszxtbevoVar), 1);
            rgvfuqvkyqVar.lereixgezr();
            task.addOnCompleteListener(zj.iobyxmoadg.f130273zdlpuopuiu, new iobyxmoadg(rgvfuqvkyqVar));
            if (cancellationTokenSource != null) {
                rgvfuqvkyqVar.stevsuqkhv(new C3323zoijcleaow(cancellationTokenSource));
            }
            Object objZdlpuopuiu = rgvfuqvkyqVar.zdlpuopuiu();
            if (objZdlpuopuiu == mg.zoijcleaow.gxszxtbevo()) {
                nufgyqmvbu.ppxfxbqfkf(gxszxtbevoVar);
            }
            return objZdlpuopuiu;
        }
        Exception exception = task.getException();
        if (exception != null) {
            throw exception;
        }
        if (!task.isCanceled()) {
            return task.getResult();
        }
        throw new CancellationException("Task " + task + " was cancelled normally.");
    }
}
