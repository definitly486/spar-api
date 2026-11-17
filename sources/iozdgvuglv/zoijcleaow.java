package iozdgvuglv;

import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
class zoijcleaow extends wkgbmnqykc implements Runnable {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private com.google.common.util.concurrent.wkgbmnqykc f49137esjtqupxsv;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private iozdgvuglv.iobyxmoadg f49139jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    volatile com.google.common.util.concurrent.wkgbmnqykc f49140lereixgezr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final BlockingQueue f49138iwizpuwonk = new LinkedBlockingQueue(1);

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final CountDownLatch f49136cqumvgiudr = new CountDownLatch(1);

    class iobyxmoadg implements Runnable {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ com.google.common.util.concurrent.wkgbmnqykc f49142zdlpuopuiu;

        iobyxmoadg(com.google.common.util.concurrent.wkgbmnqykc wkgbmnqykcVar) {
            this.f49142zdlpuopuiu = wkgbmnqykcVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    zoijcleaow.this.ppxfxbqfkf(gtknphoqwx.dxjokdxxww(this.f49142zdlpuopuiu));
                } catch (CancellationException unused) {
                    zoijcleaow.this.cancel(false);
                } catch (ExecutionException e13) {
                    zoijcleaow.this.wkgbmnqykc(e13.getCause());
                }
            } finally {
                zoijcleaow.this.f49140lereixgezr = null;
            }
        }
    }

    zoijcleaow(iozdgvuglv.iobyxmoadg iobyxmoadgVar, com.google.common.util.concurrent.wkgbmnqykc wkgbmnqykcVar) {
        this.f49139jyumaefscl = (iozdgvuglv.iobyxmoadg) u1.nufgyqmvbu.gxszxtbevo(iobyxmoadgVar);
        this.f49137esjtqupxsv = (com.google.common.util.concurrent.wkgbmnqykc) u1.nufgyqmvbu.gxszxtbevo(wkgbmnqykcVar);
    }

    private Object dxjokdxxww(BlockingQueue blockingQueue) {
        Object objTake;
        boolean z13 = false;
        while (true) {
            try {
                objTake = blockingQueue.take();
                break;
            } catch (InterruptedException unused) {
                z13 = true;
            } catch (Throwable th2) {
                if (z13) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z13) {
            Thread.currentThread().interrupt();
        }
        return objTake;
    }

    private void lqeggnwhkg(Future future, boolean z13) {
        if (future != null) {
            future.cancel(z13);
        }
    }

    private void nufgyqmvbu(BlockingQueue blockingQueue, Object obj) {
        boolean z13 = false;
        while (true) {
            try {
                blockingQueue.put(obj);
                break;
            } catch (InterruptedException unused) {
                z13 = true;
            } catch (Throwable th2) {
                if (z13) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z13) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // iozdgvuglv.wkgbmnqykc, java.util.concurrent.Future
    public boolean cancel(boolean z13) {
        if (!super.cancel(z13)) {
            return false;
        }
        nufgyqmvbu(this.f49138iwizpuwonk, Boolean.valueOf(z13));
        lqeggnwhkg(this.f49137esjtqupxsv, z13);
        lqeggnwhkg(this.f49140lereixgezr, z13);
        return true;
    }

    @Override // iozdgvuglv.wkgbmnqykc, java.util.concurrent.Future
    public Object get() throws ExecutionException, InterruptedException {
        if (!isDone()) {
            com.google.common.util.concurrent.wkgbmnqykc wkgbmnqykcVar = this.f49137esjtqupxsv;
            if (wkgbmnqykcVar != null) {
                wkgbmnqykcVar.get();
            }
            this.f49136cqumvgiudr.await();
            com.google.common.util.concurrent.wkgbmnqykc wkgbmnqykcVar2 = this.f49140lereixgezr;
            if (wkgbmnqykcVar2 != null) {
                wkgbmnqykcVar2.get();
            }
        }
        return super.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public void run() {
        try {
            try {
                try {
                    try {
                        try {
                            com.google.common.util.concurrent.wkgbmnqykc wkgbmnqykcVarApply = this.f49139jyumaefscl.apply(gtknphoqwx.dxjokdxxww(this.f49137esjtqupxsv));
                            this.f49140lereixgezr = wkgbmnqykcVarApply;
                            if (!isCancelled()) {
                                wkgbmnqykcVarApply.iobyxmoadg(new iobyxmoadg(wkgbmnqykcVarApply), yadqdtsiqt.iobyxmoadg.iobyxmoadg());
                            } else {
                                wkgbmnqykcVarApply.cancel(((Boolean) dxjokdxxww(this.f49138iwizpuwonk)).booleanValue());
                                this.f49140lereixgezr = null;
                            }
                        } catch (Exception e13) {
                            wkgbmnqykc(e13);
                        }
                    } catch (Error e14) {
                        wkgbmnqykc(e14);
                    }
                } finally {
                    this.f49139jyumaefscl = null;
                    this.f49137esjtqupxsv = null;
                    this.f49136cqumvgiudr.countDown();
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e15) {
                wkgbmnqykc(e15.getCause());
            }
        } catch (UndeclaredThrowableException e16) {
            wkgbmnqykc(e16.getCause());
        }
    }

    @Override // iozdgvuglv.wkgbmnqykc, java.util.concurrent.Future
    public Object get(long j13, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (!isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j13 = timeUnit2.convert(j13, timeUnit);
                timeUnit = timeUnit2;
            }
            com.google.common.util.concurrent.wkgbmnqykc wkgbmnqykcVar = this.f49137esjtqupxsv;
            if (wkgbmnqykcVar != null) {
                long jNanoTime = System.nanoTime();
                wkgbmnqykcVar.get(j13, timeUnit);
                j13 -= Math.max(0L, System.nanoTime() - jNanoTime);
            }
            long jNanoTime2 = System.nanoTime();
            if (this.f49136cqumvgiudr.await(j13, timeUnit)) {
                j13 -= Math.max(0L, System.nanoTime() - jNanoTime2);
                com.google.common.util.concurrent.wkgbmnqykc wkgbmnqykcVar2 = this.f49140lereixgezr;
                if (wkgbmnqykcVar2 != null) {
                    wkgbmnqykcVar2.get(j13, timeUnit);
                }
            } else {
                throw new TimeoutException();
            }
        }
        return super.get(j13, timeUnit);
    }
}
