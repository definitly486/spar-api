package com.google.firebase.perf.session.gauges;

import android.os.Process;
import android.system.Os;
import android.system.OsConstants;
import com.google.firebase.perf.util.Timer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class ppxfxbqfkf {

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final gd.iobyxmoadg f24675lqeggnwhkg = gd.iobyxmoadg.eablkybsjg();

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private static final long f24676nufgyqmvbu = TimeUnit.SECONDS.toMicros(1);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private ScheduledFuture f24677eablkybsjg = null;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private long f24678gxszxtbevo = -1;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ConcurrentLinkedQueue f24679iobyxmoadg = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ScheduledExecutorService f24682zoijcleaow = Executors.newSingleThreadScheduledExecutor();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f24680ppxfxbqfkf = "/proc/" + Integer.toString(Process.myPid()) + "/stat";

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final long f24681wkgbmnqykc = eablkybsjg();

    ppxfxbqfkf() {
    }

    private synchronized void btonecajqb(long j13, final Timer timer) {
        try {
            this.f24678gxszxtbevo = j13;
            try {
                this.f24677eablkybsjg = this.f24682zoijcleaow.scheduleAtFixedRate(new Runnable() { // from class: com.google.firebase.perf.session.gauges.iobyxmoadg
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f24674zdlpuopuiu.nufgyqmvbu(timer);
                    }
                }, 0L, j13, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e13) {
                f24675lqeggnwhkg.btonecajqb("Unable to start collecting Cpu Metrics: " + e13.getMessage());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private synchronized void dxjokdxxww(final Timer timer) {
        try {
            this.f24682zoijcleaow.schedule(new Runnable() { // from class: com.google.firebase.perf.session.gauges.zoijcleaow
                @Override // java.lang.Runnable
                public final void run() {
                    this.f24687zdlpuopuiu.lqeggnwhkg(timer);
                }
            }, 0L, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e13) {
            f24675lqeggnwhkg.btonecajqb("Unable to collect Cpu Metric: " + e13.getMessage());
        }
    }

    private long eablkybsjg() {
        return Os.sysconf(OsConstants._SC_CLK_TCK);
    }

    public static boolean gxszxtbevo(long j13) {
        return j13 <= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lqeggnwhkg(Timer timer) {
        nd.eablkybsjg eablkybsjgVarWflxmlrfwp = wflxmlrfwp(timer);
        if (eablkybsjgVarWflxmlrfwp != null) {
            this.f24679iobyxmoadg.add(eablkybsjgVarWflxmlrfwp);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void nufgyqmvbu(Timer timer) {
        nd.eablkybsjg eablkybsjgVarWflxmlrfwp = wflxmlrfwp(timer);
        if (eablkybsjgVarWflxmlrfwp != null) {
            this.f24679iobyxmoadg.add(eablkybsjgVarWflxmlrfwp);
        }
    }

    private nd.eablkybsjg wflxmlrfwp(Timer timer) {
        if (timer == null) {
            return null;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(this.f24680ppxfxbqfkf));
            try {
                long jPpxfxbqfkf = timer.ppxfxbqfkf();
                String[] strArrSplit = bufferedReader.readLine().split(" ");
                nd.eablkybsjg eablkybsjgVar = (nd.eablkybsjg) nd.eablkybsjg.gtknphoqwx().lqeggnwhkg(jPpxfxbqfkf).nufgyqmvbu(wkgbmnqykc(Long.parseLong(strArrSplit[14]) + Long.parseLong(strArrSplit[16]))).gtknphoqwx(wkgbmnqykc(Long.parseLong(strArrSplit[13]) + Long.parseLong(strArrSplit[15]))).build();
                bufferedReader.close();
                return eablkybsjgVar;
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e13) {
            f24675lqeggnwhkg.btonecajqb("Unable to read 'proc/[pid]/stat' file: " + e13.getMessage());
            return null;
        } catch (ArrayIndexOutOfBoundsException e14) {
            e = e14;
            f24675lqeggnwhkg.btonecajqb("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        } catch (NullPointerException e15) {
            e = e15;
            f24675lqeggnwhkg.btonecajqb("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        } catch (NumberFormatException e16) {
            e = e16;
            f24675lqeggnwhkg.btonecajqb("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        }
    }

    private long wkgbmnqykc(long j13) {
        return Math.round((j13 / this.f24681wkgbmnqykc) * f24676nufgyqmvbu);
    }

    public void draadjrbmk() {
        ScheduledFuture scheduledFuture = this.f24677eablkybsjg;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.f24677eablkybsjg = null;
        this.f24678gxszxtbevo = -1L;
    }

    public void gtknphoqwx(long j13, Timer timer) {
        long j14 = this.f24681wkgbmnqykc;
        if (j14 == -1 || j14 == 0 || gxszxtbevo(j13)) {
            return;
        }
        if (this.f24677eablkybsjg == null) {
            btonecajqb(j13, timer);
        } else if (this.f24678gxszxtbevo != j13) {
            draadjrbmk();
            btonecajqb(j13, timer);
        }
    }

    public void ppxfxbqfkf(Timer timer) {
        dxjokdxxww(timer);
    }
}
