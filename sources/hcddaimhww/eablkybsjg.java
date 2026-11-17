package hcddaimhww;

import androidx.camera.core.agtfadlqog;
import istkbnxepw.draadjrbmk;
import istkbnxepw.gtknphoqwx;
import istkbnxepw.ojitshcjhn;
import istkbnxepw.rgvfuqvkyq;
import istkbnxepw.wflxmlrfwp;
import lereixgezr.dsvhmnatus;

/* JADX INFO: loaded from: classes.dex */
public final class eablkybsjg extends iobyxmoadg {
    public eablkybsjg(int i13, zoijcleaow zoijcleaowVar) {
        super(i13, zoijcleaowVar);
    }

    private boolean eablkybsjg(dsvhmnatus dsvhmnatusVar) {
        ojitshcjhn ojitshcjhnVarIobyxmoadg = rgvfuqvkyq.iobyxmoadg(dsvhmnatusVar);
        return (ojitshcjhnVarIobyxmoadg.eablkybsjg() == draadjrbmk.LOCKED_FOCUSED || ojitshcjhnVarIobyxmoadg.eablkybsjg() == draadjrbmk.PASSIVE_FOCUSED) && ojitshcjhnVarIobyxmoadg.lqeggnwhkg() == gtknphoqwx.CONVERGED && ojitshcjhnVarIobyxmoadg.gxszxtbevo() == wflxmlrfwp.CONVERGED;
    }

    public void wkgbmnqykc(agtfadlqog agtfadlqogVar) {
        if (eablkybsjg(agtfadlqogVar.K())) {
            super.zoijcleaow(agtfadlqogVar);
        } else {
            this.f40065wkgbmnqykc.iobyxmoadg(agtfadlqogVar);
        }
    }
}
