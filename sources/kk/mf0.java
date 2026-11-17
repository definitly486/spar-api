package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class mf0 implements ag.wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ym f57640iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final co f57641zoijcleaow;

    public mf0(k10 k10Var, ym ymVar, co coVar) {
        this.f57640iobyxmoadg = ymVar;
        this.f57641zoijcleaow = coVar;
    }

    @Override // fg.iobyxmoadg
    public final Object get() {
        zk.iobyxmoadg loggingInterceptor = (zk.iobyxmoadg) this.f57640iobyxmoadg.get();
        m60 sPaySdkConfigRepository = (m60) this.f57641zoijcleaow.get();
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(loggingInterceptor, "loggingInterceptor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPaySdkConfigRepository, "sPaySdkConfigRepository");
        return (rg0) ag.dxjokdxxww.eablkybsjg(new rg0(loggingInterceptor, sPaySdkConfigRepository));
    }
}
