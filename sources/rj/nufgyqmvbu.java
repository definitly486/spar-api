package rj;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.JobCancellationException;
import pj.lxfrhoxuzk;

/* JADX INFO: loaded from: classes3.dex */
public abstract class nufgyqmvbu extends pj.iobyxmoadg implements lqeggnwhkg {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final lqeggnwhkg f82911iwizpuwonk;

    public nufgyqmvbu(lg.btonecajqb btonecajqbVar, lqeggnwhkg lqeggnwhkgVar, boolean z13, boolean z14) {
        super(btonecajqbVar, z13, z14);
        this.f82911iwizpuwonk = lqeggnwhkgVar;
    }

    public final lqeggnwhkg b() {
        return this;
    }

    protected final lqeggnwhkg c() {
        return this.f82911iwizpuwonk;
    }

    @Override // rj.jyumaefscl
    public xj.gxszxtbevo dxjokdxxww() {
        return this.f82911iwizpuwonk.dxjokdxxww();
    }

    @Override // rj.iwizpuwonk
    public Object eablkybsjg(Object obj) {
        return this.f82911iwizpuwonk.eablkybsjg(obj);
    }

    @Override // rj.jyumaefscl
    public Object gtknphoqwx() {
        return this.f82911iwizpuwonk.gtknphoqwx();
    }

    @Override // rj.iwizpuwonk
    public Object gxszxtbevo(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        return this.f82911iwizpuwonk.gxszxtbevo(obj, gxszxtbevoVar);
    }

    @Override // rj.jyumaefscl
    public dxjokdxxww iterator() {
        return this.f82911iwizpuwonk.iterator();
    }

    @Override // pj.lxfrhoxuzk
    public void jpowsppfya(Throwable th2) {
        CancellationException cancellationExceptionGrlcpdaxtj = lxfrhoxuzk.grlcpdaxtj(this, th2, null, 1, null);
        this.f82911iwizpuwonk.nufgyqmvbu(cancellationExceptionGrlcpdaxtj);
        pkzmftpjix(cancellationExceptionGrlcpdaxtj);
    }

    @Override // pj.lxfrhoxuzk, pj.auzgnhcxok
    public final void nufgyqmvbu(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(ulzqkzuiru(), null, this);
        }
        jpowsppfya(cancellationException);
    }

    @Override // rj.iwizpuwonk
    public boolean oxmwwwfdhm(Throwable th2) {
        return this.f82911iwizpuwonk.oxmwwwfdhm(th2);
    }

    @Override // rj.jyumaefscl
    public Object ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
        return this.f82911iwizpuwonk.ppxfxbqfkf(gxszxtbevoVar);
    }

    @Override // rj.jyumaefscl
    public Object wflxmlrfwp(lg.gxszxtbevo gxszxtbevoVar) {
        Object objWflxmlrfwp = this.f82911iwizpuwonk.wflxmlrfwp(gxszxtbevoVar);
        mg.zoijcleaow.gxszxtbevo();
        return objWflxmlrfwp;
    }

    @Override // rj.iwizpuwonk
    public boolean zdlpuopuiu() {
        return this.f82911iwizpuwonk.zdlpuopuiu();
    }

    @Override // rj.iwizpuwonk
    public void zoijcleaow(tg.draadjrbmk draadjrbmkVar) {
        this.f82911iwizpuwonk.zoijcleaow(draadjrbmkVar);
    }
}
