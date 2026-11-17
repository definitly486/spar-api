package com.google.firebase.concurrent;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
class ojitshcjhn implements ScheduledExecutorService {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final ScheduledExecutorService f24227yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final ExecutorService f24228zdlpuopuiu;

    ojitshcjhn(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.f24228zdlpuopuiu = executorService;
        this.f24227yggfygwlhe = scheduledExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void cdpycssgdh(Callable callable, rgvfuqvkyq.zoijcleaow zoijcleaowVar) {
        try {
            zoijcleaowVar.set(callable.call());
        } catch (Exception e13) {
            zoijcleaowVar.iobyxmoadg(e13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void dsvhmnatus(Runnable runnable, rgvfuqvkyq.zoijcleaow zoijcleaowVar) throws Exception {
        try {
            runnable.run();
        } catch (Exception e13) {
            zoijcleaowVar.iobyxmoadg(e13);
            throw e13;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ScheduledFuture hkdspvbjdz(final Callable callable, long j13, TimeUnit timeUnit, final rgvfuqvkyq.zoijcleaow zoijcleaowVar) {
        return this.f24227yggfygwlhe.schedule(new Callable() { // from class: com.google.firebase.concurrent.gtknphoqwx
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f24208iobyxmoadg.wwaezpbzkn(callable, zoijcleaowVar);
            }
        }, j13, timeUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ScheduledFuture istkbnxepw(final Runnable runnable, long j13, TimeUnit timeUnit, final rgvfuqvkyq.zoijcleaow zoijcleaowVar) {
        return this.f24227yggfygwlhe.schedule(new Runnable() { // from class: com.google.firebase.concurrent.btonecajqb
            @Override // java.lang.Runnable
            public final void run() {
                this.f24199zdlpuopuiu.pmvmpeiblj(runnable, zoijcleaowVar);
            }
        }, j13, timeUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ScheduledFuture kegysxyocb(final Runnable runnable, long j13, long j14, TimeUnit timeUnit, final rgvfuqvkyq.zoijcleaow zoijcleaowVar) {
        return this.f24227yggfygwlhe.scheduleAtFixedRate(new Runnable() { // from class: com.google.firebase.concurrent.dxjokdxxww
            @Override // java.lang.Runnable
            public final void run() {
                this.f24205zdlpuopuiu.wypolnanlu(runnable, zoijcleaowVar);
            }
        }, j13, j14, timeUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lereixgezr(Runnable runnable, rgvfuqvkyq.zoijcleaow zoijcleaowVar) {
        try {
            runnable.run();
            zoijcleaowVar.set(null);
        } catch (Exception e13) {
            zoijcleaowVar.iobyxmoadg(e13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void mbcevpiqjq(final Runnable runnable, final rgvfuqvkyq.zoijcleaow zoijcleaowVar) {
        this.f24228zdlpuopuiu.execute(new Runnable() { // from class: com.google.firebase.concurrent.eablkybsjg
            @Override // java.lang.Runnable
            public final void run() {
                ojitshcjhn.ulzqkzuiru(runnable, zoijcleaowVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ScheduledFuture ntlheqmsrt(final Runnable runnable, long j13, long j14, TimeUnit timeUnit, final rgvfuqvkyq.zoijcleaow zoijcleaowVar) {
        return this.f24227yggfygwlhe.scheduleWithFixedDelay(new Runnable() { // from class: com.google.firebase.concurrent.draadjrbmk
            @Override // java.lang.Runnable
            public final void run() {
                this.f24202zdlpuopuiu.mbcevpiqjq(runnable, zoijcleaowVar);
            }
        }, j13, j14, timeUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void pmvmpeiblj(final Runnable runnable, final rgvfuqvkyq.zoijcleaow zoijcleaowVar) {
        this.f24228zdlpuopuiu.execute(new Runnable() { // from class: com.google.firebase.concurrent.wflxmlrfwp
            @Override // java.lang.Runnable
            public final void run() {
                ojitshcjhn.lereixgezr(runnable, zoijcleaowVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void ulzqkzuiru(Runnable runnable, rgvfuqvkyq.zoijcleaow zoijcleaowVar) {
        try {
            runnable.run();
        } catch (Exception e13) {
            zoijcleaowVar.iobyxmoadg(e13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Future wwaezpbzkn(final Callable callable, final rgvfuqvkyq.zoijcleaow zoijcleaowVar) {
        return this.f24228zdlpuopuiu.submit(new Runnable() { // from class: com.google.firebase.concurrent.agtfadlqog
            @Override // java.lang.Runnable
            public final void run() {
                ojitshcjhn.cdpycssgdh(callable, zoijcleaowVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void wypolnanlu(final Runnable runnable, final rgvfuqvkyq.zoijcleaow zoijcleaowVar) {
        this.f24228zdlpuopuiu.execute(new Runnable() { // from class: com.google.firebase.concurrent.wkgbmnqykc
            @Override // java.lang.Runnable
            public final void run() throws Exception {
                ojitshcjhn.dsvhmnatus(runnable, zoijcleaowVar);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j13, TimeUnit timeUnit) {
        return this.f24228zdlpuopuiu.awaitTermination(j13, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f24228zdlpuopuiu.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection) {
        return this.f24228zdlpuopuiu.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection) {
        return this.f24228zdlpuopuiu.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f24228zdlpuopuiu.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f24228zdlpuopuiu.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(final Runnable runnable, final long j13, final TimeUnit timeUnit) {
        return new rgvfuqvkyq(new rgvfuqvkyq.ppxfxbqfkf() { // from class: com.google.firebase.concurrent.ppxfxbqfkf
            @Override // com.google.firebase.concurrent.rgvfuqvkyq.ppxfxbqfkf
            public final ScheduledFuture iobyxmoadg(rgvfuqvkyq.zoijcleaow zoijcleaowVar) {
                return this.f24229iobyxmoadg.istkbnxepw(runnable, j13, timeUnit, zoijcleaowVar);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleAtFixedRate(final Runnable runnable, final long j13, final long j14, final TimeUnit timeUnit) {
        return new rgvfuqvkyq(new rgvfuqvkyq.ppxfxbqfkf() { // from class: com.google.firebase.concurrent.gxszxtbevo
            @Override // com.google.firebase.concurrent.rgvfuqvkyq.ppxfxbqfkf
            public final ScheduledFuture iobyxmoadg(rgvfuqvkyq.zoijcleaow zoijcleaowVar) {
                return this.f24212iobyxmoadg.kegysxyocb(runnable, j13, j14, timeUnit, zoijcleaowVar);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleWithFixedDelay(final Runnable runnable, final long j13, final long j14, final TimeUnit timeUnit) {
        return new rgvfuqvkyq(new rgvfuqvkyq.ppxfxbqfkf() { // from class: com.google.firebase.concurrent.lqeggnwhkg
            @Override // com.google.firebase.concurrent.rgvfuqvkyq.ppxfxbqfkf
            public final ScheduledFuture iobyxmoadg(rgvfuqvkyq.zoijcleaow zoijcleaowVar) {
                return this.f24219iobyxmoadg.ntlheqmsrt(runnable, j13, j14, timeUnit, zoijcleaowVar);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Callable callable) {
        return this.f24228zdlpuopuiu.submit(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection, long j13, TimeUnit timeUnit) {
        return this.f24228zdlpuopuiu.invokeAll(collection, j13, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection, long j13, TimeUnit timeUnit) {
        return this.f24228zdlpuopuiu.invokeAny(collection, j13, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(final Callable callable, final long j13, final TimeUnit timeUnit) {
        return new rgvfuqvkyq(new rgvfuqvkyq.ppxfxbqfkf() { // from class: com.google.firebase.concurrent.nufgyqmvbu
            @Override // com.google.firebase.concurrent.rgvfuqvkyq.ppxfxbqfkf
            public final ScheduledFuture iobyxmoadg(rgvfuqvkyq.zoijcleaow zoijcleaowVar) {
                return this.f24223iobyxmoadg.hkdspvbjdz(callable, j13, timeUnit, zoijcleaowVar);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable, Object obj) {
        return this.f24228zdlpuopuiu.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable) {
        return this.f24228zdlpuopuiu.submit(runnable);
    }
}
