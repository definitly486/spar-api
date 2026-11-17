package zi;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zynmafqrjb extends pmvmpeiblj {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final ikoacuggdj f130170yggfygwlhe;

    public zynmafqrjb(ikoacuggdj delegate) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(delegate, "delegate");
        this.f130170yggfygwlhe = delegate;
    }

    @Override // zi.grlcpdaxtj
    /* JADX INFO: renamed from: eslsurpljm */
    public ikoacuggdj rhgxfdycjh(opjhrmiecq newAttributes) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(newAttributes, "newAttributes");
        return newAttributes != ipoelvxyzq() ? new jztzpxfvev(this, newAttributes) : this;
    }

    @Override // zi.pmvmpeiblj
    protected ikoacuggdj krqnebusok() {
        return this.f130170yggfygwlhe;
    }

    @Override // zi.grlcpdaxtj
    /* JADX INFO: renamed from: yzdjzghtvl */
    public ikoacuggdj fmlbqenlif(boolean z13) {
        return z13 == mhtqkkgtqm() ? this : krqnebusok().fmlbqenlif(z13).rhgxfdycjh(ipoelvxyzq());
    }
}
