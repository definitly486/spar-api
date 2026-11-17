package kk;

/* JADX INFO: loaded from: classes3.dex */
public abstract class grlcpdaxtj extends u0 {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final sj.wypolnanlu f56731eablkybsjg;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final sj.zynmafqrjb f56732wkgbmnqykc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public grlcpdaxtj(bt metricFacade, jlmebxxoox sPayDataContract, pc sPaySdkReducer) {
        super(metricFacade, sPayDataContract, sPaySdkReducer);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(metricFacade, "metricFacade");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayDataContract, "sPayDataContract");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPaySdkReducer, "sPaySdkReducer");
        this.f56732wkgbmnqykc = sj.kegysxyocb.iobyxmoadg(new hg(null));
        this.f56731eablkybsjg = sj.dxjokdxxww.zoijcleaow(((auzgnhcxok) sPayDataContract).f55858lereixgezr);
    }

    public static void agtfadlqog(grlcpdaxtj grlcpdaxtjVar, hi action) {
        grlcpdaxtjVar.getClass();
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        ow event = new ow(action, we0.STATUS_VIEW, mp.LC, null, null, null, null, 112);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
        grlcpdaxtjVar.f56062iobyxmoadg.iobyxmoadg(event);
    }

    public gg.wwaezpbzkn draadjrbmk(lqeggnwhkg event) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(event, oh0.f57950iobyxmoadg)) {
            agtfadlqog(this, hi.LC_STATUS_VIEW_DISAPPEARED);
        } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(event, ff0.f56548iobyxmoadg)) {
            ((ve) this.f58736ppxfxbqfkf).zoijcleaow(ec0.f56401iobyxmoadg);
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
