package wj;

import java.util.concurrent.Executor;
import pj.bfopjjpdmp;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gxszxtbevo extends bfopjjpdmp {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final long f119934cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final String f119935esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final int f119936iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final int f119937jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private iobyxmoadg f119938lereixgezr = rlfsiqarku();

    public gxszxtbevo(int i13, int i14, long j13, String str) {
        this.f119937jyumaefscl = i13;
        this.f119936iwizpuwonk = i14;
        this.f119934cqumvgiudr = j13;
        this.f119935esjtqupxsv = str;
    }

    private final iobyxmoadg rlfsiqarku() {
        return new iobyxmoadg(this.f119937jyumaefscl, this.f119936iwizpuwonk, this.f119934cqumvgiudr, this.f119935esjtqupxsv);
    }

    public final void czzsidtyhn(Runnable runnable, boolean z13, boolean z14) {
        this.f119938lereixgezr.draadjrbmk(runnable, z13, z14);
    }

    @Override // pj.pkzmftpjix
    public void dsvhmnatus(lg.btonecajqb btonecajqbVar, Runnable runnable) {
        iobyxmoadg.agtfadlqog(this.f119938lereixgezr, runnable, false, false, 6, null);
    }

    @Override // pj.pkzmftpjix
    public void ntlheqmsrt(lg.btonecajqb btonecajqbVar, Runnable runnable) {
        iobyxmoadg.agtfadlqog(this.f119938lereixgezr, runnable, false, true, 2, null);
    }

    @Override // pj.bfopjjpdmp
    public Executor xrmfcynszj() {
        return this.f119938lereixgezr;
    }
}
