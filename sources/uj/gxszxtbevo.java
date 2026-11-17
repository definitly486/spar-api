package uj;

import java.util.Iterator;
import kotlinx.coroutines.internal.DiagnosticCoroutineContextException;
import kotlinx.coroutines.internal.ExceptionSuccessfullyProcessed;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gxszxtbevo {
    public static final void iobyxmoadg(lg.btonecajqb btonecajqbVar, Throwable th2) {
        Iterator it = eablkybsjg.iobyxmoadg().iterator();
        while (it.hasNext()) {
            try {
                ((pj.hcddaimhww) it.next()).handleException(btonecajqbVar, th2);
            } catch (ExceptionSuccessfullyProcessed unused) {
                return;
            } catch (Throwable th3) {
                eablkybsjg.zoijcleaow(pj.jpowsppfya.zoijcleaow(th2, th3));
            }
        }
        try {
            gg.lqeggnwhkg.iobyxmoadg(th2, new DiagnosticCoroutineContextException(btonecajqbVar));
        } catch (Throwable unused2) {
        }
        eablkybsjg.zoijcleaow(th2);
    }
}
