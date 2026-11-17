package kcexrzcfyt;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Executor f55039iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final AtomicInteger f55040zoijcleaow;

    public w(Executor executor) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(executor, "executor");
        this.f55039iobyxmoadg = executor;
        this.f55040zoijcleaow = new AtomicInteger(0);
    }

    public final void iobyxmoadg() {
        this.f55040zoijcleaow.set(0);
        lereixgezr.sopmlzcsov.iobyxmoadg("VideoUsageControl", "resetDirectly: mVideoUsage reset!");
    }
}
