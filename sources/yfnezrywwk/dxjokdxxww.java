package yfnezrywwk;

/* JADX INFO: loaded from: classes.dex */
public final class dxjokdxxww implements androidx.compose.foundation.lazy.layout.agtfadlqog {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final mbcevpiqjq f124748iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f124749zoijcleaow;

    public dxjokdxxww(mbcevpiqjq mbcevpiqjqVar, int i13) {
        this.f124748iobyxmoadg = mbcevpiqjqVar;
        this.f124749zoijcleaow = i13;
    }

    @Override // androidx.compose.foundation.lazy.layout.agtfadlqog
    public int eablkybsjg() {
        return Math.min(iobyxmoadg() - 1, ((agtfadlqog) hg.jyumaefscl.skhdrjzrfn(this.f124748iobyxmoadg.cdpycssgdh().nufgyqmvbu())).getIndex() + this.f124749zoijcleaow);
    }

    @Override // androidx.compose.foundation.lazy.layout.agtfadlqog
    public int iobyxmoadg() {
        return this.f124748iobyxmoadg.cdpycssgdh().gxszxtbevo();
    }

    @Override // androidx.compose.foundation.lazy.layout.agtfadlqog
    public boolean ppxfxbqfkf() {
        return !this.f124748iobyxmoadg.cdpycssgdh().nufgyqmvbu().isEmpty();
    }

    @Override // androidx.compose.foundation.lazy.layout.agtfadlqog
    public int wkgbmnqykc() {
        return Math.max(0, this.f124748iobyxmoadg.esjtqupxsv() - this.f124749zoijcleaow);
    }

    @Override // androidx.compose.foundation.lazy.layout.agtfadlqog
    public int zoijcleaow() {
        if (this.f124748iobyxmoadg.cdpycssgdh().nufgyqmvbu().isEmpty()) {
            return 0;
        }
        int iPpxfxbqfkf = xrmfcynszj.gxszxtbevo.ppxfxbqfkf(this.f124748iobyxmoadg.cdpycssgdh());
        int iIobyxmoadg = esjtqupxsv.iobyxmoadg(this.f124748iobyxmoadg.cdpycssgdh());
        if (iIobyxmoadg == 0) {
            return 1;
        }
        return zg.gtknphoqwx.gxszxtbevo(iPpxfxbqfkf / iIobyxmoadg, 1);
    }
}
