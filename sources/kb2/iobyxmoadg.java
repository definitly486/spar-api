package kb2;

import java.util.concurrent.Executor;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ppxfxbqfkf f54410iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Executor f54411zoijcleaow;

    public iobyxmoadg(ppxfxbqfkf onCompletionListener, Executor executor) {
        zdlpuopuiu.btonecajqb(onCompletionListener, "onCompletionListener");
        this.f54410iobyxmoadg = onCompletionListener;
        this.f54411zoijcleaow = executor;
    }

    public final Executor iobyxmoadg() {
        return this.f54411zoijcleaow;
    }

    public final ppxfxbqfkf zoijcleaow() {
        return this.f54410iobyxmoadg;
    }
}
