package z;

/* JADX INFO: loaded from: classes.dex */
public abstract class lmojexxdyd {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int zoijcleaow(tzroggbefp tzroggbefpVar, x.iobyxmoadg iobyxmoadgVar) {
        tzroggbefp tzroggbefpVarZ = tzroggbefpVar.z();
        if (!(tzroggbefpVarZ != null)) {
            w.iobyxmoadg.zoijcleaow("Child of " + tzroggbefpVar + " cannot be null when calculating alignment line");
        }
        if (tzroggbefpVar.E().agtfadlqog().containsKey(iobyxmoadgVar)) {
            Integer num = (Integer) tzroggbefpVar.E().agtfadlqog().get(iobyxmoadgVar);
            if (num != null) {
                return num.intValue();
            }
            return Integer.MIN_VALUE;
        }
        int iCllcsxoeiz = tzroggbefpVarZ.cllcsxoeiz(iobyxmoadgVar);
        if (iCllcsxoeiz == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        tzroggbefpVarZ.j0(true);
        tzroggbefpVar.i0(true);
        tzroggbefpVar.g0();
        tzroggbefpVarZ.j0(false);
        tzroggbefpVar.i0(false);
        return iCllcsxoeiz + (iobyxmoadgVar instanceof x.gtknphoqwx ? w0.agtfadlqog.btonecajqb(tzroggbefpVarZ.R()) : w0.agtfadlqog.dxjokdxxww(tzroggbefpVarZ.R()));
    }
}
