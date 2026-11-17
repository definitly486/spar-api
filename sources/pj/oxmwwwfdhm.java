package pj;

/* JADX INFO: loaded from: classes3.dex */
public abstract class oxmwwwfdhm {
    public static final void iobyxmoadg(agtfadlqog agtfadlqogVar, jztzpxfvev jztzpxfvevVar) {
        ppxfxbqfkf(agtfadlqogVar, new xrmfcynszj(jztzpxfvevVar));
    }

    public static final void ppxfxbqfkf(agtfadlqog agtfadlqogVar, wflxmlrfwp wflxmlrfwpVar) {
        if (!(agtfadlqogVar instanceof rgvfuqvkyq)) {
            throw new UnsupportedOperationException("third-party implementation of CancellableContinuation is not supported");
        }
        ((rgvfuqvkyq) agtfadlqogVar).yadqdtsiqt(wflxmlrfwpVar);
    }

    public static final rgvfuqvkyq zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
        if (!(gxszxtbevoVar instanceof uj.lqeggnwhkg)) {
            return new rgvfuqvkyq(gxszxtbevoVar, 1);
        }
        rgvfuqvkyq rgvfuqvkyqVarDxjokdxxww = ((uj.lqeggnwhkg) gxszxtbevoVar).dxjokdxxww();
        if (rgvfuqvkyqVarDxjokdxxww != null) {
            if (!rgvfuqvkyqVarDxjokdxxww.jpowsppfya()) {
                rgvfuqvkyqVarDxjokdxxww = null;
            }
            if (rgvfuqvkyqVarDxjokdxxww != null) {
                return rgvfuqvkyqVarDxjokdxxww;
            }
        }
        return new rgvfuqvkyq(gxszxtbevoVar, 2);
    }
}
