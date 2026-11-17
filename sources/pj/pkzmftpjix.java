package pj;

/* JADX INFO: loaded from: classes3.dex */
public abstract class pkzmftpjix extends lg.iobyxmoadg implements lg.lqeggnwhkg {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public static final iobyxmoadg f76761zdlpuopuiu = new iobyxmoadg(null);

    public static final class iobyxmoadg extends lg.zoijcleaow {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final pkzmftpjix wkgbmnqykc(lg.btonecajqb.zoijcleaow zoijcleaowVar) {
            if (zoijcleaowVar instanceof pkzmftpjix) {
                return (pkzmftpjix) zoijcleaowVar;
            }
            return null;
        }

        private iobyxmoadg() {
            super(lg.lqeggnwhkg.f62508dxjokdxxww, new tg.draadjrbmk() { // from class: pj.ylkuphrtab
                @Override // tg.draadjrbmk
                public final Object invoke(Object obj) {
                    return pkzmftpjix.iobyxmoadg.wkgbmnqykc((lg.btonecajqb.zoijcleaow) obj);
                }
            });
        }
    }

    public pkzmftpjix() {
        super(lg.lqeggnwhkg.f62508dxjokdxxww);
    }

    public static /* synthetic */ pkzmftpjix okpsazkaxt(pkzmftpjix pkzmftpjixVar, int i13, String str, int i14, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: limitedParallelism");
        }
        if ((i14 & 2) != 0) {
            str = null;
        }
        return pkzmftpjixVar.jlmebxxoox(i13, str);
    }

    @Override // lg.lqeggnwhkg
    public final void btonecajqb(lg.gxszxtbevo gxszxtbevoVar) {
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(gxszxtbevoVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((uj.lqeggnwhkg) gxszxtbevoVar).rgvfuqvkyq();
    }

    public /* synthetic */ pkzmftpjix crxdokpmqz(int i13) {
        return jlmebxxoox(i13, null);
    }

    public abstract void dsvhmnatus(lg.btonecajqb btonecajqbVar, Runnable runnable);

    @Override // lg.iobyxmoadg, lg.btonecajqb.zoijcleaow, lg.btonecajqb
    public lg.btonecajqb.zoijcleaow get(lg.btonecajqb.ppxfxbqfkf ppxfxbqfkfVar) {
        return lg.lqeggnwhkg.iobyxmoadg.iobyxmoadg(this, ppxfxbqfkfVar);
    }

    public pkzmftpjix jlmebxxoox(int i13, String str) {
        uj.gtknphoqwx.iobyxmoadg(i13);
        return new uj.btonecajqb(this, i13, str);
    }

    @Override // lg.iobyxmoadg, lg.btonecajqb
    public lg.btonecajqb minusKey(lg.btonecajqb.ppxfxbqfkf ppxfxbqfkfVar) {
        return lg.lqeggnwhkg.iobyxmoadg.zoijcleaow(this, ppxfxbqfkfVar);
    }

    public void ntlheqmsrt(lg.btonecajqb btonecajqbVar, Runnable runnable) {
        dsvhmnatus(btonecajqbVar, runnable);
    }

    @Override // lg.lqeggnwhkg
    public final lg.gxszxtbevo ojitshcjhn(lg.gxszxtbevo gxszxtbevoVar) {
        return new uj.lqeggnwhkg(this, gxszxtbevoVar);
    }

    public String toString() {
        return kegysxyocb.iobyxmoadg(this) + '@' + kegysxyocb.zoijcleaow(this);
    }

    public boolean ulzqkzuiru(lg.btonecajqb btonecajqbVar) {
        return true;
    }
}
