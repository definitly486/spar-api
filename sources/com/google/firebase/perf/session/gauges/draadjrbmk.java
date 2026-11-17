package com.google.firebase.perf.session.gauges;

import com.google.firebase.perf.util.Timer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import md.agtfadlqog;

/* JADX INFO: loaded from: classes2.dex */
public class draadjrbmk {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final gd.iobyxmoadg f24657gxszxtbevo = gd.iobyxmoadg.eablkybsjg();

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private long f24658eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ScheduledExecutorService f24659iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Runtime f24660ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private ScheduledFuture f24661wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ConcurrentLinkedQueue f24662zoijcleaow;

    draadjrbmk() {
        this(Executors.newSingleThreadScheduledExecutor(), Runtime.getRuntime());
    }

    private nd.zoijcleaow draadjrbmk(Timer timer) {
        if (timer == null) {
            return null;
        }
        return (nd.zoijcleaow) nd.zoijcleaow.btonecajqb().lqeggnwhkg(timer.ppxfxbqfkf()).nufgyqmvbu(wkgbmnqykc()).build();
    }

    private synchronized void dxjokdxxww(long j13, final Timer timer) {
        try {
            this.f24658eablkybsjg = j13;
            try {
                this.f24661wkgbmnqykc = this.f24659iobyxmoadg.scheduleAtFixedRate(new Runnable() { // from class: com.google.firebase.perf.session.gauges.btonecajqb
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f24656zdlpuopuiu.lqeggnwhkg(timer);
                    }
                }, 0L, j13, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e13) {
                f24657gxszxtbevo.btonecajqb("Unable to start collecting Memory Metrics: " + e13.getMessage());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static boolean eablkybsjg(long j13) {
        return j13 <= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void gxszxtbevo(Timer timer) {
        nd.zoijcleaow zoijcleaowVarDraadjrbmk = draadjrbmk(timer);
        if (zoijcleaowVarDraadjrbmk != null) {
            this.f24662zoijcleaow.add(zoijcleaowVarDraadjrbmk);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lqeggnwhkg(Timer timer) {
        nd.zoijcleaow zoijcleaowVarDraadjrbmk = draadjrbmk(timer);
        if (zoijcleaowVarDraadjrbmk != null) {
            this.f24662zoijcleaow.add(zoijcleaowVarDraadjrbmk);
        }
    }

    private synchronized void nufgyqmvbu(final Timer timer) {
        try {
            this.f24659iobyxmoadg.schedule(new Runnable() { // from class: com.google.firebase.perf.session.gauges.gtknphoqwx
                @Override // java.lang.Runnable
                public final void run() {
                    this.f24672zdlpuopuiu.gxszxtbevo(timer);
                }
            }, 0L, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e13) {
            f24657gxszxtbevo.btonecajqb("Unable to collect Memory Metric: " + e13.getMessage());
        }
    }

    private int wkgbmnqykc() {
        return agtfadlqog.ppxfxbqfkf(md.gtknphoqwx.f66811esjtqupxsv.wkgbmnqykc(this.f24660ppxfxbqfkf.totalMemory() - this.f24660ppxfxbqfkf.freeMemory()));
    }

    public void btonecajqb(long j13, Timer timer) {
        if (eablkybsjg(j13)) {
            return;
        }
        if (this.f24661wkgbmnqykc == null) {
            dxjokdxxww(j13, timer);
        } else if (this.f24658eablkybsjg != j13) {
            gtknphoqwx();
            dxjokdxxww(j13, timer);
        }
    }

    public void gtknphoqwx() {
        ScheduledFuture scheduledFuture = this.f24661wkgbmnqykc;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.f24661wkgbmnqykc = null;
        this.f24658eablkybsjg = -1L;
    }

    public void ppxfxbqfkf(Timer timer) {
        nufgyqmvbu(timer);
    }

    draadjrbmk(ScheduledExecutorService scheduledExecutorService, Runtime runtime) {
        this.f24661wkgbmnqykc = null;
        this.f24658eablkybsjg = -1L;
        this.f24659iobyxmoadg = scheduledExecutorService;
        this.f24662zoijcleaow = new ConcurrentLinkedQueue();
        this.f24660ppxfxbqfkf = runtime;
    }
}
