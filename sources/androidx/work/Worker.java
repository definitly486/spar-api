package androidx.work;

import android.content.Context;
import com.google.common.util.concurrent.wkgbmnqykc;
import g6.btonecajqb;
import g6.ulzqkzuiru;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/work/Worker;", "Landroidx/work/ppxfxbqfkf;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/ppxfxbqfkf$iobyxmoadg;", "doWork", "()Landroidx/work/ppxfxbqfkf$iobyxmoadg;", "Lcom/google/common/util/concurrent/wkgbmnqykc;", "startWork", "()Lcom/google/common/util/concurrent/wkgbmnqykc;", "Lg6/btonecajqb;", "getForegroundInfoAsync", "getForegroundInfo", "()Lg6/btonecajqb;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class Worker extends ppxfxbqfkf {

    static final class iobyxmoadg extends jyumaefscl implements tg.iobyxmoadg {
        iobyxmoadg() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final btonecajqb invoke() {
            return Worker.this.getForegroundInfo();
        }
    }

    static final class zoijcleaow extends jyumaefscl implements tg.iobyxmoadg {
        zoijcleaow() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ppxfxbqfkf.iobyxmoadg invoke() {
            return Worker.this.doWork();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Worker(Context context, WorkerParameters workerParams) {
        super(context, workerParams);
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(workerParams, "workerParams");
    }

    public abstract ppxfxbqfkf.iobyxmoadg doWork();

    public btonecajqb getForegroundInfo() {
        throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`");
    }

    @Override // androidx.work.ppxfxbqfkf
    public wkgbmnqykc getForegroundInfoAsync() {
        Executor backgroundExecutor = getBackgroundExecutor();
        zdlpuopuiu.dxjokdxxww(backgroundExecutor, "backgroundExecutor");
        return ulzqkzuiru.eablkybsjg(backgroundExecutor, new iobyxmoadg());
    }

    @Override // androidx.work.ppxfxbqfkf
    public final wkgbmnqykc startWork() {
        Executor backgroundExecutor = getBackgroundExecutor();
        zdlpuopuiu.dxjokdxxww(backgroundExecutor, "backgroundExecutor");
        return ulzqkzuiru.eablkybsjg(backgroundExecutor, new zoijcleaow());
    }
}
