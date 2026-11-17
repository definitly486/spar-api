package com.google.firebase.concurrent;

import android.os.Process;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
class zoijcleaow implements ThreadFactory {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final ThreadFactory f24239eablkybsjg = Executors.defaultThreadFactory();

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final AtomicLong f24240iobyxmoadg = new AtomicLong();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f24241ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final StrictMode.ThreadPolicy f24242wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f24243zoijcleaow;

    zoijcleaow(String str, int i13, StrictMode.ThreadPolicy threadPolicy) {
        this.f24243zoijcleaow = str;
        this.f24241ppxfxbqfkf = i13;
        this.f24242wkgbmnqykc = threadPolicy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void zoijcleaow(Runnable runnable) {
        Process.setThreadPriority(this.f24241ppxfxbqfkf);
        StrictMode.ThreadPolicy threadPolicy = this.f24242wkgbmnqykc;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        runnable.run();
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(final Runnable runnable) {
        Thread threadNewThread = f24239eablkybsjg.newThread(new Runnable() { // from class: com.google.firebase.concurrent.iobyxmoadg
            @Override // java.lang.Runnable
            public final void run() {
                this.f24217zdlpuopuiu.zoijcleaow(runnable);
            }
        });
        threadNewThread.setName(String.format(Locale.ROOT, "%s Thread #%d", this.f24243zoijcleaow, Long.valueOf(this.f24240iobyxmoadg.getAndIncrement())));
        return threadNewThread;
    }
}
