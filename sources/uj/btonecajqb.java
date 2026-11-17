package uj;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import pj.jztzpxfvev;
import pj.mbcevpiqjq;
import pj.sopmlzcsov;

/* JADX INFO: loaded from: classes3.dex */
public final class btonecajqb extends pj.pkzmftpjix implements sopmlzcsov {

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f113630pmvmpeiblj = AtomicIntegerFieldUpdater.newUpdater(btonecajqb.class, "runningWorkers$volatile");

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final String f113631cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final ojitshcjhn f113632esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final int f113633iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final pj.pkzmftpjix f113634jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final Object f113635lereixgezr;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final /* synthetic */ sopmlzcsov f113636yggfygwlhe;

    private final class iobyxmoadg implements Runnable {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private Runnable f113638zdlpuopuiu;

        public iobyxmoadg(Runnable runnable) {
            this.f113638zdlpuopuiu = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i13 = 0;
            while (true) {
                try {
                    this.f113638zdlpuopuiu.run();
                } catch (Throwable th2) {
                    pj.jpowsppfya.iobyxmoadg(lg.gtknphoqwx.f62507zdlpuopuiu, th2);
                }
                Runnable runnableYfnezrywwk = btonecajqb.this.yfnezrywwk();
                if (runnableYfnezrywwk == null) {
                    return;
                }
                this.f113638zdlpuopuiu = runnableYfnezrywwk;
                i13++;
                if (i13 >= 16 && btonecajqb.this.f113634jyumaefscl.ulzqkzuiru(btonecajqb.this)) {
                    btonecajqb.this.f113634jyumaefscl.dsvhmnatus(btonecajqb.this, this);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public btonecajqb(pj.pkzmftpjix pkzmftpjixVar, int i13, String str) {
        sopmlzcsov sopmlzcsovVar = pkzmftpjixVar instanceof sopmlzcsov ? (sopmlzcsov) pkzmftpjixVar : null;
        this.f113636yggfygwlhe = sopmlzcsovVar == null ? mbcevpiqjq.iobyxmoadg() : sopmlzcsovVar;
        this.f113634jyumaefscl = pkzmftpjixVar;
        this.f113633iwizpuwonk = i13;
        this.f113631cqumvgiudr = str;
        this.f113632esjtqupxsv = new ojitshcjhn(false);
        this.f113635lereixgezr = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Runnable yfnezrywwk() {
        while (true) {
            Runnable runnable = (Runnable) this.f113632esjtqupxsv.eablkybsjg();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f113635lereixgezr) {
                f113630pmvmpeiblj.decrementAndGet(this);
                if (this.f113632esjtqupxsv.ppxfxbqfkf() == 0) {
                    return null;
                }
                f113630pmvmpeiblj.incrementAndGet(this);
            }
        }
    }

    private final boolean zfvoamnweg() {
        synchronized (this.f113635lereixgezr) {
            if (f113630pmvmpeiblj.get(this) >= this.f113633iwizpuwonk) {
                return false;
            }
            f113630pmvmpeiblj.incrementAndGet(this);
            return true;
        }
    }

    @Override // pj.sopmlzcsov
    public void cdpycssgdh(long j13, pj.agtfadlqog agtfadlqogVar) {
        this.f113636yggfygwlhe.cdpycssgdh(j13, agtfadlqogVar);
    }

    @Override // pj.pkzmftpjix
    public void dsvhmnatus(lg.btonecajqb btonecajqbVar, Runnable runnable) {
        Runnable runnableYfnezrywwk;
        this.f113632esjtqupxsv.iobyxmoadg(runnable);
        if (f113630pmvmpeiblj.get(this) >= this.f113633iwizpuwonk || !zfvoamnweg() || (runnableYfnezrywwk = yfnezrywwk()) == null) {
            return;
        }
        this.f113634jyumaefscl.dsvhmnatus(this, new iobyxmoadg(runnableYfnezrywwk));
    }

    @Override // pj.sopmlzcsov
    public jztzpxfvev hkdspvbjdz(long j13, Runnable runnable, lg.btonecajqb btonecajqbVar) {
        return this.f113636yggfygwlhe.hkdspvbjdz(j13, runnable, btonecajqbVar);
    }

    @Override // pj.pkzmftpjix
    public pj.pkzmftpjix jlmebxxoox(int i13, String str) {
        gtknphoqwx.iobyxmoadg(i13);
        return i13 >= this.f113633iwizpuwonk ? gtknphoqwx.zoijcleaow(this, str) : super.jlmebxxoox(i13, str);
    }

    @Override // pj.pkzmftpjix
    public void ntlheqmsrt(lg.btonecajqb btonecajqbVar, Runnable runnable) {
        Runnable runnableYfnezrywwk;
        this.f113632esjtqupxsv.iobyxmoadg(runnable);
        if (f113630pmvmpeiblj.get(this) >= this.f113633iwizpuwonk || !zfvoamnweg() || (runnableYfnezrywwk = yfnezrywwk()) == null) {
            return;
        }
        this.f113634jyumaefscl.ntlheqmsrt(this, new iobyxmoadg(runnableYfnezrywwk));
    }

    @Override // pj.pkzmftpjix
    public String toString() {
        String str = this.f113631cqumvgiudr;
        if (str != null) {
            return str;
        }
        return this.f113634jyumaefscl + ".limitedParallelism(" + this.f113633iwizpuwonk + ')';
    }
}
