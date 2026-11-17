package xj;

import gg.wwaezpbzkn;
import pj.agtfadlqog;
import tg.vdvldrhtss;
import uj.istkbnxepw;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gtknphoqwx {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final vdvldrhtss f122601iobyxmoadg = iobyxmoadg.f122605zdlpuopuiu;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final istkbnxepw f122604zoijcleaow = new istkbnxepw("STATE_REG");

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final istkbnxepw f122602ppxfxbqfkf = new istkbnxepw("STATE_COMPLETED");

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final istkbnxepw f122603wkgbmnqykc = new istkbnxepw("STATE_CANCELLED");

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final istkbnxepw f122599eablkybsjg = new istkbnxepw("NO_RESULT");

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final istkbnxepw f122600gxszxtbevo = new istkbnxepw("PARAM_CLAUSE_0");

    static final class iobyxmoadg implements vdvldrhtss {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final iobyxmoadg f122605zdlpuopuiu = new iobyxmoadg();

        iobyxmoadg() {
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Object obj, Object obj2, Object obj3) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean btonecajqb(agtfadlqog agtfadlqogVar, vdvldrhtss vdvldrhtssVar) {
        Object objZynmafqrjb = agtfadlqogVar.zynmafqrjb(wwaezpbzkn.f37140iobyxmoadg, null, vdvldrhtssVar);
        if (objZynmafqrjb == null) {
            return false;
        }
        agtfadlqogVar.metgxyhuhe(objZynmafqrjb);
        return true;
    }

    public static final istkbnxepw dxjokdxxww() {
        return f122600gxszxtbevo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final draadjrbmk iobyxmoadg(int i13) {
        if (i13 == 0) {
            return draadjrbmk.SUCCESSFUL;
        }
        if (i13 == 1) {
            return draadjrbmk.REREGISTER;
        }
        if (i13 == 2) {
            return draadjrbmk.CANCELLED;
        }
        if (i13 == 3) {
            return draadjrbmk.ALREADY_SELECTED;
        }
        throw new IllegalStateException(("Unexpected internal result: " + i13).toString());
    }
}
