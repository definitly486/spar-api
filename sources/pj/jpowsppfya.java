package pj;

/* JADX INFO: loaded from: classes3.dex */
public abstract class jpowsppfya {
    public static final void iobyxmoadg(lg.btonecajqb btonecajqbVar, Throwable th2) {
        try {
            hcddaimhww hcddaimhwwVar = (hcddaimhww) btonecajqbVar.get(hcddaimhww.f76711btonecajqb);
            if (hcddaimhwwVar != null) {
                hcddaimhwwVar.handleException(btonecajqbVar, th2);
            } else {
                uj.gxszxtbevo.iobyxmoadg(btonecajqbVar, th2);
            }
        } catch (Throwable th3) {
            uj.gxszxtbevo.iobyxmoadg(btonecajqbVar, zoijcleaow(th2, th3));
        }
    }

    public static final Throwable zoijcleaow(Throwable th2, Throwable th3) {
        if (th2 == th3) {
            return th2;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
        gg.lqeggnwhkg.iobyxmoadg(runtimeException, th2);
        return runtimeException;
    }
}
