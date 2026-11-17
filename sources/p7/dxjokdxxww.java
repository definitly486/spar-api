package p7;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class dxjokdxxww implements wflxmlrfwp {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final zoijcleaow f75866iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final zoijcleaow f75867zoijcleaow;

    public dxjokdxxww(zoijcleaow zoijcleaowVar, zoijcleaow zoijcleaowVar2) {
        this.f75866iobyxmoadg = zoijcleaowVar;
        this.f75867zoijcleaow = zoijcleaowVar2;
    }

    @Override // p7.wflxmlrfwp
    public l7.iobyxmoadg eablkybsjg() {
        return new l7.agtfadlqog(this.f75866iobyxmoadg.eablkybsjg(), this.f75867zoijcleaow.eablkybsjg());
    }

    @Override // p7.wflxmlrfwp
    public List gxszxtbevo() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // p7.wflxmlrfwp
    public boolean wkgbmnqykc() {
        return this.f75866iobyxmoadg.wkgbmnqykc() && this.f75867zoijcleaow.wkgbmnqykc();
    }
}
