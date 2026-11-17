package hc;

import ac.dsvhmnatus;
import ac.ikoacuggdj;
import ac.zynmafqrjb;
import android.os.SystemClock;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import modern.payments.ecomAndroid.data.common.MockConstants;
import o9.dxjokdxxww;
import o9.gtknphoqwx;
import o9.gxszxtbevo;
import q9.draadjrbmk;
import xb.lqeggnwhkg;

/* JADX INFO: loaded from: classes2.dex */
final class eablkybsjg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private int f40019btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final dsvhmnatus f40020dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final int f40021eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private long f40022gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final BlockingQueue f40023gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final double f40024iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final ThreadPoolExecutor f40025lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final dxjokdxxww f40026nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final long f40027ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final long f40028wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final double f40029zoijcleaow;

    private final class zoijcleaow implements Runnable {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final TaskCompletionSource f40031yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final zynmafqrjb f40032zdlpuopuiu;

        @Override // java.lang.Runnable
        public void run() {
            eablkybsjg.this.rgvfuqvkyq(this.f40032zdlpuopuiu, this.f40031yggfygwlhe);
            eablkybsjg.this.f40020dxjokdxxww.ppxfxbqfkf();
            double dLqeggnwhkg = eablkybsjg.this.lqeggnwhkg();
            lqeggnwhkg.gxszxtbevo().zoijcleaow("Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(dLqeggnwhkg / 1000.0d)) + " s for report: " + this.f40032zdlpuopuiu.wkgbmnqykc());
            eablkybsjg.vdvldrhtss(dLqeggnwhkg);
        }

        private zoijcleaow(zynmafqrjb zynmafqrjbVar, TaskCompletionSource taskCompletionSource) {
            this.f40032zdlpuopuiu = zynmafqrjbVar;
            this.f40031yggfygwlhe = taskCompletionSource;
        }
    }

    eablkybsjg(dxjokdxxww dxjokdxxwwVar, ic.wkgbmnqykc wkgbmnqykcVar, dsvhmnatus dsvhmnatusVar) {
        this(wkgbmnqykcVar.f42379gxszxtbevo, wkgbmnqykcVar.f42381lqeggnwhkg, ((long) wkgbmnqykcVar.f42382nufgyqmvbu) * 1000, dxjokdxxwwVar, dsvhmnatusVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void agtfadlqog(TaskCompletionSource taskCompletionSource, boolean z13, zynmafqrjb zynmafqrjbVar, Exception exc) {
        if (exc != null) {
            taskCompletionSource.trySetException(exc);
            return;
        }
        if (z13) {
            btonecajqb();
        }
        taskCompletionSource.trySetResult(zynmafqrjbVar);
    }

    private boolean draadjrbmk() {
        return this.f40023gxszxtbevo.size() == this.f40021eablkybsjg;
    }

    private boolean gtknphoqwx() {
        return this.f40023gxszxtbevo.size() < this.f40021eablkybsjg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public double lqeggnwhkg() {
        return Math.min(3600000.0d, (60000.0d / this.f40024iobyxmoadg) * Math.pow(this.f40029zoijcleaow, nufgyqmvbu()));
    }

    private int nufgyqmvbu() {
        if (this.f40022gtknphoqwx == 0) {
            this.f40022gtknphoqwx = ojitshcjhn();
        }
        int iOjitshcjhn = (int) ((ojitshcjhn() - this.f40022gtknphoqwx) / this.f40027ppxfxbqfkf);
        int iMin = draadjrbmk() ? Math.min(100, this.f40019btonecajqb + iOjitshcjhn) : Math.max(0, this.f40019btonecajqb - iOjitshcjhn);
        if (this.f40019btonecajqb != iMin) {
            this.f40019btonecajqb = iMin;
            this.f40022gtknphoqwx = ojitshcjhn();
        }
        return iMin;
    }

    private long ojitshcjhn() {
        return System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rgvfuqvkyq(final zynmafqrjb zynmafqrjbVar, final TaskCompletionSource taskCompletionSource) {
        lqeggnwhkg.gxszxtbevo().zoijcleaow("Sending report through Google DataTransport: " + zynmafqrjbVar.wkgbmnqykc());
        final boolean z13 = SystemClock.elapsedRealtime() - this.f40028wkgbmnqykc < MockConstants.TWO_SECONDS_DELAY;
        this.f40026nufgyqmvbu.iobyxmoadg(o9.wkgbmnqykc.dxjokdxxww(zynmafqrjbVar.zoijcleaow()), new gtknphoqwx() { // from class: hc.ppxfxbqfkf
            @Override // o9.gtknphoqwx
            public final void iobyxmoadg(Exception exc) {
                this.f40033iobyxmoadg.agtfadlqog(taskCompletionSource, z13, zynmafqrjbVar, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void vdvldrhtss(double d13) {
        try {
            Thread.sleep((long) d13);
        } catch (InterruptedException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void wflxmlrfwp(CountDownLatch countDownLatch) {
        try {
            draadjrbmk.iobyxmoadg(this.f40026nufgyqmvbu, gxszxtbevo.HIGHEST);
        } catch (Exception unused) {
        }
        countDownLatch.countDown();
    }

    public void btonecajqb() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new Runnable() { // from class: hc.wkgbmnqykc
            @Override // java.lang.Runnable
            public final void run() {
                this.f40038zdlpuopuiu.wflxmlrfwp(countDownLatch);
            }
        }).start();
        ikoacuggdj.ppxfxbqfkf(countDownLatch, 2L, TimeUnit.SECONDS);
    }

    TaskCompletionSource dxjokdxxww(zynmafqrjb zynmafqrjbVar, boolean z13) {
        synchronized (this.f40023gxszxtbevo) {
            try {
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                if (!z13) {
                    rgvfuqvkyq(zynmafqrjbVar, taskCompletionSource);
                    return taskCompletionSource;
                }
                this.f40020dxjokdxxww.zoijcleaow();
                if (!gtknphoqwx()) {
                    nufgyqmvbu();
                    lqeggnwhkg.gxszxtbevo().zoijcleaow("Dropping report due to queue being full: " + zynmafqrjbVar.wkgbmnqykc());
                    this.f40020dxjokdxxww.iobyxmoadg();
                    taskCompletionSource.trySetResult(zynmafqrjbVar);
                    return taskCompletionSource;
                }
                lqeggnwhkg.gxszxtbevo().zoijcleaow("Enqueueing report: " + zynmafqrjbVar.wkgbmnqykc());
                lqeggnwhkg.gxszxtbevo().zoijcleaow("Queue size: " + this.f40023gxszxtbevo.size());
                this.f40025lqeggnwhkg.execute(new zoijcleaow(zynmafqrjbVar, taskCompletionSource));
                lqeggnwhkg.gxszxtbevo().zoijcleaow("Closing task for report: " + zynmafqrjbVar.wkgbmnqykc());
                taskCompletionSource.trySetResult(zynmafqrjbVar);
                return taskCompletionSource;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    eablkybsjg(double d13, double d14, long j13, dxjokdxxww dxjokdxxwwVar, dsvhmnatus dsvhmnatusVar) {
        this.f40024iobyxmoadg = d13;
        this.f40029zoijcleaow = d14;
        this.f40027ppxfxbqfkf = j13;
        this.f40026nufgyqmvbu = dxjokdxxwwVar;
        this.f40020dxjokdxxww = dsvhmnatusVar;
        this.f40028wkgbmnqykc = SystemClock.elapsedRealtime();
        int i13 = (int) d13;
        this.f40021eablkybsjg = i13;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i13);
        this.f40023gxszxtbevo = arrayBlockingQueue;
        this.f40025lqeggnwhkg = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f40019btonecajqb = 0;
        this.f40022gtknphoqwx = 0L;
    }
}
