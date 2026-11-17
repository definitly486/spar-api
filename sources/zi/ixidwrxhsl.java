package zi;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ixidwrxhsl extends kegysxyocb {
    public ixidwrxhsl() {
        super(null);
    }

    @Override // zi.kegysxyocb
    public si.gtknphoqwx agtfadlqog() {
        return fmlbqenlif().agtfadlqog();
    }

    public abstract boolean ezmngbhpjk();

    protected abstract kegysxyocb fmlbqenlif();

    @Override // zi.kegysxyocb
    public List fyldjkxazc() {
        return fmlbqenlif().fyldjkxazc();
    }

    @Override // zi.kegysxyocb
    public zeieaojujs grlcpdaxtj() {
        return fmlbqenlif().grlcpdaxtj();
    }

    @Override // zi.kegysxyocb
    public opjhrmiecq ipoelvxyzq() {
        return fmlbqenlif().ipoelvxyzq();
    }

    @Override // zi.kegysxyocb
    public final grlcpdaxtj jrbgnlbqoe() {
        kegysxyocb kegysxyocbVarFmlbqenlif = fmlbqenlif();
        while (kegysxyocbVarFmlbqenlif instanceof ixidwrxhsl) {
            kegysxyocbVarFmlbqenlif = ((ixidwrxhsl) kegysxyocbVarFmlbqenlif).fmlbqenlif();
        }
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(kegysxyocbVarFmlbqenlif, "null cannot be cast to non-null type org.jetbrains.kotlin.types.UnwrappedType");
        return (grlcpdaxtj) kegysxyocbVarFmlbqenlif;
    }

    @Override // zi.kegysxyocb
    public boolean mhtqkkgtqm() {
        return fmlbqenlif().mhtqkkgtqm();
    }

    public String toString() {
        return ezmngbhpjk() ? fmlbqenlif().toString() : "<Not computed yet>";
    }
}
