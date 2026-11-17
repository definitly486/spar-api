package wj;

import java.util.concurrent.Executor;
import pj.bfopjjpdmp;
import pj.pkzmftpjix;
import uj.cdpycssgdh;
import uj.iozdgvuglv;

/* JADX INFO: loaded from: classes3.dex */
public final class zoijcleaow extends bfopjjpdmp implements Executor {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public static final zoijcleaow f119972jyumaefscl = new zoijcleaow();

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private static final pkzmftpjix f119971iwizpuwonk = pkzmftpjix.okpsazkaxt(gtknphoqwx.f119933yggfygwlhe, iozdgvuglv.eablkybsjg("kotlinx.coroutines.io.parallelism", zg.gtknphoqwx.gxszxtbevo(64, cdpycssgdh.iobyxmoadg()), 0, 0, 12, null), null, 2, null);

    private zoijcleaow() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // pj.pkzmftpjix
    public void dsvhmnatus(lg.btonecajqb btonecajqbVar, Runnable runnable) {
        f119971iwizpuwonk.dsvhmnatus(btonecajqbVar, runnable);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        dsvhmnatus(lg.gtknphoqwx.f62507zdlpuopuiu, runnable);
    }

    @Override // pj.pkzmftpjix
    public pkzmftpjix jlmebxxoox(int i13, String str) {
        return gtknphoqwx.f119933yggfygwlhe.jlmebxxoox(i13, str);
    }

    @Override // pj.pkzmftpjix
    public void ntlheqmsrt(lg.btonecajqb btonecajqbVar, Runnable runnable) {
        f119971iwizpuwonk.ntlheqmsrt(btonecajqbVar, runnable);
    }

    @Override // pj.pkzmftpjix
    public String toString() {
        return "Dispatchers.IO";
    }

    @Override // pj.bfopjjpdmp
    public Executor xrmfcynszj() {
        return this;
    }
}
