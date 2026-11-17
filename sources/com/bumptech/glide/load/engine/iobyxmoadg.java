package com.bumptech.glide.load.engine;

import android.os.Process;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes2.dex */
final class iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private ojitshcjhn.iobyxmoadg f20877eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private volatile boolean f20878gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f20879iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    final Map f20880ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final ReferenceQueue f20881wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Executor f20882zoijcleaow;

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    class ThreadFactoryC0383iobyxmoadg implements ThreadFactory {

        /* JADX INFO: renamed from: com.bumptech.glide.load.engine.iobyxmoadg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        class RunnableC0384iobyxmoadg implements Runnable {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ Runnable f20884zdlpuopuiu;

            RunnableC0384iobyxmoadg(Runnable runnable) {
                this.f20884zdlpuopuiu = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                Process.setThreadPriority(10);
                this.f20884zdlpuopuiu.run();
            }
        }

        ThreadFactoryC0383iobyxmoadg() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(new RunnableC0384iobyxmoadg(runnable), "glide-active-resources");
        }
    }

    static final class ppxfxbqfkf extends WeakReference {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final l8.eablkybsjg f20885iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        n8.ppxfxbqfkf f20886ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final boolean f20887zoijcleaow;

        ppxfxbqfkf(l8.eablkybsjg eablkybsjgVar, ojitshcjhn ojitshcjhnVar, ReferenceQueue referenceQueue, boolean z13) {
            super(ojitshcjhnVar, referenceQueue);
            this.f20885iobyxmoadg = (l8.eablkybsjg) g9.gtknphoqwx.eablkybsjg(eablkybsjgVar);
            this.f20886ppxfxbqfkf = (ojitshcjhnVar.eablkybsjg() && z13) ? (n8.ppxfxbqfkf) g9.gtknphoqwx.eablkybsjg(ojitshcjhnVar.wkgbmnqykc()) : null;
            this.f20887zoijcleaow = ojitshcjhnVar.eablkybsjg();
        }

        void iobyxmoadg() {
            this.f20886ppxfxbqfkf = null;
            clear();
        }
    }

    class zoijcleaow implements Runnable {
        zoijcleaow() {
        }

        @Override // java.lang.Runnable
        public void run() {
            iobyxmoadg.this.zoijcleaow();
        }
    }

    iobyxmoadg(boolean z13) {
        this(z13, Executors.newSingleThreadExecutor(new ThreadFactoryC0383iobyxmoadg()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    synchronized ojitshcjhn eablkybsjg(l8.eablkybsjg eablkybsjgVar) {
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) this.f20880ppxfxbqfkf.get(eablkybsjgVar);
        if (ppxfxbqfkfVar == null) {
            return null;
        }
        ojitshcjhn ojitshcjhnVar = (ojitshcjhn) ppxfxbqfkfVar.get();
        if (ojitshcjhnVar == null) {
            ppxfxbqfkf(ppxfxbqfkfVar);
        }
        return ojitshcjhnVar;
    }

    void gxszxtbevo(ojitshcjhn.iobyxmoadg iobyxmoadgVar) {
        synchronized (iobyxmoadgVar) {
            synchronized (this) {
                this.f20877eablkybsjg = iobyxmoadgVar;
            }
        }
    }

    synchronized void iobyxmoadg(l8.eablkybsjg eablkybsjgVar, ojitshcjhn ojitshcjhnVar) {
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) this.f20880ppxfxbqfkf.put(eablkybsjgVar, new ppxfxbqfkf(eablkybsjgVar, ojitshcjhnVar, this.f20881wkgbmnqykc, this.f20879iobyxmoadg));
        if (ppxfxbqfkfVar != null) {
            ppxfxbqfkfVar.iobyxmoadg();
        }
    }

    void ppxfxbqfkf(ppxfxbqfkf ppxfxbqfkfVar) {
        n8.ppxfxbqfkf ppxfxbqfkfVar2;
        synchronized (this) {
            this.f20880ppxfxbqfkf.remove(ppxfxbqfkfVar.f20885iobyxmoadg);
            if (ppxfxbqfkfVar.f20887zoijcleaow && (ppxfxbqfkfVar2 = ppxfxbqfkfVar.f20886ppxfxbqfkf) != null) {
                this.f20877eablkybsjg.wkgbmnqykc(ppxfxbqfkfVar.f20885iobyxmoadg, new ojitshcjhn(ppxfxbqfkfVar2, true, false, ppxfxbqfkfVar.f20885iobyxmoadg, this.f20877eablkybsjg));
            }
        }
    }

    synchronized void wkgbmnqykc(l8.eablkybsjg eablkybsjgVar) {
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) this.f20880ppxfxbqfkf.remove(eablkybsjgVar);
        if (ppxfxbqfkfVar != null) {
            ppxfxbqfkfVar.iobyxmoadg();
        }
    }

    void zoijcleaow() {
        while (!this.f20878gxszxtbevo) {
            try {
                ppxfxbqfkf((ppxfxbqfkf) this.f20881wkgbmnqykc.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    iobyxmoadg(boolean z13, Executor executor) {
        this.f20880ppxfxbqfkf = new HashMap();
        this.f20881wkgbmnqykc = new ReferenceQueue();
        this.f20879iobyxmoadg = z13;
        this.f20882zoijcleaow = executor;
        executor.execute(new zoijcleaow());
    }
}
