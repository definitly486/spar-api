package iozdgvuglv;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public abstract class gtknphoqwx {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final ojitshcjhn.iobyxmoadg f49110iobyxmoadg = new zoijcleaow();

    private static final class eablkybsjg implements Runnable {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final iozdgvuglv.ppxfxbqfkf f49111yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final Future f49112zdlpuopuiu;

        eablkybsjg(Future future, iozdgvuglv.ppxfxbqfkf ppxfxbqfkfVar) {
            this.f49112zdlpuopuiu = future;
            this.f49111yggfygwlhe = ppxfxbqfkfVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f49111yggfygwlhe.onSuccess(gtknphoqwx.nufgyqmvbu(this.f49112zdlpuopuiu));
            } catch (Error e13) {
                e = e13;
                this.f49111yggfygwlhe.onFailure(e);
            } catch (RuntimeException e14) {
                e = e14;
                this.f49111yggfygwlhe.onFailure(e);
            } catch (ExecutionException e15) {
                Throwable cause = e15.getCause();
                if (cause == null) {
                    this.f49111yggfygwlhe.onFailure(e15);
                } else {
                    this.f49111yggfygwlhe.onFailure(cause);
                }
            }
        }

        public String toString() {
            return eablkybsjg.class.getSimpleName() + StringUtils.COMMA + this.f49111yggfygwlhe;
        }
    }

    class iobyxmoadg implements iozdgvuglv.iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ ojitshcjhn.iobyxmoadg f49113iobyxmoadg;

        iobyxmoadg(ojitshcjhn.iobyxmoadg iobyxmoadgVar) {
            this.f49113iobyxmoadg = iobyxmoadgVar;
        }

        @Override // iozdgvuglv.iobyxmoadg
        public com.google.common.util.concurrent.wkgbmnqykc apply(Object obj) {
            return gtknphoqwx.draadjrbmk(this.f49113iobyxmoadg.apply(obj));
        }
    }

    class ppxfxbqfkf implements iozdgvuglv.ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg f49114iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ ojitshcjhn.iobyxmoadg f49115zoijcleaow;

        ppxfxbqfkf(androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar, ojitshcjhn.iobyxmoadg iobyxmoadgVar2) {
            this.f49114iobyxmoadg = iobyxmoadgVar;
            this.f49115zoijcleaow = iobyxmoadgVar2;
        }

        @Override // iozdgvuglv.ppxfxbqfkf
        public void onFailure(Throwable th2) {
            this.f49114iobyxmoadg.gxszxtbevo(th2);
        }

        @Override // iozdgvuglv.ppxfxbqfkf
        public void onSuccess(Object obj) {
            try {
                this.f49114iobyxmoadg.ppxfxbqfkf(this.f49115zoijcleaow.apply(obj));
            } catch (Throwable th2) {
                this.f49114iobyxmoadg.gxszxtbevo(th2);
            }
        }
    }

    class wkgbmnqykc implements Runnable {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ com.google.common.util.concurrent.wkgbmnqykc f49116zdlpuopuiu;

        wkgbmnqykc(com.google.common.util.concurrent.wkgbmnqykc wkgbmnqykcVar) {
            this.f49116zdlpuopuiu = wkgbmnqykcVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f49116zdlpuopuiu.cancel(true);
        }
    }

    class zoijcleaow implements ojitshcjhn.iobyxmoadg {
        zoijcleaow() {
        }

        @Override // ojitshcjhn.iobyxmoadg
        public Object apply(Object obj) {
            return obj;
        }
    }

    public static com.google.common.util.concurrent.wkgbmnqykc btonecajqb(Throwable th2) {
        return new draadjrbmk.iobyxmoadg(th2);
    }

    public static com.google.common.util.concurrent.wkgbmnqykc cqumvgiudr(Collection collection) {
        return new wflxmlrfwp(new ArrayList(collection), false, yadqdtsiqt.iobyxmoadg.iobyxmoadg());
    }

    public static com.google.common.util.concurrent.wkgbmnqykc draadjrbmk(Object obj) {
        return obj == null ? draadjrbmk.zoijcleaow() : new draadjrbmk.ppxfxbqfkf(obj);
    }

    public static Object dxjokdxxww(Future future) {
        Object obj;
        boolean z13 = false;
        while (true) {
            try {
                obj = future.get();
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
        return obj;
    }

    public static com.google.common.util.concurrent.wkgbmnqykc esjtqupxsv(com.google.common.util.concurrent.wkgbmnqykc wkgbmnqykcVar, ojitshcjhn.iobyxmoadg iobyxmoadgVar, Executor executor) {
        u1.nufgyqmvbu.gxszxtbevo(iobyxmoadgVar);
        return lereixgezr(wkgbmnqykcVar, new iobyxmoadg(iobyxmoadgVar), executor);
    }

    public static ScheduledFuture gtknphoqwx(Throwable th2) {
        return new draadjrbmk.zoijcleaow(th2);
    }

    private static void iwizpuwonk(boolean z13, com.google.common.util.concurrent.wkgbmnqykc wkgbmnqykcVar, ojitshcjhn.iobyxmoadg iobyxmoadgVar, androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar2, Executor executor) {
        u1.nufgyqmvbu.gxszxtbevo(wkgbmnqykcVar);
        u1.nufgyqmvbu.gxszxtbevo(iobyxmoadgVar);
        u1.nufgyqmvbu.gxszxtbevo(iobyxmoadgVar2);
        u1.nufgyqmvbu.gxszxtbevo(executor);
        lqeggnwhkg(wkgbmnqykcVar, new ppxfxbqfkf(iobyxmoadgVar2, iobyxmoadgVar), executor);
        if (z13) {
            iobyxmoadgVar2.iobyxmoadg(new wkgbmnqykc(wkgbmnqykcVar), yadqdtsiqt.iobyxmoadg.iobyxmoadg());
        }
    }

    public static void jyumaefscl(com.google.common.util.concurrent.wkgbmnqykc wkgbmnqykcVar, ojitshcjhn.iobyxmoadg iobyxmoadgVar, androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar2, Executor executor) {
        iwizpuwonk(true, wkgbmnqykcVar, iobyxmoadgVar, iobyxmoadgVar2, executor);
    }

    public static com.google.common.util.concurrent.wkgbmnqykc kcexrzcfyt(final long j13, final ScheduledExecutorService scheduledExecutorService, final com.google.common.util.concurrent.wkgbmnqykc wkgbmnqykcVar) {
        return androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg(new androidx.concurrent.futures.ppxfxbqfkf.InterfaceC0128ppxfxbqfkf() { // from class: iozdgvuglv.eablkybsjg
            @Override // androidx.concurrent.futures.ppxfxbqfkf.InterfaceC0128ppxfxbqfkf
            public final Object iobyxmoadg(androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
                return gtknphoqwx.ojitshcjhn(wkgbmnqykcVar, scheduledExecutorService, j13, iobyxmoadgVar);
            }
        });
    }

    public static com.google.common.util.concurrent.wkgbmnqykc lereixgezr(com.google.common.util.concurrent.wkgbmnqykc wkgbmnqykcVar, iozdgvuglv.iobyxmoadg iobyxmoadgVar, Executor executor) {
        iozdgvuglv.zoijcleaow zoijcleaowVar = new iozdgvuglv.zoijcleaow(iobyxmoadgVar, wkgbmnqykcVar);
        wkgbmnqykcVar.iobyxmoadg(zoijcleaowVar, executor);
        return zoijcleaowVar;
    }

    public static void lqeggnwhkg(com.google.common.util.concurrent.wkgbmnqykc wkgbmnqykcVar, iozdgvuglv.ppxfxbqfkf ppxfxbqfkfVar, Executor executor) {
        u1.nufgyqmvbu.gxszxtbevo(ppxfxbqfkfVar);
        wkgbmnqykcVar.iobyxmoadg(new eablkybsjg(wkgbmnqykcVar, ppxfxbqfkfVar), executor);
    }

    public static Object nufgyqmvbu(Future future) {
        u1.nufgyqmvbu.dxjokdxxww(future.isDone(), "Future was expected to be done, " + future);
        return dxjokdxxww(future);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object ojitshcjhn(final com.google.common.util.concurrent.wkgbmnqykc wkgbmnqykcVar, ScheduledExecutorService scheduledExecutorService, final long j13, final androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
        yggfygwlhe(wkgbmnqykcVar, iobyxmoadgVar);
        if (!wkgbmnqykcVar.isDone()) {
            final ScheduledFuture scheduledFutureSchedule = scheduledExecutorService.schedule(new Callable() { // from class: iozdgvuglv.gxszxtbevo
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return gtknphoqwx.wflxmlrfwp(iobyxmoadgVar, wkgbmnqykcVar, j13);
                }
            }, j13, TimeUnit.MILLISECONDS);
            wkgbmnqykcVar.iobyxmoadg(new Runnable() { // from class: iozdgvuglv.lqeggnwhkg
                @Override // java.lang.Runnable
                public final void run() {
                    scheduledFutureSchedule.cancel(true);
                }
            }, yadqdtsiqt.iobyxmoadg.iobyxmoadg());
        }
        return "TimeoutFuture[" + wkgbmnqykcVar + "]";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object oxmwwwfdhm(com.google.common.util.concurrent.wkgbmnqykc wkgbmnqykcVar, final androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
        wkgbmnqykcVar.iobyxmoadg(new Runnable() { // from class: iozdgvuglv.dxjokdxxww
            @Override // java.lang.Runnable
            public final void run() {
                iobyxmoadgVar.ppxfxbqfkf(null);
            }
        }, yadqdtsiqt.iobyxmoadg.iobyxmoadg());
        return "transformVoidFuture [" + wkgbmnqykcVar + "]";
    }

    public static com.google.common.util.concurrent.wkgbmnqykc pmvmpeiblj(final com.google.common.util.concurrent.wkgbmnqykc wkgbmnqykcVar) {
        return androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg(new androidx.concurrent.futures.ppxfxbqfkf.InterfaceC0128ppxfxbqfkf() { // from class: iozdgvuglv.nufgyqmvbu
            @Override // androidx.concurrent.futures.ppxfxbqfkf.InterfaceC0128ppxfxbqfkf
            public final Object iobyxmoadg(androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
                return gtknphoqwx.oxmwwwfdhm(wkgbmnqykcVar, iobyxmoadgVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object rgvfuqvkyq(com.google.common.util.concurrent.wkgbmnqykc wkgbmnqykcVar, androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
        iwizpuwonk(false, wkgbmnqykcVar, f49110iobyxmoadg, iobyxmoadgVar, yadqdtsiqt.iobyxmoadg.iobyxmoadg());
        return "nonCancellationPropagating[" + wkgbmnqykcVar + "]";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean wflxmlrfwp(androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar, com.google.common.util.concurrent.wkgbmnqykc wkgbmnqykcVar, long j13) {
        return Boolean.valueOf(iobyxmoadgVar.gxszxtbevo(new TimeoutException("Future[" + wkgbmnqykcVar + "] is not done within " + j13 + " ms.")));
    }

    public static void yggfygwlhe(com.google.common.util.concurrent.wkgbmnqykc wkgbmnqykcVar, androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
        jyumaefscl(wkgbmnqykcVar, f49110iobyxmoadg, iobyxmoadgVar, yadqdtsiqt.iobyxmoadg.iobyxmoadg());
    }

    public static com.google.common.util.concurrent.wkgbmnqykc zdlpuopuiu(final com.google.common.util.concurrent.wkgbmnqykc wkgbmnqykcVar) {
        u1.nufgyqmvbu.gxszxtbevo(wkgbmnqykcVar);
        return wkgbmnqykcVar.isDone() ? wkgbmnqykcVar : androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg(new androidx.concurrent.futures.ppxfxbqfkf.InterfaceC0128ppxfxbqfkf() { // from class: iozdgvuglv.btonecajqb
            @Override // androidx.concurrent.futures.ppxfxbqfkf.InterfaceC0128ppxfxbqfkf
            public final Object iobyxmoadg(androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
                return gtknphoqwx.rgvfuqvkyq(wkgbmnqykcVar, iobyxmoadgVar);
            }
        });
    }
}
