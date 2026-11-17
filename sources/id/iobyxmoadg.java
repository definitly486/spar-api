package id;

/* JADX INFO: loaded from: classes2.dex */
public class iobyxmoadg extends eablkybsjg {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final gd.iobyxmoadg f42406zoijcleaow = gd.iobyxmoadg.eablkybsjg();

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final nd.ppxfxbqfkf f42407iobyxmoadg;

    iobyxmoadg(nd.ppxfxbqfkf ppxfxbqfkfVar) {
        this.f42407iobyxmoadg = ppxfxbqfkfVar;
    }

    private boolean lqeggnwhkg() {
        nd.ppxfxbqfkf ppxfxbqfkfVar = this.f42407iobyxmoadg;
        if (ppxfxbqfkfVar == null) {
            f42406zoijcleaow.btonecajqb("ApplicationInfo is null");
            return false;
        }
        if (!ppxfxbqfkfVar.kcexrzcfyt()) {
            f42406zoijcleaow.btonecajqb("GoogleAppId is null");
            return false;
        }
        if (!this.f42407iobyxmoadg.vdvldrhtss()) {
            f42406zoijcleaow.btonecajqb("AppInstanceId is null");
            return false;
        }
        if (!this.f42407iobyxmoadg.oxmwwwfdhm()) {
            f42406zoijcleaow.btonecajqb("ApplicationProcessState is null");
            return false;
        }
        if (!this.f42407iobyxmoadg.rgvfuqvkyq()) {
            return true;
        }
        if (!this.f42407iobyxmoadg.wflxmlrfwp().draadjrbmk()) {
            f42406zoijcleaow.btonecajqb("AndroidAppInfo.packageName is null");
            return false;
        }
        if (this.f42407iobyxmoadg.wflxmlrfwp().wflxmlrfwp()) {
            return true;
        }
        f42406zoijcleaow.btonecajqb("AndroidAppInfo.sdkVersion is null");
        return false;
    }

    @Override // id.eablkybsjg
    public boolean ppxfxbqfkf() {
        if (lqeggnwhkg()) {
            return true;
        }
        f42406zoijcleaow.btonecajqb("ApplicationInfo is invalid");
        return false;
    }
}
