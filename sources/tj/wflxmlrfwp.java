package tj;

import kotlinx.coroutines.flow.internal.ChildCancelledException;

/* JADX INFO: loaded from: classes3.dex */
final class wflxmlrfwp extends uj.esjtqupxsv {
    public wflxmlrfwp(lg.btonecajqb btonecajqbVar, lg.gxszxtbevo gxszxtbevoVar) {
        super(btonecajqbVar, gxszxtbevoVar);
    }

    @Override // pj.lxfrhoxuzk
    public boolean sopmlzcsov(Throwable th2) {
        if (th2 instanceof ChildCancelledException) {
            return true;
        }
        return hcddaimhww(th2);
    }
}
