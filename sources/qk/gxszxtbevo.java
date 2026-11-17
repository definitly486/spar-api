package qk;

import java.io.IOException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class gxszxtbevo implements wkgbmnqykc {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final CopyOnWriteArrayList f78992eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final BlockingQueue f78993gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final agtfadlqog f78994iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final long f78995ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private long f78996wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final pk.wkgbmnqykc f78997zoijcleaow;

    public static final class iobyxmoadg extends pk.iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        final /* synthetic */ agtfadlqog.zoijcleaow f78998eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        final /* synthetic */ gxszxtbevo f78999gxszxtbevo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(String str, agtfadlqog.zoijcleaow zoijcleaowVar, gxszxtbevo gxszxtbevoVar) {
            super(str, false, 2, null);
            this.f78998eablkybsjg = zoijcleaowVar;
            this.f78999gxszxtbevo = gxszxtbevoVar;
        }

        @Override // pk.iobyxmoadg
        public long gxszxtbevo() throws InterruptedException {
            agtfadlqog.iobyxmoadg iobyxmoadgVar;
            try {
                iobyxmoadgVar = this.f78998eablkybsjg.nufgyqmvbu();
            } catch (Throwable th2) {
                iobyxmoadgVar = new agtfadlqog.iobyxmoadg(this.f78998eablkybsjg, null, th2, 2, null);
            }
            if (!this.f78999gxszxtbevo.f78992eablkybsjg.contains(this.f78998eablkybsjg)) {
                return -1L;
            }
            this.f78999gxszxtbevo.f78993gxszxtbevo.put(iobyxmoadgVar);
            return -1L;
        }
    }

    public gxszxtbevo(agtfadlqog routePlanner, pk.wkgbmnqykc taskRunner) {
        zdlpuopuiu.btonecajqb(routePlanner, "routePlanner");
        zdlpuopuiu.btonecajqb(taskRunner, "taskRunner");
        this.f78994iobyxmoadg = routePlanner;
        this.f78997zoijcleaow = taskRunner;
        this.f78995ppxfxbqfkf = TimeUnit.MILLISECONDS.toNanos(250L);
        this.f78996wkgbmnqykc = Long.MIN_VALUE;
        this.f78992eablkybsjg = new CopyOnWriteArrayList();
        this.f78993gxszxtbevo = taskRunner.gxszxtbevo().zoijcleaow(new LinkedBlockingDeque());
    }

    private final agtfadlqog.iobyxmoadg eablkybsjg(long j13, TimeUnit timeUnit) {
        agtfadlqog.iobyxmoadg iobyxmoadgVar;
        if (this.f78992eablkybsjg.isEmpty() || (iobyxmoadgVar = (agtfadlqog.iobyxmoadg) this.f78993gxszxtbevo.poll(j13, timeUnit)) == null) {
            return null;
        }
        this.f78992eablkybsjg.remove(iobyxmoadgVar.wkgbmnqykc());
        return iobyxmoadgVar;
    }

    private final void gxszxtbevo() {
        for (agtfadlqog.zoijcleaow zoijcleaowVar : this.f78992eablkybsjg) {
            zoijcleaowVar.cancel();
            agtfadlqog.zoijcleaow zoijcleaowVarLqeggnwhkg = zoijcleaowVar.lqeggnwhkg();
            if (zoijcleaowVarLqeggnwhkg != null) {
                zoijcleaow().zoijcleaow().addLast(zoijcleaowVarLqeggnwhkg);
            }
        }
        this.f78992eablkybsjg.clear();
    }

    private final agtfadlqog.iobyxmoadg lqeggnwhkg() {
        agtfadlqog.zoijcleaow eablkybsjgVar;
        if (agtfadlqog.wkgbmnqykc(zoijcleaow(), null, 1, null)) {
            try {
                eablkybsjgVar = zoijcleaow().ppxfxbqfkf();
            } catch (Throwable th2) {
                eablkybsjgVar = new eablkybsjg(th2);
            }
            if (eablkybsjgVar.ppxfxbqfkf()) {
                return new agtfadlqog.iobyxmoadg(eablkybsjgVar, null, null, 6, null);
            }
            if (eablkybsjgVar instanceof eablkybsjg) {
                return ((eablkybsjg) eablkybsjgVar).eablkybsjg();
            }
            this.f78992eablkybsjg.add(eablkybsjgVar);
            pk.ppxfxbqfkf.wflxmlrfwp(this.f78997zoijcleaow.dxjokdxxww(), new iobyxmoadg(mk.rgvfuqvkyq.f67371gxszxtbevo + " connect " + zoijcleaow().iobyxmoadg().draadjrbmk().oxmwwwfdhm(), eablkybsjgVar, this), 0L, 2, null);
        }
        return null;
    }

    @Override // qk.wkgbmnqykc
    public dxjokdxxww iobyxmoadg() throws IOException {
        agtfadlqog.iobyxmoadg iobyxmoadgVarLqeggnwhkg;
        long j13;
        IOException iOException = null;
        while (true) {
            try {
                if (this.f78992eablkybsjg.isEmpty() && !agtfadlqog.wkgbmnqykc(zoijcleaow(), null, 1, null)) {
                    gxszxtbevo();
                    zdlpuopuiu.lqeggnwhkg(iOException);
                    throw iOException;
                }
                if (zoijcleaow().btonecajqb()) {
                    throw new IOException("Canceled");
                }
                long jNanoTime = this.f78997zoijcleaow.gxszxtbevo().nanoTime();
                long j14 = this.f78996wkgbmnqykc - jNanoTime;
                if (this.f78992eablkybsjg.isEmpty() || j14 <= 0) {
                    iobyxmoadgVarLqeggnwhkg = lqeggnwhkg();
                    j13 = this.f78995ppxfxbqfkf;
                    this.f78996wkgbmnqykc = jNanoTime + j13;
                } else {
                    j13 = j14;
                    iobyxmoadgVarLqeggnwhkg = null;
                }
                if (iobyxmoadgVarLqeggnwhkg != null || (iobyxmoadgVarLqeggnwhkg = eablkybsjg(j13, TimeUnit.NANOSECONDS)) != null) {
                    if (iobyxmoadgVarLqeggnwhkg.gxszxtbevo()) {
                        gxszxtbevo();
                        if (!iobyxmoadgVarLqeggnwhkg.wkgbmnqykc().ppxfxbqfkf()) {
                            iobyxmoadgVarLqeggnwhkg = iobyxmoadgVarLqeggnwhkg.wkgbmnqykc().wkgbmnqykc();
                        }
                        if (iobyxmoadgVarLqeggnwhkg.gxszxtbevo()) {
                            dxjokdxxww dxjokdxxwwVarIobyxmoadg = iobyxmoadgVarLqeggnwhkg.wkgbmnqykc().iobyxmoadg();
                            gxszxtbevo();
                            return dxjokdxxwwVarIobyxmoadg;
                        }
                    }
                    Throwable thEablkybsjg = iobyxmoadgVarLqeggnwhkg.eablkybsjg();
                    if (thEablkybsjg != null) {
                        if (!(thEablkybsjg instanceof IOException)) {
                            throw thEablkybsjg;
                        }
                        if (iOException == null) {
                            iOException = (IOException) thEablkybsjg;
                        } else {
                            gg.lqeggnwhkg.iobyxmoadg(iOException, thEablkybsjg);
                        }
                    }
                    agtfadlqog.zoijcleaow zoijcleaowVarPpxfxbqfkf = iobyxmoadgVarLqeggnwhkg.ppxfxbqfkf();
                    if (zoijcleaowVarPpxfxbqfkf != null) {
                        zoijcleaow().zoijcleaow().addFirst(zoijcleaowVarPpxfxbqfkf);
                    }
                }
            } catch (Throwable th2) {
                gxszxtbevo();
                throw th2;
            }
        }
    }

    @Override // qk.wkgbmnqykc
    public agtfadlqog zoijcleaow() {
        return this.f78994iobyxmoadg;
    }
}
