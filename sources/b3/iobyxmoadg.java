package b3;

import java.util.ArrayList;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public abstract class iobyxmoadg implements androidx.media3.datasource.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f15048iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private int f15049ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private lqeggnwhkg f15050wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ArrayList f15051zoijcleaow = new ArrayList(1);

    protected iobyxmoadg(boolean z13) {
        this.f15048iobyxmoadg = z13;
    }

    @Override // androidx.media3.datasource.iobyxmoadg
    public final void eablkybsjg(wflxmlrfwp wflxmlrfwpVar) {
        y2.iobyxmoadg.eablkybsjg(wflxmlrfwpVar);
        if (this.f15051zoijcleaow.contains(wflxmlrfwpVar)) {
            return;
        }
        this.f15051zoijcleaow.add(wflxmlrfwpVar);
        this.f15049ppxfxbqfkf++;
    }

    protected final void kcexrzcfyt(lqeggnwhkg lqeggnwhkgVar) {
        this.f15050wkgbmnqykc = lqeggnwhkgVar;
        for (int i13 = 0; i13 < this.f15049ppxfxbqfkf; i13++) {
            ((wflxmlrfwp) this.f15051zoijcleaow.get(i13)).wkgbmnqykc(this, lqeggnwhkgVar, this.f15048iobyxmoadg);
        }
    }

    protected final void oxmwwwfdhm(lqeggnwhkg lqeggnwhkgVar) {
        for (int i13 = 0; i13 < this.f15049ppxfxbqfkf; i13++) {
            ((wflxmlrfwp) this.f15051zoijcleaow.get(i13)).ppxfxbqfkf(this, lqeggnwhkgVar, this.f15048iobyxmoadg);
        }
    }

    protected final void rgvfuqvkyq(int i13) {
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) stevsuqkhv.nufgyqmvbu(this.f15050wkgbmnqykc);
        for (int i14 = 0; i14 < this.f15049ppxfxbqfkf; i14++) {
            ((wflxmlrfwp) this.f15051zoijcleaow.get(i14)).lqeggnwhkg(this, lqeggnwhkgVar, this.f15048iobyxmoadg, i13);
        }
    }

    protected final void vdvldrhtss() {
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) stevsuqkhv.nufgyqmvbu(this.f15050wkgbmnqykc);
        for (int i13 = 0; i13 < this.f15049ppxfxbqfkf; i13++) {
            ((wflxmlrfwp) this.f15051zoijcleaow.get(i13)).iobyxmoadg(this, lqeggnwhkgVar, this.f15048iobyxmoadg);
        }
        this.f15050wkgbmnqykc = null;
    }
}
