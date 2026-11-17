package kk;

import kotlin.NoWhenBranchMatchedException;
import npi.spay.Mn;
import spay.sdk.R;
import spay.sdk.domain.model.PayStrategy;

/* JADX INFO: loaded from: classes3.dex */
public final class ys extends u0 implements c7 {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final sj.wypolnanlu f59475eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final sj.zynmafqrjb f59476gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final sj.wypolnanlu f59477lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final sj.wypolnanlu f59478nufgyqmvbu;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final pc f59479wkgbmnqykc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ys(bt metricFacade, jlmebxxoox sPayDataContract, pc sPaySdkReducer, xf sPayStorage) {
        super(metricFacade, sPayDataContract, sPaySdkReducer);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(metricFacade, "metricFacade");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayDataContract, "sPayDataContract");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPaySdkReducer, "sPaySdkReducer");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayStorage, "sPayStorage");
        this.f59479wkgbmnqykc = sPaySdkReducer;
        sj.wypolnanlu wypolnanluVarZoijcleaow = sj.dxjokdxxww.zoijcleaow(((auzgnhcxok) sPayDataContract).f55850gtknphoqwx);
        sj.zynmafqrjb zynmafqrjbVarIobyxmoadg = sj.kegysxyocb.iobyxmoadg(null);
        sj.wypolnanlu wypolnanluVarZoijcleaow2 = sj.dxjokdxxww.zoijcleaow(zynmafqrjbVarIobyxmoadg);
        this.f59475eablkybsjg = wypolnanluVarZoijcleaow2;
        sj.zynmafqrjb zynmafqrjbVarIobyxmoadg2 = sj.kegysxyocb.iobyxmoadg(null);
        this.f59476gxszxtbevo = zynmafqrjbVarIobyxmoadg2;
        this.f59477lqeggnwhkg = sj.dxjokdxxww.zoijcleaow(zynmafqrjbVarIobyxmoadg2);
        this.f59478nufgyqmvbu = sj.dxjokdxxww.ribwqtqdhb(sj.dxjokdxxww.wflxmlrfwp(wypolnanluVarZoijcleaow, wypolnanluVarZoijcleaow2, new ur(null)), androidx.lifecycle.ulzqkzuiru.iobyxmoadg(this), sj.jpowsppfya.iobyxmoadg.zoijcleaow(sj.jpowsppfya.f106926iobyxmoadg, 0L, 0L, 3, null), null);
        ij ijVar = (ij) sPayStorage;
        if (!(ijVar.iobyxmoadg().f57485iobyxmoadg instanceof le0)) {
            throw new Mn(ijVar.iobyxmoadg().toString());
        }
        hl hlVar = ijVar.iobyxmoadg().f57485iobyxmoadg;
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(hlVar, "null cannot be cast to non-null type spay.sdk.domain.OutcomeState.OrderScreenData");
        zynmafqrjbVarIobyxmoadg.setValue(((le0) hlVar).f57465zoijcleaow);
    }

    public final void draadjrbmk(ud0 event) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(event, y80.f59395iobyxmoadg)) {
            ow event2 = new ow(cg0.TOUCH_BACK, we0.WEB_VIEW, mp.TOUCH, null, null, null, null, 120);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event2, "event");
            this.f56062iobyxmoadg.iobyxmoadg(event2);
            ((ve) this.f59479wkgbmnqykc).zoijcleaow(((auzgnhcxok) this.f56063zoijcleaow).btonecajqb() instanceof PayStrategy.PayWithPartsOnly ? jk.f57203iobyxmoadg : new pm(bj.f56020iobyxmoadg, false));
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(event, ca0.f56117iobyxmoadg)) {
            ow event3 = new ow(cg0.TOUCH_SHARE, we0.WEB_VIEW, mp.TOUCH, null, null, null, null, 120);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event3, "event");
            this.f56062iobyxmoadg.iobyxmoadg(event3);
            String str = (String) this.f59475eablkybsjg.getValue();
            if (str != null) {
                int i13 = R.string.spay_bnpl_share_link_message;
                Object[] args = {str};
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
                this.f59476gxszxtbevo.setValue(new hg(new ms(i13, hg.agtfadlqog.i(args))));
                return;
            }
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(event, hb0.f56891iobyxmoadg)) {
            ow event4 = new ow(cg0.LC_WEB_VIEW_APPEARED, we0.WEB_VIEW, mp.LC, null, null, null, null, 120);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event4, "event");
            this.f56062iobyxmoadg.iobyxmoadg(event4);
        } else {
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(event, qc0.f58174iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            ow event5 = new ow(cg0.LC_WEB_VIEW_DISAPPEARED, we0.WEB_VIEW, mp.LC, null, null, null, null, 120);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event5, "event");
            this.f56062iobyxmoadg.iobyxmoadg(event5);
        }
    }
}
