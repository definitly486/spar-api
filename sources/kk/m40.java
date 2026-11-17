package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class m40 implements ag.wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final i30 f57587iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final q50 f57588zoijcleaow;

    public m40(c20 c20Var, i30 i30Var, q50 q50Var) {
        this.f57587iobyxmoadg = i30Var;
        this.f57588zoijcleaow = q50Var;
    }

    @Override // fg.iobyxmoadg
    public final Object get() {
        kc2.ppxfxbqfkf fingerprintSdkFactory = (kc2.ppxfxbqfkf) this.f57587iobyxmoadg.get();
        okpsazkaxt systemProperties = (okpsazkaxt) this.f57588zoijcleaow.get();
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fingerprintSdkFactory, "fingerprintSdkFactory");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(systemProperties, "systemProperties");
        return (gr) ag.dxjokdxxww.eablkybsjg(new ks(fingerprintSdkFactory, systemProperties));
    }
}
