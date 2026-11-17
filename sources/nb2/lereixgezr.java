package nb2;

import java.util.concurrent.ScheduledThreadPoolExecutor;

/* JADX INFO: loaded from: classes6.dex */
public final class lereixgezr implements ob2.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f69584iobyxmoadg = new ScheduledThreadPoolExecutor(1);

    public static final void zoijcleaow(tg.iobyxmoadg block) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(block, "$block");
        block.invoke();
    }

    @Override // ob2.iobyxmoadg
    public final void iobyxmoadg(final tg.iobyxmoadg block) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(block, "block");
        this.f69584iobyxmoadg.submit(new Runnable() { // from class: nb2.esjtqupxsv
            @Override // java.lang.Runnable
            public final void run() {
                lereixgezr.zoijcleaow(block);
            }
        });
    }
}
