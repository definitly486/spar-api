package sflfametgt;

/* JADX INFO: loaded from: classes.dex */
public final class vdvldrhtss implements androidx.compose.foundation.lazy.layout.agtfadlqog {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ikoacuggdj f106341iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f106342zoijcleaow;

    public vdvldrhtss(ikoacuggdj ikoacuggdjVar, int i13) {
        this.f106341iobyxmoadg = ikoacuggdjVar;
        this.f106342zoijcleaow = i13;
    }

    @Override // androidx.compose.foundation.lazy.layout.agtfadlqog
    public int eablkybsjg() {
        return Math.min(iobyxmoadg() - 1, ((agtfadlqog) hg.jyumaefscl.skhdrjzrfn(this.f106341iobyxmoadg.yadqdtsiqt().nufgyqmvbu())).getIndex() + this.f106342zoijcleaow);
    }

    @Override // androidx.compose.foundation.lazy.layout.agtfadlqog
    public int iobyxmoadg() {
        return this.f106341iobyxmoadg.pkzmftpjix();
    }

    @Override // androidx.compose.foundation.lazy.layout.agtfadlqog
    public boolean ppxfxbqfkf() {
        return !this.f106341iobyxmoadg.yadqdtsiqt().nufgyqmvbu().isEmpty();
    }

    @Override // androidx.compose.foundation.lazy.layout.agtfadlqog
    public int wkgbmnqykc() {
        return Math.max(0, this.f106341iobyxmoadg.pmvmpeiblj() - this.f106342zoijcleaow);
    }

    @Override // androidx.compose.foundation.lazy.layout.agtfadlqog
    public int zoijcleaow() {
        if (this.f106341iobyxmoadg.yadqdtsiqt().nufgyqmvbu().size() == 0) {
            return 0;
        }
        int iIobyxmoadg = cdpycssgdh.iobyxmoadg(this.f106341iobyxmoadg.yadqdtsiqt());
        int iLqeggnwhkg = this.f106341iobyxmoadg.yadqdtsiqt().lqeggnwhkg() + this.f106341iobyxmoadg.yadqdtsiqt().dxjokdxxww();
        if (iLqeggnwhkg == 0) {
            return 1;
        }
        return zg.gtknphoqwx.gxszxtbevo(iIobyxmoadg / iLqeggnwhkg, 1);
    }
}
